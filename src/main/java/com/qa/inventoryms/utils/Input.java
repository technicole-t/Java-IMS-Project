package com.qa.inventoryms.utils;

import java.util.Scanner;

public class Input {
	
	Scanner scanner = new Scanner(System.in);
	
	public String getInput() {
		return scanner.nextLine();
	}
	
	public String getString() {
		return scanner.nextLine();
	}

}
