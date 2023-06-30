FROM openjdk:11
EXPOSE 9002
ADD target/contact-service.jar contact-service.jar
ENTRYPOINT ["java","-jar","/contact-service.jar"]

#docker build -t contact-service .
#finalname contact-service add in pom.xml