package com.SevenRSuperMarket.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.SevenRSuperMarket.Pages.PushNotificationPage;
import com.SevenRSuperMarket.Pages.Verify_LoginPage;

import Utilities.ExcelUtility;

public class PushNotificationsTest extends Base {
	
	PushNotificationPage pushnotificationpage;
	Verify_LoginPage loginpage;
	
	
	@Test
	@Parameters({"usernameInput","PasswordInput"})
	public void pushNotifications(String usernameInput,String PasswordInput) throws IOException 
	{
		String expectedAlertMessage="×\r\n"
				+ "Alert!\r\n"
				+ "Message send successfully";
		loginpage=new Verify_LoginPage(driver);
	    loginpage.userNameElement(usernameInput);
		loginpage.passwordElement(PasswordInput);
		loginpage.signInElement();
		pushnotificationpage=new PushNotificationPage( driver);
		pushnotificationpage.ClickOnpushNotificationelement();
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/list-notifications");
		pushnotificationpage.enterTitleElement();
		pushnotificationpage.descriptionElement();
		pushnotificationpage.sendElement();
		String actualAlertMessageText=pushnotificationpage.getTextalertMessageElement();
		boolean actualAlertMessageIsDisplayed=pushnotificationpage.alertMessageElementIsDisplayed();
		//assertEquals(actualAlertMessageText,expectedAlertMessage,"The alert message  send is incorrect ");
		assertTrue(actualAlertMessageIsDisplayed,"The alert message is not displayed");
		
		
		
	}
}
