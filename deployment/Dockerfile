FROM openjdk:12-jre

RUN useradd -m appuser
USER appuser

WORKDIR /home/appuser

ENV JAR_NAME app-1.0.0.jar
ENV JAVA_OPTS -Xms128m -Xmx300m -Xss512k -XX:CICompilerCount=2 -XX:+PrintGCDetails -XX:+UseContainerSupport

COPY build/libs/${JAR_NAME} ${JAR_NAME}

# Run the app.  CMD is required to run on Heroku
# $PORT is set by Heroku
CMD [ "sh", "-c", "java $JAVA_OPTS -jar ${JAR_NAME} --bind 0.0.0.0:$PORT" ]