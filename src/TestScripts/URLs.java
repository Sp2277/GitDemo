package TestScripts;

import java.util.concurrent.TimeUnit;
import com.relevantcodes.extentreports.LogStatus;

public class URLs extends Vigilante_Admin{

	public void Login(String Productwithoutspace) throws Exception
	{

		if (Productwithoutspace.equals("UAT2")) 
		{
			driver.get("https://upsiqa.myinsider.co.in/account/login");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String URL=driver.getCurrentUrl();

			if(URL.equals("https://upsiqa.myinsider.co.in/account/login"))
			{
				test.log(LogStatus.PASS, "Navigated to the Cloud URL");
			}
			else
			{
				test.log(LogStatus.FAIL, "Not Navigated to the Cloud URL"+ test.addScreenCapture(Screenshot.captureImage(driver)));
			}
		}
	}
}