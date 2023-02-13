package com.amazon.QA.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.amazon.QA.BaseClass.BaseClass;

public class SoftwareBusinessAndOfficePageObject extends BaseClass
{
    public SoftwareBusinessAndOfficePageObject()
    {
    	PageFactory.initElements(driver, null);
    }
    
    @FindBy(xpath="//div[@class='nav-search-field ']//descendant::input[@id='twotabsearchtextbox']")
    private WebElement searchbox;
    
    @FindBy(xpath="//span[@class='a-list-item']//descendant::span[text()='Business & Office']")
    private WebElement businessandoffice;
    
    @FindBy(xpath="//span[@class='a-list-item']//descendant::span[text()='Business Tools Training']//ancestor::li//a[@class='a-color-base a-link-normal']")
    private WebElement businesstoolsandtrainings;
    
    @FindBy(xpath="//span[@class='a-list-item']//descendant::span[text()='Communication']//ancestor::li//a[@class='a-color-base a-link-normal']")
    private WebElement communication;
    
    @FindBy(xpath="//span[@class='a-list-item']//descendant::span[text()='Office Suites']//ancestor::li//a[@class='a-color-base a-link-normal']")
    private WebElement officesuites;
    
    @FindBy(xpath="//span[@class='a-list-item']//descendant::span[text()='Voice Recognition']//ancestor::li//a[@class='a-color-base a-link-normal']")
    private WebElement voicerecognition;
    
    public void businessandoffice()
    {
    	WebElement dropdownforallCatergrioes = driver.findElement(By.id("searchDropdownBox"));
		Select select1= new Select(dropdownforallCatergrioes);
        select1.selectByVisibleText("Software");
        searchbox.clear();
        businessandoffice.click();
    }
    public void businesstoolsandtrainings()
    {
    	WebElement dropdownforallCatergrioes = driver.findElement(By.id("searchDropdownBox"));
		Select select1= new Select(dropdownforallCatergrioes);
        select1.selectByVisibleText("Software");
        searchbox.clear();
        businesstoolsandtrainings.click();
    }
    
    
}
