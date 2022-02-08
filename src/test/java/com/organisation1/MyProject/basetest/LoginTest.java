package com.organisation1.MyProject.basetest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.organisation1.MyProject.base.BaseTest;

public class LoginTest extends BaseTest{
	
	@Test(priority=0)
	public void Login() throws IOException {
		loginpage.validateLogin(testdatapath,Sheetname);
	}
}
