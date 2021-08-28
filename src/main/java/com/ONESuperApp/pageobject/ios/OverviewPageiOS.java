package com.ONESuperApp.pageobject.ios;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ONESuperApp.base.AppiumBaseClass;
import com.ONESuperApp.base.iOS_Utilities;
import com.onefc.constants.Constants;

import bsh.util.Util;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;

public class OverviewPageiOS extends AppiumBaseClass{

	//@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
   // MobileElement FantasypopupcloseiOS;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\" \"])[1]/XCUIElementTypeOther[2]")
	MobileElement profileiOS;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Allow\"]")
	MobileElement notiPermissionAllowiOS;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Overview\"]")
	MobileElement OverviewTabiOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"Share Feedback Help improve the app with your feedback and suggestions\"]")
	MobileElement FeedBackiOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"Follow Favorites Follow countries and athletes you like to be the first to know updates, news and new videos about them\"]")
	MobileElement FollowfaviOS;
	
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"headerTitle\"]")
	MobileElement follofFavheaderconfirmiOS;
	
	@FindBy(xpath="")
	MobileElement ffcountrytextconfirmiOS;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Countries\"]")
	MobileElement CountriesTabiOS;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Athletes\"]")
	MobileElement AthletesTabiOS;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"ADD/REMOVE COUNTRIES\"])[2]")
	MobileElement AddRemoveCountriesiOS;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"ADD/REMOVE ATHLETES\"])[2]")
	MobileElement AddRemoveAthletesiOS;
	
//	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")
//	MobileElement CountriesTextiOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"Change Language Change your preferred language here\"]")
	MobileElement changelangiOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\" Sign in with Google\"]")
	MobileElement gmailsigniniOS;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Continue\"]")
	MobileElement confirmGmailloginiOS;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Continue\"]")
	MobileElement confirmFBloginiOS;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Continue\"]")
	MobileElement continueClickonFBpage;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\" Sign in with Facebook\"]")
	MobileElement fbSigniniOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"Sign in – Google accounts\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]")
//	@FindBy(xpath="(//XCUIElementTypeOther[@name=\\\"Sign in – Google accounts\\\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]")
	MobileElement mailidiOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"editProfileButton\"]")
	MobileElement nameeditbuttoniOS;
	
	@FindBy(xpath="//XCUIElementTypeTextField[@name=\"userNameInput\"]")
	MobileElement proifleNameEditFieldiOS;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"DONE\"])[3]")
	MobileElement profileNameEditDoneiOS;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"DONE\"])[2]")
	MobileElement profileNameEditDoneiOS2;
	
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"userName\"]")
	MobileElement profileNameConfirmiOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"editUserDetailsButton\"]")
	MobileElement editButtoniOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"Email\"]/XCUIElementTypeOther/XCUIElementTypeTextField")
	MobileElement EmailFieldiOS;
	
	@FindBy(xpath="//XCUIElementTypeTextField[@name=\"phoneNumberInput\"]")
	MobileElement PhoneNoiOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"Username\"]/XCUIElementTypeOther/XCUIElementTypeTextField")
	MobileElement userNameiOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"Username Invalid handle\"]/XCUIElementTypeOther/XCUIElementTypeTextField")
	MobileElement userNameVerifyAfterEdit;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"Username\"]/XCUIElementTypeOther/XCUIElementTypeTextField")
	MobileElement userNameiOSEdit;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"Username Invalid handle\"]/XCUIElementTypeOther/XCUIElementTypeTextField")
	MobileElement usernameEditWithInvalidtext;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"countryInput\"]")
	MobileElement userCountryiOS;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"DONE\"])[2]")
	MobileElement doneiOS;
	
	@FindBy(xpath="//XCUIElementTypeTextView[@name=\"Your feedback here...\"]")
	MobileElement editfeedbackiOS;
	
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"What do you like about the ONE Super App? What can we do better? Share your feedback and suggestions with us.\"]")
	MobileElement verifyfeedbackpageiOS;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"SUBMIT FEEDBACK\"])[2]")
	MobileElement submitFeedbackbuttoniOS;
	
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"PROFILE\"]")
	public WebElement profileHeaderConfirmiOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"\"]")
	public WebElement LanguageChangeButtoniOS;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Afghanistan\"])[2]")
	MobileElement countryClick1iOS;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Aland Islands\"])[2]")
	MobileElement countryClick2iOS;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Albania\"])[2]")
	MobileElement countryClick3iOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"Search...\"]/XCUIElementTypeTextField")
	MobileElement countrySearchiOS;
	
	//@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"India\"])[3]")
	MobileElement indiaSelectiOS;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Changes saved.\"])[1]")
	MobileElement changesSavedToastiOS;
	
	//@FindBy(xpath="")
	@FindBy(xpath="(//XCUIElementTypeStaticText[@name=\"FOLLOW\"][1])")
	MobileElement followFavAthlete1iOS;
	
	//@FindBy(xpath="")
	@FindBy(xpath="(//XCUIElementTypeStaticText[@name=\"FOLLOW\"][2])")
	MobileElement followFavAthlete2iOS;

	//@FindBy(xpath="")
	@FindBy(xpath="(//XCUIElementTypeStaticText[@name=\"FOLLOW\"][3])")
	MobileElement followFavAthlete3iOS;
	
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"headerTitle\"]")
	MobileElement selectCountryHeaderiOS;
	
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Select Athletes\"]")
	MobileElement selectAthleteHeaderiOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"Search...\"]/XCUIElementTypeTextField")
	MobileElement athleteSearchiOS;
	
	@FindBy(xpath="(//XCUIElementTypeStaticText[@name=\"FOLLOW\"][1])")
	MobileElement followSearchAthlete1iOS;
	
	@FindBy(xpath="	\n"
			+ "//XCUIElementTypeOther[@name=\"Change Language Change your preferred language here\"]")
	MobileElement changeLangaugeClickiOS;
	
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Select Language\"]")
	MobileElement changeLanguageHeaderiOS;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\" \"])[1]/XCUIElementTypeOther[2]")
	MobileElement loggedinProfileIconLPiOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"Shop Visit our e-store\"]")
	MobileElement shopClickProfileiOS;
	
	//@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.TextView")
