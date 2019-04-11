package com.pg.management.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginModule {
	
	public WebDriver ldriver;
	
	public LoginModule(WebDriver rdriver){
	    this.ldriver = rdriver;
	    PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="username")
	private WebElement _userName;
	
	@FindBy(name="pwd")
	private WebElement _password;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement _clickLogin;


public void clickLoginButton() {
	_clickLogin.click();
}

public void enterThecredentials(String user,String password) {
	_userName.sendKeys(user);
	_password.sendKeys(password);
	_clickLogin.click();
}



}