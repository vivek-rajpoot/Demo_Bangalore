/*
 *PlanningDAOImpl.java
 *Created By		:Bhagya Lakshmi Mula
 *Created Date	:Sep 11, 2018
 */
package com.rural.staticplanning.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.rural.constant.IConstants;
import com.rural.exceptions.ERPException;
import com.rural.model.SalesMaster;
import com.rural.staticplanning.model.PlanningMaster;
import com.rural.staticplanning.model.PlanningSummary;
import com.rural.staticplanning.model.PlanningTemp;
import com.rural.utility.CommonUtility;
import com.rural.utility.ConnectionManager;

@Component
@Repository
public class PlanningDAOImpl implements PlanningDAO {

	@Resource(name = "sessionFactory")
	protected SessionFactory sessionFactory;

	static Logger logger = Logger.getLogger(PlanningDAOImpl.class);

	@Override
	public List<Integer> getSizeForAssetType(String strAssetType) {
		logger.debug("=====START PlanningDAOImpl getSizeForAssetType======");
		List<Integer> sizeList = new ArrayList<Integer>();
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Query query = session.createSQLQuery(
					"CALL GET_SIZEBYASSETTYPE(:assetType)").setParameter(
					"assetType", strAssetType);
			sizeList = ((List<Integer>) query.list());
		} catch (HibernateException he) {
			logger.error("Exception occured while loading sizes based on Asset Type :"
					+ he.getMessage());
			throw new ERPException(
					"Exception occured while loading sizes based on Asset Type:"
							+ he.getMessage());
		} catch (ERPException erp) {
			logger.error("Exception occured while loading sizes based on Asset Type :"
					+ erp.getMessage());
			throw new ERPException(
					"Exception occured while loading sizes based on Asset Type");
		} catch (Exception e) {
			logger.error("Exception occured while loading sizes based on Asset Type :"
					+ e.getMessage());
			throw new ERPException(
					"Exception occured while loading sizes based on Asset Type");
		} finally {
			session.close();
		}
		logger.debug("=====END PlanningDAOImpl getSizeForAssetType======");
		return sizeList;
	}

	@Override
	public String getAssetCost(String strAssetType, Integer intSize) {
		logger.debug("======START DeliveryAndInventoryDAOImpl getEstimatedDeliveryDate======");
		Connection con = null;
		CallableStatement cStmt = null;
		String cost = null;
		try {
			con = ConnectionManager.getConnection();
			cStmt = con.prepareCall("{call GET_ASSETCOST(?,?,?)}");
			cStmt.setString(1, strAssetType);
			cStmt.setInt(2, intSize);
			cStmt.registerOutParameter(3, java.sql.Types.VARCHAR);

			// execute getDBUSERByUserId store procedure
			cStmt.executeUpdate();
			cost = cStmt.getString(3);
			logger.debug("======END DeliveryAndInventoryDAOImpl getEstimatedDeliveryDate======");
		} catch (HibernateException he) {
			logger.error("Exception occured while getting getEstimatedDeliveryDate :"
					+ he.getMessage());
			throw new ERPException(
					"Exception occured while getting getEstimatedDeliveryDate :"
							+ he.getMessage());
		} catch (ERPException erp) {
			logger.error("Exception occured while getting getEstimatedDeliveryDate :"
					+ erp.getMessage());
			throw new ERPException(
					"Exception occured while getting getEstimatedDeliveryDate :"
							+ erp.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while getting getEstimatedDeliveryDate :"
					+ e.getMessage());
			throw new ERPException(
					"Exception occured while getting getEstimatedDeliveryDate :"
							+ e.getMessage());
		} finally {
			try {
				cStmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return cost;

	}

	@Override
	public Map<String, String> getStateMap() {
		logger.debug("======START PrePlanningDAOImpl stateMap======");
		Map<String, String> states = new LinkedHashMap<String, String>();
		String statename = null;
		Session session = null;
		try {
			session = sessionFactory.openSession();
			List list = session.createSQLQuery("CALL Get_States(:module)")
					.setParameter("module", "Planning").list();
			Iterator itr = list.iterator();
			while (itr.hasNext()) {
				statename = (String) itr.next();
				states.put(statename, statename);
			}
		} catch (HibernateException he) {
			logger.error("Exception occured while loading states :"
					+ he.getMessage());
			throw new ERPException("Exception occured while loading states :"
					+ he.getMessage());
		} catch (ERPException erp) {
			logger.error("Exception occured while loading states :"
					+ erp.getMessage());
			erp.printStackTrace();
			throw new ERPException("Error while loading states");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		logger.debug("======END PrePlanningDAOImpl stateMap======");
		return states;
	}

	@Override
	public List<String> getSCRList(String strState) {
		logger.debug("=====START PlanningDAOImpl getSizeForAssetType======");
		List<String> scrList = new ArrayList<String>();
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Query query = session.createSQLQuery(
					"CALL GET_SCRLISTBYSTATE(:state)").setParameter("state",
					strState);
			scrList = ((List<String>) query.list());
		} catch (HibernateException he) {
			logger.error("Exception occured while loading sizes based on Asset Type :"
					+ he.getMessage());
			throw new ERPException(
					"Exception occured while loading sizes based on Asset Type:"
							+ he.getMessage());
		} catch (ERPException erp) {
			logger.error("Exception occured while loading sizes based on Asset Type :"
					+ erp.getMessage());
			throw new ERPException(
					"Exception occured while loading sizes based on Asset Type");
		} catch (Exception e) {
			logger.error("Exception occured while loading sizes based on Asset Type :"
					+ e.getMessage());
			throw new ERPException(
					"Exception occured while loading sizes based on Asset Type");
		} finally {
			session.close();
		}
		logger.debug("=====END PlanningDAOImpl getSizeForAssetType======");
		return scrList;
	}

	@Override
	public List<String> getPopStata(String strState, String strScr) {
		logger.debug("=====START PlanningDAOImpl getSizeForAssetType======");
		List<String> popStrataList = new ArrayList<String>();
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Query query = session
					.createSQLQuery(
							"CALL GET_POPSTRATABYSTATEANDSCR(:state,:scr)")
					.setParameter("state", strState)
					.setParameter("scr", strScr);
			popStrataList = ((List<String>) query.list());
		} catch (HibernateException he) {
			logger.error("Exception occured while loading sizes based on Asset Type :"
					+ he.getMessage());
			throw new ERPException(
					"Exception occured while loading sizes based on Asset Type:"
							+ he.getMessage());
		} catch (ERPException erp) {
			logger.error("Exception occured while loading sizes based on Asset Type :"
					+ erp.getMessage());
			throw new ERPException(
					"Exception occured while loading sizes based on Asset Type");
		} catch (Exception e) {
			logger.error("Exception occured while loading sizes based on Asset Type :"
					+ e.getMessage());
			throw new ERPException(
					"Exception occured while loading sizes based on Asset Type");
		} finally {
			session.close();
		}
		logger.debug("=====END PlanningDAOImpl getSizeForAssetType======");
		return popStrataList;
	}

	@Override
	public List<PlanningMaster> createPlan(PlanningTemp planningData) {
		logger.debug("=====START PlanningDAOImpl insertRoutePlan======");
		Session session = null;
		List<PlanningMaster> planList = null;
		try {
			session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			planList = new ArrayList<PlanningMaster>();
			System.out.println("target sat=== "+ planningData.getTargetSaturation()+" pop="+planningData.getPopStrata());
			//String pop=planningData.getPopStrata().replaceAll(",", "','");
			//String pop="'"+planningData.getPopStrata().replaceAll(",", "','")+"'";
			//System.out.println(pop+"=pop");
			/*String pop=CommonUtility.convertListToStringWithComma(Arrays.asList(planningData.getPopStrata()));
			System.out.println(pop+"=pop");*/
			Query query = session
					.createSQLQuery(
							"CALL CREATE_STATIC_PLAN(:user,:assetType,:size,:cost,:saturation,:state,:scr,:popStrata,:nogofilter)")
					.addEntity(PlanningMaster.class)
					.setParameter("user", planningData.getUserName())
					.setParameter("assetType", planningData.getAssetType())
					.setParameter(
							"size",
							planningData.getAssetType().equalsIgnoreCase("DWP") ? planningData
									.getSize2() : planningData.getSize1())
					.setParameter("cost", planningData.getCostPerAsset())
					.setParameter("saturation", planningData.getTargetSaturation())
					.setParameter("state", planningData.getStateName())
					.setParameter("scr", planningData.getScr())
					.setParameter("popStrata", planningData.getPopStrata())
					.setParameter("nogofilter", planningData.getNoGoFilter());
			List<PlanningMaster> list = query.list();
			tx.commit();
			Iterator<PlanningMaster> itr = list.iterator();
			while (itr.hasNext()) {

				PlanningMaster planningMaster = new PlanningMaster();
				planningMaster = itr.next();
				planList.add(planningMaster);

			}
		} catch (HibernateException he) {
			logger.error("Exception occured while creating Route plan :"
					+ he.getMessage());
			throw new ERPException(
					"Exception occured while creating Route plan :"
							+ he.getMessage());
		} catch (ERPException erp) {
			logger.error("Exception occured while creating Route plan :"
					+ erp.getMessage());
			throw new ERPException("Error while creating RoutePlan");
		} catch (Exception e) {
			logger.error("Exception occured while loading routeplans :"
					+ e.getMessage());
			throw new ERPException("Error while loading routeplanlist");
		} finally {
			session.close();
		}
		logger.debug("=====END PlanningDAOImpl insertRoutePlan======");
		return planList;
	}

	@Override
	public PlanningSummary getSummaryData(PlanningTemp planningData) {
		logger.debug("======START PlanningDAOImpl getSummaryData=====");
		Connection conn = null;
		ResultSet rs = null;
		CallableStatement stmt = null;
		PlanningSummary summary = new PlanningSummary();
		String query = "{ CALL GET_PLANNING_SUMMARY(?) }";
		try {
			conn = ConnectionManager.getConnection();
			stmt = conn.prepareCall(query);
			stmt.setString(1, planningData.getScr());
			rs = stmt.executeQuery();
			ResultSetMetaData metadata = rs.getMetaData();
			while (rs.next()) {
				summary.setActualDistircts(rs.getString("actualDistircts"));
				summary.setPlannedDistircts(rs.getString("plannedDistircts"));
				summary.setActualVillages(rs.getString("actualVillages"));
				summary.setPlannedVillages(rs.getString("plannedVillages"));
				summary.setActualHH(rs.getString("actualHH"));
				summary.setPlannedHH(rs.getString("plannedHH"));
				summary.setIncrementalReach(rs.getString("incremental_reach"));
				summary.setStaticImpression(rs.getString("staticImpression"));
				summary.setCost(rs.getString("cost"));
			}
			logger.debug("======END PlanningDAOImpl getSummaryData=====");
		} catch (SQLException he) {
			logger.error("Exception occured while in Planning Summary Report"
					+ he.getMessage());
			throw new ERPException(
					"Exception occured while in Planning Summary Report"
							+ he.getMessage());
		} catch (ERPException erp) {
			logger.error("Exception occured while in Planning Summary Report"
					+ erp.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while in Planning Summary Report"
					+ e.getMessage());
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return summary;
	}

}
