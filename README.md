# 🔄 CI/CD Java Application with Jenkins, Maven & GitHub Webhook

This project demonstrates a basic Continuous Integration pipeline for a Java application using **Jenkins**, **Maven**, and **GitHub Webhooks**. The application includes user login credential validation with fields like name, email, mobile number, DOB, and password.

## 🚀 Project Overview

This project sets up:

- A **Java application** that validates user registration data.
- A **JUnit 5 test suite** to ensure the validation logic works.
- A **Maven build system** to compile, test, and package the code.
- A **Jenkins pipeline** triggered automatically when changes are pushed to GitHub (via webhook).

## 🧩 Tech Stack

- Java 17
- Maven
- JUnit 5
- Jenkins (CI tool)
- GitHub Webhook
- Ngrok (for local webhook tunneling)

## 📁 Project Structure

ci-maven-java/ │ ├── src/ │ ├── main/java/com/example/ │ │ ├── LoginValidator.java │ │ └── User.java │ └── test/java/com/example/ │ └── LoginValidatorTest.java │ ├── pom.xml └── README.md

markdown
Copy
Edit

## ⚙️ How the Pipeline Works

1. Code is pushed to GitHub.
2. GitHub sends a webhook to Jenkins (via ngrok tunnel).
3. Jenkins pulls the repo, builds it using Maven.
4. Jenkins runs JUnit tests.
5. Build passes/fails based on test results.

## 🔧 Jenkins Configuration

- **Trigger**: GitHub webhook trigger (`GitHub hook trigger for GITScm polling`)
- **Maven goals**: `clean install`
- **JDK**: Java 17 (set in Global Tools)

## 🌐 GitHub Webhook Setup

1. Run ngrok:
   ```bash
   ngrok http 8080
Go to GitHub → Repo Settings → Webhooks

Payload URL: https://<your-ngrok-domain>.ngrok-free.app/github-webhook/

Content type: application/json

Trigger: Just the push event

🧪 Running Locally
Compile and test with Maven:

bash
Copy
Edit
mvn clean test
(Optional) Run the app manually if you add a main() method:

bash
Copy
Edit
mvn clean compile
java -cp target/classes com.example.LoginValidator
