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
			setConnection(DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/", getUsername(), getPassword()));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ConnectionNotMade("Local database is not accessible: " + e.getMessage());
		}		
	}
}
