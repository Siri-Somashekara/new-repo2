package com.ONESuperApp.tests.ios;

import java.io.IOException;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ONESuperApp.base.AppiumBaseClass;
import com.ONESuperApp.pageobject.ios.AthletesTab;
import com.ONESuperApp.pageobject.ios.LanguageSelectionPage;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class AthletesTabTest extends AppiumBaseClass {

	IOSDriver<IOSElement> driver;
	@BeforeClass
	public void appLuanch() throws IOException, InterruptedException {
	    driver = iOScapabilities("ONESuperApp_iOS");
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
		Assert.assertEquals(athletestab.athletesTabHeader.getText(),athletestab.expathletePageHeader);

	}

	@Test(priority = 2)
	public void championsTabNavigationTest() throws InterruptedException {
		AthletesTab athletestab = new AthletesTab(driver);
		athletestab.championsTabNaviagtion();
		// verifying the champions tab header
		Assert.assertEquals(athletestab.championsTab.getText(), athletestab.expChampionsTabHeader);
		System.out.println(athletestab.championsTab.getText());
	}

	@Test(priority = 3)
	public void allAthletesTabNavigationTest() throws InterruptedException {
		AthletesTab athletestab = new AthletesTab(driver);
		athletestab.allAthletesTabNavigation();
		// verifying the all athletes tab header
		Assert.assertEquals(athletestab.allAthletesTab.getText(),athletestab.expAllAthletesTabHeader);
		System.out.println(athletestab.allAthletesTab.getText());
	}

	@Test(priority = 4)
	public void oneRankingsTabNavigationTest() throws InterruptedException {
		AthletesTab athletestab = new AthletesTab(driver);
		athletestab.oneRankingsTabNavigation();
		// Verifying the default tab in the athletes tab
		Assert.assertEquals(athletestab.oneRankingsTab.getText(),athletestab.expRankingsTabHeader);
		System.out.println(athletestab.oneRankingsTab.getText());
		//athletestab.lightweight.click();
	}
	


	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
