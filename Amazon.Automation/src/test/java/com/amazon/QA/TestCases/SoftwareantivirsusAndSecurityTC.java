package com.amazon.QA.TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.QA.BaseClass.BaseClass;
import com.amazon.QA.PageObject.Launch_Login_PageObjects;
import com.amazon.QA.PageObject.SoftwareAntivirsusAndSecurity;

public class SoftwareantivirsusAndSecurityTC extends BaseClass
{
	Launch_Login_PageObjects llpo;
	SoftwareAntivirsusAndSecurity sas;
	
  @BeforeMethod
  @Test
  public void f() throws Exception
  {
	  llpo = new Launch_Login_PageObjects();
  }
  @Test
  public void launchapp()
  {
	llpo.Lauchurl();  
  }
  @Test
  public void antivirsusandsecurity()
  {
	  sas.antivirsussecuritymethod();
  }
}
