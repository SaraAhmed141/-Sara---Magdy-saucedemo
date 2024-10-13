# Demo Swag Labs Automation

This project automates the testing of **Swag Labs** using **Cucumber**, **Selenium WebDriver**, and **JUnit**.

## Project Structure

- `src/test/resources/features`: Contains Cucumber feature files.
- `src/test/java/com/DemoSwagLabs`: Contains page objects, step definitions, and utilities.
- `src/test/java/com/DemoSwagLabs/runners`: Contains the test runner.

## Prerequisites

- Java JDK 8 or higher
- Maven or Gradle
- Cucumber, Selenium WebDriver

## Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/demo-swag-labs.git
   cd demo-swag-labs
   
**##Project Structure**
demo-swag-labs/
├── src/
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └── DemoSwagLabs/
│       │           ├── runners/             # Test runner class
│       │           ├── step_definitions/    # Cucumber step definitions
│       │           ├── pages/               # Page Object Model (POM) classes
│       │           └── utilities/           # Utility classes (e.g., configuration, driver setup)
│       └── resources/
│           └── features/                    # Cucumber feature files
├── target/                                 # Build output (reports, logs)
│   └── cucumber.json                      # JSON report for test results
└── pom.xml                                 # Maven build file
