package com.SevenRSuperMarket.Project.Resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class PushNotificationPage {
	public WebDriver driver;
	 public PushNotificationPage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 
	}
	 @FindBy(xpath="//p[text()='Push Notifications']") static WebElement pushNotificationElement;
	 @FindBy(xpath="//input[@id='title']") WebElement enterTitleElement;
	 @FindBy(xpath="//input[@id='description']") WebElement descriptionElement;
	 @FindBy(xpath="//button[@name='create']") WebElement sendElement;
	 public void pushNotificationelement()
	 {
		 PageUtility.clickOnElement(pushNotificationElement);
		 driver.switchTo().alert().accept();
		 
	 }
	 public void enterTitleElement()
	 {
		 driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/list-notifications");
		 PageUtility.enterText(enterTitleElement, "hai").click();
		 driver.switchTo().alert().sendKeys("hai");
	
	 }
	 public void descriptionElement()
	 {
		 PageUtility.enterText(descriptionElement, "how r u");
		 driver.switchTo().alert().sendKeys("how r u");
	 }
	 
	public void sendElement()
	{
		PageUtility.clickOnElement(sendElement);
		driver.switchTo().alert().accept();
	}

}
