FROM openjdk:8-jdk-alpine
RUN apk --no-cache add netcat-openbsd

VOLUME /tmp

COPY target/counterservice-0.0.1-SNAPSHOT.jar /opt/spring-cloud/lib/
COPY config-client-entrypoint.sh /opt/spring-cloud/bin/
RUN chmod 755 /opt/spring-cloud/bin/config-client-entrypoint.sh