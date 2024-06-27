# Todo Application

This is a simple Spring Boot application that provides a RESTful API for managing todo items.

## Features

- Create a new todo item
- Retrieve a list of todo items
- Retrieve a single todo item by ID
- Update an existing todo item
- Delete a todo item

## Requirements

- Java 17 or higher
- Maven 3.6.3 or higher

## Getting Started

### Clone the repository
git clone https://github.com/suraj101998/TodoApplication.git
cd todo-application

### Build the project
mvn clean install
### Run the application
mvn spring-boot:run

The application will start on http://localhost:8080

### API Endpoints


## Create a new todo item

    URL: /todos
    Method: POST
    Request Body: {
                    "title": "Buy groceries",
                    "description": "Milk, Bread, Cheese, and Vegetables",
                    "created_at": "2024-06-25",
                    "completed": false
                    }

    Response: {
                "id": 1,
                "title": "Buy groceries",
                "description": "Milk, Bread, Cheese, and Vegetables",
                "created_at": "2024-06-25",
                "completed": false
                }

## Retrieve all todo items

    URL: /todos
    Method: GET
    Response: [
                {
                    "id": 1,
                    "title": "Buy groceries",
                    "description": "Milk, Bread, Cheese, and Vegetables",
                    "created_at": "2024-06-25",
                    "completed": false
                },
                {
                    "id": 2,
                    "title": "Finish project",
                    "description": "Complete the project by end of the week",
                    "created_at": "2024-06-24",
                    "completed": true
                }
            ]

## Retrieve a single todo item by ID

    URL: /todos/{id}
    Method: GET
    Response: {
                "id": 1,
                "title": "Buy groceries",
                "description": "Milk, Bread, Cheese, and Vegetables",
                "created_at": "2024-06-25",
                "completed": false
            }

## Update an existing todo item

    URL: /todos/{id}
    Method: PUT
    Request Body: {
                    "title": "Buy groceries and drinks",
                    "description": "Milk, Bread, Cheese, Vegetables, and Soda",
                    "created_at": "2024-06-25",
                    "completed": true
                    }

    Response: {
                "id": 1,
                "title": "Buy groceries and drinks",
                "description": "Milk, Bread, Cheese, Vegetables, and Soda",
                "created_at": "2024-06-25",
                "completed": true
                }
## Delete a todo item

    URL: /todos/{id}
    Method: DELETE

## Project Structure

    src/main/java: Contains the main application and Java source files
    src/main/resources: Contains the application configuration files

## Dependencies

    Spring Boot Starter Web
    Spring Boot Starter Data JPA
    Spring Boot Starter Validation
    Spring Boot Starter Logging
    Spring Boot Starter Actuator
    Mysql Connector Java (for connecting code to database)
    Lombok (for reducing boilerplate code)
    Springdoc Openapi UI (for viewing the swagger file of the API)

## Author

    Suraj Chakraborty (suraj.chakraborty@npci.org.in)   

