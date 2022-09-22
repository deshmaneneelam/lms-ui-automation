package com.sdet.lms.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sdet.lms.utilities.BaseClass;

public class Batch extends BaseClass {
	
WebDriver driver;
	

	public Batch (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//span[text()='Batch']")
	WebElement batchTab;
	
	@FindBy(xpath="//div//mat-card-title/div[1]/text()")
	WebElement batchHeading;
	
	
	@FindBy(xpath="//span[@class='p-button-icon pi pi-trash']")
	WebElement deleteBtn;
	
	@FindBy(xpath="//input[@class='p-inputtext p-component']")
	WebElement searchbox;
	
	@FindBy(xpath="//span[contains(text(),'A New Batch')]")
	WebElement addBatch;
	
	@FindBy(xpath="//div/span[2]/button[5]")
	WebElement batchRecords;
	
	@FindBy(xpath="//tr/td[2]")
	WebElement batchrecordName;
	
	@FindBy(xpath="//span[@class='p-button-icon pi pi-pencil']")
	WebElement editBtn;
	
	@FindBy(xpath="//span[contains(text(),'Batch Details')]")
	WebElement batchDetailsForm;
	
	@FindBy(id="batchName")
	WebElement batchName;
	
	@FindBy(id="batchDescription")
	WebElement batchDescription;
	
	@FindBy(xpath="//input[@placeholder='Select a Program name']")
	WebElement programName;
	
	@FindBy(xpath="//input[@id='ACTIVE']")
	WebElement activeradioBtn;
	
	@FindBy(id="batchNoOfClasses")
	WebElement batchnoOfClasses;
	
	@FindBy(xpath="//span[contains(text(),'Cancel')]")
	WebElement cancelBtn;
	
	@FindBy(xpath="//span[contains(text(),'Save')]")
	WebElement saveBtn;
	
	@FindBy(xpath="//div[@role='checkbox' and @class='p-checkbox-box']")
	WebElement checkBox;
	
	@FindBy(xpath="//div//table/tbody/tr[1]/td[7]//span[2]/button/span[1]")
	WebElement multipleDeleteBtn;
	
	@FindBy(xpath="//span[contains(text(),'Confirm')]")
	WebElement confirmDelete;
	
	@FindBy(xpath="//span[contains(text(),'Yes')]")
	WebElement deleteYes;
	
	
	
}
