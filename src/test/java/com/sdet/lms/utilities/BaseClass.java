package com.sdet.lms.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver = null;
	public static ConfigReader configReader;
	
	/**
	 * Set up application
	 */
	public void setup() {	
		initBrowser();
	}
	
	/**
	 * Initialize browser
	 */
	private void initBrowser() {
		
		if(driver == null) {
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
	
	/**
	 * Close browser
	 */
	
	@AfterClass
	public void close() {
		driver.quit();
	}
}
