## micro-infra-scala

This project is a simple adaptation of [micro-infra-spring](https://github.com/4finance/micro-infra-spring)  into scala. 
Spring-boot (autowiring) does work nicely with scala. Groovy is not supported here so instead of spock test framework we use scalatest.

This sample web application using:

*       spring-boot
*       scala
*       micro-infra-spring

## Using gradle as the build tool:


Build using `./gradlew build`

Run using: `java -jar -DAPP_ENV=dev -Dspring.profiles.active=dev -DCONFIG_FOLDER=/Users/.../properties -Dmicroservice.config.file=classpath:microservice.json build/libs/micro-infra-scala-0.1.0.jar`

A url listing the hotels is at [http://localhost:8080/hotels](http://localhost:8080/hotels)

---

## Fire from Intelij Idea with VM options:

        -DAPP_ENV=dev
        -Dspring.profiles.active=dev
        -DCONFIG_FOLDER=/Users/.../properties
        -Dmicroservice.config.file=classpath:microservice.json


For `profile=prod` you require standalone zookeeper instance.

---

## Handlers from micro-infra-spring

        /api-docs],methods=[GET]
        /api-docs/{swaggerGroup}/{apiDeclaration}],methods=[GET]
        /error]
        /error],produces=[text/html]
        /ping],methods=[GET || HEAD],produces=[text/plain]
        /collaborators],methods=[GET],produces=[application/json]
        /collaborators/all],methods=[GET],produces=[application/json]
        /microservice.json],methods=[GET],produces=[application/json]
        /mappings],methods=[GET]
        /metrics/{name:.*}],methods=[GET]
        /metrics],methods=[GET]
        /env],methods=[POST]
        /env/reset],methods=[POST]
        /dump],methods=[GET]
        /configprops],methods=[GET]
        /pause],methods=[POST]
        /trace],methods=[GET]}
        /health]
        /restart],methods=[POST]}
        /beans],methods=[GET]}
        /info],methods=[GET]
        /autoconfig],methods=[GET]
        /env/{name:.*}],methods=[GET]
        /env],methods=[GET]
        /resume],methods=[POST]
        /refresh],methods=[POST]

Description of above:  [micro-infra-spring](https://github.com/4finance/micro-infra-spring)