package com.sdet.lms.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	protected WebDriver driver;
	
	protected ConfigReader configReader;
	
	/**
	 * Set up application
	 */
	@BeforeClass
	public void setup() {	
		System.out.println("in set up");
		initBrowser();
	}
	
	/**
	 * Initialize browser
	 */
	private void initBrowser() {
		
		System.out.println("In initBrower");
		
		if(driver == null) {
			
			System.out.println("In initBrower driver");
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			configReader = new ConfigReader();			
			
			openUrl(configReader.getURL());
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Util.PAGE_LOAD_TIMEOUT));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Util.IMPLICIT_WAIT));
			
		}
		
	}
	
	private void openUrl(String url) {
		driver.get(url);
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	/**
	 * Close browser
	 */
	//@AfterClass
	public void close() {
		if(driver != null) {
			driver.quit();
		}
	}
}