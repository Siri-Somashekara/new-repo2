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
import com.ONESuperApp.pageobject.android.SettingsTabPage;
import com.onefc.constants.Constants;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class SettingsPageTestFBNewUser extends AppiumBaseClass 
{
	
	AndroidDriver<AndroidElement> driver;
	LanguageSelectionPage langselect;
	OverviewPage overviewpage;
	SettingsTabPage settingspage;
	
	public static Constants constants=new Constants();
	
	@BeforeClass
	public void appLuanch() throws IOException, InterruptedException {
	    driver = Androidcapabilities("ONESuperApp_Android");
		LanguageSelectionPage languageselectionpage = new LanguageSelectionPage(driver);
		languageselectionpage.languageSelectionClick();
		overviewpage = new OverviewPage(driver);
		settingspage = new SettingsTabPage(driver);
		settingspage.actions();
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
	public void settingTabClickTest()
	{
		String logInShowing = settingspage.logInOptionSettingsTab();
		Assert.assertEquals(logInShowing, settingspage.expLogInOptionSettingsTab);
	}
	
	@Test(priority = 6)
	public void FBLoginTest() throws InterruptedException, IOException
	{
		settingspage.newUserFBLogin();
	}
	
	@Test(priority=7)
	public void SettingsTabHeaderTest() throws InterruptedException
	{
		String settingstabheader=settingspage.TabHeader();
		Assert.assertEquals(settingstabheader, settingspage.expSettingTabHeaderTitleText);
	}

	@Test(priority=8)
	public void LiveeventPreferenceTest()
	{
		String LiveText=settingspage.LiveEvents();
		Assert.assertEquals(LiveText, settingspage.expLiveeventPreferenceText);
	}

	@Test(priority=9)
	public void FullFightPreferenceTest()
	{
		String FullFghtText=settingspage.FullFights();
		Assert.assertEquals(FullFghtText, settingspage.expFullFightPreferenceText);
	}
	
	@Test(priority=10)
	public void HightlightPreferenceTest()
	{
		String HighlightText=settingspage.Highlights();
		Assert.assertEquals(HighlightText, settingspage.expHightlightPreferenceText);
	}
	
	@Test(priority=11)
	public void OthersPreferenceTest()
	{
		String OthersText=settingspage.Others();
		Assert.assertEquals(OthersText, settingspage.expOthersPreferenceText);
	}
	@Test(priority=12)
	public void ContestPreferenceTest()
	{
		String ContestText=settingspage.Contest();
		Assert.assertEquals(ContestText, settingspage.expContestPreferenceText);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	
}
