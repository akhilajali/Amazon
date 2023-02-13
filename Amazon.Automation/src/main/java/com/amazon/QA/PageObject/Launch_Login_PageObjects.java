package com.amazon.QA.PageObject;

import java.io.IOException;
import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.amazon.QA.BaseClass.BaseClass;

public class Launch_Login_PageObjects extends BaseClass
{
    public Launch_Login_PageObjects() throws IOException
    {
    	PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//a[@class='nav-a nav-a-2   nav-progressive-attribute']//descendant::span[@id='nav-link-accountList-nav-line-1']")
    private WebElement hellosignin;
    
    @FindBy(xpath="//div[@id='nav-al-signin']//descendant::span[@class='nav-action-inner']")
    private WebElement siginbuttonbeforegivingemailid; 
    
    @FindBy(id="ap_email")
    private WebElement emailOrPhoneNumber;
    
    @FindBy(id="continue")
    private WebElement contineButton;
    
    @FindBy(xpath="//div[@class='a-section a-spacing-large']//child::input[@type='password']")
    private WebElement passwordtextbox;
    
    @FindBy(xpath="//span[@class='a-button-inner']//child::input[@id='signInSubmit']")
    private WebElement signinbutton;
   
    /*
     * Author : Akhila 
     * Date  :
     * Description: Giving input through Config Properties
     */
    public void Lauchurl()
    {
    	try 
    	{
    	   driver.get(prop.getProperty("istURL"));
    	}
    	catch(Exception obj)
    	{
    		obj.printStackTrace();
    	}
    	String actualreult = driver.getTitle();
    	String Expectedresult = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
    	softassert.assertEquals(actualreult, Expectedresult,"title mismtached for url");
    	softassert.assertAll();
    }
    /*
     * Author:Akhila 
     * Date:
     * Description:Giving moile number and password through config properties
     */
    public void LoginPage()
    {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	Actions act1 = new Actions(driver);
    	act1.moveToElement(hellosignin).build().perform();
    	siginbuttonbeforegivingemailid.click();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	emailOrPhoneNumber.sendKeys(prop.getProperty("istUserName"));
    	contineButton.click();
    	passwordtextbox.sendKeys(prop.getProperty("istPassWord"));
    	signinbutton.click();
    	String actualresult = driver.getTitle();
    	String expectedresult = "Amazon Sign In";
    	softassert.assertEquals(actualresult, expectedresult,"Amazon Sigin home page mismatched");
    	softassert.assertAll();
    }
}
