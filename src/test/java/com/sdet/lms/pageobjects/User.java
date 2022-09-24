package com.sdet.lms.pageobjects;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sdet.lms.utilities.BaseClass;

public class User extends BaseClass {


	public User (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[text()='User']")
	WebElement userTab;
	@FindBy(xpath = "//div[@class=\"box\"][1]")
	WebElement head;
	
	@FindBy(xpath = "//button[@id=\"new\"]")
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
   
   @FindBy(xpath = "//button[@class=\"ng-tns-c133-4 p-confirm-dialog-reject p-ripple p-button p-component ng-star-inserted\"]")
   WebElement confirmNOBtn;
   
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
    	Boolean CheckBoxSelect=driver.findElement(By.xpath("//div[@class='p-checkbox-box p-component']")).isSelected();
		return checkBoxSelect();
    	
    }
    
    public void checkBox1RowSelect()  {
    	WebElement CheckBoxSelect1=driver.findElement(By.xpath("//div[@class='p-checkbox-box p-component']"));
		
		
		//If the checkbox is unchecked then isSelected() will return false 
		//and NOT of false is true, hence we can click on checkbox
		if(!CheckBoxSelect1.isSelected())
			CheckBoxSelect1.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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

}
