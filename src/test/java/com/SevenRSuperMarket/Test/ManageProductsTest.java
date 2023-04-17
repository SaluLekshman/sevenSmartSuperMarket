package com.SevenRSuperMarket.Test;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.SevenRSuperMarket.Pages.HamburgerMenuPage;
import com.SevenRSuperMarket.Pages.ManageProductsPage;
import com.SevenRSuperMarket.Pages.Verify_LoginPage;
import Utilities.ExcelUtility;

public class ManageProductsTest extends Base{
	private static final String PasswordInput = null;
	HamburgerMenuPage hamburgermenupage;
	ManageProductsPage manageproductpage;
	Verify_LoginPage loginpage;
	
	@Test(groups = {"regression" })
	@Parameters({"usernameInput","PasswordInput"})
	public void manageProducts(String usernameInput,String PasswordInput) throws IOException 
	{
	    String inputMainMenu=ExcelUtility.getString(0,1,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"hamBurgerMenuData");
		manageproductpage=new ManageProductsPage(driver);
		loginpage=new Verify_LoginPage(driver);
		loginpage.userNameElement(usernameInput);
		loginpage.passwordElement(PasswordInput);
		loginpage.signInElement();
		manageproductpage.clickOnmanageaproductElement();
		hamburgermenupage=new HamburgerMenuPage(driver);
		hamburgermenupage.selectMenu(inputMainMenu);
		manageproductpage.clickOnnewElement();
		manageproductpage.EnterTitleElement();
		
		
		
		
		
		
	}

}
