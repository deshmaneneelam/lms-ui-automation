package com.sdet.lms.utilities;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver = null;
	public static ConfigReader configReader;
	
	/**
	 * Set up application
	 */
	@BeforeClass
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
