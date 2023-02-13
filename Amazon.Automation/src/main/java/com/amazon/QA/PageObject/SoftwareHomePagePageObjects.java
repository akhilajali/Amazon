package com.amazon.QA.PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import com.amazon.QA.BaseClass.BaseClass;
import com.amazon.QA.Util.StaticReUseMethods;

public class SoftwareHomePagePageObjects extends BaseClass
{
       public SoftwareHomePagePageObjects()
       {
    	   PageFactory.initElements(driver, this);
       }
     //  @FindBy(xpath="//select[@aria-describedby='searchDropdownDescription']")
      // private WebElement dropdownforallCatergrioes;
      
       @FindBy(xpath="//div[@class='nav-search-field ']//descendant::input[@id='twotabsearchtextbox']")
       private WebElement searchbox;
       
       @FindBy(xpath="//input[@type='submit']//ancestor::span[@id='nav-search-submit-text']")
       private WebElement mirrorimage;
       
       @FindBy(xpath="//div[@class='sg-col-inner']//descendant::span[contains(text(),'results')]")
       private WebElement resultsForSearchProduct;
       
      
       /*
        * Author:Akhia
        * Date: feb,8.
        * Description:This method will search the products for vaild data in software module
        */ 
       
	   public void vailddataforsoftware(String data)
       {
		   WebElement dropdownforallCatergrioes = driver.findElement(By.id("searchDropdownBox"));
		   Select select1= new Select(dropdownforallCatergrioes);
           select1.selectByVisibleText("Software");
           searchbox.clear();
    	   searchbox.sendKeys(data);
    	   mirrorimage.click(); 
    	  
    	   List<WebElement>  listoflinksinsoftware =driver.findElements(By.xpath("//li//ancestor::ul[@aria-labelledby='n-title']//child::li"));
    	   int count = listoflinksinsoftware.size();
    	   for(int i=0;i<count;i++)
    	   {
    		  listoflinksinsoftware.get(i).isDisplayed();
    	   }  
    	   StaticReUseMethods.raiseAssertForDataInSearchBox(resultsForSearchProduct.getText());
       }
       /*
        * Author:Akhia
        * Date:feb,8.
        * Description:This method will search for invaild data in Software module
        */
       public void invailddataforsoftware(String data) throws Exception
       {   
    	   try
    	   {
    		   WebElement dropdownforallCatergrioes = driver.findElement(By.id("searchDropdownBox"));
    		   Select select1= new Select(dropdownforallCatergrioes);
               select1.selectByVisibleText("Software");
               searchbox.clear();
        	   searchbox.sendKeys(data);
        	   mirrorimage.click(); 
    		   StaticReUseMethods.raiseAssertForDataInSearchBox(resultsForSearchProduct.getText());
    	   }
    	   catch (Exception e)
    	   {
    			e.printStackTrace();
    	   }
       }
}
