package com.qa.inventoryms;

import org.apache.log4j.Logger;

import com.qa.inventoryms.dao.DatabaseConnection;
import com.qa.inventoryms.services.CustomerSubMenu;
import com.qa.inventoryms.services.ItemSubMenu;
import com.qa.inventoryms.services.OrdersSubMenu;
import com.qa.inventoryms.utils.MenuStarter;
import com.qa.inventoryms.utils.ScannerUtils;

public class IMS {
	
	public static final Logger LOGGER = Logger.getLogger(IMS.class);
	
	MenuStarter starter = new MenuStarter();

	private DatabaseConnection databaseConnection;
	public IMS(DatabaseConnection databaseConnection) {
		this.databaseConnection = databaseConnection;
	}
	
	public void start() {
		
			LOGGER.info("What is your name? ");
			MenuStarter.setUsername(ScannerUtils.scanner.nextLine());
			LOGGER.info("Hello " + MenuStarter.getUsername() + ", this is an Inventory Management System!\n");
		
			LOGGER.info("You have reached the IMS Main Menu."
					+ "\nPlease type one of the following to view further options: "
					+ "\n 1. CUSTOMERS, \n 2. ITEMS, \n 3. ORDERS, \n 4. EXIT");
				
				String response = ScannerUtils.scanner.nextLine().toUpperCase();
				
				switch(response) {
				case "CUSTOMERS":
					CustomerSubMenu custMenu = new CustomerSubMenu(databaseConnection);
					custMenu.menu();
					break;
				case "ITEMS":
					ItemSubMenu itemMenu = new ItemSubMenu(databaseConnection);
					itemMenu.itemMenu();
					break;
				case "ORDERS":
					OrdersSubMenu ordersMenu = new OrdersSubMenu(databaseConnection);
					ordersMenu.orderMenu();
					break;
				case "EXIT":
					LOGGER.info("Goodbye" + MenuStarter.getUsername() + " Thank you for using this IMS.");
					System.exit(0);
				}
			}
		}
	
	


