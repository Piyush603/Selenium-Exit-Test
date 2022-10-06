package Com.Sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrdersPage {
	WebDriver driver;

	public OrdersPage(WebDriver driver) {
		this.driver = driver;

	}

	public static By btn_orders = By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/ul/li[4]/a/div");
	public static By box_cancelled = By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[3]/div[1]/div/div[2]/div[4]/div");
}


