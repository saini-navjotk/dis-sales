# Base Alpine Linux based image with OpenJDK JRE only
FROM openjdk:8-jre-alpine
# copy application JAR (with libraries inside)
COPY target/dis-sales-1.0.jar /dis-sales-1.0.jar
# specify default command
CMD ["/usr/bin/java", "-jar",  "/dis-sales-1.0.jar"]