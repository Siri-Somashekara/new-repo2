package com.ONESuperApp.pageobject.ios;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.ONESuperApp.base.AppiumBaseClass;
import com.onefc.constants.Constants;
import com.ONESuperApp.base.Android_Utilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RankingsPageiOS extends  AppiumBaseClass{
	
	
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Sign in to keep your preferences and activity saved across devices.\"]")
	MobileElement loginOptionOnRankingsTabiOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\" Sign in with Google\"]")
	MobileElement gmailLoginiOS;
	
	@FindBy(id="com.google.android.gms:id/add_account_chip_title")
	MobileElement gmailAddAnotherAccount;
	
	
	@FindBy(xpath="//*[@text=\"Sign in with Facebook\"]")
	MobileElement fbLogin;


	@FindBy(xpath="//*[@text=\"Continue\"]")
	MobileElement permissionAcceptFB;
	
	
	@FindBy(xpath="//*[@text=\"Apart from the athletes I am following, notify me about:\"]")
	MobileElement settingTabHeading;

	@FindBy(xpath="(//XCUIElementTypeOther[@name=\" \"])[1]/XCUIElementTypeOther[2]")
	MobileElement profileiOS;
	
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"PROFILE\"]")
	MobileElement profileHeaderConfirmiOS;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Overview\"]")
	MobileElement OverviewTabiOS;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Settings\"]")
	MobileElement settingsTabiOS;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Rankings\"]")
	MobileElement rankingsTabiOS;
	 
	@FindBy(xpath="//*[@text=\"Next\"]")
	MobileElement newGmailLoginEmailNext;
	
	@FindBy(xpath="//*[@text=\"Next\"]")
	MobileElement newGmailLoginPwdNext;
	
	@FindBy(xpath="//*[@text=\"I agree\"]")
	MobileElement iAgreeClickForNewGmailLogin;
	
	//@FindBy(xpath="(//XCUIElementTypeOther[@name=\"EVENT ON 12TH FEB Your Teams:4 Your Contests:3 Your Ranks:3 19 15 16 RANK 19 PUBLIC GLOBAL CONTEST 2 TEAMS RANK 15 PUBLIC INDIA CONTEST 1 TEAM RANK 16 PUBLIC ASIA CONTEST 1 TEAM VIEW LEADERBOARD\"])[2]")
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"rankCard\"]")
	MobileElement rankingsTabCardTapiOS;
	//need to change the xpath ffor this later
	
	@FindBy(partialLinkText ="Your Teams:")
	MobileElement verifyRakningsList;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"VIEW LEADERBOARD\"]")
	MobileElement viewLeaderboardiOS;
	
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"REWARDS\"]")
	MobileElement rewardOnLeaderBoardiOS;
	
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"GLOBAL CONTEST\"]")
	MobileElement globalContestlistverifyiOS;
	
	@FindBy(xpath="//*[@text=\"Your game rankings and score will show up here\"]")
	MobileElement noFantasyList;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"shareIcon\"])[1]")
	MobileElement fantasyScoreShareiOS;
	
	@FindBy(xpath="//*[@text=\"HIGHEST SCORE\"]")
	MobileElement highestScoreTextOnShare;
	
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"AVERAGE\"]")
	MobileElement averageTextOnShareiOS;	
	
	@FindBy(xpath="//*[@text=\"YOUR SCORE\"]")
	MobileElement yourScoreTextOnShare;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"Share \"]")
	MobileElement fantasyShareiOS;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Copy\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther")
	MobileElement fantasyCopyShareiOS;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"Send\"]")
	MobileElement gmailShareSendMailButton;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Continue\"]")
	MobileElement confirmGmailloginiOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"Sign in – Google accounts\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]")
