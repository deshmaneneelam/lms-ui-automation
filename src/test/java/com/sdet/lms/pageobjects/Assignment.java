package com.sdet.lms.pageobjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Assignment {

	WebDriver driver;
	JavascriptExecutor js;

	public Assignment(WebDriver driver) {
		this.driver = driver;
		js = (JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'Assignment')]")
	WebElement assignmentTab;

	@FindBy(css = ".mat-card > mat-card-title > div:nth-child(1)")
	WebElement assigmtHeading;

	@FindBy(css = "div.p-datatable-footer.ng-star-inserted > div")
	WebElement belowAssgnmtTableCount;

	@FindBy(xpath = "//span[contains(text(),'Showing 1 to 3 of 3 entries')]")
	WebElement showthreerecords;

	@FindBy(css = ".mat-card-content > p-table > div > div.p-datatable-footer.ng-star-inserted > div")
	WebElement footerAssgnmt;

	@FindBy(css = "div.p-datatable-footer.ng-star-inserted > div")
	WebElement totalRecords;

	@FindBy(xpath = "//input[@class='p-inputtext p-component']")
	WebElement searchtextDisplay;

	@FindBy(xpath = "//input[@type='text' and @class='p-inputtext p-component']")
	WebElement searchBox;

	@FindBy(xpath = "//p-paginator/div/button[3]/span")
	WebElement checkbox;

	@FindBy(xpath = "//tbody//div[@role='checkbox']")
	WebElement rowCheckBoxes;

	@FindBy(css = "tr:nth-child(1) > td:nth-child(6) > div > span:nth-child(1) > button > span.p-button-icon.pi.pi-pencil")
	WebElement editBtn;

	@FindBy(xpath = "//span[@id='pr_id_47-label']")
	WebElement assignmentDetailForm;

	@FindBy(xpath = "//input[@id='assignment']")
	WebElement assignmentName;

	@FindBy(xpath = "//input[@id='assignmentDescription']")
	WebElement assignDescription;

	@FindBy(xpath = "//input[@id='assignmentGraderId']")
	WebElement assgnGrade;

	@FindBy(xpath = "//*[@id='icon']")
	WebElement assgnmtdate;

	@FindBy(xpath = "button.p-button-rounded.p-button-danger.p-button.p-component.ng-star-inserted > span.p-button-label")
	WebElement assgnmtDetailsCancel;

	@FindBy(xpath = "//tbody/tr[1]/td[6]/div/span[2]/button/span[1]")
	WebElement deleteRowBtn;

	@FindBy(xpath = "//p-confirmdialog/div/div/div[1]/div/button/span")
	WebElement confirmDeleteBox;

	@FindBy(xpath = "//p-confirmdialog//div[3]/button[1]")
	WebElement deleteNoBtnAssgnmt;

	@FindBy(xpath = "//span[text()='Yes']")
	WebElement deleteYesBtnAssgnmt;

	@FindBy(xpath = "//p-toast//div[@role='alert']//div/div[1]")
	WebElement successdeleteMsgAssgnmt;

	@FindBy(xpath = "//div[@class='p-dialog-header ng-tns-c133-4 ng-star-inserted']/span")
	WebElement deleteAlertAssignment;

	public void clickAssignmentTab() {
		assignmentTab.click();
	}

	public String getAssignmentHeading() {
		System.out.println("The assignment page headig is: " + assigmtHeading.getText());
		return assigmtHeading.getText();
	}

	public String recordsBelowTable() {
		return showthreerecords.getText();
	}

	public String recordsBelowAssgnmtTable() {
		System.out.println("The assignment page headig is: " + belowAssgnmtTableCount.getText());
		return belowAssgnmtTableCount.getText();
	}

	public String getTotalRecords() {
		String records = totalRecords.getText();
		return records.substring(19, 21);
	}

	public String verifyAssignmentTitle() {
		return driver.getTitle();
	}

	public String searchBoxDisplayAssignment() {
		return searchtextDisplay.getAttribute("placeholder");
	}

	public WebElement getSearchElementAssgnmt() {
		return searchtextDisplay;
	}

	public void scrollCheckBox() {
		js.executeScript("arguments[0].scrollIntoView();", checkbox);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}

	public void clicksearch() {
		searchBox.click();
	}

	public void enterSearchAssgnment(String searchterm) {
		searchBox.clear();
		searchBox.sendKeys(searchterm);

	}

	public void clickEditBtn() {
		editBtn.click();
	}

	public String assgnmtdetailsform() {
		System.out.println("assignmentDetailForm.getText()");
		return assignmentDetailForm.getText();
	}

	public void enterAssignmentDetailsForm(String assignformName, String descrform, String grade, String date) {
		assignmentName.clear();
		assignmentName.sendKeys(assignformName);
		assignDescription.clear();
		assignDescription.sendKeys(descrform);
		assgnGrade.clear();
		assgnGrade.sendKeys(grade);
		assgnmtdate.clear();
		assgnmtdate.sendKeys(date);
		System.out.println("Assignment name: " + assignformName);
		System.out.println("Description : " + descrform);
		System.out.println("Grade: " + grade);
		System.out.println("Date: " + date);
		assgnmtDetailsCancel.click();

	}

	public Boolean checkEnabled() {
		Boolean chkboxstatus = checkbox.isEnabled();
		return chkboxstatus;
	}

	public void checkBoxClick() {
		rowCheckBoxes.click();
	}

	public void deleteBtn() {
		deleteRowBtn.click();
	}

	public boolean confirmDeleteBoxVisible() {
		Boolean deleteboxstatus = confirmDeleteBox.isEnabled();
		return confirmDeleteBoxVisible();
	}

	public String confirmDeleteAssgnmt() {
		return deleteAlertAssignment.getText();
	}

	public void deleteYesAssignment() {
		deleteYesBtnAssgnmt.click();
	}

	public void deleteNoAssignment() {
		deleteNoBtnAssgnmt.click();
	}

	public WebElement delAlertAssnmtExist() {
		return deleteAlertAssignment;
	}

	public void scrolldownAssgn() {
		js.executeScript("arguments[0].scrollIntoView();", showthreerecords);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}

}
