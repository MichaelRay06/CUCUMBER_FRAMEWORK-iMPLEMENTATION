
  package parallel.cucumber.pageObject;
  
  import java.io.IOException;
  
  import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement;
  import org.openqa.selenium.support.FindBy; import
  org.openqa.selenium.support.PageFactory;
  
  import parallel.cucumber.utils.BaseTest;
  
  public class LoginPage extends BaseTest {
  
  @FindBy(css="div.breadcrumb.clearfix") public WebElement VrifyHomePageImage;
  
  @FindBy(id="email") public WebElement emailBox;
  
  @FindBy(id="passwd") public WebElement passwordBox;
  
  @FindBy(id="SubmitLogin") public WebElement Click_Submit;
  
  @FindBy(css="div>a.account")public  WebElement user_ID;
  
  
  
  
  public LoginPage(WebDriver driver) throws IOException {
	  super(driver);
	  PageFactory.initElements(driver, this);

	   isElementPresent2(VrifyHomePageImage);
  
  }
  
  
  
  public Object login (String emailAddress,  String passwordAddress) {
  emailBox.sendKeys(emailAddress);
  sendKeys(passwordBox, passwordAddress);
  click(Click_Submit);

  
  if(isElementPresent2(user_ID))
  
  return PageFactory.initElements(driver, HomePage.class);
  
  else
  
  return PageFactory.initElements(driver, LoginPage.class);
  
  
  }
  
  
  }
  
  
 