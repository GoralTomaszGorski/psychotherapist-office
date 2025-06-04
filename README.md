<h1 align="center">Psychotherapist Office</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-21-blue?logo=java&logoColor=white"/>
  <img src="https://img.shields.io/badge/SpringBoot-3.2-success?logo=springboot"/>
  <img src="https://img.shields.io/badge/Thymeleaf-3.1-darkgreen?logo=leaflet"/>
  <img src="https://img.shields.io/badge/JUnit-5.9.3-red?logo=JUnit5"/>
</p>

<p align="center">
  A full-stack web application for managing psychotherapy appointments and patient data.  
  <br>
  <strong>🚀 Live:</strong> <a href="https://psychoterapia-krasnik.pl/" target="_blank">psychoterapia-krasnik.pl</a>
</p>

---

## ✨ Features

- 📋 Add and search patients in the database
- 📅 Create, edit and manage appointments
- 💼 Define and update offered therapy types
- 📆 Configure therapist's work calendar
- 📧 Contact form with email sending via SMTP
- 🔒 Secure login for admin and standard users
- ✅ Server-side validation
- 💻 Responsive interface using Thymeleaf templates

---

## 🛠️ Tech Stack

- Java 21
- Spring Boot 3.2.0
- Thymeleaf + HTML + CSS
- Spring Security
- Jakarta Mail (email support)
- H2 (dev) & PostgreSQL (prod)
- Liquibase (profile-based DB migrations)
- Docker & Docker Compose

---

## 📦 Deployment

Live version available at:  
🔗 [https://psychoterapia-krasnik.pl/](https://psychoterapia-krasnik.pl/)

### 🧪 Run locally

```bash
git clone https://github.com/GoralTomaszGorski/psychotherapist-office.git
```
```sh
cd psychotherapist-office
```
### Build application
```sh
mvn package
```

### Run app
```sh
java -jar target/psychotherapistOffice-0.0.1-SNAPSHOT.jar
```

### Open app in you browser
[Click here](http://localhost:8080/).

## Run project by docker

### How to run the app in development

> [!WARNING]
> Requires to start application:
> 1. docker-compose

### Build app

```sh
docker-compose -f docker/docker-compose-app-builder.yml up
```

### Create .env file
```sh
cp docker/.env.dist docker/.env
```

### Run container with web application

```sh
docker-compose -f docker/docker-compose.yml up -d
```

### Open app in you browser
[Click here](http://localhost:8080/).

### Authentication data:
###### Admin:
###### login: admin@example.com
###### password: adminpass
###### User:
###### login: user@example.com
###### password: userpass

## 🧠 Project Purpose
This application was built to improve communication and scheduling between psychotherapists and clients.

**Patients can:**  
- Check available services  
- Book appointments  
- Use the contact form to reach the therapist

**Therapists/admins can:**  
- Manage patient records  
- Handle appointments and availability  
- Update services and working hours  
- Manage work calendars

---

## 🗂️ Database Schema

![psychotherapistOffice_db_schema.png](https://github.com/GoralTomaszGorski/psychotherapist_office/blob/6ca77b18357403c09c19b23b21effa0e37df7d4c/src/main/resources/static/images/psychotherapistOffice_db_schema.png)

---

## 👨‍💻 Author

**Tomasz Górski** – QA Engineer & Developer  
🔗 https://psychoterapia-krasnik.pl/  
📌 https://github.com/GoralTomaszGorski  
🔗 https://www.linkedin.com/in/tomasz-g%C3%B3rski-127132256/  
💡 Military-to-IT career transition | Passionate about real-world testable solutions
