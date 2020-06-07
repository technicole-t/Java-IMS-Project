package com.qa.inventoryms.models;

public class CustomerModel {
	
	private int customer_id = 0; 
	private String customer_name;
	private String customer_email;
	
	public CustomerModel(String customer_name, String customer_email, int customer_id) {
		super();
		
		this.customer_id = customer_id; 
		this.customer_name = customer_name; 
		this.customer_email = customer_email;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getCustomer_email() {
		return customer_email;
	}

	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}
	

}
