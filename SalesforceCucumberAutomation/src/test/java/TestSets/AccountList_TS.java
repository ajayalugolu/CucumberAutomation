package TestSets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountList_TS 
{
  WebDriver driver;
  public AccountList_TS(WebDriver driver)
  {
	  this.driver=driver;
  }
  public static By btn_newaccount=By.xpath("(//*[@title='New'])[1]");
  public static By lbl_accountcount=By.xpath("//*[@class='countSortedByFilteredBy']");
}

