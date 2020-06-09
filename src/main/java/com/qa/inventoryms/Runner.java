package com.qa.inventoryms;

import com.qa.inventoryms.dao.RemoteConnection;
import com.qa.inventoryms.utils.ScannerUtils;

public class Runner {
	
	
	public static void main(String[] args) {
		System.out.println("Please enter database username");
		String uName = ScannerUtils.scanner.nextLine();
		System.out.println("Please enter database password");
		String pWord = ScannerUtils.scanner.nextLine();
		IMS ims = new IMS(new RemoteConnection(uName,pWord));
		ims.start();
	}
}
