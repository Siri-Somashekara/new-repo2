package com.ONESuperApp.tests.ios;



import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.ONESuperApp.base.AppiumBaseClass;
import com.ONESuperApp.pageobject.ios.LanguageSelectionPage;
import com.ONESuperApp.pageobject.ios.OverviewPageiOS;
import com.onefc.constants.Constants;

import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class OverviewPageUserfieldemptyerrormessageiOS extends AppiumBaseClass {
	
	IOSDriver<IOSElement> driver;
	LanguageSelectionPage langselectiOS;
	OverviewPageiOS overviewpageiOS;
	public static Constants constants=new Constants();
	
	@BeforeClass
	public void appLuanch() throws IOException, InterruptedException {
	    driver = iOScapabilities("ONESuperApp_iOS");
		LanguageSelectionPage languageselectionpage = new LanguageSelectionPage(driver);
		languageselectionpage.languageSelectionClick();
		overviewpageiOS = new OverviewPageiOS(driver);
        overviewpageiOS.actionsiOS();
	} 
	
	@Test(priority=1)
	public void profileHeaderTest() throws InterruptedException
	{
		String profileheader=overviewpageiOS.ProfileHeaderiOS();
		Assert.assertEquals(profileheader, overviewpageiOS.expProfilePageHeader);
	}

	@Test(priority=2)
	public void overviewTabTest()
	{
		String overviewtab = overviewpageiOS.OverviewTabiOS();
		Assert.assertEquals(overviewtab, overviewpageiOS.expOverviewTabHeader);
	}
	
	@Test(priority = 3)
	public void settingsTabTest()
	{
		String settingstab = overviewpageiOS.SettingsTabiOS();
		Assert.assertEquals(settingstab, overviewpageiOS.expSettingsTabHeader);
	}
	
	
	@Test(priority = 4)
	public void rankingsTabTest()
	{
		String rankingstab = overviewpageiOS.RankingsTabiOS();
		Assert.assertEquals(rankingstab, overviewpageiOS.expRankingsTabHeader);
	}
	
	@Test(priority = 5)
	public void gmailLoginTest() throws InterruptedException
	{
		overviewpageiOS.GmailLoginiOS();
	}
	
	@Test(priority = 6)
	public void userDetailEmptyFieldErrorMsgTest() throws IOException
	{
		String pnameErrorMsg = overviewpageiOS.profileNameEmptyFieldErrorMsgiOS();
		Assert.assertEquals(pnameErrorMsg, overviewpageiOS.expProfileNameEmptyFieldErrorMsg);
		String emailField = overviewpageiOS.emailEmptyFieldErrorMsgiOS();
		Assert.assertEquals(emailField, overviewpageiOS.expEmailEmptyFieldErrorMsg);
		String phoneNoField = overviewpageiOS.phoneNoEmptyFieldErrorMsgiOS();
		Assert.assertEquals(phoneNoField, overviewpageiOS.expPhoneNoEmptyFieldErrorMsg);
		String userHandle = overviewpageiOS.userHandleEmptyFieldErrorMsgiOS();
		Assert.assertEquals(userHandle, overviewpageiOS.expUserHandleEmptyFieldErrorMsg);
		
	}
	
	@AfterClass
	public void tearDowniOS() {
		driver.quit();
	
	}
	
}



