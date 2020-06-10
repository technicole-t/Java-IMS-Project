package com.qa.inventoryms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

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
			LOGGER.info("Customer has been successfully added to the database...");
	}
	
	public void updateCustomer(CustomerModel customer, String updateVal) {
		String oldEmail = customer.getCustomerEmail();
		String newEmail = updateVal;
		String sqlUpdate = "UPDATE customers SET customer_email = ('" + newEmail + "') WHERE customer_email = '" + oldEmail +"';";
		databaseConnection.sendUpdate(sqlUpdate);
		LOGGER.info("Customer's email has successfully been updated...");
	}
	
	public void deleteCustomer(CustomerModel customer) {
		String emailOfCustToDel = customer.getCustomerEmail();
		String sqlDelete = "DELETE from customers WHERE customer_name = '" + emailOfCustToDel +"';";
		databaseConnection.sendUpdate(sqlDelete);
		LOGGER.info("Customer has successfully been deleted...");
	}
	
	public void readAllCustomers() {
		ResultSet resultSet = null;
		String custEmail, custName;
		String sqlReadAll = "SELECT * FROM customers";
		resultSet = databaseConnection.sendQuery(sqlReadAll);
		try {
			while (resultSet.next()) {
				custName = resultSet.getString("customer_name");
				custEmail = resultSet.getString("customer_email");
				LOGGER.info(custName + " - " + custEmail);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}

