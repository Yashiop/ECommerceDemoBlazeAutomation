package com.opencart.automation.testcases;

import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginPageTest {
	
	
	//Positive Scenario
	@Test (priority = 1)
	public void verifywithValidCredentials() throws Exception{
		
	 LoginPage ip = new LoginPage();
		
	 ip.clickLoginElement();
	// ip.clearUsername();
	 ip.enterUsername();
	 ip.clearPassword();
	 ip.enterPassword();
	 
	 Thread.sleep(2000);
	 ip.clickLoginButton();
	 
	 System.out.println("LOGIN FUNCTIONALITY IS PASSED");
	}
	
}


