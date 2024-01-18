package Tests;

import Pages.AllegroAuctionsPage;
import Pages.AllegroMainPage;
import Pages.GoogleMainPage;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import static com.google.common.io.Files.move;

public class AllegroSearch extends BaseTest {

	List<String> itemsTitle;

	@Test
	public void googleAcceptAndSearch() {
		String searchedGoogleWord = "Allegro";
		String searchedAllegroWord = "Iphone 15 Pro";
		String pathLocation = "src\\test\\java\\Screenshots\\photo.png";


		GoogleMainPage googlePage = new GoogleMainPage(driver);
		googlePage.acceptCookies();
		googlePage.searchGoogle(searchedGoogleWord);
		googlePage.openAllegro();

		AllegroMainPage allegroPage = new AllegroMainPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		allegroPage.acceptCookies();
		allegroPage.searchItem(searchedAllegroWord);

		AllegroAuctionsPage allegroAuctionsPage = new AllegroAuctionsPage(driver);


		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", allegroAuctionsPage.getScrollPoint());
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -100);");

		Assert.assertEquals(allegroAuctionsPage.getScrollPointText(), "Oferty promowane");



		var screen = (TakesScreenshot) driver;
		File screenshot = screen.getScreenshotAs(OutputType.FILE);

		try {
			move(screenshot, new File(pathLocation));
		} catch (IOException e) {
			e.printStackTrace();
		}


	}


}
