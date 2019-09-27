package com.newgen.risls;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.sql.PreparedStatement;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.log4j.LogManager;
import org.apache.log4j.PropertyConfigurator;

public class Mapping {

	static String tbl_Mst_DDLData = null;
	static FileInputStream input = null;
	static String tbl_District_Sro_Mapping = null;
	static String tbl_Main_Sub_Type = null;
	static String tbl_Ordinary_DDLData = null;

	// Control_ID For the below table

	static String Publication_Year_Control_Id = null;
	static String Mst_Newspaper_Edition_Control_Id = null;
	static String Mst_Filename_DIPR_Control_Id = null;
	static String Mst_Department_DIPR_Control_Id = null;

	static String tbl_Mst_Part_Ordinary = null;
	static String tbl_Mst_SubPart_ExtraOrdinary = null;
	static String tbl_Mst_Part_ExtraOrdinary = null;

	static String Mst_Part_Ordinary_Control_Id = null;
	static String Mst_SubPart_ExtraOrdinary_Control_Id = null;
	static String Mst_Part_ExtraOrdinary_Control_Id = null;

	static String tbl_Mst_Part_Ordinary_Update = null;
	static String tbl_Mst_SubPart_ExtraOrdinary_Update = null;
	static String tbl_Mst_Part_ExtraOrdinary_Update = null;

	

	static String Mst_Education_Postname_Control_Id = null;
	static String Mst_Education_Castcategory_Control_Id = null;
	static String Mst_Selection_Castcategory_Control_Id = null;
	static String Mst_Special_Selectioncategory_Control_Id = null;
	static String Mst_Newspaper_DIPR_Control_Id = null;
	static String Mst_Category_DIPR_Control_Id = null;

	// Inserting Queries for the below Table
	static String tbl_Mst_Publication_Year = null;

	static String tbl_Mst_Newspaper_Edition = null;
	static String tbl_Mst_Filename_DIPR = null;
	static String tbl_Mst_Department_DIPR = null;

	static String tbl_Mst_Education_Postname = null;
	static String tbl_Mst_Education_Castcategory = null;
	static String tbl_Mst_Selection_Castcategory = null;
	static String tbl_Mst_Special_Selectioncategory = null;
	static String tbl_Mst_Newspaper_DIPR = null;
	static String tbl_Mst_Category_DIPR = null;

	static String tbl_Mst_DISTRICT_SRO = null;
	static String tbl_mst_district = null;
	static String tbl_Mst_DOC_SubDOC = null;
	static String tbl_mst_Maindocument = null;
	static String tbl_District_Sro_Mapping_Distinct = null;
	static String tbl_Mst_DOC_SubDOC_Distinct = null;

	static String tbl_Mst_Education_Castcategory_Update = null;

	// UPdate DDL
	static String tbl_MST_PUBLICATION_YEAR_Update = null;
	static String tbl_MST_Mst_Part_Ordinary_Update = null;

	static String tbl_Mst_Newspaper_Edition_Update = null;
	static String tbl_Mst_Department_DIPR_Update = null;
	static String tbl_Mst_Filename_DIPR_Update = null;

	static String tbl_Mst_Education_Postname_Update = null;
	static String tbl_Mst_Selection_Castcategory_Update = null;
	static String tbl_Mst_Special_Selectioncategory_Update = null;
	static String tbl_Mst_Newspaper_DIPR_Update = null;
	static String tbl_Mst_Category_DIPR_Update = null;

	public static org.apache.log4j.Logger mLogger = org.apache.log4j.Logger
			.getLogger("mLogger");
	public static org.apache.log4j.Logger mRepLogger = org.apache.log4j.Logger
			.getLogger("Reportlog");
	public static org.apache.log4j.Logger mErrLogger = org.apache.log4j.Logger
			.getLogger("Errorlog");

	static String mstrlog4jConfigFilePath = "";
	Properties pConfigProp;

	private static void initLog() { // checks if the log file is present
		try {

			mstrlog4jConfigFilePath = System.getProperty("user.dir")
					+ System.getProperty("file.separator") + "config"
					+ System.getProperty("file.separator") + "log4j.properties";// assigning
																				// the
																				// path
																				// where
																				// the
																				// log
																				// file
																				// is
																				// to
																				// be
																				// accessed
																				// from
			System.out.println(mstrlog4jConfigFilePath);
			File lobjFile = new File(mstrlog4jConfigFilePath);// creating an
																// instance for
																// the file at
																// the specified
																// path
			if (!lobjFile.exists()) {
				System.out.print("Logger Config file doesnot exists !"
						+ mstrlog4jConfigFilePath);
			} else {
				configureLogger(mstrlog4jConfigFilePath);
			}
			lobjFile = null;

		} catch (Exception lobjExcp) {
			System.out.print("Exception occurs during logger initialization: "
					+ lobjExcp.toString());
		}
	}

