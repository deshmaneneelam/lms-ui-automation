package com.sdet.lms.pageobjects;

import java.awt.List;
import java.awt.print.Printable;
import java.util.Arrays;
import java.util.Collections;

import org.apache.commons.exec.launcher.Java13CommandLauncher;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.sdet.lms.utilities.BaseClass;

public class Batch extends BaseClass {

	WebDriver driver;

	public Batch(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Batch']")
	WebElement batchTab;

//	@FindBy(xpath="//div//mat-card-title/div[1]/text()")

	@FindBy(xpath = "//mat-card-title//div[contains(text(),' Manage Batch')]")
	WebElement batchHeading;

	@FindBy(xpath = "//div/mat-card/mat-card-title/div[2]/div[1]/button")
	WebElement deleteBtn;

	@FindBy(xpath = "//input[@class='p-inputtext p-component']")
	WebElement searchbox;

	@FindBy(xpath = "//i[@class='pi pi-search']")
	WebElement searchBtn;

	@FindBy(xpath = "//span[contains(text(),'A New Batch')]")
	WebElement addBatch;

	@FindBy(xpath = "//div/span[2]/button[5]")
	WebElement batchRecords;

	@FindBy(xpath = "//span[contains(text(),'Showing 1 to 5 of 60 entries')]")
	WebElement fiveRecords;

	@FindBy(xpath = "//tr/td[2]")
	WebElement batchrecordName;

	@FindBy(xpath = "//span[@class='p-button-icon pi pi-pencil']")
	WebElement editBtn;

	@FindBy(xpath = "//span[contains(text(),'Batch Details')]")
	WebElement batchDetailsForm;

	@FindBy(id = "batchName")
	WebElement batchName;

	@FindBy(id = "batchDescription")
	WebElement batchDescription;

	@FindBy(xpath = "//input[@placeholder='Select a Program name']")
	WebElement programName;

	@FindBy(xpath = "//input[@id='ACTIVE']")
	WebElement activeradioBtn;

	@FindBy(id = "batchNoOfClasses")
	WebElement batchnoOfClasses;

	@FindBy(xpath = "//span[contains(text(),'Cancel')]")
	WebElement cancelBtn;

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	WebElement saveBtn;

	@FindBy(xpath = "//div[@role='checkbox' and @class='p-checkbox-box']")
	WebElement checkBox;

	@FindBy(xpath = "//p-tablecheckbox//div[2][@role='checkbox']")
	java.util.List<WebElement> CheckBoxes;

	@FindBy(xpath = "//div//table/tbody/tr[1]/td[7]//span[2]/button/span[1]")
	WebElement multipleDeleteBtn;

	@FindBy(xpath = "//span[contains(text(),'Confirm')]")
	WebElement confirmDelete;

	@FindBy(xpath = "//span[contains(text(),'Yes')]")
	WebElement deleteYes;

	@FindBy(xpath = "//span[text()='No']")
	WebElement deleteNoBtn;

	@FindBy(xpath = "//span[contains(text(),'Showing 0 to 0 of 0 entries')]")
	WebElement zeroEntryRecord;

	@FindBy(xpath = "//div/p-paginator/div/span[2]/button[1]")
	WebElement firstPageBatch;

	@FindBy(xpath = "//div/p-paginator/div/button[2]/span")
	WebElement previousLink;

	@FindBy(xpath = "//p-paginator/div/button[3]/span")
	WebElement nextPage;

	@FindBy(xpath = "//div/p-paginator/div/span[2]/button[2]")
	WebElement pageTwo;

	@FindBy(xpath = "//div/p-paginator/div/button[4]/span")
	WebElement endPagination;

	@FindBy(xpath = "//div/p-paginator/div/button[3]/span")
	WebElement lastnextPage;

	@FindBy(xpath = "//p-table/div/div[1]/table/thead/tr/th[2]")
	java.util.List<WebElement> batchNameOrder;

	@FindBy(xpath = "//p-table/div/div[1]/table/thead/tr/th[3]")
	java.util.List<WebElement> batchDescriptionOrder;

	@FindBy(xpath = "//p-table/div/div[1]/table/thead/tr/th[4]")
	java.util.List<WebElement> batchStatusOrder;

	@FindBy(xpath = "//p-table/div/div[1]/table/thead/tr/th[5]")
	java.util.List<WebElement> noOfClassesOrder;

	@FindBy(xpath = "//p-table/div/div[1]/table/thead/tr/th[6]")
	java.util.List<WebElement> programNameOrder;

	public void onBatchPage() {
		batchTab.click();
	}

	public void batchPageHeading() {
		System.out.println("User is on Batch Page with heading: " + batchHeading.getText());
	}

	public void multipleDeleteBtnStatus() {
		Boolean delete = deleteBtn.isEnabled();
		System.out.println(delete);
		/*
		 * if(delete) { System.out.println("Multiple batches delete button is enabled");
		 * }else { System.out.println("Multiple batches delete butoni is disabled"); }
		 */
	}

	public void showingFiveRecords() {
		System.out.println("Five records shown on page 1:" + fiveRecords.getText());
	}

	public void searchBatchName(String searchitem) {
		searchbox.clear();
		searchbox.sendKeys(searchitem);
		// searchBtn.click();
		searchbox.sendKeys(Keys.ENTER);
	}

	public void clickEditBtn() {
		editBtn.click();
	}

	public void batchDetailsForm() {
		String batchDetailsFormHeading = batchDetailsForm.getText();
		System.out.println(batchDetailsFormHeading);
	}

	public void enterBatchDetailsForm(String batchnameform, String descriptionform, String progrNameform,
			String classes) {
		batchName.sendKeys(batchnameform);
		batchDescription.sendKeys(descriptionform);
		programName.sendKeys(progrNameform);
		batchnoOfClasses.sendKeys(classes);
		activeradioBtn.click();
	}

	public void valuesBatchForm() {
		System.out.println("batchname in form is: " + batchName.getText());
		System.out.println("batchdescription in form is: " + batchDescription.getText());
		System.out.println("programName in form is: " + programName.getText());
		System.out.println("batchnoOfClasses in form is: " + batchnoOfClasses.getText());
	}

	public void cancelEditBtn() {
		cancelBtn.click();
	}

	public void saveEditBtn() {
		saveBtn.click();
	}

	public void saveEditAlert() {
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
	}

	public void checkboxSelection() {
		checkBox.click();
	}

	public void clickOnDelete() {
		multipleDeleteBtn.click();
	}

	public void multipleBoxesSelection() {
		System.out.println("Total no of checkboxes on batch page are: " + CheckBoxes.size());
		for (WebElement eachCheckbox : CheckBoxes) {
			eachCheckbox.click();
		}
	}

	public void confirmDeleteForm() {
		System.out.println("User is on confirm delete box : " + confirmDelete.getText());
	}

	public void yesDelete() {
		deleteYes.click();
	}

	public void yesDeleteAlert() {
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
	}

	public void noDelete() {
		deleteNoBtn.click();
	}

	public void checkboxesSelected() {
		CheckBoxes.isEmpty();
		if (CheckBoxes.isEmpty()) {
			System.out.println("CheckBoxes are not selected");
		} else {
			System.out.println("CheckBoxes are selected");
		}
	}

	public void verifyZeroRecords() {
		System.out.println(zeroEntryRecord.getText());
	}

	public void addNewBatch() {
		addBatch.click();
	}

	public void saveAddBatch() {
		saveBtn.click();
	}

	public void batchDetailsErrorMsg() {
		String batchDetailsFormHeading = batchDetailsForm.getText();
		String expectedErrorMsg = "Name is required";
		// Assert.assertEquals(batchDetailsFormHeading, expectedErrorMsg);
	}

	public void firstPageClick() {
		firstPageBatch.click();
	}

	public boolean previousPaginationLink() {
		return previousLink.isDisplayed();
	}

	public void paginationNext() {
		nextPage.click();
	}

	public void onPageTwo() {
		System.out.println("User is on page: " + pageTwo.getText());
	}

	public void onPageOne() {
		System.out.println("User is on page number: " + firstPageBatch.getText());
	}

	public void lastPagination() {
		endPagination.click();
	}

	public boolean lastNextPagination() {
		return lastnextPage.isDisplayed();
	}

	public void sortBatchName() {
		String[] beforeSort = new String[batchNameOrder.size()];
		for (int i = 0; i < batchNameOrder.size(); i++) {
			beforeSort[i] = batchNameOrder.get(i).getText().trim();
		}
		System.out.println("----Before sort function----");
		System.out.println(beforeSort);

		Arrays.sort(beforeSort);

		System.out.println("----After sort function----");
		System.out.println(beforeSort);

	}
}
