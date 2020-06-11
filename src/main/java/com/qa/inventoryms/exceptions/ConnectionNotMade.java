package com.qa.inventoryms.exceptions;

public class ConnectionNotMade extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	private String message;

	public ConnectionNotMade(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}

}
