package com.qa.inventoryms.services;

import com.qa.inventoryms.dao.DatabaseConnection;
import com.qa.inventoryms.utils.MenuStarter;
import com.qa.inventoryms.utils.ScannerUtils;

public class OrdersSubMenu {
	
	MenuStarter starter = new MenuStarter();
	
	private DatabaseConnection databaseConnection;
	
	public OrdersSubMenu(DatabaseConnection databaseConnection) {
		this.databaseConnection = databaseConnection;
	}

	public void orderMenu() {
		
		System.out.println("Welcome to ORDERS."
				+ "\nWhich of the following would you like to do?"
				+ "\n1. ADD \n2.SEE ALL \n3.ADD ITEM TO EXISTING ORDER \n4.DELETE AN ORDER \n5. GET COST OF AN ORDER \n6. DELETE ITEM IN AN ORDER \n7. EXIT");
		String response = ScannerUtils.scanner.nextLine().toUpperCase();
		
			switch(response) {
			case "ADD":
				
				//OrdersDAO ordersDao = new OrdersDAO(databaseConnection);
				break;
			case "SEE ALL":
				break;
			case "ADD ITEM TO EXISTING ORDER":
				break;
			case "DELETE AN ORDER":
				break;
			case "DELETE ITEM IN AN ORDER":
				break;
			case "GET COST OF AN ORDER":
				break;
			case "EXIT":
				System.out.println("Goodbye" + MenuStarter.getUsername() + " Thank you for using this IMS.");
				System.exit(0);
			default:
				break;
		}
		
		}
		
	}

