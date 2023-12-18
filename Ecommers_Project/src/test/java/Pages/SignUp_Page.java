package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp_Page {
	
	WebDriver driver ;
	
	@FindBy(id = "PopupFirstName")
	private WebElement FirstName;
	
	@FindBy(id =  "PopupLastName")
	private WebElement LastName;
	
	@FindBy(id="PopupPhone")
	private WebElement Phone;
	
	@FindBy(id = "PopupEmail")
	private WebElement Email;
	
	@FindBy(id = "PopupCreatePassword")
	private WebElement Password;
	
	@FindBy(xpath = "//input[@value = 'Sign up now!']")
	private WebElement Signup_Now_Button;
	
	public SignUp_Page(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getPhone() {
		return Phone;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getSignup_Now_Button() {
		return Signup_Now_Button;
	}


}
