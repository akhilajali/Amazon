package com.amazon.QA.TestCases;

import java.io.IOException;

import org.junit.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.amazon.QA.BaseClass.BaseClass;
import com.amazon.QA.PageObject.SoftwareHomePagePageObjects;
import com.amazon.QA.PageObject.Launch_Login_PageObjects;
import com.amazon.QA.TestData.Dataproviderdata;

public class SoftwareHomePageTC  extends BaseClass
{
	  Launch_Login_PageObjects llpo;
	  SoftwareHomePagePageObjects bafo;
	
  @BeforeMethod	
  @Test
  public void CreateObjects() throws IOException 
  {
	  llpo = new Launch_Login_PageObjects();
	  bafo = new SoftwareHomePagePageObjects();
  }
  
  @Test(priority=0)
  public void lauchandloginmethod()
  {
	  llpo.Lauchurl();
	  llpo.LoginPage();
  }
  
  @Test(priority=1 , dataProvider="ValidTestDataForAmazonsoftwareHomePage",dataProviderClass=Dataproviderdata.class)
  public void searchItemForValidInputforSoftwarepage(String data)
  {
	  bafo.vailddataforsoftware(data);
  }
  
  @Test(priority=2, dataProvider="InvaildtestDataAmazonSoftwarepage",dataProviderClass=Dataproviderdata.class)
  public void searchforinvaildInputforSoftwarepage(String data) throws Exception              
  {
		bafo.invailddataforsoftware(data);
  }
 
}













