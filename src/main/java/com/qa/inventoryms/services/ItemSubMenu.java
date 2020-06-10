package com.qa.inventoryms.services;

import com.qa.inventoryms.dao.DatabaseConnection;
import com.qa.inventoryms.dao.ItemsDAO;
import com.qa.inventoryms.models.ItemModel;
import com.qa.inventoryms.utils.ScannerUtils;

public class ItemSubMenu {
	
private DatabaseConnection databaseConnection;
	
	public ItemSubMenu(DatabaseConnection databaseConnection) {
		this.databaseConnection = databaseConnection;
	}

public void itemMenu() {
		
		System.out.println("Welcome to ITEMS."
				+ "\nWhich of the following would you like to do?"
				+ "\n1. INSERT 2.VIEW ALL 3.UPDATE 4.DELETE");
		String response = ScannerUtils.scanner.nextLine().toUpperCase();
		
		
			switch(response) {
			case "INSERT":
				ItemsDAO itemsDao = new ItemsDAO(databaseConnection);
				System.out.println("Please enter name of item: ");
				String itemName = ScannerUtils.scanner.nextLine();
				System.out.println("Please enter price of item (e.g 2.00, 120.75): ");
				float itemPrice = ScannerUtils.scanner.nextFloat();
				ItemModel item = new ItemModel(itemName, itemPrice);
				itemsDao.insertItem(item);
				break;
			case "UPDATE":
				ItemsDAO itemDaoUpdate = new ItemsDAO(databaseConnection);
				System.out.println("Please enter the item name: ");
				String oldItemName = ScannerUtils.scanner.nextLine();
				System.out.println("Please enter the new item price: ");
				float newPrice = ScannerUtils.scanner.nextFloat();
				ItemModel itemUpt = new ItemModel(oldItemName);
				itemDaoUpdate.updateItem(itemUpt, newPrice);;
				break;
			case "DELETE":
				ItemsDAO itemDaoDelete = new ItemsDAO(databaseConnection);
				System.out.println("What is the name of the item you want to delete? ");
				String itemToDel = ScannerUtils.scanner.nextLine();
				ItemModel itemDel = new ItemModel(itemToDel);
				itemDaoDelete.deleteItem(itemDel);
				break;
			case "VIEW ALL":
				ItemsDAO itemReadAll = new ItemsDAO(databaseConnection);
				itemReadAll.readAllItems();
				break;
			default:
				break;
		}
	
		
		}
}
