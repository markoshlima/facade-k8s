FROM openjdk:8-jdk-alpine

COPY . .

ENTRYPOINT java -jar /target/facade-0.0.1-SNAPSHOT.jar