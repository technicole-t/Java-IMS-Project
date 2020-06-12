# inventory-ms

### Inventory Management System

This repository was created to form part of an assessment.

A java application to create, read, update and delete records within an inventory management system (IMS).
The application uses JDBC to link to a MySQL Database hosted on Google Cloud Platform (GCP).

The project specification is to create a Java application that is able to do the following whilst using a host of supporting technologies.

- Add a customer 
- View all customers 
- Update a customer
- Delete a customer 
- Add an item 
- Update an item 
- View all items 
- Delete an item
- Create an order 
- View all orders
- Delete an order 
- Delete an item in an order
- Add an item to an order
- Calulate the cost of an order 


## Getting Started
These instructions will allow you to get the application up and running on your local machine for development. 

### Prerequisites
A java runtime environment is required on your PC to run this along with a version of Maven to build the project. Having Eclipse would also be useful if you wish to edit or test the code, though other Java IDE's will work fine.

### Installing
Fork this repository to your own GitHub and then clone it to your PC. From there, the .jar file can be created thorough the command time. Run 'mvn clean', 'mvn package' then find the jar with dependancies within the target folder and run java -jar with the name of the file.  

### Coding style tests
Building this application and pushing it forward to a computer or virtual machine hosting Sonarqube will allow the user to anylise the code for coding style issues, bugs and security issues.

### Deployment
The project has been deployed via multiple stages of a CI pipeline. It is first pushed to GitHub, before being retrieved by Jenkins. Jenkins utilises maven to run the unit tests and build the project before pushing it further ahead to both Sonarqube (for more testing) and Nexus, for artifact repositing and hosting the fully built application.

## Built With
- Trello - Kan-ban
- MySQL - database language
- Eclipse - IDE
- GCP - Database Host
- Maven - Dependency Management
- Jenkins - CI Pipeline 
- SonarQube - Static Analysis Tool 
- Nexus - Artifact Repository

