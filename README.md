## Contact-Management-System
Developed REST API services for contact management system by which a user can create contact, view all contacts & delete a specific contact.

## Features
- Allows user to create contacts.
- Allows user to view all contacts
- Allows user to delete a specific contact.

## Technologies and Dependencies Used

- [Maven] used as a dependency management tool
- [Spring Boot] used to build REST APIs.
- [Spring data JPA(Hibernate)] to simplify Data Access logic and allows to write complex queries.
- [MySQL] used to handle data storage, retrieval & deleteing data.
- [Lombok] Reduces the time of Writing boiler plate code.

## Installation & Run

Before running the API server, you should update the database config inside the application.properties file.
Update the port number, username and password as per your local database config.

server.port=8038

#db specific properties
spring.datasource.url=jdbc:mysql://localhost:3306/contactmsdb
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=root

#ORM s/w specific properties
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

spring.mvc.pathmatch.matching-strategy = ANT_PATH_MATCHER

## API Root Endpoint

https://localhost:8038/
