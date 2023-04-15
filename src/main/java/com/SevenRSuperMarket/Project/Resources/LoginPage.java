package com.SevenRSuperMarket.Project.Resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;
import Utilities.WaitUtility;


public class LoginPage {
 public WebDriver driver ;
 public LoginPage(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	 
}
 @FindBy (xpath="//input[@type='text']") WebElement usernameElement;
 @FindBy(xpath="//input[@type='password']") WebElement passwordElement;
 @FindBy(xpath="//button[text()='Sign In']") WebElement signInElement;
 
 public void userNameElement(String usernameInput)
 {
	 WaitUtility.waitForElement(driver,usernameElement);
	 PageUtility.enterText(usernameElement, usernameInput);
 }
 public void passwordElement(String PasswordInput)
 {
	 WaitUtility.waitForElement(driver, passwordElement); 
	 PageUtility.enterText(passwordElement,PasswordInput) ;
	 
 }
 public void signInElement()
 {
	 WaitUtility.waitForElementClickable(driver, signInElement);
	 PageUtility.clickOnElement(signInElement);
 }
}
