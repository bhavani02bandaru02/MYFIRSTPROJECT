package com.organisation1.MyProject.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.organisation1.MyProject.base.BasePage;
import com.organisation1.MyProject.util.ElementUtil;
import com.organisation1.MyProject.util.ExcelUtil;

public class LoginPage extends BasePage {
    private ExcelUtil excelutil;
    private ElementUtil elementutil;
    
	private By idusername = By.xpath("//input[@id='user-name']");
	private By idpassword = By.xpath("//input[@id='password']");
	private By loginclick = By.xpath("//input[@id='login-button']");
	private By title=By.xpath("//div[@class='header_label']/div");
	private By carticon=By.xpath("//a[@class='shopping_cart_link']");
	private By sectionname=By.xpath("//div[@class='header_secondary_container']/span)");
	private By menuclick = By.xpath("//button[@id='react-burger-menu-btn']");
	private By menu1=By.xpath("//a[@id='inventory_sidebar_link']");
    private By menu2=By.xpath("//a[@id='about_sidebar_link']");
    private By menu3=By.xpath("//a[@id='logout_sidebar_link']");
    private By menu4=By.xpath("//a[@id='reset_sidebar_link']");
    
	
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
	  elementutil.doClick(loginclick);
	} 
	
	public String VerifyTitle() {
		return elementutil.getText(title);
	}
	
	public String VerifySection() {
	 return elementutil.getText(sectionname);	
	}
	public void ClickOnCart() {
		elementutil.doClick(carticon);
	}
	public void clickMenu()
	{
     	  elementutil.doClick(menuclick);
	}
	
	public String menuList1() throws Exception {
		Thread.sleep(300);
		return elementutil.getText(menu1);	
	}
	public String menuList2() throws InterruptedException {
		Thread.sleep(300);
		return elementutil.getText(menu2);	
	}
	public String menuList3() {
		return elementutil.getText(menu3);	
	}
	public String menuList4() {
		return elementutil.getText(menu4);	
	}
	
	
	public CartPage NavigateToCartPage() {
		return new CartPage(driver);
	}
	
	public AboutPage NavigateToAboutPage() {
		return new AboutPage(driver);
	}

} 
