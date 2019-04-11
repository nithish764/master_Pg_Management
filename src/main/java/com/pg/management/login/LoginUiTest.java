package com.pg.management.login;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.driverInitalization.Baseclass;
import com.driverInitalization.PropertyClass;


public class LoginUiTest extends Baseclass {
	
	public LoginUiTest() {
		super(PropertyClass.getPropertyValue("pg.admin.platform"));
		// TODO Auto-generated constructor stub
	}

	LoginModule loginmodule;
	
	@BeforeClass
	public void setup() {
		InitalizeDriver();
		loginmodule=new LoginModule(driver);
		getDriver().get(getPath());
	}

	@Test
	public void testcase1() {
		loginmodule.enterThecredentials(getUser(),getPwd());
	}
}
