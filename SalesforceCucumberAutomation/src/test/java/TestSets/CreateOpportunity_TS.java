package TestSets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateOpportunity_TS
{
	WebDriver driver;
	public CreateOpportunity_TS(WebDriver driver)
	{
		this.driver=driver;
	}
    public static By txt_opportunityname=By.xpath("//*[@type='text' and @name='Name']");
    public static By txt_accountsearch=By.xpath("(//input[@type='text'])[7]");
    public static By dat_closeddate=By.xpath("(//*[@class='slds-form-element__control slds-input-has-icon slds-input-has-icon_right'])[1]");
    public static By drp_opptstage=By.xpath("(//*[@class='slds-input slds-combobox__input'])[2]");
    public static By btn_saveoppt=By.xpath("(//*[@class='slds-button-group-item visible'])[3]");
}
