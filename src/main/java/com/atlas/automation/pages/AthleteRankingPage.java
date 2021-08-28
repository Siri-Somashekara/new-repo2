package com.atlas.automation.pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.atlas.automation.actions.WebdriverActions;
import com.atlas.automation.base.BaseClass;
import com.atlas.automation.pages.AthleteRankingPage;

public class AthleteRankingPage extends BaseClass {
	WebdriverActions actions = new WebdriverActions();
	@FindBy(xpath = "//span[text()='Edit']")
	public WebElement edit;
	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-disableElevation'])[1]")
	public WebElement addNewCategoryBtn;
	@FindBy(xpath = "///a[@href='/athlete-ranking']")
	public WebElement athleteRankingBtn;
	@FindBy(xpath = "//input[@placeholder='Title']")
	public WebElement title;
	@FindBy(xpath = "//div[contains(text(),'Select Weightclass')]")
	public WebElement selectWeightclass;
	@FindBy(xpath = "//div[contains(text(),'Atomweight')]")
	public WebElement atomweight;
	@FindBy(xpath = "//div[contains(text(),'Catchweight')]")
	public WebElement catchweight;
	@FindBy(xpath = "//div[contains(text(),'Anne Line Hogstad')]")
	public WebElement anneLineHogstad;
	@FindBy(xpath = "//div[contains(text(),'Danny Kingad')]")
	public WebElement dannyKingad;
	@FindBy(xpath = "//div[contains(text(),'Fabrice Fairtex Delannon')]")
	public WebElement fabriceFairtexDelannon;
	@FindBy(xpath = "//div[contains(text(),'Detchadin Sornsirisupathin')]")
	public WebElement DetchadinSornsirisupathin;
	@FindBy(xpath = "//div[contains(text(),'Select Gender')]")
	public WebElement selectGender;
	@FindBy(xpath = "//div[contains(text(),'Female')]")
	public WebElement female;
	@FindBy(xpath = "//div[contains(text(),'Select Style')]")
	public WebElement selectStyle;
	@FindBy(xpath = "//div[contains(text(),'Boxing')]")
	public WebElement boxing;
	@FindBy(xpath = "//div[contains(text(),'Dutch Kickboxing')]")
	public WebElement dutchKickboxing;
	@FindBy(xpath = "//div[contains(text(),'Kickboxing')]")
	public WebElement kickboxing;
	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-disableElevation'])[2]")
	public WebElement saveNewCategoryBtn;
	@FindBy(xpath = "//span[text()='Save']")
	public WebElement save;
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-disableElevation']")
	public WebElement saveNewCategoryBtnLocale;
	@FindBy(xpath = "(//div[@class='MuiFormControl-root MuiFormControl-fullWidth'])[1]")
	public WebElement searchWeightclass;
	@FindBy(xpath = "(//div[@class='MuiFormControl-root MuiFormControl-fullWidth'])[3]")
	public WebElement searchStyle;
	@FindBy(xpath = "(//div[@class='MuiFormControl-root MuiFormControl-fullWidth'])[2]")
	public WebElement searchGender;
	@FindBy(xpath = "(//div[@class='MuiFormControl-root MuiFormControl-fullWidth'])[4]")
	public WebElement champion;
	@FindBy(xpath = "//div[contains(text(),'* Athlete To Be Decided *')]")
	public WebElement deletechamp;
	@FindBy(xpath = "//div[contains(text(),'Adib Sulaiman')]")
	public WebElement adibSulaiman;
	@FindBy(xpath = "//span[text()='Add new ranker']")
	public WebElement addNewRank;
	@FindBy(xpath = "//div[contains(text(),'Select Athlete')]")
	public WebElement selectAthlete;
	@FindBy(xpath = "//div[contains(text(),'Adi Nugroho')]")
	public WebElement adiNugroho;
	@FindBy(xpath = "//div[contains(text(),'Abro')]")
	public WebElement abro;
	@FindBy(xpath = "//div[contains(text(),'Abro Fernandes')]")
	public WebElement abroFernandes;
	@FindBy(xpath = "//div[contains(text(),'AJ Lias  Mansor')]")
	public WebElement ajLiasMansor;
	@FindBy(xpath = "//div[contains(text(),'Adi Paryanto')]")
	public WebElement adiParyanto;
	@FindBy(xpath = "//div[text()='Adriano Moraes']")
	public WebElement adrianoMoraes;
	@FindBy(xpath = " (//button[@class='MuiButtonBase-root MuiIconButton-root'])[2]")
	public WebElement deleteRank;
	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-disableElevation'])[1]")
	public WebElement reorderRank;
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-disableElevation Mui-disabled Mui-disabled']")
	public WebElement childLocaleReorderRank;
	@FindBy(xpath = "//span[text()='Reorder Categories']")
	public WebElement reorder;
	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-disableElevation'])[3]")
	public WebElement cancelReorderRank;
	@FindBy(xpath = "(//div[@class='MuiGrid-root MuiGrid-container MuiGrid-wrap-xs-nowrap MuiGrid-align-items-xs-center'])[1]")
	public WebElement category1;
	@FindBy(xpath = "(//div[@class='MuiGrid-root MuiGrid-container MuiGrid-wrap-xs-nowrap MuiGrid-align-items-xs-center'])[3]")
	public WebElement category2;
	@FindBy(xpath = " (//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-disableElevation'])[3]")
	public WebElement reorderSave;
	@FindBy(xpath = "(//span[text()='TITLE'])[1]")
	public WebElement confirmTitle;
	@FindBy(xpath = " (//span[text()='WEIGHTCLASS'])[1]")
	public WebElement confirmWeightclass;
	@FindBy(xpath = " (//span[text()='GENDER'])[1]")
	public WebElement confirmGender;
	@FindBy(xpath = " (//span[text()='STYLE'])[1]")
	public WebElement confirmStyle;
	@FindBy(xpath = "//span[text()='Cancel']")
	public WebElement cancel;
	@FindBy(xpath = "(//span[text()='Cancel'])[2]")
	public WebElement reodercancel;
	@FindBy(xpath = "//span[text()='Done']")
	public WebElement reoderDone;
	@FindBy(xpath = "//div[contains(text(),'Select Style')]")
	public WebElement style;
	@FindBy(xpath = "//div[contains(text(),'Mixed Martial Arts')]")
	public WebElement mixedMartialArts;
	@FindBy(xpath = "//div[contains(text(),'Select Weightclass')]")
	public WebElement weightclass;
	@FindBy(xpath = "//div[contains(text(),'Featherweight')]")
	public WebElement featherweight;
	@FindBy(xpath = "//div[contains(text(),'Gender')]")
	public WebElement gender;
	@FindBy(xpath = "//div[contains(text(),'Male')]")
	public WebElement male;
	@FindBy(xpath = "//label[text()='Title is a required field.']")
	public WebElement titleRequired;
	@FindBy(xpath = "//p[contains(text(),'Weightclass is a required field.')]")
	public WebElement weightclassRequired;
	@FindBy(xpath = "//p[contains(text(),'Gender is a required field.')]")
	public WebElement genderRequired;
	@FindBy(xpath = "//p[contains(text(),'Style is a required field.')]")
	public WebElement styleRequired;
	@FindBy(xpath = "//p[contains(text(),'Please select an athlete.')]")
	public WebElement athleteRequired;
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']")
	public WebElement confirmAddNewRank;
	@FindBy(xpath = "//span[text()='3']")
	public WebElement athleteRank1;
	@FindBy(xpath = "//span[text()='2']")
	public WebElement athleteRank2;
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-colorInherit MuiButton-disableElevation']")
	public WebElement localeselection;
	@FindBy(xpath = "//li[text()='Hindi']")
	public WebElement hindiLocale;
	@FindBy(xpath = "//li[text()='Bahasa']")
	public WebElement bahasaLocale;
	@FindBy(xpath = "//li[text()='English']")
	public WebElement englishLocale;
	@FindBy(xpath = "//li[text()='Khmer']")
	public WebElement khmerLocale;
	@FindBy(xpath = "//strong[text()='Strawweight']")
	public WebElement confirmtitleupdate;
	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root'])[1]")
	public WebElement deletecancel;
	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root'])[4]")
	public WebElement deletewithoutathletecancel;
	@FindBy(xpath = "(//div[@class='MuiFormControl-root MuiFormControl-fullWidth'])[1]")
	public WebElement Weightclassedit;
	@FindBy(xpath = "(//div[@class='MuiFormControl-root MuiFormControl-fullWidth'])[2]")
	public WebElement genderedit;
	@FindBy(xpath = "(//div[@class='MuiFormControl-root MuiFormControl-fullWidth'])[3]")
	public WebElement styleedit;
	@FindBy(xpath = "//strong[text()='Featherweight']")
	public WebElement confirmweightclassupdate;
	@FindBy(xpath = "//div[text()='Adi Paryanto']")
	public WebElement confirmwathleteupdate;
	@FindBy(xpath = "//strong[text()='Mixed Martial Arts']")
	public WebElement ConfirmStyleupdate;
	@FindBy(xpath = "//strong[text()='Female']")
	public WebElement confirmGenderupdate;
	@FindBy(xpath = "//div[text()='No rankers to list.']")
	public WebElement norankAdded;
	@FindBy(xpath = "//p[text()='AJ Lias  Mansor']")
	public WebElement athlete;
	@FindBy(xpath = "//strong[text()='HeavyWeightTest']")
	public WebElement tilteadd;
	@FindBy(xpath = "//strong[text()='Boxing']")
	public WebElement Styleadd;
	@FindBy(xpath = "//strong[text()='Atomweight']")
	public WebElement weightclassadd;
	@FindBy(xpath = "//strong[text()='Adib Sulaiman']")
	public WebElement championadd;
	@FindBy(xpath = "//span[text()='1']")
	public WebElement rank1;
	@FindBy(xpath = "//span[text()='2']")
	public WebElement rank2;
	@FindBy(xpath = "//span[text()='3']")
	public WebElement rank3;
	@FindBy(xpath = "//span[text()='4']")
	public WebElement rank4;
	@FindBy(xpath = "(//span[text()='Edit this category'])[10]")
	public WebElement editcategory10;
	@FindBy(xpath = "(//span[text()='Edit this category'])[1]")
	public WebElement editcategory1;
	@FindBy(xpath = "//h2[text()='AJ Lias  Mansor']")
	public WebElement athletepage;
	@FindBy(xpath = "(//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft'])[2]")
	public WebElement athleteReplace;
	@FindBy(xpath = "(//div[@class='MuiFormControl-root MuiFormControl-fullWidth'])[1]")
	public WebElement weightclassreplace;
	@FindBy(xpath = "//span[text()='Changes saved successfully!']")
	public WebElement changesSaved;
	@FindBy(xpath = "//img[@src='//res.cloudinary.com/dq0uhpprk/image/upload/h_300,f_auto/v1575444123/athlete/sample/AdiParyanto83030b65-2494-40dc-81c4-4c47452899d6.png' and @alt='Adi Paryanto']")
	public WebElement bio;
	@FindBy(xpath = "//img[@src='https://res.cloudinary.com/onefc/image/upload/h_300,f_auto/v1590481350/athletes/fallback/male-1500x920.png' and @alt='Adi Paryanto']")
	public WebElement bioAlternateImage;
	@FindBy(xpath = "//div[contains(text(),'No matching athlete found.')]")
	public WebElement nomatchingathletefound;
	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1'])[1]")
	public WebElement titleadded;
	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1'])[4]")
	public WebElement styleadded;
	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1'])[2]")
	public WebElement weightclassadded;
	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1'])[3]")
	public WebElement genderadded;
	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body2'])[1]")
	public WebElement rankNO1;
	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body2'])[2]")
	public WebElement rankNO2;
	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body2'])[3]")
	public WebElement rankNO3;
	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body2'])[4]")
	public WebElement rankNO4;
	@FindBy(xpath = "//strong[text()='Adi Nugroho']")
	public WebElement noti;
	@FindBy(xpath = "//strong[text()='AJ Lias  Mansor']")
	public WebElement noti1;
	@FindBy(xpath = " (//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorInherit'])[1]")
	public WebElement notification;
	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body2'] )[3]")
	public WebElement rankcompare;
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-disableElevation Mui-disabled Mui-disabled']")
	public WebElement childlocaleAddNewCategoryBtn;
	public String expAthleteRankingTitleHeavyweight = "HeavyWeight1";
	public String expAthleteRankingTitleFlyweight = "FlyWeight";
	public String expAthleteRankingTitleAtomweight = "Atomweight";
	public String expAthleteRankingTitleWomensHeavyweight = "Women's HeavyWeight";
	public String expAthleteRankingTitleWomensHeavyweightKickboxing = "Women's HeavyWeight Kickboxing";
	public String expAthleteRankingTitleWonensAtomweight = "Women's Atomweight";
	public String expAthleteRankingTitleFlyweightBoxing = "Flyweight Boxing";
	public String expStyleEnglishLocale = "Boxing";
	public String expStyleHindiLocale = "बॉक्सिंग";
	public String expStyleKhmerLocale = "ថិនជូ";
	public String expStyleBahasaLocale = "Tinju";
	public String expGenderEnglishLocale = "Female";
	public String expGenderHindiLocale = "महिला";
	public String expGenderBahasaLocale = "Wanita";
	public String expGenderKhmerLocale = "នារី";
	public String expWeightclassEnglishLocale = "Atomweight";
	public String expWeightclassHindiLocale = "एटमवेट";
	public String expWeightclassBahasaLocale = "Atomweight";
	public String expWeightclassKhmerLocale = "Atomweight";
	public String expRank1HindiLocale = "Adi Nugroho";
	public String expRank2HindiLocale = "Abro Fernandes";
	public String expRank3HindiLocale = "AJ Lias Mansor";
	public String expRank4HindiLocale = "Adi Paryanto";
	public String expRank1BahasaandkhmerLocale = "Adi Nugroho";
	public String expRank2BahasaandkhmerLocale = "Abro Fernandes";
	public String expRank3BahasaandkhmerLocale = "AJ Lias Mansor";
	public String expRank4BahasaandkhmerLocale = "Adi Paryanto";
	public String expeditedRank2 = "AJ Lias Mansor";
	public String expdRank2 = "Abro Fernandes";

