
  package parallel.cucumber.pageObject;
  
  import java.io.IOException;
  
  import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement;
  import org.openqa.selenium.support.FindBy; import
  org.openqa.selenium.support.PageFactory;
  
  import parallel.cucumber.utils.BaseTest;
  
  public class ContactPage extends BaseTest{
  
  
  
  @FindBy(css="h1.page-heading.bottom-indent") WebElement sendMessageHeadr;
  
  
  public ContactPage(WebDriver driver) throws IOException {
	  super(driver);
  //PageFactory.initElements(driver, this);
  
  
  } public String verifyTextMessageHeader(String contactMessage) { return
  sendMessageHeadr.getText();
  
  }
  
  }
 