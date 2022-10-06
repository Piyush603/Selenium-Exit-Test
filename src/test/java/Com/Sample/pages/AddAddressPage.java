package Com.Sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class AddAddressPage {

	WebDriver driver;

	public AddAddressPage(WebDriver driver) {
		this.driver = driver;
	}
	public static By txt_username1 = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
	public static By txt_password1 = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
	public static By btn_mousehover = By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div");
	public static By btn_profile = By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/ul/li[1]/a");
	public static By btn_manageaddress = By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[2]/div[2]/div[1]/div[2]/a[2]/div");
	public static By btn_Add = By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div");
	public static By txt_Name = By.name("name");
	public static By txt_Mobile = By.name("phone");
	public static By txt_Pin = By.name("pincode");
	public static By txt_Loc = By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div/form/div/div[3]/div[2]/input");
	public static By txt_NewAdd = By.name("addressLine1");
	public static By txt_City = By.name("city");
	public static By txt_State = By.name("state");
	public static By txt_click = By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div/form/div/div[7]/div/div/label[1]/div[1]");
	public static By btn_save = By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div/form/div/div[8]/button[1]");

}
