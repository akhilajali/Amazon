package com.amazon.QA.PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.amazon.QA.BaseClass.BaseClass;

public class Software_ListPageObjects  extends BaseClass
{
	public int i  =0;
	 public Software_ListPageObjects()
     {
  	   PageFactory.initElements(driver, this);
     }
     @FindBy(xpath="//div[@class='nav-search-field ']//descendant::input[@id='twotabsearchtextbox']")
     private WebElement searchbox;
     
     @FindBy(xpath="//input[@type='submit']//ancestor::span[@id='nav-search-submit-text']")
     private WebElement mirrorimage;
     
     public void listofSoftwareinaccounts()
     {
    	 
    	 WebElement dropdownforallCatergrioes = driver.findElement(By.id("searchDropdownBox"));
		 Select select1= new Select(dropdownforallCatergrioes);
         select1.selectByVisibleText("Software");
  	     searchbox.sendKeys("tally software");
  	     mirrorimage.click(); 
  	     List<WebElement> listofSoftwares = driver.findElements(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']//a//descendant::span[@class='a-size-medium a-color-base a-text-normal']"));
  	     int count = listofSoftwares.size();
  	     System.out.println(count);
  	     for( i=0;i<count;i++)
  	     {
  	    	 if(i==2) 
  	    	 {
  	    	      System.out.println(listofSoftwares.get(i).getText());
  	    	 }
  	     }
     }
}
