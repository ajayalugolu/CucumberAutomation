package TestSets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactList_TS 
{
	
	  WebDriver driver;
	  public ContactList_TS(WebDriver driver)
	  {
		  this.driver=driver;
	  }
	  public static By btn_newcontact=By.xpath("(//*[@title='New'])[1]");
	  public static By lbl_contactcount=By.xpath("//*[@class='countSortedByFilteredBy']");
}
