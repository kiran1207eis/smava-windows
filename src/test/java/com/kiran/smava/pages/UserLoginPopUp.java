package com.kiran.smava.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserLoginPopUp {
	WebDriver driver;
	
	By userEmailTextBox = By.id("signonForm.email");
	By passwordTextBox = By.id("signonForm.password");
	By signInButton = By.xpath(".//*[@id='signonForm']/button");
	By ErrorOnInvaliedCredentials = By.xpath(".//*[@id='layout-wrapper']/div[3]/div[1]/div/div/div[1]/div/ul/li");
	By ErrorMessage = By.xpath(".//*[@id='layout-wrapper']/div[3]/div[1]/div/div/div[1]/div/ul/li");
	
	
	/**
	 * This method will creates WebDriver for this method
	 * @param driver
	 */
	public UserLoginPopUp(WebDriver driver)
	{
		this.driver = driver;
	}
	
	/**
	 * This method will enter user name in login popup.
	 * @param userName
	 * @throws InterruptedException 
	 */
	public void enterUserEmailInLoginPage(String userName) throws InterruptedException
	{
		driver.findElement(userEmailTextBox).sendKeys(userName);
	     Thread.sleep(3000);
	}
	
	
	/**
	 * This method will enter password in login popup.
	 * @param password
	 * @throws InterruptedException 
	 */
	public void enterPasswordInLoginPage(String password) throws InterruptedException
	{
		driver.findElement(passwordTextBox).sendKeys(password);
		Thread.sleep(3000);
	}
	
	/**
	 * This method will click on Login button
	 * @throws InterruptedException 
	 */
	public void signInButton() throws InterruptedException
	{
		driver.findElement(signInButton).click();
		Thread.sleep(3000);
	}
	
	public void LoginVerify() throws InterruptedException{
		if(driver.getPageSource().contains("Fehler")){
			System.out.println(driver.findElement(ErrorMessage).getText());
			Thread.sleep(3000);
		}
		else{
			System.out.println("Login successfull");
		}
	}
}
