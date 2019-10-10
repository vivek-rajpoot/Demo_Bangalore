/*
*WarehouseDAO.java
*Created By		:Bhagya Lakshmi Mula
*Created Date	:Apr 4, 2018
*/
package com.rural.webservice.dao;

import org.springframework.stereotype.Component;

import com.rural.model.UserMaster;
import com.rural.model.VendorWareHouseMaster;
import com.rural.webservice.dto.StatusMessages;
import com.rural.webservice.dto.WarehouseResponse;

@Component
public interface WarehouseDAO {

	WarehouseResponse getWarehouses(int userId);

	StatusMessages addWarehouse(VendorWareHouseMaster warehouse);
	StatusMessages updateWarehouse(VendorWareHouseMaster warehouse);

	UserMaster getVendorInto(String userId);

}
