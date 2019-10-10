/*
*PlanningServiceImpl.java
*Created By		:Bhagya Lakshmi Mula
*Created Date	:Sep 11, 2018
*/
package com.rural.staticplanning.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rural.dao.PrePlanningDAO;
import com.rural.staticplanning.dao.PlanningDAO;
import com.rural.staticplanning.model.PlanningMaster;
import com.rural.staticplanning.model.PlanningSummary;
import com.rural.staticplanning.model.PlanningTemp;

@Component
@Service
public class PlanningServiceImpl implements PlanningService{

	@Autowired
	PlanningDAO planningDAO;
	
	@Override
	public List<Integer> getSizeForAssetType(String strAssetType) {
		return planningDAO.getSizeForAssetType(strAssetType);
	}

	@Override
	public String getAssetCost(String strAssetType, Integer intSize) {
		return planningDAO.getAssetCost(strAssetType,intSize);
	}

	@Override
	public Map<String, String> getStateMap() {
		return planningDAO.getStateMap();
	}

	@Override
	public List<String> getSCRList(String strState) {
		return planningDAO.getSCRList(strState);
	}

	@Override
	public List<String> getPopStata(String strState, String strScr) {
		return planningDAO.getPopStata(strState,strScr);
	}

	@Override
	public List<PlanningMaster> createPlan(PlanningTemp planningData) {
		return planningDAO.createPlan(planningData);
	}

	@Override
	public PlanningSummary getSummaryData(PlanningTemp planningData) {
		return planningDAO.getSummaryData(planningData);
	}

}
