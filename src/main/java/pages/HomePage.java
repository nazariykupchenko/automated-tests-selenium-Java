package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

  @FindBy(id = "search-form__input")
  private WebElement searchField;
  @FindBy(xpath = "//*[@class='mh-profile']")
  private WebElement myProfileButton;
  @FindBy(className = "a-button a-button--block a-button--outline a-button--lg a-button--base")
  private WebElement registrationButton;
  @FindBy(id = "OFbh40tr2YR7DAa7H3KES")
  private WebElement emailField;
  @FindBy(id = "QqaS6Hev-znyukDQsuhtB")
  private WebElement passwordField;
  @FindBy(className = "a-input__message base-message is-error")
  private WebElement warningMessage;

  public void clickRegistrationButton() {
    registrationButton.click();
  }

  public void enterInvalidEmailToEmailField(String email) {
    emailField.sendKeys(email);
  }

  public void enterPasswordToPasswordField(String password) {
    passwordField.sendKeys(password);

  }

  public boolean isWarningMessageVisible() {
    return warningMessage.isDisplayed();
  }


  public HomePage(WebDriver driver) {
    super(driver);
  }

  public void clickMyAccountButton() {
    myProfileButton.click();
  }

  public void enterProductNameToSearchField(String name) {
    searchField.sendKeys(name);
    searchField.sendKeys(Keys.ENTER);
  }

}
