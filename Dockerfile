#
# STAGE 1:
# Maven Build
# Securtiy config (User/Group)
#
FROM maven:3.8.1-jdk-11-slim as MAVEN_BUILD_ENV

COPY core /tmp/core
COPY persistence /tmp/persistence
COPY security /tmp/security
COPY swagger /tmp/swagger
COPY time-manager /tmp/time-manager
COPY pom.xml /tmp/pom.xml

WORKDIR /tmp/

RUN mvn clean package

# add timezone
RUN echo "Europe/Zurich" > /etc/timezone

# add group/user
RUN addgroup --system java \
    && adduser --uid 10001 --shell /sbin/false --system --ingroup java java


#
# STAGE 2:
# actual build
#
FROM gcr.io/distroless/java:11

ARG JAR_FILE=/tmp/time-manager/target/time-manager-2.5.7.jar
ARG PASSWD_FILE=/etc/passwd
ARG GROUP_FILE=/etc/group
ARG TIMEZONE_FILE=/etc/timezone

# Add user/group from build-env
# Add jar from build-env
# Add timezone from build-env
COPY --from=MAVEN_BUILD_ENV ${PASSWD_FILE} /etc/passwd
COPY --from=MAVEN_BUILD_ENV ${GROUP_FILE} /etc/group
COPY --from=MAVEN_BUILD_ENV ${JAR_FILE} time-manager-2.5.7.jar
COPY --from=MAVEN_BUILD_ENV ${TIMEZONE_FILE} ${TIMEZONE_FILE}

#run as user
USER java:java

ENTRYPOINT ["java", "-XX:+UseSerialGC", "-Xss512k", "-Dspring.profile.active=dev", "-jar", "/time-manager-2.5.7.jar"]