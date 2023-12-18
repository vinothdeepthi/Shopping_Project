package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dash_Board_Page {
	
	WebDriver driver;
	

	@FindBy(xpath = "(//a[@href='/account'])[1]")
	private WebElement Profile_Logo;
	
	@FindBy(xpath = "//a[text()='Sign up now!']")
	private WebElement SignUp_Button;
	
	@FindBy(xpath = "//span[text()='New Arrivals']")
	private WebElement New_Arrivals;
	
	@FindBy(xpath = "//span[text()='Shop']")
	private WebElement Shop_Link;
	
	public WebElement getShop_Link() {
		return Shop_Link;
	}

	public WebElement getDabuHand_block_Print() {
		return DabuHand_block_Print;
	}


	@FindBy(xpath = "//span[text()='Dabu Hand-block Print']")
	private WebElement DabuHand_block_Print;
	
	
	
	

	  public WebElement getNew_Arrivals() {
		return New_Arrivals;
	}

	public Dash_Board_Page(WebDriver driver) {
			
			this.driver=driver;
			
			PageFactory.initElements(driver, this);
		}
	  
	  public WebDriver getDriver() {
			return driver;
		}


		public WebElement getProfile_Logo() {
			return Profile_Logo;
		}


		public WebElement getSignUp_Button() {
			return SignUp_Button;
		}

	
	

}
