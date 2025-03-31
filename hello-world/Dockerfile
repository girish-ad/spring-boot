FROM ubuntu

RUN apt-get update -y

RUN apt-get install -y openjdk-21-jre-headless

copy hello-world-0.0.1.jar /opt/hello-world-0.0.1.jar

ENTRYPOINT java -jar /opt/hello-world-0.0.1.jar
