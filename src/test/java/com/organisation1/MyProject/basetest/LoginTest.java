package com.organisation1.MyProject.basetest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.organisation1.MyProject.base.BaseTest;
import com.organisation1.MyProject.pages.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test(priority=0)
	public void Login() throws IOException {
		loginpage.validateLogin(testdatapath,Sheetname);
		loginpage.clickMenu();
		System.out.println("loginpage test1");
	}
	
	@Test(priority=1)
	public void MenuValidation() throws Exception {
		loginpage.validateLogin(testdatapath,Sheetname);
		loginpage.clickMenu();
		System.out.println("LoginPage Menu1: " +loginpage.menuList1());
		System.out.println("LoginPage Menu2: " +loginpage.menuList2());
		System.out.println("LoginPage Menu3: " +loginpage.menuList3());
		System.out.println("LoginPage Menu4: " +loginpage.menuList4());	
		System.out.println("loginpage test2");
    }
}