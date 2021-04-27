FROM adoptopenjdk/openjdk11:alpine-jre
ADD target/spring-docker-demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]