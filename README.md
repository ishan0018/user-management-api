# User Management API

A RESTful API built with Spring Boot for managing users, featuring full CRUD operations and secure authentication with password hashing.

## Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- Spring Security
- MySQL
- Maven

## Features
- Create, read, update, and delete users (full CRUD)
- Secure password storage using BCrypt hashing
- User signup and login with credential verification

## API Endpoints

| Method | Endpoint         | Description                  |
|--------|------------------|-------------------------------|
| GET    | /users           | Get all users                 |
| GET    | /users/{id}      | Get a user by ID              |
| POST   | /users           | Create a new user              |
| PUT    | /users/{id}      | Update a user by ID            |
| DELETE | /users/{id}      | Delete a user by ID            |
| POST   | /users/login     | Login with email & password    |

## Setup Instructions

1. Clone the repository git clone https://github.com/ishan0018/user-management-api.git
2. Create a MySQL database named `demo_db`
3. Copy `application.properties.example` to `application.properties` inside `src/main/resources/` and fill in your own MySQL username and password
4. Run the application using your IDE or:./mvnw spring-boot:run
5. The API will be available at `http://localhost:8080`

## What I Learned
- Building layered REST APIs (Controller, Service, Repository pattern)
- Dependency injection and Spring's bean lifecycle
- Secure password handling with Spring Security and BCrypt
- Connecting Spring Boot applications to a MySQL database

## Future Improvements
- JWT-based authentication
- Input validation and centralized error handling
- Unit and integration tests
- Deployment to a live server