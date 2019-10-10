/*
*StockUsers.java
*Created By		:Bhagya Lakshmi Mula
*Created Date	:Jul 4, 2018
*/
package com.rural.model;

import java.io.Serializable;

public class StockUsers implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	
	private String userName;
	
	private String item_description;
	

	private int noofUnits;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getItem_description() {
		return item_description;
	}


	public void setItem_description(String item_description) {
		this.item_description = item_description;
	}


	public int getNoofUnits() {
		return noofUnits;
	}


	public void setNoofUnits(int noofUnits) {
		this.noofUnits = noofUnits;
	}



}
