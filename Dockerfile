FROM openjdk:19-jdk-alpine
EXPOSE 9090
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]