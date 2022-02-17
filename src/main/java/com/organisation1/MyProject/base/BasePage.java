package com.organisation1.MyProject.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.organisation1.MyProject.pages.LoginPage;

public class BasePage {

	public WebDriver driver;
	public Properties prop;
	
		public WebDriver init_driver(String browser)
	 {
			System.out.println("In basepage");
		System.out.println("browser value is : " + browser);
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\MyProject\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		return driver;
      }
		
		
		public Properties init_prop()
		{
		   prop = new Properties();
			try {
				FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//com//organisation1//MyProject//config//config.properties");
				prop.load(ip);
			} catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return prop;
			
		}
		
		public String excelpath() {
			String path = System.getProperty("user.dir") + "//src//main//java//com//organisation1//MyProject//testdata//testdata.xlsx";
			return path;
		}
	
		public String getScreenshot()
		{
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String path = System.getProperty("user.dir") + "/screenshots/" + System.currentTimeMillis() + ".jpeg" ;
			File detination = new File(path);
			try
			{
				FileUtils.copyFile(src, detination);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			return path;
		}		
}		