	public static void configureLogger(String plog4jConfigFilePath)
			throws Exception {
		String lExceptionId = new String(
				"com.newgen.lns.myqueue.process.configureLogger.");
		try {
			FileInputStream lobjFileInputStream = null;
			lobjFileInputStream = new FileInputStream(plog4jConfigFilePath);
			Properties lobjPropertiesINI = new Properties();
			lobjPropertiesINI.load(lobjFileInputStream);
			PropertyConfigurator propertyConfigurator = new PropertyConfigurator();
			propertyConfigurator.doConfigure(lobjPropertiesINI,
					LogManager.getLoggerRepository());// doubt
		} catch (Exception lobjExcp) {
			System.out.print(lExceptionId
					+ ": Exception occurs during logger initialization1111: "
					+ lobjExcp.toString());
			throw lobjExcp;
		}

	}

	static Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	static long Last_modified = timestamp.getTime();
	static String Last_modified_Str = Long.toString(Last_modified);

	public static void main(String args[]) throws Exception {

		initLog();

		mLogger.info("main called");
		mRepLogger.info("main called");
		mErrLogger.info("main called");
		Test test = new Test();

		String driver = "";
		String dbUrl = "";
		String dbUserName = "";
		String dbPassword = "";
		
		String driverNemf = "";
		String dbUrlNemf = "";
		String dbUserNameNemf = "";
		String dbPasswordNemf = "";
		
		Properties prop = new Properties();
		Connection con = null;
		
		Connection conNemf = null;

		// Select Query for the Server Table

		try {

			input = new FileInputStream(System.getProperty("user.dir")
					+ File.separator + "utility.properties");
			prop.load(input);
			driver = prop.getProperty("DRIVER_NAME_CLIENT");
			// System.out.println("driver====" + driver);
			dbUrl = prop.getProperty("DB_URL_CLIENT");
			dbUserName = prop.getProperty("DB_USERNAME_CLIENT");
			dbPassword = prop.getProperty("DB_PASSWORD_CLIENT");
			
			driverNemf=prop.getProperty("DRIVER_NAME_NEMF");
			dbUrlNemf=prop.getProperty("DB_URL_NEMF");
			dbUserNameNemf=prop.getProperty("DB_USERNAME_NEMF");
			dbPassword=prop.getProperty("DB_PASSWORD_NEMF");
		
			tbl_Mst_DDLData = prop.getProperty("Tbl_Mst_DDLData");
			tbl_District_Sro_Mapping = prop
					.getProperty("Tbl_District_Sro_Mapping");
			tbl_Mst_Selection_Castcategory_Update = prop
					.getProperty("Tbl_Mst_Selection_Castcategory_Update");
			tbl_Main_Sub_Type = prop.getProperty("Tbl_Main_Sub_Type");
			tbl_Mst_Newspaper_DIPR_Update = prop
					.getProperty("Tbl_Mst_Newspaper_DIPR_Update");
			tbl_District_Sro_Mapping_Distinct = prop
					.getProperty("Tbl_District_Sro_Mapping_Distinct");
			tbl_Mst_Newspaper_Edition_Update = prop
					.getProperty("Tbl_Mst_Newspaper_Edition_Update");
			tbl_Ordinary_DDLData = prop.getProperty("Tbl_Ordinary_DDLData");
			tbl_Mst_Category_DIPR_Update = prop
					.getProperty("Tbl_Mst_Category_DIPR_Update");
			tbl_Mst_Publication_Year = prop
					.getProperty("Tbl_MST_PUBLICATION_YEAR");
			tbl_MST_PUBLICATION_YEAR_Update = prop
					.getProperty("Tbl_MST_PUBLICATION_YEAR_Update");
			Mst_Part_ExtraOrdinary_Control_Id = prop
					.getProperty("Mst_Part_ExtraOrdinary");
			tbl_Mst_Education_Castcategory_Update = prop
					.getProperty("Tbl_Mst_Education_Castcategory_Update");
			Mst_Part_Ordinary_Control_Id = prop
					.getProperty("Mst_Part_Ordinary");
			tbl_Mst_Part_Ordinary_Update = prop
					.getProperty("Tbl_Mst_Part_Ordinary_Update");
			tbl_Mst_Part_ExtraOrdinary_Update = prop
					.getProperty("Tbl_Mst_Part_ExtraOrdinary_Update");
			tbl_Mst_SubPart_ExtraOrdinary_Update = prop
					.getProperty("Tbl_Mst_SubPart_ExtraOrdinary_Update");
			tbl_Mst_Department_DIPR_Update = prop
					.getProperty("Tbl_Mst_Department_DIPR_Update");
			tbl_Mst_Part_ExtraOrdinary = prop
					.getProperty("Tbl_Mst_Part_ExtraOrdinary");
			Mst_SubPart_ExtraOrdinary_Control_Id = prop
					.getProperty("Mst_SubPart_ExtraOrdinary");
			tbl_Mst_Special_Selectioncategory_Update = prop
					.getProperty("Tbl_Mst_Special_Selectioncategory_Update");
			tbl_Mst_SubPart_ExtraOrdinary = prop
					.getProperty("Tbl_Mst_SubPart_ExtraOrdinary");
			tbl_Mst_Education_Postname = prop
					.getProperty("Tbl_Mst_Education_Postname");
			tbl_Mst_Education_Castcategory = prop
					.getProperty("Tbl_Mst_Education_Castcategory");
			tbl_Mst_Selection_Castcategory = prop
					.getProperty("Tbl_Mst_Selection_Castcategory");
			tbl_Mst_Special_Selectioncategory = prop
					.getProperty("Tbl_Mst_Special_Selectioncategory");
			tbl_Mst_Newspaper_DIPR = prop.getProperty("Tbl_Mst_Newspaper_DIPR");
			tbl_Mst_Category_DIPR = prop.getProperty("Tbl_Mst_Category_DIPR");
			tbl_Mst_Education_Postname_Update = prop
					.getProperty("Tbl_Mst_Education_Postname_Update");

			Publication_Year_Control_Id = prop
					.getProperty("PUBLICATION_YEAR_CODE");
			Mst_Newspaper_Edition_Control_Id = prop
					.getProperty("Newspaper_Edition");

			Mst_Filename_DIPR_Control_Id = prop.getProperty("Filename_DIPR");
			Mst_Department_DIPR_Control_Id = prop
					.getProperty("Department_DIPR");

			Mst_Education_Postname_Control_Id = prop
					.getProperty("Mst_Education_Postname");
			Mst_Education_Castcategory_Control_Id = prop
					.getProperty("Mst_Education_Castcategory");
			Mst_Selection_Castcategory_Control_Id = prop
					.getProperty("Mst_Selection_Castcategory");
			Mst_Special_Selectioncategory_Control_Id = prop
					.getProperty("Mst_Special_Selectioncategory");
			Mst_Newspaper_DIPR_Control_Id = prop
					.getProperty("Mst_Newspaper_DIPR");
			Mst_Category_DIPR_Control_Id = prop
					.getProperty("Mst_Category_DIPR");

			tbl_Mst_DISTRICT_SRO = prop.getProperty("Tbl_Mst_DISTRICT_SRO");
			tbl_mst_district = prop.getProperty("Tbl_mst_district");

			tbl_Mst_DOC_SubDOC = prop.getProperty("Tbl_Mst_DOC_SubDOC");
			tbl_mst_Maindocument = prop.getProperty("Tbl_mst_Maindocument");

			tbl_Mst_DOC_SubDOC_Distinct = prop
					.getProperty("Tbl_Mst_DOC_SubDOC_Distinct");
			tbl_Mst_Filename_DIPR_Update = prop
					.getProperty("Tbl_Mst_Filename_DIPR_Update");
			tbl_Mst_Newspaper_Edition = prop
					.getProperty("Tbl_Mst_Newspaper_Edition");
			tbl_Mst_Filename_DIPR = prop.getProperty("Tbl_Mst_Filename_DIPR");
			tbl_Mst_Department_DIPR = prop
					.getProperty("Tbl_Mst_Department_DIPR");

			tbl_Mst_Part_Ordinary = prop.getProperty("Tbl_Mst_Part_Ordinary");

			Class.forName(driver);
			con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
			
		/*	Class.forName(driverNemf);
			conNemf = DriverManager.getConnection(dbUrlNemf, dbUserNameNemf, dbPasswordNemf);
*/
			mLogger.info("After connection");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// System.out
			// .println("Property file is not available on specified path");
			mLogger.info("FileNotFoundException Exception");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			// System.out.println("Unable to load property file");
			mLogger.info("IOException:Unable to load property file ");
		} finally {
			input = null;
		}

		try {
		
			con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
			Statement stmt = con.createStatement();
			
		/*	conNemf = DriverManager.getConnection(dbUrlNemf, dbUserNameNemf, dbPasswordNemf);
			Statement stmtNemf = con.createStatement();*/
		
			

			// 2nd Database NEMF Connectivity
			String DRIVER_NAME_NEMF = "";
			String DB_URL_NEMF = "";
			String DB_USERNAME_NEMF = "";
			String DB_PASSWORD_NEMF = "";

			// Insertion in DDL Related tables

			 Mst_Ddl_Tbl(stmt, tbl_Mst_DDLData, con);
		//	 District_Sro(tbl_District_Sro_Mapping, stmt, con);
			// Main_tbl(tbl_Main_Sub_Type, stmt, con);
		//	 Ordinary_Tbl(tbl_Ordinary_DDLData, stmt, con);

			con.close();

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

		}
	
	}

