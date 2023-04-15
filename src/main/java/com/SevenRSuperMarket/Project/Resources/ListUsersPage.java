package com.SevenRSuperMarket.Project.Resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ListUsersPage {
public WebDriver driver;
	
	public ListUsersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//a[@href='javascript:void(0)']") WebElement searchButtonElement;
@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']") WebElement resetButtonElement;

public void searchButtonElement()
{
	PageUtility. stylePropertyValidation(searchButtonElement, "background-color");
	PageUtility. stylePropertyValidation(searchButtonElement, "color");
	PageUtility. stylePropertyValidation(searchButtonElement, "border-color");
	
	
}
public void resetButtonElement()
{
	PageUtility.stylePropertyValidation(resetButtonElement, "background-color");
	PageUtility. stylePropertyValidation(resetButtonElement, "color");
	PageUtility. stylePropertyValidation(resetButtonElement, "border-color");
}



}
