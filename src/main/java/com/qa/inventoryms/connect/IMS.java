package com.qa.inventoryms.connect;


import java.sql.SQLException;

import com.qa.inventoryms.dao.CustomerDAO;
import com.qa.inventoryms.dao.RemoteConnection;
import com.qa.inventoryms.models.CustomerModel;
import com.qa.inventoryms.utils.Input;

public class IMS {
	
	Input input = new Input();

	public void start() throws SQLException {

		System.out.println("Database username: ");
		String user = input.getInput();
		System.out.println("Database password: ");
		String password = input.getInput();

		RemoteConnection connection = new RemoteConnection(user, password);
		
		System.out.println("customer name:");
		String name = input.getInput();

		System.out.println("customer email:");
		String email = input.getInput();


		CustomerModel customer = new CustomerModel(name, email, 0);
		// ----------------------------
		
		// With the object send it to the Dao and have it do the rest
		CustomerDAO customerDAO = new CustomerDAO(connection);
		customerDAO.insertCustomer(customer);
		
		connection.closeConnection();
	}


}