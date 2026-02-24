☕ Java Full Stack Internship – Task 2
Contact Form with Spring Boot + MySQL
📌 Project Overview

Is project mein ek Contact Form (Name, Email, Message) ko backend ke through MySQL database mein store kiya gaya hai using Spring Boot and Spring Data JPA.

Yeh task demonstrate karta hai kaise data flow hota hai:

Frontend → Backend → Database

🚀 Features

Contact form (Name, Email, Message)

Spring Boot REST API

MySQL database integration

Data stored in contacts table

/contacts endpoint to fetch all saved contacts (JSON format)

🛠 Technologies Used

☕ Java

🌱 Spring Boot

🗄 Spring Data JPA

🐬 MySQL

🎨 HTML, CSS

🧪 Postman (API Testing)

📂 Project Structure
src
 └── main
     ├── java
     │    └── com.example.contact
     │          ├── controller
     │          ├── service
     │          ├── repository
     │          └── model
     └── resources
          └── application.properties
          ⚙️ Setup Instructions
1️⃣ Clone the Repository
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name
2️⃣ Configure MySQL Database

Create a database in MySQL:

CREATE DATABASE contactdb;

Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/contactdb
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
3️⃣ Run the Application

Run using:

IntelliJ IDEA / VS Code
or

mvn spring-boot:run

Application will start at:

http://localhost:8080
📡 API Endpoints
➤ Save Contact

POST /saveContact

Request Body (JSON):

{
  "name": "John Doe",
  "email": "john@example.com",
  "message": "Hello!"
}
➤ Get All Contacts

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
🗄 Database Table

Table Name: contacts

Column	Type
id	Long (PK)
name	String
email	String
message	String
🎯 Learning Outcomes

Frontend to Backend data flow

Spring Boot REST APIs

Database connectivity with MySQL

Using Spring Data JPA for CRUD operations

📚 Helpful Resources

Spring Documentation

Baeldung JPA Guide

Spring Boot + MySQL Tutorials

👨‍💻 Author
Vishal Vishwakarma
Java Full Stack Internship – Task 2
🌐 www.maincrafts.com
