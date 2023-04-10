FROM openjdk:11
EXPOSE 8081
ADD target/docker-image.jar docker-image.jar
ENTRYPOINT ["java","jar","docker-image.jar"]
