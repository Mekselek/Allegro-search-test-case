package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleMainPage {
    WebDriver driver;

    @FindBy(className = "dbsFrd")
    private WebElement cookiesPopup;
    @FindBy(id = "L2AGLb")
    private WebElement cookiesPopupAcceptButton;
@FindBy(id = "W0wltc")
    private WebElement cookiesPopupDeclineButton;
@FindBy(name = "q")
    private WebElement searchInputBar;
@FindBy(css = "a[href='https://allegro.pl/']")
private WebElement allegroHref;


    public GoogleMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void acceptCookies(){
        cookiesPopupAcceptButton.click();

    }

    public void searchGoogle(String keyWord){
        searchInputBar.sendKeys(keyWord);
        searchInputBar.sendKeys(Keys.ENTER);
    }
    public void openAllegro(){
        allegroHref.click();
    }

}
