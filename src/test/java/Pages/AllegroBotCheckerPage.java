package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllegroBotCheckerPage {
    WebDriver driver;

@FindBy(css = "div[class='captcha_display_button_submit']")
    private WebElement captchaChecker;
    public AllegroBotCheckerPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void IsCaptchaVisable(){
     captchaChecker.click();
    }
}
