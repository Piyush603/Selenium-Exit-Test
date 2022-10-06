package Com.Sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishlistPage {
	WebDriver driver;

	public WishlistPage(WebDriver driver) {
		this.driver = driver;
	}
	public static By btn_wishlist = By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/ul/li[5]/a/div[1]");
	public static By btn_backtotop = By.xpath("//*[@id=\"container\"]/div/div[4]/div/span");
	public static By btn_delete = By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div[2]/a/div[2]/div[2]/div/span");
	public static By btn_delete1 = By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div[2]/a/div[2]/div[2]/div/div/div[1]/div[2]/div/div/div/button[2]");


}

