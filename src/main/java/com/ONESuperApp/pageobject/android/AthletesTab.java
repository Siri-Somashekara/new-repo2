package com.ONESuperApp.pageobject.android;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ONESuperApp.base.AppiumBaseClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AthletesTab extends AppiumBaseClass {

	public AthletesTab(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	WebDriverWait wait= new WebDriverWait(Androiddriver,20);

	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"More, tab, 5 of 5\"]")
	public WebElement athletesTab;

	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"ONE Rankings\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	public WebElement oneRankingsTab;

	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Champions\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	public WebElement championsTab;

	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"All Athletes\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	public WebElement allAthletesTab;

	@AndroidFindBy(xpath = "//*[@text='ATHLETES']")
	public WebElement athletesTabHeader;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView")
	public WebElement Athleteclick;

	@AndroidFindBy(xpath = "//*[@text='All Athletes']")
	public WebElement allAthletesTabHeader;

	@AndroidFindBy(xpath = "//*[@text='Info']")
	public WebElement athleteInfoConfirm;
	
	@AndroidFindBy(xpath= "//*[@text='STRAWWEIGHT KICKBOXING']")
	public WebElement strawweightKickboxing;
	
	@AndroidFindBy(xpath="//*[@text='LIGHTWEIGHT']")
	public WebElement lightweight;

	public String expathletePageHeader="ATHLETES";
	public String expRankingsTabHeader="ONE Rankings";
	public String expAllAthletesTabHeader="All Athletes";
	public String expChampionsTabHeader="Champions";
	
	public void athletesTabNavigation() 
	{
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