//ONE Championship Global Rule Set
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"ONE Championship Global Rule Set\"]")
	MobileElement ONEChampionshipGlobalRuleSetiOS;
	
	//@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[7]/android.widget.TextView")
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"Privacy Policy\"]")
	MobileElement PrivacyPolicyiOS;
	
	@FindBy(xpath="(//XCUIElementTypeStaticText[@name=\"Privacy Policy\"])[1]")
	MobileElement PPolicyHeader;
	
	//@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[8]/android.widget.TextView")
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"Terms & Conditions\"]")
	MobileElement TermsandConditionsiOS;
	
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Rules and regulations\"]")
	MobileElement globalRuleSetHeadingiOS;
	
	@FindBy(xpath="(//XCUIElementTypeStaticText[@name=\"Privacy Policy\"])[2]")
	MobileElement privacyPolicyHeadingiOS;
	
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Terms and Conditions\"]")
	MobileElement termsandConditionsHeadingiOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"Logout\"]")
	MobileElement logOutiOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"NO\"]")
	MobileElement logOutNOiOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"YES\"]")
	MobileElement logOutYESiOS;
	
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Are you sure you want to log out?\"]")
	MobileElement logOutConfirmationHeaderiOS;
	
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Sign in to keep your preferences and activity saved across devices.\"]")
	MobileElement logOutSuccessConfirmiOS;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup[2]")
	//@FindBy(xpath="//*[@text=\"FOLLOW\"][4]")
	MobileElement scrollAndAthleteFollowiOS;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Settings\"]")
	MobileElement settingsTabiOS;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Rankings\"]")
	MobileElement rankingsTabiOS;
	
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Use another account\"]")
	MobileElement gmailAddAnotherAccountiOS;
	
	
	//@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View")
	@FindBy(xpath="//XCUIElementTypeTextField[@name=\"Email or phone\"]")
	MobileElement newGmailEmailInputiOS;
	
	
	
	@FindBy(xpath="//XCUIElementTypeSecureTextField[@name=\"Enter your password\"]")
	MobileElement newGmailPwdInputiOS;
	
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Next\"]")
	MobileElement newGmailLoginEmailNextiOS;
	
	@FindBy(xpath="(//XCUIElementTypeButton[@name=\"Next\"])[1]")
	MobileElement newGmailLoginPwdNextiOS;
	
	//@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.widget.Button")
	@FindBy(xpath="//*[@text=\"I agree\"]")
	MobileElement iAgreeClickForNewGmailLoginiOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeTextField")
	MobileElement newUserFBEmailFieldiOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeTextField")
	MobileElement newUserFBEmailFieldEditiOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeSecureTextField")
	MobileElement newUserFBPwdFieldiOS;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeSecureTextField")
	MobileElement newUserFBPwdFieldEditiOS;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Log In\"]")
	MobileElement newUserFBLoginSubmitButtoniOS;
	
	//@FindBy(id="u_0_1_Y/")
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Continue\"]")
	MobileElement permissionAcceptFBiOS;
	 
	 @FindBy(xpath="//XCUIElementTypeOther[@name=\"\"]")
	 MobileElement backNavIcon;
	
	 
	 @FindBy(xpath="//XCUIElementTypeButton[@name=\"Sign in with Apple\"]")
	 MobileElement appleSignIn;
	 
	 @FindBy(xpath="//XCUIElementTypeButton[@name=\"Settings\"]")
	 MobileElement selectSettingsAppliID;
	 
	 @FindBy(xpath="//XCUIElementTypeApplication[@name=\"Settings\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeOther[2]/XCUIElementTypeOther")
	 MobileElement enterAppleIDfiled;
	 
	 @FindBy(xpath="//XCUIElementTypeButton[@name=\"Next\"]")
	 MobileElement clickNextAppleID;
	 
	 @FindBy(xpath="//XCUIElementTypeTextField[@name=\"username-field\"]")
	 MobileElement editAppleIDfield;
	 
	 @FindBy(xpath="//XCUIElementTypeSecureTextField[@name=\"password-field\"]")
	 MobileElement enterAppleIDpwdField;
	 
	 @FindBy(xpath="//XCUIElementTypeButton[@name=\"Next\"]")
	 MobileElement clickOnNextAppleIDpwd;
	 
	 @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"\"]")
	 MobileElement closeWebPage;
	 
	 @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Field cant be left empty\"]")
	 MobileElement profileNameErrorMsgiOS;
	 
	 @FindBy(xpath="(//XCUIElementTypeStaticText[@name=\"Field cant be left empty\"])[2]")
	 MobileElement emailFieldErrorMsgiOS;
	 
	 @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Field cant be left empty\"]")
	 MobileElement phoneErrorMsgiOS;
	 
	 @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Invalid handle\"]")
	 MobileElement userNameEmptyErroriOS;
	 
	 @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Brazil\"]")
	 MobileElement brazilClick;
	 
	 @FindBy(xpath="//XCUIElementTypeOther[@name=\"Email Field cant be left empty\"]/XCUIElementTypeOther/XCUIElementTypeTextField")
	 MobileElement enterMailid;

	 @FindBy(xpath="(//XCUIElementTypeOther[@name=\"DONE\"])[4]")
	 MobileElement doneiOSonMobileFieldEmptyError;
	 
	 @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Invalid Email Id\"]")
	 MobileElement emailFieldInvalidErrorMsgiOS;
	 
	 @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Invalid Phone Number\"]")
	 MobileElement phoneNoInvalidErrorMsgiOS;
	 
	 @FindBy(xpath="//XCUIElementTypeApplication[@name=\"ONE Dev\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeStaticText[2]")
	 MobileElement userNameInvalidErrorMsgiOS;	
	 
	 @FindBy(xpath="//XCUIElementTypeOther[@name=\"Email Invalid Email Id\"]/XCUIElementTypeOther/XCUIElementTypeTextField")
	 MobileElement enterMailidwhenitsinvalid;
	 
	 @FindBy(xpath="//XCUIElementTypeOther[@name=\"Username Invalid handle\"]/XCUIElementTypeOther/XCUIElementTypeTextField")
	 MobileElement invalidHandleiOS;
	 
	 @FindBy(xpath="(//XCUIElementTypeOther[@name=\"Afghanistan\"])[2]")
	 MobileElement AfghanistanCountryiOS;
	 
	 @FindBy(xpath="(//XCUIElementTypeOther[@name=\"followButton\"])[1]")
	 MobileElement FollowBrandoniOS;
	 
	 @FindBy(xpath="//XCUIElementTypeOther[@name=\"FOLLOW FAVOURITES\"]")
	 MobileElement FFheaderconfirm;
	 
	 @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"headerTitle\"]")
	 MobileElement profileHeader;
	 
	 @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Brandon Vera\"]")
	 MobileElement BrandonVeraiOS;
	 
	 @FindBy(xpath="//XCUIElementTypeOther[@name=\"content information\"]/XCUIElementTypeOther[2]")
	 MobileElement continueAsFBuser;
	 
	 @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Afghanistan\"]")
	 MobileElement AfghanistanUserCountryiOS;
	
	//The header and tab titles
	public String expProfilePageHeader = "PROFILE";
	public String expOverviewTabHeader = "Overview";
	public String expSettingsTabHeader = "Settings";
	public String expRankingsTabHeader = "Rankings";
	public String expFeedbackDetailsText= "Share Feedback Help improve the app with your feedback and suggestions";
	public String expChangeLanguageDetailsText =  "Change Language Change your preferred language here";
	public String expFeedbackPageTitleText = "What do you like about the ONE Super App? What can we do better? Share your feedback and suggestions with us.";
	public String expFeedbackSubmittedToastMsg= "Thanks for your feedback!";
	public String expFollowFavouritesPageHeader = "FOLLOW FAVOURITES";
	public String expCountryTabHeader= "Countries";
	public String expSelectCountriesPageHeader= "Select Countries";
	public String expAthletesTabHeader= "Athletes";
	public String expSelectAthletesPageHeader= "Select Athletes";
	public String expChangeLanguagePageHeader= "Select Language";
	public String expGlobalRuleSetPageHeader = "ONE Championship Global Rule Set";
	public String expPrivacyPolicyPageHeader= "Privacy Policy";
	public String expTermsAndConditionsPageHeader= "Terms & Conditions";
	public String expLogoutConfirmationPopupText= "Are you sure you want to log out?";
	public String expLoginModuleHeaderText= "Sign in to keep your preferences and activity saved across devices.";
	public String expCountryNameForNewUserFF = "Afghanistan";
	public String expAthleteNameForNewUserFF = "Brandon Vera";
	public String expProfileNameEmptyFieldErrorMsg= "Field cant be left empty";
	public String expEmailEmptyFieldErrorMsg= "Field cant be left empty";
	public String expPhoneNoEmptyFieldErrorMsg= "Field cant be left empty";
	public String expUserHandleEmptyFieldErrorMsg= "Invalid handle";
	public String expEmailInvalidFieldErrorMsg= "Invalid Email Id";
	public String expPhoneNoFieldInvalidErrorMsg="Invalid Phone Number";
	public String expUserHandleInvalidFieldErrorMsg= "You may use alphabets, numbers along with, \".\" and \"_\"";
			 
	 public static Constants constants=new Constants();
	 
	 iOS_Utilities util = new iOS_Utilities();
		
	 WebDriverWait wait = new WebDriverWait(iOSdriver,20);
	 
	public OverviewPageiOS(IOSDriver<IOSElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	//To visit user profile page
	 public void actionsiOS() throws InterruptedException
     {
		/* wait.until(ExpectedConditions.visibilityOf(notiPermissionAllowiOS));
		 notiPermissionAllowiOS.click(); */
		 wait.until(ExpectedConditions.visibilityOf(profileiOS));
    	 profileiOS.click();
    	
     }
	 
	 
	 //Verifying profile tab header text
	 public String ProfileHeaderiOS()
	 {
		 String Header= profileHeader.getText();
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
	 
	 //Verifying feedback section text
	 public String SendFeedBackiOS()
	 {
		
		 String Text=FeedBackiOS.getText();
		 return Text;
		 
	 }
	
	 //Verifying change language section text
	 public String changelanguageiOS()
	 {
		// AddRemoveCountries.click();
		 String Text=changelangiOS.getText();
		 return Text;
		 
	 }
	 
	 //Gmail login : the user who's mail id exist in the mail id list
	 public void GmailLoginiOS() throws InterruptedException
	 {
		 gmailsigniniOS.click();
		 wait.until(ExpectedConditions.visibilityOf(confirmGmailloginiOS));
		 confirmGmailloginiOS.click();
		 wait.until(ExpectedConditions.visibilityOf(mailidiOS));
		 mailidiOS.click();	 
	 }
	 
	 //Facebook Login: the user who's account exist in the app
	 public void fbLoginiOS() throws InterruptedException
	 {
		 fbSigniniOS.click();
		 wait.until(ExpectedConditions.visibilityOf(confirmFBloginiOS));
		 confirmFBloginiOS.click();
		 continueClickonFBpage.click();
	 }
	 
	//Adding profile name of the user (after login)
	 public String profileNameiOS() throws IOException, InterruptedException
	 {
		 String profile_name = Files.readAllLines(Paths.get(constants.getTestDataPath())).get(3);
		 nameeditbuttoniOS.click();
		 wait.until(ExpectedConditions.visibilityOf(proifleNameEditFieldiOS));
		 proifleNameEditFieldiOS.click();
		 wait.until(ExpectedConditions.visibilityOf(proifleNameEditFieldiOS));
		 proifleNameEditFieldiOS.clear();
		 proifleNameEditFieldiOS.sendKeys(profile_name);
		 profileNameEditDoneiOS.click();
		 String profileName = profileNameConfirmiOS.getText();
		 return profileName; 
	 }
	 
	 //Adding mail id of the user (after login)
	 public String EmailIdiOS() throws IOException, InterruptedException
	 {
		 String Email_id = Files.readAllLines(Paths.get(constants.getTestDataPath())).get(0);
		 editButtoniOS.click();
		 wait.until(ExpectedConditions.visibilityOf(EmailFieldiOS));
		 EmailFieldiOS.click();
		 EmailFieldiOS.clear();
		 enterMailid.sendKeys(Email_id);
		 wait.until(ExpectedConditions.visibilityOf(doneiOS));
		 doneiOS.click();
		 String eMail=EmailFieldiOS.getText();
		 return eMail;
	 }
	 
	//Country selection for the user 
	 public String userCountrySelectioniOS() throws IOException, InterruptedException  
	 {
		 String user_Country = Files.readAllLines(Paths.get(constants.getTestDataPath())).get(21);
		 editButtoniOS.click();
		 userCountryiOS.click();
		 AfghanistanUserCountryiOS.click();
		 AfghanistanUserCountryiOS.click();
		 AfghanistanUserCountryiOS.click();
		 //brazilClick.click();
		// iOS_Utilities.scrollAndClick(user_Country);
		// doneiOS.click();
		 String uCountry = userCountryiOS.getText();
		return uCountry;
	 }

	//Adding phone no
	 public String PhoneNoiOS() throws IOException, InterruptedException
	 {
		 String phone_no = Files.readAllLines(Paths.get(constants.getTestDataPath())).get(22);
	//	 editButton.click();
		 wait.until(ExpectedConditions.visibilityOf(PhoneNoiOS));
		 PhoneNoiOS.click();
		 wait.until(ExpectedConditions.visibilityOf(PhoneNoiOS));
		 PhoneNoiOS.clear();
		 PhoneNoiOS.sendKeys(phone_no);
		 doneiOS.click();
		 String phoneno=PhoneNoiOS.getText();
		 return phoneno;
	 }
	 
	//Adding username
	 public String UserNameiOS() throws IOException, InterruptedException
	 {
		 
		 String user_name = Files.readAllLines(Paths.get(constants.getTestDataPath())).get(2);
		 editButtoniOS.click();
		 wait.until(ExpectedConditions.visibilityOf(userNameiOS));
		 userNameiOS.click();
		 wait.until(ExpectedConditions.visibilityOf(userNameiOS));
		 userNameiOSEdit.clear();
		 wait.until(ExpectedConditions.visibilityOf(usernameEditWithInvalidtext));
		 usernameEditWithInvalidtext.click();
		 usernameEditWithInvalidtext.sendKeys(user_name);
		 doneiOS.click();
		 String username=userNameiOS.getText();
		// String username1=userNameVerifyAfterEdit.getText();
		 return username;
	 }
	 
	//Submitting feedback
	 public String SubmitFeedbackiOS() throws InterruptedException
	 {
		wait.until(ExpectedConditions.visibilityOf(FeedBackiOS));
		FeedBackiOS.click();
		wait.until(ExpectedConditions.visibilityOf(verifyfeedbackpageiOS));
		String Text = verifyfeedbackpageiOS.getText();
		editfeedbackiOS.click();
		wait.until(ExpectedConditions.visibilityOf(editfeedbackiOS));
		editfeedbackiOS.sendKeys("Nice app");
		wait.until(ExpectedConditions.visibilityOf(submitFeedbackbuttoniOS));
		submitFeedbackbuttoniOS.click();	
		return Text;
	 }
	 
	 
	/* public String shareFeedbackToastmsgiOS() throws InterruptedException
	 {
	     boolean isDisplayed = false;
	     int count=0;
	     do {
	         if(iOSdriver.getPageSource().contains("Thanks for your feedback!"))
	         {
	             isDisplayed=true;
	             break;
	         }
	         Thread.sleep(200);//Add your custom wait if exists
	         count++;

	     }while(count<10);
		return TestdataPath;
	     
	 } */
	 
	 //Verifying Follow Favourites header text
	 public String FollowFavouritesiOS() throws InterruptedException
	 {
		 wait.until(ExpectedConditions.visibilityOf(FollowfaviOS));
		 FollowfaviOS.click();
		 String Text=follofFavheaderconfirmiOS.getText();
		 return Text;
		 
	 }
	 
	 //Verifying countries tab text
	 public String FollowfavCountriesTabTextiOS() throws InterruptedException
	 {
		 String Text = CountriesTabiOS.getText();
	//	Thread.sleep(2000);
	//	AddRemoveCountries.click();
	//	Thread.sleep(2000);
		return Text;
		 
	 }
	 
	 //Selecting multiple countries in FollowFavourites
	 public String selectCountriesiOS() throws InterruptedException
	 {
		AddRemoveCountriesiOS.click();
		wait.until(ExpectedConditions.visibilityOf(selectCountryHeaderiOS));
		String Text = selectCountryHeaderiOS.getText();
		 countryClick1iOS.click();
		 countryClick2iOS.click();
		 countryClick3iOS.click();
		 //iOS_Utilities.scrollDownCountryList();
		 wait.until(ExpectedConditions.visibilityOf(countrySearchiOS));
		 countrySearchiOS.click();
		 iOSdriver.hideKeyboard();
		 countrySearchiOS.sendKeys("India");
		 wait.until(ExpectedConditions.visibilityOf(indiaSelectiOS));
		 indiaSelectiOS.click();
		 indiaSelectiOS.click();
		 wait.until(ExpectedConditions.visibilityOf(backNavIcon));
		 //iOSdriver.navigate().back();
		 backNavIcon.click();
		 return Text;
		 
	 }
	
	//Verifying athlete tab header text
	 public String FollowfavAthleteTabTextiOS()
	 {
		 AthletesTabiOS.click();
		 String Text = AthletesTabiOS.getText();
		// driver.navigate().back();
		 backNavIcon.click();
		 return Text;
	 }
	 
	 /*	//Selecting multiple athletes in FollowFavourites
	 public String selectAthletesiOS() throws InterruptedException
	 {
		
		 AddRemoveAthletesiOS.click();
		 wait.until(ExpectedConditions.visibilityOf(selectAthleteHeaderiOS));
		 String Text = selectAthleteHeaderiOS.getText();
		 followFavAthlete1iOS.click();
		 followFavAthlete2iOS.click();
		 followFavAthlete3iOS.click();
		 wait.until(ExpectedConditions.visibilityOf(athleteSearchiOS));
		 athleteSearchiOS.click();
		 iOSdriver.hideKeyboard();
		 athleteSearchiOS.sendKeys("Alex Silva");
		 wait.until(ExpectedConditions.visibilityOf(followSearchAthlete1iOS));
		 followSearchAthlete1iOS.click();
		 followSearchAthlete1iOS.click();
		 Thread.sleep(10000);
		 backNavIcon.click();
		 backNavIcon.click();
		 return Text;
		 
	 }
	 */
	 
	 //Verifying the Change language section text
	 public String changeLanguageClickiOS()
	 {
		changeLangaugeClickiOS.click();
		String Text = changeLanguageHeaderiOS.getText();
		return Text;
		 
	 }
	 
	 ////Changing app locale 
	 public void selectLanguageClickiOS() throws InterruptedException 
	 {
		 LanguageChangeButtoniOS.click();
		 wait.until(ExpectedConditions.visibilityOf(loggedinProfileIconLPiOS));
		 loggedinProfileIconLPiOS.click();
	 }
	 
	/*//Shop click navigation
	 public void shopIconClickProfilePageiOS() throws InterruptedException
	 {
		 shopClickProfileiOS.click();

	 }
	 */

	 //Checking global rule set page
	 public String globalRuleSetiOS() throws InterruptedException
	 {
		 ONEChampionshipGlobalRuleSetiOS.click();
		 String Text = ONEChampionshipGlobalRuleSetiOS.getText();
		 wait.until(ExpectedConditions.visibilityOf(closeWebPage));
		 closeWebPage.click();	
		 return Text;
	 }

	//Checking privacyPolicyPage
	 public String privacyPolicyiOS() throws InterruptedException
	 {
		
		 PrivacyPolicyiOS.click();
		 String Text = PPolicyHeader.getText();
		 wait.until(ExpectedConditions.visibilityOf(closeWebPage));
		 closeWebPage.click();
		 return Text;
	 }
	 
	 //Checking T&C page
	 public String termsandConditionsiOS() throws InterruptedException
	 {
		// utilities.scrollAndClick("Terms & Conditions");
		 TermsandConditionsiOS.click();
		 String Text = TermsandConditionsiOS.getText();
		 wait.until(ExpectedConditions.visibilityOf(closeWebPage));
		 closeWebPage.click();
		// utilities.scrollTill("Contact Us");
		// driver.navigate().back();
		 return Text;
	 }
	 
	//User logout from the profile 
	 public String logOutiOS() throws InterruptedException
	 {
		 logOutiOS.click();
		 String Text = logOutConfirmationHeaderiOS.getText();
		 logOutYESiOS.click();
		 return Text;
	 }
	 
	 //Confirming logout
	 public String logoutSuccessiOS()
	 {
		 String Text = logOutSuccessConfirmiOS.getText();
		 return Text;
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
	 
	/* //Appleid login
	 public String newUserApplIDLoginiOS() throws InterruptedException, IOException
	 {
		 String newAppleidUserEmailField = Files.readAllLines(Paths.get(constants.getTestDataPath())).get(9);
		 String newAppleidUserPwdField = Files.readAllLines(Paths.get(constants.getTestDataPath())).get(10);
		 appleSignIn.click();
		 selectSettingsAppliID.click();
		 Thread.sleep(2000);
		 editAppleIDfield.click();
		 editAppleIDfield.sendKeys(newAppleidUserEmailField);
		 clickNextAppleID.click();
		 Thread.sleep(2000);
		 enterAppleIDpwdField.click();
		 enterAppleIDpwdField.sendKeys(newAppleidUserPwdField);
		 clickOnNextAppleIDpwd.click();
		return newAppleidUserPwdField;
	 } */
	 
	 //Empty field : Checking empty field error 
	 public String profileNameEmptyFieldErrorMsgiOS()
	 {
		nameeditbuttoniOS.click();
		proifleNameEditFieldiOS.click();
		proifleNameEditFieldiOS.clear();
		profileNameEditDoneiOS2.click();
		String pnameError = profileNameErrorMsgiOS.getText();
		return pnameError;
		
	 }

	 //Empty field : Checking empty field error 
	 public String emailEmptyFieldErrorMsgiOS()
	 {
		editButtoniOS.click();
		EmailFieldiOS.click();
		EmailFieldiOS.clear();
		String emailFFieldError = emailFieldErrorMsgiOS.getText();
		return emailFFieldError;
	 }
	 
	 //Empty field : Checking empty field error 
	 public String phoneNoEmptyFieldErrorMsgiOS() throws IOException
	 {
		 enterMailid.click();
		 enterMailid.sendKeys(Files.readAllLines(Paths.get(constants.getTestDataPath())).get(0));
		 PhoneNoiOS.click();
		 PhoneNoiOS.clear();
		 doneiOSonMobileFieldEmptyError.click();
		 String phoneNumnerError = phoneErrorMsgiOS.getText();
		return phoneNumnerError;
		 
	 }
	 
	 //Empty field : Checking empty field error 
	 public String userHandleEmptyFieldErrorMsgiOS()
	 {
		 userNameiOS.click();
		 userNameiOS.clear();
		 String userHandle = userNameEmptyErroriOS.getText();
		 return userHandle;
	 }
	 
	 //Invalid input : Checking error message
	 public String emailInvalidFieldErrorMsgiOS()
	 {
		editButtoniOS.click();
		EmailFieldiOS.click();
		EmailFieldiOS.clear();
		enterMailid.sendKeys("invalidemailid");
		String emailFFieldError = emailFieldInvalidErrorMsgiOS.getText();
		return emailFFieldError;
	 }
	 
	 //Invalid input : Checking error message
	 public String phoneNoFieldInvalidErrorMsgiOS() throws IOException, InterruptedException
	 {
		 enterMailidwhenitsinvalid.click();
		 enterMailidwhenitsinvalid.clear();
		 enterMailid.sendKeys(Files.readAllLines(Paths.get(constants.getTestDataPath())).get(0));
		 PhoneNoiOS.click();
		 PhoneNoiOS.clear();
		 PhoneNoiOS.sendKeys("273987");
		 wait.until(ExpectedConditions.visibilityOf(profileNameEditDoneiOS2));
		 profileNameEditDoneiOS2.click();
		 String phoneNumnerError = phoneNoInvalidErrorMsgiOS.getText();
		return phoneNumnerError;
	 }

	 //Invalid input : Checking error message
	 public String userHandleInvalidFieldErrorMsgiOS()
	 {
		 userNameiOS.click();
		 userNameiOS.clear();
		 invalidHandleiOS.sendKeys("(&&^*)%");
		 String userHandle = userNameInvalidErrorMsgiOS.getText();
		 return userHandle;
	 }
	 
	//Following country and athlete before login
	 public String followFavBeforeLoginiOS() throws InterruptedException {
		 FollowfaviOS.click();
		 wait.until(ExpectedConditions.visibilityOf(FFheaderconfirm));
		 String Text=FFheaderconfirm.getText();
		 AddRemoveCountriesiOS.click();
		 wait.until(ExpectedConditions.visibilityOf(AfghanistanCountryiOS));
		 AfghanistanCountryiOS.click();
		 wait.until(ExpectedConditions.visibilityOf(backNavIcon));
		 backNavIcon.click();
		 AthletesTabiOS.click();
		 AddRemoveAthletesiOS.click();
		 athleteSearchiOS.click();
		 athleteSearchiOS.sendKeys("Brandon");
		 wait.until(ExpectedConditions.visibilityOf(FollowBrandoniOS));
		 FollowBrandoniOS.click();
		 FollowBrandoniOS.click();
		 wait.until(ExpectedConditions.visibilityOf(backNavIcon));
		 backNavIcon.click();
		 backNavIcon.click();
		 wait.until(ExpectedConditions.visibilityOf(gmailsigniniOS));
		 return Text;
	 }
	 
	//Gmail login : with the newly created account to verify the followed athlete and country 
	 public void followFavLoginGmailNewUseriOS() throws InterruptedException, IOException {
		 String newGmailUserEmailField = Files.readAllLines(Paths.get(constants.getTestDataPath())).get(15);
		 String newGmailUserPwdField = Files.readAllLines(Paths.get(constants.getTestDataPath())).get(16);
		 gmailsigniniOS.click();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 confirmGmailloginiOS.click();
		 gmailAddAnotherAccountiOS.click();
		 newGmailEmailInputiOS.click();
		 newGmailEmailInputiOS.click();
		 newGmailEmailInputiOS.click();
		 wait.until(ExpectedConditions.visibilityOf(newGmailEmailInputiOS));
		 newGmailEmailInputiOS.sendKeys(newGmailUserEmailField);
		 newGmailLoginEmailNextiOS.click();
		 wait.until(ExpectedConditions.visibilityOf(newGmailPwdInputiOS));
		 newGmailPwdInputiOS.click();
		 wait.until(ExpectedConditions.visibilityOf(newGmailPwdInputiOS));
		 newGmailPwdInputiOS.sendKeys(newGmailUserPwdField);
		 wait.until(ExpectedConditions.visibilityOf(newGmailLoginPwdNextiOS));
		 newGmailLoginPwdNextiOS.click();
		 
	 }
	 
	 //Checking earlier followed country (which is followed before login) : for the user who logged-in in the app for first time
	 public String FollowFavCountryAfterLoginNewUseriOS() throws InterruptedException {
		 wait.until(ExpectedConditions.visibilityOf(FollowfaviOS));
		 FollowfaviOS.click();
		 String Text = AfghanistanCountryiOS.getText();
		 return Text;
	 }
	 
	//Checking earlier followed athlete (which is followed before login) : for the user who logged-in in the app for first time
	 public String FollowFavAthleteAfterLoginNewUseriOS() {
		 AthletesTabiOS.click();
		 String Text = BrandonVeraiOS.getText();
		 return Text;
	 }
	 
	//Facebook login : with the newly created account to verify the followed athlete and country 
	 public void followFavLoginFBNewuseriOS() throws InterruptedException, IOException {
		 String newFBUserEmailField = Files.readAllLines(Paths.get(constants.getTestDataPath())).get(17);
		 String newFBUserPwdField = Files.readAllLines(Paths.get(constants.getTestDataPath())).get(18);
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
		 wait.until(ExpectedConditions.visibilityOf(continueAsFBuser));
		 continueAsFBuser.click();
		 Thread.sleep(3000);
	//	 permissionAcceptFBiOS.click();
	
	 }

	 
}

	


	
