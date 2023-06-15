package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

  public CheckoutPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(xpath = "//*[@class='a-form auth__form']")
  public WebElement authForm;
  @FindBy(id = "mini_cart_container")
  public WebElement cartContainer;

  public boolean isAuthFormVisible(){
    return authForm.isDisplayed();
  }

  public boolean isCartConteinerVisible(){
    return cartContainer.isDisplayed();
  }
}
