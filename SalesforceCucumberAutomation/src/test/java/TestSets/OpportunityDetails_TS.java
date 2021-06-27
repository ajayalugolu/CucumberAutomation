package TestSets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpportunityDetails_TS 
{
	WebDriver driver;
	public OpportunityDetails_TS(WebDriver driver)
	{
		this.driver=driver;
	}
	public static By lbl_opportunitydetails=By.xpath("//*[@class='entityNameTitle slds-line-height--reset']");
}
