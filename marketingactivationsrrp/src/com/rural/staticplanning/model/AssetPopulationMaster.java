/*
*AssetPopulationMaster.java
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
@Table(name="Asset_Population_Master")
@SuppressWarnings("serial")
public class AssetPopulationMaster implements Serializable {
	@Id
	@Column(name="id")
	private int Id;
	
	@Column(name="Population")//this name came from back-end
	private int population;//this name should be same as jsp name
	
	@Column(name="WP_No")
	private int wpNo;
	
	@Column(name="No_of_DB")
	private int dbNo;
	
	@Column(name="No_of_DWP")
	private int dwpNo;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getWpNo() {
		return wpNo;
	}

	public void setWpNo(int wpNo) {
		this.wpNo = wpNo;
	}

	public int getDbNo() {
		return dbNo;
	}

	public void setDbNo(int dbNo) {
		this.dbNo = dbNo;
	}

	public int getDwpNo() {
		return dwpNo;
	}

	public void setDwpNo(int dwpNo) {
		this.dwpNo = dwpNo;
	}
}
