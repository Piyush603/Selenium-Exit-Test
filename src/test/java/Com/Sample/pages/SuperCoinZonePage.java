package Com.Sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuperCoinZonePage  {
	WebDriver driver;

	public SuperCoinZonePage(WebDriver driver) {
		this.driver = driver;
	}
	public static By btn_coin = By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/ul/li[2]/a/div");
}
