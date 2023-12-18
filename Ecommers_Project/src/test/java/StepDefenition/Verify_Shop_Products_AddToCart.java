package StepDefenition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Constents.Constent;
import Utilities.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_Shop_Products_AddToCart extends Constent {
	
	
	
	@Given("User Should Be Navigate To The Application")
	public void user_should_be_navigate_to_the_application() {
	    
		driver.get(Url);
	}
	@When("User Should Be Click On The Shop Link")
	public void user_should_be_click_on_the_shop_link() {
		
		Actions act = new Actions(driver);
	  
		act.moveToElement(dash.getShop_Link()).perform();
		
		act.moveToElement(dash.getDabuHand_block_Print()).click().perform();
	}
	@When("User Should Be Select The Product")
	public void user_should_be_select_the_product() {
	    
		for (WebElement All : pro.getProduct_List()) {
			
			if(All.getText().equalsIgnoreCase(Constent.Product_Name)) {
				
				 
				All.click();
				
				break;
			}
		}
	}
	@When("User Select The Size And Quanity Of The Product {string}")
	public void user_select_the_size_and_quanity_of_the_product(String Quanity) {
	 
		  pro.getQuantity().sendKeys(Quanity);
	      
	      for (WebElement size : pro.getProduct_Size()) {
	    	  
	    	 if( size.getAttribute("data-js-trigger-id").equalsIgnoreCase("footbar-size-l")) {
	    		 
	    		 size.click();
	    		 
	    		 break;
	    	 }
	}
	}
	@When("User Click On The AddTo cart button and View The Shooping bag button")
	public void user_click_on_the_add_to_cart_button_and_view_the_shooping_bag_button() {
	    
        pro.getAddtoCart_Button().click();
		
		pro.getShopping_Bag_Button().click();
	}
	@Then("User Should Be Verify The Correct Product To Add The Shooping Bag Or Not")
	public void user_should_be_verify_the_correct_product_to_add_the_shooping_bag_or_not() {
		
          for (WebElement products : shop.getShopping_Products()) {
			
			if(products.getText().equalsIgnoreCase(Constent.Product_Name)) {
				Assert.assertTrue(true);
				break;
			}
			
			else {
				
				Assert.assertTrue(false);
			}
		}
	}

}
