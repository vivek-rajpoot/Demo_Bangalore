/*
*AssetMaster.java
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
@Table(name="static_palnning_temp")
@SuppressWarnings("serial")
public class PlanningMaster implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "plan_id")
	private int planId;
	
	@Column(name = "user_ID")
	private String userID;
	
	@Column(name = "plan_name")
	private String planName;
	
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
	
	@Column(name = "DeployedInLast6Months")
	private String isDeployedInLast6Months;
	
	@Column(name = "DeployedInLast12Months")
	private String isDeployedInLast12Months;
	
	@Column(name = "No_HH")
	private String noHH;
	
	@Column(name = "TV")
	private String tv;
	
	@Column(name = "WP")
	private String wP;
	
	@Column(name = "DB")
	private String dB;

	@Column(name = "DWP")
	private String dWP;
	
	@Column(name = "Asset_type")
	private String assetType;
	
	@Column(name = "incremental_reach")
	private int incrementalReach;
	
	@Column(name = "l6m_total")
	private String mTotal;
	
	@Column(name = "plan")
	private int plan;
	
	@Column(name = "no_go_filter")
	private String no_go_filter;
	
	@Column(name = "inventory_filter")
	private int InventoryFilter;
	
	@Column(name = "target_asset")
	private String targetAsset;
	
	@Column(name = "cost")
	private String cost;
	
	@Column(name = "cost_per_incremental_reach")
	private String costPerIncrementalReach;
	
	@Column(name = "saturation")
	private String saturation;
	
	@Column(name = "tot_pop")
	private int totPop;
	
	@Column(name = "tot_hh")
	private int totHh;
	
	@Column(name = "contribution")
	private String contribution;
	
	@Column(name = "final_saturation")
	private String finalSaturation;
	
	@Column(name = "final_selection")
	private String finalSelection;
	
	@Column(name = "POP_STRATA",length=255)
	private String popStrata;
	
	/*private String size1;
	private String size2;
	private String costPerAsset;
	private String targetSaturation	;
	private String noGoFilter	;*/
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
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
	public String getIsDeployedInLast6Months() {
		return isDeployedInLast6Months;
	}
	public void setIsDeployedInLast6Months(String isDeployedInLast6Months) {
		this.isDeployedInLast6Months = isDeployedInLast6Months;
	}
	public String getIsDeployedInLast12Months() {
		return isDeployedInLast12Months;
	}
	public void setIsDeployedInLast12Months(String isDeployedInLast12Months) {
		this.isDeployedInLast12Months = isDeployedInLast12Months;
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
	public String getwP() {
		return wP;
	}
	public void setwP(String wP) {
		this.wP = wP;
	}
	public String getdB() {
		return dB;
	}
	public void setdB(String dB) {
		this.dB = dB;
	}
	public String getdWP() {
		return dWP;
	}
	public void setdWP(String dWP) {
		this.dWP = dWP;
	}
	public String getAssetType() {
		return assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}
	public int getIncrementalReach() {
		return incrementalReach;
	}
	public void setIncrementalReach(int incrementalReach) {
		this.incrementalReach = incrementalReach;
	}
	public String getmTotal() {
		return mTotal;
	}
	public void setmTotal(String mTotal) {
		this.mTotal = mTotal;
	}
	public int getPlan() {
		return plan;
	}
	public void setPlan(int plan) {
		this.plan = plan;
	}
	public String getNo_go_filter() {
		return no_go_filter;
	}
	public void setNo_go_filter(String no_go_filter) {
		this.no_go_filter = no_go_filter;
	}
	public int getInventoryFilter() {
		return InventoryFilter;
	}
	public void setInventoryFilter(int inventoryFilter) {
		InventoryFilter = inventoryFilter;
	}
	public String getTargetAsset() {
		return targetAsset;
	}
	public void setTargetAsset(String targetAsset) {
		this.targetAsset = targetAsset;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getCostPerIncrementalReach() {
		return costPerIncrementalReach;
	}
	public void setCostPerIncrementalReach(String costPerIncrementalReach) {
		this.costPerIncrementalReach = costPerIncrementalReach;
	}
	public String getSaturation() {
		return saturation;
	}
	public void setSaturation(String saturation) {
		this.saturation = saturation;
	}
	public int getTotPop() {
		return totPop;
	}
	public void setTotPop(int totPop) {
		this.totPop = totPop;
	}
	public int getTotHh() {
		return totHh;
	}
	public void setTotHh(int totHh) {
		this.totHh = totHh;
	}
	public String getContribution() {
		return contribution;
	}
	public void setContribution(String contribution) {
		this.contribution = contribution;
	}
	public String getFinalSaturation() {
		return finalSaturation;
	}
	public void setFinalSaturation(String finalSaturation) {
		this.finalSaturation = finalSaturation;
	}
	public String getFinalSelection() {
		return finalSelection;
	}
	public void setFinalSelection(String finalSelection) {
		this.finalSelection = finalSelection;
	}
	public String getPopStrata() {
		return popStrata;
	}
	public void setPopStrata(String popStrata) {
		this.popStrata = popStrata;
	}
	/*public String getSize1() {
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
	}*/

}