	private static void Mst_Ddl_Tbl(Statement stmt, String query, Connection con)
			throws SQLException {
		String enteredOn = null, updatedOn = null;
		int Id = 0, ControlId = 0;
		List values = null;
		
		
		ResultSet resultsets_DDLData = stmt.executeQuery(query);
		mErrLogger.info("result" + resultsets_DDLData);
		HashMap<Integer, List> Mst_DDLData = new HashMap<Integer, List>();
		while (resultsets_DDLData.next()) {
			Id = resultsets_DDLData.getInt("ID");
			ControlId = resultsets_DDLData.getInt("ControlID");

			updatedOn = resultsets_DDLData.getString("UpdatedOn");
			enteredOn = resultsets_DDLData.getString("EnteredOn");

			values = new ArrayList<String>();
			values.add(resultsets_DDLData.getInt("ID"));
			values.add(resultsets_DDLData.getInt("ControlID"));
			values.add(resultsets_DDLData.getString("FieldValue"));
			values.add(resultsets_DDLData.getString("EnteredOn"));
			values.add(resultsets_DDLData.getString("UpdatedOn"));
			values.add(resultsets_DDLData.getString("UpdatedBy"));
			values.add(resultsets_DDLData.getString("EnteredBy"));
			Mst_DDLData.put(Id, values);

		}

		resultsets_DDLData.close();

		for (int storeIn : Mst_DDLData.keySet()) {
			List<Integer> Ctrl_Id = Mst_DDLData.get(storeIn);

			if (Ctrl_Id.get(1) == Integer.parseInt(Publication_Year_Control_Id)
					&& enteredOn.equals(updatedOn)) {
				System.out.println("inserted11");
				stmt.executeUpdate(tbl_Mst_Publication_Year + "('"
						+ Ctrl_Id.get(0) + "','" + Ctrl_Id.get(2) + "','"
						+ Last_modified_Str + "')");

			} else if (Ctrl_Id.get(1) == Integer
					.parseInt(Publication_Year_Control_Id)
					&& enteredOn != updatedOn) {
				PreparedStatement UpdateQuery_Publication_Year = con
						.prepareStatement(tbl_MST_PUBLICATION_YEAR_Update);
				System.out.println("inserted1");
				UpdateQuery_Publication_Year.setNString(1, Ctrl_Id.get(2) + "");

				System.out.println("Ctrl_Id.get(2)------------"
						+ Ctrl_Id.get(2));
				UpdateQuery_Publication_Year.setInt(2, Ctrl_Id.get(0));
				System.out.println("Ctrl_Id.get(1)-------------"
						+ Ctrl_Id.get(0));
				UpdateQuery_Publication_Year.executeUpdate();

			}
			if (Ctrl_Id.get(1) == Integer
					.parseInt(Mst_Newspaper_Edition_Control_Id)
					&& enteredOn.equals(updatedOn)) {

				stmt.executeUpdate(tbl_Mst_Newspaper_Edition + "('"
						+ Ctrl_Id.get(2) + "'," + "'" + Ctrl_Id.get(0) + "','"
						+ Last_modified_Str + "')");
			} else if (Ctrl_Id.get(1) == Integer
					.parseInt(Mst_Newspaper_Edition_Control_Id)
					&& enteredOn != updatedOn) {
				PreparedStatement UpdateQuery_Newspaper_Edition = (PreparedStatement) con
						.prepareStatement(tbl_Mst_Newspaper_Edition_Update);
				System.out.println("inserted2");
				UpdateQuery_Newspaper_Edition
						.setNString(1, Ctrl_Id.get(2) + "");
				UpdateQuery_Newspaper_Edition.setInt(2, Ctrl_Id.get(0));
				UpdateQuery_Newspaper_Edition.executeUpdate();
			}

			if (Ctrl_Id.get(1) == Integer
					.parseInt(Mst_Department_DIPR_Control_Id)
					&& enteredOn.equals(updatedOn)) {
				stmt.executeUpdate(tbl_Mst_Department_DIPR + "('"
						+ Ctrl_Id.get(2) + "'," + "'" + Ctrl_Id.get(0) + "','"
						+ Last_modified_Str + "')");
				System.out.println("Mst_Department_DIPR_Control_Id"
						+ Mst_Department_DIPR_Control_Id);
			} else if (Ctrl_Id.get(1) == Integer
					.parseInt(Mst_Department_DIPR_Control_Id)
					&& enteredOn != updatedOn) {
				PreparedStatement UpdateQuery_Mst_Department_DIPR = (PreparedStatement) con
						.prepareStatement(tbl_Mst_Department_DIPR_Update);
				System.out.println("inserted3");
				UpdateQuery_Mst_Department_DIPR.setNString(1, Ctrl_Id.get(2)
						+ "");
				UpdateQuery_Mst_Department_DIPR.setInt(2, Ctrl_Id.get(0));
				UpdateQuery_Mst_Department_DIPR.executeUpdate();
			}

			if (Ctrl_Id.get(1) == Integer
					.parseInt(Mst_Filename_DIPR_Control_Id)
					&& enteredOn.equals(updatedOn))
				stmt.executeUpdate(tbl_Mst_Filename_DIPR + "('"
						+ Ctrl_Id.get(2) + "'," + "'" + Ctrl_Id.get(0) + "','"
						+ Last_modified_Str + "')");

			else if (Ctrl_Id.get(1) == Integer
					.parseInt(Mst_Filename_DIPR_Control_Id)
					&& enteredOn != updatedOn) {
				PreparedStatement UpdateQuery_Mst_Filename_DIPR = (PreparedStatement) con
						.prepareStatement(tbl_Mst_Filename_DIPR_Update);
				System.out.println("inserted4");
				UpdateQuery_Mst_Filename_DIPR
						.setNString(1, Ctrl_Id.get(2) + "");
				UpdateQuery_Mst_Filename_DIPR.setInt(2, Ctrl_Id.get(0));
				UpdateQuery_Mst_Filename_DIPR.executeUpdate();
			}

			if (Ctrl_Id.get(1) == Integer
					.parseInt(Mst_Education_Postname_Control_Id)
					&& enteredOn.equals(updatedOn))
				stmt.executeUpdate(tbl_Mst_Education_Postname + "('"
						+ Ctrl_Id.get(2) + "'," + "'" + Ctrl_Id.get(0) + "','"
						+ Last_modified_Str + "')");

			else if (Ctrl_Id.get(1) == Integer
					.parseInt(Mst_Education_Postname_Control_Id)
					&& enteredOn != updatedOn) {
				PreparedStatement UpdateQuery_Mst_Education_Postname = (PreparedStatement) con
						.prepareStatement(tbl_Mst_Education_Postname_Update);
				System.out.println("inserted5");
				UpdateQuery_Mst_Education_Postname.setNString(1, Ctrl_Id.get(2)
						+ "");
				UpdateQuery_Mst_Education_Postname.setInt(2, Ctrl_Id.get(0));
				// UpdateQuery_Mst_Education_Postname.setString(3,
				// Last_modified_Str);
				UpdateQuery_Mst_Education_Postname.executeUpdate();
			}

			if (Ctrl_Id.get(1) == Integer
					.parseInt(Mst_Education_Castcategory_Control_Id)
					&& enteredOn.equals(updatedOn))
				stmt.executeUpdate(tbl_Mst_Education_Castcategory + "('"
						+ Ctrl_Id.get(2) + "'," + "'" + Ctrl_Id.get(0) + "','"
						+ Last_modified_Str + "')");

			else if (Ctrl_Id.get(1) == Integer
					.parseInt(Mst_Education_Castcategory_Control_Id)
					&& enteredOn != updatedOn) {
				PreparedStatement UpdateQuery_Mst_Education_Castcategory = (PreparedStatement) con
						.prepareStatement(tbl_Mst_Department_DIPR_Update);
				System.out.println("inserted6");
				UpdateQuery_Mst_Education_Castcategory.setNString(1,
						Ctrl_Id.get(2) + "");
				UpdateQuery_Mst_Education_Castcategory
						.setInt(2, Ctrl_Id.get(0));
			
				UpdateQuery_Mst_Education_Castcategory.executeUpdate();
			}

			if (Ctrl_Id.get(1) == Integer
					.parseInt(Mst_Selection_Castcategory_Control_Id)
					&& enteredOn.equals(updatedOn))
				stmt.execute(tbl_Mst_Selection_Castcategory + "('"
						+ Ctrl_Id.get(2) + "'," + "'" + Ctrl_Id.get(0) + "','"
						+ Last_modified_Str + "')");

			else if (Ctrl_Id.get(1) == Integer
					.parseInt(Mst_Selection_Castcategory_Control_Id)
					&& enteredOn != updatedOn) {
				PreparedStatement UpdateQuery_Mst_Selection_Castcategory = (PreparedStatement) con
						.prepareStatement(tbl_Mst_Selection_Castcategory_Update);
				System.out.println("inserted7");
				UpdateQuery_Mst_Selection_Castcategory.setNString(1,
						Ctrl_Id.get(2) + "");
				UpdateQuery_Mst_Selection_Castcategory
						.setInt(2, Ctrl_Id.get(0));
				// UpdateQuery_Mst_Selection_Castcategory.setString(3,
				// Last_modified_Str);
				UpdateQuery_Mst_Selection_Castcategory.executeUpdate();
			}

			if (Ctrl_Id.get(1) == Integer
					.parseInt(Mst_Special_Selectioncategory_Control_Id)
					&& enteredOn.equals(updatedOn))
				stmt.execute(tbl_Mst_Special_Selectioncategory + "('"
						+ Ctrl_Id.get(2) + "'," + "'" + Ctrl_Id.get(0) + "','"
						+ Last_modified_Str + "')");

			else if (Ctrl_Id.get(1) == Integer
					.parseInt(Mst_Special_Selectioncategory_Control_Id)
					&& enteredOn != updatedOn) {
				PreparedStatement UpdateQuery_Special_Selectioncategory = (PreparedStatement) con
						.prepareStatement(tbl_Mst_Special_Selectioncategory_Update);
				System.out.println("inserted8");
				UpdateQuery_Special_Selectioncategory.setNString(1,
						Ctrl_Id.get(2) + "");
				UpdateQuery_Special_Selectioncategory.setInt(2, Ctrl_Id.get(0));
				// UpdateQuery_Special_Selectioncategory.setString(3,
				// Last_modified_Str);
				UpdateQuery_Special_Selectioncategory.executeUpdate();
			}

			if (Ctrl_Id.get(1) == Integer
					.parseInt(Mst_Newspaper_DIPR_Control_Id)
					&& enteredOn.equals(updatedOn))
				stmt.execute(tbl_Mst_Newspaper_DIPR + "('" + Ctrl_Id.get(2)
						+ "'," + "'" + Ctrl_Id.get(0) + "','"
						+ Last_modified_Str + "')");
			else if (Ctrl_Id.get(1) == Integer
					.parseInt(Mst_Newspaper_DIPR_Control_Id)
					&& enteredOn != updatedOn) {
				PreparedStatement UpdateQuery_Mst_Newspaper_DIPR = (PreparedStatement) con
						.prepareStatement(tbl_Mst_Newspaper_DIPR_Update);
				System.out.println("inserted9");
				UpdateQuery_Mst_Newspaper_DIPR.setNString(1, Ctrl_Id.get(2)
						+ "");
				UpdateQuery_Mst_Newspaper_DIPR.setInt(2, Ctrl_Id.get(0));
				// UpdateQuery_Mst_Newspaper_DIPR.setString(3,
				// Last_modified_Str);
				UpdateQuery_Mst_Newspaper_DIPR.executeUpdate();
			}

			if (Ctrl_Id.get(1) == Integer
					.parseInt(Mst_Category_DIPR_Control_Id)
					&& enteredOn.equals(updatedOn))
				stmt.execute(tbl_Mst_Category_DIPR + "('" + Ctrl_Id.get(2)
						+ "'," + "'" + Ctrl_Id.get(0) + "','"
						+ Last_modified_Str + "')");
			else if (Ctrl_Id.get(1) == Integer
					.parseInt(Mst_Category_DIPR_Control_Id)
					&& enteredOn != updatedOn) {
				PreparedStatement UpdateQuery_Mst_Category_DIPR = (PreparedStatement) con
						.prepareStatement(tbl_Mst_Category_DIPR_Update);
				System.out.println("inserted10");
				UpdateQuery_Mst_Category_DIPR
						.setNString(1, Ctrl_Id.get(2) + "");
				UpdateQuery_Mst_Category_DIPR.setInt(2, Ctrl_Id.get(0));
				// UpdateQuery_Mst_Category_DIPR.setString(3,
				// Last_modified_Str);
				UpdateQuery_Mst_Category_DIPR.executeUpdate();
			}

		}

	}

