package Pages;

import GenericPage.CommonMethods;

public class CartPage extends CommonMethods {
	
	public CartPage() throws Exception{
		super();
	}
	
	//CLICKING THE Cart Element Button
	
	public void CartButtonClick() {
		clickWebElement("CartPageElement");
	}
	
	//verifing the Product exist in Cart
	public void verifyProductinCart() {
		getWebElementText("ProductText");
	}
	
	//Click On PlaceOrder Button
	
	public void placeOrder() {
		clickWebElement("PlaceOrderButton");
	}
	
	//Entering the Name in Order placing Details
     public void EnterName() {
        enterData("OrderplacingName","OrderuserName");
     }
     
     //Entering The name of Country 
     public void EnterCountry() {
         enterData("CountryElement","CountryName");
      }
     
     //Entering The name of City 
     public void EnterCity() {
         enterData("CityDetails","CityName");
      }
     
     
     
     //Entering The credit card Details
     public void EnterCardDetail() {
         enterData("CreditDetails","CreditCard");
      }
     
     //Enter the Month details
     public void EnterMonth() {
    	 enterData("monthDetails","Month");
     }
     
     //Enter the Year Details
     public void EnterYear() {
    	 enterData("YearDetails","Year");
     }
     
     //Clicking the Purchase BUtton
     public void clickPurchase() {
    	 clickWebElement("PurchaseButton");
     }
     
	
	}
