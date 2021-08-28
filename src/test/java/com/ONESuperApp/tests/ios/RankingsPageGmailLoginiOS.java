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
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.ONESuperApp.base.AppiumBaseClass;
import com.ONESuperApp.pageobject.android.RankingsPage;
import com.ONESuperApp.pageobject.ios.LanguageSelectionPage;
import com.ONESuperApp.pageobject.ios.OverviewPageiOS;
import com.ONESuperApp.pageobject.ios.RankingsPageiOS;
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

public class RankingsPageGmailLoginiOS extends AppiumBaseClass {
	
	IOSDriver<IOSElement> driver;
	LanguageSelectionPage langselectiOS;
	OverviewPageiOS overviewpageiOS;
	RankingsPageiOS rankingspageiOS;
	public static Constants constants=new Constants();
	
	@BeforeClass
	public void appLuanch() throws IOException, InterruptedException {
	    driver = iOScapabilities("ONESuperApp_iOS");
		LanguageSelectionPage languageselectionpage = new LanguageSelectionPage(driver);
		languageselectionpage.languageSelectionClick();
		overviewpageiOS = new OverviewPageiOS(driver);
		rankingspageiOS = new RankingsPageiOS(driver);
		rankingspageiOS.actions();
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
	
	@Test(priority = 6)
	public void rankingsTabClickTest()
	{
		String logInShowing = rankingspageiOS.logInOptionRankingsTabiOS();
		Assert.assertEquals(logInShowing, rankingspageiOS.expLogInOptionRankingsTab);
	}
	
	@Test(priority = 7)
	public void gmailLoginTest() throws InterruptedException
	{
		rankingspageiOS.gmailLoginiOS();
	}
	
/*	@Test(priority = 8)
	public void rankingsListVerifyTest() throws InterruptedException
	{
		 boolean isDisplayed =rankingspageiOS.rankingsTabList();
	 		Assert.assertTrue(isDisplayed);
	} */
	
	@Test(priority = 8)
	public void rankingsTabCardClick() throws InterruptedException
	{
		rankingspageiOS.rankinsListExpandiOS();
	}
	
	@Test(priority = 10)
	public void viewLeaderBoardVerifyTest()
	{
		String leaderBoard = rankingspageiOS.viewLeaderBoardVerifyiOS();
		Assert.assertEquals(leaderBoard, rankingspageiOS.expViewLeaderBoardText);
 	}
	
	@Test(priority = 11)
	public void globalContestVerifyTest()
	{
		String globalContest = rankingspageiOS.globalContestOnListiOS();
		Assert.assertEquals(globalContest, rankingspageiOS.expGlobalContestTitleText);
	}
	
	@Test(priority = 12)
	public void leaderBoardTest() throws InterruptedException
	{
		String rewards = rankingspageiOS.leaderBoardListVerifyiOS();
		Assert.assertEquals(rewards, rankingspageiOS.expLeaderBoardListVerify);
	}
	
	@Test(priority = 13)
	public void fantasyShareScreenVerifyTest() throws InterruptedException
	{
		//String highestScore = rankingspage.fantasyShareScreenVerify();
	//	Assert.assertEquals(highestScore, "HIGHEST SCORE");
		String average = rankingspageiOS.fantasyShareScreenVerifyiOS();
		Assert.assertEquals(average, rankingspageiOS.expFantasyShareScreenVerify);
	//	String yourScore = rankingspage.fantasyShareScreenVerify();
	//	Assert.assertEquals(yourScore, "YOUR SCORE");
	}
	
	@Test(priority = 14)
	public void fantasyShareScoreTest() throws InterruptedException
	{
		rankingspageiOS.fantasyScoreShareiOS();
	}
	@Test(priority = 15)
	public void fantasyShareVerifyTest() throws InterruptedException
	{
		String fantasyShare = rankingspageiOS.fantasyScoreShareVerifyiOS();
		Assert.assertEquals(fantasyShare, rankingspageiOS.expFantasyScoreShareVerify);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
