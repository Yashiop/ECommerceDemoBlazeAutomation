package Pages;

import GenericPage.CommonMethods;

public class HomePage extends CommonMethods {
	
	public HomePage()throws Exception{
		super();
	}
	
	//VERIFY HOMEPAGE TEXT
	
	public void verifyhomepage() {
		getWebElementText("Text");
	}
	
	//MOVE TO LOGOUT
	
	public void movetoLogout() {
		moveToElement("Logout");
	}
	
	//CLICK LOGOUT BUTTON
	
	public void clicklogout() {
		clickWebElement("Logout");
	}
	
	//Click on Phone Category
	
	public void clickPhoneCategory() {
		clickWebElement("PhoneCategory");
	}
	
	//Click on Specific Product
	
	public void clickspecificProduct() {
		clickWebElement("ProductElement");
	}
		


}
