package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Locator {
	private static WebElement element = null;

	/*******************************************************************************************
	 * 
	 *                       
	 * HISTORY          :   AUTHOR                  	DATE            	VERSION
	 * 
	 * CREATED BY       :   Vasanti			6-JUNE-2016     	1.0
	 *
	 *******************************************************************************************/	

	//-------Login Locator-------

	public static WebElement LoginID(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//input[@placeholder='Email *']"));
		return element;
	}

	public static WebElement Password(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("//input[@placeholder='Password *']"));
		return element;
	}

	public static WebElement CompanyID(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//input[@name='sCompanyName']"));
		return element;
	}

	public static WebElement Login(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
		return element;
	}

	//-------Logout Locator-------

	public static WebElement Logout(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("//body/app-root[1]/ng-component[1]/div[1]/theme11-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/user-menu[1]/div[1]/div[1]/div[1]/span[2]/span[1]"));
		return element;
	}	
	
	public static WebElement FirstName(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("//input[@id='Name']"));
		return element;
	}
	

	public static WebElement Surname(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("//input[@id='Surname']"));
		return element;
	}
	
	public static WebElement EmailAddress(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("//input[@id='EmailAddress']"));
		return element;
	}
	
	public static WebElement PhoneNumber(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("//input[@id='PhoneNumber']"));
		return element;
	}
	
	public static WebElement PersonCategory(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("//select[@name='user.category']"));
		return element;
	}
	
	public static WebElement IdentificationType(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("//select[@name='user.idType']"));
		return element;
	}
	
	public static WebElement CompanyName(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("//input[@id='CompanyName']"));
		return element;
	}
	
	public static WebElement CompanyAddress(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("//input[@id='CompanyAddress']"));
		return element;
	}
	
	public static WebElement IdentificationNumber(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("//input[@id='IDNumber']"));
		return element;
	}
	
	public static WebElement PersonStatus(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("//select[@name='user.status']"));
		return element;
	}

	
	public static WebElement UserName(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("//input[@id='UserName']"));
		return element;
	}
	
	public static WebElement Save(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("//body/app-root[1]/ng-component[1]/div[1]/theme11-layout[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/ng-component[1]/div[1]/div[1]/createoreditusermodal[1]/div[1]/div[1]/div[1]/form[1]/div[3]/button[2]"));
		return element;
	}
	
	public static WebElement Password1(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("//input[@id='Password']"));
		return element;
	}
	
	public static WebElement ConfirmPassword(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("//input[@id='PasswordRepeat']"));
		return element;
	}
	
	//************************** UPSI ***********************************
	public static WebElement UPSI(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/app-root[1]/ng-component[1]/div[1]/theme11-layout[1]/div[1]/div[1]/div[1]/div[2]/top-bar-menu[1]/div[1]/div[2]/a[1]"));
        return element;
    }
	
		
	public static WebElement CreateNewUPSI(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//button[normalize-space()='Create new UPSI']"));
        return element;
    }

	
	public static WebElement SharedBy(WebDriver driver)
    {
        element = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/theme11-layout/div/div/div/div[3]/div/div/ng-component/div/div/div[1]/div[1]/div[2]/form/div[1]/div/p-autocomplete/span/input"));
        return element;
    }

 

public static WebElement SharedWith(WebDriver driver)
    {
        element = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/theme11-layout/div/div/div/div[3]/div/div/ng-component/div/div/div[1]/div[1]/div[2]/form/div[2]/div/p-autocomplete/span/ul/li/input"));
        return element;
    }

 

public static WebElement SharedWhen(WebDriver driver)
    {
        element = driver.findElement(By.xpath(".//*[@name='upsiItem.sharedWhen']"));
        return element;
    }

 

public static WebElement UPSICategory(WebDriver driver)
    {
        element = driver.findElement(By.xpath(".//*[@name='upsiItem.mstUPSIItemCategory']"));
        return element;
    }

 

public static WebElement UPSIPurpose(WebDriver driver)
    {
        element = driver.findElement(By.xpath(".//*[@name='upsiItem.mstUPSIItemPurpose']"));
        return element;
    }

 

public static WebElement CommunicationMode(WebDriver driver)
    {
        element = driver.findElement(By.xpath(".//*[@name='upsiItem.mstUPSIItemCommunicationMode']"));
        return element;
    }

 

public static WebElement UPSIStatus(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/app-root[1]/ng-component[1]/div[1]/theme11-layout[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/ng-component[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/select[1]"));
        return element;
    }

 

public static WebElement MentionedCompanyName(WebDriver driver)
    {
        element = driver.findElement(By.xpath(".//*[@id='UPSIItem_StatusRemark']"));
        return element;
    }

 

public static WebElement PublishedDate(WebDriver driver)
    {
        element = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/theme11-layout/div/div/div/div[3]/div/div/ng-component/div/div/div[1]/div[3]/div[2]/input"));
        return element;
    }

 

public static WebElement CommentEdit(WebDriver driver)
    {
        element = driver.findElement(By.cssSelector(".ql-editor.ql-blank"));
        return element;
    }

public static WebElement Comment(WebDriver driver)
{
    element = driver.findElement(By.xpath("//body/app-root[1]/ng-component[1]/div[1]/theme11-layout[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/ng-component[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/p-editor[1]/div[1]/div[2]/div[1]"));
    return element;
}

 

public static WebElement BackBtn(WebDriver driver)
    {
        element = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/theme11-layout/div/div/div/div[3]/div/div/ng-component/div/div/sub-header/div/div/div[2]/div/a/button"));
        return element;
    }

 

public static WebElement SaveBtn(WebDriver driver)
    {
        element = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/theme11-layout/div/div/div/div[3]/div/div/ng-component/div/div/div[2]/div/button"));
        return element;
    }
	
	
public static WebElement Administration(WebDriver driver)
{
    element = driver.findElement(By.xpath("//body/app-root[1]/ng-component[1]/div[1]/theme11-layout[1]/div[1]/div[1]/div[1]/div[2]/top-bar-menu[1]/div[1]/div[5]/span[1]/span[1]"));
    return element;
}

public static WebElement Roles(WebDriver driver)
{
    element = driver.findElement(By.xpath("//body/app-root[1]/ng-component[1]/div[1]/theme11-layout[1]/div[1]/div[1]/div[1]/div[2]/top-bar-menu[1]/div[1]/div[5]/div[1]/div[1]/div[1]/a[1]/span[1]"));
    return element;
}
	
public static WebElement CreateNewRoles(WebDriver driver)
{
    element = driver.findElement(By.xpath("//sub-header/div[1]/div[1]/div[2]/div[1]/button[1]"));
    return element;
}

public static WebElement RoleName(WebDriver driver)
{
    element = driver.findElement(By.xpath("//input[@id='RoleDisplayName']"));
    return element;
}




}
