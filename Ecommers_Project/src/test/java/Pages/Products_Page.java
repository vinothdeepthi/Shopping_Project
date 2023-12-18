package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Products_Page {
	
	WebDriver driver;
	
	@FindBys({@FindBy(xpath = "//div[@class='product-collection__title mb-3']//a")})
	private List<WebElement> Product_List;
	
	@FindBys({@FindBy(xpath = "//div[@class='product-options__section d-flex flex-wrap']//div")})
	private List<WebElement> Product_Size;
	
	@FindBy(name = "quantity")
	private WebElement Quantity;
	
	@FindBy(xpath = "(//span[text()='Add To Cart'])[1]")
	private WebElement AddtoCart_Button;
	
	@FindBy(xpath = "//a[text()='VIEW SHOPPING BAG']")
	private WebElement Shopping_Bag_Button;
	
	public Products_Page(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	

	public WebDriver getDriver() {
		return driver;
	}

	public List<WebElement> getProduct_List() {
		return Product_List;
	}

	public List<WebElement> getProduct_Size() {
		return Product_Size;
	}

	public WebElement getQuantity() {
		return Quantity;
	}

	public WebElement getAddtoCart_Button() {
		return AddtoCart_Button;
	}

	public WebElement getShopping_Bag_Button() {
		return Shopping_Bag_Button;
	}
	
	
	
	
	
    

}
