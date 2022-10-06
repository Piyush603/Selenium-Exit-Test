package Com.Sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SellerPage {
	WebDriver driver;

	public SellerPage(WebDriver driver) {
		this.driver = driver;

	}

	public static By btn_Seller = By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[4]/a/span");

}
