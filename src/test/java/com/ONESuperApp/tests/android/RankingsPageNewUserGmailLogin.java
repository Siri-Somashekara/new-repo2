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
import com.ONESuperApp.pageobject.android.RankingsPage;
import com.ONESuperApp.pageobject.android.SettingsTabPage;
import com.onefc.constants.Constants;

import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class RankingsPageNewUserGmailLogin extends AppiumBaseClass{
	AndroidDriver<AndroidElement> driver;
	LanguageSelectionPage langselect;
	OverviewPage overviewpage;
	RankingsPage rankingspage;
	
	public static Constants constants=new Constants();
	
	
	@BeforeClass
	public void appLuanch() throws IOException, InterruptedException {
	    driver = Androidcapabilities("ONESuperApp_Android");
		LanguageSelectionPage languageselectionpage = new LanguageSelectionPage(driver);
		languageselectionpage.languageSelectionClick();
		overviewpage = new OverviewPage(driver);
		rankingspage = new RankingsPage(driver);
		rankingspage.actions();
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
	public void rankingsTabClickTest()
	{
		String logInShowing = rankingspage.logInOptionRankingsTab();
		Assert.assertEquals(logInShowing, rankingspage.expLogInOptionRankingsTab);
	}
	@Test(priority = 6)
	public void gmailLoginTest() throws InterruptedException, IOException
	{
		rankingspage.newUserGmailLogin();
	}
	
/*	@Test(priority = 7)
	public void rankingsListVerifyTest() throws InterruptedException
	{
		 boolean isDisplayed =rankingspage.rankingsTabList();
	 		AssertJUnit.assertTrue(isDisplayed);
	}*/
	
	@Test(priority = 7)
	public void rankingsTabCardClick() throws InterruptedException
	{
		rankingspage.rankingsListExpand();
	}
	
	@Test(priority = 8)
	public void viewLeaderBoardVerifyTest()
	{
		Assert.assertEquals(rankingspage.viewLeaderBoardVerify(), rankingspage.expViewLeaderBoardText);
 	}
	
	@Test(priority = 9)
	public void globalContestVerifyTest()
	{
		Assert.assertEquals(rankingspage.globalContestOnList(), rankingspage.expGlobalContestTitleText);
	}
	
	@Test(priority = 10)
	public void leaderBoardTest() throws InterruptedException
	{
		String rewards = rankingspage.leaderBoardListVerify();
		Assert.assertEquals(rewards, rankingspage.expLeaderBoardListVerify);
	}
	
	@Test(priority = 11)
	public void fantasyShareScreenVerifyTest() throws InterruptedException
	{
		//String highestScore = rankingspage.fantasyShareScreenVerify();
	//	Assert.assertEquals(highestScore, "HIGHEST SCORE");
		String average = rankingspage.fantasyShareScreenVerify();
		Assert.assertEquals(average, rankingspage.expFantasyShareScreenVerify);
	//	String yourScore = rankingspage.fantasyShareScreenVerify();
	//	Assert.assertEquals(yourScore, "YOUR SCORE");
	}
	
	@Test(priority = 12)
	public void fantasyShareScoreTest() throws InterruptedException
	{
		rankingspage.fantasyScoreShare();
	}
	
	@Test(priority = 13)
	public void fantasyShareVerifyTest() throws InterruptedException
	{
		String fantasyShare = rankingspage.fantasyScoreShareVerify();
		Assert.assertEquals(fantasyShare, rankingspage.expFantasyScoreShareVerify);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	

	
}
