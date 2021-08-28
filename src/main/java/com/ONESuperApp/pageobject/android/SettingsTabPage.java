package com.ONESuperApp.pageobject.android;



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

import com.ONESuperApp.base.Android_Utilities;
import com.ONESuperApp.base.AppiumBaseClass;
import com.onefc.constants.Constants;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SettingsTabPage extends  AppiumBaseClass{
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Settings\"]/android.view.ViewGroup")
	MobileElement notiprefTab;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	MobileElement loginOptionOnSettingTab;
	
	@FindBy(xpath="//*[@text=\"Sign in with Google\"]")
	MobileElement gmailLogin;
	
	@FindBy(id="com.google.android.gms:id/add_account_chip_title")
	MobileElement gmailAddAnotherAccount;
	

	//@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View")
	//@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[3]")
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText")
	MobileElement newGmailEmailInput;
	
	@FindBy(xpath="//*[@text=\"Sign in with Facebook\"]")
	MobileElement fbLogin;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout")
	MobileElement mailid;

	@FindBy(xpath="//*[@text=\"Continue\"]")
	MobileElement permissionAcceptFB;
	
	
	@FindBy(xpath="//*[@text=\"Apart from the athletes I am following, notify me about:\"]")
	MobileElement settingTabHeading;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[1]")
	MobileElement notiPrefLEN;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.Switch")
	MobileElement notiPrefSwitchLEN;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Switch")
	MobileElement notiPrefSwitchFF;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.Switch")
	MobileElement notiPrefSwitchHighlights;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.Switch")
	MobileElement notiPrefSwitchOthers;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.Switch")
	MobileElement notiPrefSwitchContests;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]")
	MobileElement notiPrefHighlights;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView[1]")
	MobileElement notiPrefFF; 
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[1]")
	MobileElement notiPrefOthers;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.TextView[1]")
	MobileElement notiPrefContests;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView\n")
	MobileElement profile;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[1]")
	MobileElement profileHeaderConfirm;
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Overview\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	MobileElement OverviewTab;
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Settings\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	MobileElement settingsTab;
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Rankings\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	MobileElement rankingsTab;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText")
	MobileElement gmailfieldsendkeysNewuser;
	

	
	@FindBy(xpath="//*[@text=\"Next\"]")
	MobileElement newGmailLoginEmailNext;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[3]")
	MobileElement newGmailPwdInput;
		
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText")
	 MobileElement pwdFieldSendKeysNewUser;
	
	@FindBy(xpath="//*[@text=\"Next\"]")
	MobileElement newGmailLoginPwdNext;
	
	@FindBy(xpath="//*[@text=\"I agree\"]")
	MobileElement iAgreeClickForNewGmailLogin;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[2]")
	MobileElement fbSignin;
	
	//@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View/android.widget.EditText")
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.widget.EditText")
	MobileElement newUserFBEmailField;
	
	//@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View/android.widget.EditText")
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.widget.EditText")
	MobileElement newUserFBEmailFieldEdit;
	
	//@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.EditText")
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.EditText")
	MobileElement newUserFBPwdField;
	
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.EditText")
	//@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.EditText")
	//@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.EditText")
	MobileElement newUserFBPwdFieldEdit;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.widget.Button")
	MobileElement newUserFBLoginSubmitButton;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View")
	MobileElement FBNewUserMailIdFieldFF;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.widget.EditText")
	MobileElement FBNewUserMailIdEditFieldFF;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.EditText")
	MobileElement FBNewUserPwdFieldFF;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.EditText")
	MobileElement FBNewUserPwdFieldEditFF;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]")
	MobileElement permissionAcceptFBFF;
	
	
	//The header and tab titles
	public String expLogInOptionSettingsTab = "Sign in to keep your preferences and activity saved across devices.";
	public String expSettingTabHeaderTitleText = "Apart from the athletes I am following, notify me about:";
	public String expLiveeventPreferenceText = "Live Event Notifications";
	public String expHightlightPreferenceText = "Highlights";
	public String expFullFightPreferenceText =  "Full Fight"; 
	public String expOthersPreferenceText = "Others";
	public String expContestPreferenceText = "Contests";
	
	WebDriverWait wait = new WebDriverWait(Androiddriver,20);
		
	public static Constants constants = new Constants();
	
	public SettingsTabPage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//To visit user profile page
	 public void actions() throws InterruptedException
     {
    	
    	// Fantasypopupclose.click();
    	 profile.click();
    	
     }
	 
	//Verifying profile tab header text
	 public String ProfileHeader()
	 {
		 String Header= profileHeaderConfirm.getText();
	    	return Header;
	 }
	 
	//Verifying overview tab header text
	 public String OverviewTab()
	
	 {
		String Text = OverviewTab.getText();
		return Text;
		
	 }
	 
	//Verifying settings tab header text
	 public String SettingsTab()
		
	 {
		String Text = settingsTab.getText();
		return Text;
		
	 }
	 
	//Verifying rankings tab header text
	 public String RankingsTab()
		
	 {
		String Text = rankingsTab.getText();
		return Text;
		
	 }
	 
	//Verifying login texts on settingns tab
	public String logInOptionSettingsTab()
	{
		notiprefTab.click();
		String logInShowing = loginOptionOnSettingTab.getText();
		return logInShowing;
	}
	
	 //Gmail login : the user who's mail id exist in the mail id list
	 public void gmailLogin() throws InterruptedException
	 {
		 gmailLogin.click();
		 wait.until(ExpectedConditions.visibilityOf(mailid));
		 mailid.click();		 
	 }
	 
	//Facebook Login: the user who's account exist in the app
	 public void fbLogin() throws InterruptedException
	 {
		 fbLogin.click();
		 wait.until(ExpectedConditions.visibilityOf(permissionAcceptFB));
		 permissionAcceptFB.click(); 
	 }
	 
	//GmailLogin : the user who's mail id does not exist in the mail id list
	 public void newUserGmailLogin() throws IOException, InterruptedException
	 {
		 String newGmailUserEmailField = Files.readAllLines(Paths.get(constants.getTestDataPath())).get(11);
		 String newGmailUserPwdField = Files.readAllLines(Paths.get(constants.getTestDataPath())).get(12);
		 gmailLogin.click();
		// wait.until(ExpectedConditions.visibilityOf(gmailAddAnotherAccount));
		 //gmailAddAnotherAccount.click();
		 Android_Utilities.scrollAndClickbyText("Add another account");
		 wait.until(ExpectedConditions.visibilityOf(newGmailEmailInput));
		 newGmailEmailInput.click();
		 newGmailEmailInput.click();
		 newGmailEmailInput.click();
		 Androiddriver.hideKeyboard();
		 gmailfieldsendkeysNewuser.sendKeys(newGmailUserEmailField);
		 newGmailLoginEmailNext.click();
		 wait.until(ExpectedConditions.visibilityOf(newGmailPwdInput));
		 newGmailPwdInput.click();
		 Androiddriver.hideKeyboard();
		 wait.until(ExpectedConditions.visibilityOf(pwdFieldSendKeysNewUser));
		 pwdFieldSendKeysNewUser.sendKeys(newGmailUserPwdField);
		 newGmailLoginPwdNext.click();
		// utilities.scrollAndClick("Skip");
		 iAgreeClickForNewGmailLogin.click();
		// return newGmailUserEmailField;
	 }
	 
	 //Facebook Login : the user who's account does not exist in the app
	 public String newUserFBLogin() throws IOException, InterruptedException
	 {
		 String newGmailUserEmailField = Files.readAllLines(Paths.get(constants.getTestDataPath())).get(7);
		 String newGmailUserPwdField = Files.readAllLines(Paths.get(constants.getTestDataPath())).get(8);
		 fbLogin.click();
		 wait.until(ExpectedConditions.visibilityOf(FBNewUserMailIdFieldFF));
		// newUserFBEmailField.click();
		 //newUserFBEmailField.click();
		 FBNewUserMailIdFieldFF.click();
		 wait.until(ExpectedConditions.visibilityOf(FBNewUserMailIdEditFieldFF));
		// newUserFBEmailFieldEdit.clear();
		 FBNewUserMailIdEditFieldFF.clear();
	//	 Androiddriver.hideKeyboard();
		//newUserFBEmailFieldEdit.sendKeys(newGmailUserEmailField);
		 FBNewUserMailIdEditFieldFF.sendKeys(newGmailUserEmailField);
		 Androiddriver.hideKeyboard();
		 wait.until(ExpectedConditions.visibilityOf(FBNewUserPwdFieldFF));
	//	 newUserFBPwdField.click();
		 FBNewUserPwdFieldFF.click();
		// newUserFBPwdFieldEdit.sendKeys(newGmailUserPwdField);
		 FBNewUserPwdFieldEditFF.sendKeys(newGmailUserPwdField);
		 Androiddriver.hideKeyboard();
		 wait.until(ExpectedConditions.visibilityOf(newUserFBLoginSubmitButton));
		 newUserFBLoginSubmitButton.click();
		 wait.until(ExpectedConditions.visibilityOf(permissionAcceptFB));
		// continue_NewuserFB.click();
		 permissionAcceptFB.click();
		 return newGmailUserEmailField;
	 }
	 
	//Verifying the SettingsTab header
	public String TabHeader()
	{
		wait.until(ExpectedConditions.visibilityOf(settingTabHeading));
		String Header=settingTabHeading.getText();
		return Header;
		
	}
	
	//Switching the notification preference for Live Event
	public String LiveEvents()
	{
		notiPrefSwitchLEN.click();
		String Text= notiPrefLEN.getText();
		return Text;		
	}
	
	//Switching the notification preference for Highlights
	public String Highlights()
	{
		notiPrefSwitchHighlights.click();
		String Text= notiPrefHighlights.getText();
		return Text;		
	}
	
	//Switching the notification preference for FullFight
	public String FullFights()
	{
		notiPrefSwitchFF.click();
		String Text= notiPrefFF.getText();
		return Text;		
	}
	
	//Switching the notification preference for Others
	public String Others()
	{
		notiPrefSwitchOthers.click();
		String Text= notiPrefOthers.getText();
		return Text;		
	}
	
	//Switching the notification preference for Contests
	public String Contest()
	{
		notiPrefSwitchContests.click();
		String Text= notiPrefContests.getText();
		return Text;		
	}

}
