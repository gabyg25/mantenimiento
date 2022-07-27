FROM openjdk:11
ADD target/software.jar software.jar
ENTRYPOINT ["java", "-jar","software.jar"]
