package com.sdet.lms.pageobjects;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sdet.lms.utilities.BaseClass;
import com.sdet.lms.utilities.Util;

public class User  {
	
	WebDriver driver;
	JavascriptExecutor js ;
	

	public User (WebDriver driver)
	{  
		this.driver=driver;
		js = (JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@class='ng-tns-c133-8 p-confirm-dialog-accept p-ripple p-button p-component ng-star-inserted']")
		WebElement yesBtn;
	
	@FindBy(xpath="//span[text()='User']")
	WebElement userTab;
	
	@FindBy(xpath = "//div[@class='box'][1]")
	WebElement head;
	
	@FindBy(xpath = "//div[contains(text(),'Manage User')]")
	WebElement manageUser;
	
	@FindBy(xpath = "//button[@id='new']")
	WebElement addNewUser;

	@FindBy(xpath ="//span[contains(text(),'Showing')]")
	WebElement pagination;
	
	@FindBy(xpath = "//div[contains(text(),'In total there are')]")
	WebElement count;
	
    @FindBy(xpath = "//span[@class=\"p-paginator-icon pi pi-angle-right\"]")
    WebElement nextPage;
    
    @FindBy(xpath = "//span[contains(text(),'Showing 1 to 4 of 4 entries')]")
    WebElement showint1to4;
    
    @FindBy(xpath = "//span[@id='pr_id_5-label']")
    WebElement userDeatil;
    
   @FindBy(xpath ="//div/mat-card/mat-card-title/div[2]/div[1]/button")
    WebElement deleteBtn;
   
   @FindBy(xpath = "//span[contains(text(),'Confirm')]")
   WebElement confirmDilogBox;
   
   @FindBy(xpath = "//button[@class='ng-tns-c133-8 p-confirm-dialog-reject p-ripple p-button p-component ng-star-inserted']")
   WebElement confirmNOBtn;
   
   @FindBy(xpath = "//div[@class='p-checkbox-box p-component'][1]")
   WebElement checkBoxSelectYes;
   
   @FindBy(xpath = "//span[@class='p-toast-message-text ng-tns-c90-10 ng-star-inserted']")
   WebElement di;
   
   @FindBy(xpath = "//button[@class='ng-tns-c133-8 p-dialog-header-icon p-dialog-header-close p-link ng-star-inserted']")
   WebElement crossSign;
   
   @FindBy(xpath = "//button[@class='p-button-link p-button p-component p-ripple'][1]")
   WebElement selectId;
   
   @FindBy(xpath = "//span[contains(text(),'User Details')]")
   WebElement userDetailFormById1;
   
   @FindBy(xpath = "//tbody/tr[1]/td[8]/div/span[1]/button")
   WebElement editbtn;
   
   @FindBy(xpath = "//button[@class='p-button-rounded p-button-danger p-button p-component p-button-icon-only'][1]")
   WebElement dltBtn;
   
   @FindBy(xpath = "//span[contains(text(),'Are you sure you want to delete')]")
   WebElement deleteConfirmMessage;
   
   @FindBy(xpath = "//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-warn']")
   WebElement AddnewCancelBtn;
   
   @FindBy(xpath = "//button[@class='ng-tns-c132-6 p-dialog-header-icon p-dialog-header-close p-link p-ripple ng-star-inserted']")
   WebElement crosscancel;

   
 
   public void  searchBtn() {
	   boolean searchBtn= driver.findElement(By.xpath("//input[@class='p-inputtext p-component']")).isDisplayed();

	   if(searchBtn) {
		   System.out.println("search box is present");
	   }
	   else
	   {
	   System.out.println("Search box is not present");
	   }
		   
	   }
	

   
   public String userDetailFormById() {
	   return userDetailFormById1.getText();
	   
   }
   
   public void selectId(){
	  selectId.click();
   }
   
   public String getManagerUser() {
	   return manageUser.getText();
   }
   
   
   public void clickCrossSign()
   {
	   crossSign.click();
   }
   public String  getalert() {
	   Alert a = driver.switchTo().alert();
	   String s= driver.switchTo().alert().getText();
	   a.accept();
	  // return di.getText();
	return s;
   }
   
   
   public void confirmNoBtn() {
	   
	   confirmNOBtn.click();
   }
  
   
   
    public String captureShowing1to4() {
    	return showint1to4.getText();
		
	}
    
    public String addNewUser() {
    return addNewUser.getText();
		
	}
    
    public boolean checkBoxSelect()
    {
    	WebElement checkBoxSelect=driver.findElement(By.xpath("//div[@class='p-checkbox-box']"));
		Boolean isChecked = checkBoxSelect.isSelected();
    			return isChecked;
    	
    }
   
    public void checkBox1RowSelect()  {
    	
		//If the checkbox is unchecked then isSelected() will return false 
		//and NOT of false is true, hence we can click on checkbox
		if(!checkBoxSelectYes.isSelected())
			checkBoxSelectYes.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Util.IMPLICIT_WAIT));
    	}
   
    public boolean deleteBtn()
    {
    	Boolean deleteBtn1=driver.findElement(By.xpath("//div/mat-card/mat-card-title/div[2]/div[1]/button")).isEnabled();
         return deleteBtn1;
    }
    
    public boolean checkNextPage() {
    	Boolean nextpage1=driver.findElement(By.xpath("//p-paginator/div/button[3]/span")).isEnabled();
		return nextpage1;
    	
	
	} 
	
	public Boolean checkEnabled() {
	Boolean nn=driver.findElement(By.xpath("//p-paginator/div/button[3]/span")).isEnabled();
	return nn;
	}
	
	
	
	public String pageCount() {
		return count.getText();
		
	}

	public void clickUserTab() {
		userTab.click();

	}
	public String getTextHead() {
		return head.getText();

	}
	
	public String checkPagination() {
		return pagination.getText();
		
	}
	
	public void clickAddUser() {
		addNewUser.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public String captureUserDetail() {
		return userDeatil.getText();
		
		
	}
	
	public void ClickDeleteBtn() {
		driver.findElement(By.xpath("//div/mat-card/mat-card-title/div[2]/div[1]/button")).click();
		
	}
	public String confirmDilaogBox() {
		return confirmDilogBox.getText();
	}
	
	public void scrolldown() {
		js.executeScript("arguments[0].scrollIntoView();", count );
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}
	
	public void yesBtn() {
		yesBtn.click();
	}
	
	public void dilogBoxMessage() {
		//div[@class='p-toast-message-content ng-tns-c90-12']
		String dilogBoxMsg=driver.switchTo().alert().getText();
		System.out.println("********************************"+dilogBoxMsg);
		
	}
		
	public void displayEditDlt() {
			editbtn.isDisplayed();
			dltBtn.isDisplayed();
			}

	public void dlt() {
			dltBtn.click();
		}
			
	public String confirmDltMsg() {
		return deleteConfirmMessage.getText();
		
	}
	
	public void clickAddNewUser() {
		addNewUser.click();
	}
	
	public String getTextCancelButton() {
	return AddnewCancelBtn.getText();
		
	}
	
	public void ClickCancelDlt() {
	  AddnewCancelBtn.click();
		
	}
	
	public void presenceOfCancelBtn() {
		if(crosscancel.isDisplayed()) {
			System.out.println("Cancel Button is Visible"+crosscancel.isDisplayed());
		}
		else {
			System.out.println("Cancel Button is not Visible"+crosscancel.isDisplayed());
		}
	}
		
	}

