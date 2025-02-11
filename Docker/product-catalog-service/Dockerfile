# Start with a base image containing Java runtime
FROM openjdk:24-jdk-oracle

# Add Maintainer Info
LABEL maintainer="momen.samir.eb@gmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

EXPOSE 2025

# The application's jar file
ARG JAR_FILE=product-catalog-service/target/product-catalog-service-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} app.jar

# Run the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]