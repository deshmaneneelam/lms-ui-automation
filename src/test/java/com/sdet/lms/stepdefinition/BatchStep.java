package com.sdet.lms.stepdefinition;

import org.apache.commons.compress.harmony.pack200.NewAttribute;

import com.sdet.lms.pageobjects.Batch;
import com.sdet.lms.utilities.BaseClass;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BatchStep extends BaseClass {

	Batch batch = new Batch(driver);
	
	
	 @Before
		public void setUp() {
	    	setup();

	    }
	
	 
	 @Given("User is logged on to LMS website")
	 public void user_is_looged_on_to_lms_website() {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }

	 @When("User is on Batch page")
	 public void user_is_on_batch_page() {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }

	 @Then("User should see the Batch page heading")
	 public void user_should_see_the_batch_page_heading() {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }

	 @Given("User is logged on to LMS website")
	 public void user_is_logged_on_to_lms_website() {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }

	 @Then("verify that the Delete button next to the search box is Disabled")
	 public void verify_that_the_delete_button_next_to_the_search_box_is_disabled() {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }

	 @Then("verify that number of records displayed on the page are {int}")
	 public void verify_that_number_of_records_displayed_on_the_page_are(Integer int1) {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }

	 @Given("User is on Batch page")
	 public void user_is_on_the_Batch_page() {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }

	 @When("user clicks on search box with <Batch Name> entered in it")
	 public void user_clicks_on_search_box_with_batch_name_entered_in_it() {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }

	 @Then("records of that  <Batch Name> are displayed")
	 public void records_of_that_batch_name_are_displayed() {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }

	 @When("User clicks on Edit button")
	 public void user_clicks_on_edit_button() {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }

	 @Then("User lands on Batch Details form")
	 public void user_lands_on_batch_details_form() {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }

	 @Given("User is on Batch details page")
	 public void user_is_on_batch_details_page() {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }

	 @When("User edits <Name>, <Description>, <ProgramName>, <Status>, <NoOfClasses>")
	 public void user_edits_name_description_program_name_status_no_of_classes() {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }

	 @Then("User can see updated values of <Name>, <Description>, <ProgramName>, <Status>, <NoOfClasses>")
	 public void user_can_see_updated_values_of_name_description_program_name_status_no_of_classes() {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }
	 
	 
}
