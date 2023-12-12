package TestScripts;

import BaseClasses.Admin_BaseClass;

public class WindowHandle extends Admin_BaseClass{
	public void WindowHandleClk()
	{
		String winHandleBefore0 = driver.getWindowHandle();

		for (String winHandle : driver.getWindowHandles()) 
		{
			driver.switchTo().window(winHandle);
		}
		driver.close();

		driver.switchTo().window(winHandleBefore0);
	}
}