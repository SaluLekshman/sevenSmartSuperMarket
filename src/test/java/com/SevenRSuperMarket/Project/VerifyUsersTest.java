package com.SevenRSuperMarket.Project;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.SevenRSuperMarket.Project.Resources.LoginPage;
import com.SevenRSuperMarket.Project.Resources.VerifyUsersPage;

import Utilities.ExcelUtility;

public class VerifyUsersTest extends Base{
	VerifyUsersPage  verifyuserpage;
	LoginPage loginpage;
	@Test
	public void verifyUsers() throws IOException
	{
		loginpage=new LoginPage(driver);
		String usernameInput=ExcelUtility .getString(0,0,System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestDatas.xlsx","login");
	    String PasswordInput=ExcelUtility .getString(0,1,System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestDatas.xlsx","login");
	    loginpage.userNameElement(usernameInput);
		loginpage.passwordElement(PasswordInput);
		verifyuserpage=new VerifyUsersPage(driver);
		boolean actualvalue=verifyuserpage.verifyUserElementIsEnabled();
		assertTrue(actualvalue,"verify users button is not enabled");
		boolean  value=verifyuserpage.verifyUsersSearchButtonElement();
	}
}
