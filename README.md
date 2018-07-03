# api-data
## Synopsis

Service that manages API calls to third-party

## How to Run

* Make sure you are using JDK 1.8 and Maven 3.x
* Clone this repository

````bash
$ git clone git@github.com:jrh9/api-data
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
