package com.SevenRSuperMarket.Test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.SevenRSuperMarket.Pages.HamburgerMenuPage;
import com.SevenRSuperMarket.Pages.ManagrUsersPage;
import com.SevenRSuperMarket.Pages.Verify_LoginPage;

import Utilities.ExcelUtility;

public class ManageUsersTest extends Base {
	String actualBorderColor="rgb(255, 193, 7)";
	String expectedBackGroundColor="rgba(0, 123, 255, 1)";
	HamburgerMenuPage hamburgermenupage;
    ManagrUsersPage manageuserspage;
	Verify_LoginPage verifyloginpage;
	Verify_LoginPage loginpage;
	@Test
	public void manageUsersSearchButtonBackGround() throws IOException
	{
		  String usernameInput=ExcelUtility.getString(1,0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"loginData");
		  String PasswordInput=ExcelUtility.getString(1,1,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"loginData");
		  String inputMainMenu=ExcelUtility.getString(0,0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"hamBurgerMenuData");
		  loginpage=new Verify_LoginPage(driver);
		  loginpage.userNameElement(usernameInput);
		  loginpage.passwordElement(PasswordInput);
		  loginpage.signInElement();
		  hamburgermenupage=new HamburgerMenuPage(driver);
		  hamburgermenupage.selectMenu(inputMainMenu);
		  //driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/list-user");
		  manageuserspage=new ManagrUsersPage(driver);
	      String actualBackgroundColor= manageuserspage.searchButtonElement();
	      assertEquals(actualBackgroundColor,expectedBackGroundColor,"The background color is not"+expectedBackGroundColor);
	     
		
	}
	@Test
	public void manageUsersResetButtonBorderColor() throws IOException
	{
		  loginpage=new Verify_LoginPage(driver);
		  verifyloginpage=new Verify_LoginPage(driver);
		  String usernameInput=ExcelUtility.getString(1,0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"loginData");
		  String PasswordInput=ExcelUtility.getString(1,1,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"loginData");;
		  loginpage.userNameElement(usernameInput);
		  loginpage.passwordElement(PasswordInput);
		  loginpage.signInElement();
		  driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/list-user");
		  manageuserspage=new ManagrUsersPage(driver);
		  String actualBorderColor= manageuserspage.resetButtonElement();
		  assertEquals(actualBorderColor,actualBorderColor,"The border color is not blue");
		  
	}
}
