package com.organisation1.MyProject.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.organisation1.MyProject.base.BasePage;
import com.organisation1.MyProject.util.ElementUtil;
import com.organisation1.MyProject.util.ExcelUtil;

public class CartPage extends BasePage {
	    private ExcelUtil excelutil;
	    private ElementUtil elementutil;
	    
	    private By sectionName=By.xpath("//span[@class='title']");
	    private By column1=By.xpath("//div[@class='cart_quantity_label']");
	    private By column2=By.xpath("//div[@class='cart_desc_label']");
	    private By continueShoppingButton=By.xpath("//button[@id='continue-shopping']");
	    private By checkoutButton=By.xpath("//button[@id='checkout']");
	    
	   
		public CartPage(WebDriver driver) {
			this.driver=driver;
			elementutil=new ElementUtil(driver);	
		}
		
		public String VerifySectionName() {
			return elementutil.getText(sectionName);
		}
		
		public String VerifyColumn1() {
			return elementutil.getText(column1);
			
		}
		
		public String VerifyColumn2() {
			return elementutil.getText(column2);
		}
		
		public String VerifyCheckoutButton() {
			return elementutil.getText(checkoutButton);
			
		}
		
		public String VerifyContinueShoppingButton() {
			return elementutil.getText(continueShoppingButton);
			
		}
		
		public void ClickContinueShoppingButton() {
			elementutil.doClick(continueShoppingButton);
		}
}
