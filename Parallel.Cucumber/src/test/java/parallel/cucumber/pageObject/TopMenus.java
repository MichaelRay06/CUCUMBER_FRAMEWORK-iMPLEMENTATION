
package parallel.cucumber.pageObject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import parallel.cucumber.utils.BaseTest;

public class TopMenus {
	WebDriver driver;

	@FindBy(id = "contact-link")
	WebElement click_contactLink;

	private @FindBy(css = "div> a.login") WebElement SingIn;

	private @FindBy(css = "img.logo.img-responsive") WebElement VerifyImage;

	@FindBy(css = "div> a.logout")
	WebElement logOut;

	public TopMenus(WebDriver driver) throws IOException {
		this.driver = driver;

	}

	public LoginPage clickSingInLink() throws IOException {
		SingIn.click();
		return PageFactory.initElements(driver, LoginPage.class);

	}

	public LoginPage signOut() {
		logOut.click();
		return PageFactory.initElements(driver, LoginPage.class);

	}

	public boolean verifySingOut() {
		return SingIn.isDisplayed();

	}

	public ContactPage contactLink() {
		click_contactLink.click();
		return PageFactory.initElements(driver, ContactPage.class);

	}
}
