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
import Com.Sample.pages.DeleteAddressPage;
import Com.Sample.pages.LoginPage;
import Com.Sample.utilities.PropertiesFile;

public class DeleteAddressTest extends basepage {
	DeleteAddressPage lp;

	public DeleteAddressTest() {
		super();
	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new DeleteAddressPage(null);
	}

	@Test(priority = 5)
	public void EditAddressTest() throws InterruptedException {
		driver.findElement(AddAddressPage.txt_username1).sendKeys(PropertiesFile.prop.getProperty("number"));
		driver.findElement(AddAddressPage.txt_password1).sendKeys(PropertiesFile.prop.getProperty("password"));
		driver.findElement(LoginPage.btn_button1).click();
		Thread.sleep(3000);

		// to hover over username... and to click on my profile and to edit the existing address


		WebElement mouse_hover = driver.findElement(AddAddressPage.btn_mousehover);
		Actions act = new Actions(driver);
		act.moveToElement(mouse_hover).perform();
		Thread.sleep(2000);
		WebElement profile = driver.findElement(AddAddressPage.btn_profile);
		profile.click();
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
		WebElement mouse_hover1 = driver.findElement(DeleteAddressPage.btn_mousehover1);
		Actions act1 = new Actions(driver);
		act1.moveToElement(mouse_hover1).perform();
		WebElement edit = driver.findElement(DeleteAddressPage.btn_edit);
		Actions acts3 = new Actions(driver);
		acts3.moveToElement(edit).click().perform();
		driver.findElement(AddAddressPage.txt_Name).clear();
		driver.findElement(AddAddressPage.txt_Name).sendKeys(PropertiesFile.prop.getProperty("Name1"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		driver.findElement(DeleteAddressPage.btn_save).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Manage Addresses");
		System.out.println("Assert passed");
	}

	@Test(priority = 6)

	public void DeleteAddressTest1() throws InterruptedException {

		driver.findElement(AddAddressPage.txt_username1).sendKeys(PropertiesFile.prop.getProperty("number"));
		driver.findElement(AddAddressPage.txt_password1).sendKeys(PropertiesFile.prop.getProperty("password"));
		driver.findElement(LoginPage.btn_button1).click();
		Thread.sleep(3000);

		// to hover over username... and to click on my profile and to delete the address

		WebElement mouse_hover = driver.findElement(AddAddressPage.btn_mousehover);
		Actions act = new Actions(driver);
		act.moveToElement(mouse_hover).perform();
		Thread.sleep(2000);
		WebElement profile = driver.findElement(AddAddressPage.btn_profile);
		profile.click();
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
		WebElement mouse_hover2 = driver.findElement(DeleteAddressPage.btn_mousehover1);
		Actions act1 = new Actions(driver);
		act1.moveToElement(mouse_hover2).perform();
		WebElement delete = driver.findElement(DeleteAddressPage.btn_delete);
		Actions acts2 = new Actions(driver);
		acts2.moveToElement(delete).click().perform();
		driver.findElement(DeleteAddressPage.btn_delete1).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Manage Addresses");
		System.out.println("Assert passed");
	}
	

}
