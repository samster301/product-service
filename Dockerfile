FROM openjdk:8
RUN mkdir app
ADD target/product-service-0.0.1-SNAPSHOT.jar app/docker-product-service.jar
WORKDIR app
RUN "pwd"
RUN "ls"
EXPOSE 8018
ENTRYPOINT ["java", "-jar", "docker-product-service.jar"]
