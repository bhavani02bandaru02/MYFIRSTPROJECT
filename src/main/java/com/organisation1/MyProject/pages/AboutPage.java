package com.organisation1.MyProject.pages;

import org.openqa.selenium.WebDriver;

import com.organisation1.MyProject.util.ElementUtil;
import com.organisation1.MyProject.util.ExcelUtil;

public class AboutPage {
	private WebDriver driver;
	private ExcelUtil excelutil;
    private ElementUtil elementutil;
    
    
	public AboutPage(WebDriver driver) {
		this.driver=driver;
		elementutil=new ElementUtil(driver);	
	}
	
	

}
