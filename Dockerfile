FROM openjdk:8-jdk-alpine
EXPOSE 8848
VOLUME /tmp
ADD target/app.jar /usr/share/app.jar
RUN chmod +x "/usr/share/app.jar"






