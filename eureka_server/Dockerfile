FROM openjdk:11
EXPOSE 8761
ADD target/eureka-server.jar eureka-server.jar
ENTRYPOINT ["java","-jar","/eureka-server.jar"]

#docker build -t eureka-server .