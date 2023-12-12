package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;
import Locators.Login_Locator;

public class Person extends Vigilante_Admin{
	public void PersonAdd(String driveName, String LoginID, String Password, String companyid, String Product, String browserName,
			String FirstName, String Surname, String EmailAddress, String PhoneNumber,String PersonCategory, String CompanyName, String CompanyAddress, String IdentificationNumber,
			String UserName) throws Exception
	{	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='(Change)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='SwitchToTenant']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='tenancyNameInput']")).sendKeys("UPSIQA");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary fw-bold save-button']")).click();
		Thread.sleep(5000);
		
		//-------LoginID Enter-------
				Boolean UPSILoginID = driver.findElements(By.xpath("//input[@placeholder='Email *']")).size() != 0;
				System.out.println("LoginID" + UPSILoginID);
				if(UPSILoginID==true)
				{
					Login_Locator.LoginID(driver).clear();
					Thread.sleep(2000);
					Login_Locator.LoginID(driver).sendKeys(LoginID);
					Thread.sleep(2000);
					System.out.println(LoginID);
					test.log(LogStatus.PASS, "LoginID Entered");
				}
				else
				{
					test.log(LogStatus.FAIL, "LoginID Not Entered"+ test.addScreenCapture(Screenshot.captureImage(driver)));
				}

				//-------Password Enter-------
				Boolean UPSIPassword = driver.findElements(By.xpath("//input[@placeholder='Password *']")).size() != 0;
				System.out.println("Password" + UPSIPassword);
				if(UPSIPassword==true)
				{
					Thread.sleep(2000);
					Login_Locator.Password(driver).sendKeys(Password);
					System.out.println(Password);
					test.log(LogStatus.PASS, "Password Entered");
				}
				else
				{
					test.log(LogStatus.FAIL, "Password Not Entered"+ test.addScreenCapture(Screenshot.captureImage(driver)));
				}
		
		/*//-------Company ID Enter-------
		Boolean VigilanteCompanyID = driver.findElements(By.xpath("//input[@name='sCompanyName']")).size() != 0;
		System.out.println("CompanyID" + VigilanteCompanyID);
		if(VigilanteCompanyID==true)
		{
			Login_Locator.CompanyID(driver).clear();
			Thread.sleep(2000);
			Login_Locator.CompanyID(driver).sendKeys(companyid);
			Thread.sleep(2000);
			System.out.println(companyid);
			test.log(LogStatus.PASS, "CompanyID "+companyid+" Entered");
		}
		else
		{
			test.log(LogStatus.FAIL, "CompanyID "+companyid+" Not Entered"+ test.addScreenCapture(Screenshot.captureImage(driver)));
		}
*/
		
		

