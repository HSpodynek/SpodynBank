# SpodynBank

Welcome to the SpodynBank application repository, based on Spring Boot using Maven and JSP!

## Requirements

- Java 11 or newer
- Maven
- MySQL database server

## Running the Application

To run the application, follow the instructions below:

1. Clone this repository to your local machine.
2. Navigate to the main project directory.
3. Execute the following command to build the project:
   ```bash
   mvn clean install
```
After the build is successful, start the application using the command:
```bash
mvn spring-boot:run
```
Go to: http://127.0.0.1:8070/

The application will run on the default port 8070.

## Database Configuration
For the application to work correctly, it is necessary to configure the MySQL database. Follow the steps below:

Create a new MySQL database.
Execute the SpodynBank.sql script on the created database. This script is located in the main repository directory.
Configure the database connection in the application's application.properties file, adjusting the appropriate parameters (e.g., spring.datasource.username, spring.datasource.password, spring.datasource.url, etc.).

## Email Configuration
For email functionalities to work correctly, you need to configure hMailServer. Alternatively, you can modify the code to connect to your Gmail account. Ensure that the email configurations in the application.properties or any other configuration file are set correctly, depending on your chosen email service.