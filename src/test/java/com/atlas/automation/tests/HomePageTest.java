package com.atlas.automation.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

import com.atlas.automation.actions.WebdriverActions;
import com.atlas.automation.base.BaseClass;
import com.atlas.automation.pages.AthletesPage;
import com.atlas.automation.pages.BoutSwitchingPage;
import com.atlas.automation.pages.CacheInvalidationPage;
import com.atlas.automation.pages.EventsPage;
import com.atlas.automation.pages.HomePage;
import com.atlas.automation.pages.LoginPage;
import com.atlas.automation.pages.LpfmPage;
import com.atlas.automation.pages.VideoLibraryPage;

public class HomePageTest extends BaseClass {
	LoginPage loginpage;
	HomePage homepage;
	EventsPage eventspage;
	AthletesPage athletespage;
	BoutSwitchingPage boutswitchingpage;
	VideoLibraryPage videolibrarypage;
	LpfmPage lpfmpage;
	CacheInvalidationPage cacheinvalidationpage;
	WebdriverActions actions;

	public HomePageTest() {
		super();
	}

	@BeforeClass
	public void setup() throws InterruptedException, IOException {
		initialization();
		loginpage = new LoginPage();
		eventspage = new EventsPage();
		athletespage = new AthletesPage();
		boutswitchingpage = new BoutSwitchingPage();
		videolibrarypage = new VideoLibraryPage();
		lpfmpage = new LpfmPage();
		cacheinvalidationpage = new CacheInvalidationPage();
		actions = new WebdriverActions();
		Thread.sleep(3000);
		homepage = loginpage.loginToApp(prop.getProperty("emailID"), prop.getProperty("password"));

	}

	@Test(priority = 1)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homepage.homePageVerification();
		Assert.assertEquals(homePageTitle, homepage.expHomePageTitle, "Home page title is not matched");
		System.out.println(homePageTitle);

	}

	@Test(priority = 2)
	public void eventsPageNavigationTest() throws InterruptedException, IOException {
		eventspage = homepage.eventsBtnClick();
		AssertJUnit.assertEquals(eventspage.verifyEventsPageTitle(), eventspage.expEventsPageTitle);
		actions.waitForElementPresent(eventspage.eventsPageTitle);
		driver.navigate().back();
	}

	@Test(priority = 3)
	public void athletesPageNavigationTest() throws InterruptedException {
		athletespage = homepage.athletesBtnClick();
		for (int i = 0; i < athletespage.athletelinksInAlltab.size(); i++) {
			Assert.assertTrue(athletespage.athletelinksInAlltab.get(i).isDisplayed());
		}
		Assert.assertEquals(athletespage.verifyAthletesPageTitle(), athletespage.expAthletePageTitle);
		driver.navigate().back();
	}
	
	@Test(priority = 4)
	public void boutSwitchingPageNavigationTest() throws InterruptedException {
		boutswitchingpage = homepage.boutSwitchingBtnClick();
		Thread.sleep(4000);
		driver.navigate().back();
	}

	@Test(priority = 5)
	public void videoLibraryPageNavigationTest() throws InterruptedException {
		videolibrarypage = homepage.videoLibraryBtnClick();
		actions.waitForElementPresent(videolibrarypage.videoLibraryTitle);
		Assert.assertEquals(videolibrarypage.verifyVideoLibraryPageTitle(), videolibrarypage.expVideoLibraryPageTitle);
		driver.navigate().back();
	}

	@Test(priority = 6)
	public void lpfmPageNavigationTest() throws InterruptedException {
		lpfmpage = homepage.lpfmBtnClick();
		actions.waitForElementPresent(lpfmpage.lpfmPageTitle);
		Assert.assertEquals(lpfmpage.verifyLpfmpageTitle(), lpfmpage.expLpfmPageTitle);
		driver.navigate().back();
	}

	@Test(priority = 7)
	public void cacheInvalidationPageNavigationTest() throws InterruptedException {
		cacheinvalidationpage = homepage.cacheInvalidationBtn();
		actions.waitForElementPresent(cacheinvalidationpage.cacheInvalidationPageTitle);
		Assert.assertEquals(cacheinvalidationpage.verifyCacheInvalidationPageTitle(),cacheinvalidationpage.expCacheInvalidationPageTitle );
		driver.navigate().back();
	}

	@Test(priority = 8)
	public void logoutTest() throws InterruptedException {
		loginpage = homepage.logoutMethod();
		actions.acceptAlert(driver);

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