	public AthleteRankingPage() {
		PageFactory.initElements(driver, this);
	}

	public void selectWeightclass() throws InterruptedException {
		actions.waitForElementToBeClickable(selectWeightclass);
		actions.waitForElementToBeClickable(atomweight);

	}

	public void selectGender() throws InterruptedException {
		actions.waitForElementToBeClickable(selectGender);
		actions.waitForElementToBeClickable(female);
	}

	public void selectGenderMale() throws InterruptedException {
		actions.waitForElementToBeClickable(selectGender);
		actions.waitForElementToBeClickable(male);
	}

	public void selectstyle() throws InterruptedException {
		actions.waitForElementToBeClickable(selectStyle);
		actions.waitForElementToBeClickable(boxing);
		boxing.click();
	}

	public void selectchampion() throws InterruptedException {
		actions.waitForElementToBeClickable(champion);
		actions.waitForElementToBeClickable(adibSulaiman);
	}

	public void deletechampion() throws InterruptedException {
		actions.waitForElementToBeClickable(champion);
		actions.waitForElementToBeClickable(deletechamp);
	}

	public void rank1() throws InterruptedException {
		actions.waitForElementToBeClickable(addNewRank);
		actions.waitForElementToBeClickable(selectAthlete);
		actions.waitForElementToBeClickable(adiNugroho);
	}

