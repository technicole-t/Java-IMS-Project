package com.qa.inventoryms.dao;

import java.sql.ResultSet;

public interface Queryable {
	
	public ResultSet sendQuery(String sql);
	
	public void sendUpdate(String sql);

}
