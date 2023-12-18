package Constents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.Dash_Board_Page;
import Pages.Products_Page;
import Pages.Shopping_Bag_Page;
import Pages.SignUp_Page;
import Utilities.Utils;

public class Constent {
	
	protected Dash_Board_Page dash = new Dash_Board_Page(driver);
	
	protected SignUp_Page sign = new SignUp_Page(driver);
	
	protected Products_Page pro = new Products_Page(driver);
	
	protected Shopping_Bag_Page shop = new Shopping_Bag_Page(driver);
	
	
	public static WebDriver driver;
	
	public static WebDriverWait wait ;
	
	public static String system = "webdriver.chrome.driver";
	
	public static String Browser_Path ;
	
	public static String Browser_Name;
	
	public static String Url ;
	
	public static String Product_Name ;
	
	public static String New_Arrival;
	
	
	

}
