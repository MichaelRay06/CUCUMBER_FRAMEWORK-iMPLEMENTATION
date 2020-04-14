
  package parallel.cucumber.pageObject;
  
  import java.io.IOException;
  
  import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement;
  import org.openqa.selenium.support.FindBy; import
  org.openqa.selenium.support.PageFactory;
  
  import parallel.cucumber.utils.BaseTest;
  
  public class HomePage extends BaseTest {
  
  @FindBy(css="div.breadcrumb.clearfix") public WebElement myAccountImage;
  
  @FindBy(css="h1.page-heading") public  WebElement getAccountText;
  @FindBy(name="search_query") public WebElement clearProductSearchBox;
  
  @FindBy(id="search_query_top") public WebElement productSearchBox;
  
  @FindBy(name="submit_search") public WebElement clickSearch;
  
  
  
  public HomePage(WebDriver driver) throws IOException {
	  super(driver);
	  
	  
  PageFactory.initElements(driver, this);
  isElementPresent2(myAccountImage);
  
  
  } 
 
  public String getMyAccountTitle_Text() { 
	  return getAccountText.getText();
  
  }
  
  public HomePage product_search(String searchProduct) {
	  clearProductSearchBox.clear();
  productSearchBox.sendKeys(searchProduct); 
  return PageFactory.initElements(driver, HomePage.class);
  
  }
  
  public VerifySelectedProduct clickToSearch() throws IOException {
  clickSearch.click();
  return PageFactory.initElements(driver, VerifySelectedProduct.class);
  
  } }
 