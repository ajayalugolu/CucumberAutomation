package TestSets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccount_TS 
{
	WebDriver driver;
	public CreateAccount_TS(WebDriver driver)
	{
		this.driver=driver;
	}
    public static By txt_accountname=By.xpath("(//input[@type='text'])[4]");
    public static By txt_accountaddress=By.xpath("//*[@placeholder='Billing Street']");
    public static By btn_saveaccount=By.xpath("//*[@type='button' and @title='Save']");
}
