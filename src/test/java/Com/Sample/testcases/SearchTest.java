package Com.Sample.testcases;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Sample.base.basepage;
import Com.Sample.pages.LoginPage;
import Com.Sample.pages.SearchPage;
import Com.Sample.utilities.PropertiesFile;

public class SearchTest extends basepage {
	SearchPage lp;
	private static Logger logger = LogManager.getLogger(SearchTest.class);

	
	public SearchTest() {
		super();
	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new SearchPage(null);

	}

	@Test(priority = 12,groups = {"sanity"})
	public void Search() throws InterruptedException {
		
		driver.findElement(LoginPage.btn_Login1).click();
		Thread.sleep(2000);
		
		// to search for the particular element on the search box
		
		driver.findElement(SearchPage.txt_search).sendKeys(PropertiesFile.prop.getProperty("Search1"));
		driver.findElement(SearchPage.btn_submit).click();
		//driver.navigate().refresh();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(),
				"Iphone 13- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
		System.out.println("Assert passed");
	}

	@Test(priority = 13,groups = {"sanity"})
	public void AddToCart() throws InterruptedException {
		driver.findElement(LoginPage.btn_Login1).click();
		Thread.sleep(2000);
		
		// to search for the particular element on the search box
		
		driver.findElement(SearchPage.txt_search).sendKeys(PropertiesFile.prop.getProperty("Search1"));
		driver.findElement(SearchPage.btn_submit).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		
		// to click on the particular item in that list
		
		driver.findElement(SearchPage.txt_search1).click();
		
		// to open up the new tab and close the tab after adding the element to the cart
		
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		WebElement submitt = driver.findElement(SearchPage.btn_cart);
		submitt.click();
		Thread.sleep(2000);
		driver.close();
		
		// to switch back to the old tab where all the items exists and then click refresh to see element being added
		
		driver.switchTo().window(tabs2.get(0));
		driver.navigate().refresh();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(),
				"Iphone 13- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
		System.out.println("Assert passed");
	}

}
