package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllegroMainPage {
    WebDriver driver;
 private WebElement cookiesPopup;

    @FindBy(css = "button[data-testid='accept_home_view_action']")
    private WebElement cookiesPopupAcceptButton;
    @FindBy(css = "button[data-testid='reject_home_view_action']")
    private WebElement cookiesPopupDeclineButton;

    @FindBy(css = "button[data-testid='manage_home_view_action']")
    private WebElement cookiesChangeOptionsButton;
    @FindBy(css = "input[role='combobox']")
    private WebElement searchBar;
    public AllegroMainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void acceptCookies(){
        cookiesPopupAcceptButton.click();
    }
    public void searchItem(String keyWord){
        searchBar.sendKeys(keyWord);
        searchBar.sendKeys(Keys.ENTER);
    }
}
