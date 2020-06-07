package com.qa.inventoryms.models;

public class OrderModel {
	
	private int order_id = 0; 
	private int fk_customer_id;
	private int date_ordered;
	
	public OrderModel(int order_id, int fk_customer_id, int date_ordered) {
		super();
		this.order_id = order_id;
		this.fk_customer_id = fk_customer_id;
		this.date_ordered = date_ordered;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getFk_customer_id() {
		return fk_customer_id;
	}

	public void setFk_customer_id(int fk_customer_id) {
		this.fk_customer_id = fk_customer_id;
	}

	public int getDate_ordered() {
		return date_ordered;
	}

	public void setDate_ordered(int date_ordered) {
		this.date_ordered = date_ordered;
	}

}
