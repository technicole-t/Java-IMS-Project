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
			
			String sqlInsert = "INSERT INTO customers(customer_name, customer_email) values ('"
					+ name + "', '"+ email + "');";
			databaseConnection.sendUpdate(sqlInsert);
			System.out.println("Customer has been successfully added to the database...");
	}
	
	public void updateCustomer(CustomerModel customer, String updateVal) {
		String oldEmail = customer.getCustomerEmail();
		String newEmail = updateVal;
		String sqlUpdate = "UPDATE customers SET customer_email = ('" + newEmail + "') WHERE customer_email = '" + oldEmail +"';";
		databaseConnection.sendUpdate(sqlUpdate);
		System.out.println("Customer's email has successfully been updated...");
	}
	
	public void deleteCustomer(CustomerModel customer) {
		String emailOfCustToDel = customer.getCustomerEmail();
		String sqlDelete = "DELETE from customers WHERE customer_name = '" + emailOfCustToDel +"';";
		databaseConnection.sendUpdate(sqlDelete);
		System.out.println("Customer has successfully been deleted...");
	}
	
	
}

