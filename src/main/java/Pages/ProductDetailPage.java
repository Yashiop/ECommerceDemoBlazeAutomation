package Pages;

import GenericPage.CommonMethods;

public class ProductDetailPage extends CommonMethods {
	
	public ProductDetailPage()throws Exception{
		super();
	}
	
	//Read The Product Name
	
	public void productName() {
		getWebElementText("ProductText");
	}
	
	//get the Product Prize
	public void productPrice() {
		getWebElementText("ProductPrize");
	}
	
	//Click the AddToCartButton
	public void addtoCart() {
		clickWebElement("AddCartButton");
		
	}
	//Accepting the Alert 
	public void accepttheAlert() {
		acceptAlert();
	}
	
	
	
	
	

}
