package com.qa.inventoryms.services;

import java.sql.SQLException;

import com.qa.inventoryms.dao.CustomerDAO;
import com.qa.inventoryms.models.CustomerModel;
import com.qa.inventoryms.utils.ScannerUtils;

public class CustomerSubMenu  {
	
	private String name;
	private String email;
	
	CustomerModel customer = new CustomerModel(name, email, 0);
	
	
	public CustomerSubMenu() throws SQLException {
		
		System.out.println("Welcome to CUSTOMERS.\nWhich of the following would you like to do?\n1. INSERT 2.READ ALL 3.UPDATE 4.DELETE");
		String response = ScannerUtils.scanner.nextLine().toUpperCase();
		
	
		switch(response) {
		case "INSERT":
			// why null?
			CustomerDAO customerDao = new CustomerDAO(null);
			customerDao.insertCustomer(customer);
		break;
		case "READ ALL":
			// CustomerDAO customerDao = new CustomerDAO(null);
			// customerDao.readAllCustomers();
		}
		
	}

	
	
}
