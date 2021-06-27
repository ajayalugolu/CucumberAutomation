package TestSets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MasterPage_TS 
{
	WebDriver driver;
	public MasterPage_TS(WebDriver driver)
	{
		this.driver=driver;
	}
	public By lbl_homepage=By.xpath("//*[@class='appName slds-context-bar__label-action slds-context-bar__app-name']");
	public By lnkbtn_accounts=By.xpath("//*[@data-id='Account']");
	public By lnkbtn_opportunities=By.xpath("//*[@data-id='Opportunity']");
	public By lnkbtn_contacts=By.xpath("(//*[@class='navItem slds-context-bar__item slds-shrink-none'])[3]");
	public By lnkbtn_leads=By.xpath("(//*[@class='navItem slds-context-bar__item slds-shrink-none'])[4]");
	public By img_options=By.xpath("(//*[@class='uiImage'])[1]");
	public By lnk_logout=By.xpath("//*[@class='profile-link-label logout uiOutputURL' and @dir='ltr']");
	

}

