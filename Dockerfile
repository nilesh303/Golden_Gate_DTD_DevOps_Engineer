FROM openjdk:8-jdk-alpine

EXPOSE 8181

ARG JAR_FILE=/target/cicd-pipeline-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} cicd-pipeline-0.0.1-SNAPSHOT.jar

RUN echo "Creation of your docker image is in progress, please hold on for a moment"

ENTRYPOINT ["java", "-jar", "cicd-pipeline-0.0.1-SNAPSHOT.jar"]

MAINTAINER "chhallaninilesh@gmail.com"
