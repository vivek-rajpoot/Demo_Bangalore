/*
*AssetMaster.java
*Created By		:Bhagya Lakshmi Mula
*Created Date	:Sep 10, 2018
*/
package com.rural.staticplanning.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Asset_Master")
@SuppressWarnings("serial")
public class AssetMaster implements Serializable {
	
	@Id
	@Column(name="Asset_Type")//this name came from back-end
	private String assetType;//this name should be same as jsp name
	
	@Column(name="size")
	private int size;
	
	@Column(name="cost_per_unit")
	private String cost_per_unit;

	public String getAssetType() {
		return assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getCost_per_unit() {
		return cost_per_unit;
	}

	public void setCost_per_unit(String cost_per_unit) {
		this.cost_per_unit = cost_per_unit;
	}
	
	
	
}
