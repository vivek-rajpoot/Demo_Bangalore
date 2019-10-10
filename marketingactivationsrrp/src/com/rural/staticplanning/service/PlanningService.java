/*
*PlanningService.java
*Created By		:Bhagya Lakshmi Mula
*Created Date	:Sep 11, 2018
*/
package com.rural.staticplanning.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rural.staticplanning.model.PlanningMaster;
import com.rural.staticplanning.model.PlanningSummary;
import com.rural.staticplanning.model.PlanningTemp;

@Component
@Service
public interface PlanningService {

	List<Integer> getSizeForAssetType(String strAssetType);

	String getAssetCost(String strAssetType, Integer intSize);

	Map<String, String> getStateMap();

	List<String> getSCRList(String strState);

	List<String> getPopStata(String strState, String strScr);

	List<PlanningMaster> createPlan(PlanningTemp planningMaster);

	PlanningSummary getSummaryData(PlanningTemp planningData);
	}
