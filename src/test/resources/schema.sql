DROP DATABASE IF EXISTS inventorydb; 
CREATE DATABASE inventorydb; 
USE inventorydb; 

CREATE TABLE customers (
	customer_id INT NOT NULL AUTO_INCREMENT,
    customer_name VARCHAR(45) NOT NULL, 
    customer_email VARCHAR(45) NOT NULL, 
    PRIMARY KEY (customer_id));

CREATE TABLE items (
	item_id INT NOT NULL AUTO_INCREMENT, 
    item_name VARCHAR(30) NOT NULL,
    item_price FLOAT(7,2) NOT NULL, 
    PRIMARY KEY (item_id));
    
CREATE TABLE orders (
	order_id INT NOT NULL AUTO_INCREMENT,
    fk_customer_id INT,
    date_ordered DATE NOT NULL, 
    PRIMARY KEY(order_id),
    FOREIGN KEY (fk_customer_id) REFERENCES customers(customer_id));

CREATE TABLE orderline (
	orderline_id INT NOT NULL AUTO_INCREMENT, 
    fk_order_id INT NOT NULL, 
    fk_item_id INT NOT NULL, 
    PRIMARY KEY (orderline_id), 
    FOREIGN KEY (fk_order_id) REFERENCES orders(order_id),
    FOREIGN KEY (fk_item_id) REFERENCES items(item_id));
    
