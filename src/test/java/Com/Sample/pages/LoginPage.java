package Com.Sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage  {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
	
	public static By btn_Login1 = By.xpath("/html/body/div[2]/div/div/button");
	public static By btn_Login2 = By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a");
	public static By txt_username = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
	public static By txt_password = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
	//public static By btn_button = By.xpath("/html/bodydiv[2]/div/div/div/div/div[2]/div/form/div[4]/button");
	public static By btn_button1 = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button");

}
