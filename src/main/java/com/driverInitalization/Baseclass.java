package com.driverInitalization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

abstract public class Baseclass {

	public WebDriver driver;
	
	private String path;
	private String user;
	private String pwd;
	
	public void InitalizeDriver() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	
	public Baseclass(String execPlatform) {
		if(execPlatform.equalsIgnoreCase("owner_Admin")) {
			this.path = PropertyClass.getPropertyValue("pg.admin.base.url");
			this.user = PropertyClass.getPropertyValue("pg.admin.username");
			this.pwd = PropertyClass.getPropertyValue("pg.admin.password");
		}
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public String getPath() {
		return path;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
}	
	
	
	
	

