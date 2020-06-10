package com.qa.inventoryms.models;

public class OrderModel {
	
	private int orderID = 0; 
	private int fkCustomerID;
	private String dateOrdered;
	
	public OrderModel(int orderID, int fkCustomerID, String dateOrdered) {
		this.orderID = orderID;
		this.fkCustomerID = fkCustomerID;
		this.dateOrdered = dateOrdered;
	}
	
	public OrderModel(int fkCustomerID, String dateOfOrder) {
		this.fkCustomerID = fkCustomerID;
		this.dateOrdered = dateOfOrder;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public int getFkCustomerID() {
		return fkCustomerID;
	}

	public void setFkCustomerID(int fkCustomerID) {
		this.fkCustomerID = fkCustomerID;
	}

	public String getDateOrdered() {
		return dateOrdered;
	}

	public void setDateOrdered(String dateOrdered) {
		this.dateOrdered = dateOrdered;
	}
	
	
	
	
}
