package com.opencart.automation.testcases;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;



public class HomePageTest {
	
	
	
	@Test
	public void verifyHomepageafterLogin()  throws Exception{
		
		//HomePaGE Object Creation
	    HomePage hp = new HomePage();
	    LoginPage lp = new LoginPage();
	    lp.verifyWithValidCredentials();
		hp.verifyhomepage();
		Thread.sleep(3000);
		hp.clicklogout();
		System.out.println("logoutButton is visible and clicked");
		
		
		System.out.println("HomePage Verification Passed");
		
		
		
		
	}

}
