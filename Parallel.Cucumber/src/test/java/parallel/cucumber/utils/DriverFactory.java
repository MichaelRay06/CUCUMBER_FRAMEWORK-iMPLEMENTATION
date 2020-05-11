package parallel.cucumber.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	
	private WebDriver driver=null;
	String browserName;


	
	public WebDriver initialization(String browserName){
		
		
	
		if((browserName).equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			
			if(driver==null)
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		
	
	  
		else if((browserName).equalsIgnoreCase("firefox")){
			//WebDriverManager.firefoxdriver().setup();
			System.setProperty("webdriver.gecko.driver", Constants.FIREFOXE_DRIVRE_PATH);
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", true);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
	  
		else if((browserName).equalsIgnoreCase("IE")){
		  
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			System.setProperty("webdriver.ie.driver", Constants.IE_DRIVRE_PATH);
			capabilities.setCapability("ignoreZoomSetting", true);
			driver = new InternetExplorerDriver(capabilities);
			driver.manage().window().maximize();
	  }
		 
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_TIME_OUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait( Constants.PAGE_TIME_OUT, TimeUnit.SECONDS);
		
		return driver;
	
}
	


public void getURL(String url) {
	driver.get(url);
	
	
}


public WebDriver shutDownDriver() {
	if(driver==null)
		driver.close();
	    driver.quit();
		return driver;
	
}
}
	

	

 
 
	
	

	
	