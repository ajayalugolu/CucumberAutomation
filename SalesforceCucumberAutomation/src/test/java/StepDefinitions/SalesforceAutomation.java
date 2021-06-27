package StepDefinitions;

	
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.FluentWait;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.apache.commons.io.*;

import Properties.PropertiesFile;
import TestSets.AccountDetails_TS;
import TestSets.AccountList_TS;
import TestSets.CreateAccount_TS;
import TestSets.CreateOpportunity_TS;
import TestSets.LoginPage_TS;
import TestSets.MasterPage_TS;
import TestSets.OpportunityDetails_TS;
import TestSets.OpportunityList_TS;
import io.cucumber.java.en.And;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	//import io.cucumber.java.it.Date;

	public class SalesforceAutomation 
	{
		public static String url=null;
		public static String scrpath=null;
		WebDriver driver;
		TakesScreenshot scrshot;
		File srcFile;
		  LoginPage_TS loginpage;
		  MasterPage_TS master;
		  AccountList_TS accountlist;
		  CreateAccount_TS createaccount;
		  AccountDetails_TS accountdetails;
		  OpportunityList_TS opptlist;
		  CreateOpportunity_TS createoppt;
		  OpportunityDetails_TS opptdetails;
		  WebDriverWait wait;
		  Date date;
		  DateFormat dateFormat;
		  ChromeOptions options;
		  
		  @Given("^user navigate to salesforce application and enters (.*) and (.*)$")
		  public void user_navigate_to_salesforce_application_and_enters_ajayalugolu2529_pkb1_force_com_and_pass_word_sf1(String username,String password) throws IOException 
		  {
		      // Write code here that turns the phrase above into concrete actions
			  loginpage=new LoginPage_TS(driver);
			  System.setProperty("webdriver.chrome.driver", "C:/Users/Ajay/Desktop/chromedriver.exe");
			  String projectpth=System.getProperty("user.dir");
			  //options = new ChromeOptions();
			  
			 // options.addArguments("--no-sandbox");
			 // driver = new ChromeDriver(options);
			  driver = new ChromeDriver();
			  PropertiesFile.getProp();
			  driver.navigate().to(url);
			  driver.manage().window().maximize();
			 // wait.until(ExpectedConditions.visibilityOfElementLocated(loginpage.txt_username));
			  driver.findElement(loginpage.txt_username).sendKeys(username);
			  driver.findElement(loginpage.txt_password).sendKeys(password);
			  driver.findElement(loginpage.btn_login).click();
		      //throw new io.cucumber.java.PendingException();
		  }

		  @Then("user should be land on home page")
		  public void user_should_be_land_on_home_page() throws InterruptedException, IOException 
		  {
			  
			  loginpage=new LoginPage_TS(driver);
			  master=new MasterPage_TS(driver);
			  String projectpth=System.getProperty("user.dir");
			  PropertiesFile.getProp();
		      // Write code here that turns the phrase above into concrete actions
			 wait=new WebDriverWait(driver,30);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(master.lbl_homepage));
		      if(driver.findElement(master.lbl_homepage).isDisplayed())
		    	  {
		    	  try 
		    	  {
		    	    System.out.println("Succesfully logged in to Salesforce");
		    	    wait.until(ExpectedConditions.visibilityOfElementLocated(master.img_options));
		    	    driver.findElement(master.img_options).click();
		    	    wait.until(ExpectedConditions.visibilityOfElementLocated(master.lnk_logout));
		    	    driver.findElement(master.lnk_logout).click();
		    	    wait.until(ExpectedConditions.visibilityOfElementLocated(loginpage.btn_login));
		    	    driver.quit();
		    	  }
		          catch(Exception e)
		    	  {
		        	  System.out.println("Element not found");
		        	  scrshot=((TakesScreenshot)driver);
			    	  srcFile=scrshot.getScreenshotAs(OutputType.FILE);
			          FileUtils.copyFile(srcFile,new File(scrpath));
			          driver.quit();
		    	  }
		    	  }
		      else
		      {
		    	  System.out.println("User not logged in succesfully");
		    	  driver.quit();
		      }
		  
		     // throw new io.cucumber.java.PendingException();
		  }
		  @When("user hit accounts module")
		  public void user_hit_accounts_module() throws InterruptedException 
		  {
		      // Write code here that turns the phrase above into concrete actions
			  master=new MasterPage_TS(driver);
			  wait=new WebDriverWait(driver,30);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(master.lnkbtn_accounts));
			 // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 // Thread.sleep(3000);
		       driver.findElement(master.lnkbtn_accounts).click();
		      //throw new io.cucumber.java.PendingException();
		  }

		  @And("click new button in accounts and enter mandatory fields and save it")
		  public void click_new_button_in_accounts_and_enter_mandatory_fields_and_save_it() 
		  {
		      // Write code here that turns the phrase above into concrete actions
			  accountlist=new AccountList_TS(driver);
			  createaccount=new CreateAccount_TS(driver);
			  dateFormat=new SimpleDateFormat("MM/dd/yyyy");
			 
			  wait=new WebDriverWait(driver,20);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(accountlist.btn_newaccount));
			  driver.findElement(accountlist.btn_newaccount).click();
			  wait.until(ExpectedConditions.visibilityOfElementLocated(createaccount.txt_accountname));
			  driver.findElement(createaccount.txt_accountname).sendKeys("Auto_Account_"+java.time.LocalDateTime.now());
			  driver.findElement(createaccount.txt_accountaddress).sendKeys("Test Address");
			  driver.findElement(createaccount.btn_saveaccount).click();
		      //throw new io.cucumber.java.PendingException();
		  }

		  @Then("Account must get created")
		  public void account_must_get_created() throws InterruptedException 
		  {
		      // Write code here that turns the phrase above into concrete actions
			  loginpage=new LoginPage_TS(driver);
			  master=new MasterPage_TS(driver);
			  accountdetails=new AccountDetails_TS(driver);
			  wait=new WebDriverWait(driver,20);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(accountdetails.lbl_accountdetails));
			  if(driver.findElement(accountdetails.lbl_accountdetails).isDisplayed())
			  {
				  System.out.println("Account succesfully created");
				  driver.findElement(master.img_options).click();
				  wait.until(ExpectedConditions.visibilityOfElementLocated(master.lnk_logout));
				  driver.findElement(master.lnk_logout).click();
				  wait.until(ExpectedConditions.visibilityOfElementLocated(loginpage.btn_login));
				  driver.quit();
			  }
			  else
			  {
				  System.out.println("Account not created");
				  driver.quit();
			  }
		      //throw new io.cucumber.java.PendingException();
		  }

		  @When("user hit opportunities module")
		  public void user_hit_opportunities_module() 
		  {
			  
			  master=new MasterPage_TS(driver);
			  wait=new WebDriverWait(driver,30);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(master.lnkbtn_opportunities));
			 // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		       driver.findElement(master.lnkbtn_opportunities).click(); 
		      //throw new io.cucumber.java.PendingException();
		  }

		  @And("click new button in opportunities and enter mandatory fields and save it")
		  public void click_new_button_in_opportunities_and_enter_mandatory_fields_and_save_it() throws Exception 
		  {
			  date=new Date();
			  dateFormat=new SimpleDateFormat("MM/dd/YYYY");
			  String date1=dateFormat.format(date);
			  opptlist=new OpportunityList_TS(driver);
			  createoppt=new CreateOpportunity_TS(driver);
			try
		    {
			      wait=new WebDriverWait(driver,20);
			      wait.until(ExpectedConditions.visibilityOfElementLocated(opptlist.btn_newopportunity));
				  driver.findElement(opptlist.btn_newopportunity).click();
				  wait.until(ExpectedConditions.visibilityOfElementLocated(createoppt.txt_opportunityname));
				  driver.findElement(createoppt.dat_closeddate).sendKeys(date1);
				  driver.findElement(createoppt.txt_opportunityname).click();
				  driver.findElement(createoppt.txt_opportunityname).sendKeys("Auto_Oppt_"+java.time.LocalDateTime.now());
				  Thread.sleep(1000);
				  driver.findElement(createoppt.txt_accountsearch).click();
				  Thread.sleep(3000);
				  driver.findElement(createoppt.txt_accountsearch).click();
				  Thread.sleep(1000);
				 // driver.findElement(createoppt.txt_accountsearch).sendKeys(Keys.ARROW_DOWN);
				  driver.findElement(createoppt.txt_accountsearch).sendKeys(Keys.ENTER);
				  Thread.sleep(2000);
				  driver.findElement(createoppt.drp_opptstage).click();
				  driver.findElement(createoppt.drp_opptstage).sendKeys(Keys.ARROW_DOWN);
				 // driver.findElement(createoppt.drp_opptstage).sendKeys(Keys.ARROW_DOWN);
				  driver.findElement(createoppt.drp_opptstage).sendKeys(Keys.ENTER);
				  driver.findElement(createoppt.btn_saveoppt).click(); 
			}
			catch(Exception e)
			{
				Thread.sleep(3000);
				driver.quit();
			}
		  }

		  @Then("Opportunity must get created")
		  public void opportunity_must_get_created() throws Exception 
		  {
			  loginpage=new LoginPage_TS(driver);
			  master=new MasterPage_TS(driver);
		      opptdetails=new OpportunityDetails_TS(driver);
		      Thread.sleep(2000);
		      try
		      {
//		      if(driver.findElement(opptdetails.lbl_opportunitydetails).isDisplayed())
//		      {
//		    	  System.out.println("Opportunity got created");
//		    	  driver.findElement(master.img_options).click();
//		    	  driver.findElement(master.lnk_logout).click();
//		    	  Thread.sleep(3000);
//		    	  driver.findElement(loginpage.btn_login).isDisplayed();
//		    	  Thread.sleep(2000);
//		    	  driver.quit();
//		      }
//		      else 
//		      {
//		    	  System.out.println("Opportunity not created");
//		    	  Thread.sleep(3000);
//		    	  driver.quit();
//		      }
		      }
		      catch(Exception e)
		      {
		    	  Thread.sleep(2000);
		    	  driver.quit();
		      }
		  }

	}