		//-------Login Button Click-------
		Boolean Login = driver.findElements(By.xpath("//button[normalize-space()='Log in']")).size() != 0;
		System.out.println("Login" + Login);
		if(Login==true)
		{
			Login_Locator.Login(driver).click();
			Thread.sleep(7000);
			test.log(LogStatus.PASS, "Login button Clicked");
		}
		else
		{
			test.log(LogStatus.FAIL, "Login button Not Clicked"+ test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		driver.findElement(By.xpath("//button[normalize-space()='Add New Person']")).click();
		Thread.sleep(2000);
		System.out.println("************** Add Person Fields ***************************");
		Login_Locator.FirstName(driver).sendKeys(FirstName);
		System.out.println("  FirstName Length: "+Login_Locator.FirstName(driver).getAttribute("maxlength"));
		Thread.sleep(1000);
		Login_Locator.Surname(driver).sendKeys(Surname);
		System.out.println("  Surname Length: "+Login_Locator.Surname(driver).getAttribute("maxlength"));
		Thread.sleep(1000);
		Login_Locator.EmailAddress(driver).sendKeys(EmailAddress);
		System.out.println("  EmailAddress Length: "+Login_Locator.EmailAddress(driver).getAttribute("maxlength"));
		Thread.sleep(1000);
		Login_Locator.PhoneNumber(driver).sendKeys(PhoneNumber);
		System.out.println("  PhoneNumber Length: "+Login_Locator.PhoneNumber(driver).getAttribute("maxlength"));
		Thread.sleep(1000);
		Login_Locator.PersonCategory(driver).sendKeys(PersonCategory);
		Thread.sleep(1000);
		Login_Locator.IdentificationType(driver).sendKeys("Adhaar");
		Thread.sleep(1000);		
		Login_Locator.CompanyName(driver).sendKeys(CompanyName);
		System.out.println("  CompanyName Length: "+Login_Locator.CompanyName(driver).getAttribute("maxlength"));
		Thread.sleep(1000);
		Login_Locator.CompanyAddress(driver).sendKeys(CompanyAddress);
		System.out.println("  CompanyAddress Length: "+Login_Locator.CompanyAddress(driver).getAttribute("maxlength"));
		Thread.sleep(1000);
		Login_Locator.IdentificationNumber(driver).sendKeys(IdentificationNumber);
		System.out.println("  IdentificationNumber Length: "+Login_Locator.IdentificationNumber(driver).getAttribute("maxlength"));
		Thread.sleep(1000);
		Login_Locator.UserName(driver).click();
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//input[@id='UserName']"));

		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		
		Login_Locator.PersonStatus(driver).sendKeys("Active");
		Thread.sleep(1000);
		Login_Locator.UserName(driver).sendKeys(UserName);
		System.out.println("  UserName Length: "+Login_Locator.UserName(driver).getAttribute("maxlength"));
		Thread.sleep(2000);
		
		  Login_Locator.Save(driver).click(); Thread.sleep(5000);
		 
			/*
			 * driver.findElement(By.xpath(
			 * "//body/app-root[1]/ng-component[1]/div[1]/theme11-layout[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/ng-component[1]/div[1]/div[1]/createoreditusermodal[1]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]"
			 * )).click(); Thread.sleep(5000);
			 */
		
		System.out.println("***************************************************");
		
	}
	
	public void PersonEdit(String driveName, String LoginID, String Password, String companyid, String Product, String browserName,
			String FirstName, String Surname, String EmailAddress, String PhoneNumber,String PersonCategory, String CompanyName, String CompanyAddress, String IdentificationNumber,
			String UserName,String Password1, String ConfirmPassword) throws Exception
	{	
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		
		String FirstNameLength=Login_Locator.FirstName(driver).getAttribute("value");
		System.out.println("Entered FirstNameLength Length: "+FirstNameLength.length());
		Login_Locator.FirstName(driver).clear();
		Thread.sleep(1000);
		Login_Locator.FirstName(driver).sendKeys(FirstName);
		System.out.println("Expected FirstName Length: "+Login_Locator.FirstName(driver).getAttribute("maxlength"));
		
		Thread.sleep(1000);
		String LastNameLength=Login_Locator.Surname(driver).getAttribute("value");
		System.out.println("Entered SurnameLength Length: "+LastNameLength.length());
		Login_Locator.Surname(driver).clear();
		Thread.sleep(1000);
		Login_Locator.Surname(driver).sendKeys(Surname);
		System.out.println("Expected Surname Length: "+Login_Locator.Surname(driver).getAttribute("maxlength"));
		
		Thread.sleep(1000);
		String EmailAddresslength=Login_Locator.EmailAddress(driver).getAttribute("value");
		System.out.println("Entered EmailAddress Length: "+EmailAddresslength.length());
		Login_Locator.EmailAddress(driver).clear();
		Thread.sleep(1000);
		Login_Locator.EmailAddress(driver).sendKeys(EmailAddress);
		System.out.println("Expected EmailAddress Length: "+Login_Locator.EmailAddress(driver).getAttribute("maxlength"));
	
		Thread.sleep(1000);
		String PhoneNolength=Login_Locator.PhoneNumber(driver).getAttribute("value");
		System.out.println("Entered PhoneNumber Length: "+PhoneNolength.length());
		Login_Locator.PhoneNumber(driver).clear();
		Thread.sleep(1000);
		Login_Locator.PhoneNumber(driver).sendKeys(PhoneNumber);
		System.out.println("Expected PhoneNumber Length: "+Login_Locator.PhoneNumber(driver).getAttribute("maxlength"));
		
		Thread.sleep(1000);
		Login_Locator.PersonCategory(driver).sendKeys(PersonCategory);
		
		Thread.sleep(1000);
		String CompanyNameLength=Login_Locator.CompanyName(driver).getAttribute("value");
		System.out.println("Entered CompanyName Length: "+CompanyNameLength.length());
		Login_Locator.CompanyName(driver).clear();
		Thread.sleep(1000);
		Login_Locator.CompanyName(driver).sendKeys(CompanyName);
		System.out.println("Expected CompanyName Length: "+Login_Locator.CompanyName(driver).getAttribute("maxlength"));
		
		Thread.sleep(1000);
		String CompanyAddressLength=Login_Locator.CompanyAddress(driver).getAttribute("value");
		System.out.println("Entered CompanyAddress Length: "+CompanyAddressLength.length());
		Login_Locator.CompanyAddress(driver).clear();
		Thread.sleep(1000);
		Login_Locator.CompanyAddress(driver).sendKeys(CompanyAddress);
		System.out.println("Expected CompanyAddress Length: "+Login_Locator.CompanyAddress(driver).getAttribute("maxlength"));
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
		Thread.sleep(2000);
		Login_Locator.IdentificationType(driver).sendKeys("Adhaar");
		Thread.sleep(1000);
		
		String IdentificationNumberLength=Login_Locator.IdentificationNumber(driver).getAttribute("value");
		System.out.println("Entered IdentificationNumber Length: "+IdentificationNumber.length());
		Login_Locator.IdentificationNumber(driver).clear();
		Thread.sleep(1000);
		Login_Locator.IdentificationNumber(driver).sendKeys(IdentificationNumber);
		System.out.println("Expected IdentificationNumber Length: "+Login_Locator.IdentificationNumber(driver).getAttribute("maxlength"));
		
		Thread.sleep(1000);
		String UserNameLength=Login_Locator.UserName(driver).getAttribute("value");
		System.out.println("Entered UserName Length: "+UserNameLength.length());
		Login_Locator.UserName(driver).clear();
		Thread.sleep(1000);
		
		WebElement element = driver.findElement(By.xpath("//input[@id='UserName']"));
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		
		Login_Locator.PersonStatus(driver).sendKeys("Active");
		Thread.sleep(1000);
		Login_Locator.UserName(driver).sendKeys(UserName);
		System.out.println("Expected UserName Length: "+Login_Locator.UserName(driver).getAttribute("maxlength"));
		
		Thread.sleep(2000);
		Login_Locator.Password1(driver).sendKeys(Password1);
		String Password1Length=Login_Locator.Password1(driver).getAttribute("value");
		System.out.println("Entered Password Length: "+Password1Length.length());
		System.out.println("Expected Password Length: "+Login_Locator.Password1(driver).getAttribute("maxlength"));
		
		
		Thread.sleep(2000);
		Login_Locator.ConfirmPassword(driver).sendKeys(Password1);
		String ConfirmPasswordLength=Login_Locator.ConfirmPassword(driver).getAttribute("value");
		System.out.println("Entered ConfirmPassword Length: "+ConfirmPasswordLength.length());
		Thread.sleep(1000);
		System.out.println("Expected ConfirmPassword Length: "+Login_Locator.ConfirmPassword(driver).getAttribute("maxlength"));
		
		Thread.sleep(2000);
		Login_Locator.Save(driver).click();
		Thread.sleep(1000);
		
		
		
		
	}
	
	
	
}


