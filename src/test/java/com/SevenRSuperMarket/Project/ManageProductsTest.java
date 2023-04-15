package com.SevenRSuperMarket.Project;

import java.io.IOException;

import org.testng.annotations.Test;

import com.SevenRSuperMarket.Project.Resources.LoginPage;
import com.SevenRSuperMarket.Project.Resources.ManageProductsPage;
import com.SevenRSuperMarket.Project.Resources.PushNotificationPage;

import Utilities.ExcelUtility;

public class ManageProductsTest extends Base{
	private static final String PasswordInput = null;
	ManageProductsPage manageproductpage;
	LoginPage loginpage;
	
	@Test
	public void manageProducts() throws IOException
	{
		manageproductpage=new ManageProductsPage(driver);
		loginpage=new LoginPage(driver);
		String usernameInput=ExcelUtility .getString(0,0,System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestDatas.xlsx","login");
		String PasswordInput=ExcelUtility .getString(0,1,System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestDatas.xlsx","login");
		loginpage.userNameElement(usernameInput);
		loginpage.passwordElement(PasswordInput);
		manageproductpage.manageaproductElement();
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/list-product");
		manageproductpage.newElement();
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/Product/add");
		manageproductpage.EnterTitleElement();
		
		
		
		
		
		
	}

}
