☕ Java Full Stack Internship – Task 2
Contact Form with Spring Boot & MySQL Integration
📌 Project Overview

This project is part of the Java Full Stack Internship – Task 2.

In this task, the existing contact form (from Task 1) has been enhanced by integrating a MySQL database with the Spring Boot backend. The submitted form data is now stored in a relational database using JPA.

This project demonstrates how real-world web applications collect and persist user data securely.

Data Flow:
Frontend → Backend (Spring Boot) → Database (MySQL)

🚀 Features

Contact form with:

Name

Email

Message

REST API built using Spring Boot

MySQL database connectivity

Data stored in contacts table

Endpoint to fetch all stored contacts in JSON format

Automatic table creation using JPA

🛠 Tech Stack

☕ Java

🌱 Spring Boot

🗄 Spring Data JPA

🐬 MySQL
📂 Project Structure
src
 └── main
     ├── java
     │    └── com.example.contact
     │          ├── controller
     │          ├── model
     │          ├── repository
     │          └── service
     └── resources
          └── application.properties
⚙️ Database Configuration
CREATE DATABASE contactdb;

CREATE DATABASE contactdb;
spring.datasource.url=jdbc:mysql://localhost:3306/contactdb
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

📡 API Endpoints
🔹 Save Contact

POST /saveContact
Request Body:
{
  "name": "John Doe",
  "email": "john@example.com",
  "message": "Hello!"
}

🔹 Get All Contacts

GET /contacts

Response:
[
  {
    "id": 1,
    "name": "John Doe",
    "email": "john@example.com",
    "message": "Hello!"
  }
]

🗄 Database Schema

Table Name: contacts

Column	Type
id	Long (Primary Key)
name	String
email	String
message	String
🎯 Learning Outcomes

Understanding full-stack data flow

Connecting Spring Boot with MySQL

Implementing CRUD operations using JPA

Creating REST APIs

Structuring backend applications using layered architecture

🔮 Future Improvements

Add validation (email format, required fields)

Add exception handling

Add update & delete endpoints

Implement pagination for large datasets

Deploy project to cloud platform

👨‍💻 Author

Vishal Vishwakarma
