FROM openjdk:10-jdk
VOLUME /tmp

RUN useradd --create-home -s /bin/bash user
WORKDIR /home/user
USER user

ENV JAR_NAME gksbh-template-1.0.0.jar

COPY build/libs/${JAR_NAME} ${JAR_NAME}

# Run the app.  CMD is required to run on Heroku
# $PORT is set by Heroku
CMD [ "sh", "-c", "java $JAVA_OPTS -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=docker -jar ${JAR_NAME} --bind 0.0.0.0:$PORT" ]