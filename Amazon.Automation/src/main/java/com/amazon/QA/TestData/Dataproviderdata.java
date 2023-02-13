package com.amazon.QA.TestData;

import org.testng.annotations.DataProvider;

public class Dataproviderdata
{
	@DataProvider(name="ValidTestDataForAmazonsoftwareHomePage")
	  public Object[] validdataforAmazonLaunchpad() 
	  {
		  Object[] validdata = new Object[2];
		  
		  try
		  {
			  validdata[0]="tallySoftware";
			  validdata[1]="Childrenssoftware";
		  }
		  catch(Throwable e)
		  {
			  e.printStackTrace();
		  }
		  
		  return validdata;
	  }	
	
	@DataProvider(name="InvaildtestDataAmazonSoftwarepage")
	  public Object[] invaliddataforAmazonLaunchpad() 
	  {
		  Object[] invaliddata = new Object[2];
		  
		  try
		  {
			  invaliddata[0]="liijijbvgvhbjhb";
			  invaliddata[1]="867484andnwjndkjwi";
		  }
		  catch(Throwable e)
		  {
			  e.printStackTrace();
		  }
		  
		  return invaliddata;
	  }    
}
