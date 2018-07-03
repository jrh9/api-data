# spring-boot-starter-app
## Synopsis

Simple starter kit for Spring Boot application

## How to Run

* Make sure you are using JDK 1.8 and Maven 3.x
* Clone this repository

````bash
$ git clone git@github.com:jrh9/spring-boot-starter-app.git
````

Ensure system setup is correct
````bash
$ mvn clean package
````

Compile the program
````bash
$ mvn clean install
````

On successful build, run the service locally
````bash
$ java -jar ./target/<compiled_project_name>.jar
````
