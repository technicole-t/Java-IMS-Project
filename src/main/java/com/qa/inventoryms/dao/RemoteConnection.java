package com.qa.inventoryms.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.qa.inventoryms.exceptions.ConnectionNotMade;

public class RemoteConnection extends DatabaseConnection {
	
	public RemoteConnection(String user, String password) throws SQLException {
		super(user, password);
	}
	
	public void openConnection() {
		// TO CHANGE SQLEXCEPTION LATER
		try {
			setConnection(DriverManager.getConnection("jdbc:mysql://34.67.87.1/inventorydb", getUsername(), getPassword()));;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ConnectionNotMade("Remote database is not accessible: " + e.getMessage());

		}		
	}


}
