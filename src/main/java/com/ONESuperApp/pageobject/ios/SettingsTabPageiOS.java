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

import com.ONESuperApp.base.AppiumBaseClass;
import com.onefc.constants.Constants;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SettingsTabPageiOS extends  AppiumBaseClass{
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Settings\"]")
	MobileElement notiprefTabiOS;
	
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Sign in to keep your preferences and activity saved across devices.\"]")
	MobileElement loginOptionOnSettingTabiOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\" Sign in with Google\"]")
	MobileElement gmailLoginiOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\" Sign in with Facebook\"]")
	MobileElement fbLoginiOS;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Continue\"]")
	MobileElement fbContineClickiOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"Sign in – Google accounts\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]")
	MobileElement mailidiOS;

	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Continue\"]")
	MobileElement permissionAcceptFBiOS;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Continue\"]")
	MobileElement premissionAcceptGmail;
	
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Apart from the athletes I am following, notify me about:\"]")
	MobileElement settingTabHeadingiOS;
	
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Live Event Notifications\"]")
	MobileElement notiPrefLENiOS;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Live Event Notifications Get timely alerts and reminders about upcoming events, bout cards and live stream\"])[1]/XCUIElementTypeSwitch")
	MobileElement notiPrefSwitchLENiOS;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Full Fight Get notified when a new 'Full Fight' video is published\"])[1]/XCUIElementTypeSwitch")
	MobileElement notiPrefSwitchFFiOS;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Highlights Get notified when a new 'Highlights' video is published\"])[1]/XCUIElementTypeSwitch")
	MobileElement notiPrefSwitchfHighlightsiOS;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Others\"])[1]/XCUIElementTypeSwitch")
	MobileElement notiPrefSwitchOthersiOS;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Contests Stay updated about upcoming contests hosted by ONE Championship\"])[1]/XCUIElementTypeSwitch")
	MobileElement notiPrefSwitchContestsiOS;
	
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Full Fight\"]")
	MobileElement notiPrefFFiOS ;
	
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Highlights\"]")
	MobileElement notiPrefHighlightsiOS;
	
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Others\"]")
	MobileElement notiPrefOthersiOS;
	
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Contests\"]")
	MobileElement notiPrefContestsiOS;
	
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
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Allow\"]")
	MobileElement notiPermissionAllowiOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\" Sign in with Google\"]")
	MobileElement gmailsigniniOS;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Continue\"]")
	MobileElement confirmGmailloginiOS;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Continue\"]")
	MobileElement confirmFBloginiOS;
	
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Use another account\"]")
	MobileElement gmailAddAnotherAccountiOS;
	
	@FindBy(xpath="//XCUIElementTypeTextField[@name=\"Email or phone\"]")
	MobileElement newGmailEmailInputiOS;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Next\"]")
	MobileElement newGmailLoginEmailNextiOS;
	
	@FindBy(xpath="//XCUIElementTypeSecureTextField[@name=\"Enter your password\"]")
	MobileElement newGmailPwdInputiOS;
	
	@FindBy(xpath="(//XCUIElementTypeButton[@name=\"Next\"])[1]")
	MobileElement newGmailLoginPwdNextiOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\" Sign in with Facebook\"]")
	MobileElement fbSigniniOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeTextField")
	MobileElement newUserFBEmailFieldiOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeTextField")
	MobileElement newUserFBEmailFieldEditiOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeSecureTextField")
	MobileElement newUserFBPwdFieldiOS;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Log In\"]")
	MobileElement newUserFBLoginSubmitButtoniOS;
	
	//The header and tab titles
	public String expLogInOptionSettingsTab = "Sign in to keep your preferences and activity saved across devices.";
	public String expSettingTabHeaderTitleText = "Apart from the athletes I am following, notify me about:";
	public String expLiveeventPreferenceText = "Live Event Notifications";
	public String expHightlightPreferenceText = "Highlights";
	public String expFullFightPreferenceText =  "Full Fight"; 
	public String expOthersPreferenceText = "Others";
	public String expContestPreferenceText = "Contests";
	
	public static Constants constants=new Constants();
	WebDriverWait wait = new WebDriverWait(iOSdriver,20);
	
	public SettingsTabPageiOS(IOSDriver<IOSElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//To visit user profile page
	 public void actionsiOS() throws InterruptedException
     {
		/* wait.until(ExpectedConditions.visibilityOf(notiPermissionAllowiOS));
		 notiPermissionAllowiOS.click(); */
		 Thread.sleep(2000);
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
	 
	//Verifying login texts on settingns tab
	public String logInOptionSettingsTabiOS()
	{
		notiprefTabiOS.click();
		String logInShowing = loginOptionOnSettingTabiOS.getText();
		return logInShowing;
	}
	
	 //Gmail login : the user who's mail id exist in the mail id list
	 public void gmailLoginiOS() throws InterruptedException
	 {
		 gmailLoginiOS.click();
		 premissionAcceptGmail.click();
		 wait.until(ExpectedConditions.visibilityOf(mailidiOS));
		 mailidiOS.click();		 
	 }
	 
	//GmailLogin : the user who's mail id does not exist in the mail id list
	 public void newUserGmailLoginiOS() throws IOException, InterruptedException
	 {
		 String newGmailUserEmailField = Files.readAllLines(Paths.get(constants.getTestDataPath())).get(5);
		 String newGmailUserPwdField = Files.readAllLines(Paths.get(constants.getTestDataPath())).get(6);
		 gmailsigniniOS.click();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 confirmGmailloginiOS.click();
		 gmailAddAnotherAccountiOS.click();
		 newGmailEmailInputiOS.click();
		 newGmailEmailInputiOS.click();
		 newGmailEmailInputiOS.click();
		 Thread.sleep(2000);
	//	 driver.hideKeyboard();
		 wait.until(ExpectedConditions.visibilityOf(newGmailEmailInputiOS));
		 newGmailEmailInputiOS.sendKeys(newGmailUserEmailField);
		 newGmailLoginEmailNextiOS.click();
		 wait.until(ExpectedConditions.visibilityOf(newGmailPwdInputiOS));
		 newGmailPwdInputiOS.click();
		 wait.until(ExpectedConditions.visibilityOf(newGmailPwdInputiOS));
		 newGmailPwdInputiOS.sendKeys(newGmailUserPwdField);
		 newGmailLoginPwdNextiOS.click();
		// utilities.scrollAndClick("Skip");
	//	 iAgreeClickForNewGmailLoginiOS.click();
		// return newGmailUserEmailField;
	 }
	 
	//Facebook Login : the user who's account does not exist in the app
	 public String newUserFBLoginiOS() throws IOException, InterruptedException
	 {
		 String newFBUserEmailField = Files.readAllLines(Paths.get(constants.getTestDataPath())).get(7);
		 String newFBUserPwdField = Files.readAllLines(Paths.get(constants.getTestDataPath())).get(8);
		 fbSigniniOS.click();
		 confirmFBloginiOS.click();
		 wait.until(ExpectedConditions.visibilityOf(newUserFBEmailFieldiOS));
		 newUserFBEmailFieldiOS.click();
		 wait.until(ExpectedConditions.visibilityOf(newUserFBEmailFieldEditiOS));
		 newUserFBEmailFieldEditiOS.clear();
		 newUserFBEmailFieldEditiOS.sendKeys(newFBUserEmailField);
		 wait.until(ExpectedConditions.visibilityOf(newUserFBPwdFieldiOS));
		 newUserFBPwdFieldiOS.click();
		 newUserFBPwdFieldiOS.click();
		// newUserFBPwdFieldEditiOS.sendKeys(newFBUserPwdField);
		 newUserFBPwdFieldiOS.sendKeys(newFBUserPwdField);
		 wait.until(ExpectedConditions.visibilityOf(newUserFBLoginSubmitButtoniOS));
		 newUserFBLoginSubmitButtoniOS.click();
		 wait.until(ExpectedConditions.visibilityOf(permissionAcceptFBiOS));
		 permissionAcceptFBiOS.click();
		 return newFBUserEmailField;
	 }
	 
	//Facebook Login: the user who's account exist in the app
	 public void fbLoginiOS() throws InterruptedException
	 {
		 fbLoginiOS.click();
		 fbContineClickiOS.click();
		 wait.until(ExpectedConditions.visibilityOf(permissionAcceptFBiOS));
		 permissionAcceptFBiOS.click(); 
	 }
	 
	//Verifying the SettingsTab header
	public String TabHeaderiOS()
	{
		iOSdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String Header=settingTabHeadingiOS.getText();
		return Header;
		
	}
	
	//Switching the notification preference for Live Event
	public String LiveEventsiOS()
	{
		notiPrefSwitchLENiOS.click();
		String Text= notiPrefLENiOS.getText();
		return Text;		
	}
	
	//Switching the notification preference for Highlights
	public String HighlightsiOS()
	{
		notiPrefSwitchfHighlightsiOS.click();
		String Text= notiPrefHighlightsiOS.getText();
		return Text;		
	}
	
	//Switching the notification preference for FullFight
	public String FullFightsiOS()
	{
		notiPrefSwitchFFiOS.click();
		String Text= notiPrefFFiOS.getText();
		return Text;		
	}
	
	//Switching the notification preference for Others
	public String OthersiOS()
	{
		notiPrefSwitchOthersiOS.click();
		String Text= notiPrefOthersiOS.getText();
		return Text;		
	}
	
	//Switching the notification preference for Contests
	public String ContestiOS()
	{
		notiPrefSwitchContestsiOS.click();
		String Text= notiPrefContestsiOS.getText();
		return Text;		
	}

}
