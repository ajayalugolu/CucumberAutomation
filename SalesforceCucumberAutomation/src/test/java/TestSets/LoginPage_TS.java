package TestSets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_TS 
{
	      WebDriver driver;
	      public LoginPage_TS(WebDriver driver)
	      {
		     this.driver=driver;
	      }
	       public By txt_username=By.xpath("//*[@id='username']");
	       public  By txt_password=By.xpath("//*[@id='password']");
	       public  By btn_login=By.xpath("//*[@id='Login']");
	
}

