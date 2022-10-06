package com.sdet.lms.stepdefinition;

import com.sdet.lms.pageobjects.Batch;
import com.sdet.lms.utilities.ContextUI;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BatchStep {

	ContextUI context;
	Batch batch;

	public BatchStep(ContextUI c) {
		this.context = c;
		batch = context.getPageObjectManager().getBatchPage();
	}

	@Given("User is on website")
	public void User_is_on_website() {

		System.out.println("User is on Browser");

	}

	@When("User is on Batch page")
	public void user_is_on_batch_page() {

		batch.onBatchPage();

	}

	@Then("User should see the Batch page heading")
	public void user_should_see_the_batch_page_heading() {

		batch.batchPageHeading();
	}

	@Then("verify that the Delete button next to the search box is Disabled")
	public void verify_that_the_delete_button_next_to_the_search_box_is_disabled() {

		batch.multipleDeleteBtnStatus();

	}

	@Then("verify that number of records displayed on the page are five")
	public void verify_that_number_of_records_displayed_on_the_page_are_five() {
		batch.scrolldown();
		batch.showingFiveRecords();

	}

	@When("user clicks on search box with text entered in it")
	public void user_clicks_on_search_box_with_text_entered_in_it() {

		batch.onBatchPage();
		System.out.println("User entered text in search box");

	}

	@Then("records of that  {string} are displayed")
	public void records_of_that_are_displayed(String searchitem) {
		batch.onBatchPage();
		batch.searchBatchName(searchitem);

	}

	@When("User clicks on Edit button")
	public void user_clicks_on_edit_button() {
		batch.onBatchPage();
		batch.clickEditBtn();
	}

	@Then("User lands on Batch Details form")
	public void user_lands_on_batch_details_form() {

		batch.batchDetailsForm();
	}

	@Given("User is on Batch details page")
	public void user_is_on_batch_details_page() {
		batch.onBatchPage();
		batch.clickEditBtn();
		batch.batchDetailsForm();
		System.out.println("User is on Btach details page");
	}

	@When("User enters {string}, {string}, {string}, {string}")
	public void user_enters(String batchnameform, String descriptionform, String progrNameform, String classes) {
		// batch = new Batch(context.getDriver());
		batch.enterBatchDetailsForm(batchnameform, descriptionform, progrNameform, classes);
	}

	@Then("User can see updated values of all fields")
	public void user_can_see_updated_values_of_all_fields() {

		batch.valuesBatchForm();
	}

	@When("user clicks on cancel button")
	public void user_clicks_on_cancel_button() {
		batch.onBatchPage();
		batch.clickEditBtn();
		batch.batchDetailsForm();
		// batch.cancelEditBtn();
		batch.batchFormCancel();

	}

	@Then("user can see batch details are notupdated")
	public void user_can_see_batch_details_are_notupdated() {

		System.out.println("Cancel edit, batch details not updated"); // how to put code for this???
	}

	@When("user clicks on save button")
	public void user_clicks_on_save_button() {
		batch.onBatchPage();
		batch.clickEditBtn();
		batch.batchDetailsForm();
		batch.saveEditBtn();

	}

	@Then("user can see successful alert")
	public void user_can_see_successful_alert() {
		batch.onBatchPage();
		batch.clickEditBtn();
		batch.batchDetailsForm();
		batch.saveEditBtn();
		batch.saveEditAlert();
	}

	@When("user searches with newly updated batch {string}")
	public void user_searches_with_newly_updated_batch(String editedBatchName) {
		batch.onBatchPage();
		batch.searchBatchName(editedBatchName);
	}

	@Then("User can see updated values of {string} fields")
	public void User_can_see_updated_values_of_fields(String editedBatchName) {
		batch.searchBatchName(editedBatchName);
	}

	@When("user selects multiple batches")
	public void user_selects_multiple_batches() {
		batch.onBatchPage();
		batch.multipleBoxesSelection();
	}

	@Then("multiple batches get selected")
	public void multiple_batches_get_selected() {

		System.out.println("Multiple checkboxes have been selected");
	}

	@When("user clicks on delete button")
	public void user_clicks_on_delete_button() {
		batch.onBatchPage();
		batch.multipleBoxesSelection();
		batch.clickOnDelete();
		batch.batchDetailsForm();
		batch.clickOnDelete();

	}

	@Then("user lands on deletion form")
	public void user_lands_on_deletion_form() {
		// batch.onBatchPage();
		// batch.clickOnDelete();
		batch.confirmDeleteForm();
	}

	@Given("User is on confirm deletion form")
	public void user_is_on_confirm_deletion_form() {
		batch.onBatchPage();
		batch.clickOnDelete();
		batch.confirmDeleteForm();
		System.out.println("User is on confirm deletion form");
	}

	@When("user clicks on Yes button")
	public void user_clicks_on_yes_button() {
		batch.onBatchPage();
		batch.clickOnDelete();
		batch.confirmDeleteForm();
		batch.yesDelete();
	}

	@Then("user can see successful deletion message")
	public void user_can_see_successful_deletion_message() {

		batch.yesDeleteAlert();
	}

	@When("user clicks on No button")
	public void user_clicks_on_no_button() {
		batch.onBatchPage();
		batch.clickOnDelete();
		batch.confirmDeleteForm();
		batch.noDelete();
	}

	@Then("user can see batches ares still selected")
	public void user_can_see_batches_ares_still_selected() {

		batch.checkboxesSelected();
	}

	@When("user searches for {string} batches")
	public void user_searches_for_batches(String deletedBatch) {

		batch.searchBatchName(deletedBatch);
	}

	@Then("user should see zero results")
	public void user_should_see_zero_results() {

		batch.verifyZeroRecords();
	}

	@When("user clicks on Add a new Batch button")
	public void user_clicks_on_Add_a_new_Batch_button() {
		batch.addNewBatch();
	}

	@When("user clicks on save button without entering any data")
	public void user_clicks_on_save_button_without_entering_any_data() {

		batch.saveAddBatch();
	}

	@Then("user gets error message")
	public void user_gets_error_message() {

		batch.batchDetailsErrorMsg();
	}

	@Then("batch details form disappears")
	public void batch_details_form_disappears() {

		System.out.println("Batch details form is closed"); // how to write code for this
	}

	@When("user is on first page of manage batch page")
	public void user_is_on_first_page_of_manage_batch_page() {

		batch.firstPageClick();
	}

	@Then("previous link is disabled")
	public void previous_link_is_disabled() {

		batch.previousPaginationLink();
	}

	@Given("user is on page one of manage batch page")
	public void user_is_on_page_one_of_manage_batch_page() {

		batch.firstPageClick();
	}

	@When("user clicks navigate next button")
	public void user_clicks_navigate_next_button() {

		batch.paginationNext();
	}

	@Then("user is navigated to page number two")
	public void user_is_navigated_to_page_number_two() {

		batch.onPageTwo();
	}

	@Given("user is on page two of manage batch page")
	public void user_is_on_page_two_of_manage_batch_page() {

		batch.onPageTwo();
		batch.firstPageClick();
	}

	@When("user clicks navigate previous button")
	public void user_clicks_navigate_previous_button() {

		batch.previousPaginationLink();
	}

	@Then("user is navigated to page number one")
	public void user_is_navigated_to_page_number_one() {

		batch.onPageOne();
	}

	@When("user is on last page of manage batch page")
	public void user_is_on_last_page_of_manage_batch_page() {

		batch.lastNextPagination();
	}

	@Then("next pagination link is disabled")
	public void next_pagination_link_is_disabled() {

		batch.previousPaginationLink();
	}

}
