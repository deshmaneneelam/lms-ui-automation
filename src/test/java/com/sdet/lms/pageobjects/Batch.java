package com.sdet.lms.pageobjects;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sdet.lms.utilities.Util;

public class Batch {

	WebDriver driver;
	JavascriptExecutor js;

	public Batch(WebDriver driver) {
		this.driver = driver;
		js = (JavascriptExecutor) driver;
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

	@FindBy(xpath = "//p-table/div/div[1]/table/tbody/tr/td[2]")
	WebElement updatedValueinSearch;

//	@FindBy(xpath = "//span[contains(text(),'A New Batch')]")
	@FindBy(css = "#new > span.p-button-label")
	WebElement addBatch;

	@FindBy(xpath = "//div/span[2]/button[5]")
	WebElement batchRecords;

	@FindBy(xpath = "//span[contains(text(),'Showing 1 to 5 of')]")
	WebElement fiveRecords;

	@FindBy(xpath = "//div[contains(text(),'In total there are')]")
	WebElement intotalrecords;

	@FindBy(xpath = "//tr/td[2]")
	WebElement batchrecordName;

	@FindBy(xpath = "//span[@class='p-button-icon pi pi-pencil']")
	WebElement editBtn;

	@FindBy(xpath = "//span[contains(text(),'Batch Details')]")
	WebElement batchDetailsForm;

	@FindBy(css = ".p-button-icon.p-button-icon-left.pi.pi-times")
	WebElement cancelBatchDetailsBtn;

	@FindBy(id = "batchName")
	WebElement batchName;

	@FindBy(xpath = "//input[@id='batchName']")
	WebElement batchNameConfirm;

	@FindBy(id = "batchDescription")
	WebElement batchDescription;

	@FindBy(xpath = "//input[@id='batchDescription']")
	WebElement batchDescrConf;

	@FindBy(xpath = "//input[@placeholder='Select a Program name']")
	WebElement programName;

	@FindBy(xpath = "//input[@id='ACTIVE']")
	WebElement activeradioBtn;

	@FindBy(id = "batchNoOfClasses")
	WebElement batchnoOfClasses;

	@FindBy(xpath = "//input[@id='batchNoOfClasses']")
	WebElement batchClassesconfirm;

	// @FindBy(xpath = "//span[contains(text(),'Cancel')]")
//	@FindBy(xpath = "//p-dialog/div/div/div[3]/button[1]/span[2]")
	@FindBy(css = "button.p-button-rounded.p-button-danger.p-button.p-component.ng-star-inserted > span.p-button-label")
	WebElement cancelBtn;

//	@FindBy(xpath = "//button[@label='Save']")
	@FindBy(css = "button.p-button-rounded.p-button-success.p-button.p-component.ng-star-inserted")
	WebElement saveBtn;

	@FindBy(xpath = "//div[@role='checkbox' and @class='p-checkbox-box']")
	WebElement checkBox;

	@FindBy(xpath = "//p-tablecheckbox//div[2][@role='checkbox']")
	java.util.List<WebElement> CheckBoxes;

	@FindBy(xpath = "//div//table/tbody/tr[1]/td[7]//span[2]/button/span[1]")
	WebElement multipleDeleteBtn;

	@FindBy(xpath = "//span[contains(text(),'Confirm')]")
	WebElement confirmDelete;

//	@FindBy(xpath = "//span[contains(text(),'Yes')]")
	@FindBy(css = ".p-component.ng-star-inserted > span.p-button-label")
	WebElement deleteYes;

//	@FindBy(xpath = "//span[text()='No']")
	@FindBy(css = ".p-confirm-dialog-reject.p-ripple.p-button.p-component.ng-star-inserted > span.p-button-label")
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

	public String showingFiveRecords() {
		System.out.println("Five records shown on page 1:" + fiveRecords.getText());
		return fiveRecords.getText();
	}

	public void searchBatchName(String searchitem) {
		searchbox.clear();
		searchbox.sendKeys(searchitem);
		searchBtn.click();
		// searchbox.sendKeys(Keys.ENTER);
	}

	public void capturenameSearch() {
		System.out.println(updatedValueinSearch.getText());

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
		batchName.clear();
		batchName.sendKeys(batchnameform);
		batchDescription.clear();
		batchDescription.sendKeys(descriptionform);
		programName.clear();
		programName.sendKeys(progrNameform);
		batchnoOfClasses.clear();
		batchnoOfClasses.sendKeys(classes);
		// activeradioBtn.click();
		saveBtn.click();

	}

	public void valuesBatchForm() {
		System.out.println("batchname in form is: " + batchNameConfirm.getText());
		System.out.println("batchdescription in form is: " + batchDescrConf.getText());
		System.out.println("programName in form is: " + programName.getText());
		System.out.println("batchnoOfClasses in form is: " + batchClassesconfirm.getText());
	}

	public void batchFormCancel() {
		cancelBatchDetailsBtn.click();
	}

	public void cancelEditBtn() {
		cancelBtn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Util.IMPLICIT_WAIT));
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

	public void scrolldown() {
		js.executeScript("arguments[0].scrollIntoView();", intotalrecords);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}

}
