package com.SevenRSuperMarket.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HamburgerMenuPage {
	WebDriver driver;
	public HamburgerMenuPage  (WebDriver driver)
	{
		this.driver=driver;//same driver 
		
	}
	@Test
	public void selectMenu(String input)
	{   
		By categories=By.xpath("//i[@class='nav-icon fas fa-th-large']//following::a[@href]");
		List<WebElement> selectCategoryelement=driver.findElements(categories);
		for(WebElement category:selectCategoryelement)
		{
			String categoryName=category.getText();
			if(categoryName.equals(input))
			{
				category.click();
				break;
			}
		}
	}
}
