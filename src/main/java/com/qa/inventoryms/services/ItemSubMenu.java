package com.qa.inventoryms.services;

import org.apache.log4j.Logger;

import com.qa.inventoryms.dao.DatabaseConnection;
import com.qa.inventoryms.dao.ItemsDAO;
import com.qa.inventoryms.models.ItemModel;
import com.qa.inventoryms.utils.MenuStarter;
import com.qa.inventoryms.utils.ScannerUtils;

public class ItemSubMenu {
	
	public static final Logger LOGGER = Logger.getLogger(ItemSubMenu.class);
	
	MenuStarter starter = new MenuStarter();
	
	private DatabaseConnection databaseConnection;
	public ItemSubMenu(DatabaseConnection databaseConnection) {
		this.databaseConnection = databaseConnection;
	}

public void itemMenu() {
			
		System.out.println("Welcome to ITEMS."
				+ "\nWhich of the following would you like to do?"
				+ "\n1. INSERT \n2.VIEW ALL \n3.UPDATE \n4.DELETE \n5. EXIT");
		String response = ScannerUtils.scanner.nextLine().toUpperCase();
		
			switch(response) {
			case "INSERT":
				ItemsDAO itemsDao = new ItemsDAO(databaseConnection);
				LOGGER.info("Please enter the item name: ");
				String itemName = ScannerUtils.scanner.nextLine();
				LOGGER.info("Please enter the item price - to 2 decimal places: (e.g. 2.00, 120.75) ");
				float itemPrice = ScannerUtils.scanner.nextFloat();
				ItemModel item = new ItemModel(itemName, itemPrice);
				itemsDao.insertItem(item);
				break;
			case "UPDATE":
				ItemsDAO itemDaoUpdate = new ItemsDAO(databaseConnection);
				LOGGER.info("Please enter the item name: ");
				String oldItemName = ScannerUtils.scanner.nextLine();
				LOGGER.info("Please enter the item price: ");
				float newPrice = ScannerUtils.scanner.nextFloat();
				ItemModel itemUpt = new ItemModel(oldItemName);
				itemDaoUpdate.updateItem(itemUpt, newPrice);;
				break;
			case "DELETE":
				ItemsDAO itemDaoDelete = new ItemsDAO(databaseConnection);
				LOGGER.info("What is the name of the item you want to delete?: ");
				String itemToDel = ScannerUtils.scanner.nextLine();
				ItemModel itemDel = new ItemModel(itemToDel);
				itemDaoDelete.deleteItem(itemDel);
				break;
			case "VIEW ALL":
				ItemsDAO itemReadAll = new ItemsDAO(databaseConnection);
				itemReadAll.readAllItems();
				break;
			case "EXIT":
				LOGGER.info("Goodbye" + MenuStarter.getUsername() + " Thank you for using this IMS.");
				System.exit(0);
			default:
				break;
		}
	}
}
