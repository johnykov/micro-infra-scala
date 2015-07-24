micro-infra-scala
====================
A sample web application using:

*       spring-boot
*       scala
*       micro-infra-spring

Using gradle as the build tool:
-------------------------------

Build using `./gradlew build`

Run using: `java -jar -DAPP_ENV=dev -Dspring.profiles.active=dev -DCONFIG_FOLDER=/Users/.../properties -Dmicroservice.config.file=classpath:microservice.json build/libs/micro-infra-scala-0.1.0.jar`

A url listing the hotels is at [http://localhost:8080/hotels](http://localhost:8080/hotels)

## Fire from Intelij Idea with VM options:

        -DAPP_ENV=dev
        -Dspring.profiles.active=dev
        -DCONFIG_FOLDER=/Users/.../properties
        -Dmicroservice.config.file=classpath:microservice.json