# 1. Enable h2 console for docker compose up
Do in application properties or set a spring profile in the dockerfile java jar 
somethinglike -D.active.profile=dev

# 2. 2 concrurrent db init properties
create-drop and always. Always seems to come first before the creeation of the db.
to init use create first and never. then in a second startup use update and always.
spring:
  jpa:
    hibernate:
      ddl-auto: create
  sql:
    init:
      mode: always

# 3. Turn csrf on back on.
http.csrf().disable() -> remove.

# X. Make use of spring gateway.
https://spring.io/projects/spring-cloud-gateway
https://www.baeldung.com/spring-cloud-gateway