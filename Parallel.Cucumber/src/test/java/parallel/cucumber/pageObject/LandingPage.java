package parallel.cucumber.pageObject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import parallel.cucumber.utils.BaseTest;

public class LandingPage extends BaseTest{
	
	
	@FindBy(how=How.CSS,using="a.login") public WebElement SING_IN_BUTTON;

	public LandingPage(WebDriver driver) throws IOException {
		super(driver);
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String verifyLandingPageTitle() {
		return driver.getTitle();
		
		
	}
	public LoginPage click_SingButton() {
		SING_IN_BUTTON.click();
		return PageFactory.initElements(driver, LoginPage.class);
	}

}
