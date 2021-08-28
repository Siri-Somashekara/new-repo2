package com.ONESuperApp.pageobject.android;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.crypto.SignerWithRecovery;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ONESuperApp.base.AppiumBaseClass;
import com.atlas.automation.util.TestUtil;
import com.ONESuperApp.base.Android_Utilities;
import com.onefc.constants.Constants;

import bsh.util.Util;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OverviewPage extends AppiumBaseClass{

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
    MobileElement Fantasypopupclose;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView\n")
	MobileElement profile;
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Overview\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	MobileElement OverviewTab;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[2]")
	MobileElement FeedBack;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.TextView[2]")
	MobileElement Followfav;
				
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[1]")
	MobileElement follofFavheaderconfirm;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	MobileElement ffcountrytextconfirm;
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Countries\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	MobileElement CountriesTab;
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Athletes\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	MobileElement AthletesTab;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	MobileElement AddRemoveCountries;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	MobileElement AddRemoveAthletes;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")
	MobileElement CountriesText;
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Rankings\"]/android.view.ViewGroup")
	MobileElement RankingsTab;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.TextView[2]")
	MobileElement changelang;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")
	MobileElement gmailsignin;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[2]")
	MobileElement fbSignin;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout")
	MobileElement mailid;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")
	MobileElement nameeditbutton;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText")
	MobileElement profileNameEditField;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView")
	MobileElement profileNameEditDone;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
	MobileElement profileNameConfirm;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.widget.ImageView")
	MobileElement editButton;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.widget.EditText[1]")
	MobileElement EmailField;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.widget.EditText[2]")
	MobileElement PhoneNo;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.widget.EditText[3]")
	MobileElement userName;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	MobileElement userCountry;
	
	@FindBy(xpath="hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.widget.TextView")
	MobileElement done;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText")
	MobileElement editfeedback;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")
	MobileElement verifyfeedbackpage;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	MobileElement submitFeedbackbutton;
	
	//@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[1]")
	@FindBy(xpath="//*[@text=\"PROFILE\"]")
	public WebElement profileHeaderConfirm;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")
	public WebElement LanguageChangeButton;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
	MobileElement countryClick1;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView")
	MobileElement countryClick2;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView")
	MobileElement countryClick3;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
	MobileElement countrySearch;
	
	//@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
	MobileElement indiaSelect;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.widget.TextView")
	MobileElement changesSavedToast;
	
	@FindBy(xpath="//android.widget.Toast[1]")
	MobileElement shareFeedbackToastmsg;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView")
	//@FindBy(xpath="//*[@text=\"FOLLOW\"][1]")
	MobileElement followFavAthlete1;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView")
	//@FindBy(xpath="//*[@text=\"FOLLOW\"][2]")
	MobileElement followFavAthlete2;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[3]")
	//@FindBy(xpath="//*[@text=\"FOLLOW\"][3]")
	MobileElement followFavAthlete3;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
	MobileElement selectCountryHeader;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
	MobileElement selectAthleteHeader;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
	MobileElement athleteSearch;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]")
	MobileElement followSearchAthlete1;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.TextView[1]")
	MobileElement changeLangaugeClick;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	MobileElement changeLanguageHeader;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView")
	MobileElement loggedinProfileIconLP;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[7]/android.widget.TextView[1]")
	MobileElement shopClickProfile;
	
	@FindBy(xpath="//*[@text=\"ONE Championship Global Rule Set\"]")
	MobileElement ONEChampionshipGlobalRuleSet;
	
	//@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[7]/android.widget.TextView")
	@FindBy(xpath="//*[@text=\"Privacy Policy\"]")
	MobileElement PrivacyPolicy;
	
	//@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[8]/android.widget.TextView")
	@FindBy(xpath="//*[@text=\"Terms & Conditions\"]")
	MobileElement TermsandConditions;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
	MobileElement globalRuleSetHeader;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
	MobileElement privacyPolicyHeader;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
	MobileElement termsandConditionsHeader;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[9]/android.widget.TextView")
	MobileElement logOut;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView")
	MobileElement logOutNO;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView")
	MobileElement logOutYES;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[2]")
	MobileElement logOutConfirmationHeader;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	MobileElement logOutSuccessConfirm;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup[2]")
	//@FindBy(xpath="//*[@text=\"FOLLOW\"][4]")
	MobileElement scrollAndAthleteFollow;
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Settings\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	MobileElement settingsTab;
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Rankings\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	MobileElement rankingsTab;
	
	@FindBy(id="com.google.android.gms:id/add_account_chip_title")
	MobileElement gmailAddAnotherAccount;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText")
	MobileElement newGmailEmailInput;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[3]")
	MobileElement newGmailPwdInput;
	
	@FindBy(xpath="//*[@text=\"Next\"]")
	MobileElement newGmailLoginEmailNext;
	
	@FindBy(xpath="//*[@text=\"Next\"]")
	MobileElement newGmailLoginPwdNext;
	
	@FindBy(xpath="//*[@text=\"I agree\"]")
	MobileElement iAgreeClickForNewGmailLogin;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View/android.widget.EditText")
	MobileElement newUserFBEmailField;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View/android.widget.EditText")
	MobileElement newUserFBEmailFieldEdit;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.EditText")
	MobileElement newUserFBPwdField;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.EditText")
	MobileElement newUserFBPwdFieldEdit;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.widget.Button")
	MobileElement newUserFBLoginSubmitButton;
	
	//@FindBy(id="u_0_1_Y/")
	@FindBy(xpath="//*[@text=\"Continue\"]")
	MobileElement permissionAcceptFB;

	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[3]")
	MobileElement mailfield;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText")
	MobileElement gmailfieldsendkeysNewuser;
	
	 @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText")
	 MobileElement pwdFieldSendKeysNewUser;
	 
	 @FindBy(xpath="//*[@text=\"Greece\"]")
	 MobileElement scrollAndClickCountry;
	 
	 @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
	 MobileElement profileNameErrorMsg;
	 
	 @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.widget.TextView[2]")
	 MobileElement emailFieldErrorMsg;
	 
	 @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.widget.TextView[5]")
	 MobileElement phoneErrorMsg;
	 
	 @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.widget.TextView[7]")
	 MobileElement userNameEmptyError;
	 
	 @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.widget.TextView[2]")
	 MobileElement emailFieldInvalidErrorMsg;
	 
	 @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView[5]")
	 MobileElement phoneNoInvalidErrorMsg;
	 
	 @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView[7]")
	 MobileElement userNameInvalidErrorMsg;
	 
	// @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.TextView")
	@FindBy(xpath="//*[@text=\"Done\"]")
	 MobileElement doneClickUserDetail;
	
	@FindBy(xpath="//*[@text=\"Afghanistan\"]")
	MobileElement AfghanistanCountry;
	
	@FindBy(xpath="//*[@text=\"Aland Islands\"]")
	MobileElement AlandIslandsCountry;
	
	@FindBy(xpath="//*[@text=\"Albania\"]")
	MobileElement AlbaniaCountry;
	
	@FindBy(xpath="//*[@text=\"Brandon Vera\"]")
	MobileElement BrandonVera;
	
	@FindBy(xpath="//*[@text=\"Sign in with Google\"]")
	MobileElement SignInGoogle;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[2]")
	MobileElement SingInWithGoogle;
	
	@FindBy(xpath="//*[@text=\"Follow Favorites\"]")
	MobileElement FollowFavorites;
	

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[1]")
	MobileElement FollowFavLoggedout;
	
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
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button")
    MobileElement continue_user;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button")
	MobileElement continue_NewuserFB;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button")
	MobileElement chanuser;
	
	@FindBy(id="m_login_email")
	MobileElement idFBEmailField;
	
	@FindBy(id="m_login_password")
	MobileElement idFBPwdField;
	
	@FindBy(id="login_password_step_element")
	MobileElement idSubmitFBButton;
	
	@FindBy(id="u_0_5_DQ")
	MobileElement idContinueasFBNewUser;
	
	@FindBy(id="com.google.android.gms:id/add_account_chip_title")
	MobileElement idAddAnotherAccGmail;
	
	@FindBy(id="identifierId")
	MobileElement idEmailFieldGmail;
	
	@FindBy(id="identifierNext")
	MobileElement idEmailNext;
	
	@FindBy(id="password")
	MobileElement idPwdGmailField;
	
	@FindBy(id="passwordNext")
	MobileElement pwdNextButtonGmail;
	
	@FindBy(xpath="//*[@text=\"SHOP ALL\"]")
	MobileElement shoplinkverify;
	
	@FindBy(xpath="//*[@text=\"Skip\"]")
	MobileElement skipOnNewGmail;
	
	@FindBy(xpath="//input[@name='Identifier']")
	public WebElement gmailWebMailIdField;;
	
	
	//The header and tab titles
	public String expProfilePageHeader = "PROFILE";
	public String expOverviewTabHeader = "Overview";
	public String expSettingsTabHeader = "Settings";
	public String expRankingsTabHeader = "Rankings";
	public String expFeedbackDetailsText= "Help improve the app with your feedback and suggestions";
	public String expChangeLanguageDetailsText = "Change your preferred language here";
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
	public String expTermsAndConfitionsPageHeader= "Terms & Conditions";
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
	public String expUserHandleInvalidFieldErrorMsg="You may use alphabets, numbers along with, \".\" and \"_\" ";
	
	public static Constants constants=new Constants();

	Android_Utilities util = new Android_Utilities();
	
	WebDriverWait wait = new WebDriverWait(Androiddriver,20);


	public OverviewPage(AndroidDriver<AndroidElement> driver) {
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
	 
	 //Verifying feedback section text
	 public String SendFeedBack()
	 {
		
		 String Text=FeedBack.getText();
		 return Text;
		 
	 }


	 //Verifying change langauge section text
	 public String changelanguage()
	 {
		// AddRemoveCountries.click();
		 String Text=changelang.getText();
		 return Text;
		 
	 }
	 
	 //Gmail login : the user who's mail id exist in the mail id list
	 public void GmailLogin()
	 {
		 gmailsignin.click();
		 wait.until(ExpectedConditions.visibilityOf(mailid));
		 mailid.click();		 
	 }
	 
	 //Facebook Login: the user who's account exist in the app
	 public void fbLogin() throws InterruptedException
	 {
		 fbSignin.click();
		 wait.until(ExpectedConditions.visibilityOf(permissionAcceptFB));
		 permissionAcceptFB.click();
	 }
	 
	 //Adding profile name of the user (after login)
	 public String profileName() throws IOException, InterruptedException
	 {
		 String profile_name = Files.readAllLines(Paths.get(constants.getTestDataPath())).get(3);
		 nameeditbutton.click();
		 wait.until(ExpectedConditions.visibilityOf(profileNameEditField));
		 profileNameEditField.click();
		 wait.until(ExpectedConditions.visibilityOf(profileNameEditField));
		 profileNameEditField.clear();
		 profileNameEditField.sendKeys(profile_name);
		 profileNameEditDone.click();
		 String profileName = profileNameConfirm.getText();
		 return profileName; 
	 }
	 
	 //Adding mail id of the user (after login)
	 public String EmailId() throws IOException, InterruptedException
	 {
		 String Email_id = Files.readAllLines(Paths.get(constants.getTestDataPath())).get(0);
		 editButton.click();
		 wait.until(ExpectedConditions.visibilityOf(EmailField));
		 EmailField.click();
		 wait.until(ExpectedConditions.visibilityOf(EmailField));
		 EmailField.clear();
		 EmailField.sendKeys(Email_id);
		 done.click();
		 String eMail=EmailField.getText();
		 return eMail;
	 }
	 
	 //Country selection for the user 
	 public String userCountrySelection() throws IOException, InterruptedException  
	 {
		 String user_Country = Files.readAllLines(Paths.get(constants.getTestDataPath())).get(4);
		 editButton.click();
		 userCountry.click();
		 Android_Utilities.scrollAndClickbyText(user_Country);
	//	 done.click();
		 String uCountry = userCountry.getText();
		return uCountry;
	 }

	 //Adding phone no
	 public String PhoneNo() throws IOException, InterruptedException
	 {
		 String phone_no = Files.readAllLines(Paths.get(constants.getTestDataPath())).get(1);
	//	 editButton.click();
		 wait.until(ExpectedConditions.visibilityOf(PhoneNo));
		 PhoneNo.click();
		 wait.until(ExpectedConditions.visibilityOf(PhoneNo));
		 PhoneNo.clear();
		 PhoneNo.sendKeys(phone_no);
		 done.click();
		 String phoneno=PhoneNo.getText();
		 return phoneno;
	 }
	 
	 //Adding username
	 public String UserName() throws IOException, InterruptedException
	 {
		 
		 String user_name = Files.readAllLines(Paths.get(constants.getTestDataPath())).get(2);
		 editButton.click();
		 wait.until(ExpectedConditions.visibilityOf(userName));
		 userName.click();
		 wait.until(ExpectedConditions.visibilityOf(userName));
		 userName.clear();
		 userName.sendKeys(user_name);
		 done.click();
		 String username=userName.getText();
		 
		 return username;
	 }
	 
	 //Submitting feedback
	 public String SubmitFeedback() throws InterruptedException
	 {
		FeedBack.click();
		 wait.until(ExpectedConditions.visibilityOf(verifyfeedbackpage));
		String Text = verifyfeedbackpage.getText();
		wait.until(ExpectedConditions.visibilityOf(editfeedback));
		editfeedback.click();
		editfeedback.sendKeys("Nice app");
		wait.until(ExpectedConditions.visibilityOf(submitFeedbackbutton));
		submitFeedbackbutton.click();	
		return Text;
	 }
	 
	 //Verifying toast message
	 public String shareFeedbackToastmsg() throws InterruptedException {
		String Text= shareFeedbackToastmsg.getText();
		return Text;
		 
	 }
	 
	 //Verifying Follow Favourites header text
	 public String FollowFavourites() throws InterruptedException
	 {
		 Followfav.click();
		 String Text=follofFavheaderconfirm.getText();
		 return Text;
		 
	 }
	 
	 //Verifying countries tab header text
	 public String FollowfavCountriesTabText() throws InterruptedException
	 {
		 String Text = CountriesTab.getText();
		 return Text;
		 
	 }
	 
	 //Selecting multiple countries in FollowFavourites
	 public String selectCountries() throws InterruptedException
	 {
		AddRemoveCountries.click();
		wait.until(ExpectedConditions.visibilityOf(selectCountryHeader));
		String Text = selectCountryHeader.getText();
		 countryClick1.click();
		 countryClick2.click();
		 countryClick3.click();
		 countrySearch.click();
		 Androiddriver.hideKeyboard();
		 countrySearch.sendKeys("India");
		 wait.until(ExpectedConditions.visibilityOf(indiaSelect));
		 Thread.sleep(5000);
		 indiaSelect.click();
		 indiaSelect.click();
		 Androiddriver.navigate().back();
		 return Text;
		 
	 }
	 
	 //Verifying athlete tab header text
	 public String FollowfavAthleteTabText()
	 {
		 AthletesTab.click();
		 String Text = AthletesTab.getText();
		 return Text;
	 }
	 
	 //Selecting multiple athletes in FollowFavourites
	 public String selectAthletes() throws InterruptedException
	 {
		
		 AddRemoveAthletes.click();
		 String Text = selectAthleteHeader.getText();
		 followFavAthlete1.click();
		 followFavAthlete2.click();
		 followFavAthlete3.click();
		 athleteSearch.click();
		 Androiddriver.hideKeyboard();
		 athleteSearch.sendKeys("Alex Silva");
		 wait.until(ExpectedConditions.visibilityOf(followSearchAthlete1));
		 followSearchAthlete1.click();
		 followSearchAthlete1.click();
		 Androiddriver.navigate().back();
		 Androiddriver.navigate().back();	
		 return Text;
		 
	 }
	 
	//Verifying the Change language section text
	 public String changeLanguageClick()
	 {
		changeLangaugeClick.click();
		String Text = changeLanguageHeader.getText();
		return Text;
		 
	 }
	 
	 //Changing app locale 
	 public void selectLanguageClick() throws InterruptedException 
	 {
		 LanguageChangeButton.click();
		 wait.until(ExpectedConditions.visibilityOf(loggedinProfileIconLP));
		 loggedinProfileIconLP.click();
	 }
	 
	 //Shop click navigation
	 public void shopIconClickProfilePage() throws InterruptedException
	 {
		 shopClickProfile.click();
		 Android_Utilities.scrolltoElementByText("SHOP ALL");
		 wait.until(ExpectedConditions.visibilityOf(shoplinkverify));
		 Androiddriver.navigate().back();
	 }

	 //Checking global rule set page
	 public String globalRuleSet()
	 {
		 Android_Utilities.scrollAndClickbyText("ONE Championship Global Rule Set");
		 ONEChampionshipGlobalRuleSet.click();
		 String Text = globalRuleSetHeader.getText();
		 Android_Utilities.scrolltoElementByText("ONE Judging Criteria");
		 Androiddriver.navigate().back();
		 return Text;
	 }
	 
	 //Checking privacyPolicyPage
	 public String privacyPolicy()
	 {
		 Android_Utilities.scrollAndClickbyText("Privacy Policy");
		 PrivacyPolicy.click();
		 String Text = privacyPolicyHeader.getText();
		 Android_Utilities.scrolltoElementByText("How to contact us?");
		 Androiddriver.navigate().back();
		 return Text;
	 }
	 
	 //Checking T&C page
	 public String termsandConditions()
	 {
		 Android_Utilities.scrollAndClickbyText("Terms & Conditions");
		 TermsandConditions.click();
		 String Text = termsandConditionsHeader.getText();
		 Android_Utilities.scrolltoElementByText("Contact Us");
		 Androiddriver.navigate().back();
		 return Text;
	 }
	 
	 //User logout from the profile
	 public String logOut() throws InterruptedException
	 {
		 Android_Utilities.scrollAndClickbyText("Logout");
		 String Text = logOutConfirmationHeader.getText();
		 logOutYES.click();
		 return Text;
	 }
	 
	 //Confirming logout
	 public String logoutSuccess()
	 {
		 Android_Utilities.scrolltoElementByText("Sign in to keep your preferences and activity saved across devices.");
		 String Text = logOutSuccessConfirm.getText();
		 return Text;
	 }
	 
	 //GmailLogin : the user who's mail id does not exist in the mail id list
	 public void newUserGmailLogin() throws IOException, InterruptedException
	 {
		 String newGmailUserEmailField = Files.readAllLines(Paths.get(constants.getTestDataPath())).get(5);
		 String newGmailUserPwdField = Files.readAllLines(Paths.get(constants.getTestDataPath())).get(6);
		 gmailsignin.click();
		 //wait.until(ExpectedConditions.visibilityOf(gmailAddAnotherAccount));
		 Android_Utilities.scrollAndClickbyText("Add another account");
		 //gmailAddAnotherAccount.click();
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
		 fbSignin.click();
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
	 

	 
	 //Empty field : Checking empty field error 
	 public String profileNameEmptyFieldErrorMsg()
	 {
		nameeditbutton.click();
		profileNameEditField.click();
		profileNameEditField.clear();
		profileNameEditDone.click();
		String pnameError = profileNameErrorMsg.getText();
		return pnameError;
		
	 }

	 //Empty field : Checking empty field error 
	 public String emailEmptyFieldErrorMsg()
	 {
		editButton.click();
		EmailField.click();
		EmailField.clear();
		String emailFFieldError = emailFieldErrorMsg.getText();
		return emailFFieldError;
	 }
	 
	 //Empty field : Checking empty field error 
	 public String phoneNoEmptyFieldErrorMsg() throws IOException
	 {
		 EmailField.click();
		 EmailField.sendKeys(Files.readAllLines(Paths.get(constants.getTestDataPath())).get(0));
		 PhoneNo.click();
		 PhoneNo.clear();
		 done.click();
		 String phoneNumnerError = phoneErrorMsg.getText();
		return phoneNumnerError;
		 
	 }
	 
	 //Empty field : Checking empty field error 
	 public String userHandleEmptyFieldErrorMsg()
	 {
		 userName.click();
		 userName.clear();
		 String userHandle = userNameEmptyError.getText();
		 return userHandle;
	 }


	 //Invalid input : Checking error message
	 public String emailInvalidFieldErrorMsg()
	 {
		editButton.click();
		EmailField.click();
		EmailField.clear();
		EmailField.sendKeys("invalidemailid");
		String emailFFieldError = emailFieldInvalidErrorMsg.getText();
		return emailFFieldError;
	 }
	 
	 //Invalid input : Checking error message
	 public String phoneNoFieldInvalidErrorMsg() throws IOException, InterruptedException
	 {
		// EmailField.click();
		// EmailField.sendKeys(Files.readAllLines(Paths.get(TestdataPath)).get(0));
		 PhoneNo.click();
		 PhoneNo.clear();
		 PhoneNo.sendKeys("273987");
		 Thread.sleep(2000);
		 doneClickUserDetail.click();
		 String phoneNumnerError = phoneNoInvalidErrorMsg.getText();
		return phoneNumnerError;
	 }

	 //Invalid input : Checking error message
	 public String userHandleInvalidFieldErrorMsg()
	 {
		 userName.click();
		 userName.clear();
		 userName.sendKeys("(&&^*)%");
		 String userHandle = userNameInvalidErrorMsg.getText();
		 return userHandle;
	 }
	 
	 //Following country and athlete before login
	 public String followFavBeforeLogin() throws InterruptedException {
		 FollowFavLoggedout.click();
		 wait.until(ExpectedConditions.visibilityOf(follofFavheaderconfirm));
		 String Text=follofFavheaderconfirm.getText();
		 AddRemoveCountries.click(); 
		 //Thread.sleep(2000);
		 AfghanistanCountry.click();
		 AlandIslandsCountry.click();
		 AlbaniaCountry.click();
		 //Thread.sleep(5000);
		 Androiddriver.navigate().back();
		 AthletesTab.click();
		 AddRemoveAthletes.click();
		 athleteSearch.click();
		 Androiddriver.hideKeyboard();
		 athleteSearch.sendKeys("Brandon Vera");
		 followSearchAthlete1.click();
		 followSearchAthlete1.click();
		 //Thread.sleep(10000);
		 Androiddriver.navigate().back();
		 Androiddriver.navigate().back();
		 return Text;
	 }

	
	/* public void followFavLoginGmailNewUser() throws IOException, InterruptedException {
		
			 String newGmailUserEmailField = Files.readAllLines(Paths.get(TestdataPath)).get(15);
			 String newGmailUserPwdField = Files.readAllLines(Paths.get(TestdataPath)).get(16);
			 //gmailsignin.click();
			 Thread.sleep(3000);
			 SingInWithGoogle.click();
			 Thread.sleep(10000);
			 gmailAddAnotherAccount.click();
			 Thread.sleep(10000);
			// newGmailEmailInput.click();
		//	 newGmailEmailInput.click();
			// newGmailEmailInput.click();
			 gmailfieldsendkeysNewuser.click();
			 gmailfieldsendkeysNewuser.click();
			 Thread.sleep(2000);
			 Androiddriver.hideKeyboard();
			 Thread.sleep(2000);
			 gmailfieldsendkeysNewuser.sendKeys(newGmailUserEmailField);
			 newGmailLoginEmailNext.click();
			 Thread.sleep(1000);
			 newGmailPwdInput.click();
			 Thread.sleep(2000);
			 Androiddriver.hideKeyboard();
			 Thread.sleep(1000);
			 pwdFieldSendKeysNewUser.sendKeys(newGmailUserPwdField);
			 newGmailLoginPwdNext.click();
			// utilities.scrollAndClick("Skip");
			 iAgreeClickForNewGmailLogin.click();
			// return newGmailUserEmailField;
		 
	 } */
	 
	 //Gmail login : with the newly created account to verify the followed athlete and country 
	 public void followFavLoginGmailNewUserid() throws IOException, InterruptedException {
			
		 String newGmailUserEmailField = Files.readAllLines(Paths.get(constants.getTestDataPath())).get(15);
		 String newGmailUserPwdField = Files.readAllLines(Paths.get(constants.getTestDataPath())).get(16);
		 //gmailsignin.click();
		 wait.until(ExpectedConditions.visibilityOf(SingInWithGoogle));
		 //Thread.sleep(3000);
		 SingInWithGoogle.click();
		 //wait.until(ExpectedConditions.visibilityOf(gmailAddAnotherAccount));
		 //idAddAnotherAccGmail.click();
		 Android_Utilities.scrollAndClickbyText("Add another account");
		 //gmailAddAnotherAccount.click();
		 wait.until(ExpectedConditions.visibilityOf(newGmailEmailInput));
		 newGmailEmailInput.click();
		 newGmailEmailInput.click();
		 newGmailEmailInput.click();
		// idEmailFieldGmail.click();
		// idEmailFieldGmail.click();
		// idEmailFieldGmail.click();
		// idEmailFieldGmail.click();
		 //Thread.sleep(2000);
		 Androiddriver.hideKeyboard();
		 //Thread.sleep(2000);
		 wait.until(ExpectedConditions.visibilityOf(gmailfieldsendkeysNewuser));
		 gmailfieldsendkeysNewuser.sendKeys(newGmailUserEmailField);
		// idEmailFieldGmail.sendKeys(newGmailUserEmailField);
		 newGmailLoginEmailNext.click();
		 wait.until(ExpectedConditions.visibilityOf(newGmailPwdInput));
		 //idEmailNext.click();
		 //Thread.sleep(1000);
		 newGmailPwdInput.click();
		 //idPwdGmailField.click();
		 //Thread.sleep(2000);
		 Androiddriver.hideKeyboard();
		 wait.until(ExpectedConditions.visibilityOf(pwdFieldSendKeysNewUser));
		 //Thread.sleep(1000);
		 pwdFieldSendKeysNewUser.sendKeys(newGmailUserPwdField);
		 //idPwdGmailField.sendKeys(newGmailUserPwdField);
		 newGmailLoginPwdNext.click();
		 Android_Utilities.scrollAndClickbyText("Skip");
		 //wait.until(ExpectedConditions.visibilityOf(skipOnNewGmail));
		 //pwdNextButtonGmail.click();
		 iAgreeClickForNewGmailLogin.click();
		// return newGmailUserEmailField;
	 
 }
	 


		//Facebook login : with the newly created account to verify the followed athlete and country 
	 public String followFavLoginFBNewuser() throws InterruptedException, IOException {
		 String newGmailUserEmailField = Files.readAllLines(Paths.get(constants.getTestDataPath())).get(17);
		 String newGmailUserPwdField = Files.readAllLines(Paths.get(constants.getTestDataPath())).get(18);
		 fbSignin.click();
		 wait.until(ExpectedConditions.visibilityOf(FBNewUserMailIdFieldFF));
		 //Thread.sleep(5000);
		// newUserFBEmailField.click();
		 //newUserFBEmailField.click();
		 FBNewUserMailIdFieldFF.click();
		 wait.until(ExpectedConditions.visibilityOf(FBNewUserMailIdEditFieldFF));
		 //Thread.sleep(2000);
		// newUserFBEmailFieldEdit.clear();
		 FBNewUserMailIdEditFieldFF.clear();
	//	 Androiddriver.hideKeyboard();
		//newUserFBEmailFieldEdit.sendKeys(newGmailUserEmailField);
		 FBNewUserMailIdEditFieldFF.sendKeys(newGmailUserEmailField);
		 //Thread.sleep(2000);
		 Androiddriver.hideKeyboard();
		 wait.until(ExpectedConditions.visibilityOf(FBNewUserPwdFieldFF));
		 //Thread.sleep(3000);
	//	 newUserFBPwdField.click();
		 FBNewUserPwdFieldFF.click();
		// newUserFBPwdFieldEdit.sendKeys(newGmailUserPwdField);
		 FBNewUserPwdFieldEditFF.sendKeys(newGmailUserPwdField);
		 //Thread.sleep(2000);
		 Androiddriver.hideKeyboard();
		 //Thread.sleep(1000);
		 newUserFBLoginSubmitButton.click();
		 wait.until(ExpectedConditions.visibilityOf(continue_NewuserFB));
		 //Thread.sleep(5000);
		 continue_NewuserFB.click();
	//	 permissionAcceptFB.click();
		 return newGmailUserEmailField;
		 
	 }
	
	 
	 
	 //Checking earlier followed country (which is followed before login) : for the user who logged-in in the app for first time
	 public String FollowFavCountryAfterLoginNewUser() {
		 FollowFavorites.click();
		 String Text = AfghanistanCountry.getText();
	//	 String Text2 = AlandIslandsCountry.getText();
	//	 String Text3 = AlbaniaCountry.getText();
		 return Text;
	 }
	 
	 //Checking earlier followed athlete (which is followed before login) : for the user who logged-in in the app for first time
	 public String FollowFavAthleteAfterLoginNewUser() {
		 AthletesTab.click();
		 String Text = BrandonVera.getText();
		 return Text;
	 }

	
}	
	
