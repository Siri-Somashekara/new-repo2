package com.ONESuperApp.pageobject.ios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ONESuperApp.base.AppiumBaseClass;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AthletesTab extends AppiumBaseClass {

	public AthletesTab(IOSDriver<IOSElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	WebDriverWait wait = new WebDriverWait(iOSdriver,20);

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"More, tab, 5 of 5\"]")
	public WebElement athletesTab;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"ONE Rankings\"]")
	public WebElement oneRankingsTab;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Champions\"]")
	public WebElement championsTab;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"All Athletes\"]")
	public WebElement allAthletesTab;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"headerTitle\"]")
	public WebElement athletesTabHeader;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name=\"Panpayak Jitmuangnon Jitmuangnon Gym FLYWEIGHT Muay Thai 443 - 40 - 3 From Thailand FOLLOW\"])[2]")
	public WebElement Athleteclick;

	@FindBy(xpath = "//*[@text='All Athletes']")
	public WebElement allAthletesTabHeader;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Info\"]")
	public WebElement athleteInfoConfirm;
	
	public String expathletePageHeader="ATHLETES";
	public String expRankingsTabHeader="ONE Rankings";
	public String expAllAthletesTabHeader="All Athletes";
	public String expChampionsTabHeader="Champions";
	

	public void athletesTabNavigation() {
		wait.until(ExpectedConditions.elementToBeClickable(athletesTab));
		athletesTab.click();
	}

	public void championsTabNaviagtion() {
		championsTab.click();
	}

	public void allAthletesTabNavigation() {
		allAthletesTab.click();
	}

	public void oneRankingsTabNavigation() {
		oneRankingsTab.click();
	}
	

}
