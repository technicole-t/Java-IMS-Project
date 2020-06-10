package com.qa.inventoryms;

import org.apache.log4j.Logger;

import com.qa.inventoryms.dao.RemoteConnection;
import com.qa.inventoryms.utils.ScannerUtils;

public class Runner {
	
	public static final Logger LOGGER = Logger.getLogger(Runner.class);
	
	public static void main(String[] args) {
		
		LOGGER.info("Please enter database username");
		String uName = ScannerUtils.scanner.nextLine();
		
		LOGGER.info("Please enter database password");
		String pWord = ScannerUtils.scanner.nextLine();
		
		IMS ims = new IMS(new RemoteConnection(uName,pWord));
		ims.start();
	}
}
