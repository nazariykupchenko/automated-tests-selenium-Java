package tests;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.SearchResultsPage;
import utils.PageFactoryManager;

public class BaseTest {

  protected static final String EMAIL = "qwer1234Q";
  protected static final String PASSWORD = "qwer1234Qzxcv1234";
  private static final String ALLO_URL = "https://allo.ua/";
  WebDriver driver;

  @BeforeMethod
  public void testsSetUp() {
    chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    PageFactoryManager pageFactoryManager = new PageFactoryManager(driver);
  }

  @AfterMethod
  public void tearDown() {
    getDriver().close();
  }


  public WebDriver getDriver() {
    return driver;
  }

  public HomePage getHomePage() {
    return new HomePage(getDriver());
  }

  public CartPage getCartPage() {
    return new CartPage(getDriver());
  }

  public SearchResultsPage getSearchResultsPage() {
    return new SearchResultsPage(getDriver());
  }

  public CheckoutPage getCheckoutPage() {
    return new CheckoutPage(getDriver());
  }
}
