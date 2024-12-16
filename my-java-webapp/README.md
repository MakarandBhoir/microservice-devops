# My Java Web Application

This is a simple Java web application that demonstrates the use of Servlets and JSP.

## Project Structure

```
my-java-webapp
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── servlet
│   │   │               └── HelloWorldServlet.java
│   │   ├── resources
│   │   └── webapp
│   │       ├── WEB-INF
│   │       │   └── web.xml
│   │       └── index.jsp
├── pom.xml
└── README.md
```

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Maven

## Build the Application

1. Navigate to the project directory:
   ```
   cd my-java-webapp
   ```

2. Build the project using Maven:
   ```
   mvn clean install
   ```

## Run the Application

You can deploy the generated WAR file located in the `target` directory to a servlet container like Apache Tomcat.

1. Copy the WAR file to the `webapps` directory of your Tomcat installation.
2. Start the Tomcat server.
3. Access the application at `http://localhost:8080/my-java-webapp`.

## Features

- A simple servlet that responds with "Hello, World!".
- A JSP page that serves as the entry point for the application.

## License

This project is licensed under the MIT License.