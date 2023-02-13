package com.amazon.QA.TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.QA.BaseClass.BaseClass;
import com.amazon.QA.PageObject.Launch_Login_PageObjects;
import com.amazon.QA.PageObject.Software_ListPageObjects;

public class Software_ListTC extends BaseClass
{
	Launch_Login_PageObjects llpo;
	Software_ListPageObjects slo;
	
  @BeforeMethod
  @Test
  public void CreateObjects() throws Exception 
  {
	  llpo = new Launch_Login_PageObjects();
	  slo =  new Software_ListPageObjects();	  
  }
  
  @Test
  public void launchurl()
  {
	  llpo.Lauchurl();
  }
  @Test
  public void listofsoftwares()
  {
	  slo.listofSoftwareinaccounts();
  }
}
