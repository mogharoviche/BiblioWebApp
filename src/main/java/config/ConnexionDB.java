package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionDB {

    public Connection getConnection() {

        
        try {Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (Exception e) {
			System.out.println(e+"JAR ERROR");
		}
        DbConfig dbConfig = new DbConfig();
        Connection connection = null;
        try {
            
        	connection = DriverManager.getConnection(
        			dbConfig.getUri(),
        			dbConfig.getUsername(),
        			dbConfig.getPassword()
            );
        	
        	
        } catch (SQLException e) {
            // Handle exceptions appropriately
        	System.out.println("EtapF");
            e.printStackTrace();
            throw new RuntimeException("Failed to connect to the database.");
        }
		return connection;
    }
}