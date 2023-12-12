package TestScripts;

import org.junit.Test;
import org.openqa.selenium.By;
import com.relevantcodes.extentreports.LogStatus;
import Locators.Login_Locator;

public class CloseBrowser extends Vigilante_Admin {

	@Test
	public void CloseBrowser1() throws InterruptedException {

		try 
		{
			//-------Logout Link Click-------
			Boolean Logout = driver.findElements(By.xpath("//body/app-root[1]/ng-component[1]/div[1]/theme11-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/user-menu[1]/div[1]/div[1]/div[1]/span[2]/span[1]")).size() != 0;
			System.out.println("Logout" + Logout);
			if (Logout == true) 
			{
				Login_Locator.Logout(driver).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
				Thread.sleep(2000);
				test.log(LogStatus.PASS, "Logout Link Clicked");
				driver.close();
			} 
			else 
			{
				test.log(LogStatus.FAIL, "Logout Link Not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}

			driver.close();
			Thread.sleep(6000);	
		}

		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}