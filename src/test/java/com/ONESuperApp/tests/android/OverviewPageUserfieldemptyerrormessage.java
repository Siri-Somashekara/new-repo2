package com.ONESuperApp.tests.android;



import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.ONESuperApp.base.AppiumBaseClass;
import com.ONESuperApp.pageobject.android.LanguageSelectionPage;
import com.ONESuperApp.pageobject.android.OverviewPage;
import com.onefc.constants.Constants;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class OverviewPageUserfieldemptyerrormessage extends AppiumBaseClass {
	
	AndroidDriver<AndroidElement> driver;
	LanguageSelectionPage langselect;
	OverviewPage overviewpage;
	
	public static Constants constants=new Constants();
	
	@BeforeClass
	public void appLuanch() throws IOException, InterruptedException {
	    driver = Androidcapabilities("ONESuperApp_Android");
		LanguageSelectionPage languageselectionpage = new LanguageSelectionPage(driver);
		languageselectionpage.languageSelectionClick();
		overviewpage = new OverviewPage(driver);
		overviewpage.actions();
	} 
	
	@Test(priority=1)
	public void profileHeaderTest() throws InterruptedException
	{
		String profileheader=overviewpage.ProfileHeader();
		Assert.assertEquals(profileheader, overviewpage.expProfilePageHeader);
	}

	@Test(priority=2)
	public void overviewTabTest()
	{
		String overviewtab = overviewpage.OverviewTab();
		Assert.assertEquals(overviewtab, overviewpage.expOverviewTabHeader);
	}
	
	@Test(priority = 3)
	public void settingsTabTest()
	{
		String settingstab = overviewpage.SettingsTab();
		Assert.assertEquals(settingstab, overviewpage.expSettingsTabHeader);
	}
	
	
	@Test(priority = 4)
	public void rankingsTabTest()
	{
		String rankingstab = overviewpage.RankingsTab();
		Assert.assertEquals(rankingstab, overviewpage.expRankingsTabHeader);
	}
	
	@Test(priority = 5)
	public void gmailLoginTest()
	{
		overviewpage.GmailLogin();
	}
	
	
	@Test(priority = 6)
	public void userDetailEmptyFieldErrorMsgTest() throws IOException
	{
		String pnameErrorMsg = overviewpage.profileNameEmptyFieldErrorMsg();
		Assert.assertEquals(pnameErrorMsg, overviewpage.expProfileNameEmptyFieldErrorMsg);
		String emailField = overviewpage.emailEmptyFieldErrorMsg();
		Assert.assertEquals(emailField, overviewpage.expEmailEmptyFieldErrorMsg);
		String phoneNoField = overviewpage.phoneNoEmptyFieldErrorMsg();
		Assert.assertEquals(phoneNoField, overviewpage.expPhoneNoEmptyFieldErrorMsg);
		String userHandle = overviewpage.userHandleEmptyFieldErrorMsg();
		Assert.assertEquals(userHandle, overviewpage.expUserHandleEmptyFieldErrorMsg);
		
	}
		
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	
}





