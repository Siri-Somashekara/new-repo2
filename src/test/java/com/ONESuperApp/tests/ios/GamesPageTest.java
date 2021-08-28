package com.ONESuperApp.tests.ios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.ONESuperApp.base.AppiumBaseClass;
import com.ONESuperApp.base.iOS_Utilities;
import com.ONESuperApp.pageobject.ios.GamesPage;
import com.ONESuperApp.pageobject.ios.LanguageSelectionPage;
import com.ONESuperApp.pageobject.ios.ProfilePage;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class GamesPageTest extends AppiumBaseClass

{
	IOSDriver<IOSElement> driver;
	GamesPage gamespage;
	ProfilePage profilepage;
	iOS_Utilities util;
	String EventName;
	WebDriverWait wait;
	
	@BeforeClass
	public void appLuanch() throws IOException, InterruptedException 
	{
	    driver = iOScapabilities("ONESuperApp_iOS");
		LanguageSelectionPage languageselectionpage = new LanguageSelectionPage(driver);
		languageselectionpage.languageSelectionClick();
		gamespage= new GamesPage(driver);
		profilepage=new ProfilePage(driver);
		util = new iOS_Utilities();
		wait= new WebDriverWait(driver,20);
	}
	
	@Test(priority=1)
	public void Test_GamesPage_TabHeaders() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(gamespage.gamesPage));
		gamespage.gamesPage.click();
		Assert.assertEquals(gamespage.gamesPageHeader.getText(), gamespage.expGamesPageHeader);
		Assert.assertEquals(gamespage.availableNowTabHeader.getText(), gamespage.expAvailableNowTabHeader);
		Assert.assertEquals(gamespage.pastTabHeader.getText(),gamespage.expPastTabHeader);
	}
	
	 @Test(priority=2)
	public void Test_UpcomingFantasyEvent_TabHeaders() throws InterruptedException
	{
		gamespage.joinFantasyButton1.click();
		wait.until(ExpectedConditions.visibilityOf(gamespage.redAthlete1));
		gamespage.BackButton.click();
		Assert.assertTrue(gamespage.myTeamsTab.isDisplayed(), gamespage.expMyTeamsTabHeader);
		Assert.assertEquals(gamespage.myTeamsTab.getText(), gamespage.expMyTeamsTabHeader);
	    Assert.assertTrue(gamespage.boutsTab.isDisplayed(),gamespage.expBoutsTabHeader);
	    Assert.assertEquals(gamespage.boutsTab.getText(), gamespage.expBoutsTabHeader);
		Assert.assertTrue(gamespage.contestTab.isDisplayed(), gamespage.expContestTabHeader);
		Assert.assertEquals(gamespage.contestTab.getText(), gamespage.expContestTabHeader);
		
	}
	   @Test(priority=3)
		public void Test_EventCard_beforeCreatingTeam() throws InterruptedException
		{
	    	gamespage.BackButton.click();
			Assert.assertTrue(gamespage.eventName_onEventBanner.isDisplayed(),"Event Name on Event Card");
			Assert.assertTrue(gamespage.dateAndtime_onEventBanner.isDisplayed(),"Date and Time on Event Card");
			Assert.assertTrue(gamespage.viewDetailsButton.isDisplayed(),gamespage.expViewDetailsButtonTitle);
			Assert.assertEquals(gamespage.viewDetailsButton.getText(),gamespage.expViewDetailsButtonTitle);
			Assert.assertTrue(gamespage.joinFantasyButton1.isDisplayed(),gamespage.expJoinFantasyButtonTitle);
			//Assert.assertEquals(gamespage.joinFantasyButton1.getText(),gamespage.expJoinFantasyButtonTitle);
		}
		
	    //1--Creating team for first time and logged in user via fantasy (existing user)
		@Test(priority=4)
		public void Test_TeaminMyteamsTab_GmailUser_LoggedInVia_Fantasy() throws InterruptedException
		{
			gamespage.Teamcreation_GmailUser_LoggedInVia_Fantasy();
			wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard1));
			Assert.assertTrue(gamespage.teamCard1.isDisplayed());
			Assert.assertEquals(gamespage.team1Name_on_TeamCard.getText(), gamespage.TeamName);
		}
		
		@Test(priority=5)
		public void Test_TeaminGlobalContest_GmailUser_LoggedInVia_Fantasy() throws InterruptedException
		{
			Assert.assertTrue(gamespage.globalContest_Button_onTeamCard.isDisplayed());
			gamespage.contestTab.click();
			gamespage.globalContest.click();
			Assert.assertTrue(gamespage.teamCard1.isDisplayed());
			Assert.assertEquals(gamespage.team1Name_on_TeamCard.getText(), gamespage.TeamName);
		}

		@Test(priority=6)
		public void Test_EventCard_afterCreatingTeam() throws InterruptedException
		{
			gamespage.BackButton.click();
			gamespage.BackButton.click();
			Assert.assertTrue(gamespage.eventName_onEventBanner.isDisplayed(),"Event Name on Event Card");
			Assert.assertTrue(gamespage.dateAndtime_onEventBanner.isDisplayed(),"Date and Time on Event Card");
			Assert.assertTrue(gamespage.viewDetailsButton.isDisplayed(),gamespage.expViewDetailsButtonTitle);
			Assert.assertEquals(gamespage.viewDetailsButton.getText(),gamespage.expViewDetailsButtonTitle);
			Assert.assertTrue(gamespage.joinFantasyButton1.isDisplayed(),gamespage.expJoinFantasyButtonTitle);
			Assert.assertEquals(gamespage.joinFantasyButton1.getText(),gamespage.expEditEntriesButtonTitle);
			
		}
		
		@Test(priority=7)
		public void Test_TeaminMyteamsTab_FbUser_LoggedInVia_Fantasy() throws InterruptedException
		{
			gamespage.Logout();
			gamespage.Teamcreation_FbUser_LoggedInVia_Fantasy();
			wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard1));
			Assert.assertTrue(gamespage.teamCard1.isDisplayed());
			Assert.assertEquals(gamespage.team1Name_on_TeamCard.getText(), gamespage.TeamName);
		}
		
		@Test(priority=8)
		public void Test_TeaminGlobalContest_FbUser_LoggedInVia_Fantasy() throws InterruptedException
		{
			Assert.assertTrue(gamespage.globalContest_Button_onTeamCard.isDisplayed());
			gamespage.contestTab.click();
			gamespage.globalContest.click();
			wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard1));
			Assert.assertTrue(gamespage.teamCard1.isDisplayed());
			Assert.assertEquals(gamespage.team1Name_on_TeamCard.getText(), gamespage.TeamName);	
		}
	
	    //2-- Creating team for first time for logged in user via user profile (existing user)
		@Test(priority=9)
		public void Test_TeaminMyteamsTab_GmailUser_LoggedInVia_ProfilePage() throws InterruptedException
		{
			gamespage.BackButton.click();
			gamespage.BackButton.click();
			gamespage.Logout();
			gamespage.Teamcreation_GmailUser_LoggedInVia_ProfilePage();
			wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard1));
			Assert.assertTrue(gamespage.teamCard1.isDisplayed());
			Assert.assertEquals(gamespage.team1Name_on_TeamCard.getText(), gamespage.TeamName);
		}
		

		@Test(priority=10)
		public void Test_TeaminGlobalContest_GmailUser_LoggedInVia_ProfilePage() throws InterruptedException
		{
			Assert.assertTrue(gamespage.globalContest_Button_onTeamCard.isDisplayed());
			gamespage.contestTab.click();
			gamespage.globalContest.click();
			wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard1));
			Assert.assertTrue(gamespage.teamCard1.isDisplayed());
			Assert.assertEquals(gamespage.team1Name_on_TeamCard.getText(), gamespage.TeamName);
			
		}
		
		@Test(priority=11)
		public void Test_TeaminMyteamsTab_FbUser_LoggedInVia_ProfilePage() throws InterruptedException
		{
			gamespage.BackButton.click();
			gamespage.BackButton.click();
			gamespage.Logout();
			gamespage.Teamcreation_FbUser_LoggedInVia_ProfilePage();
			wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard1));
			Assert.assertTrue(gamespage.teamCard1.isDisplayed());
			Assert.assertEquals(gamespage.team1Name_on_TeamCard.getText(), gamespage.TeamName);
		}
		

		@Test(priority=12)
		public void Test_TeaminGlobalContest_FbUser_LoggedInVia_ProfilePage() throws InterruptedException
		{
			Assert.assertTrue(gamespage.globalContest_Button_onTeamCard.isDisplayed());
			gamespage.contestTab.click();
			gamespage.globalContest.click();
			wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard1));
			Assert.assertTrue(gamespage.teamCard1.isDisplayed());
			Assert.assertEquals(gamespage.team1Name_on_TeamCard.getText(), gamespage.TeamName);
			
		}
		
		//3-- Creating team for first time via contestpage for logged in user via user ContestPage (existing user)
		@Test(priority=13)
		public void Test_TeaminContest_TeamCreationFromContestPage_GmailUser_LoggedInVia_ContestPage() throws InterruptedException
		{
			gamespage.BackButton.click();
			gamespage.BackButton.click();
			gamespage.Logout();
			gamespage.TeamCreationFromContestPage_GmailUser_LoggedInVia_ContestPage();
			wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard1));
			Assert.assertTrue(gamespage.teamCard1.isDisplayed());
			Assert.assertEquals(gamespage.team1Name_on_TeamCard.getText(), gamespage.TeamName);
		}
		
		@Test(priority=14)
		public void Test_TeaminMyTeamsTab_TeamCreationFromContestPage_GmailUser_LoggedInVia_ContestPage() throws InterruptedException
		{
			gamespage.BackButton.click();
			gamespage.myteamsTab_AterCreating_1team.click();
			Assert.assertTrue(gamespage.teamCard1.isDisplayed());
			Assert.assertTrue(gamespage.indiaContest_Button_onTeamCard.isDisplayed());
			Assert.assertEquals(gamespage.team1Name_on_TeamCard.getText(), gamespage.TeamName);
		}
		
		@Test(priority=15)
		public void Test_TeaminGlobalContest_TeamCreationFromContestPage_GmailUser_LoggedInVia_ContestPage() throws InterruptedException
		{
			gamespage.contestTab.click();
			gamespage.globalContest.click();
			wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard1));
			Assert.assertTrue(gamespage.teamCard1.isDisplayed());
			Assert.assertEquals(gamespage.team1Name_on_TeamCard.getText(), gamespage.TeamName);
		}
		
		@Test(priority=16)
		public void Test_TeaminContest_TeamCreationFromContestPage_FbUser_LoggedInVia_ContestPage() throws InterruptedException
		{
			gamespage.BackButton.click();
			gamespage.BackButton.click();
			gamespage.Logout();
			gamespage.TeamCreationFromContestPage_FbUser_LoggedInVia_ContestPage();
			wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard1));
			Assert.assertTrue(gamespage.teamCard1.isDisplayed());
			Assert.assertEquals(gamespage.team1Name_on_TeamCard.getText(), gamespage.TeamName);
		}
		
		@Test(priority=17)
		public void Test_TeaminMyTeamsTab_TeamCreationFromContestPage__FbUser_LoggedInVia_ContestPage() throws InterruptedException
		{
			gamespage.BackButton.click();
			gamespage.myteamsTab_AterCreating_1team.click();
			wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard1));
			Assert.assertTrue(gamespage.teamCard1.isDisplayed());
			Assert.assertTrue(gamespage.indiaContest_Button_onTeamCard.isDisplayed(),"Contest Button on team card");
			Assert.assertEquals(gamespage.team1Name_on_TeamCard.getText(), gamespage.TeamName);
		}
		
		@Test(priority=18)
		public void Test_TeaminGlobalContest_TeamCreationFromContestPage__FbUser_LoggedInVia_ContestPage() throws InterruptedException
		{
			gamespage.contestTab.click();
			gamespage.globalContest.click();
			wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard1));
			Assert.assertTrue(gamespage.teamCard1.isDisplayed());
			Assert.assertEquals(gamespage.team1Name_on_TeamCard.getText(), gamespage.TeamName);	
		}
		
		//4-- Creating team for first time via contestpage for logged in user via user ProfilePage (existing user)
		@Test(priority=19)
		public void Test_TeaminContest_TeamCreationFromContestPage_GmailUser_LoggedInVia_ProfilePage() throws InterruptedException
		{
			gamespage.BackButton.click();
			gamespage.BackButton.click();
			gamespage.Logout();
			gamespage.TeamCreationFromContestPage_GmailUser_LoggedInVia_ProfilePage();
			wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard1));
			Assert.assertTrue(gamespage.teamCard1.isDisplayed());
			Assert.assertEquals(gamespage.team1Name_on_TeamCard.getText(), gamespage.TeamName);
		}
		
		@Test(priority=20)
		public void Test_TeaminMyTeamsTab_TeamCreationFromContestPage_GmailUser_LoggedInVia_ProfilePage() throws InterruptedException
		{
			gamespage.BackButton.click();
			gamespage.myteamsTab_AterCreating_1team.click();
			wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard1));
			Assert.assertTrue(gamespage.teamCard1.isDisplayed());
			Assert.assertTrue(gamespage.indiaContest_Button_onTeamCard.isDisplayed(),"Contest Button on team card");
			Assert.assertEquals(gamespage.team1Name_on_TeamCard.getText(), gamespage.TeamName);
		}
		
		@Test(priority=21)
		public void Test_TeaminGlobalContest_TeamCreationFromContestPage_GmailUser_LoggedInVia_ProfilePage() throws InterruptedException
		{
			gamespage.contestTab.click();
			gamespage.globalContest.click();
			wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard1));
			Assert.assertTrue(gamespage.teamCard1.isDisplayed());
			Assert.assertEquals(gamespage.team1Name_on_TeamCard.getText(), gamespage.TeamName);
		}
		
		@Test(priority=22)
		public void Test_TeaminContest_TeamCreationFromContestPage_FbUser_LoggedInVia_ProfilePage() throws InterruptedException
		{
			gamespage.BackButton.click();
			gamespage.BackButton.click();
			gamespage.Logout();
			gamespage.TeamCreationFromContestPage_FbUser_LoggedInVia_ProfilePage();
			Assert.assertTrue(gamespage.teamCard1.isDisplayed());
			Assert.assertEquals(gamespage.team1Name_on_TeamCard.getText(), gamespage.TeamName);
		}
		
		@Test(priority=23)
		public void Test_TeaminMyTeamsTab_TeamCreationFromContestPage_FbUser_LoggedInVia_ProfilePage() throws InterruptedException
		{
			gamespage.BackButton.click();
			gamespage.myteamsTab_AterCreating_1team.click();
			wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard1));
			Assert.assertTrue(gamespage.teamCard1.isDisplayed());
			Assert.assertTrue(gamespage.indiaContest_Button_onTeamCard.isDisplayed(),"Contest Button on team card");
			Assert.assertEquals(gamespage.team1Name_on_TeamCard.getText(), gamespage.TeamName);
		}
		
		@Test(priority=24)
		public void Test_TeaminGlobalContest_TeamCreationFromContestPage_FbUser_LoggedInVia_ProfilePage() throws InterruptedException
		{
			gamespage.contestTab.click();
			gamespage.globalContest.click();
			wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard1));
			Assert.assertTrue(gamespage.teamCard1.isDisplayed());
			Assert.assertEquals(gamespage.team1Name_on_TeamCard.getText(), gamespage.TeamName);
		}
		
	
	  /* @Test(priority=25)
	   public void Test_shareTeam_fromMyTeamsTab() throws InterruptedException
	   {
		   gamespage.BackButton.click();
		   gamespage.myteamsTab_AterCreating_1team.click();
		   wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard1));
		   Assert.assertEquals(gamespage.shareText_onTeamCard_BeforeSharing.getText(),gamespage.expShareTextonTeamCardBeforeShare);
	       gamespage.shareButton_onTeamCard.click();
	   	   gamespage.share();
	       wait.until(ExpectedConditions.visibilityOf(gamespage.share_FiftyPoints_ToastMessage));
		   Assert.assertTrue(gamespage.share_FiftyPoints_ToastMessage.isDisplayed(),gamespage.toastMsg);
		   Assert.assertEquals(gamespage.share_FiftyPoints_ToastMessage.getText(), gamespage.expToastMsgAfterShare50Points);
		   Assert.assertEquals(gamespage.shareText_onTeamCard_afterSharing.getText(), gamespage.expShareTextonTeamCardAfterShare);
		   Assert.assertEquals(gamespage.teamDetails_toCheckMaxScore.getText(),gamespage.expTeamDetailsTextonTeamCard);
		} */
        @Test(priority=26)
     	public void Test_TeaminContest_afterAddingTeam_Using_ChooseExistingTeam() throws InterruptedException
     	{
     	gamespage.BackButton.click();
     	gamespage.BackButton.click();
		gamespage.addTeam();
		wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard1));
		Assert.assertTrue(gamespage.teamCard1.isDisplayed());
		}
     	 
	
     	@Test(priority=27)
    	public void Test_TeaminMyTeamsTab_afterAddingTeam_Using_ChooseExistingTeam()
     	{
     	gamespage.BackButton.click();
		gamespage.myteamsTab_AterCreating_1team.click();
		wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard1));
		Assert.assertTrue(gamespage.teamCard1.isDisplayed());
		Assert.assertTrue(gamespage.indiaContest_Button_onTeamCard.isDisplayed(),"Contest Button on team card");
		}
     	
     	@Test(priority=28)
    	public void Test_Withdraw_Button_inContest() throws InterruptedException
    	{
     		gamespage.contestTab.click();
     		gamespage.indiaContest.click();
    		gamespage.withdrawButton_inContest.click();
    		wait.until(ExpectedConditions.visibilityOf(gamespage.chooseExistingTeamButton));
    		Assert.assertTrue(gamespage.chooseExistingTeamButton.isDisplayed());
    	}
 	
     	@Test(priority=29)
    	public void Test_EventClickNavigation_after_Team_created() throws InterruptedException
    	{
     		gamespage.BackButton.click();
     		gamespage.BackButton.click();
    		gamespage.joinFantasyButton1.click();
    		wait.until(ExpectedConditions.visibilityOf(gamespage.eventName_inMyTeamsTab));
    		Assert.assertTrue(gamespage.public_Contests_text.isDisplayed(),"public contests text in the cotest page");
    		gamespage.myteamsTab_AterCreating_1team.click();
    		wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard1));
    		Assert.assertTrue(gamespage.teamCard1.isDisplayed(), "Team in My teams Tab");
    	}
     	
     	@Test(priority=30)
    	public void Test_teamCreation_via_MyTeamsTab() throws InterruptedException
    	{
    		gamespage.createTeam_via_Myteams_Tab();
    		wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard2));
    		Assert.assertTrue(gamespage.teamCard2.isDisplayed(),"Team in My teams Tab");
    		Assert.assertEquals(gamespage.team2Name_on_TeamCard.getText(), gamespage.TeamName);
    		Assert.assertTrue(gamespage.globalContest_Button_onTeamCard2.isDisplayed(),"Global contest button on the team card");
    		gamespage.contestTab.click();
    		gamespage.globalContest.click();
    		wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard2));
    		Assert.assertTrue(gamespage.teamCard2.isDisplayed(),"Team in Global Contest");
    		Assert.assertEquals(gamespage.team2Name_on_TeamCard.getText(), gamespage.TeamName);
    	}
     	
     	@Test(priority=31)
    	public void Test_teamName_after_editingTeamName() throws InterruptedException
    	{
     		gamespage.BackButton.click();
    		gamespage.edit_TeamName();
    		wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard1));
    		Assert.assertEquals(gamespage.team1Name_on_TeamCard.getText(),gamespage.TeamName);	
    	}
     	
     	@Test(priority=32)
    	public void Test_Add_another_team_in_Contests() throws InterruptedException
    	{
    		gamespage.Add_another_Team();
    		wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard2));
    		Assert.assertTrue(gamespage.teamCard2.isDisplayed());
    	}
     	
     	@Test(priority=33)
    	public void Test_JOIN_Button_forContest() throws InterruptedException
    	{
     		gamespage.BackButton.click();
     		wait.until(ExpectedConditions.elementToBeClickable(gamespage.eventName_inMyTeamsTab));
    		gamespage.JOIN_Button_onContest.click();
    		wait.until(ExpectedConditions.visibilityOf(gamespage.chooseExistingTeamButton));
    		Assert.assertTrue(gamespage.chooseExistingTeamButton.isDisplayed());
    	}
     	
     	@Test(priority=34)
    	public void Test_ExitContest() throws InterruptedException
    	{
     		gamespage.BackButton.click();
     		gamespage.BackButton.click();
     		gamespage.joinFantasyButton1.click();
     		wait.until(ExpectedConditions.elementToBeClickable(gamespage.eventName_inMyTeamsTab));
    		gamespage.indiaContest.click();
    		Assert.assertTrue(gamespage.teamCard1_forTwoTeams.isDisplayed());
    		Assert.assertTrue(gamespage.teamCard2.isDisplayed());
    		gamespage.exitContestButton.click();
    		wait.until(ExpectedConditions.elementToBeClickable(gamespage.eventName_inMyTeamsTab));
    		gamespage.indiaContest.click();
    		Assert.assertTrue(gamespage.chooseExistingTeamButton.isDisplayed());	
    	}
     
     	@Test(priority=35)
     	public void Test_JOINED_Text_forContest() throws InterruptedException
     	{
     		gamespage.BackButton.click();
     		gamespage.BackButton.click();
     		gamespage.joinFantasyButton1.click();
     		wait.until(ExpectedConditions.elementToBeClickable(gamespage.eventName_inMyTeamsTab));
     		gamespage.globalContest.click();//should change it to joined text 
     		wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard1_forTwoTeams));
     		Assert.assertTrue(gamespage.teamCard1_forTwoTeams.isDisplayed());
		}
     	
     	@Test(priority=36)
    	public void Test_ContestButton_on_TeamCard() throws InterruptedException
    	{
     		gamespage.BackButton.click();
    		gamespage.ContestClick_from_TeamCard();
    		wait.until(ExpectedConditions.visibilityOf(gamespage.GlobalContest_Header));
    		Assert.assertTrue(gamespage.GlobalContest_Header.isDisplayed(),"Contest Header in Global Contest");
    		Assert.assertEquals(gamespage.GlobalContest_Header.getText(),gamespage.expGlobalContestTitle.toUpperCase());
    	} 
     	
     	@Test(priority=37)
     	public void Test_EnterContest_Button_on_TeamCard() throws InterruptedException
     	{
     		gamespage.BackButton.click();
     		gamespage.enterContestButton_onTeamCard.click();
     		wait.until(ExpectedConditions.visibilityOf(gamespage.eventName_inMyTeamsTab));
     		Assert.assertTrue(gamespage.public_Contests_text.isDisplayed(),"public contests text in the contest page");	
		}
	
    	@Test(priority=38)
    	public void Test_InviteFriends_Share_in_Contests() throws InterruptedException
    	{ 
    		gamespage.Contest_Share_InviteFriends();
    		Assert.assertTrue(gamespage.GlobalContest_Header.isDisplayed());
    		
    	}
     	
	
     	@Test(priority=39)
    	public void Test_eventHeader_inMyTeamsTab() throws InterruptedException
    	{
     		gamespage.BackButton.click();
     		gamespage.BackButton.click();
    		EventName = gamespage.eventName_onEventBanner.getText();
    		gamespage.joinFantasyButton1.click();
    		Assert.assertTrue(gamespage.eventName_inMyTeamsTab.isDisplayed());
    		Assert.assertEquals(gamespage.eventName_inMyTeamsTab.getText(),EventName.toUpperCase());
    	}
    	
    	@Test(priority=40)
    	public void Test_ViewDetailsButton_onFantasyCard() throws InterruptedException
    	{
    		gamespage.BackButton.click();
    		wait.until(ExpectedConditions.visibilityOf(gamespage.joinFantasyButton1));
    		gamespage.viewDetailsButton.click();
    		Assert.assertEquals(gamespage.eventName_inEventDetailsPage.getText(),EventName.toUpperCase());
    	}
    	@Test(priority=41)
    	public void Verify_AthleteSelectionPageHeader_Step1of3() throws InterruptedException
    	{
    		gamespage.BackButton.click();
    		wait.until(ExpectedConditions.visibilityOf(gamespage.joinFantasyButton1));
    		gamespage.joinFantasyButton1.click();
    		gamespage.myteamsTab_AterCreating_2teams.click();
    		wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard1));
    		gamespage.createTeamButton_inMyTeamsTab.click();
    		wait.until(ExpectedConditions.visibilityOf(gamespage.redAthlete1));
    		Assert.assertTrue(gamespage.pageHeader_step1of3.isDisplayed(),gamespage.expStep1HeaderInTeamCreation);
    		Assert.assertEquals(gamespage.pageHeader_step1of3.getText(),gamespage.expStep1HeaderInTeamCreation);
    		Assert.assertTrue(gamespage.creditsLeft_Text.isDisplayed(),gamespage.expCreditsLeftTxtMsg);
    		Assert.assertEquals(gamespage.creditsLeft_Text.getText(),gamespage.expCreditsLeftTxtMsg);
    		
    	}
	
	@Test(priority=42)
	public void Verify_MainCardHeader() throws InterruptedException
	{
		Assert.assertTrue(gamespage.MainCard_header_forBoutCards.isDisplayed());
		Assert.assertEquals(gamespage.MainCard_header_forBoutCards.getText(),gamespage.expMainCardTitle);
	}
	
	@Test(priority=43)
	public void Verify_RoundSelectionPopup_withOnClickofSelectButton() throws InterruptedException
	{
		gamespage.redAthlete1.click();
		Assert.assertTrue(gamespage.yourWinScoreText_onRoundSelection_popup.isDisplayed(),"Win score Text in Round selection");
		Assert.assertTrue(gamespage.predictWinningRoundText_onRoundSelection_popup.isDisplayed(),"Predict round Text in round selection");
		gamespage.round_done.click();
	}
	
	@Test(priority=44)
	public void tapToCompareButton() throws InterruptedException
	{
		gamespage.tapToCompareButton.click();
		Assert.assertTrue(gamespage.compareStatsPageHeader.isDisplayed());
		Assert.assertEquals(gamespage.compareStatsPageHeader.getText(),gamespage.expCompareStatsPageHeader);
	}

	@Test(priority=45)
	public void Test_DragAndDropPageHeader_Step2of3() throws InterruptedException
	{
		gamespage.BackButton.click();
		gamespage.BackButton.click();
		wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard1));
		gamespage.createTeamButton_inMyTeamsTab.click();
		gamespage.Athlete_Selection();
		gamespage.next.click();
		Assert.assertTrue(gamespage.pageHeader_step2of3.isDisplayed(),gamespage.expStep2HeaderInTeamCreation);
		Assert.assertEquals(gamespage.pageHeader_step2of3.getText(),gamespage.expStep2HeaderInTeamCreation);
		Assert.assertTrue(gamespage.creditsLeft_Text.isDisplayed(),gamespage.expCreditsLeftTxtMsg);
		Assert.assertEquals(gamespage.creditsLeft_Text.getText(),gamespage.expCreditsLeftTxtMsg);
	}
	
	@Test(priority=46)
	public void Test_EditAthletesButton_inDragAndDropPage() throws InterruptedException
	{
		Assert.assertTrue(gamespage.editAthletesButton_in_DragAndDrop_Page.isDisplayed(),gamespage.expEditAthletesButtonTitle);
		Assert.assertEquals(gamespage.editAthletesButton_in_DragAndDrop_Page.getText(),gamespage.expEditAthletesButtonTitle);
		gamespage.editAthletesButton_in_DragAndDrop_Page.click();
		Assert.assertTrue(gamespage.pageHeader_step1of3.isDisplayed(),gamespage.expStep1HeaderInTeamCreation);
		Assert.assertEquals(gamespage.pageHeader_step1of3.getText(),gamespage.expStep1HeaderInTeamCreation);
		gamespage.next.click();
		
	}
	
	@Test(priority=47)
	public void Test_PageHeader_Step3of3() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(gamespage.done));
		gamespage.done.click();
		Assert.assertTrue(gamespage.pageHeader_step3of3.isDisplayed());
		Assert.assertEquals(gamespage.pageHeader_step3of3.getText(),gamespage.expStep3HeaderInTeamCreation);	
	}
	
	@Test(priority=48)
	public void Test_TeamNameErrorMessage_TeamName_As_Less_Than_5Char_Step3of3() throws InterruptedException, IOException
	{
		gamespage.teamname.click();
		gamespage.teamname.sendKeys(Files.readAllLines(Paths.get(constants.getTestData_teamNames())).get(0));
		Assert.assertTrue(gamespage.errorMessage_1_For_TeamName_Fieldin_Step_3_of_3_Page.isDisplayed());
		Assert.assertEquals(gamespage.errorMessage_1_For_TeamName_Fieldin_Step_3_of_3_Page.getText(),gamespage.expTeamNameErrorMsgforLessThan5Chars);			
	}
	
	@Test(priority=49)
	public void Test_TeamNameErrorMessage_Special_Char_inTeamName_Step3of3() throws InterruptedException, IOException
	{
		gamespage.teamname.click();
		gamespage.teamname.clear();
		gamespage.teamname.sendKeys(Files.readAllLines(Paths.get(constants.getTestData_teamNames())).get(1));
		Assert.assertTrue(gamespage.errorMessage_2_For_TeamName_Fieldin_Step_3_of_3_Page.isDisplayed());
		Assert.assertEquals(gamespage.errorMessage_2_For_TeamName_Fieldin_Step_3_of_3_Page.getText(),gamespage.expTeamNameErrorMsgforSpecialChars);
		gamespage.teamname.click();
		gamespage.teamname.clear();
		gamespage.teamname.sendKeys("Team"+RandomStringUtils.randomNumeric(2));	
		gamespage.saveTeam.click();
	}
	
	@Test(priority=50)
	public void Test_RemoveAthletes_FromTeam() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard1));
		gamespage.BackButton.click();
		gamespage.joinFantasyButton2.click();
		gamespage.myteamsTab_AterCreating_1team.click();
		wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard1));
		char AthleteCount=gamespage.teamDetails_toCheckMaxScore.getText().charAt(11);
		iOS_Utilities.scrollRight_toElement(gamespage.athleteCard1_onTeamCard);
		wait.until(ExpectedConditions.visibilityOf(gamespage.athleteCard7_onTeamCard));
		Assert.assertTrue(gamespage.athleteCard7_onTeamCard.isDisplayed(),"Athlete Card 7");
		Assert.assertTrue(gamespage.athleteCard8_onTeamCard.isDisplayed(),"Athlete Card 8 ");
		gamespage.RemoveAthletes();
		wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard1));
		Assert.assertTrue(gamespage.teamDetails_toCheckMaxScore.getText().charAt(11)==AthleteCount-2,"Athlete count");
	}
	
	@Test(priority=51)
	public void Test_AddAthletes_ToTeam() throws InterruptedException
	{
		char AthleteCount=gamespage.teamDetails_toCheckMaxScore.getText().charAt(11);
		gamespage.AddAthletes();
		wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard1));
		iOS_Utilities.scrollRight_toElement(gamespage.athleteCard1_onTeamCard);
		Assert.assertTrue(gamespage.athleteCard7_onTeamCard.isDisplayed(),"Athlete Card 7");
		Assert.assertTrue(gamespage.teamDetails_toCheckMaxScore.getText().charAt(11)==AthleteCount+1,"Athlete count");
	}
	
	/*@Test(priority=52)
	public void Test_ConsentForm_GmailUser() throws InterruptedException, IOException
	{
		gamespage.BackButton.click();
		gamespage.Logout();
		profilepage.newGmailLogin();
		gamespage.ConsentForm();
		wait.until(ExpectedConditions.visibilityOf(gamespage.consentFormHeader));
		Assert.assertTrue(gamespage.consentFormHeader.isDisplayed(),gamespage.expConsentFormHeader);
		Assert.assertEquals(gamespage.consentFormHeader.getText(),gamespage.expConsentFormHeader);
		gamespage.ConfirmButton_inConsentForm.click();
		wait.until(ExpectedConditions.visibilityOf(gamespage.teamCard1));
		Assert.assertTrue(gamespage.teamCard1.isDisplayed(),"TeamCard");	
	}*/
	
	@Test(priority=53)
	public void Test_BoutsTab() throws InterruptedException, IOException
	{
		gamespage.boutsTab.click();
		iOS_Utilities.scrollDown();
		iOS_Utilities.scrollUp();
		gamespage.redAthlete1_FollowButton_BoutsTab.click();
		gamespage.blueAthlete2_FollowButton_BoutsTab.click();
		Assert.assertTrue(gamespage.unFollowButton1_BoutsTab.isDisplayed(),gamespage.expUnfollowButtonTitle);
		Assert.assertEquals(gamespage.unFollowButton1_BoutsTab.getText(),gamespage.expUnfollowButtonTitle);
		Assert.assertTrue(gamespage.unFollowButton2_BoutsTab.isDisplayed(),gamespage.expUnfollowButtonTitle);
		Assert.assertEquals(gamespage.unFollowButton2_BoutsTab.getText(),gamespage.expUnfollowButtonTitle);
		Assert.assertTrue(gamespage.mainCardHeader_BoutsTab.isDisplayed(),"Main Crad Header ");
	}
	
	@Test(priority=54)
	public void Test_EventCard_inPastTab() throws InterruptedException
	{
		gamespage.BackButton.click();
		gamespage.pastTabHeader.click();
		Assert.assertTrue(gamespage.eventTitle_on_EventCard_inPastTab.isDisplayed(),"event title");
		Assert.assertTrue(gamespage.Rank1_on_EventCard_inPastTab.isDisplayed(),gamespage.expRank1TxtinPastEventCard);
		Assert.assertEquals(gamespage.Rank1_on_EventCard_inPastTab.getText(),gamespage.expRank1TxtinPastEventCard);
		Assert.assertTrue(gamespage.Rank1Profile_on_EventCard_inPastTab.isDisplayed(),"Rank 1 profile");
		Assert.assertTrue(gamespage.Rank1UserName_on_EventCard_inPastTab.isDisplayed(),"Rank1 username");
		Assert.assertTrue(gamespage.viewLeaderBoardButton_on_EventCard_inPastTab.isDisplayed(),"LeaderBoard Button");
		Assert.assertEquals(gamespage.viewLeaderBoardButton_on_EventCard_inPastTab.getText(),gamespage.expViewLeaderBoardButtonTitle);			
	}
	
	@Test(priority=55)
	public void Test_ViewLeaderBoardButton_inPastTab() throws InterruptedException
	{
		gamespage.Logout();
		gamespage.gamesPage.click();
		gamespage.pastTabHeader.click();
		String EventName=gamespage.eventTitle_on_EventCard_inPastTab.getText(); 
		gamespage.viewLeaderBoardButton_on_EventCard_inPastTab.click();
		Assert.assertTrue(gamespage.eventTitle_in_LeaderBoardPage.isDisplayed(),"Event title in the leader Board Page");
		Assert.assertEquals(gamespage.eventTitle_in_LeaderBoardPage.getText(),EventName.toUpperCase());
		Assert.assertTrue(gamespage.gmailSignin_in_LeaderBoardPage.isDisplayed(),"Gmail sign in Leader Board Page");
		Assert.assertTrue(gamespage.FBSignin_in_LeaderBoardPage.isDisplayed(),"FB Sign in leader Board Page");
		Assert.assertTrue(gamespage.AppleSignin_in_LeaderBoardPage.isDisplayed(),"Apple Sign in leader Board Page");
	}
	@Test(priority=56)
	public void Test_GmailSignin_inLeaderBoardPage() throws InterruptedException
	{
		gamespage.gmailSignin_in_LeaderBoardPage.click();
		gamespage.Continue_signin.click();
		gamespage.emailid2.click();
		wait.until(ExpectedConditions.visibilityOf(gamespage.pointsText_in_LeaderBoardPage));
		Assert.assertTrue(gamespage.pointsText_in_LeaderBoardPage.isDisplayed(),gamespage.expPointsTxtinLeaderBoardPage);
		
	}
	
	@Test(priority=57)
	public void Test_FBSignin_inLeaderBoardPage() throws InterruptedException
	{
		gamespage.BackButton.click();
		gamespage.Logout();
		gamespage.viewLeaderBoardClick();
		gamespage.FBSignin_in_LeaderBoardPage.click();
		gamespage.Continue_signin.click();
		gamespage.Continue_signin.click();
		wait.until(ExpectedConditions.visibilityOf(gamespage.pointsText_in_LeaderBoardPage));
		Assert.assertTrue(gamespage.pointsText_in_LeaderBoardPage.isDisplayed(),gamespage.expPointsTxtinLeaderBoardPage);
	}
	
	@Test(priority=58)
	public void Test_Rank_Teams_Rewards_Points_Text_inLeaderBoardPage() throws InterruptedException
	{
		Assert.assertTrue(gamespage.rewardsText_in_LeaderBoardPage.isDisplayed(),gamespage.expRewardsTxtinLeaderBoardPage);
		Assert.assertEquals(gamespage.rewardsText_in_LeaderBoardPage.getText(),gamespage.expRewardsTxtinLeaderBoardPage);
		Assert.assertTrue(gamespage.pointsText_in_LeaderBoardPage.isDisplayed(),gamespage.expPointsTxtinLeaderBoardPage);
		Assert.assertEquals(gamespage.pointsText_in_LeaderBoardPage.getText(),gamespage.expPointsTxtinLeaderBoardPage);
	}
	
	@Test(priority=59)
	public void Test_Rank_ContestHeader_inLeaderBoardPage() throws InterruptedException
	{
		
		if(gamespage.ContestHeader.isDisplayed())
		{
			Assert.assertTrue(gamespage.dropDownButton_in_LeaderBoardPage.isDisplayed(),"The DropDown button in leader board Page");
			gamespage.dropDownButton_in_LeaderBoardPage.click();
			gamespage.contestSelectiion_in_LeaderBoardPage.click();
			wait.until(ExpectedConditions.visibilityOf(gamespage.pointsText_in_LeaderBoardPage));
			Assert.assertEquals(gamespage.contestHeaderText_in_LeaderBoardPage.getText(),gamespage.expGlobalContestTitle.toUpperCase());
		}
	}
	
	@AfterClass
	public void tearDown() {
		iOSdriver.quit(); 
	}
}