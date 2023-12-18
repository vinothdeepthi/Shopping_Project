package StepDefenition;

import Constents.Constent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_SignUp_Fuctions extends Constent {
	
	@Given("Lounch The Application")
	public void lounch_the_application() {
	    
		driver.get(Url);
	}
	@When("User Click On the Signup button")
	public void user_click_on_the_signup_button() {
	    
		dash.getProfile_Logo().click();
		
		dash.getSignUp_Button().click();
	}
	
	@When("User Entering The First Name and Last Name Phone Number Email and Password {string} And {string} And {string} And {string} And {string}")
	public void user_entering_the_first_name_and_last_name_phone_number_email_and_password_and_and_and_and(String username, String Lastname, String Phone, String email, String password) {

		sign.getFirstName().sendKeys(username);
		sign.getLastName().sendKeys(Lastname);
		sign.getPhone().sendKeys(Phone);
		sign.getEmail().sendKeys(email);
		sign.getPassword().sendKeys(password);
		
	}
	@When("User Click On The SignUp Now button")
	public void user_click_on_the_sign_up_now_button() {
	    
		sign.getSignup_Now_Button().click();
		
	}
	@Then("User Should Be Navigate The DashBoard Page")
	public void user_should_be_navigate_the_dash_board_page() {
	    
		System.out.println("User Successfully Signup The Account");
		
	}

}
