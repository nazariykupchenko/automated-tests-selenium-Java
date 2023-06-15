package pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasePage {

  @FindBy(xpath = "//*[@class='css-oukcj3']")
  private List<WebElement> searchResultsList;
  @FindBy(xpath = "//*[@class='vi i-shared vi__in-cart']")
  private WebElement addToCartProduct;
  @FindBy(xpath = "//*[@class='v-modal__cmp cart-popup checkout_modal']")
  private WebElement cartPopUp;
  @FindBy(xpath = "//*[@class='order-now']")
  private WebElement orederNowButton;

  public SearchResultsPage(WebDriver driver) {
    super(driver);
  }

  public List<WebElement> getSearchResultsList() {
    return searchResultsList;
  }

  public void verifySearch(String searchWord){
    searchResultsList.get(0).getText().contains(searchWord);
  }
  public void clickAddToCartProduct(){
    addToCartProduct.click();
  }

  public boolean isCartPopUpDisplayed(){
    return cartPopUp.isDisplayed();
  }

  public void clickOrderNowButton(){
    orederNowButton.click();
  }


}
