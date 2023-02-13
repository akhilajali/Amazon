package com.amazon.QA.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.amazon.QA.BaseClass.BaseClass;

public class SoftwareAccountingAndFinancePageObject  extends BaseClass
{
     public SoftwareAccountingAndFinancePageObject()
     {
    	 PageFactory.initElements(driver, this);
     }
     @FindBy(xpath="//div[@class='nav-search-field ']//descendant::input[@id='twotabsearchtextbox']")
     private WebElement searchbox;
     
     @FindBy(xpath="//span[@class='a-list-item']//descendant::span[text()='Accounting & Finance']")
     private WebElement accountingfinancesoftware;
     
     @FindBy(xpath="//span[@class='a-list-item']//descendant::span[text()='Business Accounting']")
     private WebElement businessacoountingsoftware;
     
     @FindBy(xpath="//span[@class='a-list-item']//descendant::span[text()='Inventory Management']")
     private WebElement inventorymanagementsoftware;
     
     @FindBy(xpath="//span[@class='a-list-item']//descendant::span[text()='Personal Finance']")
     private WebElement personalfinanesoftware;
     
     public void accountingfinanacemethod()
     {
    	 WebElement dropdownforallCatergrioes = driver.findElement(By.id("searchDropdownBox"));
		 Select select1= new Select(dropdownforallCatergrioes);
         select1.selectByVisibleText("Software");
         searchbox.sendKeys(Keys.ENTER);
    	 accountingfinancesoftware.click();
     }
     
     public void businessaccountingmethod()
     {
    	 WebElement dropdownforallCatergrioes = driver.findElement(By.id("searchDropdownBox"));
		 Select select1= new Select(dropdownforallCatergrioes);
         select1.selectByVisibleText("Software"); 
         searchbox.sendKeys(Keys.ENTER);
         accountingfinancesoftware.click();
         businessacoountingsoftware.click();
     }
     
     public void inventorymanageentmethod()
     {
    	 WebElement dropdownforallCatergrioes = driver.findElement(By.id("searchDropdownBox"));
		 Select select1= new Select(dropdownforallCatergrioes);
         select1.selectByVisibleText("Software");
         searchbox.sendKeys(Keys.ENTER);
         accountingfinancesoftware.click();
         inventorymanagementsoftware.click();
     }
     public void personalfinancemethod()
     {
    	 WebElement dropdownforallCatergrioes = driver.findElement(By.id("searchDropdownBox"));
		 Select select1= new Select(dropdownforallCatergrioes);
         select1.selectByVisibleText("Software");
         searchbox.sendKeys(Keys.ENTER);
         accountingfinancesoftware.click();
         personalfinanesoftware.click();
     }
}












