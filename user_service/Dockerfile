FROM openjdk:11
EXPOSE 9001
ADD target/user-service.jar user-service.jar
ENTRYPOINT ["java","-jar","/user-service.jar"]

#docker build -t user-service .