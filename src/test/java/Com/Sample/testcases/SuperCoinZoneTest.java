package Com.Sample.testcases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Sample.base.basepage;
import Com.Sample.pages.AddAddressPage;
import Com.Sample.pages.LoginPage;
import Com.Sample.pages.SuperCoinZonePage;
import Com.Sample.utilities.PropertiesFile;

public class SuperCoinZoneTest extends basepage {
	SuperCoinZonePage lp;

	public SuperCoinZoneTest() {
		super();
	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new SuperCoinZonePage(null);

	}

	@Test(priority = 7)

	public void SuperCoinZoneTest1() throws InterruptedException {
		// login code

		driver.findElement(AddAddressPage.txt_username1).sendKeys(PropertiesFile.prop.getProperty("number"));
		driver.findElement(AddAddressPage.txt_password1).sendKeys(PropertiesFile.prop.getProperty("password"));
		driver.findElement(LoginPage.btn_button1).click();
		Thread.sleep(3000);

		// to hover over username... and to click on supercoinzone page

		WebElement mouse_hover = driver.findElement(AddAddressPage.btn_mousehover);
		Actions act = new Actions(driver);
		act.moveToElement(mouse_hover).perform();
		Thread.sleep(2000);
		WebElement supercoin = driver.findElement(SuperCoinZonePage.btn_coin);
		supercoin.click();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),
				"Flipkart SuperCoins – Re-usable rewards awarded by Flipkart on every Order! | Flipkart.com");
		System.out.println("Assert passed");
	}

}
