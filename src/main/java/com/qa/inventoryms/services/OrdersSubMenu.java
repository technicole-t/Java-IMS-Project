package com.qa.inventoryms.services;

import org.apache.log4j.Logger;

import com.qa.inventoryms.dao.DatabaseConnection;
import com.qa.inventoryms.dao.OrdersDAO;
import com.qa.inventoryms.models.CustomerModel;
import com.qa.inventoryms.models.OrderModel;
import com.qa.inventoryms.utils.MenuStarter;
import com.qa.inventoryms.utils.ScannerUtils;

public class OrdersSubMenu {
	
	public static final Logger LOGGER = Logger.getLogger(OrdersSubMenu.class);
	
	MenuStarter starter = new MenuStarter();
	
	private DatabaseConnection databaseConnection;
	
	public OrdersSubMenu(DatabaseConnection databaseConnection) {
		this.databaseConnection = databaseConnection;
	}

	public void orderMenu() {
		
		LOGGER.info("Welcome to ORDERS."
				+ "\nWhich of the following would you like to do?"
				+ "\n1.ADD \n2.SEE ALL \n3.ADD ITEM TO EXISTING ORDER \n4.DELETE AN ORDER \n5.GET COST OF AN ORDER \n6.DELETE ITEM IN AN ORDER \n7.EXIT");
		String response = ScannerUtils.scanner.nextLine().toUpperCase();
		
			switch(response) {
			case "ADD":
				OrdersDAO ordersDao = new OrdersDAO(databaseConnection);
				LOGGER.info("Please enter the ID of the customer making the order (they must already be an IMS customer):");
				int AddOrderCustID = ScannerUtils.scanner.nextInt();
				int customerID = AddOrderCustID;
				OrderModel addOrderCust = new OrderModel(AddOrderCustID);
				CustomerModel customerModel = new CustomerModel(customerID);
				ordersDao.addOrder(addOrderCust, customerModel);
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
				LOGGER.info("Goodbye" + MenuStarter.getUsername() + " Thank you for using this IMS.");
				System.exit(0);
			default:
				break;
			}
		
		}
		
	}

