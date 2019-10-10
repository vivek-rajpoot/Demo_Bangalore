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
public class PlanningTemp implements Serializable {
	private String userName;
	private String stateName;
	private String assetType;
	//private String no_go_filter;
	private String scr;
	//private String popStrata[];
	private String popStrata;
	private String size1;
	private String size2;
	private String costPerAsset;
	private String targetSaturation	;
	private String noGoFilter;
	private String actualDistircts;
	private String plannedDistircts;
	private String actualVillages;
	private String plannedVillages;
	private String actualHH;
	private String plannedHH;
	private String incremental_reach	;
	private String cost;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getAssetType() {
		return assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}
	/*public String getNo_go_filter() {
		return no_go_filter;
	}
	public void setNo_go_filter(String no_go_filter) {
		this.no_go_filter = no_go_filter;
	}*/
	public String getScr() {
		return scr;
	}
	public void setScr(String scr) {
		this.scr = scr;
	}
	public String getPopStrata() {
		return popStrata;
	}
	public void setPopStrata(String popStrata) {
		this.popStrata = popStrata;
	}
	public String getSize1() {
		return size1;
	}
	public void setSize1(String size1) {
		this.size1 = size1;
	}
	public String getSize2() {
		return size2;
	}
	public void setSize2(String size2) {
		this.size2 = size2;
	}
	public String getCostPerAsset() {
		return costPerAsset;
	}
	public void setCostPerAsset(String costPerAsset) {
		this.costPerAsset = costPerAsset;
	}
	public String getTargetSaturation() {
		return targetSaturation;
	}
	public void setTargetSaturation(String targetSaturation) {
		this.targetSaturation = targetSaturation;
	}
	public String getNoGoFilter() {
		return noGoFilter;
	}
	public void setNoGoFilter(String noGoFilter) {
		this.noGoFilter = noGoFilter;
	}
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
	public String getIncremental_reach() {
		return incremental_reach;
	}
	public void setIncremental_reach(String incremental_reach) {
		this.incremental_reach = incremental_reach;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	
	
}
