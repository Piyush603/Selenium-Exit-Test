package Com.Sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignoutPage {
	WebDriver driver;

	public SignoutPage(WebDriver driver) {
		this.driver = driver;

	}

	public static By btn_Signout = By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/ul/li[9]/a/div");
}


