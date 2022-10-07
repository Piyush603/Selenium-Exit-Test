package Com.Sample.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Com.Sample.base.basepage;
import Com.Sample.pages.FilterPage;
import Com.Sample.pages.LoginPage;
import Com.Sample.utilities.ExcelReader;
import Com.Sample.utilities.PropertiesFile;

public class LoginTest extends basepage {
	LoginPage lp;
	private static Logger logger = LogManager.getLogger(LoginTest.class);

	public LoginTest() {
		super();
	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new LoginPage(null);
	}

	@Test(priority = 1,groups = {"smoke"})
	public void correctemailtest() throws Exception {

		driver.findElement(LoginPage.btn_Login1).click();
		Thread.sleep(2000);
		driver.findElement(LoginPage.btn_Login2).click();
		ExcelReader excel = new ExcelReader();
		String USERID = excel.readingData(0, 1);
		String PASSWORD = excel.readingData(1, 1);
		logger.info("Logging Successful through excel");
		driver.findElement(LoginPage.txt_username).sendKeys(USERID);
		driver.findElement(LoginPage.txt_password).sendKeys(PASSWORD);
		//driver.findElement(LoginPage.txt_username).sendKeys(PropertiesFile.prop.getProperty("number"));
		//driver.findElement(LoginPage.txt_password).sendKeys(PropertiesFile.prop.getProperty("password"));
		driver.findElement(LoginPage.btn_button1).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		System.out.println("Assert passed");	
		logger.info("Logging Successful");
	}

	@Test(priority = 2,groups = {"smoke"})
	public void Incorrectemailtest() throws InterruptedException {

		driver.findElement(LoginPage.btn_Login1).click();
		Thread.sleep(2000);
		driver.findElement(LoginPage.btn_Login2).click();
		driver.findElement(LoginPage.txt_username).sendKeys(PropertiesFile.prop.getProperty("number"));
		driver.findElement(LoginPage.txt_password).sendKeys(PropertiesFile.prop.getProperty("password2"));
		driver.findElement(LoginPage.btn_button1).click();
		Thread.sleep(3000);
		logger.info("Logging UnSuccessful");
		driver.manage().timeouts().implicitlyWait(10, null);
		Assert.assertEquals(driver.getTitle(),
				"Online hopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		

	}
	

}
