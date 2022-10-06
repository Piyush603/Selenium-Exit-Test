package Com.Sample.testcases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Com.Sample.base.basepage;
import Com.Sample.pages.LoginPage;
import Com.Sample.pages.SellerPage;

public class SellerTest extends basepage {
	SellerPage lp;

	public SellerTest() {
		super();
	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new SellerPage(null);
	}

	@Test(priority = 17)
	public void SellerTest1() throws InterruptedException {
		driver.findElement(LoginPage.btn_Login1).click();
		Thread.sleep(2000);
		driver.findElement(SellerPage.btn_Seller).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-1700)");
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(),
				"Sell Online on Flipkart | Grow your business with the leader in Indian e-commerce");
		System.out.println("Assert passed");
	}

}
