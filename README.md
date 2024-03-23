# Selenium Java Cucumber Test Automation Project

This project implements test automation for the OrangeHRM application using Selenium WebDriver, Java, Cucumber, TestNG, and custom listeners to generate detailed test reports.

## Overview

The project follows the Page Object Model (POM) design pattern, where each web page is represented as a class, and the interactions with the elements on that page are encapsulated within methods.

The test automation covers the entire task described in a single scenario defined in the feature file.

## Features

- Utilizes Selenium WebDriver for browser automation.
- Implements Cucumber for behavior-driven development (BDD) style testing.
- Uses TestNG as the testing framework for test execution and assertions.
- Generates detailed test reports with custom listeners to monitor test execution.
- Manages WebDriver setup using WebDriverManager, eliminating the need for manual installation.
- Selects web elements using XPath, name, and CSS selectors.
- Implements a for loop to select options from dropdown lists in the add employee form.

## Project Structure

src/
├── test/
│ ├── java/
│ │ └── com/
│ │ └── example/
│ │ ├── pages/ # Page Object classes
│ │ │ ├── BasePage.java # Base page class with common methods
│ │ │ └── OrangeHRMPage.java # OrangeHRM page class with specific methods
│ │ ├── steps/ # Step definition classes
│ │ │ └── OrangeHRMSteps.java # Step definitions for Cucumber scenarios
│ │ ├── utils/ # Utility classes
│ │ │ └── CustomListeners.java # Custom TestNG listeners for reporting
│ └── resources/
│ └── features/ # Feature files
│ └── orangepage.feature # Feature file with scenarios
└── pom.xml # Maven configuration file
