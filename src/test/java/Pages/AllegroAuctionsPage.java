package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class AllegroAuctionsPage {
    WebDriver driver;
    @FindBy(css = "h2[class ='mgmw_wo mgn2_21 mp0t_ji m9qz_yo mqu1_1j mryx_0 mp4t_0']")
    private WebElement scrollPoint;



    public AllegroAuctionsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getScrollPointText(){
        return scrollPoint.getText();
    }
    public WebElement getScrollPoint(){
        return scrollPoint;
    }


}


