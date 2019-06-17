package com.syntax.lsu.testcases;

import org.testng.annotations.Test;

import com.syntax.lsu.pages.LoginPage;
import com.syntax.lsu.utils.BaseClass;

public class LoginPageWithInVC extends BaseClass{

	LoginPage getLoginPage;
	
	//validate login functionality with Invalid credentials.
	@Test
	public void loginWithInvC() {
		getLoginPage=new LoginPage();
		getLoginPage.enterUserName("tesMe1");
		getLoginPage.enterPassword("slkdjfls");
		getLoginPage.clickLoginBtn();
		if(getLoginPage.errorMessage.isDisplayed()) {
			System.out.println("Test Case passed");
		}else {
			System.err.println("Test case Failed");
		}
		
	}
}
