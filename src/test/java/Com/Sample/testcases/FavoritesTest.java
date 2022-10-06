package Com.Sample.testcases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Com.Sample.base.basepage;
import Com.Sample.pages.AddAddressPage;
import Com.Sample.pages.FavoritesPage;
import Com.Sample.pages.LoginPage;
import Com.Sample.pages.SearchPage;
import Com.Sample.utilities.PropertiesFile;

public class FavoritesTest extends basepage {
	FavoritesPage lp;

	public FavoritesTest() {
		super();
	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new FavoritesPage(null);
	}

	@Test(priority = 18)
	public void AddToWishlist() throws InterruptedException {
		// login code

		driver.findElement(AddAddressPage.txt_username1).sendKeys(PropertiesFile.prop.getProperty("number"));
		driver.findElement(AddAddressPage.txt_password1).sendKeys(PropertiesFile.prop.getProperty("password"));
		driver.findElement(LoginPage.btn_button1).click();
		Thread.sleep(3000);
		driver.findElement(SearchPage.txt_search).sendKeys(PropertiesFile.prop.getProperty("Search3"));
		driver.findElement(SearchPage.btn_submit).click();
		Thread.sleep(2000);
		WebElement mouse_hover = driver.findElement(FavoritesPage.btn_hover);
		Actions act = new Actions(driver);
		act.moveToElement(mouse_hover).perform();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(2000);
		driver.findElement(FavoritesPage.btn_hover1).click();
		driver.navigate().refresh();
		js.executeScript("window.scrollBy(0,300)");
		WebElement box = driver.findElement(FavoritesPage.btn_add);
		box.click();
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(2000);
		System.out.println("Assert passed");
	}

	@Test(priority = 19)
	public void DeleteFromWishlist() throws InterruptedException {
		// login code

		driver.findElement(AddAddressPage.txt_username1).sendKeys(PropertiesFile.prop.getProperty("number"));
		driver.findElement(AddAddressPage.txt_password1).sendKeys(PropertiesFile.prop.getProperty("password"));
		driver.findElement(LoginPage.btn_button1).click();
		Thread.sleep(3000);
		driver.findElement(SearchPage.txt_search).sendKeys(PropertiesFile.prop.getProperty("Search3"));
		driver.findElement(SearchPage.btn_submit).click();
		Thread.sleep(2000);
		WebElement mouse_hover = driver.findElement(FavoritesPage.btn_hover);
		Actions act = new Actions(driver);
		act.moveToElement(mouse_hover).perform();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(2000);
		driver.findElement(FavoritesPage.btn_hover1).click();
		driver.navigate().refresh();
		js.executeScript("window.scrollBy(0,300)");
		WebElement box = driver.findElement(FavoritesPage.btn_add);
		box.click();
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(2000);
		System.out.println("Assert passed");
	}

}
