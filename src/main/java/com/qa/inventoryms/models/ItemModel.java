package com.qa.inventoryms.models;

public class ItemModel {
	
	private int itemID = 0; 
	private String itemName; 
	private float itemPrice;
	
	public ItemModel(int itemID, String itemName, float itemPrice) {
		this.itemID = itemID;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	

	public ItemModel(String itemName, float itemPrice) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	

	public ItemModel(String itemName) {
		this.itemName = itemName;
	}


	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	
	
	
}
