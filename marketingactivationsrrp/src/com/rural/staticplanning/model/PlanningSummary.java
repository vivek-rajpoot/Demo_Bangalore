/*
*AssetMaster.java
*Created By		:Bhagya Lakshmi Mula
*Created Date	:Sep 10, 2018
*/
package com.rural.staticplanning.model;

import java.io.Serializable;
import javax.persistence.Entity;

@Entity
@SuppressWarnings("serial")
public class PlanningSummary implements Serializable {
	private String actualDistircts;
	private String plannedDistircts;
	private String actualVillages;
	private String plannedVillages;
	private String actualHH;
	private String plannedHH;
	private String incrementalReach;
	private String staticImpression;
	private String cost;
	public String getActualDistircts() {
		return actualDistircts;
	}
	public void setActualDistircts(String actualDistircts) {
		this.actualDistircts = actualDistircts;
	}
	public String getPlannedDistircts() {
		return plannedDistircts;
	}
	public void setPlannedDistircts(String plannedDistircts) {
		this.plannedDistircts = plannedDistircts;
	}
	public String getActualVillages() {
		return actualVillages;
	}
	public void setActualVillages(String actualVillages) {
		this.actualVillages = actualVillages;
	}
	public String getPlannedVillages() {
		return plannedVillages;
	}
	public void setPlannedVillages(String plannedVillages) {
		this.plannedVillages = plannedVillages;
	}
	public String getActualHH() {
		return actualHH;
	}
	public void setActualHH(String actualHH) {
		this.actualHH = actualHH;
	}
	public String getPlannedHH() {
		return plannedHH;
	}
	public void setPlannedHH(String plannedHH) {
		this.plannedHH = plannedHH;
	}
	
	public String getIncrementalReach() {
		return incrementalReach;
	}
	public void setIncrementalReach(String incrementalReach) {
		this.incrementalReach = incrementalReach;
	}
	
	public String getStaticImpression() {
		return staticImpression;
	}
	public void setStaticImpression(String staticImpression) {
		this.staticImpression = staticImpression;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	
}
