package com.qa.inventoryms.dao;

import org.apache.log4j.Logger;

import com.qa.inventoryms.models.CustomerModel;
import com.qa.inventoryms.models.OrderModel;

public class OrdersDAO {
	
public static final Logger LOGGER = Logger.getLogger(CustomerDAO.class);
	
	private DatabaseConnection databaseConnection;

	public OrdersDAO(DatabaseConnection databaseConnection) {
		this.databaseConnection = databaseConnection;
	}

	public void addOrder(OrderModel addOrderCust, CustomerModel customers) {
		int customerID = addOrderCust.getFkCustomerID();
		int custID = customers.getCustomerID();
		String sqlAddOrder = "INSERT INTO orders(fk_customer_id) VALUES ((SELECT " + custID + " FROM customers) WHERE customer_id = " + customerID +")";
		databaseConnection.sendUpdate(sqlAddOrder);
	}
	
}
