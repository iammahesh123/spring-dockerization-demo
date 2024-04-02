FROM openjdk:17-jdk-alpine
LABEL authors="User"

EXPOSE 8081

WORKDIR /app
COPY target/docker-demo.jar /app/docker-demo.jar

ENTRYPOINT ["java", "-jar","docker-demo.jar"]