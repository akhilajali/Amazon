package com.amazon.QA.TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.QA.BaseClass.BaseClass;
import com.amazon.QA.PageObject.Launch_Login_PageObjects;

public class LaunchLoginSearchProducts_TC  extends BaseClass
{
	
	public LaunchLoginSearchProducts_TC() throws IOException
	{
		super();
	}
	Launch_Login_PageObjects llpo;
	
	
	@BeforeMethod
	@Test
	public void CreateObjects() throws Exception
	{
			llpo = new Launch_Login_PageObjects();
	}
	
	@Test(priority=1)
	public void launchLogin()
	{
		llpo.Lauchurl();
	}	
	
	@Test(priority=2)
	public void loginpage()
	{
		llpo.LoginPage();
	}
	public void display()
	{
		System.out.println("This is first commit by vanitha");
	}
}



