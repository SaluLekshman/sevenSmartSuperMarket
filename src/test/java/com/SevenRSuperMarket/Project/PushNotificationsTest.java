package com.SevenRSuperMarket.Project;

import java.io.IOException;
import org.testng.annotations.Test;

import com.SevenRSuperMarket.Project.Resources.LoginPage;
import com.SevenRSuperMarket.Project.Resources.PushNotificationPage;

import Utilities.ExcelUtility;

public class PushNotificationsTest extends Base {
	PushNotificationPage pushnotificationpage;
	LoginPage loginpage;
	
	
	@Test
	public void pushNotifications() throws IOException
	{
		loginpage=new LoginPage(driver);
		String usernameInput=ExcelUtility .getString(0,0,System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestDatas.xlsx","login");
	    String PasswordInput=ExcelUtility .getString(0,1,System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestDatas.xlsx","login");
	    loginpage.userNameElement(usernameInput);
		loginpage.passwordElement(PasswordInput);
		pushnotificationpage=new PushNotificationPage( driver);
		pushnotificationpage.pushNotificationelement();
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/list-notifications");
		pushnotificationpage.enterTitleElement();
		pushnotificationpage.descriptionElement();
		pushnotificationpage.sendElement();
		
		
		
	}
}
