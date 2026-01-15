package GenericPage;

import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MasterPage {
	
	public static WebDriver driver;
	
	     public Properties prop;
	     public Properties or;
	     public Properties td;
	     
	     //CONSTRUCTOR IMPLEMENTATION
	     
	     public MasterPage()throws Exception {
	    	 
	    //config Properties File Implementation
	    	 
	     InputStream ip = getClass().getClassLoader().getResourceAsStream("config.properties");
	     prop = new Properties();
	    		 
	     prop.load(ip);
	     
	     //Locators Properties File Implementation
	     
	     InputStream fs = getClass().getClassLoader().getResourceAsStream("Locators.properties");
	     or=new Properties();
	     or.load(fs);
	     
	     //TESTDATA PROPERTIES FILE IMPLEMENTATION
	     
	     InputStream ts = getClass().getClassLoader().getResourceAsStream("testdata.properties");
	     td=new Properties();
	     td.load(ts);
	     
	     //LAUNCHING THE BROWSER
	     if(driver == null) {
	     String browser = prop.getProperty("browser");
	        if(browser.equalsIgnoreCase("chrome")) {
	        	
	        	String driverPath = getClass().getClassLoader().getResource("drivers/chromedriver.exe").getPath();
	        	
	        	System.setProperty("webdriver.chrome.driver", driverPath);
	        	driver = new ChromeDriver();
	        }
	        
	        driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  driver.get(prop.getProperty("URL_1"));

	     }

	     }
	     
	     
	

}
