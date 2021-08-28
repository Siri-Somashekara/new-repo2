package com.ONESuperApp.tests.android;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
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
import java.io.IOException;

import org.aspectj.lang.annotation.After;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ONESuperApp.base.AppiumBaseClass;
import com.ONESuperApp.pageobject.android.LanguageSelectionPage;
import com.ONESuperApp.pageobject.android.OverviewPage;
import com.onefc.constants.Constants;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class FollowFavSaveNewUserGmailLogin extends AppiumBaseClass{
	
	AndroidDriver<AndroidElement> driver;
	LanguageSelectionPage langselect;
	FollowFavSaveNewUserGmailLogin FFNewUserGmail;
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
	public void FollowFavBeforeLogin() throws InterruptedException {
		String followfav = overviewpage.followFavBeforeLogin();
		Assert.assertEquals(followfav, overviewpage.expFollowFavouritesPageHeader);
	}
	
	@Test(priority = 6)
	public void FollowFavLoginNewUser() throws IOException, InterruptedException {
		overviewpage.followFavLoginGmailNewUserid();
	}
	
	@Test(priority = 7)
	public void verifyFollowedCountry() {
		
	String CountryFollowed = overviewpage.FollowFavCountryAfterLoginNewUser();
	Assert.assertEquals(CountryFollowed, overviewpage.expCountryNameForNewUserFF);
	}
	
	@Test(priority = 8)
	public void verifyFollowedAthlete() {
		String AthleteFollowed = overviewpage.FollowFavAthleteAfterLoginNewUser();
		Assert.assertEquals(AthleteFollowed, overviewpage.expAthleteNameForNewUserFF);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	
}
