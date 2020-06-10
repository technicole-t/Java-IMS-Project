package com.qa.inventoryms.services;

import com.qa.inventoryms.dao.CustomerDAO;
import com.qa.inventoryms.dao.DatabaseConnection;
import com.qa.inventoryms.dao.OrdersDAO;
import com.qa.inventoryms.models.CustomerModel;
import com.qa.inventoryms.utils.ScannerUtils;

public class OrdersSubMenu {
	
private DatabaseConnection databaseConnection;
	
	public OrdersSubMenu(DatabaseConnection databaseConnection) {
		this.databaseConnection = databaseConnection;
	}

	public void orderMenu() {
		
		System.out.println("Welcome to ORDERS."
				+ "\nWhich of the following would you like to do?"
				+ "\n1. ADD \n2.SEE ALL \n3.ADD ITEM TO EXISTING ORDER \n4.DELETE AN ORDER \n5. GET COST OF AN ORDER \n6. DELETE ITEM IN AN ORDER");
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
			default:
				break;
		}
		
		}
		
	}

