package com.kiran.smava.testScripts;

import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.kiran.smava.config.Constants;
import com.kiran.smava.pages.SmavaHomePage;
import com.kiran.smava.testBase.TestBase;


public class TC001_LoanSelection extends TestBase{

	SmavaHomePage SHP;
	@BeforeClass
	public void setUP() throws IOException{
		initialize();
	}
	
	@Test
	public void LoanSelection()
	{

			try {
				SHP = new SmavaHomePage(driver);
				if(SHP.verifyTitle(Constants.Homepagetitle))
				{
				SHP.netLoanAmount("2.750 €");
				Thread.sleep(2000);
				SHP.runningTime("24 Monate");
				Thread.sleep(2000);
				SHP.usageDropDown("Wohnen");
				Thread.sleep(2000);
				SHP.ContinueButton();
				Thread.sleep(4000);
				SHP.nextButton();
				
				}
				else
				{
					System.out.println("Home page title not matching");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	@AfterClass
	public void quitBrowser(){
		driver.quit();
	}
	
	
}
