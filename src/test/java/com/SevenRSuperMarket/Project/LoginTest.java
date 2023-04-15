package com.SevenRSuperMarket.Project;

import java.io.IOException;

import org.testng.annotations.Test;

import com.SevenRSuperMarket.Project.Resources.LoginPage;

import Utilities.ExcelUtility;



public class LoginTest extends Base
{
	LoginPage loginpage;
	@Test
	public void login() throws IOException
	{
		String usernameInput=ExcelUtility .getString(0,0,System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestDatas.xlsx","login");
		String PasswordInput =ExcelUtility .getString(0,1,System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestDatas.xlsx","login");
		loginpage=new LoginPage(driver);
		loginpage.userNameElement(usernameInput);
		loginpage.passwordElement(PasswordInput);
		loginpage.signInElement();
		
	}

}
