package StepDefenition;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Constents.Constent;
import Pages.Products_Page;
import Utilities.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart_New_Arraivels_Products extends Constent {
	
	
	
	@Given("User Navigate The Application")
	public void user_navigate_the_application() {
	   
		driver.get(Url);
	}
	@When("User Click On The New Arraivels Link")
	public void user_click_on_the_new_arraivels_link() throws InterruptedException {


		dash.getNew_Arrivals().click();
     
     
		
	}
	
	@When("User Should Be Able To Select The Product")
	public void user_should_be_able_to_select_the_product() {
		
		

      for (WebElement Alls : pro.getProduct_List()) {
    	  
    	  if(Alls.getText().equalsIgnoreCase(Constent.New_Arrival)) {
    		  
    		  Alls.click();
    		  
    		  break;
    	  }
		
	}
		
	}
	@When("User Should Be  Select The Size and Quantity {string}")
	public void user_should_be_select_the_size_and_quantity(String Quanity) {

      pro.getQuantity().sendKeys(Quanity);
      
		for (WebElement size : pro.getProduct_Size()) {
    	  
    	 if( size.getAttribute("data-js-trigger-id").equalsIgnoreCase("footbar-size-l")) {
    		 
    		 size.click();
    		 
    		 break;
    	 }
		
	}
		
	}
	@When("User Click On The AddToCart button and click On The View Shopping Bage")
	public void user_click_on_the_add_to_cart_button_and_click_on_the_view_shopping_bage() {
	   
		pro.getAddtoCart_Button().click();
		
		pro.getShopping_Bag_Button().click();
	}
	@Then("Verify That Product Successfully Add To The Shopping Bag Page")
	public void verify_that_product_successfully_add_to_the_shopping_bag_page() {
	    
		for (WebElement products : shop.getShopping_Products()) {
			
			if(products.getText().equalsIgnoreCase(Constent.New_Arrival)) {
				Assert.assertTrue(true);
				break;
			}
			
			else {
				
				Assert.assertTrue(false);
			}
		}
		
	}

}
