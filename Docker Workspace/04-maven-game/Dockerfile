FROM maven:3-jdk-8 as builder

WORKDIR /app

COPY . .

RUN ["mvn","package"]

FROM tomcat:latest

COPY --from=builder /app/target/maven-game.war /usr/local/tomcat/webapps/maven-game.war
