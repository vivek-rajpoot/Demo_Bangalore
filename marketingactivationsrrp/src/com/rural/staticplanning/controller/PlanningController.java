/*
*PlanningController.java
*Created By		:Bhagya Lakshmi Mula
*Created Date	:Sep 11, 2018
*/
package com.rural.staticplanning.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.rural.exceptions.ERPException;
import com.rural.model.DeliveryAndInventory;
import com.rural.staticplanning.model.PlanningMaster;
import com.rural.staticplanning.model.PlanningSummary;
import com.rural.staticplanning.model.PlanningTemp;
import com.rural.staticplanning.service.PlanningService;
import com.rural.utility.CommonUtility;

@Controller
public class PlanningController {
	
	@Autowired
	PlanningService planningService;

	static Logger logger =Logger.getLogger(PlanningController.class);

	@RequestMapping("/planning")
	public ModelAndView createRoutePlan(HttpServletRequest req,
			HttpServletResponse resp, Model model) {
		ModelAndView mav = null;
		String statusMsg = null;
		Map<String,String> assetTypesMap=new HashMap<String, String>();
		Map<String,String> stateMap=new HashMap<String, String>();
		Map<String,String> noGoFilterMap=new HashMap<String, String>();
		HttpSession session=req.getSession();
		session.removeAttribute("assetMap");
		try {
			session.removeAttribute("assetMap");
			session.removeAttribute("stateMap");
			session.removeAttribute("noGoFilterMap");
			model.addAttribute("planningMaster", new PlanningTemp());
			mav = new ModelAndView("showPlanning");
			assetTypesMap=CommonUtility.getAssetMap();
			stateMap=planningService.getStateMap();
			noGoFilterMap=CommonUtility.getNoGoFilterMap();
			} catch (ERPException erp) {
			statusMsg = "Problem Occured. Please try Again";
		} catch (Exception e) {
			statusMsg = "Problem Occured. Please try Again";
		}
		session.setAttribute("assetMap", assetTypesMap);
		session.setAttribute("stateMap", stateMap);
		session.setAttribute("noGoFilterMap", noGoFilterMap);
		mav.addObject("statusMsg", statusMsg);
		return mav;
	}
	
	@RequestMapping(value = "/loadSizeForAssetType", method = RequestMethod.POST)
	public @ResponseBody List<Integer> getSizeForAssetType(@RequestParam("assetType") String strAssetType,ModelMap model) {
		logger.info("StockController :: rejectInvoice");
		List<Integer> sizeList=new ArrayList<Integer>();
		try {
			sizeList = planningService.getSizeForAssetType(strAssetType);
		}catch(ERPException erp) {
		}
		catch (Exception e) {
		} 
		return sizeList;
		}
	
	@RequestMapping(value = "/loadAssetCost", method = RequestMethod.POST)
	public @ResponseBody String getAssetCost(@RequestParam("assetType") String strAssetType,@RequestParam("size") Integer intSize,ModelMap model) {
		logger.info("StockController :: rejectInvoice");
		String cost=null;
		try {
			cost = planningService.getAssetCost(strAssetType,intSize);
		}catch(ERPException erp) {
		}
		catch (Exception e) {
		} 
		return cost;
		}
	
	@RequestMapping(value = "/loadSCRListForStatic", method = RequestMethod.POST)
	public @ResponseBody List<String> loadSCRListForStatic(@RequestParam("state") String strState,ModelMap model) {
		logger.info("StockController :: rejectInvoice");
		List<String> scrList=new ArrayList<String>();
		try {
			scrList = planningService.getSCRList(strState);
		}catch(ERPException erp) {
		}
		catch (Exception e) {
		} 
		return scrList;
		}
	@RequestMapping(value = "/loadPopStrata", method = RequestMethod.POST)
	public @ResponseBody List<String> loadPopStrata(@RequestParam("state") String strState,@RequestParam("scr") String strScr,ModelMap model) {
		logger.info("StockController :: rejectInvoice");
		List<String> popStrataList=new ArrayList<String>();
		try {
			popStrataList = planningService.getPopStata(strState,strScr);
		}catch(ERPException erp) {
		}
		catch (Exception e) {
		} 
		return popStrataList;
		} 
		
		@RequestMapping("/createPlan")
		public ModelAndView createPlan(@ModelAttribute("planningMaster")PlanningTemp planningData,HttpServletRequest req,
				HttpServletResponse resp, Model model) {
			ModelAndView mav = null;
			String statusMsg = null;
			List<PlanningMaster> planningList=null;
			PlanningSummary planningSummary=null;
			mav=new ModelAndView("showPlanning");
			HttpSession session=req.getSession();
			Map<String,String> assetTypesMap=new HashMap<String, String>();
			Map<String,String> stateMap=new HashMap<String, String>();
			Map<String,String> noGoFilterMap=new HashMap<String, String>();
			try {
				System.out.println("planningData pop "+planningData.getPopStrata());
				model.addAttribute("planningMaster", new PlanningTemp());
				String userName = session.getAttribute("username").toString();
				planningData.setUserName(userName);
				assetTypesMap=CommonUtility.getAssetMap();
				stateMap=planningService.getStateMap();
				noGoFilterMap=CommonUtility.getNoGoFilterMap();
				try{
				planningList=planningService.createPlan(planningData);
				} catch (ERPException erp) {
					statusMsg = "Problem Occured while creating Plan";
				} catch (Exception e) {
					statusMsg = "Problem Occured while creating Plan";
				}
				try{
					planningSummary=planningService.getSummaryData(planningData);
				} catch (ERPException erp) {
					statusMsg = "Problem Occured while creating summary Report";
				} catch (Exception e) {
					statusMsg = "Problem Occured while creating summary Report";
				}
				
				System.out.println("planningList size::: "+planningList.size());
				System.out.println("planningSummary ::: "+planningSummary.getActualDistircts()+" planned dis "+planningSummary.getPlannedDistircts());
				} catch (ERPException erp) {
				statusMsg = "Problem Occured. Please try Again";
			} catch (Exception e) {
				statusMsg = "Problem Occured. Please try Again";
			}
			req.setAttribute("assettype", planningData.getAssetType());
			req.setAttribute("size", planningData.getAssetType().equalsIgnoreCase("DWP")?planningData.getSize2():planningData.getSize1());
			req.setAttribute("cost", planningData.getCostPerAsset());
			req.setAttribute("saturation", planningData.getTargetSaturation());
			req.setAttribute("state", planningData.getStateName());
			req.setAttribute("scr", planningData.getScr());
			req.setAttribute("popstrata", planningData.getPopStrata());
			req.setAttribute("nogofilter", planningData.getNoGoFilter().equals("6")?"6 months":"12 months");
			session.setAttribute("planningList", planningList);
			session.setAttribute("planningSummary", planningSummary);
			mav.addObject("statusMsg", statusMsg);
			session.setAttribute("assetMap", assetTypesMap);
			session.setAttribute("stateMap", stateMap);
			session.setAttribute("noGoFilterMap", noGoFilterMap);
			return mav;
		}
		
