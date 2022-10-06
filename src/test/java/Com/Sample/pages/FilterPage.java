package Com.Sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FilterPage {
	WebDriver driver;

	public FilterPage(WebDriver driver) {
		this.driver = driver;

	}
	public static By btn_mobiles = By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[3]/a/div[2]");
	public static By btn_filterr = By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[2]/div[4]/div[3]/select");
	public static By btn_filterr1 = By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[2]/div[4]/div[3]/select/option[3]");
	public static By btn_search = By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[3]/div[2]/div[1]/div[1]/input");
	public static By btn_click = By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[3]/div[2]/div[1]/div[2]/div/label/div[1]");
	public static By btn_submit = By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[3]/div[2]/div[1]/div[2]/div/label/div[1]");
	public static By btn_backtotop = By.xpath("//*[@id=\"container\"]/div/div[4]/div/span");
	public static By btn_delete = By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[1]/div[2]/div[1]/div[2]/div[2]");
	public static By btn_delete1 = By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[1]/div[2]/div[1]/div/div[2]");

	

	
}
