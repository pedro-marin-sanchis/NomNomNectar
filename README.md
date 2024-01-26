# NomNomNectar

## Description

NomNomNectar is a dynamic web application developed as a portfolio project, leveraging key technologies in the Java ecosystem. The application is built using the Spring framework, specifically Spring Web for handling HTTP requests and Spring Security for ensuring robust authentication and authorization mechanisms. Thymeleaf, a server-side templating engine, is employed to create dynamic and interactive user interfaces, while Bootstrap is used for responsive and mobile-first front-end development.

## Prerequisites

Make sure you have the following installed:

- Java
- Maven
- Spring Boot

## Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/pedro-marin-sanchis/AD-Spring-Product-2
    ```

2. Navigate to the project directory:

    ```bash
    cd AD-Spring-Product-2
    ```

3. Run the application:

    ```bash
    mvn spring-boot:run
    ```

## Usage

- The application allows users to browse available food items, place orders, and create custom menus.
- Describe how to navigate the app, order food, and create custom menus.
- Include information about endpoints, APIs, or UI if applicable.

## PostgreSQL Docker

To create the container we use:
   ```bash
   docker run -d -p 54320:5432 --name postgres-db -e POSTGRES_PASSWORD=secret --mount src=postgres-db-data,dst=/var/lib/postgresql/data postgres
   ```

To use bash inside the container we use:
   ```bash
   docker exec -it postgres-db psql -U postgres
   ```

To create the database we use:
   ```postgresql
   CREATE DATABASE replace_replace;
   ```

To obtain the container's IP we use:
   ```bash
   docker inspect -f '{{range.NetworkSettings.Networks}}{{.IPAddress}}{{end}}' replace_replace
   ```
## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

## Contact

For any inquiries or suggestions, feel free to reach out.
