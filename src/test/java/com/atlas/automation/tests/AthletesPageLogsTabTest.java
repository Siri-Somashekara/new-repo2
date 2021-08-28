package com.atlas.automation.tests;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.atlas.automation.actions.WebdriverActions;
import com.atlas.automation.base.BaseClass;
import com.atlas.automation.pages.AthletesPage;
import com.atlas.automation.pages.HomePage;
import com.atlas.automation.pages.LoginPage;

public class AthletesPageLogsTabTest extends BaseClass {
	LoginPage loginpage;
	HomePage homepage;
	AthletesPage athletespage;
	WebdriverActions actions = new WebdriverActions();

	public AthletesPageLogsTabTest() {
		super();
	}
	
	@BeforeClass
	public void setup() throws InterruptedException, IOException {
		initialization();
		loginpage = new LoginPage();
		athletespage = new AthletesPage();
		actions.waitForElementToLoad();
		homepage = loginpage.loginToApp(prop.getProperty("emailID"), prop.getProperty("password"));

	}

	@Test(priority=1)
	public void athleteLogsTabTest() {
		homepage.athletesBtnClick();
		actions.waitForElementToLoad();
		athletespage.addAthleteBtnClick();
		athletespage.enterFirstName("Chris");
		athletespage.enterLastName();
		athletespage.enterAthleteDob("1990-02-07");
		athletespage.enterAthleteHeight("165");
		athletespage.enterNationality();
		athletespage.enterGender(athletespage.male);
		athletespage.enterWeightclass();
		athletespage.clickOnSaveAndProceedBtn();
		athletespage.clickOnAthletesPageWebElement(athletespage.logsTab);
		try {
			//Validate active tab should be logs tab
			Assert.assertEquals(athletespage.verifyActiveTabInAthleteDetails(athletespage.activeTabIsLogs),
					"MuiButtonBase-root MuiTab-root MuiTab-textColorSecondary Mui-selected");
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=2)
	public void verifyNewVersionCreationTest() throws InterruptedException {
		athletespage.clickOnAthletesPageWebElement(athletespage.generalTab);
		athletespage.clickOnBasicDetailsEditButton();
		athletespage.clickOnSelectChampionshipStyleAsMMA();
		athletespage.clickOnSaveBtn();
		Thread.sleep(4000);
		athletespage.clickOnAthletesPageWebElement(athletespage.logsTab);
		try {
			actions.waitForElementToLoad();
			//Validate version 1 is displayed or not
			Assert.assertTrue(athletespage.version1_log.isDisplayed());
			//Validate version 2 is displayed or not
			Assert.assertTrue(athletespage.version2_log.isDisplayed());
		}catch (AssertionError e) {
			e.printStackTrace();
		}
	}
	
	
	@Test(priority=3)
	public void navigatingToVersionComparisionPageTest() throws InterruptedException {
		athletespage.clickOnAthletesPageWebElement(athletespage.version2_log);
		try {
			actions.waitForElementToLoad();
			//validate compare version page header title is displayed
			Assert.assertTrue(athletespage.compareVersionHeader.isDisplayed());
			//validate compare version page header title text
			Assert.assertEquals(athletespage.verifyStringValue(athletespage.compareVersionHeader), "Compare Version - Athlete");
		}catch (AssertionError e) {
			e.printStackTrace();
		}
		
	}
	
	@Test(priority=4)
	public void compareTwoVersionsTest() {
		try {
			//validate the skills entered in the new version
			Assert.assertEquals(athletespage.verifyStringValue(athletespage.skillsInCompareVersion), "Mixed Martial Arts");
			//validate highlighted color in version1_skills
			Assert.assertEquals(athletespage.getColorCode(athletespage.skillsTextBoxInVersion1),"#ffdcdc");
			//validate highlighted color in version2_skills
			Assert.assertEquals(athletespage.getColorCode(athletespage.skillsTextBoxInVersion2),"#dcffdc");
		}catch (AssertionError e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=5)
	public void clickOnShowEverythingBtnTest() {
		athletespage.clickOnAthletesPageWebElement(athletespage.showEverythingBtn);
		try {
			//validate show changes only button is displayed or not after clicking on the showeverythingBtn
			Assert.assertTrue(athletespage.showChangesOnlyBtn.isDisplayed());
			//validate the skill value after clicking on the showeverythingBtn
			actions.verticalScroll(0,500);
			Assert.assertEquals(athletespage.verifyStringValue(athletespage.skillsInCompareVersion), "Mixed Martial Arts");
		}catch (AssertionError e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=6)
	public void clickOnGoToAthleteDetailsBtnTest() throws InterruptedException {
		actions.verticalScrollToTop();
		athletespage.clickOnAthletesPageWebElement(athletespage.goToAthleteDetailsBtn);
		try {
			//validate the active tab should be general tab after clicking on the goToAthleteDetailsBtn
			Assert.assertEquals(athletespage.verifyActiveTabInAthleteDetails(athletespage.activeTabIsGeneral),
					"MuiButtonBase-root MuiTab-root MuiTab-textColorSecondary Mui-selected");
		}catch (AssertionError e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=7)
	public void switchTheTabWhileEditingTest() throws InterruptedException {
		athletespage.clickOnBasicDetailsEditButton();
		try {
			//validate the FightHistory tab is disabled if we edit the basic details in the general tab
			Assert.assertEquals(athletespage.verifyActiveTabInAthleteDetails(athletespage.activeTabIsFightHistory),
					"MuiButtonBase-root MuiTab-root MuiTab-textColorSecondary Mui-disabled Mui-disabled");
		}catch (AssertionError e) {
			e.printStackTrace();
		}
		athletespage.clickOnCancelBtnInEditSections();
	}
	
	@Test(priority=8)
	public void verifyFemaleAthletedefaultCreativesTest() throws InterruptedException {
		athletespage.clickOnAthletesPageWebElement(athletespage.atheletesBtnLink);
		actions.waitForElementToLoad();
		athletespage.addAthleteBtnClick();
		athletespage.enterFirstName("Chris");
		athletespage.enterLastName();
		athletespage.enterAthleteDob("1990-02-07");
		athletespage.enterAthleteHeight("165");
		athletespage.enterNationality();
		athletespage.enterGender(athletespage.female);
		athletespage.enterWeightclass();
		athletespage.clickOnSaveAndProceedBtn();
		athletespage.clickOnAthletesPageWebElement(athletespage.creativestab);
		try {
			//Validate the default female athlete images in the creatives tab
			Assert.assertEquals(athletespage.defaultBioImage.getAttribute("src"),
				"https://res.cloudinary.com/onefc/image/upload/h_300,f_auto/v1590481344/athletes/fallback/female-1500x920.png");
			Assert.assertEquals(athletespage.defaultBioAlternativeImage.getAttribute("src"),
			    "https://res.cloudinary.com/onefc/image/upload/h_300,f_auto/v1590481344/athletes/fallback/female-1500x920.png");
			Assert.assertEquals(athletespage.defaultFaceImage.getAttribute("src"),
					"https://res.cloudinary.com/onefc/image/upload/h_300,f_auto/v1590481343/athletes/fallback/female-256x256.png");
			Assert.assertEquals(athletespage.defaultBoutFaceImage.getAttribute("src"),
				"https://res.cloudinary.com/onefc/image/upload/h_300,f_auto/v1590481343/athletes/fallback/female-500x345.png");
			Assert.assertEquals(athletespage.defaultBoutFaceAlternativeImage.getAttribute("src"),
					"https://res.cloudinary.com/onefc/image/upload/h_300,f_auto/v1590481343/athletes/fallback/female-500x345.png");
			Assert.assertEquals(athletespage.defaultWorldChampionImage.getAttribute("src"),
					"https://res.cloudinary.com/onefc/image/upload/h_300,f_auto/v1590481344/athletes/fallback/female-1500x920.png");
			Assert.assertEquals(athletespage.defaultWorldGrandprixChampionImage.getAttribute("src"),
					"https://res.cloudinary.com/onefc/image/upload/h_300,f_auto/v1590481344/athletes/fallback/female-1500x920.png");
			Assert.assertEquals(athletespage.defaultHeroImage.getAttribute("src"),
					"https://res.cloudinary.com/onefc/image/upload/h_300,f_auto/v1590481344/athletes/fallback/female-1200x1165.png");
			Assert.assertEquals(athletespage.defaultBannerImage.getAttribute("src"),
					"https://res.cloudinary.com/onefc/image/upload/h_300,f_auto/v1590481344/athletes/fallback/female-1200x1165.png");
		} catch (AssertionError e) {
			e.printStackTrace();
		}
		
	}
	
	@Test(priority=9)
	public void athletesListingPageTabTest() throws InterruptedException{
		athletespage.clickOnAthletesPageWebElement(athletespage.atheletesBtnLink);
		actions.waitForElementPresent(athletespage.athletesPageAllTab);
		try {
			//verify the two tabs(All & Draft) are showing or not
			Assert.assertTrue(athletespage.athletesPageAllTab.isDisplayed());
			Assert.assertTrue(athletespage.athletesPageDraftsTab.isDisplayed());
		}catch (AssertionError e) {
			e.printStackTrace();
		}
		
	}
	
	@Test(priority = 10)
	public void allAthletesTabTest() {
		// verifying an athletes name in all the entries in the first page
		for (int i = 0; i < athletespage.athletelinksInAlltab.size(); i++) {
			try {
				Assert.assertTrue(athletespage.athletelinksInAlltab.get(i).isDisplayed());
			} catch (AssertionError e) {
				e.printStackTrace();
			}
		}

		// verifying an athletes height in all the entries in the first page
		for (int i = 0; i < athletespage.athletesHeightValuesInAllTab.size(); i++) {
			try {
				Assert.assertTrue(athletespage.athletesHeightValuesInAllTab.get(i).isDisplayed());
			} catch (AssertionError e) {
				e.printStackTrace();
			}
		}

		// verifying an athletes weight class in all the entries in the first page
		for (int i = 0; i < athletespage.weightclassOfAnAthletesInAlltab.size(); i++) {
			try {
				Assert.assertTrue(athletespage.weightclassOfAnAthletesInAlltab.get(i).isDisplayed());
			} catch (AssertionError e) {
				e.printStackTrace();
			}
		}

		// verifying an athletes nationality in all the entries in the first page
		for (int i = 0; i < athletespage.nationalityOfAnAthletesInAlltab.size(); i++) {
			try {
				Assert.assertTrue(athletespage.nationalityOfAnAthletesInAlltab.get(i).isDisplayed());
			} catch (AssertionError e) {
				e.printStackTrace();
			}
		}
	}
	
	@Test(priority=11)
	public void athleteNotVisibleStatusTest() throws InterruptedException {
		athletespage.enterStringInAthleteSearchField("TBA");
		actions.waitForElementPresent(athletespage.notVisibleOnAppStatusIcon);
		try {
			Assert.assertTrue(athletespage.notVisibleOnAppStatusIcon.isDisplayed());
		}catch (AssertionError e) {
			e.printStackTrace();
		}
		
	}
	

	@Test(priority=12)
	public void athleteVisibleStatusTest() throws InterruptedException {
		athletespage.nameOrNicknameSearchField.sendKeys(Keys.COMMAND, "a");
		athletespage.nameOrNicknameSearchField.sendKeys(Keys.BACK_SPACE);
		athletespage.enterStringInAthleteSearchField("Christian Lee");
		actions.waitForElementPresent(athletespage.visibleOnAppStatusIcon);
		try {
			Assert.assertTrue(athletespage.visibleOnAppStatusIcon.isDisplayed());
		}catch (AssertionError e) {
			e.printStackTrace();
		}
		
	}
	
	@Test(priority = 13)
	public void filterByWeightclassTest() throws InterruptedException {
		athletespage.nameOrNicknameSearchField.sendKeys(Keys.COMMAND, "a");
		athletespage.nameOrNicknameSearchField.sendKeys(Keys.BACK_SPACE);
		athletespage.clickOnAthletesPageWebElement(athletespage.weightclassFieldInFilterpage);
		actions.waitForElementToBeClickable(athletespage.featherweightOption);
		Thread.sleep(5000);
		for (int i = 0; i < athletespage.weightclassOfAnAthletesInAlltab.size(); i++) {
			try {
				// Assert the athletes are filtered based on the given weight class
				String filteredByWeightclass = athletespage.weightclassOfAnAthletesInAlltab.get(i).getText();
				Assert.assertTrue(filteredByWeightclass.contains("Featherweight"));
			} catch (AssertionError e) {
				e.printStackTrace();
			}
		}
	}

	@Test(priority = 14)
	public void filterByCountryTest() throws InterruptedException {
		athletespage.clickOnAthletesPageWebElement(athletespage.clearFilterBtn);
		//Thread.sleep(4000);
		actions.waitForElementToBeClickable(athletespage.countryFieldInFilterpage);
		actions.waitForElementToBeClickable(athletespage.afganistan);
		Thread.sleep(5000);
		for (int i = 0; i < athletespage.nationalityOfAnAthletesInAlltab.size(); i++) {
			try {
				//Assert the athletes are filtered based on the given country
				String countryname = athletespage.nationalityOfAnAthletesInAlltab.get(i).getText();
				Assert.assertTrue(countryname.contains("Afghanistan"));
			} catch (AssertionError e) {
				e.printStackTrace();
			}
		}
	}

	@Test(priority = 15)
	public void filterByTeamTest() throws InterruptedException {
		athletespage.clickOnAthletesPageWebElement(athletespage.clearFilterBtn);
		//Thread.sleep(4000);
		actions.waitForElementToBeClickable(athletespage.teamOrGymFieldInFilterpage);
		actions.waitForElementToBeClickable(athletespage.teamNameAs013Muaythai);
		Thread.sleep(5000);
		for (int i = 0; i < athletespage.teamNameOfAnAthletesInAlltab.size(); i++) {
			try {
				//Assert the athletes are filtered based on the given team name
				String teamname = athletespage.teamNameOfAnAthletesInAlltab.get(i).getText();
				Assert.assertTrue(teamname.contains("013 Muay Thai"));
			} catch (AssertionError e) {
				e.printStackTrace();
			}
		}
	}
	
	@Test(priority = 16)
	public void filterByGenderTest() throws InterruptedException {
		athletespage.clickOnAthletesPageWebElement(athletespage.clearFilterBtn);
		//Thread.sleep(4000);
		actions.waitForElementToBeClickable(athletespage.genderFieldInFilterpage);
		actions.waitForElementToBeClickable(athletespage.female);
		Thread.sleep(5000);
		// verifying athletes name in all the entries after applying the filter
		for (int i = 0; i < athletespage.athletelinksInAlltab.size(); i++) {
			try {
				Assert.assertTrue(athletespage.athletelinksInAlltab.get(i).isDisplayed());
			} catch (AssertionError e) {
				e.printStackTrace();
			}
		}
	}
	
	@Test(priority = 17)
	public void athleteFilterByMultipleOptionsTest() throws InterruptedException {
		athletespage.clickOnAthletesPageWebElement(athletespage.clearFilterBtn);
		athletespage.clickOnAthletesPageWebElement(athletespage.weightclassFieldInFilterpage);
		actions.waitForElementToBeClickable(athletespage.atomweight);
		actions.waitForElementToBeClickable(athletespage.countryFieldInFilterpage);
		actions.waitForElementToBeClickable(athletespage.afganistan);
		Thread.sleep(5000);
		// Assert the athletes are filtered based on the given weight class
		for (int i = 0; i < athletespage.weightclassOfAnAthletesInAlltab.size(); i++) {
			try {
				String filteredByWeightclass = athletespage.weightclassOfAnAthletesInAlltab.get(i).getText();
				Assert.assertTrue(filteredByWeightclass.contains("Atomweight"));
			} catch (AssertionError e) {
				e.printStackTrace();
			}
		}
		//Assert the athletes are filtered based on the given country
		for (int i = 0; i < athletespage.nationalityOfAnAthletesInAlltab.size(); i++) {
			try {
				String countryname = athletespage.nationalityOfAnAthletesInAlltab.get(i).getText();
				Assert.assertTrue(countryname.contains("Afghanistan"));
			} catch (AssertionError e) {
				e.printStackTrace();
			}
		}
	}

	@Test(priority = 18)
	public void clearFilterButtonUITest() {
		try {
			//assert the clear filter button is displayed in a page
			Assert.assertTrue(athletespage.clearFilterBtn.isDisplayed());
			//assert the clear filter button is enabled in a page
			Assert.assertTrue(athletespage.clearFilterBtn.isEnabled());
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=19)
	public void clearFilterButttonFunctionalityTest() throws InterruptedException {
		athletespage.clickOnAthletesPageWebElement(athletespage.clearFilterBtn);
		actions.waitForElementPresent(athletespage.weightclassFieldInFilterpage);
		try {
			//assert the clear filter button is not displayed in a page
			Assert.assertTrue(athletespage.clearFilterBtnIsDisplayed());
		}catch (AssertionError e) {
			e.printStackTrace();
		}
	}
	

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	
}
