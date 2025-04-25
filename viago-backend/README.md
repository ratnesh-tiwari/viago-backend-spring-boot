# 🚖 ViaGo — Cab Booking Platform (Backend)

**Your Way, Right Away**

This is the backend service for **ViaGo**, a cab booking platform that connects riders with drivers seamlessly. Built with **Spring Boot**, this RESTful API handles core features like user management, ride requests, and location tracking.

---

## ✨ Features

- 🚗 User registration and login (Rider & Driver roles)
- 📍 Request and manage rides
- 👥 Assign drivers to riders
- 🔁 Track ride lifecycle: `REQUESTED → ACCEPTED → ONGOING → COMPLETED`
- 🔐 Secure APIs with future authentication
- ⚙️ Scalable layered architecture

---

## 🔧 Tech Stack

- **Java 21**
- **Spring Boot 3**
- **Spring Web**
- **Spring Data JPA**
- **Spring Security**
- **PostgreSQL**
- **Lombok**
- **Maven**

---

## 🚀 Getting Started

### Prerequisites

- Java 17 or later
- Maven
- PostgreSQL

### Setup

```bash
# Clone the repository
git clone https://github.com/yourusername/viago-backend.git
cd viago-backend

# Configure your database credentials in application.yml

# Build and run the application
mvn clean install
mvn spring-boot:run
