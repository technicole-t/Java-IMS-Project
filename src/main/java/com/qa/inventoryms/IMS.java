package com.qa.inventoryms;



import org.apache.log4j.Logger;

import com.qa.inventoryms.dao.DatabaseConnection;
import com.qa.inventoryms.services.CustomerSubMenu;
import com.qa.inventoryms.utils.MenuStarter;
import com.qa.inventoryms.utils.ScannerUtils;


//import com.qa.inventoryms.dao.CustomerDAO;
//import com.qa.inventoryms.dao.RemoteConnection;
//import com.qa.inventoryms.models.CustomerModel;
//import com.qa.inventoryms.utils.MenuStarter;

public class IMS {
	
	public static final Logger LOGGER = Logger.getLogger(IMS.class);
	
	MenuStarter starter = new MenuStarter();
	
	private DatabaseConnection databaseConnection;
	
	public IMS(DatabaseConnection databaseConnection) {
		this.databaseConnection = databaseConnection;
	}
	
	public void start() {
		
		// method asks the user to put a user-name for personalised message to access switch method
	
			System.out.println("What is your name? ");
			MenuStarter.setUsername(ScannerUtils.scanner.nextLine());
			System.out.println("Hello " + MenuStarter.getUsername() + ", this is an Inventory Management System!\n");
		
			
			while (true) {
				System.out.println("You have reached the IMS Main Menu.\nPlease type one of the following to view further options: \n 1. 'CUSTOMERS', \n 2. 'ITEMS', \n 3. 'ORDERS', \n 4. 'EXIT'");
				// ScannerUtils.scanner.nextLine().toUpperCase();
				
				String response = ScannerUtils.scanner.nextLine().toUpperCase();
				
				switch(response) {
				case "CUSTOMERS":
					CustomerSubMenu custMenu = new CustomerSubMenu(databaseConnection);
					custMenu.menu();
					break;
				case "ITEMS":
					System.out.println("Welcome to items");
					break;
				case "ORDERS":
					System.out.println("Welcome to orders");
					break;
				case "EXIT":
					System.out.println("Goodbye" + MenuStarter.getUsername() + " Thank you for using this IMS.");
					System.exit(0);
				}
				break;
			}
		}
	
	}
	


