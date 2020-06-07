package com.qa.inventoryms.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.qa.inventoryms.exceptions.ConnectionNotMade;

public class LocalConnection extends DatabaseConnection {

	public LocalConnection(String user, String password) {
		super(user, password);
	}
	
	public void openConnection()  {
		// TO CHANGE FOR SQL EXCEPTION
		try {
			// Don't have a local database - connected remote one 
			setConnection(DriverManager.getConnection("jdbc:mysql://34.67.87.1:3306/inventorydb", getUsername(), getPassword()));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ConnectionNotMade("Local database is not accessible: " + e.getMessage());
		}		
	}
}
