
  package parallel.cucumber.pageObject;
  
  import java.io.IOException;
  
  import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement;
  import org.openqa.selenium.support.FindBy;
  
  import parallel.cucumber.utils.BaseTest;
  
  public class VerifySelectedProduct extends BaseTest {
  
  
  @FindBy(css="span.lighter") WebElement verify_selectProduct;
  
  public VerifySelectedProduct(WebDriver driver) throws IOException {
  super(driver);
  
  
  }
  
  
  public void mySelectedProduct(String vrifyProduct) { 
	  verify_selectProduct.getText().contains(vrifyProduct);
	
  
  } }
 