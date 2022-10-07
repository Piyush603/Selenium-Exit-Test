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
import Com.Sample.pages.OrdersPage;
import Com.Sample.utilities.PropertiesFile;

public class OrdersTest extends basepage {
	OrdersPage lp;
	private static Logger logger = LogManager.getLogger(OrdersTest.class);
	public OrdersTest() {
		super();
	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new OrdersPage(null);
	}

	@Test(priority=8,groups = {"sanity"})
	
	public void OrderTest() throws InterruptedException {
		
		// login code

		driver.findElement(AddAddressPage.txt_username1).sendKeys(PropertiesFile.prop.getProperty("number"));
		driver.findElement(AddAddressPage.txt_password1).sendKeys(PropertiesFile.prop.getProperty("password"));
		driver.findElement(LoginPage.btn_button1).click();
		Thread.sleep(3000);

		// to hover over username... and to click on orders tab

		WebElement mouse_hover = driver.findElement(AddAddressPage.btn_mousehover);
		Actions act = new Actions(driver);
		act.moveToElement(mouse_hover).perform();
		Thread.sleep(2000);
		WebElement orderss = driver.findElement(OrdersPage.btn_orders);
		orderss.click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Flipkart.com: Your Order History");
		System.out.println("Assert passed");
	}
	@Test(priority=9,groups = {"sanity"})
	
	public void FilterOrderTest() throws InterruptedException {
		
		// login code

		driver.findElement(AddAddressPage.txt_username1).sendKeys(PropertiesFile.prop.getProperty("number"));
		driver.findElement(AddAddressPage.txt_password1).sendKeys(PropertiesFile.prop.getProperty("password"));
		driver.findElement(LoginPage.btn_button1).click();
		Thread.sleep(3000);

		// to hover over username... and to click on orders tab

		WebElement mouse_hover = driver.findElement(AddAddressPage.btn_mousehover);
		Actions act = new Actions(driver);
		act.moveToElement(mouse_hover).perform();
		Thread.sleep(2000);
		WebElement orderss = driver.findElement(OrdersPage.btn_orders);
		orderss.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-600)");
		
		// to click to the filter section of cancelled
		
		WebElement box = driver.findElement(OrdersPage.box_cancelled);
		box.click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Flipkart.com: Your Order History");
		System.out.println("Assert passed");
		
	}
	

}
