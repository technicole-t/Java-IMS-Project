package com.qa.inventoryms.dao;

import org.apache.log4j.Logger;

import com.qa.inventoryms.models.CustomerModel;

public class CustomerDAO {
	
	public static final Logger LOGGER = Logger.getLogger(CustomerDAO.class);
	
	private DatabaseConnection databaseConnection;

	public CustomerDAO(DatabaseConnection databaseConnection) {
		this.databaseConnection = databaseConnection;
	}

	public void insertCustomer(CustomerModel customer) {
			String name = customer.getCustomerName();
			String email = customer.getCustomerEmail();
			
			String sql = "INSERT INTO customers(customerName, customerEmail) values ('"
					+ name + "', '"+ email + "');";
			databaseConnection.sendUpdate(sql);
	}
	
	
	// NOT DONE BELOW THIS LINE
	// ----------------------------------------------------
//	public void viewAllCustomer(CustomerModel customer) throws SQLException {
//		String sql = "SELECT * FROM customers";
//		databaseConnection.sendQuery(sql);
//	}
//	
//	public void updateCustomer(CustomerModel customer) throws SQLException {
//	//	String sql = "UPDATE users SET";
//	
//	}
//	
//	public void deletedCustomer() {
//		
//	}
//	
	
	
}
