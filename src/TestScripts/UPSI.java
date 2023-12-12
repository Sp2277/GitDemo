package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Locators.Login_Locator;

public class UPSI extends Vigilante_Admin {
	public void AddUPSI(String driveName, String LoginID, String Password, String companyid, String Product,
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
		Login_Locator.UPSI(driver).click();
		Thread.sleep(2000);
		Login_Locator.CreateNewUPSI(driver).click();
		Thread.sleep(2000);
		Login_Locator.SharedBy(driver).sendKeys("shekhar@esopdirect.com");
		System.out.println("Shared BY Length: " + Login_Locator.SharedBy(driver).getAttribute("maxlength"));
		Thread.sleep(1000);
		Login_Locator.SharedWith(driver).click();
		Thread.sleep(2000);
		Login_Locator.SharedWith(driver).sendKeys("s");
		Thread.sleep(5000);
		System.out.println("Shared With Length: " + Login_Locator.SharedWith(driver).getAttribute("maxlength"));
		driver.findElement(By.xpath("//span[contains(text(),'shubham@esopdirect.com')]")).click();
		Thread.sleep(1000);
		Login_Locator.SharedWhen(driver).sendKeys("8/23/2023, 2:17 PM");
		Thread.sleep(1000);

		Login_Locator.UPSICategory(driver).sendKeys("Diviend");
		Thread.sleep(1000);
		Login_Locator.UPSIPurpose(driver).sendKeys("Audit Purpose");
		Thread.sleep(1000);

		Thread.sleep(1000);
		Login_Locator.CommunicationMode(driver).sendKeys("Verbal");
		((JavascriptExecutor) driver).executeScript("window.scrollTo(250, document.body.scrollHeight)");
		Thread.sleep(2000);
		Login_Locator.UPSIStatus(driver).sendKeys("Reviewed");
		Thread.sleep(1000);
		Login_Locator.MentionedCompanyName(driver).sendKeys(CompanyAddress);
		Thread.sleep(1000);
		System.out.println("Company Name Length: " + Login_Locator.MentionedCompanyName(driver).getAttribute("maxlength"));
		Login_Locator.PublishedDate(driver).sendKeys("8/23/2023, 2:17 PM");
		Thread.sleep(1000);
		Login_Locator.Comment(driver).sendKeys(CompanyName);
		Thread.sleep(3000);
		System.out.println("Comment Length: " + Login_Locator.Comment(driver).getAttribute("maxlength"));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(-500, document.body.scrollHeight)");
		Thread.sleep(3000);
		/*
		 * driver.findElement(By.xpath(
		 * "//sub-header/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")).click();
		 * Thread.sleep(3000);
		 */
		
		  Login_Locator.SaveBtn(driver).click(); Thread.sleep(5000);
		 
	}

	public void EditUPSI(String driveName, String LoginID, String Password, String companyid, String Product,
			String browserName, String FirstName, String Surname, String EmailAddress, String PhoneNumber,
			String PersonCategory, String CompanyName, String CompanyAddress, String IdentificationNumber,
			String UserName, String Password1, String ConfirmPassword) throws Exception {

		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		System.out.println("************** Add UPSI Fields ***************************");
		String SharedByLength = Login_Locator.SharedBy(driver).getAttribute("value");
		System.out.println("Expected SharedBy Length: " + SharedByLength.length());
		Thread.sleep(1000);
		System.out.println("Entered SharedBy Length: " + Login_Locator.SharedBy(driver).getAttribute("maxlength"));
		Login_Locator.SharedBy(driver).clear();
		Login_Locator.SharedBy(driver).sendKeys("shekhar@esopdirect.com");
		Thread.sleep(1000);

		String SharedWithLength = Login_Locator.SharedWith(driver).getAttribute("value");
		System.out.println("Expected SharedWith Length: " + SharedWithLength.length());
		Thread.sleep(1000);
		System.out.println("Entered SharedWith Length: " + Login_Locator.SharedWith(driver).getAttribute("maxlength"));
		Thread.sleep(2000);
		Login_Locator.SharedWhen(driver).sendKeys("8/23/2023, 2:17 PM");
		Thread.sleep(1000);

		Login_Locator.UPSICategory(driver).sendKeys("Diviend");
		Thread.sleep(1000);
		Login_Locator.UPSIPurpose(driver).sendKeys("Audit Purpose");
		Thread.sleep(1000);

		Thread.sleep(1000);
		Login_Locator.CommunicationMode(driver).sendKeys("Verbal");
		((JavascriptExecutor) driver).executeScript("window.scrollTo(250, document.body.scrollHeight)");
		Thread.sleep(1000);
		Login_Locator.UPSIStatus(driver).sendKeys("Reviewed");
		Thread.sleep(1000);

		String MentionedCompanyNameLength = Login_Locator.MentionedCompanyName(driver).getAttribute("value");
		System.out.println("Expected MentionedCompanyName Length: " + MentionedCompanyNameLength.length());
		Thread.sleep(1000);
		System.out.println("Entered MentionedCompanyName: "+ Login_Locator.MentionedCompanyName(driver).getAttribute("maxlength"));
		Login_Locator.SharedWith(driver).clear();
		Login_Locator.MentionedCompanyName(driver).sendKeys(CompanyAddress);
		System.out.println("Company Name Length: " + Login_Locator.CommentEdit(driver).getAttribute("maxlength"));
		Thread.sleep(1000);
		Login_Locator.PublishedDate(driver).sendKeys("8/23/2023, 2:17 PM");
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(100, document.body.scrollHeight)");
		Thread.sleep(1000);
		System.out.println("Entered Comment Length: " + Login_Locator.CommentEdit(driver).getAttribute("maxlength"));
		Login_Locator.CommentEdit(driver).sendKeys(CompanyName);
		Thread.sleep(1000);
		//((JavascriptExecutor) driver).executeScript("window.scrollTo(-500, document.body.scrollHeight)");

     	Login_Locator.SaveBtn(driver).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//sub-header/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")).click();
		Thread.sleep(3000);
		System.out.println("**************************************************");
	}

}
