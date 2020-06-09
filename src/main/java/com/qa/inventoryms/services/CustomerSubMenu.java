package com.qa.inventoryms.services;

import com.qa.inventoryms.dao.CustomerDAO;
import com.qa.inventoryms.dao.DatabaseConnection;
import com.qa.inventoryms.models.CustomerModel;
import com.qa.inventoryms.utils.ScannerUtils;

public class CustomerSubMenu  {
	
	private DatabaseConnection databaseConnection;
	
	public CustomerSubMenu(DatabaseConnection databaseConnection) {
		this.databaseConnection = databaseConnection;
	}

	public void menu() {
		
		System.out.println("Welcome to CUSTOMERS."
				+ "\nWhich of the following would you like to do?"
				+ "\n1. INSERT 2.READ ALL 3.UPDATE 4.DELETE");
		String response = ScannerUtils.scanner.nextLine().toUpperCase();
		
		boolean on = true;
		
		while (on) {
			switch(response) {
			case "INSERT":
				CustomerDAO customerDao = new CustomerDAO(databaseConnection);
				System.out.println("Please enter a name: ");
				String customerName = ScannerUtils.scanner.nextLine();
				System.out.println("Please enter an email: ");
				String customerEmail = ScannerUtils.scanner.nextLine();
				CustomerModel customer = new CustomerModel(customerName, customerEmail);
				customerDao.insertCustomer(customer);

			default:
				break;
		}
			break;
		
		}
	}
	
}
