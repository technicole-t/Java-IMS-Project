package com.qa.inventoryms.services;

import org.apache.log4j.Logger;

import com.qa.inventoryms.dao.CustomerDAO;
import com.qa.inventoryms.dao.DatabaseConnection;
import com.qa.inventoryms.models.CustomerModel;
import com.qa.inventoryms.utils.MenuStarter;
import com.qa.inventoryms.utils.ScannerUtils;

public class CustomerSubMenu  {
	
	public static final Logger LOGGER = Logger.getLogger(CustomerSubMenu.class);
	
	MenuStarter starter = new MenuStarter();
	
	private DatabaseConnection databaseConnection;
	public CustomerSubMenu(DatabaseConnection databaseConnection) {
		this.databaseConnection = databaseConnection;
	}

	public void menu() {
		
		LOGGER.info("Welcome to CUSTOMERS."
				+ "\nWhich of the following would you like to do?"
				+ "\n1.INSERT \n2.READ ALL \n3.UPDATE \n4.DELETE \n5.EXIT");
		String response = ScannerUtils.scanner.nextLine().toUpperCase();
		
			switch(response) {
			case "INSERT":
				CustomerDAO customerDao = new CustomerDAO(databaseConnection);
				LOGGER.info("Please enter customer name: ");
				String customerName = ScannerUtils.scanner.nextLine();
				LOGGER.info("Please enter customer email: ");
				String customerEmail = ScannerUtils.scanner.nextLine();
				CustomerModel customer = new CustomerModel(customerName, customerEmail);
				customerDao.insertCustomer(customer);
				break;
			case "UPDATE":
				CustomerDAO customerDaoUpdate = new CustomerDAO(databaseConnection);
				LOGGER.info("Please enter the old email: ");
				String customerEmail1 = ScannerUtils.scanner.nextLine();
				LOGGER.info("Please enter the new email: ");
				String newEmail = ScannerUtils.scanner.nextLine();
				CustomerModel customerUpdt = new CustomerModel(customerEmail1);
				customerDaoUpdate.updateCustomer(customerUpdt, newEmail);
				break;
			case "DELETE":
				CustomerDAO customerDaoDelete = new CustomerDAO(databaseConnection);
				LOGGER.info("What is the email address of the customer you want to delete? ");
				String customerToDel = ScannerUtils.scanner.nextLine();
				CustomerModel customerDel = new CustomerModel(customerToDel);
				customerDaoDelete.deleteCustomer(customerDel);
				break;
			case "READ ALL":
				CustomerDAO customerReadAll = new CustomerDAO(databaseConnection);
				customerReadAll.readAllCustomers();
				break;
			case "EXIT":
				LOGGER.info("Goodbye" + MenuStarter.getUsername() + " Thank you for using this IMS.");
				System.exit(0);
			default:
				break;
			}
		}
	}
	
