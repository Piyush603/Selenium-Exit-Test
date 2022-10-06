package Com.Sample.testcases;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Com.Sample.base.basepage;
import Com.Sample.pages.FilterPage;
import Com.Sample.pages.LoginPage;
import Com.Sample.pages.SearchPage;
import Com.Sample.utilities.PropertiesFile;

public class FilterTest extends basepage {
	FilterPage lp;

	public FilterTest() {
		super();
	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new FilterPage(null);

	}

	@Test(priority = 14)

	public void Filter() throws InterruptedException {

		// to Search for the data

		driver.findElement(LoginPage.btn_Login1).click();
		Thread.sleep(2000);
		driver.findElement(SearchPage.txt_search).sendKeys(PropertiesFile.prop.getProperty("Search2"));
		driver.findElement(SearchPage.btn_submit).click();
		driver.navigate().refresh();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-800)");
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Mobiles- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
		System.out.println("Assert passed");

	}

	@Test(priority = 15)
	public void FilterFewThings() throws InterruptedException {

		// to Search for the data

		driver.findElement(LoginPage.btn_Login1).click();
		Thread.sleep(2000);
		driver.findElement(SearchPage.txt_search).sendKeys(PropertiesFile.prop.getProperty("Search2"));
		driver.findElement(SearchPage.btn_submit).click();
		driver.navigate().refresh();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-1200)");
		Thread.sleep(2000);

		// to filter out the data
		
		WebElement select = driver.findElement(FilterPage.btn_filterr);
		select.click();
		Thread.sleep(2000);
		WebElement select1 = driver.findElement(FilterPage.btn_filterr1);
		js.executeScript("window.scrollBy(0,-200)");
		select1.click();
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(FilterPage.btn_search).click();

		// to filter out more data

		driver.findElement(FilterPage.btn_search).sendKeys(PropertiesFile.prop.getProperty("MobileName"));
		driver.findElement(FilterPage.btn_submit).click();
		driver.navigate().refresh();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js1.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(2000);
		driver.findElement(FilterPage.btn_backtotop).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(),
				"Mobiles- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
		System.out.println("Assert passed");

	}

	@Test(priority = 16)
	public void DeleteFilteredThings() throws InterruptedException {

		// to Search for the data

		driver.findElement(LoginPage.btn_Login1).click();
		Thread.sleep(2000);
		driver.findElement(SearchPage.txt_search).sendKeys(PropertiesFile.prop.getProperty("Search2"));
		driver.findElement(SearchPage.btn_submit).click();
		driver.navigate().refresh();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-1200)");
		Thread.sleep(2000);

		// to filter out the data

		WebElement select = driver.findElement(FilterPage.btn_filterr);
		select.click();
		Thread.sleep(2000);
		WebElement select1 = driver.findElement(FilterPage.btn_filterr1);
		js.executeScript("window.scrollBy(0,-200)");
		select1.click();
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(FilterPage.btn_search).click();
		driver.findElement(FilterPage.btn_search).sendKeys(PropertiesFile.prop.getProperty("MobileName"));
		driver.findElement(FilterPage.btn_submit).click();
		driver.navigate().refresh();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js1.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(2000);
		driver.findElement(FilterPage.btn_backtotop).click();
		Thread.sleep(2000);

		// to delete the filtered section

		driver.findElement(FilterPage.btn_delete).click();
		Thread.sleep(2000);
		js1.executeScript("window.scrollBy(0,-200)");
		driver.findElement(FilterPage.btn_delete1).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(),
				"Mobiles- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
		System.out.println("Assert passed");

	}

}
