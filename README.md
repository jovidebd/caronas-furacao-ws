#Caronas Furacao Web Service

## Local Test
To run the web service and test locally just execute the command `mvn spring-boot:run` on project's root directory, then Maven
will download all depedencies and deploy the application on a local servlet container,
Run the URL `http://localhost:8080/account/test` in the browser to test server response

## Change JDBC Configuration Parameters
In the file `jdbc.properties` change the following properties to configure the data source according to your local database.
```
db.driver=org.postgresql.Driver
db.url=jdbc:postgresql://localhost:5432/{database_name}
db.username={database_username}
db.password={database_password}
```
