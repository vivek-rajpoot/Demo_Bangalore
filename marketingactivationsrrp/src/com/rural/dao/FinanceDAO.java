/*
*FinanceDAO.java
*Created By		:Bhagya Lakshmi Mula
*Created Date	:Jul 4, 2018
*/
package com.rural.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.rural.model.AgencyMaster;
import com.rural.model.BrandMaster;
import com.rural.model.CollateralMaster;
import com.rural.model.DOMaster;
import com.rural.model.DOMasterTemp;
import com.rural.model.DeliveryAndInventory;
import com.rural.model.DeliveryAndInventoryItems;
import com.rural.model.DeliveryAndInventoryTemp;
import com.rural.model.FinanceDOBalance;
import com.rural.model.FinanceDOMapping;
import com.rural.model.FinanceMaster;
import com.rural.model.StatusMaster;

@Repository
@Component
public interface FinanceDAO {

	List<AgencyMaster> getAgencyList();

	int createFinRequest(FinanceMaster financeMaster, String userRole,String strPath,String fileName);

	List<FinanceMaster> getMyAssignedRequests(String username,String userRole);

	List<FinanceMaster> getAllRequests(String username, String userRole);

	FinanceMaster getRequestDetailsFinance(FinanceMaster financeMaster);

/*	int updateFinRequest(FinanceMaster financeMaster,String userRole, String strPath, String fileName);
*/
	int updateFinRequest(int intFinId,int statusId, String strRemarks, String userRole,
			String path, String strFileName);

	Map<String, String> getStatusMap(int intFinId, String userRole,
			String strModule);

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