	private static void District_Sro(String query, Statement stmt,
			Connection con) throws SQLException {

		int Id = 0;
		String District_Desc = null;
		List Distinct_Sro_values = null, values = null;

		ResultSet resultset_Sro_Mapping = stmt.executeQuery(query);
		mErrLogger.info("result" + resultset_Sro_Mapping);
		HashMap<Integer, List> District_Sro_Mapping = new HashMap<Integer, List>();

		HashMap<String, Integer> Distinct_Sro = new HashMap<String, Integer>();

		while (resultset_Sro_Mapping.next()) {
			Id = resultset_Sro_Mapping.getInt("Id");
			District_Desc = resultset_Sro_Mapping.getString("District_Desc");

			values = new ArrayList<String>();
			Distinct_Sro_values = new ArrayList<String>();

			values.add(resultset_Sro_Mapping.getString("Id"));
			values.add(resultset_Sro_Mapping.getString("District_Desc"));
			Distinct_Sro_values.add(resultset_Sro_Mapping
					.getString("District_Desc"));
			Distinct_Sro_values.add(resultset_Sro_Mapping.getString("Id"));

			values.add(resultset_Sro_Mapping.getString("SRO_Desc"));
			values.add(resultset_Sro_Mapping.getString("IsActive"));
			values.add(resultset_Sro_Mapping.getDate("CreationDate"));
			values.add(resultset_Sro_Mapping.getString("District_Code"));
			values.add(resultset_Sro_Mapping.getString("SRO_Code"));
			District_Sro_Mapping.put(Id, values);

			Distinct_Sro.put(District_Desc, Id);

		}
		resultset_Sro_Mapping.close();
		// Insert into Mst_DISTRICT_SRO

		for (int DISTRICT_SRO : District_Sro_Mapping.keySet()) {
			List<Integer> SRO_ID = (District_Sro_Mapping.get(DISTRICT_SRO));
			System.out.println("SRO_ID" + SRO_ID);
			stmt.executeUpdate(tbl_Mst_DISTRICT_SRO + "('" + SRO_ID.get(1)
					+ "'," + "'" + SRO_ID.get(2) + "'," + "'" + SRO_ID.get(3)
					+ "'," + "'" + SRO_ID.get(0) + "','" + Last_modified_Str
					+ "')");

		}

		// Insert tbl_mst_district_Distinct
		PreparedStatement mst_district = (PreparedStatement) con
				.prepareStatement(tbl_mst_district);
		int District_Id = 0;
		for (String distinct_District : Distinct_Sro.keySet()) {
			District_Id = (Distinct_Sro.get(distinct_District));

			System.out.println("tbl_mst_district" + tbl_mst_district
					+ "District_Id" + Integer.toString(District_Id));
			mst_district.setString(1, distinct_District);
			mst_district.setString(2, distinct_District);
			mst_district.setString(3, Last_modified_Str);
			mst_district.setString(4, Integer.toString(District_Id));

			mst_district.executeUpdate();

		}

	}

