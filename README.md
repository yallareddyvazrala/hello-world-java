# Java Maven Standalone Project

A simple Java standalone application built using Maven. This project demonstrates how to structure, build, and run a basic Java project with Maven as the build tool.

## 📁 Project Structure

```
hello-world-java/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── rt/
    |               └── sample
│   │                   └── HelloWorld.java
│   └── test/
│       └── java/
│           └── com/
│               └── rt/
|                   └── sample
│                       └── HelloWorldTest.java
├── pom.xml
└── README.md
```

## 🚀 Getting Started

### ✅ Prerequisites

- Java JDK 8 or higher
- Maven 3.6+
- IDE (e.g., IntelliJ IDEA, Eclipse, VS Code)

---

## 🔧 Build & Run Instructions

### 1. Clone the repository

```bash
git clone https://github.com/your-username/maven-standalone-project.git
cd hello-world-java
```

### 2. Build the project

```bash
mvn clean package
```

This will generate a `.jar` file in the `target/` directory.

### 3. Run the application

```bash
java -jar target/hello-world-java-1.0.0.jar
```
---

## 🧪 Running Unit Tests

```bash
mvn test
```

This will execute all unit tests under `src/test/java`.

---

## 📦 Packaging

To create a runnable JAR:

```bash
mvn clean package
```

If needed, you can skip tests during packaging:

```bash
mvn clean package -DskipTests
```
---

## 👤 Author
**Balaji Reddy Lachhannagari**
**Rushi Technologies**  
Training & Consulting  
Website: [https://rushitechnologies.com](https://rushitechnologies.com)