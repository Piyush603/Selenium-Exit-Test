package Com.Sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FavoritesPage {
	WebDriver driver;

	public FavoritesPage(WebDriver driver) {
		this.driver = driver;

	}

	public static By btn_hover = By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/span[3]");
	public static By btn_hover1 = By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div/div[2]/a[3]");
	public static By btn_add = By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a/div[3]/div");
	public static By btn_delete = By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a/div[3]/div");
	
}



//*[@id="container"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a/div[3]/div/svg/path