package Pages;

import GenericPage.CommonMethods;

public class LoginPage  extends CommonMethods{
	
	public LoginPage() throws Exception{
		super();
	}
	
	
	//MOVE TO MYACCOUNTELEMENT
	public void moveToMyAccount() {
		moveToElement("MyAccountdropdownElement");
	}
	
	//CLICK ON LOGIN ELEMENT 
	
	public void clickLoginElement() {
		clickWebElement("loginElement");
		
	}
	
	//CLICK ON USERNAME ELEMENT
	public void clickuserName() {
		clickWebElement("loginElement");
	}
	
	//ENTER USERNAME FIELD
	public void enterUsername() {
		enterData("usernameElement","userNamedata");
	}
	
	//CLEAR USERNAME FIELD
	public void clearUsername() {
		clearData("usernameElement");
	}
	
	//CLICK ON PASSWORD FIELD
	public void clickPassword() {
		clickWebElement("Password");
	}
	
	//ENTER PASSWORD FIELD
	public void enterPassword() {
		enterData("Password","Passworddata");
	}
	
	//CLEAR PASSWORD FIELD
	public void clearPassword() {
		clearData("Password");
	}
	
	//CLICK LOGIN BUTTON
	public void clickLoginButton() {
		clickWebElement("LoginButton");
	}
	
	
	//COmplete Login Flow
	 public void verifyWithValidCredentials() {
	        clickLoginElement();
	        enterUsername();
	        clearPassword();
	        enterPassword();
	        clickLoginButton();
	    }

}
