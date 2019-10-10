/*
*FinanceService.java
*Created By		:Bhagya Lakshmi Mula
*Created Date	:Jul 4, 2018
*/
package com.rural.service;

import java.util.List;
import java.util.Map;

import com.rural.model.AgencyMaster;
import com.rural.model.DOMaster;
import com.rural.model.DOMasterTemp;
import com.rural.model.FinanceDOBalance;
import com.rural.model.FinanceDOMapping;
import com.rural.model.FinanceMaster;
import com.rural.model.StatusMaster;

public interface FinanceService {

	List<AgencyMaster> getAgencyList();

	int createFinRequest(FinanceMaster financeMaster, String userRole,String path,String fileName);

	List<FinanceMaster> getMyAssignedRequests(String username,String userRole);

	List<FinanceMaster> getAllRequests(String username, String userRole);

	FinanceMaster getRequestDetailsFinance(FinanceMaster financeMaster);

	int updateFinRequest(int intFinId, int statusId, String strRemarks,
			String userRole, String strPath, String strFileName);

	Map<String, String> getStatusMap(int intFinId, String userRole, String strModule);

	List<DOMaster> getDOList(String strAgencyName);

	int updateFinRequest(int finId, int statusId, String strRemarks,
			String userRole, String strPath, String strFileName,String totalAmount,
			List<FinanceDOMapping> finDOMapping);

	List<DOMasterTemp> insertIntoDoTemp(List<DOMasterTemp> doList);

	List<FinanceDOMapping> getDOMapping(int finId);

	List<DOMaster> getDOList(Integer userId, String userRole);

	List<FinanceDOBalance> getFinanceDetailsByDO(String doNumber);

	DOMaster getDODetails(String doNumber);


	}
