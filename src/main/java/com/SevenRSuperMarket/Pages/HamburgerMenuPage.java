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
		By categories=By.xpath("//div[@class=\"col-lg-3 col-6\"]//child::a[@href]");
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
