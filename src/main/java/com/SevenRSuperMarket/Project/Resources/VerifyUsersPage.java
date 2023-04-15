package com.SevenRSuperMarket.Project.Resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;
import Utilities.WaitUtility;

public class VerifyUsersPage {
	public WebDriver driver ;
	 public VerifyUsersPage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		//input[@id="un"]
	}
	 @FindBy(xpath="//a[@class='active nav-lin']") WebElement verifyuserElement;
	 @FindBy(xpath="//a[@class=\"btn btn-rounded btn-primary\"]") static  WebElement verifyUserSearchButtonelement;
	 @FindBy(xpath="//input[@id=\"un\"]")
	static   WebElement enterNameElement;
	 public boolean verifyUserElementIsEnabled()
	 {
		 WaitUtility.waitForElement(driver,verifyuserElement );
		 return PageUtility.elementIsEnabled(verifyuserElement);
	 }
	 
	 public static  boolean verifyUsersSearchButtonElement() 
	 {
		
		 return PageUtility.isSelected( verifyUserSearchButtonelement);
	 }
	 public static void enterNameElement()
	 {
		 PageUtility.enterText(enterNameElement,"Rakhi Prasad");
	 }
}
