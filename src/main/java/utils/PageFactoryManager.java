package utils;

import org.openqa.selenium.WebDriver;
import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.SearchResultsPage;

public class PageFactoryManager {

  WebDriver driver;

  public PageFactoryManager(WebDriver driver) {
    this.driver = driver;
  }

  public HomePage getHomePage() {
    return new HomePage(driver);
  }

  public CartPage getCartPage() {
    return new CartPage(driver);
  }

  public SearchResultsPage getSearchResultsPage() {
    return new SearchResultsPage(driver);
  }

  public CheckoutPage getCheckoutPage() {
    return new CheckoutPage(driver);
  }
}
