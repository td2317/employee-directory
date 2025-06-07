# Employee Directory – Spring Boot CRUD App

A simple Spring Boot backend project that provides REST APIs for managing employee records with features like validation, pagination, filtering, and global exception handling.

## 🔧 Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Jakarta Validation
- Postman
- GitHub

## 📁 Features
- Create, Read, Update, and Delete (CRUD) employees
- Validation using `@NotBlank`, `@Email`, `@Min`, `@Max`
- Global Exception Handling with `@ControllerAdvice`
- Pagination and sorting
- Search employees by name (case-insensitive)

## 📦 Endpoints

| Method | Endpoint               | Description                     |
|--------|------------------------|---------------------------------|
| POST   | `/employees`           | Create a new employee           |
| GET    | `/employees`           | Get all employees (paginated)   |
| GET    | `/employees/search`    | Search employees by name        |
| PUT    | `/employees/{id}`      | Update employee by ID           |
| DELETE | `/employees/{id}`      | Delete employee by ID           |

## 🔍 Sample JSON
```json
{
  "name": "John Doe",
  "email": "john@example.com",
  "age": 30,
  "department": "HR"
}

## Running the App
	1.	Open in IntelliJ
	2.	Run EmployeeDirectoryApplication.java
	3.	Test endpoints using Postman at http://localhost:8080
