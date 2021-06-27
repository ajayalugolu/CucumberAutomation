package TestSets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpportunityList_TS 
{
	WebDriver driver;
	public OpportunityList_TS(WebDriver driver)
	{
		this.driver=driver;
	}
	public static By btn_newopportunity=By.xpath("(//*[@title='New'])[1]");
	public static By lbl_opportunitycount=By.xpath("//*[@class='countSortedByFilteredBy']");

}
