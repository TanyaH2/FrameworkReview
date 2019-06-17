package com.syntax.lsu.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.lsu.utils.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(css="input#txtUsername")
	public WebElement username;
	
	@FindBy(css="input#txtPassword")
	public WebElement password;
	
	@FindBy(css="input#btnLogin")
	public WebElement loginBtn;
	
	@FindBy(css="div.toast.toast-error")
	public WebElement errorMessage;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String userName) {
		username.sendKeys(userName);
	}

	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickLoginBtn() {
		loginBtn.click();
	}
}
