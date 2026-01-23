# 🚚 Fleet Management System

Backend **Fleet Management System** developed with **Java and Spring Boot** for managing trucks, drivers, routes and
trips.  
The project is designed to simulate real-world logistics operations, focusing on clean architecture, scalability and
RESTful APIs.

---

## 📌 Features

- 🚛 Truck management (register, update, list and delete)
- 👨‍✈️ Driver management
- 🗺️ Route management
- 📦 Trip tracking and status control
- 📊 Business rules and validations
- 🔐 RESTful API following best practices

---

## 🛠️ Tech Stack

- **Java 17+**
- **Spring Boot**
- Spring Web
- Spring Data JPA
- Maven
- H2 / PostgreSQL (configurable)
- JUnit 5 (tests – in progress)

---

## 🚀 Getting Started

### Prerequisites

- Java 17 or higher
- Maven
- Git

### Running the project

```bash
git clone https://github.com/Dazilio-Gabriel/Fleet-Management.git
cd Fleet-Management
./mvnw spring-boot:run
```

The application will start at:

```bash
http://localhost:8080
```

---

## 📡 API Example

```bash
GET /api/trucks
```

Response:

```bash
JSON: 

[
  {
    "id": 1,
    "plate": "ABC-1234",
    "model": "Volvo FH",
    "year": 2022,
    "status": "AVAILABLE"
  }
]
```

---

## 🧪 Tests

Unit tests are being implemented using JUnit 5 and Mockito, focusing on business rules and service layer validations.

---

## 🧩 **Roadmap**

- [ ] Authentication and authorization (Spring Security + JWT)
- [ ] Pagination and filtering
- [ ] API documentation with Swagger / OpenAPI
- [ ] Docker support
- [ ] Integration tests

---

## 📄 License

This project is licensed under the **MIT License**.  
See the `LICENSE` file for more details.

![License](https://img.shields.io/badge/License-MIT-green.svg)

