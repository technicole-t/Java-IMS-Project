package com.qa.inventoryms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.qa.inventoryms.models.ItemModel;

public class ItemsDAO {
	
	public static final Logger LOGGER = Logger.getLogger(ItemsDAO.class);
	
	private DatabaseConnection databaseConnection;
	public ItemsDAO(DatabaseConnection databaseConnection) {
		this.databaseConnection = databaseConnection;
	}
	
	public void insertItem(ItemModel item) {
		String itemName = item.getItemName();
		float itemPrice = item.getItemPrice();
		String sqlItemInsert = "INSERT INTO items(item_name, item_price) values ('"
				+ itemName + "', '"+ itemPrice + "');";
		databaseConnection.sendUpdate(sqlItemInsert);
		LOGGER.info("Item has been successfully added to the database...");
}
	
	public void updateItem(ItemModel item, float newPrice) {
		String itemToChange = item.getItemName();
		float changedPrice = newPrice;
		String sqlItemUpdate = "UPDATE items SET item_price = ('" + changedPrice + "') WHERE item_name = '" + itemToChange +"';";
		databaseConnection.sendUpdate(sqlItemUpdate);
		LOGGER.info("Item price has successfully been updated...");
	}
	
	public void deleteItem(ItemModel item) {
		String itemToDel = item.getItemName();
		String sqlItemDelete = "DELETE from items WHERE item_name = '" + itemToDel +"';";
		databaseConnection.sendUpdate(sqlItemDelete);
		LOGGER.info("Item has successfully been deleted...");
	}
	
	public void readAllItems() {
		ResultSet resultSet = null;
		String itemName;
		float itemPrice;
		String sqlItemReadAll = "SELECT * FROM items";
		resultSet = databaseConnection.sendQuery(sqlItemReadAll);
		try {
			while (resultSet.next()) {
				itemName = resultSet.getString("item_name");
				itemPrice = resultSet.getFloat("item_price");
				LOGGER.info(itemName + " - " + itemPrice); 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}
