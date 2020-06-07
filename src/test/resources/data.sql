/* HARD CODED CRUD STATEMENTS */

/* create customer */
INSERT INTO inventorydb.customers(customer_name, customer_email) VALUES ('Bob Smith', 'bobsmith@gmail.com');
INSERT INTO inventorydb.customers(customer_name, customer_email) VALUES ('Jane Doe', 'janedoe@gmail.com');
INSERT INTO inventorydb.customers(customer_name, customer_email) VALUES ('William Thomas', 'willtomo@yahoo.com');

/* read customer */
SELECT * FROM customers; 

/* update customer */
UPDATE customers SET customer_name = 'Bobby Smithson' WHERE customer_id = 1;

/* delete customer */
DELETE FROM customers WHERE customer_id = 2; 


/* ------------------------------------------------------------------- */

/* create item */
INSERT INTO inventorydb.items(item_name, item_price) VALUES ('graphics tablet', 129.99);
INSERT INTO inventorydb.items(item_name, item_price) VALUES ('iphone 11', 1200.00);
INSERT INTO inventorydb.items(item_name, item_price) VALUES ('super blender PRO', 170.50);

/* read items */
SELECT * FROM items; 

/* update item */
UPDATE items SET item_price = 169.99 WHERE item_name = 'super blender PRO';

/* delete item */
DELETE FROM items WHERE item_name = 'iphone 11';

/* ------------------------------------------------------------------- */

/* create order */
INSERT INTO inventorydb.orders(fk_customer_id, date_ordered) VALUES ((SELECT customer_id FROM customers WHERE customer_id = 1), '2020-05-28');
INSERT INTO inventorydb.orders(fk_customer_id, date_ordered) VALUES ((SELECT customer_id FROM customers WHERE customer_id = 2), '2020-05-26');
INSERT INTO inventorydb.orders(fk_customer_id, date_ordered) VALUES ((SELECT customer_id FROM customers WHERE customer_id = 3), '2020-05-20');
/* read orders */
SELECT * FROM orders; 

/* delete item */
DELETE FROM orders WHERE order_id = 3; 

/* ------------------------------------------------------------------- */

/* add item to orderline */
INSERT INTO inventorydb.orderline(fk_order_id, fk_item_id) VALUES ((SELECT order_id FROM orders WHERE order_id = 1),(SELECT item_id FROM items WHERE item_id = 1));
INSERT INTO inventorydb.orderline(fk_order_id, fk_item_id) VALUES ((SELECT order_id FROM orders WHERE order_id = 1),(SELECT item_id FROM items WHERE item_id = 2));
INSERT INTO inventorydb.orderline(fk_order_id, fk_item_id) VALUES ((SELECT order_id FROM orders WHERE order_id = 1),(SELECT item_id FROM items WHERE item_id = 3));
INSERT INTO inventorydb.orderline(fk_order_id, fk_item_id) VALUES ((SELECT order_id FROM orders WHERE order_id = 2),(SELECT item_id FROM items WHERE item_id = 3));
INSERT INTO inventorydb.orderline(fk_order_id, fk_item_id) VALUES ((SELECT order_id FROM orders WHERE order_id = 3),(SELECT item_id FROM items WHERE item_id = 3));

/* calculate cost of an order */


/* delete item in an order */