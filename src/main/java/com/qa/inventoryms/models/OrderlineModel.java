package com.qa.inventoryms.models;

public class OrderlineModel {
	
	private int orderline_id = 0; 
	private int fk_order_id; 
	private int fk_item_id;
	
	
	public OrderlineModel(int orderline_id, int fk_order_id, int fk_item_id) {
		super();
		this.orderline_id = orderline_id;
		this.fk_order_id = fk_order_id;
		this.fk_item_id = fk_item_id;
	}

	public int getOrderline_id() {
		return orderline_id;
	}


	public void setOrderline_id(int orderline_id) {
		this.orderline_id = orderline_id;
	}


	public int getFk_order_id() {
		return fk_order_id;
	}


	public void setFk_order_id(int fk_order_id) {
		this.fk_order_id = fk_order_id;
	}


	public int getFk_item_id() {
		return fk_item_id;
	}


	public void setFk_item_id(int fk_item_id) {
		this.fk_item_id = fk_item_id;
	} 
	
	
	

}
