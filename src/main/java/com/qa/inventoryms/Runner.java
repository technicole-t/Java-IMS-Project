package com.qa.inventoryms;

import java.sql.SQLException;

public class Runner {
	
	
	public static void main(String[] args) throws SQLException {
		
		IMS ims = new IMS();
		ims.start();
	}
}
