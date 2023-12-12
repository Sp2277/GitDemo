package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Locators.Login_Locator;

public class Administration extends Vigilante_Admin {
	public void Roles(String driveName, String LoginID, String Password, String companyid, String Product,
			String browserName, String FirstName, String Surname, String EmailAddress, String PhoneNumber,
			String PersonCategory, String CompanyName, String CompanyAddress, String IdentificationNumber,
			String UserName) throws Exception {
		/*
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//a[normalize-space()='(Change)']")).click();
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//input[@name='SwitchToTenant']")).click();
		 * Thread.sleep(1000);
		 * driver.findElement(By.xpath("//input[@id='tenancyNameInput']")).sendKeys(
		 * "UPSIVAPT"); Thread.sleep(2000); driver.findElement(By.
		 * xpath("//button[@class='btn btn-primary fw-bold save-button']")).click();
		 * Thread.sleep(5000);
		 * 
		 * //-------LoginID Enter------- Boolean UPSILoginID =
		 * driver.findElements(By.xpath("//input[@placeholder='Email *']")).size() != 0;
		 * System.out.println("LoginID" + UPSILoginID); if(UPSILoginID==true) {
		 * Login_Locator.LoginID(driver).clear(); Thread.sleep(2000);
		 * Login_Locator.LoginID(driver).sendKeys(LoginID); Thread.sleep(2000);
		 * System.out.println(LoginID); test.log(LogStatus.PASS, "LoginID Entered"); }
		 * else { test.log(LogStatus.FAIL, "LoginID Not Entered"+
		 * test.addScreenCapture(Screenshot.captureImage(driver))); }
		 * 
		 * //-------Password Enter------- Boolean UPSIPassword =
		 * driver.findElements(By.xpath("//input[@placeholder='Password *']")).size() !=
		 * 0; System.out.println("Password" + UPSIPassword); if(UPSIPassword==true) {
		 * Thread.sleep(2000); Login_Locator.Password(driver).sendKeys(Password);
		 * System.out.println(Password); test.log(LogStatus.PASS, "Password Entered"); }
		 * else { test.log(LogStatus.FAIL, "Password Not Entered"+
		 * test.addScreenCapture(Screenshot.captureImage(driver))); }
		 * 
		 * //-------Company ID Enter------- Boolean VigilanteCompanyID =
		 * driver.findElements(By.xpath("//input[@name='sCompanyName']")).size() != 0;
		 * System.out.println("CompanyID" + VigilanteCompanyID);
		 * if(VigilanteCompanyID==true) { Login_Locator.CompanyID(driver).clear();
		 * Thread.sleep(2000); Login_Locator.CompanyID(driver).sendKeys(companyid);
		 * Thread.sleep(2000); System.out.println(companyid); test.log(LogStatus.PASS,
		 * "CompanyID "+companyid+" Entered"); } else { test.log(LogStatus.FAIL,
		 * "CompanyID "+companyid+" Not Entered"+
		 * test.addScreenCapture(Screenshot.captureImage(driver))); }
		 * 
		 * 
		 * 
		 * 
		 * //-------Login Button Click------- Boolean Login =
		 * driver.findElements(By.xpath("//button[normalize-space()='Log in']")).size()
		 * != 0; System.out.println("Login" + Login); if(Login==true) {
		 * Login_Locator.Login(driver).click(); Thread.sleep(7000);
		 * test.log(LogStatus.PASS, "Login button Clicked"); } else {
		 * test.log(LogStatus.FAIL, "Login button Not Clicked"+
		 * test.addScreenCapture(Screenshot.captureImage(driver))); }
		 * 
		 */
		Thread.sleep(3000);
		Login_Locator.Administration(driver).click();
		Thread.sleep(2000);
		Login_Locator.Roles(driver).click();
		Thread.sleep(2000);		
		Login_Locator.CreateNewRoles(driver).click();
		Thread.sleep(2000);
		System.out.println("Role Name Length" + Login_Locator.RoleName(driver).getAttribute("maxlength"));
		
		
	}



}
