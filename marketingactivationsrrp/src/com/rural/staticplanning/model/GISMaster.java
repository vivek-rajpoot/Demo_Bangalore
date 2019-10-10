/*
*GISMaster.java
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
@Table(name="GIS_Master")
@SuppressWarnings("serial")
public class GISMaster implements Serializable {
	@Id
	@Column(name="id")
	private int Id;
	
	@Column(name="GIS_CODE")//this name came from back-end
	private String gisCode;//this name should be same as jsp name
	
	@Column(name="DeployedInLast6Months")
	private String deployedInLast6Months;
	
	@Column(name="DeployedInLast12Months")
	private String deployedInLast12Months;
	
	@Column(name="WP")
	private int wp;
	
	@Column(name="DB")
	private int db;
	
	@Column(name="DWP")
	private int dwp;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getGisCode() {
		return gisCode;
	}

	public void setGisCode(String gisCode) {
		this.gisCode = gisCode;
	}

	public String getDeployedInLast6Months() {
		return deployedInLast6Months;
	}

	public void setDeployedInLast6Months(String deployedInLast6Months) {
		this.deployedInLast6Months = deployedInLast6Months;
	}

	public String getDeployedInLast12Months() {
		return deployedInLast12Months;
	}

	public void setDeployedInLast12Months(String deployedInLast12Months) {
		this.deployedInLast12Months = deployedInLast12Months;
	}

	public int getWp() {
		return wp;
	}

	public void setWp(int wp) {
		this.wp = wp;
	}

	public int getDb() {
		return db;
	}

	public void setDb(int db) {
		this.db = db;
	}

	public int getDwp() {
		return dwp;
	}

	public void setDwp(int dwp) {
		this.dwp = dwp;
	}
	

}
