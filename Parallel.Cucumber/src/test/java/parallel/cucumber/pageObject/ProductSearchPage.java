/*
 * package parallel.cucumber.pageObject;
 * 
 * import java.io.IOException;
 * 
 * import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement;
 * import org.openqa.selenium.support.FindBy; import
 * org.openqa.selenium.support.PageFactory;
 * 
 * import parallel.cucumber.utils.BaseTest;
 * 
 * public class ProductSearchPage extends BaseTest{
 * 
 * @FindBy(css="div.breadcrumb.clearfix") public WebElement searhPageImage;
 * 
 * @FindBy(xpath="//a[@class='product-name'][1]") public WebElement
 * click_selectProduct;
 * 
 * 
 * 
 * 
 * 
 * public ProductSearchPage(WebDriver driver) throws IOException {
 * super(driver);
 * 
 * PageFactory.initElements(driver, this); isElementPresent2(searhPageImage);
 * 
 * 
 * 
 * } public VerifySelectedProduct selectedProduct() {
 * click_selectProduct.click();
 * 
 * return PageFactory.initElements(driver,VerifySelectedProduct.class);
 * 
 * }
 * 
 * 
 * }
 */