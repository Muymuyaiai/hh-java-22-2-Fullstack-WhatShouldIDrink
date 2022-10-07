FROM openjdk:17

LABEL maintainer="test@neuefische.de"

ADD backend/target/wsiddb.jar wsiddb.jar

CMD [ "sh", "-c", "java -DServer.port=$PORT -jar /wsiddb.jar"]