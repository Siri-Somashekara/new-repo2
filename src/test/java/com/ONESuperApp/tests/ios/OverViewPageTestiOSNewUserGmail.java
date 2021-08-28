package com.ONESuperApp.tests.ios;



import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.ONESuperApp.base.AppiumBaseClass;
import com.ONESuperApp.pageobject.ios.LanguageSelectionPage;
import com.ONESuperApp.pageobject.ios.OverviewPageiOS;
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

public class OverViewPageTestiOSNewUserGmail extends AppiumBaseClass {
	
	IOSDriver<IOSElement> driver;
	LanguageSelectionPage langselectiOS;
	OverviewPageiOS overviewpageiOS;
	public static Constants constants=new Constants();
	
	@BeforeClass
	public void appLuanch() throws IOException, InterruptedException {
	    driver = iOScapabilities("ONESuperApp_iOS");
		LanguageSelectionPage languageselectionpage = new LanguageSelectionPage(driver);
		languageselectionpage.languageSelectionClick();
		overviewpageiOS = new OverviewPageiOS(driver);
        overviewpageiOS.actionsiOS();
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
	
	@Test(priority = 5)
	public void gmailLoginTest() throws InterruptedException, IOException
	{
		overviewpageiOS.newUserGmailLoginiOS();
	}
	
	@Test(priority=6)
	public void verifyEmailIDTest() throws IOException, InterruptedException
	
	{
		String Email=overviewpageiOS.EmailIdiOS();
		Assert.assertEquals(Email, Files.readAllLines(Paths.get(constants.getTestDataPath())).get(0));

	}
	

	@Test(priority = 7)
	public void verifyProfileNameTest() throws InterruptedException, IOException
	{
		String profileName = overviewpageiOS.profileNameiOS();
		Assert.assertEquals(profileName, Files.readAllLines(Paths.get(constants.getTestDataPath())).get(3));
	
	}
	
/*	@Test(priority = 8)
	public void verifyUserCountryTest() throws IOException, InterruptedException
	{
		String uCountry = overviewpageiOS.userCountrySelectioniOS();
		AssertJUnit.assertEquals(uCountry, Files.readAllLines(Paths.get(constants.getTestDataPath())).get(4));
	}
	
	@Test(priority = 9)
	public void verifyPhoneNoTest() throws IOException, InterruptedException
	
	{
		String phoneno=overviewpageiOS.PhoneNoiOS();
		AssertJUnit.assertEquals(phoneno, Files.readAllLines(Paths.get(constants.getTestDataPath())).get(1));
		
	}
	
	@Test(priority = 10)
	public void verifyUserNameTest() throws IOException, InterruptedException
	
	{
		String user_name=overviewpageiOS.UserNameiOS();
		AssertJUnit.assertEquals(user_name, Files.readAllLines(Paths.get(constants.getTestDataPath())).get(2));
				
	}*/
	
	@Test(priority = 8)
	public void feedBackTextTest()
	
	{
		String feedbacktext= overviewpageiOS.SendFeedBackiOS();
		Assert.assertEquals(feedbacktext, overviewpageiOS.expFeedbackDetailsText);
	}
	
	
	
	@Test(priority = 9)
	public void changeLangTextTest()
	
	{
		String changlangtext= overviewpageiOS.changelanguageiOS();
		Assert.assertEquals(changlangtext, overviewpageiOS.expChangeLanguageDetailsText);
	}
	
	
	
	@Test(priority = 10)
	public void submitFeedbackTest() throws InterruptedException
	{
		String feedbacktitletext = overviewpageiOS.SubmitFeedbackiOS();
		Assert.assertEquals(feedbacktitletext, overviewpageiOS.expFeedbackPageTitleText);
		//String feedbacktoastmsg = overviewpageiOS.shareFeedbackToastmsgiOS();
		//Assert.assertEquals(feedbacktoastmsg, oveeerviewpageiOS.expFeedbackSubmittedToastMsg);
	}
	
	@Test(priority= 11)
	public void followFavTextTest() throws InterruptedException
	
	{
		String ffheader= overviewpageiOS.FollowFavouritesiOS();
		Assert.assertEquals(ffheader, overviewpageiOS.expFollowFavouritesPageHeader);
	}
	
	@Test(priority = 12)
	public void followFavCountriesTabTest() throws InterruptedException
	{
		String countriestab = overviewpageiOS.FollowfavCountriesTabTextiOS();
		Assert.assertEquals(countriestab, overviewpageiOS.expCountryTabHeader);
	}
	
	@Test(priority = 13)
	public void selectCountriesTest() throws InterruptedException
	{
		String selectcountries = overviewpageiOS.selectCountriesiOS();
		Assert.assertEquals(selectcountries, overviewpageiOS.expSelectCountriesPageHeader);
	}
	
		
		@Test(priority = 14)
		public void followfavAthletesTabTest() throws InterruptedException {
		
		String athletestab = overviewpageiOS.FollowfavAthleteTabTextiOS();
		Assert.assertEquals(athletestab, overviewpageiOS.expAthletesTabHeader);
		}
		
	/*	@Test(priority = 13)
		public void selectAthletesTest() throws InterruptedException 
		{
			String Text = overviewpageiOS.selectAthletesiOS();
			Assert.assertEquals(Text,  overviewpageiOS.expSelectAthletesPageHeader);
		}
	*/
		@Test(priority = 15)
		public  void changeLanguageClickTest() throws InterruptedException
		{
			String selectlang = overviewpageiOS.changeLanguageClickiOS();
			Assert.assertEquals(selectlang, overviewpageiOS.expChangeLanguagePageHeader);
			overviewpageiOS.selectLanguageClickiOS();
		}
		
	/*	@Test(priority = 14)
		public void shopIconClickProfilePageTest() throws InterruptedException
		{
			overviewpageiOS.shopIconClickProfilePageiOS();
			
		}
		*/
		
		@Test(priority = 16)
		public void golbalRuleSetTest() throws InterruptedException
		{
			String globalruleset = overviewpageiOS.globalRuleSetiOS();
			Assert.assertEquals(globalruleset, overviewpageiOS.expGlobalRuleSetPageHeader);
		
		}
		
	
		
		@Test(priority = 17)
		public void privacyPolicyTest() throws InterruptedException
		{
			String ppolicy = overviewpageiOS.privacyPolicyiOS();
			Assert.assertEquals(ppolicy, overviewpageiOS.expPrivacyPolicyPageHeader);
			
		}
		
		@Test(priority = 18)
		public void termsandConditionsTest() throws InterruptedException 
		{
			String termsandconditions = overviewpageiOS.termsandConditionsiOS();
			Assert.assertEquals(termsandconditions, overviewpageiOS.expTermsAndConditionsPageHeader);

		}
		
		@Test(priority = 19)
		public void logOutTest() throws InterruptedException  
		{
			String logouttext = overviewpageiOS.logOutiOS();
			Assert.assertEquals(logouttext, overviewpageiOS.expLogoutConfirmationPopupText);
			
		}
		
		@Test(priority = 20)
		public void logOutSuccessTest()
		{
			String logoutsuccess = overviewpageiOS.logoutSuccessiOS();
			Assert.assertEquals(logoutsuccess, overviewpageiOS.expLoginModuleHeaderText);
		}
		
	
	@AfterClass
	public void tearDowniOS() {
		driver.quit();
	
	}
	
}
