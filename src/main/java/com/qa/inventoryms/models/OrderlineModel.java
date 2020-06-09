package com.qa.inventoryms.models;

public class OrderlineModel {
	
	private int orderlineID = 0; 
	private int fkOrderID; 
	private int fkItemID;
	
	public OrderlineModel(int orderlineID, int fkOrderID, int fkItemID) {
		super();
		this.orderlineID = orderlineID;
		this.fkOrderID = fkOrderID;
		this.fkItemID = fkItemID;
	}

	public int getOrderlineID() {
		return orderlineID;
	}

	public void setOrderlineID(int orderlineID) {
		this.orderlineID = orderlineID;
	}

	public int getFkOrderID() {
		return fkOrderID;
	}

	public void setFkOrderID(int fkOrderID) {
		this.fkOrderID = fkOrderID;
	}

	public int getFkItemID() {
		return fkItemID;
	}

	public void setFkItemID(int fkItemID) {
		this.fkItemID = fkItemID;
	}
	
	
}
