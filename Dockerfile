FROM openjdk:8-jdk-alpine

VOLUME /tmp

EXPOSE 8888

ARG JAR_FILE=/golden_gate_bootcamp/Golden_Gate_DTD_DevOps_Engineer/target/cicd-pipeline-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} cicd-pipeline-0.0.1-SNAPSHOT.jar

RUN echo "Creation of your docker image is in progress, please hold on for a moment"

ENTRYPOINT ["java", "-jar", "cicd-pipeline-0.0.1-SNAPSHOT.jar"]

MAINTAINER "chhallaninilesh@gmail.com"
