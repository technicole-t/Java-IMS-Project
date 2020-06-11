package com.qa.inventoryms.exceptions;

public class SQLStatementException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	private String message;

	public SQLStatementException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
