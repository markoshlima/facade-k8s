# facade-k8s

**Pre-Requisites** <br />
Apache Maven 3.8.4 <br />
Java version: 1.8

**Install / Build docker container** <br />
mvn install or docker build . -t markoshlima/facade-k8s<br />
docker build . -t markoshlima/facade-k8s --platform linux/amd64 //EKS

**Run application** <br />
mvn spring-boot:run

**Start docker container** <br />
docker run -it -p 5005:8080 -d markoshlima/facade-k8s

**Logs docker container** <br />
docker logs [img]

**Inspect docker image** <br />
docker inspect [img] <br />
docker exec -it [img] /bin/bash

**Stop docker container** <br />
docker stop [img]