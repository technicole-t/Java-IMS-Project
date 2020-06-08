package com.qa.inventoryms.connect;

import java.sql.SQLException;

// IMPORT LOGGERS 

public class Runner {
	
	// PUT LOGGER HERE
	
	public static void main(String[] args) throws SQLException {
		
		IMS ims = new IMS();
		ims.start();
	}

}
