package com.amazon.QA.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.module.ModuleDescriptor.Exports;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass
{
	public static WebDriver driver;
    public static String  propetiespath="D:\\AmazonAutomation\\Amazon.Automation\\src\\main\\java\\com\\amazon\\QA\\config\\config.properties";
    public  static Properties prop;
    public SoftAssert softassert;
    public  Actions action1;
    public static Exports extentReports;
    public BaseClass() 
    {
    	try
    	{
	    	File fi= new File(propetiespath);
	    	FileInputStream fis = new FileInputStream(fi);
	    	prop = new Properties();
	    	try 
	    	{
				prop.load(fis);
			}
	    	catch (IOException e) 
	    	{
				e.printStackTrace();
			}   	
    	}
    	catch(FileNotFoundException fnf)
    	{
    		fnf.printStackTrace();
    	}	
    }
    
  @BeforeSuite      
  public void intalize()
  {
	 if(prop.getProperty("browsertoexecute").equalsIgnoreCase("chrome")==true)
	 {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	 }
	 else if(prop.getProperty("browsertoexecute").equalsIgnoreCase("firefox")==true)
	 {
		 WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
	 }
	 else if(prop.getProperty("browsertoexecute").equalsIgnoreCase("edge")==true)
	 {
		 WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
	 }
	 else if(prop.getProperty("browsertoexecute").equalsIgnoreCase("ie")==true)
	 {
		 WebDriverManager.iedriver().setup();
		 driver = new InternetExplorerDriver();
	 }	
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  }
  
  @AfterSuite
  public void closingbrowser()
  {
	 // extentReports.flush();
	  driver.close();
	
  }
 
}
