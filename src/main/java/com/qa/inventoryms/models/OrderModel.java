package com.qa.inventoryms.models;

public class OrderModel {
	
	private int orderID = 0; 
	private int fkCustomerID;
	private int dateOrdered;
	
	public OrderModel(int orderID, int fkCustomerID, int dateOrdered) {
		super();
		this.orderID = orderID;
		this.fkCustomerID = fkCustomerID;
		this.dateOrdered = dateOrdered;
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

	public int getDateOrdered() {
		return dateOrdered;
	}

	public void setDateOrdered(int dateOrdered) {
		this.dateOrdered = dateOrdered;
	}
	
	
	
	
}
