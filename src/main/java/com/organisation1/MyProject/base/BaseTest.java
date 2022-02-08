package com.organisation1.MyProject.base;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.organisation1.MyProject.pages.LoginPage;

public class BaseTest {
	
	public String testdatapath;
	public String Sheetname;
	public Properties prop;
	public WebDriver driver;
	public BasePage basepage;
	public LoginPage loginpage;
	
	
	@BeforeMethod
	public void setUp()
	{
		basepage = new BasePage();
		prop = basepage.init_prop();
		String brwsr = prop.getProperty("browser");
		System.out.println(brwsr);
		driver = basepage.init_driver(brwsr);
		loginpage = new LoginPage(driver);
		driver.get(prop.getProperty("url"));
		testdatapath=basepage.excelpath();
		Sheetname=prop.getProperty("sheet");
	}	
	@AfterMethod
	public void tearDown()
	{
		basepage.getScreenshot();
		driver.quit();
	}
}
