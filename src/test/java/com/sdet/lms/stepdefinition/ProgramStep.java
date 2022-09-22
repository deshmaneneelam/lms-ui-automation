package com.sdet.lms.stepdefinition;

import org.openqa.selenium.By;
import org.testng.Assert;
import com.sdet.lms.pageobjects.Program;
import com.sdet.lms.utilities.BaseClass;
import com.sdet.lms.utilities.Util;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProgramStep extends BaseClass {

	Program programPage;
	
	@Given("User is logged on to LMS website")
	public void user_is_logged_on_to_lms_website() {
	    setup();
	    driver.findElement(By.id("username")).sendKeys("lms");
	    driver.findElement(By.id("password")).sendKeys("lms");
	    driver.findElement(By.id("login")).click();
	}

	@When("User is on Program page")
	public void user_is_on_program_page() {
		
	}

	@Then("User should see a heading Manage Program")
	public void user_should_see_a_heading_manage_program() {
		programPage = new Program(driver);
		String title = programPage.verifyHomePageTitle();
		Assert.assertEquals(Util.TITLE, title);
	}
		
	@Then("User should see the footer as in total there are z programs")
	public void user_should_see_the_footer_as_in_total_there_are_z_programs() {
		programPage = new Program(driver);
		String totalCountString = programPage.getTotalPagesString();
		System.out.println(totalCountString);
	}
	
	@Then("User should see the Delete button on the top left hand side as Disabled")
	public void user_should_see_the_delete_button_on_the_top_left_hand_side_as_disabled() {
		programPage = new Program(driver);
		System.out.println(programPage.isDisabled());
	}
	
	@After
	public void close() {
		driver.quit();
	}
	
	
}
