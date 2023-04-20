FROM amazoncorretto:17-alpine-jdk

MAINTAINER portfolionataniel

COPY target/nataniel-0.0.1-SNAPSHOT.jar nataniel-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/nataniel-0.0.1-SNAPSHOT.jar"]

