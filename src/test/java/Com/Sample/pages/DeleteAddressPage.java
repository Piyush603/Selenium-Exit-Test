package Com.Sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteAddressPage {
	WebDriver driver;

	public DeleteAddressPage(WebDriver driver) {
		this.driver = driver;
	}
	public static By btn_mousehover1 = By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div");
	public static By btn_edit = By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/span");
	public static By btn_save = By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div/form/div/div[8]/button[1]");
	public static By btn_mousehover2 = By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/div[2]/div[1]/div/div[1]/div");

	public static By btn_delete = By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[2]/span");
	public static By btn_delete1 = By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div[2]/button[1]");

}
