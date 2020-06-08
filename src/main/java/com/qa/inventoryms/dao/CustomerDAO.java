package com.qa.inventoryms.dao;

import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.qa.inventoryms.models.CustomerModel;
import com.qa.inventoryms.utils.ScannerUtils;

public class CustomerDAO {
	
	public static final Logger LOGGER = Logger.getLogger(CustomerDAO.class);
	
	private DatabaseConnection databaseConnection;

	public CustomerDAO(DatabaseConnection databaseConnection) throws SQLException {
		this.databaseConnection = databaseConnection;
	}

	public void insertCustomer(CustomerModel customer) throws SQLException {
		try {
			System.out.println("Customer name: ");
			String name = ScannerUtils.scanner.nextLine();
			System.out.println("Customer email: ");
			String email = ScannerUtils.scanner.nextLine();
			
			String sql = "INSERT INTO customers(customer_name, customer_email) values ('"
					+ name + "', '"+ email + "');";
			databaseConnection.sendUpdate(sql);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			LOGGER.debug(e.getStackTrace());
		}
		
	}
	// NOT DONE BELOW THIS LINE
	// ----------------------------------------------------
	public void viewAllCustomer(CustomerModel customer) throws SQLException {
		String sql = "SELECT * FROM customers";
		databaseConnection.sendQuery(sql);
	}
	
	public void updateCustomer(CustomerModel customer) throws SQLException {
	//	String sql = "UPDATE users SET";
	
	}
	
	public void deletedCustomer() {
		
	}
	
	
	
}
