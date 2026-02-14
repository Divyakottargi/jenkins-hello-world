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
📊 Pipeline Stages
Checkout: Pulls the latest code from the GitHub repository.

Echo Version: Displays Maven and Java versions to verify the environment.

Build & Test: Compiles the Java source code and runs the JUnit test cases.

Post Actions: - Records JUnit test results.

Archives the generated JAR file for deployment.

📸 Screenshots of Results
1. Jenkins Build Success
This shows the successful completion of the pipeline with a "Blue/Green" status.

2. Maven Test Execution (Console Output)
Evidence of the Calculator logic being tested: Testing addition: 2 + 3 = 5.

3. JUnit Test Report
Detailed breakdown showing that 100% of the test cases passed.

Developed by: [Your Name/Divyakottargi]

Date: February 2026
