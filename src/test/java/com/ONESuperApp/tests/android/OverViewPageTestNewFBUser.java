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


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class OverViewPageTestNewFBUser extends AppiumBaseClass {
	
	AndroidDriver<AndroidElement> driver;
	LanguageSelectionPage langselect;
	OverviewPage overviewpage;
	
	public static Constants constants=new Constants();
	
	@BeforeClass
	public void appLuanch() throws IOException, InterruptedException {
	    driver = Androidcapabilities("ONESuperApp_Android");
		LanguageSelectionPage languageselectionpage = new LanguageSelectionPage(driver);
		languageselectionpage.languageSelectionClick();
		overviewpage = new OverviewPage(driver);
		overviewpage.actions();
		
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
	public void newFBLoginTest() throws IOException, InterruptedException
	{
		overviewpage.newUserFBLogin();
	}
	
	@Test(priority=6)
	public void verifyEmailIDTest() throws IOException, InterruptedException
	
	{
		String Email=overviewpage.EmailId();
		Assert.assertEquals(Email, Files.readAllLines(Paths.get(constants.getTestDataPath())).get(0));
		
		
	}
	

	@Test(priority = 7)
	public void verifyProfileNameTest() throws InterruptedException, IOException
	{
		String profileName = overviewpage.profileName();
		Assert.assertEquals(profileName, Files.readAllLines(Paths.get(constants.getTestDataPath())).get(3));
	
	}
	
	@Test(priority = 8)
	public void verifyUserCountryTest() throws IOException, InterruptedException
	{
		String uCountry = overviewpage.userCountrySelection();
		Assert.assertEquals(uCountry, Files.readAllLines(Paths.get(constants.getTestDataPath())).get(4));
	}
	
	@Test(priority = 9)
	public void verifyPhoneNoTest() throws IOException, InterruptedException
	
	{
		String phoneno=overviewpage.PhoneNo();
		Assert.assertEquals(phoneno, Files.readAllLines(Paths.get(constants.getTestDataPath())).get(1));
		
	}
	
	@Test(priority = 10)
	public void verifyUserNameTest() throws IOException, InterruptedException
	
	{
		String user_name=overviewpage.UserName();
		Assert.assertEquals(user_name, Files.readAllLines(Paths.get(constants.getTestDataPath())).get(2));
				
	}
	
	@Test(priority = 11)
	public void feedBackTextTest()
	
	{
		String feedbacktext= overviewpage.SendFeedBack();
		Assert.assertEquals(feedbacktext, overviewpage.expFeedbackDetailsText);
	}
	
	
	
	@Test(priority = 12)
	public void changeLangTextTest()
	
	{
		String changlangtext= overviewpage.changelanguage();
		Assert.assertEquals(changlangtext, overviewpage.expChangeLanguageDetailsText);
	}
	
	
	@Test(priority = 13)
	public void submitFeedbackTest() throws InterruptedException
	{
		String feedbacktitletext = overviewpage.SubmitFeedback();
		Assert.assertEquals(feedbacktitletext, overviewpage.expFeedbackPageTitleText);
		String feedbacktoastmsg = overviewpage.shareFeedbackToastmsg();
		Assert.assertEquals(feedbacktoastmsg, overviewpage.expFeedbackSubmittedToastMsg);
	}
	
	@Test(priority= 14)
	public void followFavTextTest() throws InterruptedException
	
	{
		String ffheader= overviewpage.FollowFavourites();
		Assert.assertEquals(ffheader, overviewpage.expFollowFavouritesPageHeader);
	}
	
	@Test(priority = 15)
	public void followFavCountriesTabTest() throws InterruptedException
	{
		String countriestab = overviewpage.FollowfavCountriesTabText();
		Assert.assertEquals(countriestab, overviewpage.expCountryTabHeader);
	}
	
	@Test(priority = 16)
	public void selectCountriesTest() throws InterruptedException
	{
		String selectcountries = overviewpage.selectCountries();
		Assert.assertEquals(selectcountries, overviewpage.expSelectCountriesPageHeader);
	}
	
		
		@Test(priority = 17)
		public void followfavAthletesTabTest() throws InterruptedException {
		
		String athletestab = overviewpage.FollowfavAthleteTabText();
		Assert.assertEquals(athletestab, overviewpage.expAthletesTabHeader);
		}
		
		@Test(priority = 18)
		public void selectAthletesTest() throws InterruptedException 
		{
			String selectathletes = overviewpage.selectAthletes();
			Assert.assertEquals(selectathletes, overviewpage.expSelectAthletesPageHeader);
		}
	
		
		@Test(priority = 19)
		public  void changeLanguageClickTest() throws InterruptedException
		{
			String selectlang = overviewpage.changeLanguageClick();
			Assert.assertEquals(selectlang, overviewpage.expChangeLanguagePageHeader);
			overviewpage.selectLanguageClick();
		}

		@Test(priority = 20)
		public void shopIconClickProfilePageTest() throws InterruptedException
		{
			overviewpage.shopIconClickProfilePage();
		}
		
		@Test(priority = 21)
		public void golbalRuleSetTest()
		{
			String globalruleset = overviewpage.globalRuleSet();
			Assert.assertEquals(globalruleset, overviewpage.expGlobalRuleSetPageHeader);
		}
		
		@Test(priority = 22)
		public void privacyPolicyTest()
		{
			String ppolicy = overviewpage.privacyPolicy();
			Assert.assertEquals(ppolicy, overviewpage.expPrivacyPolicyPageHeader);
		}
		
		@Test(priority = 23)
		public void termsAndConditionsTest() 
		{
			String termsandconditions = overviewpage.termsandConditions();
			Assert.assertEquals(termsandconditions, overviewpage.expTermsAndConfitionsPageHeader);
		}
		
		@Test(priority = 24)
		public void logOutTest() throws InterruptedException
		{
			String logouttext = overviewpage.logOut();
			Assert.assertEquals(logouttext, overviewpage.expLogoutConfirmationPopupText);
			
		}
		
		@Test(priority = 25)
		public void logOutSuccessTest()
		{
			String logoutsuccess = overviewpage.logoutSuccess();
			Assert.assertEquals(logoutsuccess, overviewpage.expLoginModuleHeaderText);
		}
		
		
		@AfterClass
		public void tearDown() {
			driver.quit();
		}

}






