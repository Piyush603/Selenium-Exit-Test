package Com.Sample.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Com.Sample.base.basepage;
import Com.Sample.pages.AddAddressPage;
import Com.Sample.pages.LoginPage;
import Com.Sample.pages.WishlistPage;
import Com.Sample.utilities.PropertiesFile;

public class WishlistTest extends basepage {
	WishlistPage lp;
	private static Logger logger = LogManager.getLogger(WishlistTest.class);


	public WishlistTest() {
		super();
	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new WishlistPage(null);

	}

	@Test(priority=10,groups = {"sanity"})
	public void Wishlist() throws InterruptedException {
		
		// login code

		driver.findElement(AddAddressPage.txt_username1).sendKeys(PropertiesFile.prop.getProperty("number"));
		driver.findElement(AddAddressPage.txt_password1).sendKeys(PropertiesFile.prop.getProperty("password"));
		driver.findElement(LoginPage.btn_button1).click();
		Thread.sleep(3000);
		logger.info("Login Successful");
		// to hover over username... and to click on Wishlist tab 

		WebElement mouse_hover = driver.findElement(AddAddressPage.btn_mousehover);
		Actions act = new Actions(driver);
		act.moveToElement(mouse_hover).perform();
		Thread.sleep(2000);
		WebElement wishlist = driver.findElement(WishlistPage.btn_wishlist);
		wishlist.click();
		Thread.sleep(3000);
		logger.info("Clicked to Wishlist tab");
		// to scroll the window and to bring it again on top
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1300)");
		driver.findElement(WishlistPage.btn_backtotop).click();
		Thread.sleep(3000);	
		Assert.assertEquals(driver.getTitle(), "My Wishlist");
		System.out.println("Assert passed");
		logger.info("Added to Wishlist");
	}
	@Test(priority = 11,groups = {"sanity"})
	public void DeleteWishlist() throws InterruptedException {
		
		// login code

		driver.findElement(AddAddressPage.txt_username1).sendKeys(PropertiesFile.prop.getProperty("number"));
		driver.findElement(AddAddressPage.txt_password1).sendKeys(PropertiesFile.prop.getProperty("password"));
		driver.findElement(LoginPage.btn_button1).click();
		Thread.sleep(3000);
		logger.info("Login Successful");

		// to hover over username... and to click on Wishlist tab 

		WebElement mouse_hover = driver.findElement(AddAddressPage.btn_mousehover);
		Actions act = new Actions(driver);
		act.moveToElement(mouse_hover).perform();
		Thread.sleep(2000);
		WebElement wishlist = driver.findElement(WishlistPage.btn_wishlist);
		wishlist.click();
		Thread.sleep(3000);
		logger.info("Clicked to Wishlist tab");
		
		// to scroll the window and to bring it again on top
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1300)");
		driver.findElement(WishlistPage.btn_backtotop).click();
		Thread.sleep(3000);
		
		// to delete from the wishlist
		
		driver.findElement(WishlistPage.btn_delete).click();
		driver.findElement(WishlistPage.btn_delete1).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "My Wishlist");
		System.out.println("Assert passed");
		logger.info("Deleted from Wishlist");

	}
	

	
}
