package TestSets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDetails_TS 
{
	WebDriver driver;
	public AccountDetails_TS(WebDriver driver)
	{
		this.driver=driver;
	}
	public static By lbl_accountdetails=By.xpath("//*[@class='entityNameTitle slds-line-height--reset']");
}
