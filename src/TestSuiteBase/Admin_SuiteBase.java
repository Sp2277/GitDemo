package TestSuiteBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Utility.Read_XLS;
import jxl.Sheet;
import jxl.Workbook;

public class Admin_SuiteBase {
	public static Read_XLS TestSuiteListExcel = null;
	public static Read_XLS TestCaseListExcelOne = null;
	public static Read_XLS TestCaseListExcelTwo = null;
	public static WebDriverWait wait;
	public static WebDriver driver;
	public static Logger Add_Log = null;
	public static String ExcelVestingDateMonthText;
	
	public static ExtentTest test;
	public static ExtentReports report = new ExtentReports(System.getProperty("user.dir")+"\\src\\Reports\\ExtentReportResults.html");
	
	/*****************************************
	 * Function to init **************************************************
	 * FUNCTION NAME : init()
	 * 
	 * DESCRIPTION : This function is used to 1. To initialise excel path
	 * 2.Dynamically it select excel file location of the drive
	 * 
	 * 
	 * 
	 * 
	 * HISTORY : AUTHOR DATE VERSION
	 * 
	 * CREATED BY : Vasanti 6-JUNE-2016 1.0
	 *
	 ***************************************** Function to init
	 **************************************************/


	public void init() throws IOException {
		Add_Log = Logger.getLogger("rootLogger");
		TestSuiteListExcel = new Read_XLS(System.getProperty("user.dir") + "\\src\\ Excels\\TestSuiteList.xls");
		TestCaseListExcelOne = new Read_XLS(System.getProperty("user.dir") + "\\src\\Excels\\Vigilante_Admin.xls");
		TestCaseListExcelTwo = new Read_XLS(System.getProperty("user.dir") + "\\src\\Excels\\Login.xls");		
	}

	
	public void fn_browserinit(String driveName,String browserName) throws Exception {
		

		if (browserName.equalsIgnoreCase("Firefox")) 
		{
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			 wait = new WebDriverWait(driver,120);
		} else if (browserName.equalsIgnoreCase("chrome"))
		{
			String exePath = driveName+":\\MyInsider Automation Testing\\driver\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			String downloadPath=driveName+":\\Testing Team Automation\\VigilanteAdmin_SanityTesting\\Download";
			 HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		        chromePrefs.put("profile.default_content_settings.popups", 0);
		        chromePrefs.put("download.default_directory", downloadPath);
		        ChromeOptions options = new ChromeOptions();
		        //options.setExperimentalOption("prefs", chromePrefs);
		         driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			 wait = new WebDriverWait(driver,120);
		}
			else if (browserName.equalsIgnoreCase("IE")) 
		{
			System.setProperty("webdriver.ie.driver",
					driveName+":\\Testing Team Automation\\driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			 wait = new WebDriverWait(driver,120);
		}
	
	
	/******************************************************************************************
	 * HISTORY : AUTHOR DATE VERSION
	 * 
	 * CREATED BY : Vasanti 6-JUNE-2016 1.0
	 *
	 *******************************************************************************************/
	}
	
}
