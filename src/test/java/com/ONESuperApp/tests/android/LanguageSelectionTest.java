package com.ONESuperApp.tests.android;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import java.io.IOException;

import com.ONESuperApp.base.AppiumBaseClass;
import com.ONESuperApp.pageobject.android.LandingPage;
import com.ONESuperApp.pageobject.android.LanguageSelectionPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LanguageSelectionTest extends AppiumBaseClass {

	WebDriverWait wait;
	@Test
	public void languageSelectionTest() throws IOException, InterruptedException {
		AndroidDriver<AndroidElement> driver = Androidcapabilities("ONESuperApp_Android");
		LanguageSelectionPage languageselectionpage = new LanguageSelectionPage(driver);
		LandingPage lpage = new LandingPage(driver);
		wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(languageselectionpage.languageSelectionBtn));
		languageselectionpage.languageSelectionClick();
		wait.until(ExpectedConditions.visibilityOf(lpage.shopLinkBtn));
		Assert.assertTrue(lpage.shopLinkBtn.isDisplayed());
	}
	
	@AfterClass
	public void tearDown() {
		Androiddriver.quit();
	}

}
