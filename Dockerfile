FROM java:8
MAINTAINER by chai(lichai_6321@163.com)
VLOUME /tmp
ADD springboot-mybatis-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar","/app.jar"]