package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FunctionalTests extends BaseTest {

  private static final long DEFAULT_WAITING_TIME = 90;
  private static final String PRODUCT_NAME = "iphone 12";

  @Test
  public void verifyUserRegistrationWithInvalidEmail() {
    getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
    getHomePage().clickMyAccountButton();
    getHomePage().clickRegistrationButton();
    getHomePage().enterInvalidEmailToEmailField(EMAIL);
    getHomePage().enterPasswordToPasswordField(PASSWORD);
    Assert.assertTrue(getHomePage().isWarningMessageVisible());
  }

  @Test
  public void verifyProductSearchfunctionality() {
    getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
    getHomePage().enterProductNameToSearchField(PRODUCT_NAME);
    getSearchResultsPage().verifySearch(PRODUCT_NAME);
  }

  @Test
  public void verifyAddToCartFunction(){
    getHomePage().enterProductNameToSearchField(PRODUCT_NAME);
    getSearchResultsPage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
    getSearchResultsPage().clickAddToCartProduct();
    Assert.assertTrue(getSearchResultsPage().isCartPopUpDisplayed());
  }

  @Test
  public void verifyCheckoutProcess(){
    getHomePage().enterProductNameToSearchField(PRODUCT_NAME);
    getSearchResultsPage().clickAddToCartProduct();
    getSearchResultsPage().clickOrderNowButton();
    getCheckoutPage().isAuthFormVisible();
    getCheckoutPage().isCartConteinerVisible();
  }

}
