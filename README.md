# 19.11.2024_StudentCourseTask

1. What is a REST Service?
2. How to bootstrap a Rest Service application with Spring Initializr?
3. How to create a Get REST Service for retrieving the courses that a student registered for?
4. How to create a Post REST Service for registering a course for student?
5. How to execute Rest Services from Postman?


You will learn

What is a REST Service?
How to bootstrap a Rest Service application with Spring Initializr?
How to create a Get REST Service for retrieving the courses that a student registered for?
How to create a Post REST Service for registering a course for student?
How to execute Rest Services from Postman?

------------------------------------------------------------------------------------

Answers-->>


1. What is a REST Service?

Ans-->>

A REST Service is a simple, efficient way for different systems to communicate and transfer data over the internet. It's widely used in web applications and mobile apps to interact with servers and retrieve or modify information.

***********************************************************************************************

2. What is mean by bootstrap a Rest Service application with Spring Initializr & how to bootstrap a Rest Service application with Spring Initializr?

Ans-->>

Bootstrap a Rest Service application with Spring Initializr , it means starting or creating a new RESTful web service application quickly using Spring Initializr.

Steps used to bootstrap the spring boot app-->>

1. goto https://start.spring.io/

2. Project = Maven
   Language = Java
   Spring Boot Version = 2.7.17 (latest version 3.2.11)
   
3. Project Metadata
   Group = com.clover
   Artifact = TestSpringProj
   Name = TestSpringProj
   Package name = com.clover.
   Packaging = Jar (Jar = java archieve / War = Web archieve)
   Java version: 17 (latest: 23)
   Dependencies: Spring Web, Spring Boot DevTools, Lombok

4. click on generate the project , download in zip file format, extract the zip file and import the file path in eclips / intellije for further coding

5. create model, dao, service, controller packages as per your project requirements.

6. run the application by " Run as spring boot application "

7. to check the output , open the postman api / thunder client / swagger ui and see the output.

***********************************************************************************************

5. How to execute Rest Services from Postman?

Ans-->>

Steps--

A. Install postman in the system.
B. Create a New Request by clicking on " + " icon on top right corner.
C. Choose HTTP Method like GET, POST, PUT, DELETE.
D. Enter the Request URL i.e., type the full URL of the REST API you want to interact with.
E. For HTTP methods like POST / PUT , you have to add request body in JSON format.
F. Once all req. settings are done, then click on SEND button and postman will send the request to the server. 
G. After sending the request, Postman will display the response at the bottom.

***********************************************************************************************