FROM viascom/base-java:8
VOLUME /tmp
COPY build/libs/gksbh-template-1.0.0.jar ${INSTALL_DIR}/gksbh-template-1.0.0.jar

# Run the image as a non-root user
RUN adduser -D myuser
USER myuser

# Run the app.  CMD is required to run on Heroku
# $PORT is set by Heroku
CMD [ "sh", "-c", "java $JAVA_OPTS -Xmx512m -Xss512k -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=docker -jar ${INSTALL_DIR}/gksbh-template-1.0.0.jar --bind 0.0.0.0:$PORT" ]