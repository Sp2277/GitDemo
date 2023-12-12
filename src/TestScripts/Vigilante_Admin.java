package TestScripts;

import org.apache.poi.util.SystemOutLogger;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.relevantcodes.extentreports.ExtentReports;
import BaseClasses.Admin_BaseClass;
import Utility.Read_XLS;
import Utility.SuiteUtility;

public class Vigilante_Admin extends Admin_BaseClass {

	Read_XLS FilePath = null;
	String SheetName = null;
	String TestCaseName = null;
	String ToRunColumnNameTestCase = null;
	String ToRunColumnNameTestData = null;
	String TestDataToRun[] = null;
	static int DataSet = -1;
	static boolean Testskip = false;
	static boolean Testfail;
	static boolean TestCasePass = true;
	SoftAssert s_assert = null;

	/*****************************************
	 * Function to checkCaseToRun
	 * ************************************************** Annotation
	 * : @BeforeTest
	 * 
	 * DESCRIPTION : To run particular function before every test
	 * 
	 * FUNCTION NAME : checkCaseToRun()
	 * 
	 * 
	 * DESCRIPTION : This function is used to 1.To check which test case should
	 * be run from excel 2.Insert log In applog.log file. 3.To check test case's
	 * CaseToRun = Y or N In related excel sheet. If CaseToRun = N or blank,
	 * Test case will skip execution. Else It will be executed. 4.To report
	 * result as skip for test cases In TestCasesList sheet. 5.To throw skip
	 * exception for this test case. 6.To retrieve DataToRun flags of all data
	 * set lines from related test data sheet.
	 * 
	 * HISTORY : AUTHOR DATE VERSION
	 * 
	 * CREATED BY : Vasanti 6-JUNE-2016 1.0
	 *
	 ***************************************** Function to checkCaseToRun
	 * 
	 * @throws Exception
	 **************************************************/

	@BeforeTest
	public void checkCaseToRun() throws Exception {
		init();

		report = new ExtentReports(System.getProperty("user.dir") + "/src/Reports/ExtentReportResults.html", true);

		FilePath = TestCaseListExcelOne;
		TestCaseName = this.getClass().getSimpleName();

		SheetName = "TestCasesList";

		ToRunColumnNameTestCase = "CaseToRun";

		ToRunColumnNameTestData = "DataToRun";

		Add_Log.info(TestCaseName + " : Execution started.");

		if (!SuiteUtility.checkToRunUtility(FilePath, SheetName, ToRunColumnNameTestCase, TestCaseName)) {
			Add_Log.info(TestCaseName + " : CaseToRun = N for So Skipping Execution.");

			SuiteUtility.WriteResultUtility(FilePath, SheetName, "Pass/Fail/Skip", TestCaseName, "SKIP");

			throw new SkipException(
					TestCaseName + "'s CaseToRun Flag Is 'N' Or Blank. So Skipping Execution Of " + TestCaseName);
		}

		TestDataToRun = SuiteUtility.checkToRunUtilityOfData(FilePath, TestCaseName, ToRunColumnNameTestData);
	}

	/*****************************************
	 * Function to checkCaseToRun
	 * ************************************************** Annotation
	 * : @Test(dataProvider="LoginData",priority=1)
	 * 
	 * DESCRIPTION : 1.To run particular function for test with priority 2.To
	 * provide data from dataset
	 * 
	 * 
	 * FUNCTION NAME : Login()
	 * 
	 * 
	 * DESCRIPTION : This function is used to 1.To pass test data from data
	 * provider 2.If found DataToRun = "N" for data set then execution will be
	 * skipped for that data set.
	 * 
	 * 
	 * HISTORY : AUTHOR DATE VERSION
	 * 
	 * CREATED BY : Vasanti 6-JUNE-2016 1.0
	 *
	 ***************************************** Function to checkCaseToRun
	 * 
	 * @throws Exception
	 **************************************************/

