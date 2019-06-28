FROM openjdk:13-jdk-alpine
VOLUME /tmp
#ARG JAR_FILE=target/healthcheck-0.0.1-SNAPSHOT.jar
#COPY ${JAR_FILE} app.jar
COPY target/healthcheck-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]