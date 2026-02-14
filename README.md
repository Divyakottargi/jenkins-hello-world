# Jenkins CI/CD Pipeline: Calculator Java Application

## 📌 Project Overview
This project demonstrates a fully automated **Continuous Integration (CI)** pipeline. It uses a Java-based Calculator application to show how code changes are automatically pulled from GitHub, built with Maven, and verified through JUnit test cases within a Jenkins environment.

## 🛠️ Tech Stack
* **Version Control:** Git & GitHub
* **CI/CD Tool:** Jenkins (Pipeline as Code)
* **Build Tool:** Maven
* **Language:** Java 21
* **Testing Framework:** JUnit 4

## 🚀 Features
- **Automated Build:** Uses `mvn clean install` to compile the code and package it into a JAR file.
- **Unit Testing:** Validates calculator logic (Addition) automatically during the build process.
- **Pipeline as Code:** Uses a `Jenkinsfile` to define stages, ensuring the build process is repeatable.
- **Artifact Archiving:** Successfully generates and stores the final `.jar` file in Jenkins.
- **Test Reporting:** Integrates JUnit XML reports to track test pass/fail status.

## 📂 Project Structure
```text
Spring-Boot-Demo/
├── src/
│   ├── main/java/com/example/App.java        # Calculator Logic
│   └── test/java/com/example/AppTest.java    # Unit Tests
├── pom.xml                                   # Maven Configuration
├── Jenkinsfile                               # Jenkins Pipeline Script
└── README.md                                 # Project Documentation
