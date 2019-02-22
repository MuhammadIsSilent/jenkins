FROM openjdk:8
EXPOSE 8848
ADD target/app.jar /usr/share/app.jar
RUN chmod +x "/usr/share/app.jar"






