package com.amazon.QA.Util;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import com.amazon.QA.BaseClass.BaseClass;


public class StaticReUseMethods extends BaseClass
{
	/* This function will take screenshot
	* @param webdriver
	* @param fileWithPath
	* @throws Exception
	*/
	public static void takeSnapShot(WebDriver webdriver,String filename) throws Exception
	{
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File("D:\\AmazonAutomation\\ScreenShots\\"+filename);
		//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}
	
	/// generate unique randam number generator
	public static int generateRandom()
	{
	    
	      int min = 50; // Minimum value of range
	      int max = 100; // Maximum value of range
	      // Print the min and max  
	      //System.out.println("Random value in int from "+ min + " to " + max + ":");
	      // Generate random int value from min to max
	      int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
	      // Printing the generated random numbers
	      return random_int;    
	}
	
	 public static void raiseAssertForDataInSearchBox(String data)
	  {
		 String resultString = data;
		  Pattern p = Pattern.compile("[0-9]+");
		  Matcher m = p.matcher(data);
		  int count=0;
		  while(m.find())
		  {
			  count++;
		  }
		 String expectedResult ="Pass", actualResult="Pass";
		  if(count==0 || data.contains("No")==true)
			  actualResult="Fail";
				try 
				{
					takeSnapShot(driver, generateRandom()+"test.png");
				} 
				catch (Exception e)
				{	
					e.printStackTrace();
				}
			SoftAssert softassert = new SoftAssert();
			softassert.assertEquals(actualResult,expectedResult," Test Case Failed For Invalid Input "+ data);
			softassert.assertAll();
		  
	  }
}
