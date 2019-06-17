package com.syntax.lsu.testcases;

import org.testng.annotations.Test;

import com.syntax.lsu.pages.LoginWithOutPageFPage;
import com.syntax.lsu.utils.BaseClass;

public class LoginTestWithOutPageF extends BaseClass{

	
	@Test
	public void loginWithOutPf(){
		LoginWithOutPageFPage getLogin=new LoginWithOutPageFPage();
		getLogin.username.sendKeys("Admin");
		getLogin.password.sendKeys("06I@PjFbgM");
		getLogin.clickLoginBtn.click();
		
	}
}
