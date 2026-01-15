package com.opencart.automation.testcases;

import org.testng.annotations.Test;

import Pages.CartPage;
import Pages.LoginPage;

public class CartPageTest {
	
	@Test
	public void verifyCartPage()throws Exception {
		
		//LoginPage 
		LoginPage lp = new LoginPage();
		lp.verifyWithValidCredentials();
		Thread.sleep(5000);
		
		//CartPage Object Creation
		
		CartPage cp = new CartPage();
		cp.CartButtonClick();
		//cp.verifyProductinCart();
		cp.placeOrder();
		Thread.sleep(3000);
		cp.EnterName();
		cp.EnterCountry();
		cp.EnterCity();
		cp.EnterCardDetail();
		cp.EnterMonth();
		cp.EnterYear();
		cp.clickPurchase();
		
		
	}

}
