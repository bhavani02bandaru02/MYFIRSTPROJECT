package com.organisation1.MyProject.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	WebDriver driver;
		
	public ElementUtil(WebDriver driver)
	{
		this.driver = driver;		
	}
	public WebElement getElement(By locator)
	{
		WebElement element = driver.findElement(locator);
		return element;
	}
	public void doSendKeys(By locator,String value)
	{
		getElement(locator).sendKeys(value);
	}
	
	public void doClick(By locator)
	{
		getElement(locator).click();
	}
	
	public String getText(By locator) {
		String str=getElement(locator).getText();
		return str;
	}
	
	
	
	
}
