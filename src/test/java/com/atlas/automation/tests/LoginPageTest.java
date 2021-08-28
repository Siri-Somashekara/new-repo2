package com.atlas.automation.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import com.atlas.automation.actions.WebdriverActions;
import com.atlas.automation.base.BaseClass;
import com.atlas.automation.pages.HomePage;
import com.atlas.automation.pages.LoginPage;

public class LoginPageTest extends BaseClass {

	LoginPage loginpage;
	HomePage homepage;
	WebdriverActions actions = new WebdriverActions();

	public LoginPageTest() {
		super();
	}

	@BeforeClass
	public void setup() throws IOException {
		initialization();
	}

	@Test
	public void loginToAppTest() throws InterruptedException {
		loginpage = new LoginPage();
		try {
			actions.waitForElementToLoad();
			loginpage.loginToApp(prop.getProperty("emailID"), prop.getProperty("password"));
			logger.info("Login is successfull");
			Assert.assertEquals(driver.getTitle(), homepage.expHomePageTitle);
			logger.info("home page title is verified");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
