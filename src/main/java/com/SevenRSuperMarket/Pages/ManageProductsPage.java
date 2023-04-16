package com.SevenRSuperMarket.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitUtility;
import Utilities.PageUtility;
public class ManageProductsPage {
	public WebDriver driver;
	
	 public ManageProductsPage (WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 
	}
	 @FindBy(xpath="//a[@class='active nav-link']") WebElement manageaproductElement;
	 @FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newElement;
	 @FindBy(xpath="//input[@id='title']") WebElement EnterTitleElement;
	 public void manageaproductElement()
	 {
		 WaitUtility.waitForElementClickable(driver,manageaproductElement );
		 PageUtility.clickOnElement(manageaproductElement);
	 }
	 public void newElement()
	 {
		 WaitUtility.waitForElementClickable(driver, newElement);
		 PageUtility.clickOnElement(newElement);
	 }
	 public void EnterTitleElement()
	 { 
		 
		 PageUtility.enterText(EnterTitleElement, "obsqura");
	 }
	 
	 
}
