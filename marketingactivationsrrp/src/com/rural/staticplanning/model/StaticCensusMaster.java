/*
*StaticCensusMaster.java
*Created By		:Bhagya Lakshmi Mula
*Created Date	:Sep 10, 2018
*/
package com.rural.staticplanning.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "static_census_master")
@SuppressWarnings("serial")
public class StaticCensusMaster implements Serializable  {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "censusMaster_id")
	private int censusMaster_id;
	
	@Column(name = "STATE_CODE",length=255)
	private String stateCode;
	
	@Column(name = "STATE_NAME",length=255)
	private String stateName;
	
	@Column(name = "DISTRICT_CODE",length=255)
	private String districtCode;
	
	@Column(name = "DISTRICT_NAME",length=255)
	private String districtName;
	
	@Column(name = "TEHSIL_CODE",length=255)
	private String tehsilCode;
	
	@Column(name = "TEHSIL_NAME",length=255)
	private String tehsilName;
	
	@Column(name = "SCR",length=255)
	private String scr;
	
	@Column(name = "VILLAGE_CODE",length=255)
	private String villageCode;
	
	@Column(name = "VILLAGE_NAME",length=255)
	private String villageName;
	
	@Column(name = "GIS_CODE",length=255)
	private String gisCode;
	
	@Column(name = "tot_pop",length=255)
	private String tot_pop;
	
	@Column(name = "No_HH",length=255)
	private String noHH;
	
	@Column(name = "TV",length=255)
	private String tv;
	
	@Column(name = "POP_STRATA",length=255)
	private String popStrata;

	public int getCensusMaster_id() {
		return censusMaster_id;
	}

	public void setCensusMaster_id(int censusMaster_id) {
		this.censusMaster_id = censusMaster_id;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getTehsilCode() {
		return tehsilCode;
	}

	public void setTehsilCode(String tehsilCode) {
		this.tehsilCode = tehsilCode;
	}

	public String getTehsilName() {
		return tehsilName;
	}

	public void setTehsilName(String tehsilName) {
		this.tehsilName = tehsilName;
	}

	public String getScr() {
		return scr;
	}

	public void setScr(String scr) {
		this.scr = scr;
	}

	public String getVillageCode() {
		return villageCode;
	}

	public void setVillageCode(String villageCode) {
		this.villageCode = villageCode;
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public String getGisCode() {
		return gisCode;
	}

	public void setGisCode(String gisCode) {
		this.gisCode = gisCode;
	}

	public String getTot_pop() {
		return tot_pop;
	}

	public void setTot_pop(String tot_pop) {
		this.tot_pop = tot_pop;
	}

	public String getNoHH() {
		return noHH;
	}

	public void setNoHH(String noHH) {
		this.noHH = noHH;
	}

	public String getTv() {
		return tv;
	}

	public void setTv(String tv) {
		this.tv = tv;
	}

	public String getPopStrata() {
		return popStrata;
	}

	public void setPopStrata(String popStrata) {
		this.popStrata = popStrata;
	}
	
}