	@Test(dataProvider = "AdminData", priority = 1)
	public void AdminDetails(String driveName, String LoginID, String Password, String companyid, String Product, String browserName,
			String FirstName, String Surname, String EmailAddress, String PhoneNumber,String PersonCategory, String CompanyName, String CompanyAddress, String IdentificationNumber,
			String UserName, String Password1, String ConfirmPassword)
			throws Exception {

		DataSet++;
		// Created object of testng SoftAssert class.
		s_assert = new SoftAssert();
		// If found DataToRun = "N" for data set then execution will be skipped
		// for that data set.
		if (!TestDataToRun[DataSet].equalsIgnoreCase("Y")) {
			Add_Log.info(TestCaseName + " : DataToRun = N for data set line " + (DataSet + 1)
					+ " So skipping Its execution.");
			// If DataToRun = "N", Set Testskip=true.
			Testskip = true;
			throw new SkipException(
					"DataToRun for row number " + DataSet + " Is No Or Blank. So Skipping Its Execution.");
		}
		System.out.println("Value Of DataSet in UserData = " + DataSet);
		// If found DataToRun = "N" for data set then execution will be skipped
		// for that data set.
		if (!TestDataToRun[DataSet].equalsIgnoreCase("Y")) {
			// If DataToRun = "N", Set Testskip=true.
			Testskip = true;
			throw new SkipException(
					"DataToRun for row number " + DataSet + " Is No Or Blank. So Skipping Its Execution.");
		}

		System.out.println("Product " + Product);
		String Productwithoutspace = Product.replaceAll("\\s", "");

		// ==========Open Browser===========
		fn_browserinit(driveName,browserName);
		URLs Login = new URLs();
		Person AddPerson = new Person();
		Person EditPerson = new Person();
		UPSI AddUPSI=new UPSI();
		UPSI EditUPSI=new UPSI();
		Administration Roles=new Administration();
		
		CloseBrowser Logout = new CloseBrowser();

	

		// =================Fetch URL=================
		test = report.startTest("URLs");
		Login.Login(Productwithoutspace);
		// =================Login=================
		test = report.startTest("Login to the Company :- "+companyid);
		
		
		AddPerson.PersonAdd( driveName,  LoginID,  Password,  companyid,  Product,  browserName,
				 FirstName,  Surname,  EmailAddress,  PhoneNumber,PersonCategory,  CompanyName,  CompanyAddress,  IdentificationNumber,
				 UserName);
		
	/*	EditPerson.PersonEdit( driveName,  LoginID,  Password,  companyid,  Product,  browserName,
				 FirstName,  Surname,  EmailAddress,  PhoneNumber,PersonCategory,  CompanyName,  CompanyAddress,  IdentificationNumber,
				 UserName, Password1, ConfirmPassword);*/
		
		System.out.println("************** Add UPSI Fields ***************************");
		AddUPSI.AddUPSI( driveName,  LoginID,  Password,  companyid,  Product,  browserName,
				 FirstName,  Surname,  EmailAddress,  PhoneNumber,PersonCategory,  CompanyName,  CompanyAddress,  IdentificationNumber,
				 UserName);
		
	/*	EditUPSI.EditUPSI( driveName,  LoginID,  Password,  companyid,  Product,  browserName,
				 FirstName,  Surname,  EmailAddress,  PhoneNumber,PersonCategory,  CompanyName,  CompanyAddress,  IdentificationNumber,
				 UserName, Password1, ConfirmPassword);
		*/
		
	
	/*
	 * Roles.Roles(driveName, LoginID, ConfirmPassword, companyid,
	 * Productwithoutspace, browserName, FirstName, Surname, EmailAddress,
	 * PhoneNumber, PersonCategory, CompanyName, CompanyAddress,
	 * IdentificationNumber, UserName);
	 */
	  
	  // ========Close Browser=================
		
		 Logout.CloseBrowser1();
	  test = report.startTest("close browser"); 
	  
	 
	 
	}

