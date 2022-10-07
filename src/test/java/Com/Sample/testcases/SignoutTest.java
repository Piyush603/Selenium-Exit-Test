package Com.Sample.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Sample.base.basepage;
import Com.Sample.pages.AddAddressPage;
import Com.Sample.pages.LoginPage;
import Com.Sample.pages.SignoutPage;
import Com.Sample.utilities.PropertiesFile;

public class SignoutTest extends basepage {
	SignoutPage lp;
	private static Logger logger = LogManager.getLogger(SignoutTest.class);


	public SignoutTest() {
		super();
	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new SignoutPage(null);
	}

	@Test(priority = 20,groups = {"smoke"})
	public void SignouttTest() throws InterruptedException {
		
		// login code

		driver.findElement(AddAddressPage.txt_username1).sendKeys(PropertiesFile.prop.getProperty("number"));
		driver.findElement(AddAddressPage.txt_password1).sendKeys(PropertiesFile.prop.getProperty("password"));
		driver.findElement(LoginPage.btn_button1).click();
		Thread.sleep(3000);
		logger.info("Login Successful");

		
		//to hover over my profile tab 
		
		WebElement mouse_hover = driver.findElement(AddAddressPage.btn_mousehover);
		Actions act = new Actions(driver);
		act.moveToElement(mouse_hover).perform();
		Thread.sleep(2000);
		
		// to click to logout window
		
		WebElement orderss = driver.findElement(SignoutPage.btn_Signout);
		orderss.click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		System.out.println("Assert passed");
		logger.info("Signout Successful");

	}

}
