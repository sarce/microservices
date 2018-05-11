FROM openjdk:8-jdk-alpine
RUN apk --no-cache add netcat-openbsd

VOLUME /tmp

COPY target/configservice-0.0.1-SNAPSHOT.jar /opt/spring-cloud/lib/
COPY config-service-entrypoint.sh /opt/spring-cloud/bin/
RUN chmod 755 /opt/spring-cloud/bin/config-service-entrypoint.sh