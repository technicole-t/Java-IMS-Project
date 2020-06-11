package com.qa.inventoryms.models;

public class OrderModel {
	
	private int orderID = 0; 
	private int fkCustomerID;
	
	public OrderModel(int orderID, int fkCustomerID) {
		this.orderID = orderID;
		this.fkCustomerID = fkCustomerID;
	}
	
	public OrderModel(int fkCustomerID) {
		this.fkCustomerID = fkCustomerID;
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
	
}
