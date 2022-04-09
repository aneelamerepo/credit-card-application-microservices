# credit-card-microservices-application
This is a full stack web application to create a new credit card for a given name, card number, and limit.

Technical Overview:
Spring MVC has ben used to expose Rest Web Services (POST and GET in these case).  All the data are stored into H2, which is an in-memory Database. 
React was used to create a single-page dynamic UI.  Ajax JQuery to handle the REST requests from front-end to back-end.

Back-end Technologies:
Java 8, Spring Boot (DI, MVC, JPA), H2 in-memory Database, Junit, Maven

To get the Back-end App running locally:
1. Clone this repo
2. You can import the project on Intellij IDE/Eclipse
3. Right Click on the directory and Run as Maven install
4. Run as Java Application

Another option is to create an executable jar:
mvn install on pom.xml directory
On CommandWindow: java -jar path/credit-card-microservices-application/target/credit-card-microservices-application-0.0.1-SNAPSHOT.jar
Java Application will run on http://localhost:8080/
