package com.amazon.QA.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.amazon.QA.BaseClass.BaseClass;

public class SoftwareAntivirsusAndSecurity extends BaseClass
{
	public SoftwareAntivirsusAndSecurity()
	{
		PageFactory.initElements(driver, null);
	}
	@FindBy(xpath="//div[@class='nav-search-field ']//descendant::input[@id='twotabsearchtextbox']")
    private WebElement searchbox;
	
	@FindBy(xpath="//span[@class='a-list-item']//descendant::span[text()='Antivirus & Security']")
    private WebElement antivirsussecurity;
  
  public void antivirsussecuritymethod()
  {
	  WebElement dropdownforallCatergrioes = driver.findElement(By.id("searchDropdownBox"));
	  Select select1= new Select(dropdownforallCatergrioes);
      select1.selectByVisibleText("Software");
      searchbox.sendKeys(Keys.ENTER);
      antivirsussecurity.click();
  }
}
