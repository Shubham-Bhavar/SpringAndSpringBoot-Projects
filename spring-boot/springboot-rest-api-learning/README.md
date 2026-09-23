# Spring Boot REST API - Learning Project

A simple CRUD REST API using:

- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Java 21
- Maven

## Project Structure

```text
rest-api-learning
 ├── pom.xml
 └── src
     └── main
         ├── java/in/shubham/restapi
         │   ├── RestApiLearningApplication.java
         │   ├── controller/UserController.java
         │   ├── entity/User.java
         │   ├── repository/UserRepository.java
         │   └── service/UserService.java
         └── resources/application.properties
```

## How the REST API works

```text
Client
  ↓
Controller
  ↓
Service
  ↓
Repository
  ↓
H2 Database
```

## Run

Open the project in Eclipse/STS/IntelliJ and run:

`RestApiLearningApplication.java`

Or from the project folder:

```bash
mvn spring-boot:run
```

## API Endpoints

### 1. Get all users

GET

```text
http://localhost:8080/api/users
```

### 2. Get one user

GET

```text
http://localhost:8080/api/users/1
```

### 3. Create user

POST

```text
http://localhost:8080/api/users
```

JSON body:

```json
{
  "name": "Shubham",
  "city": "Sangamner"
}
```

Example response:

```json
{
  "id": 1,
  "name": "Shubham",
  "city": "Sangamner"
}
```

### 4. Update user

PUT

```text
http://localhost:8080/api/users/1
```

JSON body:

```json
{
  "name": "Shubham Bhavar",
  "city": "Ahmednagar"
}
```

### 5. Delete user

DELETE

```text
http://localhost:8080/api/users/1
```

## H2 Console

Open:

```text
http://localhost:8080/h2-console
```

Use:

```text
JDBC URL: jdbc:h2:mem:restdb
User Name: sa
Password:
```

## What to learn from this project

1. `@RestController` creates REST endpoints.
2. `@RequestMapping` defines the common URL.
3. `@GetMapping` handles GET requests.
4. `@PostMapping` handles POST requests.
5. `@PutMapping` handles PUT requests.
6. `@DeleteMapping` handles DELETE requests.
7. `@PathVariable` reads values from the URL.
8. `@RequestBody` converts JSON into a Java object.
9. `JpaRepository` gives database CRUD methods.
10. The Service layer keeps business logic separate from the Controller.
