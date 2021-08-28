package com.atlas.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atlas.automation.base.BaseClass;

public class HomePage extends BaseClass {

	// Object Repository

	@FindBy(xpath = "//button[@aria-label='account of current user']")
	public WebElement userIcon;

	@FindBy(xpath = "//li[contains(text(),'Logout')]")
	public WebElement logoutBtn;

	@FindBy(xpath = "//div[contains(text(),'Coming soon!')]")
	public WebElement homePageText;

	@FindBy(xpath = "//span[contains(text(),'English')]")
	public WebElement defaultLocale;

	@FindBy(xpath = "//a[@class='MuiButtonBase-root MuiListItem-root MuiListItem-gutters MuiListItem-button' and @href='/events']")
	public WebElement eventsBtn;

	@FindBy(xpath = "//a[@class='MuiButtonBase-root MuiListItem-root MuiListItem-gutters MuiListItem-button'  and @href='/athletes']")
	public WebElement athletesBtn;

	@FindBy(xpath = "//a[@href='/athlete-ranking']")
	public WebElement athleteRankingsBtn;

	@FindBy(xpath = "//a[@href='/bout-switching']")
	public WebElement boutSwitchingBtn;

	@FindBy(xpath = "//a[@href='/video/library']")
	public WebElement videoLibraryBtn;

	@FindBy(xpath = "//a[@href='/lpfm/feed']")
	public WebElement lpfmBtn;

	@FindBy(xpath = "//a[@href='/cache-invalidation']")
	public WebElement cacheInvalidationBtn;
	
	public String expHomePageTitle = "ONE - Content Management System";

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String homePageVerification() {
		String title = driver.getTitle();
		return title;

	}

	public EventsPage eventsBtnClick() {
		eventsBtn.click();
		return new EventsPage();
	}

	public AthletesPage athletesBtnClick() {
		athletesBtn.click();
		return new AthletesPage();

	}

	public BoutSwitchingPage boutSwitchingBtnClick() {
		boutSwitchingBtn.click();
		System.out.println(driver.getTitle());
		return new BoutSwitchingPage();
	}

	public VideoLibraryPage videoLibraryBtnClick() {
		videoLibraryBtn.click();
		return new VideoLibraryPage();
	}

	public LpfmPage lpfmBtnClick() {
		lpfmBtn.click();
		return new LpfmPage();
	}

	public CacheInvalidationPage cacheInvalidationBtn() {
		cacheInvalidationBtn.click();
		return new CacheInvalidationPage();
	}

	public LoginPage logoutMethod() {
		userIcon.click();
		logoutBtn.click();
		return new LoginPage();

	}
	
	public  AthleteRankingPage athleteRankingsBtnClick() {
		athleteRankingsBtn.click();
		return new AthleteRankingPage();
	}

}
