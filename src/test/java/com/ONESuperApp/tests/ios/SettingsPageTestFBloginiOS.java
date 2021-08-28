package com.ONESuperApp.tests.ios;



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
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.ONESuperApp.base.AppiumBaseClass;
import com.ONESuperApp.pageobject.ios.LanguageSelectionPage;
import com.ONESuperApp.pageobject.ios.OverviewPageiOS;
import com.ONESuperApp.pageobject.ios.SettingsTabPageiOS;
import com.onefc.constants.Constants;

import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class SettingsPageTestFBloginiOS extends AppiumBaseClass{
	

	IOSDriver<IOSElement> driver;
	LanguageSelectionPage langselectiOS;
	OverviewPageiOS overviewpageiOS;
	SettingsTabPageiOS settingspageiOS;
	public static Constants constants=new Constants();
	
	@BeforeClass
	public void appLuanch() throws IOException, InterruptedException {
	    driver = iOScapabilities("ONESuperApp_iOS");
		LanguageSelectionPage languageselectionpage = new LanguageSelectionPage(driver);
		languageselectionpage.languageSelectionClick();
		overviewpageiOS = new OverviewPageiOS(driver);
		settingspageiOS = new SettingsTabPageiOS(driver);
		settingspageiOS.actionsiOS();
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
	public void settingTabClickTest()
	{
		String logInShowing = settingspageiOS.logInOptionSettingsTabiOS();
		Assert.assertEquals(logInShowing, settingspageiOS.expLogInOptionSettingsTab);
	}
	
	@Test(priority = 6)
	public void FBLoginTest() throws InterruptedException
	{
		settingspageiOS.fbLoginiOS();
	}
	
	@Test(priority=7)
	public void SettingsTabHeaderTest() throws InterruptedException
	{
		String settingsheader=settingspageiOS.TabHeaderiOS();
		Assert.assertEquals(settingsheader, settingspageiOS.expSettingTabHeaderTitleText);
	}

	@Test(priority=8)
	public void LiveeventPreferenceTest()
	{
		String LiveText=settingspageiOS.LiveEventsiOS();
		Assert.assertEquals(LiveText, settingspageiOS.expLiveeventPreferenceText);
	}

	@Test(priority=9)
	public void HightlightPreferenceTest()
	{
		String HighlightText=settingspageiOS.HighlightsiOS();
		Assert.assertEquals(HighlightText,settingspageiOS.expHightlightPreferenceText );
	}
	
	@Test(priority=10)
	public void FullFightPreferenceTest()
	{
		String FullFghtText=settingspageiOS.FullFightsiOS();
		Assert.assertEquals(FullFghtText, settingspageiOS.expFullFightPreferenceText);
	}
	
	@Test(priority=11)
	public void OthersPreferenceTest()
	{
		String OthersText=settingspageiOS.OthersiOS();
		Assert.assertEquals(OthersText, settingspageiOS.expOthersPreferenceText);
	}
	
	@Test(priority=12)
	public void ContestPreferenceTest()
	{
		String ContestText=settingspageiOS.ContestiOS();
		Assert.assertEquals(ContestText, settingspageiOS.expContestPreferenceText);
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
