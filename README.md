# Employee API

A small Spring Boot REST API supplied as sample application code for DevOps / Jenkins CI/CD practice. You do not need to develop the application; your task is to create the Jenkins pipeline and deployment workflow.

## Technology
- Java 17
- Spring Boot 3.4.5
- Maven
- Spring Web
- Spring Boot Actuator
- JUnit 5 / Spring Boot Test

## Endpoints
- `GET /api/employees` — returns a sample list of employees
- `GET /actuator/health` — application health endpoint

The application listens on port `8081` by default.

## Build locally

```bash
mvn clean verify
```

The executable JAR is created at `target/employee-api.jar`.

## Run

```bash
java -jar target/employee-api.jar
```

Then test:

```bash
curl http://localhost:8081/api/employees
curl http://localhost:8081/actuator/health
```

## DevOps exercise

This repository intentionally does **not** contain a Jenkinsfile. Create it as part of your DevOps practice. The intended CI flow is:

1. Jenkins checks out this Git repository.
2. Maven compiles the source and runs the tests (`mvn clean verify`).
3. Jenkins archives `target/employee-api.jar` as a build artifact.
4. In the CD phase, Jenkins deploys the JAR to the EC2 app directory, restarts a dedicated `systemd` service, and checks `/actuator/health`.

Do not commit passwords, private keys, tokens, or other secrets to GitHub.