	/*****************************************
	 * Function to checkCaseToRun
	 * ************************************************** Annotation
	 * : @DataProvider
	 * 
	 * DESCRIPTION :
	 * 
	 * 1.This data provider method will return 4 column's data one by one In
	 * every Iteration.
	 * 
	 * 
	 * FUNCTION NAME : LoginData()
	 * 
	 * 
	 * DESCRIPTION : This function is used to 1.To retrieve data from Data 1
	 * Column,Data 2 Column,Data 3 Column and Expected Result column of
	 * SuiteOneCaseOne data Sheet. Last two columns (DataToRun and
	 * Pass/Fail/Skip) are Ignored programatically when reading test data.
	 * 
	 * 
	 * 
	 * HISTORY : AUTHOR DATE VERSION
	 * 
	 * CREATED BY : Vasanti 6-JUNE-2016 1.0
	 *
	 ***************************************** Function to checkCaseToRun
	 **************************************************/

	@DataProvider
	public Object[][] AdminData() {

		return SuiteUtility.GetTestDataUtility(FilePath, TestCaseName);

	}

	/*****************************************
	 * Function to checkCaseToRun
	 * ************************************************** Annotation
	 * : @AfterMethod
	 * 
	 * DESCRIPTION :
	 * 
	 * 1.@AfterMethod method will be executed after execution of @Test method
	 * every time.
	 * 
	 * 
	 * FUNCTION NAME : reporterDataResults()
	 * 
	 * 
	 * DESCRIPTION : This function is used to
	 * 
	 * 1.It writes Pass/Fail/Skip in excel sheet
	 * 
	 * 
	 * HISTORY : AUTHOR DATE VERSION
	 * 
	 * CREATED BY : Vasanti 6-JUNE-2016 1.0
	 *
	 ***************************************** Function to checkCaseToRun
	 **************************************************/

	@AfterMethod
	public void reporterDataResults() {
		if (Testskip) {
			Add_Log.info(TestCaseName + " : Reporting test data set line " + (DataSet + 1) + " as SKIP In excel.");
			SuiteUtility.WriteResultUtility(FilePath, TestCaseName, "Pass/Fail/Skip", DataSet + 1, "SKIP");
		} else if (Testfail == true) {
			Add_Log.info(TestCaseName + " : Reporting test data set line " + (DataSet + 1) + " as FAIL In excel.");

			TestCasePass = false;

			SuiteUtility.WriteResultUtility(FilePath, TestCaseName, "Pass/Fail/Skip", DataSet + 1, "FAIL");

		} else {
			Add_Log.info(TestCaseName + " : Reporting test data set line " + (DataSet + 1) + " as PASS In excel.");

			SuiteUtility.WriteResultUtility(FilePath, TestCaseName, "Pass/Fail/Skip", DataSet + 1, "PASS");
		}

		Testskip = false;
		Testfail = false;

	}

	/*****************************************
	 * Function to checkCaseToRun
	 * ************************************************** Annotation
	 * : @AfterTest
	 * 
	 * DESCRIPTION :
	 * 
	 * 1.@AfterTest method will be executed after execution of all tests
	 * 
	 * 
	 * FUNCTION NAME : closeBrowser()
	 * 
	 * 
	 * DESCRIPTION : This function is used to
	 * 
	 * 1.To close browser
	 * 
	 * 
	 * HISTORY : AUTHOR DATE VERSION
	 * 
	 * CREATED BY : Vasanti 6-JUNE-2016 1.0
	 *
	 ***************************************** Function to checkCaseToRun
	 **************************************************/

	/*
	 * @AfterTest public void closeBrowser() { if (TestCasePass) {
	 * Add_Log.info(TestCaseName + " : Reporting test case as PASS In excel.");
	 * SuiteUtility.WriteResultUtility(FilePath, SheetName, "Pass/Fail/Skip",
	 * TestCaseName, "PASS"); } else { Add_Log.info(TestCaseName +
	 * " : Reporting test case as FAIL In excel.");
	 * SuiteUtility.WriteResultUtility(FilePath, SheetName, "Pass/Fail/Skip",
	 * TestCaseName, "FAIL");
	 * 
	 * }
	 * 
	 * }
	 */
	@AfterClass
	public static void endTest() {
		report.endTest(test);
		report.flush();
	}

}
