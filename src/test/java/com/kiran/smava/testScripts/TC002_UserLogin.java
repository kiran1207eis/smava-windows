package com.kiran.smava.testScripts;

import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.kiran.smava.pages.*;
import com.kiran.smava.testBase.TestBase;


public class TC002_UserLogin extends TestBase {
	UserLoginPopUp ULP;
	SmavaHomePage SHP;
	@BeforeClass
	public void setUP() throws IOException{
		initialize();
	}
	
	@Test
	public void signIn()
	{
		SHP = new SmavaHomePage(driver);
		ULP = new UserLoginPopUp(driver);

		try{
			if(SHP.clickOnloginLink()==true)
			{
				ULP.enterUserEmailInLoginPage("Kiran");
				ULP.enterPasswordInLoginPage("Password");
				ULP.signInButton();
				Thread.sleep(5000);
				ULP.LoginVerify();
			}
		}catch(Exception e){
			System.out.println("Unable to locate objects");
			e.printStackTrace();
		}
	}
	
	
	@AfterClass
	public void quitBrowser(){
		driver.quit();
	}
}
