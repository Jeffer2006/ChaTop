# 🎉 ChaTop - Simplifying Rental Property Management

## 🚀 Getting Started

Welcome to ChaTop! This application helps you manage rental properties easily by providing a functional backend API. You will find useful options for listing properties, handling user authentication, and communicating through messaging. Let's get started with downloading and running ChaTop smoothly.

## 📥 Download ChaTop

[![Download ChaTop](https://img.shields.io/badge/Download-ChaTop-brightgreen.svg)](https://github.com/Jeffer2006/ChaTop/releases)

To download ChaTop, visit this page: [GitHub Releases](https://github.com/Jeffer2006/ChaTop/releases).

## 🛠️ System Requirements

Before downloading, ensure your system meets these requirements:

- **Java™ 11 or above:** ChaTop requires Java to run. Download it from [Oracle](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or an alternative source.
- **Maven Installed:** Maven is needed for building and managing the software. You can find installation instructions on the [Maven website](https://maven.apache.org/install.html).
- **MySQL Database:** ChaTop uses MySQL for data storage. You can get it from the [MySQL website](https://www.mysql.com/downloads/).

## 📖 Features

ChaTop provides several key features:

- **User Authentication:** Secure login and registration process for users.
- **Property Listings:** Easily manage and display rental property information.
- **Messaging System:** Communicate between users and property managers for inquiries and updates.

## 💻 Download & Install

1. Visit the GitHub Releases page: [Download ChaTop](https://github.com/Jeffer2006/ChaTop/releases).
   
2. Look for the latest release. You will see files listed under the version number. 

3. Click on the desired file to download it. For a typical setup, choose the JAR file named like `ChaTop-1.0.0.jar`.

4. After downloading, locate the file on your computer.

5. Open your terminal or command prompt:

   - On Windows, you can do this by searching for “cmd” in the Start menu.
   - On macOS/Linux, use the terminal application.

6. Navigate to the folder where you saved the JAR file. Use the command:
   ```bash
   cd path/to/your/downloaded/file
   ```
   Replace `path/to/your/downloaded/file` with the actual path.

7. To run ChaTop, use the following command:
   ```bash
   java -jar ChaTop-1.0.0.jar
   ```
   This will start the application, and you will see some output in your terminal.

8. ChaTop will be running locally. By default, it uses the port **8080**. You can access it by going to `http://localhost:8080` in your web browser.

## 🔍 Explore the API

Once ChaTop is running, you have access to its APIs:

- **Authentication API:** Handle user login and registration.
- **Property Management API:** List, add, modify, or delete properties.
- **Messaging API:** Enable communication between users and property managers.

Information on how to use these APIs can be found in the [OpenAPI documentation](https://swagger.io/tools/swagger-ui/).

## 🛠️ Configuration

You may want to configure your application settings before using ChaTop. Here's how:

1. Open the `application.properties` file located in the configuration directory after running the JAR.
2. Modify settings like database URL, username, and password for MySQL.

For example:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
```

After making changes, restart the application using the command mentioned above.

## 🐛 Troubleshooting

If you face issues while running ChaTop, consider these tips:

- **Java Not Found:** Ensure you have installed Java and added it to your system's PATH.
- **MySQL Connection Errors:** Verify that your database is running and the credentials in `application.properties` are correct.
- **Port Already in Use:** The default port **8080** may be taken by another app. You can change the port in the `application.properties` file.

## 🤝 Contributing

If you wish to contribute to ChaTop, you can submit issues, suggestions, or enhancements through the Issues page on GitHub.

## 📞 Support

For support, please open an issue on GitHub, and we'll assist you as soon as possible. You can also check the FAQ section or community discussions for help.

## 📝 License

ChaTop is licensed under the MIT License. See the LICENSE file for more details.

---

Now you are ready to successfully download and run ChaTop! Thank you for choosing our application for your rental property management needs.