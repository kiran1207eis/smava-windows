package com.kiran.smava.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SmavaHomePage {

	WebDriver driver;


	
	By netLoanAmount = By.xpath(".//*[@id='myselect']/div/i");
	By runningTime = By.xpath(".//*[@id='myselect2']/div/i");
	By usageDropDown = By.xpath(".//*[@id='myselect3']/div/i");
	By tenureSelection = By.xpath(".//*[@id='myselect2']/div/div[2]/div[2]");
	By ContinueButton = By.xpath(".//*[@id='forwardButtonskg']/button");
	By nextButton = By.xpath(".//*[@id='x-application']/div[1]/div/div[2]/div/div[2]/a/span[2]");
	By loanComparison = By.linkText("item tit uppercase hide-1200");
	By loginLink = By.xpath("html/body/div[4]/div[1]/div/div[2]/a[6]");
	By amountsList = By.xpath(".//*[@id='myselect']/div/div[2]/div");
	By amountSelection = By.xpath(".//*[@id='myselect']/div/div[2]/div[10]");
	By monthsList = By.xpath(".//*[@id='myselect2']/div/div[2]/div");
	By UsageDetailsList = By.xpath(".//*[@id='myselect3']/div/div[2]/div");
	By useLive = By.xpath(".//*[@id='myselect3']/div/div[2]/div[3]");
	
	
	
	/**
	 * Creates WebDriver for this method
	 * @param driver
	 */
	public SmavaHomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	/**
	 * This method will check the title of the landing page
	 * @param actualTitle
	 * @return
	 */
	public boolean verifyTitle(String actualTitle){
		String expectedTitle = driver.getTitle();
		System.out.println(expectedTitle);
		if(actualTitle.equals(expectedTitle)){
			return true;
		}	
		return false;
	}
	
	/**
	 * This method will select the loan amount in Smava home page
	 * @param loanAmount
	 */
	public void netLoanAmount(String loanAmount){	
		try {
			driver.findElement(netLoanAmount).click();
			Thread.sleep(2000);
			String amount = loanAmount;
			valueSelectionFromDropDown(amount, amountsList, amountSelection);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method will select the loan tenure in Smava home page
	 * @param loanTenure
	 */
	public void runningTime(String loanTenure){
		try {
			driver.findElement(runningTime).click();
			Thread.sleep(3000);
			String time = loanTenure;
			valueSelectionFromDropDown(time, monthsList, tenureSelection);
			//driver.findElement(By.xpath(".//*[@id='myselect2']/div/div[2]/div[2]")).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	/**
	 * This method will select the loan use in Smava home page
	 * @param usageSelection
	 */
	public void usageDropDown(String usageSelection){
		try {
			Thread.sleep(2000);
			driver.findElement(usageDropDown).click();
			Thread.sleep(4000);
			valueSelectionFromDropDown(usageSelection, UsageDetailsList, useLive);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method will click on continue button in Smava home page
	 */
	public void ContinueButton(){
		driver.findElement(ContinueButton).click();
	}
	
	/**
	 * This method will on next button in Smava home page
	 */
	public void nextButton() {
		driver.findElement(nextButton).click();
	}
	
	/**
	 * This method will click on login link in Smava home page
	 * @return
	 */
	public boolean clickOnloginLink()
	{
		if(driver.findElement(loginLink).isDisplayed()){
			driver.findElement(loginLink).click();
			return true;
		}
		else{
			return false;
		}
	}
	
	/**
	 * This is a generic method used to select the desired value from the drop down
	 * @param value
	 * @param listOfValuesLink
	 * @param valueLink
	 */
	public void valueSelectionFromDropDown(String value,By listOfValuesLink, By valueLink){
		try {
			Thread.sleep(2000);
			List<WebElement> elements = driver.findElements(listOfValuesLink); 
			for(WebElement we : elements){
				System.out.println(we.getText());
				if(value.equals(we.getText())){
					driver.findElement(valueLink).click();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
