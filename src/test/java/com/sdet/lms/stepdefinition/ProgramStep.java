package com.sdet.lms.stepdefinition;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.sdet.lms.pageobjects.Login;
import com.sdet.lms.pageobjects.PageObjectManager;
import com.sdet.lms.pageobjects.Program;
import com.sdet.lms.utilities.BaseClass;
import com.sdet.lms.utilities.Context;
import com.sdet.lms.utilities.ContextUI;
import com.sdet.lms.utilities.SingletonDriver;
import com.sdet.lms.utilities.Util;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProgramStep {

	ContextUI context;
	Program programPage;
	
	public ProgramStep(ContextUI c) {
		this.context = c;
		programPage = context.getPageObjectManager().getProgramPage();
	}
	

	@When("User is on Program page")
	public void user_is_on_program_page() {
		System.out.println("Step #2");
	}

	@Then("User should see a heading Manage Program")
	public void user_should_see_a_heading_manage_program() {
		System.out.println("Step #3");
		//programPage = new Program(getDriver());
		String title = programPage.verifyHomePageTitle();
		Assert.assertEquals(Util.TITLE, title);
	}
	
	
		
	@Then("User should see the footer as in total there are z programs")
	public void user_should_see_the_footer_as_in_total_there_are_z_programs() {
		//programPage = new Program(driver);
		String totalCountString = programPage.getTotalPagesString();
		String expCountStr = Util.IN_TOTAL_STR1 + programPage.getTotalEntries() + Util.IN_TOTAL_STR2;
		Assert.assertEquals(totalCountString, expCountStr);
	}
	
	
	
	@Then("User should see the Delete button on the top left hand side as Disabled")
	public void user_should_see_the_delete_button_on_the_top_left_hand_side_as_disabled() {
		//programPage = new Program(driver);
		System.out.println(programPage.isDisabled());
	}
	
	
	
	@Then("Verify that number of records displayed")
	public void verify_that_number_of_records_displayed() {
	    System.out.println("Passed");
	}
	
	
	
	@Then("Text box used for search has text as search")
	public void text_box_used_for_search_has_text_as_search() {
	    //programPage = new Program(driver);
	    Assert.assertEquals(programPage.searchBoxText(),Util.SEARCH_TEXT);
	}
	
	
	
	@When("^User enters (.*) into search box$")
	public void user_enters_text_into_search_box(String searchPhrase) {
		System.out.println("searchPhrase"+searchPhrase);
	   // programPage = new Program(driver);
	    programPage.getSearchElement().sendKeys(searchPhrase);
	}
	
	

	@Then("Entries for text are shown")
	public void entries_for_text_are_shown() {
	    
	}
	
	@When("User clicks A New Program button")
	public void user_clicks_a_new_program_button() {
		//programPage = new Program(driver);
		programPage.addProgram();
	}


	@Then("User lands on Program Details form")
	public void user_lands_on_program_details_form() {
	    System.out.println("7000");
	}
	
	@After
	public void close() {
		System.out.println("In close");
		context.getDriver().quit();
	}
	
	
}
