package com.sdet.lms.stepdefinition;

import org.testng.Assert;

import com.sdet.lms.pageobjects.Assignment;
import com.sdet.lms.utilities.ContextUI;
import com.sdet.lms.utilities.Util;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignmentStep {

	ContextUI context;
	Assignment assignment;

	public AssignmentStep(ContextUI c) {
		this.context = c;
		assignment = context.getPageObjectManager().getAssignmentPage();
	}

	@Given("user is logged on part of Assignment module")
	public void user_is_logged_on_part_of_assignment_module() {
		System.out.println("User is on Browser");
	}

	@When("user is on Assignment page")
	public void user_is_on_assignment_page() {
		assignment.clickAssignmentTab();
		String title = assignment.verifyAssignmentTitle();
		Assert.assertEquals(Util.TITLE, title);
	}

	@Then("user should see the page heading of Assignment page")
	public void user_should_see_the_page_heading_of_assignment_page() {

		String actualHeading = "Manage Assignment";
		String expectedHeading = assignment.getAssignmentHeading();
		Assert.assertEquals(actualHeading, expectedHeading);
	}

	@Then("user should verify the records dispalyed below Assignment table")
	public void user_should_verify_the_records_dispalyed_below_assignment_table() {
		assignment.scrolldownAssgn();
		assignment.recordsBelowTable();
		System.out.println("User is able to see Showing 1 to 3 of 3  :" + assignment.recordsBelowTable());
	}

	@Then("user should verify footer message of records displayed on Assignment page")
	public void user_should_verify_footer_message_of_records_displayed_on_assignment_page() {
		String totalRecordsBelowTable = assignment.recordsBelowAssgnmtTable();
		String expRecords = Util.IN_TOTAL_STR1 + assignment.getTotalRecords() + Util.IN_TOTAL_STR3;
		Assert.assertEquals(totalRecordsBelowTable, expRecords);
	}

	@Then("user should validate search textbox has text as search on Assignment page")
	public void user_should_validate_search_textbox_has_text_as_search_on_assignment_page() {
		Assert.assertEquals(assignment.searchBoxDisplayAssignment(), Util.SEARCH_TEXT);
	}

	@When("user clicks on Assignment search box with text entered in it")
	public void user_clicks_on_assignment_search_box_with_text_entered_in_it() {
		assignment.clickAssignmentTab();
		assignment.clicksearch();
	}

	@Then("records of that  {string} are displayed for Assignment page")
	public void records_of_that_are_displayed_for_assignment_page(String searchAssignment) {
		System.out.println("searchname: " + searchAssignment);
		assignment.getSearchElementAssgnmt().sendKeys(searchAssignment);
	}

	@When("user selects assignment using checkbox")
	public void user_selects_assignment_using_checkbox() {
		assignment.clickAssignmentTab();
		// assignment.scrollCheckBox();
		assignment.checkEnabled();
	}

	@Then("assignment gets selected")
	public void assignment_gets_selected() {
		System.out.println("Checkbox is selected");
	}

	@When("user clicks on edit button on assignment page")
	public void user_clicks_on_edit_button_on_assignment_page() {
		assignment.clickAssignmentTab();
		assignment.clickEditBtn();
	}

	@Then("user lands on assignment details form")
	public void user_lands_on_assignment_details_form() {
		// assignment.assgnmtdetailsform();
		System.out.println("User is on assignment details form");
	}

	@Given("User is on Assignment details page")
	public void user_is_on_assignment_details_page() {
		assignment.clickAssignmentTab();
		System.out.println("User is on assignment details form");
	}

	@When("User enters {string}, {string}, {string}, {string} on assignemnt details form")
	public void user_enters_on_assignemnt_details_form(String assignformName, String descrform, String grade,
			String date) {
		assignment.enterAssignmentDetailsForm(assignformName, descrform, grade, date);
	}

	@Then("User can see updated values of all fields on edit assignement details form")
	public void user_can_see_updated_values_of_all_fields_on_edit_assignement_details_form() {
		System.out.println("User able to see all values on assignment details form");
	}

	@When("user clicks on delete button on Assignment page")
	public void user_clicks_on_delete_button_on_Assignment_page() {
		assignment.deleteBtn();
	}

	@Then("assignment user lands on confirm delete box")
	public void assignment_user_lands_on_confirm_delete_box() {
		assignment.confirmDeleteBoxVisible();
	}

	@Given("assignment user is on confirm delete box")
	public void assignment_user_is_on_confirm_delete_box() {
		System.out.println("User is on confirm delete box");
	}

	@When("assignment user clicks on yes delete button")
	public void assignment_user_clicks_on_yes_delete_button() {
		assignment.deleteYesAssignment();
	}

	@Then("assignment user can see succesful assignment deleted message")
	public void assignment_user_can_see_succesful_assignment_deleted_message() {
		assignment.delAlertAssnmtExist();
	}

}
