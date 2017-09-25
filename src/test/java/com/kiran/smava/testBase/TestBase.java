package com.kiran.smava.testBase;

import java.io.IOException;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.kiran.smava.config.Constants;

public class TestBase {

	public WebDriver driver;
	
	public void initialize() throws IOException 
	{

		try {
			selectBrowser(Constants.chrome);
			driver.get(Constants.url);
			Thread.sleep(10000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
				System.out.println("Unable to start or driver or launch browser");
				e.printStackTrace();
			}
			

		
	}

	/**
	 * This method initialize browser object
	 * @param browser
	 * @return browser driver
	 */
	public WebDriver selectBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			return driver;
		}else if(browser.equalsIgnoreCase("chrome")){
			System.out.println("Chrome driver");
			//System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		}else if(browser.equalsIgnoreCase("IE")){
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			return driver;
		}
		
		return null;
	}
}