	public void rank2() throws InterruptedException {
		actions.waitForElementToBeClickable(addNewRank);
		actions.waitForElementToBeClickable(selectAthlete);
		actions.waitForElementToBeClickable(abroFernandes);
	}

	public void rank3() throws InterruptedException {
		actions.waitForElementToBeClickable(addNewRank);
		actions.waitForElementToBeClickable(selectAthlete);
		actions.waitForElementToBeClickable(ajLiasMansor);
	}

	public void rank4() throws InterruptedException {
		actions.waitForElementToBeClickable(addNewRank);
		actions.waitForElementToBeClickable(selectAthlete);
		actions.waitForElementToBeClickable(adiParyanto);
	}

	public void rank5() throws InterruptedException {
		actions.waitForElementToBeClickable(athleteReplace);
		actions.waitForElementToBeClickable(adrianoMoraes);
	}

	public void weightClassEdit() throws InterruptedException {
		actions.waitForElementToBeClickable(Weightclassedit);
		actions.waitForElementToBeClickable(featherweight);
	}

	public void styleEdit() throws InterruptedException {
		actions.waitForElementToBeClickable(styleedit);
		actions.waitForElementToBeClickable(mixedMartialArts);
	}

	public void selectgender() throws InterruptedException {
		actions.waitForElementToBeClickable(gender);
		actions.waitForElementToBeClickable(female);
		gender.click();
	}

