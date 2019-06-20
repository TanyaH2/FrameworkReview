package com.syntax.lsu.testcases;

import org.testng.annotations.Test;

import com.syntax.lsu.pages.LoginPage;
import com.syntax.lsu.utils.BaseClass;
import com.syntax.lsu.utils.ConfigReader;

public class LoginPageTestCases extends BaseClass{

	public LoginPage getLoginPage;
	
	//validate login functionality with valid credentials.
	@Test
	public void login() {
		getLoginPage=new LoginPage();
		getLoginPage.enterUserName(ConfigReader.getProperty("username"));
		getLoginPage.enterPassword(ConfigReader.getProperty("password"));
		getLoginPage.clickLoginBtn();
		BaseClass.tearDown();
	}
	
	


	
	
	
	
}
