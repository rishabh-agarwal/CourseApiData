
# CourseApiData

Welcome to the **CourseApiData** repository! This project is an API-based application designed to manage courses, topics, and other related data. It demonstrates the use of Spring Boot for building RESTful services and is suitable for anyone looking to understand how to structure and implement a basic API service in Java.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Overview

**CourseApiData** is a Spring Boot application that provides RESTful API endpoints to perform CRUD operations on courses and topics. It uses an in-memory database (H2) for data storage and includes sample data to help you get started quickly.

## Features

- **CRUD Operations:** Create, Read, Update, and Delete courses and topics.
- **RESTful API:** Exposes endpoints for managing courses and topics.
- **In-memory Database:** Uses H2 for quick setup and testing.
- **Spring Boot:** Built using Spring Boot for easy configuration and deployment.

## Getting Started

### Prerequisites

Before you begin, ensure you have the following installed:

- **Java 11** (or higher)
- **Maven** (for dependency management and build)
- **Git** (to clone the repository)

### Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/rishabh-agarwal/CourseApiData.git
   cd CourseApiData
   ```

2. **Build the project:**

   Use Maven to build the project and resolve dependencies:

   ```bash
   mvn clean install
   ```

### Running the Application

After building the project, you can run the application using Maven:

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`.

## API Endpoints

Here are some of the key API endpoints available:

- **GET /topics:** Get all topics
- **GET /topics/{id}:** Get a specific topic by ID
- **POST /topics:** Create a new topic
- **PUT /topics/{id}:** Update an existing topic
- **DELETE /topics/{id}:** Delete a topic by ID

- **GET /courses:** Get all courses
- **GET /courses/{id}:** Get a specific course by ID
- **POST /courses:** Create a new course
- **PUT /courses/{id}:** Update an existing course
- **DELETE /courses/{id}:** Delete a course by ID

## Contributing

Contributions are welcome! If you would like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -m 'Add some feature'`).
5. Push to the branch (`git push origin feature-branch`).
6. Open a Pull Request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

If you have any questions or feedback, feel free to reach out:

- **Rishabh Agarwal**
- GitHub: [@rishabh-agarwal](https://github.com/rishabh-agarwal)
- Email: [Your Email Address]
