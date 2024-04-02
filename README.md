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

1. Clone the Repository: Clone this repository to your local machine using the following command:
```bash
git clone https://github.com/yourusername/your-repo.git
```
2. Navigate to the Project Directory: Move into the cloned repository directory:
```bash
cd your-repo
```
3. Build the Spring Boot Application: Use Maven to build the Spring Boot application by running the following command:

``` bash
./mvnw clean package
```
4. Build the Docker Image: Build a Docker image for the Spring Boot application using the provided Dockerfile:
``` bash
docker build -t my-spring-app .
```
5. Run the Docker Container: Launch a Docker container from the built Docker image:

``` bash
docker run -p 9090:8080 my-spring-app
```
6.Access the Application: Open a web browser and navigate to http://localhost:8080 to access the running Spring Boot application.

```bash
http://localhost:9090
```
Dockerfile
Here's the Dockerfile used to build the Docker image:

## Dockerfile Explanation
``` bash
# Use a base image with Java installed
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the compiled Spring application JAR file into the container
COPY target/demo-0.0.1-SNAPSHOT.jar /app/demo.jar

# Expose the port your application runs on
EXPOSE 8080

# Command to run your application
CMD ["java", "-jar", "demo.jar"]
```
- FROM openjdk:11-jre-slim: Specifies the base Docker image containing OpenJDK 11.
- WORKDIR /app: Sets the working directory within the Docker container to /app.
- COPY target/demo-0.0.1-SNAPSHOT.jar /app/demo.jar: Copies the compiled Spring Boot application JAR file into the Docker container.
- EXPOSE 8080: Exposes port 8080 within the Docker container.
- CMD ["java", "-jar", "demo.jar"]: Defines the command to run when the Docker container starts, which executes the Spring Boot application JAR file.
## Contributing
Contributions are welcome! Please feel free to fork the repository and submit pull requests.

## License
This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgments
Inspired by Spring Boot
