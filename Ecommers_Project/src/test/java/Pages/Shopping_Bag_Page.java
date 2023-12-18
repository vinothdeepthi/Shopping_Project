package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Shopping_Bag_Page {
	
	WebDriver driver;

	@FindBys({@FindBy(xpath = "//div[@class='d-flex flex-column']//a")})
	private List<WebElement> Shopping_Products;
	
public Shopping_Bag_Page(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

public WebDriver getDriver() {
	return driver;
}

public List<WebElement> getShopping_Products() {
	return Shopping_Products;
}

}
