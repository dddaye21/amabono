FROM openjdk:8-jdk-alpine
ADD target/amabono-activity-management-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["java","-jar","/app.jar"]