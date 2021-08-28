package com.ONESuperApp.tests.android;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ONESuperApp.base.AppiumBaseClass;
import com.ONESuperApp.pageobject.android.AthletesTab;
import com.ONESuperApp.pageobject.android.LanguageSelectionPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AthletesTabTest extends AppiumBaseClass {

	AndroidDriver<AndroidElement> driver;
	@BeforeClass
	public void appLuanch() throws IOException, InterruptedException {
	    driver = Androidcapabilities("ONESuperApp_Android");
		LanguageSelectionPage languageselectionpage = new LanguageSelectionPage(driver);
		languageselectionpage.languageSelectionClick();

	}

	@Test(priority = 1)
	public void athletesTabclick() throws InterruptedException, IOException {
		AthletesTab athletestab = new AthletesTab(driver);
		athletestab.athletesTabNavigation();
		// Verifying the default tab in the athletes tab
		Assert.assertEquals(athletestab.oneRankingsTab.getText(), athletestab.expRankingsTabHeader);
		// Verifying the athletes tab header title
		Assert.assertEquals(athletestab.athletesTabHeader.getText(), athletestab.expathletePageHeader);

	}

	@Test(priority = 2)
	public void championsTabNavigationTest() throws InterruptedException {
		AthletesTab athletestab = new AthletesTab(driver);
		athletestab.championsTabNaviagtion();
		// verifying the champions tab header
		Assert.assertEquals(athletestab.championsTab.getText(), athletestab.expChampionsTabHeader);
	}

	@Test(priority = 3)
	public void allAthletesTabNavigationTest() throws InterruptedException {
		AthletesTab athletestab = new AthletesTab(driver);
		athletestab.allAthletesTabNavigation();
		// verifying the all athletes tab header
		Assert.assertEquals(athletestab.allAthletesTab.getText(), athletestab.expAllAthletesTabHeader);
	}

	@Test(priority = 4)
	public void oneRankingsTabNavigationTest() throws InterruptedException {
		AthletesTab athletestab = new AthletesTab(driver);
		athletestab.oneRankingsTabNavigation();
		// Verifying the default tab in the athletes tab
		Assert.assertEquals(athletestab.oneRankingsTab.getText(), athletestab.expRankingsTabHeader);
		//athletestab.lightweight.click();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
