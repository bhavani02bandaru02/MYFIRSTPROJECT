package com.organisation1.MyProject.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.organisation1.MyProject.util.ElementUtil;
import com.organisation1.MyProject.util.ExcelUtil;

public class LoginPage {
    private WebDriver driver;
    private ExcelUtil excelutil;
    private ElementUtil elementutil;
	private By idusername = By.xpath("//input[@id='user-name']");
	private By idpassword = By.xpath("//input[@id='password']");
	private By idclick = By.xpath("//input[@id='login-button']");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		elementutil=new ElementUtil(driver);
		excelutil=new ExcelUtil(driver);
		
	}
	
	public void validateLogin(String exceltestdatapath,String SheetName) throws IOException 
	{
	  int i=excelutil.getLastRowNumber(exceltestdatapath,SheetName);
	  String username=excelutil.getData(i, 0);
	  String password=excelutil.getData(i, 1);
      System.out.println("User Name is: " +excelutil.getData(i, 0)+ " Password is: " +excelutil.getData(i, 1));
      elementutil.doSendKeys(idpassword, password);
	  elementutil.doSendKeys(idusername, username);
	  elementutil.doClick(idclick);
	} 

}
