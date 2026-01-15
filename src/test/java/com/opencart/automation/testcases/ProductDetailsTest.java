package com.opencart.automation.testcases;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProductDetailPage;

public class ProductDetailsTest {
	
	
	@Test
	public void verifyProductDetail() throws Exception {
		
		LoginPage ip = new LoginPage();
		HomePage hp = new HomePage();
		//LoginPage actions
		ip.verifyWithValidCredentials();
		Thread.sleep(5000);
		
		//Homepage Actions 
		hp.clickPhoneCategory();
		hp.clickspecificProduct();
		
		//ProductDetails page Actions
		ProductDetailPage pdp = new ProductDetailPage();
		pdp.productName();
		pdp.productPrice();
		pdp.addtoCart();
		pdp.accepttheAlert();
	}

}
