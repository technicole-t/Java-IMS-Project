package com.qa.inventoryms.connect;


import com.qa.inventoryms.utils.MenuStarter;
import com.qa.inventoryms.utils.ScannerUtils;


//import com.qa.inventoryms.dao.CustomerDAO;
//import com.qa.inventoryms.dao.RemoteConnection;
//import com.qa.inventoryms.models.CustomerModel;
//import com.qa.inventoryms.utils.MenuStarter;

public class IMS {
	
	MenuStarter starter = new MenuStarter();
	
	public void start() {
		
		// method asks the user to put a user-name for personalised message to access switch method
	
			System.out.println("What is your name? ");
			MenuStarter.setUsername(ScannerUtils.scanner.nextLine());
			System.out.println("Hello " + MenuStarter.getUsername() + ", this is an Inventory Management System!\n");
			
			boolean on = true; 
			
			while (on) {
				System.out.println("You have reached the IMS Main Menu.\nPlease type one of the following to view further options: \n 1. 'CUSTOMERS', \n 2. 'ITEMS', \n 3. 'ORDERS', \n 4. 'EXIT'");
				// ScannerUtils.scanner.nextLine().toUpperCase();
				
				String response = ScannerUtils.scanner.nextLine().toUpperCase();
				
				switch(response) {
				case "CUSTOMERS":
					System.out.println("Welcome to customers");
					break;
				case "ITEMS":
					System.out.println("Welcome to items");
					break;
				case "ORDERS":
					System.out.println("Welcome to orders");
					break;
				case "EXIT":
					on = false;
					System.out.println("Goodbye" + MenuStarter.getUsername() + " Thank you for using this IMS.");
					break;
				}
				break;
			}
		}
	}
	
//	Input input = new Input();
//
//	public void start() throws SQLException {
//
//		System.out.println("Database username: ");
//		String user = input.getInput();
//		System.out.println("Database password: ");
//		String password = input.getInput();
//
//		RemoteConnection connection = new RemoteConnection(user, password);
//		
//		System.out.println("customer name:");
//		String name = input.getInput();
//
//		System.out.println("customer email:");
//		String email = input.getInput();
//
//		// Models 
//		CustomerModel customer = new CustomerModel(name, email, 0);
//		// ----------------------------
//		
//		// With the object send it to the DAO and have it do the rest
//		CustomerDAO customerDAO = new CustomerDAO(connection);
//		customerDAO.insertCustomer(customer);
//		
//		connection.closeConnection();
//	}


