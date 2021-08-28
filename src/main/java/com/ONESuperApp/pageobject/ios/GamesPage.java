package com.ONESuperApp.pageobject.ios;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ONESuperApp.base.AppiumBaseClass;
import com.ONESuperApp.base.iOS_Utilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GamesPage extends AppiumBaseClass{
	
	iOS_Utilities util = new iOS_Utilities();
	public String score;
	public int creditsused;
	public int athletecount=8;
	public int creditscount;
	public String creditsleft;
    public String TeamName;
    int scoreaftershare;
	ProfilePage profilepage = new ProfilePage(iOSdriver);

	
	public GamesPage(IOSDriver<IOSElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	WebDriverWait wait = new WebDriverWait(iOSdriver,20);
 
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Home, tab, 1 of 5\"]")
	public MobileElement landingPage;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Events, tab, 4 of 5\"]")
	public MobileElement gamesPage;
	
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"headerTitle\"]")
    public MobileElement gamesPageHeader;
    
    @FindBy(xpath="//XCUIElementTypeButton[@name=\"Available Now\"]")
    public MobileElement availableNowTabHeader;

    @FindBy(xpath="//XCUIElementTypeButton[@name=\"Past\"]")
    public MobileElement pastTabHeader;
    
    @FindBy(xpath="//XCUIElementTypeOther[@name=\"\"]")
    public MobileElement BackButton;
    
    @FindBy(xpath="//XCUIElementTypeButton[@name=\"My Teams\"]")
	public MobileElement myTeamsTab;
    
    @FindBy(xpath="//XCUIElementTypeButton[@name=\"My Teams (1)\"]")
    public MobileElement myteamsTab_AterCreating_1team;
    
    @FindBy(xpath="//XCUIElementTypeButton[@name=\"My Teams (2)\"]")
    public MobileElement myteamsTab_AterCreating_2teams;
    
    @FindBy(xpath="")
    public MobileElement myteamsTab_AterCreating_3teams;

    @FindBy(xpath="//XCUIElementTypeButton[@name=\"Contests\"]")
   	public MobileElement contestTab;
    
    @FindBy(xpath="//XCUIElementTypeButton[@name=\"Bout Card\"]")
   	public MobileElement boutsTab;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"createTeamButton\"])[1]")
    public MobileElement joinFantasyButton1;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"createTeamButton\"])[2]")
    public MobileElement joinFantasyButton2;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"createTeamButton\"])[3]")
    public MobileElement joinFantasyButton3;

    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"createTeamButton\"])[4]")
    public MobileElement joinFantasyButton4;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"selectAthleteButton\"])[1]")
    public MobileElement redAthlete1;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"selectAthleteButton\"])[2]")
    public MobileElement blueAthlete1;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"selectAthleteButton\"])[3]")
    public MobileElement redAthlete2;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"selectAthleteButton\"])[4]")
    public MobileElement blueAthlete2;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"selectAthleteButton\"])[5]")
    public MobileElement redAthlete3;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"selectAthleteButton\"])[6]")
    public MobileElement blueAthlete3;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"selectAthleteButton\"])[7]")
    public MobileElement redAthlete4;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"selectAthleteButton\"])[8]")
    public MobileElement blueAthlete4;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"selectAthleteButton\"])[9]")
    public MobileElement redAthlete5;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"selectAthleteButton\"])[10]")
    public MobileElement blueAthlete5;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"selectAthleteButton\"])[11]")
    public MobileElement redAthlete6;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"selectAthleteButton\"])[12]")
    public MobileElement blueAthlete6;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"selectAthleteButton\"])[13]")
    public MobileElement redAthlete7;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"selectAthleteButton\"])[14]")
    public MobileElement blueAthlete7;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"selectAthleteButton\"])[15]")
    public MobileElement redAthlete8;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"selectAthleteButton\"])[16]")
    public MobileElement blueAthlete8;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"ROUND 1\"])[2]")
    public MobileElement round1;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"ROUND 2\"])[3]")
    public MobileElement round2;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"ROUND 3\"])[3]")
    public MobileElement round3;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"ROUND 4\"])[3]")
    public MobileElement round4;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"ROUND 5\"])[3]")
    public MobileElement round5;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"DECISION\"])[3]")
    public MobileElement decision;
    
    @FindBy(xpath="//XCUIElementTypeOther[@name=\"DONE\"]")
    public MobileElement round_done;
    
    @FindBy(xpath="//XCUIElementTypeOther[@name=\"saveTeamButton\"]")
    public MobileElement next;
    
    @FindBy(xpath="//XCUIElementTypeOther[@name=\"DONE\"]")
    public MobileElement done;
    
    @FindBy(xpath="//XCUIElementTypeTextField[@name=\"teamNameField\"]")
    public MobileElement teamname;
    
    @FindBy(xpath="//XCUIElementTypeOther[@name=\"saveTeamButton\"]")
    public MobileElement saveTeam;
    
    @FindBy(xpath="//XCUIElementTypeOther[@name=\"teamCard\"]")
    public MobileElement teamCard1;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"teamCard\"])[1]")
    public MobileElement teamCard1_forTwoTeams;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"teamCard\"])[2]")
    public MobileElement teamCard2;
    
    @FindBy(xpath="//XCUIElementTypeOther[@name=\" Sign in with Google\"]")
    public MobileElement Gmail_SigninButton;
    
    @FindBy(xpath="//XCUIElementTypeButton[@name=\"Continue\"]")
    public MobileElement Continue_signin;
    
    @FindBy(xpath="//XCUIElementTypeOther[@name=\"Sign in – Google accounts\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]")
	public MobileElement emailid1;
    
    @FindBy(xpath="//XCUIElementTypeOther[@name=\"Sign in – Google accounts\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]")
   	public MobileElement emailid2;
    
    @FindBy(xpath="//XCUIElementTypeOther[@name=\"Sign in – Google accounts\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther[3]")
   	public MobileElement emailid3;
    
    @FindBy(xpath="//XCUIElementTypeOther[@name=\"Sign in – Google accounts\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther[4]")
   	public MobileElement emailid4;
    
    @FindBy(xpath="//XCUIElementTypeOther[@name=\" Sign in with Facebook\"]")
    public MobileElement FB_Signin_Button;
 
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"teamName\"]")
   	public MobileElement team1Name_on_TeamCard;
    
    @FindBy(xpath="(//XCUIElementTypeStaticText[@name=\"teamName\"])[2]")
   	public MobileElement team2Name_on_TeamCard;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"Global Contest\"])[2]")
   	public MobileElement globalContest_Button_onTeamCard;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"Global Contest\"])[5]")
   	public MobileElement globalContest_Button_onTeamCard2;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"Asia Contest\"])[2]")
   	public MobileElement asiaContest_Button_onTeamCard;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"India Contest\"])[2]")
   	public MobileElement indiaContest_Button_onTeamCard;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"publicContestCard\"])[2]")
    public MobileElement globalContest;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"publicContestCard\"])[3]")
    public MobileElement asiaContest;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"publicContestCard\"])[1]")
    public MobileElement indiaContest;
    
    @FindBy(xpath="//XCUIElementTypeOther[@name=\"createTeam\"]")
    public MobileElement createTeamButton_in_ContestPage;
    
    @FindBy(xpath="//XCUIElementTypeOther[@name=\"EXIT CONTEST\"]")
    public MobileElement exitContestButton;
    
    @FindBy(xpath="//XCUIElementTypeOther[@name=\"CHOOSE AN EXISTING TEAM\"]")
    public MobileElement chooseExistingTeamButton;
    
    @FindBy(xpath="//XCUIElementTypeOther[@name=\"ADD ANOTHER TEAM\"]")
    public MobileElement addAnotherTeam_Button;
    
    @FindBy(xpath="//XCUIElementTypeOther[@name=\"WITHDRAW\"]")
    public MobileElement withdrawButton_inContest;
    
    @FindBy(xpath="//XCUIElementTypeOther[@name=\"selectButton\"]")
    public MobileElement selectTeam_Button_in_TeamSelectionPage;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"selectButton\"])[1]")
    public MobileElement selectTeam1_Button_in_TeamSelectionPage;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"selectButton\"])[2]")
    public MobileElement selectTeam2_Button_in_TeamSelectionPage;
   
    @FindBy(xpath="//XCUIElementTypeOther[@name=\"doneButton\"]")
    public MobileElement doneButton_onSelectTeamPage;
    
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Public Contests\"]")
    public MobileElement public_Contests_text;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"CREATE TEAM\"])[2]")
    public MobileElement createTeamButton_inMyTeamsTab;
    
    @FindBy(xpath="//XCUIElementTypeOther[@name=\"editButton\"]")
    public MobileElement editButton_onTeamCard1;
    
    @FindBy(xpath="//XCUIElementTypeOther[@name=\"joinButton\"]")
    public MobileElement JOIN_Button_onContest;
    
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"joinedLabel\"]")
    public MobileElement JOINED_Button_onContest;
    
    @FindBy(xpath="//XCUIElementTypeOther[@name=\"ENTER CONTESTS\"]")
    public MobileElement enterContestButton_onTeamCard;
    
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"headerTitle\"]")
    public MobileElement GlobalContest_Header;
    
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"STEP 1 of 3\"]")
    public MobileElement pageHeader_step1of3;
    
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"CREDITS LEFT\"]")
    public MobileElement creditsLeft_Text;
    
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"STEP 2 of 3\"]")
    public MobileElement pageHeader_step2of3;
    
    @FindBy(xpath="//XCUIElementTypeOther[@name=\"EDIT ATHLETES\"]")
    public MobileElement editAthletesButton_in_DragAndDrop_Page;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"athleteCard\"])[1]")
    public MobileElement athleteCard1_in_DragAndDrop_Page;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"athleteCard\"])[2]")
    public MobileElement athleteCard2_in_DragAndDrop_Page;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"athleteCard\"])[3]")
    public MobileElement athleteCard3_in_DragAndDrop_Page;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"athleteCard\"])[4]")
    public MobileElement athleteCard4_in_DragAndDrop_Page;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"athleteCard\"])[5]")
    public MobileElement athleteCard5_in_DragAndDrop_Page;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"athleteName\"])[1]")
    public MobileElement athleteName_onAthleteCard1_in_DragAndDrop_Page;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"athleteName\"])[3]")
    public MobileElement athleteName_onAthleteCard3_in_DragAndDrop_Page;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"MAIN CARD\"])[3]")
    public MobileElement MainCard_header_forBoutCards;
    
    @FindBy(xpath="(//XCUIElementTypeStaticText[@name=\"TAP TO COMPARE\"])[1]")
    public MobileElement tapToCompareButton;
    
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"headerTitle\"]")
    public MobileElement compareStatsPageHeader;
    
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\" YOUR WIN SCORE!\"]")
    public MobileElement yourWinScoreText_onRoundSelection_popup;
    
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"PREDICT THE WINNING ROUND\"]")
    public MobileElement predictWinningRoundText_onRoundSelection_popup;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"VIEW DETAILS\"])[1]")
    public MobileElement viewDetailsButton;
    
    @FindBy(xpath="(//XCUIElementTypeStaticText[@name=\"eventTitle\"])[1]")
    public MobileElement eventName_onEventBanner;
    
    @FindBy(xpath="(//XCUIElementTypeStaticText[@name=\"eventDateAndVenue\"])[1]")
    public MobileElement dateAndtime_onEventBanner;
    
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"headerTitle\"]")
    public MobileElement eventName_inMyTeamsTab;
    
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"headerTitle\"]")
    public MobileElement eventName_inEventDetailsPage;
    
    @FindBy(xpath="(//XCUIElementTypeStaticText[@name=\"CHANGE\"])[1]")
    public MobileElement changeButtonOnAthleteCard1_in_DragAndDrop_Page;
    
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"STEP 3 of 3\"]")
    public MobileElement pageHeader_step3of3;
    
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Name should be min. 5 characters.\"]")
    public MobileElement errorMessage_1_For_TeamName_Fieldin_Step_3_of_3_Page;
  
    @FindBy(xpath="//XCUIElementTypeOther[@name=\"saveTeamContainer\"]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]")
    public MobileElement errorMessage_2_For_TeamName_Fieldin_Step_3_of_3_Page;
    
    @FindBy(xpath="(//XCUIElementTypeStaticText[@name=\"eventTitle\"])[1]")
    public MobileElement eventTitle_on_EventCard_inPastTab;
    
    @FindBy(xpath="(//XCUIElementTypeStaticText[@name=\"userRank\"])[1]")
    public MobileElement Rank1_on_EventCard_inPastTab;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"userProfilePic\"])[1]")
    public MobileElement Rank1Profile_on_EventCard_inPastTab;
    
    @FindBy(xpath="(//XCUIElementTypeStaticText[@name=\"userName\"])[1]")
    public MobileElement Rank1UserName_on_EventCard_inPastTab;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"viewLeaderboard\"])[1]")
    public MobileElement viewLeaderBoardButton_on_EventCard_inPastTab;
    
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"headerTitle\"]")
    public MobileElement eventTitle_in_LeaderBoardPage;
    
    @FindBy(xpath="//XCUIElementTypeOther[@name=\" Sign in with Google\"]")
    public MobileElement gmailSignin_in_LeaderBoardPage;
    
    @FindBy(xpath="//XCUIElementTypeOther[@name=\" Sign in with Facebook\"]")
    public MobileElement FBSignin_in_LeaderBoardPage;
   
    @FindBy(xpath="//XCUIElementTypeButton[@name=\"Sign in with Apple\"]")
    public MobileElement AppleSignin_in_LeaderBoardPage;
    
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"RANK TEAMS\"]")
    public MobileElement rank_TeamsText_in_LeaderBoardPage;
    
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"REWARDS\"]")
    public MobileElement rewardsText_in_LeaderBoardPage;
    
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"POINTS\"]")
    public MobileElement pointsText_in_LeaderBoardPage;
   
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"\"])[1]")
    public MobileElement ContestHeader;
    
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"\"]")
    public MobileElement dropDownButton_in_LeaderBoardPage;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"\"])[4]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    public MobileElement contestHeaderText_in_LeaderBoardPage;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"GLOBAL CONTEST\"])[1]")
    public MobileElement contestSelectiion_in_LeaderBoardPage;
    
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"WIN 50 EXTRA POINTS\"]")
    public MobileElement shareText_onTeamCard_BeforeSharing;
    
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"SHARE\"]")
    public MobileElement shareText_onTeamCard_afterSharing;
    
    @FindBy(xpath="//XCUIElementTypeOther[@name=\"shareButton\"]")
    public MobileElement shareButton_onTeamCard;
    
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Share \"]")
    public MobileElement shareButton_inFantasyPopup;
    
    @FindBy(xpath="//XCUIElementTypeButton[@name=\"Copy\"]")
    public MobileElement copyButton_inDevice_ShareOptions;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"Congratulations You earned extra 50 points\"])")
    public MobileElement share_FiftyPoints_ToastMessage;
    
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"teamDetails\"]")
    public MobileElement teamDetails_toCheckMaxScore;
    
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"maxPossibleScore\"]")
    public MobileElement maxPossibleScore;
    
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"creditsLeft\"]")
    public MobileElement creditsLeft_forUser;
    
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"INVITE FRIENDS\"]")
    public MobileElement invite_FriendsButton_inContestPage;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"athleteCard\"])[1]")
    public MobileElement athleteCard1_onTeamCard;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"athleteCard\"])[7]")
    public MobileElement athleteCard7_onTeamCard;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"athleteCard\"])[8]")
    public MobileElement athleteCard8_onTeamCard;
    
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"PLEASE CONFIRM YOUR DETAILS\"]")
    public MobileElement consentFormHeader;
    
    @FindBy(xpath="//XCUIElementTypeOther[@name=\"Confirm & Proceed\"]")
    public MobileElement ConfirmButton_inConsentForm;
    
    @FindBy(xpath="(//XCUIElementTypeStaticText[@name=\"rankValue\"])[1]")
    public MobileElement rank1;
    
    @FindBy(xpath="(//XCUIElementTypeStaticText[@name=\"rankValue\"])[3]")
    public MobileElement rank3;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"FOLLOW\"])[1]")
    public MobileElement redAthlete1_FollowButton_BoutsTab;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"FOLLOW\"])[3]")
    public MobileElement blueAthlete2_FollowButton_BoutsTab;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"UNFOLLOW\"])[1]")
    public MobileElement unFollowButton1_BoutsTab;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"UNFOLLOW\"])[2]")
    public MobileElement unFollowButton2_BoutsTab;
    
    @FindBy(xpath="(//XCUIElementTypeOther[@name=\"MAIN CARD\"])[1]")
    public MobileElement mainCardHeader_BoutsTab;
    
  //The headers and Tab titles
  	public String expGamesPageHeader="GAMES";
  	public String expAvailableNowTabHeader="Available Now";
  	public String expPastTabHeader="Past";
  	public String expMyTeamsTabHeader="My Teams";
  	public String expBoutsTabHeader="Bout Card";
  	public String expContestTabHeader="Contests";
  	public String expViewDetailsButtonTitle="VIEW DETAILS";
  	public String expJoinFantasyButtonTitle="JOIN FANTASY";
  	public String expEditEntriesButtonTitle="EDIT ENTRIES";
  	public String expGlobalContestTitle="Global Contest";
  	public String expIndiaContestTitle="India Contest";
  	public String expShareTextonTeamCardBeforeShare="WIN 50 EXTRA POINTS";
  	public String expShareTextonTeamCardAfterShare="SHARE";
  	public String expToastMsgAfterShare50Points="Congratulations You earned extra 50 points";
  	public String toastMsg="Toast message";
  	public String expTeamDetailsTextonTeamCard="Athletes:  "+athletecount+"  |  Credits Used: "+creditsused+"/100  |  Max Possible Score: "+scoreaftershare;
  	public String expJoinButtonTitle="JOIN";
  	public String expJoinedTxtMsg="JOINED";
  	public String expStep1HeaderInTeamCreation="STEP 1 of 3";
  	public String expStep2HeaderInTeamCreation="STEP 2 of 3";
  	public String expStep3HeaderInTeamCreation="STEP 3 of 3";
  	public String expCreditsLeftTxtMsg="CREDITS LEFT";
  	public String expMainCardTitle="MAIN CARD";	
  	public String expCompareStatsPageHeader="COMPARE STATS";
  	public String expEditAthletesButtonTitle="EDIT ATHLETES";
  	public String expConsentFormHeader="PLEASE CONFIRM YOUR DETAILS";
  	public String expUnfollowButtonTitle="UNFOLLOW";
  	public String expTeamNameErrorMsgforLessThan5Chars="Name should be min. 5 characters.";
  	public String expTeamNameErrorMsgforSpecialChars="You may use alphabets, numbers along with spaces, \".\", \"-\" and \"_\"";
  	public String expRank1TxtinPastEventCard="RANK 1";
  	public String expViewLeaderBoardButtonTitle="VIEW LEADERBOARD";
  	public String expRanksTeamsTxtinLeaderBoardPage="RANK TEAMS";
  	public String expRewardsTxtinLeaderBoardPage="REWARDS";
  	public String expPointsTxtinLeaderBoardPage="POINTS";
    
    public void Round1_Selection()
	{
		round1.click();
		round_done.click();
	}
    
    public void Round2_Selection()
	{
		round2.click();
		round_done.click();
	}
    
    public void Round3_Selection()
	{
		round3.click();
		round_done.click();
	}
    
    public void Round4_Selection()
	{
		round4.click();
		round_done.click();
	}
    
    public void Round5_Selection()
	{
		round5.click();
		round_done.click();
	}
    
    public void Decision_Selection()
	{
		decision.click();
		round_done.click();
	}
    
    public void Athlete_Selection() throws InterruptedException {
    	
    	redAthlete1.click();
    	Round1_Selection();
    	blueAthlete2.click();
    	Round3_Selection();
    	redAthlete3.click();
    	Round2_Selection();
        blueAthlete4.click();
        Decision_Selection();
        redAthlete5.click();
        Round3_Selection();
        blueAthlete6.click();
        Round1_Selection();
        redAthlete7.click();
        Round2_Selection();
        blueAthlete8.click();
        Round3_Selection();
    	 	
    }
 
  	public void Teamcreation_GmailUser_LoggedInVia_Fantasy() throws InterruptedException
  	{
  		joinFantasyButton1.click();
  		Athlete_Selection();
  		next.click();
  		done.click();
  		teamname.click();
  		TeamName="Team"+RandomStringUtils.randomNumeric(2);
  		teamname.sendKeys(TeamName);
  		saveTeam.click();
  		Gmail_SigninButton.click();
  		Continue_signin.click();
  		emailid1.click();
  	}
  	
  	public void Teamcreation_FbUser_LoggedInVia_Fantasy() throws InterruptedException
  	{
  		gamesPage.click();
  		joinFantasyButton1.click();
  		Athlete_Selection();
  		next.click();
  		done.click();
  		teamname.click();
  		TeamName="Team"+RandomStringUtils.randomNumeric(2);
  		teamname.sendKeys(TeamName);
  		saveTeam.click();
  		FB_Signin_Button.click();
  		Continue_signin.click();
  		wait.until(ExpectedConditions.visibilityOf(Continue_signin));
  		Continue_signin.click();
  	}
  	
  	public void Teamcreation_GmailUser_LoggedInVia_ProfilePage() throws InterruptedException
	{
		profilepage.Gmail_Login();
		emailid2.click();
		wait.until(ExpectedConditions.elementToBeClickable(BackButton));
		BackButton.click();
		gamesPage.click();
		joinFantasyButton1.click();
		Athlete_Selection();
		next.click();
        done.click();
		teamname.click();
		TeamName= "Team"+RandomStringUtils.randomNumeric(2);
		teamname.sendKeys(TeamName);
		saveTeam.click();	
	}
    
	
  	public void Teamcreation_FbUser_LoggedInVia_ProfilePage() throws InterruptedException
	{
		profilepage.FB_Login();
		wait.until(ExpectedConditions.elementToBeClickable(BackButton));
		BackButton.click();
		gamesPage.click();
		joinFantasyButton2.click();
		Athlete_Selection();
		next.click();
        done.click();
		teamname.click();
		TeamName= "Team"+RandomStringUtils.randomNumeric(2);
		teamname.sendKeys(TeamName);
		saveTeam.click();	
	}
  	
  	public void TeamCreationFromContestPage_GmailUser_LoggedInVia_ContestPage() throws InterruptedException
	{
  		gamesPage.click();
  		joinFantasyButton1.click();
  		wait.until(ExpectedConditions.visibilityOf(redAthlete1));
		BackButton.click();
		contestTab.click();
		indiaContest.click();
		Gmail_SigninButton.click();
  		Continue_signin.click();
  		emailid3.click();
  		wait.until(ExpectedConditions.visibilityOf(createTeamButton_in_ContestPage));
  		createTeamButton_in_ContestPage.click();
		Athlete_Selection();
		next.click();
        done.click();
		teamname.click();
		TeamName= "Team"+RandomStringUtils.randomNumeric(2);
		teamname.sendKeys(TeamName);
		saveTeam.click();
		
	}
  	public void TeamCreationFromContestPage_FbUser_LoggedInVia_ContestPage() throws InterruptedException
	{

		gamesPage.click();
		joinFantasyButton3.click();
		wait.until(ExpectedConditions.visibilityOf(redAthlete1));
		BackButton.click();
		contestTab.click();
		indiaContest.click();
		FB_Signin_Button.click();
  		Continue_signin.click();
  		Continue_signin.click();
  		wait.until(ExpectedConditions.visibilityOf(createTeamButton_in_ContestPage));
  		createTeamButton_in_ContestPage.click();
		Athlete_Selection();
		next.click();
        done.click();
		teamname.click();
		TeamName= "Team"+RandomStringUtils.randomNumeric(2);
		teamname.sendKeys(TeamName);
		saveTeam.click();
		
	}
  	
  	public void TeamCreationFromContestPage_GmailUser_LoggedInVia_ProfilePage() throws InterruptedException
	{
  		profilepage.Gmail_Login();
	    emailid4.click();
	    wait.until(ExpectedConditions.elementToBeClickable(BackButton));
		BackButton.click();
		gamesPage.click();
		joinFantasyButton1.click();
		wait.until(ExpectedConditions.visibilityOf(redAthlete1));
		BackButton.click();
		contestTab.click();
		indiaContest.click();
		createTeamButton_in_ContestPage.click();
		Athlete_Selection();
		next.click();
        done.click();
		teamname.click();
		TeamName= "Team"+RandomStringUtils.randomNumeric(2);
		teamname.sendKeys(TeamName);
		saveTeam.click();
	
	}
  	
  	
  	public void TeamCreationFromContestPage_FbUser_LoggedInVia_ProfilePage() throws InterruptedException
	{
  		profilepage.FB_Login();
  		wait.until(ExpectedConditions.elementToBeClickable(BackButton));
		BackButton.click();
		gamesPage.click();
		joinFantasyButton4.click();
		wait.until(ExpectedConditions.visibilityOf(redAthlete1));
		BackButton.click();
		contestTab.click();
		indiaContest.click();
		createTeamButton_in_ContestPage.click();
		Athlete_Selection();
		next.click();
		creditsleft=creditsLeft_forUser.getText();
		score=maxPossibleScore.getText();
		creditscount=Integer.parseInt(creditsleft);
		creditsused=100-creditscount;
        done.click();
		teamname.click();
		TeamName= "Team"+RandomStringUtils.randomNumeric(2);
		teamname.sendKeys(TeamName);
		saveTeam.click();
		
	}
 

    public void addTeam() throws InterruptedException
    {
    	joinFantasyButton1.click();
        indiaContest.click();
    	chooseExistingTeamButton.click();
    	selectTeam_Button_in_TeamSelectionPage.click();
    	doneButton_onSelectTeamPage.click();
    }
    
    public void edit_TeamName() throws InterruptedException
    {
		myteamsTab_AterCreating_2teams.click();
		wait.until(ExpectedConditions.visibilityOf(teamCard1));
		editButton_onTeamCard1.click();
		next.click();
		done.click();
		teamname.click();
		teamname.clear();
		TeamName= "TeamEdit"+RandomStringUtils.randomNumeric(2);
		teamname.sendKeys(TeamName);
		saveTeam.click();		
    }
    
    public void Add_another_Team() throws InterruptedException
	{
		contestTab.click();
		indiaContest.click();
		wait.until(ExpectedConditions.elementToBeClickable(chooseExistingTeamButton));
		chooseExistingTeamButton.click();
		selectTeam1_Button_in_TeamSelectionPage.click();
		doneButton_onSelectTeamPage.click();
		wait.until(ExpectedConditions.elementToBeClickable(addAnotherTeam_Button));
		addAnotherTeam_Button.click();
		selectTeam_Button_in_TeamSelectionPage.click();
		doneButton_onSelectTeamPage.click();
	}
    
    public void Logout() throws InterruptedException
    {
    	landingPage.click();
    	profilepage.Logout();
    	
    }
    
    public void createTeam_via_Myteams_Tab() throws InterruptedException
    {
		createTeamButton_inMyTeamsTab.click();
		Athlete_Selection();
		next.click();
		done.click();
		teamname.click();
		TeamName= "Team"+RandomStringUtils.randomNumeric(2);
		teamname.sendKeys(TeamName);
		saveTeam.click();	
    }
    
    public void share() throws InterruptedException
	  {	
    	int scorebeforeshare = Integer.parseInt(score);
		scoreaftershare=scorebeforeshare+50;
		wait.until(ExpectedConditions.visibilityOf(shareButton_inFantasyPopup));
		shareButton_inFantasyPopup.click();
		wait.until(ExpectedConditions.elementToBeClickable(copyButton_inDevice_ShareOptions));
		copyButton_inDevice_ShareOptions.click();
			
	  }
    
    public void Contest_Share_InviteFriends() throws InterruptedException
	{
		globalContest.click();
		invite_FriendsButton_inContestPage.click();
		copyButton_inDevice_ShareOptions.click();	
	}
    
    public void ContestClick_from_TeamCard() 
    {
    	myteamsTab_AterCreating_2teams.click();
    	wait.until(ExpectedConditions.visibilityOf(teamCard1_forTwoTeams));
    	globalContest_Button_onTeamCard.click();
    }
    
    public void ViewDetailButtonClick() throws InterruptedException
    {
    	profilepage.FB_Login();
		BackButton.click();
		gamesPage.click();
    }
  
    public void AddAthletes()
    {
    	editButton_onTeamCard1.click();
    	redAthlete1.click();
    	Round2_Selection();
    	next.click();
    	done.click();
    	saveTeam.click();
    }
    
    public void RemoveAthletes()
    {
    	editButton_onTeamCard1.click();
    	redAthlete1.click();
    	blueAthlete2.click();
    	next.click();
    	done.click();
    	saveTeam.click();
    }
    
    public void ConsentForm() throws InterruptedException
    {
    	gamesPage.click();
    	joinFantasyButton1.click();
    	Athlete_Selection();
    	next.click();
    	done.click();
    	teamname.click();
    	teamname.sendKeys("Team"+RandomStringUtils.randomNumeric(2));
    	saveTeam.click();
    }
    public void viewLeaderBoardClick() throws InterruptedException
	{
		gamesPage.click();
		pastTabHeader.click();
		viewLeaderBoardButton_on_EventCard_inPastTab.click();
	}
    
}
