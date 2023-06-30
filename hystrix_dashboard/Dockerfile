FROM openjdk:11
EXPOSE 9555
ADD target/hystrix-dashboard.jar hystrix-dashboard.jar
ENTRYPOINT ["java","-jar","/hystrix-dashboard.jar"]

#docker build -t hystrix-dashboard .