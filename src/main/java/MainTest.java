

import java.sql.Connection;

import config.ConnexionDB;

public class MainTest {

    public static void main(String[] args) {
        ConnexionDB connexionDB = new ConnexionDB();
        try {
            Connection connection = connexionDB.getConnection();
            if (connection != null) {
                System.out.println("Connected to the database successfully!");
                // Perform any additional testing or database operations here
                // Don't forget to close the connection when done
                connection.close();
            } else {
                System.out.println("Failed to connect to the database.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}