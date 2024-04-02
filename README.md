# Spring Boot Application Docker Demo
Welcome to the Spring Boot Application Docker Demo! This repository contains a simple Spring Boot application that demonstrates how to dockerize and deploy a Spring Boot application in a Docker container.
## Overview
This demo showcases the process of containerizing a Spring Boot application using Docker, allowing for easy deployment and scaling in various environments. By following the steps outlined in this README,
you'll learn how to package your Spring Boot application into a Docker image and run it as a container.

## Prerequisites
Before you begin, ensure you have met the following requirements:
- Java Development Kit (JDK) installed on your local machine
- Docker installed on your local machine
### Getting Started
To get started, follow these steps:

1. __Clone the Repository__: Clone this repository to your local machine using the following command:
```bash
git clone https://github.com/iammahesh123/spring-dockerization-demo.git
```
2. __Navigate to the Project Directory__: Move into the cloned repository directory:
```bash
cd spring-dockerization-demo
```
3. __Build the Spring Boot Application__: Use Maven to build the Spring Boot application by running the following command:

``` bash
./mvnw clean package
```
4. __Build the Docker Image__: Build a Docker image for the Spring Boot application using the provided Dockerfile:
``` bash
docker build -t my-spring-app .
```
5. __Run the Docker Container__: Launch a Docker container from the built Docker image:

``` bash
docker run -p 9090:8080 my-spring-app
```
6.__Access the Application__: Open a web browser and navigate to `http://localhost:8081` to access the running Spring Boot application.

```bash
http://localhost:9090
```

## Dockerfile Explanation
Here's the Dockerfile used to build the Docker image:
``` bash
# Use a base image with Java installed
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the compiled Spring application JAR file into the container
COPY target/spring-demo.jar /app/spring-demo.jar

# Expose the port your application runs on
EXPOSE 8081

# Command to run your application
ENTRYPOINT ["java", "-jar", "spring-demo.jar"]
```
- __FROM openjdk:11-jre-slim__: Specifies the base Docker image containing OpenJDK 11.
- __WORKDIR /app__: Sets the working directory within the Docker container to /app.
- __COPY target/spring-demo.jar /app/spring-demo.jar__: Copies the compiled Spring Boot application JAR file into the Docker container.
- __EXPOSE 8081__: Exposes port 8081 within the Docker container.
- __ENTRYPOINT ["java", "-jar", "spring-demo.jar"]__: Defines the command to run when the Docker container starts, which executes the Spring Boot application JAR file.
## Contributing
Contributions are welcome! Please feel free to fork the repository and submit pull requests.

## License
This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgments
Inspired by __Spring Boot__