	public void genderEdit() throws InterruptedException {
		actions.waitForElementToBeClickable(genderedit);
		actions.waitForElementToBeClickable(male);
	}

	public void searchAthlete() throws InterruptedException {
		actions.waitForElementToBeClickable(athleteReplace);
		actions.searchDropdownOptions(athleteReplace, "Adi");
	}

	public void searchstyle() throws InterruptedException {
		actions.waitForElementToBeClickable(selectStyle);
		actions.searchDropdownOptions(selectStyle, "Box");
	}

	public void searchGender() throws InterruptedException {
		actions.waitForElementToBeClickable(searchGender);
		actions.searchDropdownOptions(searchGender, "Fe");
	}

	public void searchWeightclass() throws InterruptedException {
		actions.waitForElementToBeClickable(searchWeightclass);
		actions.searchDropdownOptions(searchWeightclass, "at");
	}

	public void englishlocale() throws InterruptedException {
		actions.waitForElementToBeClickable(localeselection);
		actions.waitForElementToBeClickable(englishLocale);
	}

	public void hindilocale() throws InterruptedException {
		actions.waitForElementToBeClickable(localeselection);
		actions.waitForElementToBeClickable(hindiLocale);
	}

	public void bahasalocale() throws InterruptedException {
		actions.waitForElementToBeClickable(localeselection);
		actions.waitForElementToBeClickable(bahasaLocale);
	}

