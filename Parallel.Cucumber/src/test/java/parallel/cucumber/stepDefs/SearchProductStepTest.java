package parallel.cucumber.stepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import parallel.cucumber.pageObject.HomePage;
import parallel.cucumber.pageObject.LandingPage;
import parallel.cucumber.pageObject.LoginPage;
import parallel.cucumber.pageObject.VerifySelectedProduct;
import parallel.cucumber.utils.DriverFactory;

public class SearchProductStepTest {
	WebDriver driver;
	public DriverFactory driverFactory;
	
	
    LandingPage landingPage;
	LoginPage loginPage;
	HomePage homePage;
	VerifySelectedProduct verifySelecProduct;
	
	public SearchProductStepTest(DriverFactory driverFactory) {
		this.driverFactory=driverFactory;
		
		
	}
	
	


	@Given("^I am on Carguruji on \"([^\"]*)\" browser$")
	public void i_am_on_Carguruji_on_browser(String browserName) throws Throwable {
	driver=driverFactory.initialization(browserName);
	driver.get("http://carguruji.com/shop/");
	

}
  

@Then("^I coud vrify the page tile as \"([^\"]*)\"$")
public void i_coud_vrify_the_page_tile_as(String pageTitle) throws Throwable {
	landingPage=PageFactory.initElements(driver, LandingPage.class);
	
	String actualTitle =landingPage.verifyLandingPageTitle();
	Assert.assertEquals(actualTitle, pageTitle, "MESSAGE>>>>> Page title not march");
	landingPage.click_SingButton();
	
    
}

@When("^I logged in the site with user name as \"([^\"]*)\" password as \"([^\"]*)\"$")
public void i_logged_in_the_site_with_user_name_as_password_as(String emailAddr, String passwDdAddr) throws Throwable {
	loginPage= PageFactory.initElements(driver, LoginPage.class);
	
	loginPage.login(emailAddr, passwDdAddr);
    
}

@Then("^I verify my  account title text as \"([^\"]*)\"$")
public void i_verify_my_account_title_text_as(String myAccountTitleText) throws Throwable {
	homePage=PageFactory.initElements(driver, HomePage.class);
	
	String actualAccTitle =homePage.getMyAccountTitle_Text();
	Assert.assertEquals(actualAccTitle, myAccountTitleText, "MESSAGE>>>>> Account text title not march");
	
   
}

@Then("^I search for desired product as  \"([^\"]*)\"$")
public void i_search_for_desired_product_as(String searchProduct) throws Throwable {
	homePage=PageFactory.initElements(driver, HomePage.class);

	
	homePage.product_search(searchProduct);
    
}

@Then("^I click to make product search$")
public void i_click_to_make_product_search() throws Throwable {
	homePage=PageFactory.initElements(driver, HomePage.class);

	
	homePage.clickToSearch();
   
    }

@Then("^I verifyed the serched product as \"([^\"]*)\"$")
public void i_verifyed_the_serched_product_as(String vrifyProduct) throws Throwable {
	verifySelecProduct= PageFactory.initElements(driver, VerifySelectedProduct.class);
	verifySelecProduct.mySelectedProduct(vrifyProduct);
	

    
}

}
