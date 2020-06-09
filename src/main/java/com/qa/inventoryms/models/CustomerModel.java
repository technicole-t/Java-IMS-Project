package com.qa.inventoryms.models;

public class CustomerModel {
	
	private int customerID = 0; 
	private String customerName;
	private String customerEmail;
	
	public CustomerModel(int customerID, String customerName, String customerEmail) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
	}

	public CustomerModel(String customerName, String customerEmail) {
		super();
		this.customerName = customerName;
		this.customerEmail = customerEmail;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
}
