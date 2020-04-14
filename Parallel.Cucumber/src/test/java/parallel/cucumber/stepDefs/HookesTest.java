package parallel.cucumber.stepDefs;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
import parallel.cucumber.utils.DriverFactory;

public class HookesTest  {
	WebDriver driver;
	
	DriverFactory driverFactory;
	
	public HookesTest(DriverFactory driverFactory) {
		this.driverFactory=driverFactory;
		
		
	}
	
	@Before
	public void BeforeTest() {
		
			
		}
	@After
	public void shurtDown() {
		driver=driverFactory.shutDownDriver();
		
		
		
	}
}