	public void khmerlocale() throws InterruptedException {
		actions.waitForElementToBeClickable(localeselection);
		actions.waitForElementToBeClickable(khmerLocale);
	}

	public void editBtn() throws InterruptedException {
		actions.waitForElementToBeClickable(edit);
	}

	public void addNewCategoryBtn() throws InterruptedException {
		actions.waitForElementToBeClickable(addNewCategoryBtn);
	}

	public void editCategoryBtn() throws InterruptedException {
		actions.waitForElementToBeClickable(editcategory1);
	}

	public void editcancelBtn() throws InterruptedException {
		actions.waitForElementToBeClickable(cancel);
	}

	public void saveBtn() throws InterruptedException {
		actions.waitForElementToBeClickable(save);
	}

	public void saveNewCategoryBtnLocale() throws InterruptedException {
		actions.waitForElementToBeClickable(saveNewCategoryBtnLocale);
	}

	public void clearTitle() throws InterruptedException {
		while (!title.getAttribute("value").equals("")) {
			title.sendKeys(Keys.BACK_SPACE);
		}
	}

	public void TitleEdit() throws InterruptedException {
		title.sendKeys("Strawweight");
		actions.waitForElementToBeClickable(saveNewCategoryBtnLocale);
	}

	public void duplicateathleteaddition() throws InterruptedException {
		actions.waitForElementToBeClickable(addNewRank);
		actions.waitForElementToBeClickable(selectAthlete);
		actions.searchDropdownOptions(selectAthlete, "Adi Paryanto");
	}
}
