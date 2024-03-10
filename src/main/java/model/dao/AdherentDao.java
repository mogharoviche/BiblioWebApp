package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.event.TreeWillExpandListener;

import config.ConnexionDB;
import model.entity.Adherent;

public class AdherentDao {
	private Connection connection;
	public AdherentDao() {
        connection = new ConnexionDB().getConnection();
    }
	
	public boolean addAdherent(Adherent adh) {
		//Get Data Info from entity Obj
			String nom = adh.getNom();
			String prenom = adh.getPrenom();
			String mail = adh.getMail();
			String telephone = adh.getTelephone();
					
			String query = "INSERT INTO adherent (dateinsc, nom, prenom, mail, telephone) VALUES (NOW(), ?, ?, ?, ?)";


	        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
	        	preparedStatement.setString(1, nom);
	        	preparedStatement.setString(2, prenom);
	        	preparedStatement.setString(3, mail);
	        	preparedStatement.setString(4, telephone);
	            
	            int rowsAffected = preparedStatement.executeUpdate();

	            if (rowsAffected > 0) {
	            	System.out.println("Adherent added successfully.");
	            	return true;
	            } else {
	                System.out.println("Failed to add adherent.");
	                return false;
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            throw new RuntimeException("Error adding adherent to the database.");
	        }
	
	}
	public ArrayList<Adherent> getAllAdherent() {
			String query = "SELECT * FROM adherent";

			ArrayList<Adherent> adherentList = new ArrayList<Adherent>();
	        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
	            ResultSet rowsReturned = preparedStatement.executeQuery();
	           while (rowsReturned.next()) {
	            	Adherent Adh =new Adherent( 
	            			rowsReturned.getString("nom"), 
	            			rowsReturned.getString("prenom"), 
	            			rowsReturned.getString("mail"), 
	            			rowsReturned.getString("telephone")
	            			);
	            	adherentList.add(Adh);
	            	}
	        } catch (SQLException e) {
	            e.printStackTrace();
	            throw new RuntimeException("Error adding adherent to the database.");
	        }
			return adherentList;
	
	}

}
