/*
*VendorWarehouseService.java
*Created By		:Bhagya Lakshmi Mula
*Created Date	:Apr 4, 2018
*/
package com.rural.webservice.service;

import com.rural.model.UserMaster;
import com.rural.model.VendorWareHouseMaster;
import com.rural.webservice.dto.StatusMessages;
import com.rural.webservice.dto.WarehouseResponse;

public interface VendorWarehouseService {

	WarehouseResponse getWarehouses(int strUser);

	StatusMessages addWarehouse(VendorWareHouseMaster warehouse);
	StatusMessages updateWarehouse(VendorWareHouseMaster warehouse);

	UserMaster getVendorInto(String userId);

}
