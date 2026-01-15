package GenericPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends MasterPage{
	
	public CommonMethods() throws Exception{
	super();
	}
	
	//GET TEXT OF WEBELEMENT
	public void getWebElementText(String webElementLocator) {
		String getTextOfWebElement = driver.findElement(By.xpath(or.getProperty(webElementLocator))).getText();
		System.out.println(getTextOfWebElement);
		
	}
	
	//CLICK WEBELEMENT
	public void clickWebElement(String webElementLocator) {
		driver.findElement(By.xpath(or.getProperty(webElementLocator))).click();
		
	}
	
	//CLEAR WEBELEMENT
	public void clearWebElement(String webElementLocator) {
		driver.findElement(By.xpath(or.getProperty(webElementLocator))).clear();
		
	}
	
	//ENTER DATA
	public void enterData(String webElementLocator, String testdata) {
		driver.findElement(By.xpath(or.getProperty(webElementLocator))).sendKeys(td.getProperty(testdata));
		
	}
	
	//CLEAR DATA
	public void clearData(String webElementLocator) {
		driver.findElement(By.xpath(or.getProperty(webElementLocator))).clear();
		
	}
	
	//MOUSE HOVER
	public void moveToElement(String webElementLocator) {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(or.getProperty(webElementLocator)))).build().perform();
		
	}
	//HANDLING EXPLICIT WAIT USING VISIBILITY OF ELEMENT LOCATED
	public void handlingExplicitwait_visibilityofElementLocated(String webElementLocator,String testdata) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(or.getProperty(webElementLocator)))).sendKeys(testdata);
		
	}
	
	//HANDLING EXPLICIT WAIT USING ELEMENT TO BE CLICKABLE
	public void handlingExplicitwait_elementTobeClickable(String webElementLoacator) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(or.getProperty(webElementLoacator)))).click();
		
	}
	
	//CLICK LIST OF WEBELEMENT
	public void clickListOfWebElement(String webElementLocator, String testdata) {
		List<WebElement> listOfElements = driver.findElements(By.xpath(or.getProperty(webElementLocator)));
		  for(int i =0; i<listOfElements.size();i++) {
			  if(listOfElements.get(i).getText().equalsIgnoreCase(td.getProperty(testdata))) {
				  listOfElements.get(i).click();
			  }
		  }
			  
		  
		
	}
	
	//SELECT DROPDOWN VALUE USING VISIBLE TEXT(USING SELECT CLASS)
	public void selectDropdownValue(String webElementLocator, String testdata) {
		WebElement ele = driver.findElement(By.xpath(or.getProperty(webElementLocator)));
		
		Select webele = new Select(ele);
		
		webele.selectByVisibleText(td.getProperty(testdata));
		
	}
	
	// HANDLE ALERT - ACCEPT
	public void acceptAlert() {
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.alertIsPresent());
	    driver.switchTo().alert().accept();
	}
	
	

}