	public static void Main_tbl(String query, Statement stmt, Connection con)
			throws SQLException {
		List MainType_values = null, values = null;
		
		String MainType = null;

		int Id = 0;

		ResultSet resultset_Main_Sub_Type = stmt.executeQuery(query);
		mErrLogger.info("result" + resultset_Main_Sub_Type);
		HashMap<Integer, List> Main_Sub_Type = new HashMap<Integer, List>();

		HashMap<String, Integer> Distinct_Document = new HashMap<String, Integer>();

		while (resultset_Main_Sub_Type.next()) {

			Id = resultset_Main_Sub_Type.getInt("Id");
			MainType = resultset_Main_Sub_Type.getString("MainType_Document");

			MainType_values = new ArrayList<String>();
			values = new ArrayList<String>();

			values.add(resultset_Main_Sub_Type.getString("Id"));
			values.add(resultset_Main_Sub_Type.getString("MainType_Document"));
			values.add(resultset_Main_Sub_Type.getString("SubType_Document"));

			MainType_values.add(resultset_Main_Sub_Type
					.getString("MainType_Document"));// to get distinct values
			MainType_values.add(resultset_Main_Sub_Type.getString("Id"));

			values.add(resultset_Main_Sub_Type.getString("IsActive"));
			values.add(resultset_Main_Sub_Type.getString("CreationDate"));
			values.add(resultset_Main_Sub_Type.getString("SubType_Code"));
			values.add(resultset_Main_Sub_Type.getString("MainType_Code"));
			Main_Sub_Type.put(Id, values);

			Distinct_Document.put(MainType, Id); //

		}
		resultset_Main_Sub_Type.close();

		// insert into tbl_Mst_DOC_SubDOC

		for (int DOC_SubDOC : Main_Sub_Type.keySet()) {
			List<Integer> id = (Main_Sub_Type.get(DOC_SubDOC));
			System.out.println("SRO_ID" + id);
			stmt.executeUpdate(tbl_Mst_DOC_SubDOC + "('" + id.get(1) + "',"
					+ "'" + id.get(3) + "'," + "'" + id.get(2) + "'," + "'"
					+ id.get(0) + "','" + Last_modified_Str + "')");

		}

		// insert into tbl_mst_Maindocument_Distinct
		PreparedStatement Maindocument_Distinct = (PreparedStatement) con
				.prepareStatement(tbl_mst_Maindocument);
		int district_Id = 0;
		for (String DOC_SubDOC : Distinct_Document.keySet()) {
			district_Id = (Distinct_Document.get(DOC_SubDOC));

			System.out.println(DOC_SubDOC);
			Maindocument_Distinct.setString(1, DOC_SubDOC);
			Maindocument_Distinct.setString(2, DOC_SubDOC);
			Maindocument_Distinct.setString(3, Last_modified_Str);
			Maindocument_Distinct.setString(4, Integer.toString(district_Id));

			Maindocument_Distinct.executeUpdate();

		}

	}

