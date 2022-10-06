package com.sdet.lms.pageobjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.sdet.lms.utilities.Util;

public class Program {
		
	WebDriver driver;
	
	/**
	 * Initialize web elements
	 * @param d driver
	 */
	public Program(WebDriver d){
		 this.driver = d;
		PageFactory.initElements(d, this);
	}
	
	
	@CacheLookup
	@FindBy(linkText="Program")
	private WebElement title;
	
	@FindBy(xpath="//div[@class='p-datatable-footer ng-star-inserted']/div")
	private WebElement totalCount;
	
	@FindBy(xpath="//button[@class='p-button-danger p-button p-component p-button-icon-only']")
	private WebElement multipleDeleteBtn;
	
	@FindBy(xpath="//input[@class='p-inputtext p-component']")
	private WebElement searchText;
	
	@FindBy(xpath="//button[@id='new']")
	private WebElement addProgramBtn;
	
	@FindBy(xpath="//div[@class='p-datatable-footer ng-star-inserted']/div")
	private WebElement totalEntries;
	
	@FindBy(xpath="//i[@class='pi pi-search']")
	private WebElement searchElement;
	
	@FindBy(xpath="//tbody/tr[@class='ng-star-inserted']")
	private List<WebElement> tbody;
	
	@FindBy(xpath="//td[2]")
	private WebElement nameCol;
	
	@FindBy(xpath="//div[@class='p-checkbox-box']")
	private WebElement multilCheck;
	
	
	//tbody/tr[4]/td[5]/div[1]/span[2]/button[1]/span[1]
	//tbody//div[@aria-checked='true']
	//@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-home[1]/app-program[1]/div[1]/mat-card[1]/mat-card-content[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr/td[1]")
	//private List<WebElement> checkedBoxes;
	
	@FindBy(xpath="//tbody//div[@aria-checked='true']")
	private WebElement rowCheckBoxIfChecked;
	
	@FindBy(xpath="//tbody//div[@role='checkbox']")
	private WebElement rowCheckBoxes;
	
	@FindBy(xpath="//tbody/tr/td/div[@class='action']/span[1]/button/span")
	private WebElement editProgramBtn;
	
	@FindBy(xpath="//button[@class='p-button-danger p-button p-component p-button-icon-only']//span[@class='p-button-icon pi pi-trash']")
	private WebElement commonDeleteBtn;
	
	@FindBy(xpath="//div[@class='p-dialog-header ng-tns-c133-4 ng-star-inserted']/span")
	private WebElement deleteAlert;
	
	By dialogBox = By.xpath("//p-dialog[@header='Program Details']");
	
	@FindBy(xpath="//p-confirmdialog//div[3]/button[1]")
	private WebElement deleteNoBtn;
	
	@FindBy(xpath="//p-confirmdialog//div[3]/button[2]")
	private WebElement deleteYesBtn;
	
	By successMsg = By.xpath("//p-toast//div[@role='alert']//div/div[1]");

	By checkedBoxes = By.xpath("//tbody//div[@aria-checked='true']");
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/div[1]/span[2]/button[1]")
	private WebElement singleDeleteBtn;
	
	@FindBy(xpath="//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']/span[1]")
	private WebElement showingCnt;
			
	/**
	 * Verify title
	 * @return string
	 */
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	/**
	 * Verify page title is displayed
	 * @return boolean
	 */
	public boolean isPageTitleDisplayed() {
		return title.isDisplayed();
	}
	
	/**
	 * get total page count string
	 * @return string
	 */
	public String getTotalPagesString() {
		System.out.println("aaaa"+totalCount.getText());
		return totalCount.getText();
	}
	
	public String getTotalEntries() {
		String entries = totalEntries.getText();
		return entries.substring(19,21);
	}
	
	/**
	 * Check if delete button is disabled 
	 * @return boolean
	 */
	public boolean isDisabled() {
		return multipleDeleteBtn.isEnabled();
	}
	
	public String searchBoxText() {
		return  searchText.getAttribute("placeholder");	
	}
	
	public WebElement getSearchElement() {
		return searchText;
	}
	public void addProgram() {
		addProgramBtn.click();
	}
	
	public List<WebElement> getTbody() {
		return tbody;
	}
	
	public WebElement getMultipleCheckBox() {
		return multilCheck;
	}
	
	public By areBoxesChecked() {
		return checkedBoxes;
		
		/*try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> element = new WebDriverWait(driver, Duration.ofSeconds(50))
		        .until(ExpectedConditions.presenceOfAllElementsLocatedBy(checkedBoxes));
		
		System.out.println("check::"+element.size());
		for(int i=0;i<element.size();i++) {
			String c = element.get(i).getAttribute("class");
			System.out.println("row " + i +": "+ c);
			if(c.contains(Util.CHECK_HIGHLIGHT)) {
				System.out.println("class"+c);
			}else {
				Assert.assertEquals(c, Util.CHECK_HIGHLIGHT);
			}
		}*/
	}
	
	public void isChecked() {
		String c = driver.findElement(By.xpath("//tbody//div[@aria-checked='true']")).getAttribute("class");
		if(c.contains(Util.CHECK_HIGHLIGHT)) {
			System.out.println("class"+c);
		}else {
			Assert.assertEquals(c, Util.CHECK_HIGHLIGHT);
		}
		//WebElement className = rowCheckBoxIfChecked.getAttribute();
	}
	
	public void selectProgram() {		
		rowCheckBoxes.click();
	}
	
	public WebElement clickEdit() {
		System.out.println("*****click edit****");
		return editProgramBtn;
	}
	
	public String getPopupScreen() {
		WebElement x = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.presenceOfElementLocated(dialogBox));
		System.out.println("After popup click ");
		return x.getText();
	}
	
	public WebElement getNameCol() {
		return nameCol;
	}
	
	public void clickMultipleDelete() {
		multipleDeleteBtn.click();
	}
	
	public String confirmDeleteAlert() {
		return deleteAlert.getText();
	}
	
	public void clickNoBtn() {
		deleteNoBtn.click();
	}
	
	public void clickYesBtn() {
		deleteYesBtn.click();
	}
	
	public WebElement isExist() {
		return deleteAlert;
	}
	
	public String checkSuccessMsg() {
		WebElement x = new WebDriverWait(driver, Duration.ofSeconds(50))
		        .until(ExpectedConditions.elementToBeClickable(successMsg));
		return x.getText();
	}
	
	public void clickSingleDelBtn() {
		singleDeleteBtn.click();
	}
	
	public void getShowingCntText() {
		showingCnt.getText();
	}
}