		@RequestMapping(value = "/exportPlanningReport", method = RequestMethod.GET)
		public void exportSavedPrePlan(HttpServletRequest request,HttpServletResponse response, Model model) {
			//ModelAndView modelandview = new ModelAndView("showPrePlanning");
			String strFile ="PlanningReport.csv";
			HttpSession session=request.getSession(true);
			String userRole=(String) session.getAttribute("userRole");
			List<PlanningMaster> planningList=(List<PlanningMaster>)session.getAttribute("planningList");
			PlanningSummary planningSummary=(PlanningSummary)session.getAttribute("planningSummary");
			downloadPlanningReport(response, planningList,planningSummary,strFile);
			//return modelandview;
		}
		
		public void downloadPlanningReport(HttpServletResponse response, List<PlanningMaster> planningList,PlanningSummary planningSummary,String strFile) {
			ServletOutputStream outStream = null;
			try {
				
				ArrayList<String> rows = new ArrayList<String>();
				rows.add("Actual Districs,Planned Districs,Actual Villages,Planned Villages,Actual HH,Planned HH,Incremental Reach,Static Impression,Cost");
				rows.add("\n");
				rows.add(planningSummary.getActualDistircts()+","+planningSummary.getPlannedDistircts()
						+","+planningSummary.getActualVillages()+","+planningSummary.getPlannedVillages()
						+","+planningSummary.getActualHH()+","+planningSummary.getPlannedHH()
						+","+planningSummary.getIncrementalReach()+","+planningSummary.getStaticImpression()
						+","+planningSummary.getCost());
				rows.add("\n");
				rows.add("\n");
				rows.add("STATE CODE,STATE NAME,DISTRICT CODE,DISTRICT NAME,TEHSIL CODE,TEHSIL NAME,SCR,VILLAGE CODE,VILLAGE NAME,GIS Code,No_HH,"
						+ "	Total Population,TV,POP STRATA,Deployed in Last 6 months,Deployed in last 12 months,Incremental Reach in HH Assuming 50% TV reach,"
						+ "WP,DB,DWP,L6M Total,Current Planned Vs Acutals in Last 6 months,No Go Filter,Inventory Filter,Target Asset,"
						+ "Cost,Cost per Incremental Reach,Saturation of district,	Total Population,Final Saturation,Final Selection");
				rows.add("\n");
				Iterator<PlanningMaster> iter = planningList.iterator();
				while (iter.hasNext()) {
					PlanningMaster planningMaster = (PlanningMaster) iter.next();
					rows.add(planningMaster.getStateCode() + ","+planningMaster.getStateName()+","+planningMaster.getDistrictCode()+","+
							planningMaster.getDistrictName()+","+planningMaster.getTehsilCode()+","+
							planningMaster.getTehsilName()+","+planningMaster.getScr()+","+planningMaster.getVillageCode()
							+","+planningMaster.getVillageName()+","+planningMaster.getGisCode()+","+planningMaster.getNoHH()
							+","+planningMaster.getTotPop()+","+planningMaster.getTv()+","+planningMaster.getPopStrata()
							+","+planningMaster.getIsDeployedInLast6Months()+","+planningMaster.getIsDeployedInLast12Months()
							+","+planningMaster.getIncrementalReach()+","+planningMaster.getwP()+","+planningMaster.getdB()
							+","+planningMaster.getdWP()+","+planningMaster.getmTotal()+","+planningMaster.getPlan()
							+","+planningMaster.getNo_go_filter()+","+planningMaster.getInventoryFilter()+","+planningMaster.getTargetAsset()
							+","+planningMaster.getCost()+","+planningMaster.getCostPerIncrementalReach()+","+planningMaster.getSaturation()
							+","+planningMaster.getTotHh()+","+planningMaster.getFinalSaturation()+","+planningMaster.getFinalSelection());

					rows.add("\n");
				}
				outStream = response.getOutputStream();
				response.setContentType("text/csv");
				response.setHeader("Content-disposition", "attachment;filename="
						+ strFile);
				Iterator<String> itr = rows.iterator();
				while (itr.hasNext()) {
					String outputString = (String) itr.next();
					outStream.print(outputString);
				}

			} catch (IOException ie) {
				ie.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if(outStream!=null)
					{
						outStream.flush();
						outStream.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
}
