package com.sdet.lms.stepdefinition.registration;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.sdet.lms.pageobjects.Login;
import com.sdet.lms.pageobjects.PageObjectManager;
import com.sdet.lms.pageobjects.Registration;
import com.sdet.lms.utilities.BaseClass;
import com.sdet.lms.utilities.ContextUI;
import com.sdet.lms.utilities.Util;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

	
public class RegistrationStep {
 
	
	Map<String,String> scnearioDataMap;
	String scenarioValue;
  

	ContextUI context;
	Registration registrationPage;
	boolean validinput;
	PageObjectManager pageObjectManager;
	
	
	public RegistrationStep(ContextUI c) {

		System.out.println("In initBrower driver");
		context=new ContextUI();
		
		registrationPage = context.getPageObjectManager().getRegistrationPage();
	}
	 @Before
		public void before(Scenario s) {
			
			System.out.println("currently executig scenario Name " + s.getName());
			System.out.println("currently executig scenario getLine" + s.getLine());
			System.out.println("currently executig scenario s.getStatus().name()" + s.getStatus().name());
			scnearioDataMap=Util.getScenarioData();
			scenarioValue=scnearioDataMap.get(s.getName());
		 
		}

		
	@After
    public void close() {
		context.getDriver().quit();
    }
   
   
@Given("user is on LMS website")
public void user_is_on_lms_website() {
	System.out.println("User is on LMS website");
	System.out.println("Value from csv=="+scenarioValue);
}

@When("user lands on Registration page")
public void user_lands_on_registration_page() {
	//System.out.println(driver.getTitle());
    
}

@Then("User should see the heading of the Registration form")
public void user_should_see_the_heading_of_the_registration_form() {
	//System.out.println(driver.getTitle());
}

@When("user is on the Registration page")
public void user_is_on_the_registration_page() {
	System.out.println("You are in Registration page");
	System.out.println("Value from csv=="+scenarioValue);
    
}

@Then("user should see the Login button")
public void user_should_see_the_login_button() {
	System.out.println("Check the login button");
	System.out.println("Value from csv=="+scenarioValue);
	//assertEquals(false,scenarioValue);
    
}

@Given("user is on Registration page")
public void user_is_on_registration_page() {
	System.out.println("You are in Registration page");
	System.out.println("Value from csv=="+scenarioValue);
	//assertEquals("Registration",scenarioValue);
}

@When("user clicks Login button")
public void user_clicks_login_button() {
	System.out.println("User clicks Login button");
	System.out.println("Value from csv=="+scenarioValue);
	//assertEquals("Login",scenarioValue);
   
}

@Then("user should land in Login page")
public void user_should_land_in_login_page() {
	System.out.println("You are in Login page");
	System.out.println("Value from csv=="+scenarioValue);
    
}

@Then("user should see the Sign Up button on the Form")
public void user_should_see_the_sign_up_button_on_the_form() {
	System.out.println("Check the Sign up button");
	System.out.println("Value from csv=="+scenarioValue);
	//Assert.assertEquals("Sign Up", scenarioValue);
	
}
@Given("user is on the Registeration Page")
public void user_is_on_the_registeration_page() {
	registrationPage.enterfirstname(scenarioValue);
	System.out.println("You are in Registration page");
}

@When("user fills the First Name in Alphabets only")
public void user_fills_the_first_name_in_alphabets_only() {

	String firstname=registrationPage.getFirstName();
	if (firstname==null)
		validinput=Util.isAlphaNumeric(scenarioValue);
	
}

@Then("The First Name will be displayed")
public void the_first_name_will_be_displayed() {
	
		
    System.out.println("Firstname=" +scenarioValue);
    assertEquals(true, validinput);
}

@When("user fills the Last Name in Alphabets only")
public void user_fills_the_last_name_in_alphabets_only() {
	 
	validinput=Util.isAlphaNumeric(scenarioValue);
    
}

@Then("The Last Name will be displayed")
public void the_last_name_will_be_displayed() {
	 
	System.out.println("scenarioValue=" +scenarioValue);
     assertEquals(true, validinput);
	    
    
}

@When("user fills the Address Field using Alpha Numerics and or Symbols")
public void user_fills_the_address_field_using_alpha_numerics_and_or_symbols() {
	validinput=Util.isAlphaNumeric(scenarioValue);
    
}

@Then("The Address will be displayed")
public void the_address_will_be_displayed() {

    assertEquals(false, validinput);	    
    
}

@When("User fills the Street name Field using Alpha Numerics and or Symbols")
public void user_fills_the_street_name_field_using_alpha_numerics_and_or_symbols() {

	validinput=Util.isAlphaNumeric(scenarioValue);
}

@Then("The Street Name will be displayed")
public void the_street_name_will_be_displayed() {
	System.out.println("StreetName=" +scenarioValue);
    //assertEquals(false, validinput);
    
}

@When("user fills the House Number field using Alpha Numerics and or Symbols")
public void user_fills_the_house_number_field_using_alpha_numerics_and_or_symbols() {
    
}

@Then("The House Number will be displayed")
public void the_house_number_will_be_displayed() {
   
}

@When("User fills the {int} digit Zip code using Numbers only")
public void user_fills_the_digit_zip_code_using_numbers_only(Integer int1) {
	
	validinput=Util.isAlphaNumeric(scenarioValue);
   
}

@Then("The Zip code will be displayed")
public void the_zip_code_will_be_displayed() {
	System.out.println("Zip=" +scenarioValue);
   // assertEquals(false, validinput);
    
    
}

@When("User fills the City Name in Alphabets only")
public void user_fills_the_city_name_in_alphabets_only() {
	
	validinput=Util.isAlphaNumeric(scenarioValue);
    
}

@Then("The City Name will be displayed")
public void the_city_name_will_be_displayed() {
	System.out.println("CityName=" +scenarioValue);
   // assertEquals(true, validinput);
    
}

@When("user selects the respective State Name from the DropBox")
public void user_selects_the_respective_state_name_from_the_drop_box() {
    
}

@Then("The State Name will be displayed")
public void the_state_name_will_be_displayed() {
	System.out.println("You have selected=" +scenarioValue);
    // assertEquals(false, validinput);
   
}

@When("user fills the valid {int} digit Mobile number in Numerics")
public void user_fills_the_valid_digit_mobile_number_in_numerics(Integer int1) {
	//String MobileNumber=lmsuser.getPhoneNumber();
	validinput=Util.isAlphaNumeric(scenarioValue);
    
}

@Then("The Mobile Number will be displayed")
public void the_mobile_number_will_be_displayed() {
	System.out.println("MobileNumber=" +scenarioValue);
    assertEquals(true, validinput);
    
}

@When("user Selects the Date of Birth from the Calender")
public void user_selects_the_date_of_birth_from_the_calender() {
    
}

@Then("Birth Date will be Displayed")
public void birth_date_will_be_displayed() {
    
}

@When("user fills the valid unique UserName")
public void user_fills_the_valid_unique_user_name() {
	//String username=lmsuser.getUserName();
	validinput=Util.isAlphaNumeric(scenarioValue);
    
}

@Then("UserName will be displayed")
public void user_name_will_be_displayed() {
	System.out.println("username=" + scenarioValue);
    assertEquals(true, validinput);
    
}

@When("user fills the valid Password with {int} Upper case {int} Numeric and {int} special charecter and {int} charecters")
public void user_fills_the_valid_password_with_upper_case_numeric_and_special_charecter_and_charecters(Integer int1, Integer int2, Integer int3, Integer int4) {
	
	validinput=Util.isAlphaNumeric(scenarioValue);
}

@Then("user Password will  be displayed")
public void user_password_will_be_displayed() {
	System.out.println("password=" +scenarioValue);
    assertEquals(false, validinput);
    
}

@When("user enters submit button with all fields empty")
public void user_enters_submit_button_with_all_fields_empty() {
	
    
}

@Then("user should get a message Please fill all fields above")
public void user_should_get_a_message_please_fill_all_fields_above() {
    
}

@When("user clicks Sign Up button with invalid First Name")
public void user_clicks_sign_up_button_with_invalid_first_name() {
    
}

@Then("User should get a message Please fill valid First Name")
public void user_should_get_a_message_please_fill_valid_first_name() {
    
}

@When("user clicks Sign Up button with invalid Last Name")
public void user_clicks_sign_up_button_with_invalid_last_name() {
    
}

@Then("user should get a message Please fill valid Last Name")
public void user_should_get_a_message_please_fill_valid_last_name() {
    
}

@When("user clicks Sign Up button with invalid Address")
public void user_clicks_sign_up_button_with_invalid_address() {
    
}

@Then("user should get a message Please fill valid Address")
public void user_should_get_a_message_please_fill_valid_address() {
    
}

@When("user clicks Sign Up button with invalid Street Name")
public void user_clicks_sign_up_button_with_invalid_street_name() {
    
}

@Then("user should get a message Please fill valid Street Name")
public void user_should_get_a_message_please_fill_valid_street_name() {
    
}

@When("user clicks Sign Up button with invalid House Number")
public void user_clicks_sign_up_button_with_invalid_house_number() {
    
}

@Then("user should get a message Please fill valid House Number")
public void user_should_get_a_message_please_fill_valid_house_number() {
    
}

@When("user clicks Sign Up button with invalid Zip")
public void user_clicks_sign_up_button_with_invalid_zip() {
    
}

@Then("user should get a message Please fill valid Zip")
public void user_should_get_a_message_please_fill_valid_zip() {
   
}

@When("user clicks Sign Up button with invalid  City")
public void user_clicks_sign_up_button_with_invalid_city() {
   
}

@Then("user should get a message Please fill valid City")
public void user_should_get_a_message_please_fill_valid_city() {
    
}

@When("user clicks Sign Up button without selecting  State")
public void user_clicks_sign_up_button_without_selecting_state() {
    
}

@Then("user should get a message Please select State")
public void user_should_get_a_message_please_select_state() {
    
}

@When("user clicks Sign Up button without selecting BirthDate")
public void user_clicks_sign_up_button_without_selecting_birth_date() {
    
}

@Then("user should get a message Please select BirthDate")
public void user_should_get_a_message_please_select_birth_date() {
    
}

@When("user clicks Sign Up button with invalid UserName")
public void user_clicks_sign_up_button_with_invalid_user_name() {
    
}

@Then("user should get a message Please fill valid UserName")
public void user_should_get_a_message_please_fill_valid_user_name() {
    
}

@When("user clicks Sign Up button with invalid Password")
public void user_clicks_sign_up_button_with_invalid_password() {
   
}

@Then("user should get a message Please fill valid Password")
public void user_should_get_a_message_please_fill_valid_password() {
    
}

@When("uSer clicks Sign Up button with existing User name")
public void u_ser_clicks_sign_up_button_with_existing_user_name() {
    
}

@Then("user should see the message Username already exist")
public void user_should_see_the_message_username_already_exist() {
    
}

@When("user enters all Field value and click Sign Up button.")
public void user_enters_all_field_value_and_click_sign_up_button() {
    
}

@Then("user should get a message Registeration successful")
public void user_should_get_a_message_registeration_successful() {
   
}
 

}