//	@FindBy(xpath="(//XCUIElementTypeOther[@name=\\\"Sign in – Google accounts\\\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]")
	MobileElement mailidiOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"\"]")
	MobileElement navBackiOS;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Allow\"]")
	MobileElement allowClickonLP;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\" Sign in with Facebook\"]")
	MobileElement fbLoginiOS;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Continue\"]")
	MobileElement fbContineClickiOS;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Continue\"]")
	MobileElement permissionAcceptFBiOS;
	
	//The header and tab titles
	public String expLogInOptionRankingsTab = "Sign in to keep your preferences and activity saved across devices.";
	public String expViewLeaderBoardText = "VIEW LEADERBOARD";
	public String expGlobalContestTitleText= "GLOBAL CONTEST";
	public String expLeaderBoardListVerify = "REWARDS";
	public String expFantasyShareScreenVerify = "AVERAGE";
	public String expFantasyScoreShareVerify = "VIEW LEADERBOARD";
	public String expNoFantasyList ="Your game rankings and score will show up here";
	
	public static Constants constants=new Constants();
	
	WebDriverWait wait = new WebDriverWait(iOSdriver,20);
	
	 public RankingsPageiOS(IOSDriver<IOSElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
		
	//To visit user profile page
	 public void actions() throws InterruptedException
     {
		// allowClickonLP.click();
    	// Fantasypopupclose.click();
    	 profileiOS.click();
    	
     }
	 
	 //Verifying profile tab header text
	 public String ProfileHeaderiOS()
	 {
		 String Header= profileHeaderConfirmiOS.getText();
	    	return Header;
	 }
	 
	//Verifying overview tab header text
	 public String OverviewTabiOS()
	
	 {
		String Text = OverviewTabiOS.getText();
		return Text;
		
	 }
	 
	//Verifying settings tab header text
	 public String SettingsTabiOS()
		
	 {
		String Text = settingsTabiOS.getText();
		return Text;
		
	 }
	 
	//Verifying rankings tab header text
	 public String RankingsTabiOS()
		
	 {
		String Text = rankingsTabiOS.getText();
		return Text;
		
	 }
	 
	//Verifying login texts on rankings tab
	 public String logInOptionRankingsTabiOS()
		{
			rankingsTabiOS.click();
			String logInShowing = loginOptionOnRankingsTabiOS.getText();
			return logInShowing;
		}
	
	 //Gmail login : the user who's mail id exist in the mail id list
	 public void gmailLoginiOS() throws InterruptedException
	 {
		 gmailLoginiOS.click();
		 wait.until(ExpectedConditions.visibilityOf(confirmGmailloginiOS));
		 confirmGmailloginiOS.click();
		 wait.until(ExpectedConditions.visibilityOf(mailidiOS));
		 mailidiOS.click();		 
	 }
	 
	 //Facebook Login: the user who's account exist in the app
	 public void fbLoginiOS() throws InterruptedException
	 {
		 fbLoginiOS.click();
		 fbContineClickiOS.click();
		 wait.until(ExpectedConditions.visibilityOf(permissionAcceptFBiOS));
		 permissionAcceptFBiOS.click(); 
	 }
	   
	// //Expands the ranking card
	 public void rankinsListExpandiOS() throws InterruptedException
	 {
		 
		 rankingsTabCardTapiOS.click();
		 wait.until(ExpectedConditions.visibilityOf(viewLeaderboardiOS));
		 
	 }
	 
	 //Verify leaderboard text on the ranking card
	 public String viewLeaderBoardVerifyiOS()
	 {
		 
		return viewLeaderboardiOS.getText(); 
	 }
	 
	 //Verify GLOBAL CONTEST text on the ranking card
	 public String globalContestOnListiOS()
	 {
		return globalContestlistverifyiOS.getText();
	 }
	 
	 //Fantasy leaderboard list
	 public String leaderBoardListVerifyiOS() throws InterruptedException
	 {
		 viewLeaderboardiOS.click();
		 wait.until(ExpectedConditions.visibilityOf(rewardOnLeaderBoardiOS));
		 String Text = rewardOnLeaderBoardiOS.getText();
		// utilities.scrollTill("100");
		// Androiddriver.navigate().back();
		 navBackiOS.click();
		 return Text;
	 }
	 
	 //Verifying message if no fantasy ranking is available
	 public String noFantasyListiOS()
	 {
		 return noFantasyList.getText();
	 }
	 
	//Fantasy score page
	 public String fantasyShareScreenVerifyiOS() throws InterruptedException
	 {
		 wait.until(ExpectedConditions.visibilityOf(fantasyScoreShareiOS));
		// rankingsTabCardTap.click();
		 fantasyScoreShareiOS.click();
		 wait.until(ExpectedConditions.visibilityOf(averageTextOnShareiOS));
		// String highscoreText =  highestScoreTextOnShare.getText();
		 String averageText= averageTextOnShareiOS.getText();
	//	 String yourScoreText = yourScoreTextOnShare.getText();
		 return averageText;
		 
	 }
	 
	//Fantasy score page sharing
	 public void fantasyScoreShareiOS() throws InterruptedException
	 {
		 fantasyShareiOS.click();
		 fantasyCopyShareiOS.click();
		// gmailShareEmailField.sendKeys("onetestfc@gmail.com");
		// gmailShareSendMailButton.click();
		 wait.until(ExpectedConditions.visibilityOf(viewLeaderboardiOS));
	 }
	 
	 //Fantasy score share verify
	 public String fantasyScoreShareVerifyiOS()
	 {
		 return viewLeaderboardiOS.getText();
	 }

}
	 	 