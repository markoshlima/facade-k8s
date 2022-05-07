FROM openjdk:8-jdk-alpine

RUN apk --no-cache add curl

COPY . .

EXPOSE 8080

ENTRYPOINT java -jar /target/facade-0.0.1-SNAPSHOT.jar