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
import Com.Sample.utilities.PropertiesFile;



public class AddaddressTest extends basepage {

	AddAddressPage lp;
	private static Logger logger = LogManager.getLogger(AddaddressTest.class);

	public AddaddressTest() {
		super();
	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new AddAddressPage(null);
	}
	@Test(priority = 3,groups = {"smoke"})
	public void AddValidAddresstest() throws InterruptedException {

		// login code

		driver.findElement(AddAddressPage.txt_username1).sendKeys(PropertiesFile.prop.getProperty("number"));
		driver.findElement(AddAddressPage.txt_password1).sendKeys(PropertiesFile.prop.getProperty("password"));
		driver.findElement(LoginPage.btn_button1).click();
		Thread.sleep(3000);
		logger.info("Logging Successful");

		// to hover over username... and to click on my profile and to add new address

		WebElement mouse_hover = driver.findElement(AddAddressPage.btn_mousehover);
		Actions act = new Actions(driver);
		act.moveToElement(mouse_hover).perform();
		Thread.sleep(2000);
		WebElement profile = driver.findElement(AddAddressPage.btn_profile);
		profile.click();
		logger.info("Clicked to My profile");
		
		
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(3000);
		WebElement Manage_address = driver.findElement(AddAddressPage.btn_manageaddress);
		Actions acts = new Actions(driver);
		acts.moveToElement(Manage_address).click().perform();
		Thread.sleep(2000);
		logger.info("Clicked to Manage Address window");
		
		WebElement Address = driver.findElement(AddAddressPage.btn_Add);
		Actions actss = new Actions(driver);
		actss.moveToElement(Address).click().perform();
		driver.findElement(AddAddressPage.txt_Name).sendKeys(PropertiesFile.prop.getProperty("Name"));
		driver.findElement(AddAddressPage.txt_Mobile).sendKeys(PropertiesFile.prop.getProperty("MobileNo"));
		driver.findElement(AddAddressPage.txt_Pin).sendKeys(PropertiesFile.prop.getProperty("Pincode"));
		driver.findElement(AddAddressPage.txt_Loc).sendKeys(PropertiesFile.prop.getProperty("Locality"));
		driver.findElement(AddAddressPage.txt_NewAdd).sendKeys(PropertiesFile.prop.getProperty("NewAddress"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		driver.findElement(AddAddressPage.txt_City).clear();
		driver.findElement(AddAddressPage.txt_City).sendKeys(PropertiesFile.prop.getProperty("City"));

		driver.findElement(AddAddressPage.txt_State).sendKeys(PropertiesFile.prop.getProperty("State"));
		driver.findElement(AddAddressPage.txt_click).click();

		driver.findElement(AddAddressPage.btn_save).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Manage Addresses");
		System.out.println("Assert passed");
		logger.info(" Address added successfully ");
	}

	@Test(priority = 4,groups = {"smoke"})
	public void AddInvalidAddresstest() throws InterruptedException {

		driver.findElement(AddAddressPage.txt_username1).sendKeys(PropertiesFile.prop.getProperty("number"));
		driver.findElement(AddAddressPage.txt_password1).sendKeys(PropertiesFile.prop.getProperty("password"));
		driver.findElement(LoginPage.btn_button1).click();
		Thread.sleep(3000);
		logger.info("Logging Successful");

		// to hover over username... and to click on my profile and to add new address 

		WebElement mouse_hover = driver.findElement(AddAddressPage.btn_mousehover);
		Actions act = new Actions(driver);
		act.moveToElement(mouse_hover).perform();
		Thread.sleep(2000);
		WebElement profile = driver.findElement(AddAddressPage.btn_profile);
		profile.click();
		logger.info("Clicked to My profile");

		
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(3000);
		WebElement Manage_address = driver.findElement(AddAddressPage.btn_manageaddress);
		Actions acts = new Actions(driver);
		acts.moveToElement(Manage_address).click().perform();
		Thread.sleep(2000);
		logger.info("Clicked to Manage Address window");

		WebElement Address = driver.findElement(AddAddressPage.btn_Add);
		Actions actss = new Actions(driver);
		actss.moveToElement(Address).click().perform();
		driver.findElement(AddAddressPage.txt_Name).sendKeys(PropertiesFile.prop.getProperty("Name"));
		driver.findElement(AddAddressPage.txt_Mobile).sendKeys(PropertiesFile.prop.getProperty("MobileNo1"));
		driver.findElement(AddAddressPage.txt_Pin).sendKeys(PropertiesFile.prop.getProperty("Pincode"));
		driver.findElement(AddAddressPage.txt_Loc).sendKeys(PropertiesFile.prop.getProperty("Locality"));
		driver.findElement(AddAddressPage.txt_NewAdd).sendKeys(PropertiesFile.prop.getProperty("NewAddress"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		driver.findElement(AddAddressPage.txt_City).clear();
		driver.findElement(AddAddressPage.txt_City).sendKeys(PropertiesFile.prop.getProperty("City"));

		driver.findElement(AddAddressPage.txt_State).sendKeys(PropertiesFile.prop.getProperty("State"));
		driver.findElement(AddAddressPage.txt_click).click();

		driver.findElement(AddAddressPage.btn_save).click();
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,-700)");
		Thread.sleep(2000);
		logger.info(" Address did not get added ");

		Assert.assertEquals(driver.getTitle(), "Mange Addresses");
		driver.manage().timeouts().implicitlyWait(1, null);
		
	}


}
