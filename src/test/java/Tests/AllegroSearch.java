package Tests;

import Pages.AllegroAuctionsPage;
import Pages.AllegroMainPage;
import Pages.GoogleMainPage;
import org.openqa.selenium.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import static com.google.common.io.Files.move;

public class AllegroSearch extends BaseTest{

    List<String> itemsTitle;
    @Test
    public void googleAcceptAndSearch(){
        GoogleMainPage googlePage = new GoogleMainPage(driver);
        googlePage.acceptCookies();
        googlePage.searchGoogle("Allegro");
        googlePage.openAllegro();
    }
    @AfterTest
    public void Allegro(){
        AllegroMainPage allegroPage = new AllegroMainPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        allegroPage.acceptCookies();
        allegroPage.searchItem("Iphone 15 Pro");
        AllegroAuctionsPage allegroAuctionsPage = new AllegroAuctionsPage(driver);
        allegroAuctionsPage.scrollTo();

        var screen = (TakesScreenshot)driver;
        File screenshot = screen.getScreenshotAs(OutputType.FILE);
        try {

            move(screenshot, new File("src\\test\\java\\Screenshots\\photo.png"));
        }catch(IOException e){
            e.printStackTrace();
        }


    }
}
