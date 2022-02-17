package com.organisation1.MyProject.basetest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.organisation1.MyProject.base.BaseTest;
import com.organisation1.MyProject.pages.CartPage;

public class CartPageTest extends BaseTest {
	
		@Test(priority=0)
		public void ValidateCartsectionname() throws IOException {
			loginpage.validateLogin(testdatapath,Sheetname);
			loginpage.ClickOnCart();
			cartpage=loginpage.NavigateToCartPage();
			System.out.println("cartpage test1");
			System.out.println(cartpage.VerifySectionName());
	    }
		@Test(priority=1)
		public void ValidateCartColumns() throws IOException {
			loginpage.validateLogin(testdatapath,Sheetname);
			loginpage.ClickOnCart();
			cartpage=loginpage.NavigateToCartPage();
			System.out.println("cartpage test2");
			System.out.println(cartpage.VerifyColumn1());
			System.out.println(cartpage.VerifyColumn2());
	    }
		@Test(priority=2)
		public void ValidateCartButtons() throws IOException  {
			loginpage.validateLogin(testdatapath,Sheetname);
			loginpage.ClickOnCart();
			cartpage=loginpage.NavigateToCartPage();
			System.out.println("cartpage test3");
		    System.out.println(cartpage.VerifyCheckoutButton());
		    System.out.println(cartpage.VerifyContinueShoppingButton());
			cartpage.ClickContinueShoppingButton();
	    }
		@Test(priority=3)
		public void ClickOnContinueShoppingButton() throws Exception {
			loginpage.validateLogin(testdatapath,Sheetname);
			loginpage.ClickOnCart();
			cartpage=loginpage.NavigateToCartPage();
			cartpage.ClickContinueShoppingButton();
			System.out.println("cartpage test4");
	    }
}
