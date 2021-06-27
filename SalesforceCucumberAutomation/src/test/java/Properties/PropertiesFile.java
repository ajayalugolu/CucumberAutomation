package Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import StepDefinitions.SalesforceAutomation;

public class PropertiesFile 
{
	static Properties prop;
	static String projectpath;
	static File scrpath;
	
	public static void getProp() throws IOException
	{
		try
		{
		prop=new Properties();
		projectpath=System.getProperty("user.dir");
		InputStream input= new FileInputStream(projectpath + "/src/test/java/Properties/config.properties");
		scrpath=new File(projectpath+"screenshotpath");
		prop.load(input);
		String url=prop.getProperty("url");
		SalesforceAutomation.url=url;
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