	public static void Ordinary_Tbl(String query, Statement stmt, Connection con)
			throws SQLException {
		int Id = 0, ControlId = 0;
		List values = null;
		String Updatedon = null, Enteredon = null;
		ResultSet resultset_Ordinary_DDLData = stmt.executeQuery(query);
		mErrLogger.info("result" + resultset_Ordinary_DDLData);
		HashMap<Integer, List> Ordinary_DDLData = new HashMap<Integer, List>();
		while (resultset_Ordinary_DDLData.next()) {
			Id = resultset_Ordinary_DDLData.getInt("Id");
			ControlId = resultset_Ordinary_DDLData.getInt("ControlID");

			Updatedon = resultset_Ordinary_DDLData.getString("UpdatedOn");
			Enteredon = resultset_Ordinary_DDLData.getString("EnteredOn");
			values = new ArrayList<String>();

			values.add(resultset_Ordinary_DDLData.getInt("ID"));
			values.add(resultset_Ordinary_DDLData.getInt("ControlID"));
			values.add(resultset_Ordinary_DDLData.getString("FieldValue"));
			values.add(resultset_Ordinary_DDLData.getString("EnteredOn"));
			values.add(resultset_Ordinary_DDLData.getString("UpdatedOn"));

			Ordinary_DDLData.put(Id, values);

		}
		resultset_Ordinary_DDLData.close();

		System.out.println("Ordinary_DDLData" + Ordinary_DDLData);

		for (int Part_Ordinary : Ordinary_DDLData.keySet()) {
			List<Integer> Ordinary_Values = Ordinary_DDLData.get(Part_Ordinary);

			if (Ordinary_Values.get(1) == Integer
					.parseInt(Mst_Part_Ordinary_Control_Id)
					&& Enteredon.equals(Updatedon)) {

				stmt.executeUpdate(tbl_Mst_Part_Ordinary + "('"
						+ Ordinary_Values.get(2) + "','"
						+ Ordinary_Values.get(0) + "','" + Last_modified_Str
						+ "')");
			}

			else if (Ordinary_Values.get(1) == Integer
					.parseInt(Mst_Part_Ordinary_Control_Id)
					&& Enteredon != Updatedon) {
				PreparedStatement UpdateQuery_Part_Ordinary = con
						.prepareStatement(tbl_Mst_Part_Ordinary_Update);

				UpdateQuery_Part_Ordinary.setNString(1, Ordinary_Values.get(2)
						+ "");
				UpdateQuery_Part_Ordinary.setInt(2,
						(Integer) Ordinary_Values.get(0));

				UpdateQuery_Part_Ordinary.executeUpdate();

			}

			if (Ordinary_Values.get(1) == Integer
					.parseInt(Mst_Part_ExtraOrdinary_Control_Id)
					&& Enteredon.equals(Updatedon)) {
				stmt.executeUpdate(tbl_Mst_Part_ExtraOrdinary + "('"
						+ Ordinary_Values.get(2) + "','"
						+ Ordinary_Values.get(0) + "','" + Last_modified_Str
						+ "')");

			} else if (Ordinary_Values.get(1) == Integer
					.parseInt(Mst_Part_ExtraOrdinary_Control_Id)
					&& Enteredon != Updatedon) {
				PreparedStatement UpdateQuery_Part_ExtraOrdinary = (PreparedStatement) con
						.prepareStatement(tbl_Mst_Part_ExtraOrdinary_Update);

				UpdateQuery_Part_ExtraOrdinary.setNString(1,
						Ordinary_Values.get(2) + "");
				UpdateQuery_Part_ExtraOrdinary
						.setInt(2, Ordinary_Values.get(0));
				UpdateQuery_Part_ExtraOrdinary.executeUpdate();
			}

			if (Ordinary_Values.get(1) == Integer
					.parseInt(Mst_SubPart_ExtraOrdinary_Control_Id)
					&& Enteredon.equals(Updatedon)) {
				stmt.executeUpdate(tbl_Mst_SubPart_ExtraOrdinary + "('"
						+ Ordinary_Values.get(2) + "','"
						+ Ordinary_Values.get(0) + "','" + Last_modified_Str
						+ "')");

			} else if (Ordinary_Values.get(1) == Integer
					.parseInt(Mst_SubPart_ExtraOrdinary_Control_Id)
					&& Enteredon != Updatedon) {
				PreparedStatement UpdateQuery_SubPart_ExtraOrdinary = (PreparedStatement) con
						.prepareStatement(tbl_Mst_SubPart_ExtraOrdinary_Update);
				System.out.println("-----Ordinary_Values.get(1)"
						+ Ordinary_Values.get(1) + Ordinary_Values);
				UpdateQuery_SubPart_ExtraOrdinary.setNString(1,
						Ordinary_Values.get(2) + "");
				UpdateQuery_SubPart_ExtraOrdinary.setInt(2,
						Ordinary_Values.get(0));
				UpdateQuery_SubPart_ExtraOrdinary.executeUpdate();
				System.out.println("exit");
			}
		}

	}

}
