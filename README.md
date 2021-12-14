# plumbit
A time and material management project.

### 1. Run with docker

#### 1.1 Build the docker image
Run the follwoing command in the project directory.
> docker build -t plumbit-1.0  -f Dockerfile .

#### 1.2 Run the image from 1.1 as container
> docker run -p 8080:8080 plumbit-1.0


### 2. Run as container composition

#### 2. Run docker comopse
> docker-compose up


### 3. Test with swagger in the browser
Open: "http://localhost:8080/swagger-ui/#/"