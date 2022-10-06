package com.sdet.lms.stepdefinition;

import org.testng.Assert;

import com.sdet.lms.pageobjects.Login;
import com.sdet.lms.pageobjects.PageObjectManager;
import com.sdet.lms.utilities.ContextUI;
import com.sdet.lms.utilities.Util;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
	
		
public class LoginStep  {
	
	ContextUI context;
	Login loginPage;
	boolean validinput;
	PageObjectManager pageObjectManager;
	
	
	public LoginStep(ContextUI c) {
		this.context = c;
		loginPage = context.getPageObjectManager().getLoginPage();
		
	}
		
	@After
    public void close() {
		context.getDriver().quit();
    }
	    
	@Given("User is on the browser")
	public void user_is_on_the_browser() {
		System.out.println("Step #1");
	  
	}

	@When("User opens the LMS Website")
	public void user_opens_the_lms_website() {
		System.out.println("Step #2 ");
	}
	
	@Then("User should see the Login page.")
	public void user_should_see_the_login_page() {
		String loginPageTitle = loginPage.confirmLoginPage();
		System.out.println("loginPageTitle::"+loginPageTitle);
		Assert.assertEquals(loginPageTitle, Util.LOGIN_HEADING);
	}
	   
	@Given("User is on the Login Page")
	public void user_is_on_the_login_page() {
		System.out.println("Scenario 2 given");
		String pass=loginPage.getPassWord();
		System.out.println("Password="+pass) ;
		validinput=isAlphaNumeric(pass);
		loginPage.enterUsername("LMS");
		loginPage.enterPassword("LMS");
	}

	@When("User clicks the Login button after entering invalid password")
	public void user_clicks_the_login_button_after_entering_invalid_password() {
		//loginPage.loginClick();
	
	
		String pass=loginPage.getPassWord();
		System.out.println("Password="+pass) ;
		validinput=isAlphaNumeric(pass);
	  
	}

	@Then("User should receive the message {string}")
	public void user_should_receive_the_message(String string) {
		System.out.println("An error message is displayed");
	
		// loginPage.enterPassword("Invalid Password"+ loginPage.getPassWord());
		  Assert.assertEquals(true,validinput);
	}

	@When("User clicks the Login button after entering invalid username")
	public void user_clicks_the_login_button_after_entering_invalid_username() {
	    System.out.println();
	}
    @Then("User should receive the message Invalid username and password Please try again")
	public void user_should_receive_the_message_invalid_username_and_password_please_try_again() {
	    System.out.println("Scenario 2 then");
	}

    @When("User clicks the Login button after entering valid username and password")
    public void user_clicks_the_login_button_after_entering_valid_username_and_password() { 		}

		
    @Then("User should see the LMS Home page.")
	public void user_should_see_the_lms_home_page() {
	    loginPage.loginClick();
	    System.out.println("page title::" + loginPage.getPageTitle());
	    Assert.assertEquals(loginPage.getPageTitle(), Util.TITLE);
	}
    public static boolean isAlphaNumeric(String s) {
        return s != null && s.matches("^[a-zA-Z0-9]*$");
    }

}