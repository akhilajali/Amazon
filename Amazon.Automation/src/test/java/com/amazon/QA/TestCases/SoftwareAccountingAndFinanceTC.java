package com.amazon.QA.TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.QA.BaseClass.BaseClass;
import com.amazon.QA.PageObject.Launch_Login_PageObjects;
import com.amazon.QA.PageObject.SoftwareAccountingAndFinancePageObject;

public class SoftwareAccountingAndFinanceTC extends BaseClass
{
	Launch_Login_PageObjects llpo;
	SoftwareAccountingAndFinancePageObject saf;
  @BeforeMethod
  @Test
  public void f() throws Exception
  {
	  llpo = new Launch_Login_PageObjects();
	  saf = new SoftwareAccountingAndFinancePageObject();  
  }
  @Test(priority=0)
  public void lauchapp()
  {
	  llpo.Lauchurl();
  }
  @Test(priority=1)
  public void accountingfinance()
  {
	 saf.accountingfinanacemethod(); 
	 saf.businessaccountingmethod();
	 saf.inventorymanageentmethod();
	 saf.personalfinancemethod();
  }
  
}
