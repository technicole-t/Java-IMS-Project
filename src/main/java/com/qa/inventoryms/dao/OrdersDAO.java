package com.qa.inventoryms.dao;

import java.util.Date;

import org.apache.log4j.Logger;

import com.qa.inventoryms.models.OrderModel;

public class OrdersDAO {
	
public static final Logger LOGGER = Logger.getLogger(CustomerDAO.class);
	
	private DatabaseConnection databaseConnection;

	public OrdersDAO(DatabaseConnection databaseConnection) {
		this.databaseConnection = databaseConnection;
	}

	public void addOrder(OrderModel addOrderCust) {
		int customerID = addOrderCust.getFkCustomerID();
		String dateOrdered = addOrderCust.getDateOrdered();
		String sqlAddOrder = "INSERT INTO orders(fk_customer_id, date_ordered) VALUES "
				+ "('" + customerID + "' , '" + dateOrdered + "')";
		databaseConnection.sendUpdate(sqlAddOrder);
	}
	
	// public void seeAllOrders() {
		
	// }
	
	// public void addItemToExistingOrder() {
		
	// }

	// public void deleteAnOrder() {
		
	// }
	
	// public void getCostOfAnOrder() {
		
	// }
	
	// public void deleteAnItemFromAnOrder() {
		
	// }

}
