package com.atlas.automation.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.atlas.automation.actions.WebdriverActions;
import com.atlas.automation.base.BaseClass;

public class AthletesPage extends BaseClass {

	WebdriverActions actions = new WebdriverActions();

	@FindBy(xpath = "//h2[contains(text(),'Athletes')]")
	public WebElement athletesPageTitle;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']")
	public WebElement addAthletesBtn;

	@FindBy(xpath = "//h6[contains(text(),'Add Athlete')]")
	public WebElement addAthletePopupHeader;

	@FindBy(xpath = "//input[@placeholder='First Name']")
	public WebElement firstName;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	public WebElement lastName;

	@FindBy(xpath = "//input[@placeholder='Date of Birth (YYYY-MM-DD)']")
	public WebElement athleteDob;

	@FindBy(xpath = "//input[@placeholder='Height (CM)']")
	public WebElement athleteHeight;

	@FindBy(xpath = "//div[contains(text(),'Select Nationality')]")
	public WebElement nationality;

	@FindBy(xpath = "//div[contains(text(),'Afghanistan')]")
	public WebElement afganistan;

	@FindBy(xpath = "//div[contains(text(),'Singapore')]")
	public WebElement singapore;
	
	@FindBy(id="react-select-4-option-13")
	public WebElement australia;

	@FindBy(xpath = "//div[contains(text(),'Select Gender')]")
	public WebElement gender;

	@FindBy(xpath = "//div[contains(text(),'Male')]")
	public WebElement male;

	@FindBy(xpath = "//div[contains(text(),'Select Weightclass')]")
	public WebElement weightclass;

	@FindBy(xpath = "//div[contains(text(),'Atomweight')]")
	public WebElement atomweight;

	@FindBy(xpath = "//div[contains(text(),'Select Team/Gym')]")
	public WebElement selectTeamField;

	@FindBy(xpath = "//div[contains(text(),'013 Muay Thai')]")
	public WebElement teamNameAs013Muaythai;

	@FindBy(xpath = "//div[contains(text(),'Petchyindee Academy')]")
	public WebElement teamNameAsPetchyindeeAcademy;

	@FindBy(xpath = "//p[contains(text(),'013 Muay Thai')]")
	public WebElement verifyTeamNameAs013Muaythai;

	@FindBy(xpath = "//p[contains(text(),'Mixed Martial Arts')]")
	public WebElement verifyAthleteStyleAsMMA;

	@FindBy(xpath = "//div[contains(text(),'Select styles')]")
	public WebElement selectStylesField;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-disableElevation']")
	public WebElement saveAndProceed;

	@FindBy(xpath = "//*[text()='Athlete details updated successfully.']")
	public WebElement confirmationPopupTextForSave;

	@FindBy(xpath = "//*[text()='Athlete created successfully.']")
	public WebElement confirmationPopupTextForAthleteCreation;

	@FindBy(xpath = "//*[text()='Athlete updated successfully.']")
	public WebElement confirmationPopupTextForAthleteUpdate;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-disableElevation']")
	public WebElement addAthleteCancelBtn;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-disableElevation']")
	public WebElement publishBtn;

	@FindBy(xpath = "//span[contains(text(),'Confirm')]")
	public WebElement confirmPublishBtn;

	@FindBy(xpath = "//h6[text()='BASIC DETAILS']/../following-sibling::div[1]/div[1]/div[1]/button")
	public WebElement basicDetailsEditBtn;

	@FindBy(xpath = "//h6[text()='LIFETIME RECORDS']/../following-sibling::div[1]/div[1]/div[1]/button")
	public WebElement lifetimeRecordsEditBtn;

	@FindBy(xpath = "//h6[text()='SOCIAL PROFILES']/../following-sibling::div[1]/div[1]/div[1]/button")
	public WebElement socialProfilesEditBtn;

	@FindBy(xpath = "//h6[text()='CHAMPIONSHIPS']/../following-sibling::div[1]/div[1]/div[1]/button")
	public WebElement championshipsEditBtn;

	@FindBy(xpath = "//h6[text()='TITLES']/../following-sibling::div[1]/div[1]/div[1]/button")
	public WebElement titlesEditBtn;

	@FindBy(xpath = "//h6[text()='BIO']/../following-sibling::div[1]/div[1]/div[1]/button")
	public WebElement athleteBioEditBtn;

	@FindBy(xpath = "//div[contains(text(),'Select Record Type')]")
	public WebElement selectRecordType;

	@FindBy(xpath = "//p[contains(text(),'Record type is a required field.')]")
	public WebElement errorMsgInRecordType;

	@FindBy(xpath = "//div[contains(text(),'Muay Thai/Kickboxing')]")
	public WebElement muaythaiAndKickboxingRecordType;

	@FindBy(xpath = "//div[contains(text(),'Mixed Martial Arts')]")
	public WebElement mixedMartialArtsRecordType;

	@FindBy(xpath = "//tr[1]//input[@placeholder='Wins']")
	public WebElement firstRowWins;

	@FindBy(xpath = "//tr[1]//input[@placeholder='Losses']")
	public WebElement firstRowLosses;

	@FindBy(xpath = "//tr[1]//input[@placeholder='Draws']")
	public WebElement firstRowDraws;

	@FindBy(xpath = "//tr[1]//td[5]//input[@class='jss465' and @type='checkbox']")
	public WebElement firstRecordVisibleStatusCheckbox;

	@FindBy(xpath = "//tr[2]/td[5]/span[1]/span[1]")
	public WebElement secondRecordVisibleStatusCheckbox;

	@FindBy(xpath = "//tr[2]/td[5]/*[@class='MuiSvgIcon-root MuiSvgIcon-colorSecondary']")
	public WebElement confirmSecondRecordVisibleStatusIsTrue;

	@FindBy(xpath = "//tr[2]/td[5]/*[@class='MuiSvgIcon-root']")
	public WebElement confirmSecondRecordVisibleStatusIsFalse;

	@FindBy(xpath = "//tr[2]//input[@placeholder='Wins']")
	public WebElement secondRowWins;

	@FindBy(xpath = "//tr[2]//input[@placeholder='Losses']")
	public WebElement secondRowLosses;

	@FindBy(xpath = "//tr[2]//input[@placeholder='Draws']")
	public WebElement secondRowDraws;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']")
	public List<WebElement> saveAndAddBtns; // 0th button is save and 1st button is add button in any of the section

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation Mui-disabled Mui-disabled']")
	public WebElement disabledSaveBtn;

	@FindBy(xpath = "//tr[1]//td[contains(text(),'Muay Thai/Kickboxing')]")
	public WebElement confirmmuaythaiAndKickboxingRecordType;

	@FindBy(xpath = "//tr[2]//td[contains(text(),'Mixed Martial Arts')]")
	public WebElement confirmMixedMartialArtsRecordType;

	@FindBy(xpath = "//div[contains(text(),'There are no records to display!')]")
	public WebElement emptyDataInRecords;

	@FindBy(xpath = "//p[contains(text(),'All changes published.')]")
	public WebElement afterPublishConfirmationText;

	@FindBy(xpath = "//p[contains(text(),'Chris')]")
	public WebElement firstnameConfirmation;

	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1' and contains(text(),'Afghanistan')]")
	public WebElement countrynameConfirmation;

	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1' and contains(text(),'Singapore')]")
	public WebElement singaporeAscountrynameConfirmation;

	@FindBy(xpath = "//p[contains(text(),'1990-02-07')]")
	public WebElement dobConfirmation;

	@FindBy(xpath = "//p[contains(text(),'Male')]")
	public WebElement genderConfirmation;

	@FindBy(xpath = "//p[text()='165']")
	public WebElement heightvalueConfirmation;

	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1' and contains(text(),'Atomweight')]")
	public WebElement WeightclassConfirmation;

	@FindBy(xpath = "//div[contains(text(),'Select Profile')]")
	public WebElement selectProfile;

	@FindBy(xpath = "//*[text()='Facebook']")
	public WebElement facebookProfileOption;

	@FindBy(xpath = "//input[@placeholder='Facebook URL']")
	public WebElement facebookUrlField;

	@FindBy(xpath = "//a[@href='https://www.facebook.com']")
	public WebElement confirmFacebookProfile;

	@FindBy(xpath = "//a[@href='https://www.facebook.com/ONEChampionship/']")
	public WebElement confirmUpdatedFacebookProfile;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']")
	public WebElement cancelBtn; // xpath is same for all the sections in the athlete details page

	@FindBy(xpath = "//*[text()='Twitter']")
	public WebElement twitterProfileOption;

	@FindBy(xpath = "//input[@placeholder='Twitter URL']")
	public WebElement twitterUrlField;

	@FindBy(xpath = "//a[@href='https://www.twitter.com']")
	public WebElement confirmTwitterProfile;

	@FindBy(xpath = "//a[@href='https://www.twitter.com/ONEChampionship']")
	public WebElement confirmUpdatedTwitterProfile;

	@FindBy(xpath = "//*[text()='Instagram']")
	public WebElement instagramProfileOption;

	@FindBy(xpath = "//input[@placeholder='Instagram URL']")
	public WebElement instagramUrlField;

	@FindBy(xpath = "//a[@href='https://www.instagram.com']")
	public WebElement confirmInstagramProfile;

	@FindBy(xpath = "//a[@href='https://www.instagram.com/rodtang_jimungnon/']")
	public WebElement confirmUpdatedInstagramProfile;

	@FindBy(xpath = "//div[contains(text(),'There are no social profiles to display!')]")
	public WebElement emptyDataInSocialProfiles;

	@FindBy(xpath = "//p[contains(text(),'Please enter a valid facebook url.')]")
	public WebElement errorMsgOnFbField;

	@FindBy(xpath = "//tr[1]//div[contains(text(),'Select Championship Type')]")
	public WebElement selectChampionshipType;

	@FindBy(xpath = "//tr[2]//div[contains(text(),'Select Championship Type')]")
	public WebElement secondRowSelectChampionshipType;

	@FindBy(xpath = "//div[contains(text(),'World Championship')]")
	public WebElement worldChampionshipOption;

	@FindBy(xpath = "//tr[2]//div[contains(text(),'World Championship')]")
	public WebElement secondRowWorldChampionshipOption;

	@FindBy(xpath = "//div[contains(text(),'World Grand Prix Championship')]")
	public WebElement worldGrandPrixChampionshipOption;

	@FindBy(xpath = "//tr[1]//div[contains(text(),'Select Weightclass')]")
	public WebElement selectWeightclass;

	@FindBy(xpath = "//tr[2]//div[contains(text(),'Select Weightclass')]")
	public WebElement secondRowSelectWeightclass;

	@FindBy(xpath = "//div[contains(text(),'Featherweight')]")
	public WebElement featherweightOption;

	@FindBy(xpath = "//div[contains(text(),'Bantamweight')]")
	public WebElement bantamweightOption;

	@FindBy(xpath = "//div[contains(text(),'Flyweight')]")
	public WebElement secondRowFlyweightOption;

	@FindBy(xpath = "//tr[1]//div[contains(text(),'Select style')]")
	public WebElement selectStyleOption;

	@FindBy(xpath = "//tr[2]//div[contains(text(),'Select style')]")
	public WebElement secondRowSelectStyleOption;

	@FindBy(xpath = "//div[contains(text(),'Mixed Martial Arts')]")
	public WebElement mixedMartialArtsStyle;

	@FindBy(xpath = "//div[contains(text(),'BJJ')]")
	public WebElement bjjStyle;

	@FindBy(xpath = "//div[text()='Muay Thai']")
	public WebElement muaythaiStyle;

	@FindBy(xpath = "//*[@title='Chris is ONE Champion.']")
	public WebElement championLogoBtn;

	@FindBy(xpath = "//tr[1]/td[contains(text(),'World Championship')]")
	public WebElement verifyChampionshipType;

	@FindBy(xpath = "//tr[2]/td[contains(text(),'World Championship')]")
	public WebElement verifySecondRowChampionshipTypeAsWorldchampionship;

	@FindBy(xpath = "//tr[1]/td[contains(text(),'Featherweight')]")
	public WebElement verifyChampionshipWeightclass;

	@FindBy(xpath = "//tr[1]/td[contains(text(),'Bantamweight')]")
	public WebElement verifyChampionshipWeightclassAsBantamweight;

	@FindBy(xpath = "//tr[1]/td[contains(text(),'Mixed Martial Arts')]")
	public WebElement verifyChampionshipStyle;

	@FindBy(xpath = "//tr[1]/td[text()='Muay Thai']")
	public WebElement verifyChampionshipStyleAsMuaythai;

	@FindBy(xpath = "//tr[2]/td[contains(text(),'BJJ')]")
	public WebElement verifySecondRowChampionshipStyleAsBJJ;

	@FindBy(xpath = "//tr[2]/td[contains(text(),'Mixed Martial Arts')]")
	public WebElement verifySecondRowChampionshipStyleAsMMA;

	@FindBy(xpath = "//tr[2]/td[contains(text(),'World Grand Prix Championship')]")
	public WebElement verifySecondRowChampionshipTypeAsWorldGrandPrix;

	@FindBy(xpath = "//tr[2]/td[contains(text(),'Featherweight')]")
	public WebElement verifySecondRowChampionshipWeightclass;

	@FindBy(xpath = "//tr[2]//td[contains(text(),'Flyweight')]")
	public WebElement verifySecondRowChampionshipWeightclassAsFlyweight;

	@FindBy(xpath = "//tr[2]/td[contains(text(),'Bjj')]")
	public WebElement verifyChampionshipStyleAsBjj;

	@FindBy(xpath = "//p[contains(text(),'Championship type is a required field.')]")
	public WebElement errorMsgInChampionshipType;

	@FindBy(xpath = "//p[contains(text(),'Weightclass is a required field.')]")
	public WebElement errorMsgInChampionshipWeightclass;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root']")
	public WebElement deleteBtn;

	@FindBy(xpath = "//tr[1]//button[@class='MuiButtonBase-root MuiIconButton-root']")
	public WebElement firstRowDeleteBtn;

	@FindBy(xpath = "//tr[2]//button[@class='MuiButtonBase-root MuiIconButton-root']")
	public WebElement secondRowDeleteBtn;

	@FindBy(xpath = "//tr[3]//button[@class='MuiButtonBase-root MuiIconButton-root']")
	public WebElement thirdRowDeleteBtn;

	@FindBy(xpath = "//div[contains(text(),'There are no championships to display!')]")
	public WebElement emptyDataInchampionship;

	@FindBy(xpath = "//*[text()='Add new title']")
	public WebElement addNewTitleBtn;

	@FindBy(xpath = "//tr[1]/td[1]/div[1]/div[1]//input[@placeholder='Title Name']")
	public WebElement firstRowTitleField;

	@FindBy(xpath = "//tr[2]/td[1]/div[1]/div[1]/input[@placeholder='Title Name']")
	public WebElement secondRowTitleField;

	@FindBy(xpath = "//td[contains(text(),'Indian kickboxing champion')]")
	public WebElement verifyAthleteTitle;

	@FindBy(xpath = "//tr[2]/td[1][contains(text(),'ONE Atomweight World Champion')]")
	public WebElement verifyAthleteTitleInSecondRow;

	@FindBy(xpath = "//tr[2]/td[1][contains(text(),'2x ONE Atomweight World Champion')]")
	public WebElement verifyEditedAthleteTitleInSecondRow;

	@FindBy(xpath = "//tr[2]/td[2]/span[1]/span[1]/input")
	public WebElement isOneTitleCheckboxInSecondRow;

	@FindBy(xpath = "//tr[2]/td[contains(text(),'ONE Atomweight World Champion')]/following-sibling::td/*[@class='MuiSvgIcon-root MuiSvgIcon-colorSecondary']")
	public WebElement verifyOneTitleCheckboxInsecondRowIsTrue;

	@FindBy(xpath = "//div[contains(text(),'There are no titles to display!')]")
	public WebElement emptyDataInTitle;

	@FindBy(xpath = "//button[@class='tox-notification__dismiss tox-button tox-button--naked tox-button--icon']")
	public WebElement bioTinyCloseBtn;

	@FindBy(id = "tinymce")
	public WebElement athleteDescriptionField;

	@FindBy(xpath = "//p[text()='Four-time Chin State Wrestling Champion Tial Thang was born on a small farm in the Chin State of Myanmar, and he always dreamed of representing his country in martial arts one day.']")
	public WebElement verifyAthleteDescription;

	@FindBy(xpath = "//td[contains(text(),'13')]")
	public WebElement verifyUpdatedWinsValue;

	@FindBy(xpath = "//td[contains(text(),'2')]")
	public WebElement verifyUpdatedLossesValue;

	@FindBy(xpath = "//td[contains(text(),'2')]")
	public WebElement verifyUpdatedDrawsValue;

	@FindBy(xpath = "//span[contains(text(),'All')]")
	public WebElement athletesPageAllTab;

	@FindBy(xpath = "//div[@role='group']/button[2]/span[1]")
	public WebElement athletesPageDraftsTab;

	@FindBy(xpath = "//td[9]/div[1]/span[1]")
	public List<WebElement> draftStateAthletesStatus;

	@FindBy(name = "searchQuery")
	public WebElement nameOrNicknameSearchField;

	@FindBy(xpath = "//div[@class=' css-11n2kb7-control']/div[1]/div[text()='Weightclass']")
	public WebElement weightclassFieldInFilterpage;

	@FindBy(xpath = "//div[@class=' css-11n2kb7-control']/div[1]/div[text()='Team/Gym']")
	public WebElement teamOrGymFieldInFilterpage;

	@FindBy(xpath = "//div[@class=' css-11n2kb7-control']/div[1]/div[text()='Country']")
	public WebElement countryFieldInFilterpage;

	@FindBy(xpath = "//div[@class=' css-11n2kb7-control']/div[1]/div[text()='Gender']")
	public WebElement genderFieldInFilterpage;

	@FindBy(xpath = "//th/a[contains(text(),'Aung')]")
	public List<WebElement> searchResultsByName;

	@FindBy(xpath = "//p[text()='Bio']/../following-sibling::div/button[1]")
	public WebElement bioImageReplaceBtn;

	@FindBy(xpath = "//p[text()='Face']/../following-sibling::div/button[1]")
	public WebElement faceImageReplaceBtn;

	@FindBy(xpath = "//p[text()='Bout Face']/../following-sibling::div/button[1]")
	public WebElement boutFaceImageReplaceBtn;

	@FindBy(xpath = "//p[text()='World Champion']/../following-sibling::div/button[1]")
	public WebElement worldChampionImageReplaceBtn;

	@FindBy(xpath = "//p[text()='World Grand Prix Champion']/../following-sibling::div/button[1]")
	public WebElement worldGrandprixChampionImageReplaceBtn;

	@FindBy(xpath = "//p[text()='Bio']/../following-sibling::div/button[2]")
	public WebElement bioImageDeleteBtn;

	@FindBy(xpath = "//p[text()='Face']/../following-sibling::div/button[2]")
	public WebElement faceImageDeleteBtn;

	@FindBy(xpath = "//p[text()='Bout Face']/../following-sibling::div/button[2]")
	public WebElement boutFaceImageDeleteBtn;

	@FindBy(xpath = "//p[text()='World Champion']/../following-sibling::div/button[2]")
	public WebElement worldChampionImageDeleteBtn;

	@FindBy(xpath = "//p[text()='World Grand Prix Champion']/../following-sibling::div/button[2]")
	public WebElement worldGrandprixChampionImageDeleteBtn;

	@FindBy(xpath = "//p[text()='Bio']/../../img")
	public WebElement defaultBioImage;

	@FindBy(xpath = "//p[text()='Bio ( Alternative )']/../../img")
	public WebElement defaultBioAlternativeImage;

	@FindBy(xpath = "//p[text()='Face']/../../img")
	public WebElement defaultFaceImage;

	@FindBy(xpath = "//p[text()='Bout Face ( Alternative )']/../../img")
	public WebElement defaultBoutFaceAlternativeImage;

	@FindBy(xpath = "//p[text()='Bout Face']/../../img")
	public WebElement defaultBoutFaceImage;

	@FindBy(xpath = "//p[text()='World Champion']/../../img")
	public WebElement defaultWorldChampionImage;

	@FindBy(xpath = "//p[text()='World Grand Prix Champion']/../../img")
	public WebElement defaultWorldGrandprixChampionImage;

	@FindBy(xpath = "//p[text()='Hero']/../../img")
	public WebElement defaultHeroImage;

	@FindBy(xpath = "//p[text()='Banner']/../../img")
	public WebElement defaultBannerImage;

	@FindBy(xpath = "//span[contains(text(),'Creatives')]")
	public WebElement creativestab;

	@FindBy(xpath = "//span[contains(text(),'Or, if you prefer...')]")
	public WebElement uploadBtn;

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	public WebElement imageSaveBtn;

	@FindBy(xpath = "//h6[contains(text(),'Please click here to upload an image 1500x920')]")
	public WebElement bioImageUploadErrorMsg;

	@FindBy(xpath = "//h6[contains(text(),'Please click here to upload an image 256x256')]")
	public WebElement faceImageUploadErrorMsg;

	@FindBy(xpath = "//h6[contains(text(),'Please click here to upload an image 500x345')]")
	public WebElement boutFaceImageUploadErrorMsg;

	@FindBy(xpath = "//h6[contains(text(),'Please click here to upload an image 1500x920')]")
	public WebElement worldChampionImageUploadErrorMsg;

	@FindBy(xpath = "//h6[contains(text(),'Please click here to upload an image 1500x920')]")
	public WebElement worldGrandprixChampionImageUploadErrorMsg;

	@FindBy(xpath = "//span[contains(text(),'Cancel')]")
	public WebElement imageUploadCancelBtn;

	@FindBy(xpath = "//div[contains(text(),'Afghanistan')]/../following-sibling::div/div[1]/input")
	public WebElement enterMultipleCountriesField;

	@FindBy(xpath = "//div[contains(text(),'Afghanistan')]/../following-sibling::div/following-sibling::div/div[1]/input")
	public WebElement clearMultipleNationality;

	@FindBy(xpath = "//div[contains(text(),'013 Muay Thai')]/../following-sibling::div/div[1]/input")
	public WebElement enterMultipleTeamsField;

	@FindBy(xpath = "//div[contains(text(),'Mixed Martial Arts')]/../following-sibling::div/div[1]/input")
	public WebElement enterMultipleStyleField;

	@FindBy(xpath = "//div[contains(text(),'Atomweight')]/../following-sibling::div/div[1]/input")
	public WebElement enterMultipleWeightclassField;

	@FindBy(xpath = "//p[contains(text(),'Afghanistan,Singapore')]")
	public WebElement multipleCountriesFieldConfirmation;

	@FindBy(xpath = "//p[contains(text(),'013 Muay Thai, Petchyindee Academy')]")
	public WebElement multipleTeamsFieldConfirmation;

	@FindBy(xpath = "//p[contains(text(),'Mixed Martial Arts, BJJ')]")
	public WebElement multipleAthleteStyleFieldConfirmation;

	@FindBy(xpath = "//p[contains(text(),'Atomweight, Flyweight')]")
	public WebElement multipleWeightclassFieldConfirmation;

	@FindBy(xpath = "//p[contains(text(),'First name is a required field.')]")
	public WebElement firstNameErrorMsg;

	@FindBy(xpath = "//p[contains(text(),'Please enter a date of birth in YYYY-MM-DD format.')]")
	public WebElement athleteDobErrorMsg;

	@FindBy(xpath = "//p[contains(text(),'Height (in CM) is a required field.')]")
	public WebElement athleteHeightErrorMsg;

	@FindBy(xpath = "//p[contains(text(),'Please select a nationality.')]")
	public WebElement athleteNationalityErrorMsg;

	@FindBy(xpath = "//p[contains(text(),'Weightclass is a required field.')]")
	public WebElement athleteWeightclassErrorMsg;

	@FindBy(xpath = "//div[contains(text(),'Atomweight')]/../following-sibling::div/following-sibling::div/div[1]/input")
	public WebElement clearMultipleWeightclass;

	@FindBy(xpath = "//input[@type='checkbox']")
	public WebElement displayInAppToggleBtn;

	@FindBy(xpath = "//span[contains(text(),'Fight History')]")
	public WebElement fightHistoryTab;

	@FindBy(xpath = "//div[contains(text(),'There are no records to display!')]")
	public WebElement emptyDataInfightHistoryTab;

	@FindBy(xpath = "//a[contains(text(),'Aung La N Sang')]")
	public WebElement aungLaNsang;

	@FindBy(xpath = "//h6[contains(text(),'UPCOMING EVENTS')]")
	public WebElement upcomingEventsInAthleteFightHistory;

	@FindBy(xpath = "//h6[contains(text(),'UPCOMING EVENTS')]/../../preceding-sibling::div")
	public WebElement upcomingEventsExpandBtn;

	@FindBy(xpath = "//h6[contains(text(),'PAST EVENTS')]")
	public WebElement pastEventsInAthleteFightHistory;

	@FindBy(xpath = "//div[contains(text(),'FANTASY EVENT ON 31-DEC-2021 [DO NOT RUN LIVE], 31 DEC 2021, SHANGHAI')]")
	public WebElement upcomingEventNameInAthleteFightHistory;

	@FindBy(xpath = "//a[@href='/events/blt9779a5cfb5716ee1?tab=Bouts']/div[1]/div[2]/div[1]/span[text()='UPCOMING']")
	public WebElement upcomingTextLinkInAthleteFightHistory;

	@FindBy(xpath = "//a[@href='/events/blt9779a5cfb5716ee1?tab=Bouts']/following-sibling::div/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a")
	public WebElement redCornerAthleteImage;

	@FindBy(xpath = "//a[@href='/events/blt9779a5cfb5716ee1?tab=Bouts']/following-sibling::div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a")
	public WebElement blueCornerAthleteImage;

	@FindBy(xpath = "//span[contains(text(),'Fight History')]/..")
	public WebElement activeTabIsFightHistory;

	@FindBy(xpath = "//h2[contains(text(),'Brandon  Vera')]")
	public WebElement brandonVeraProfilePageName;

	@FindBy(xpath = "//h2[contains(text(),'Christian Lee')]")
	public WebElement christianLeeProfilePageName;

	@FindBy(xpath = "//h2[contains(text(),'Event Details')]")
	public WebElement eventDetailsPageHeader;

	@FindBy(xpath = "//span[text()='Bouts']/..")
	public WebElement activeTabIsBouts;

	@FindBy(xpath = "//div[contains(text(),'ATHLETE STATS EVENT-5 ON 30-APR-2021, 30 APR 2021, MACAU')]")
	public WebElement pastEventNameInAthleteFightHistory;

	@FindBy(xpath = "//a[@href='/events/blt612e5585dee9d0ea?tab=Bouts']/following-sibling::div/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a")
	public WebElement pastEventRedCornerAthleteImage;

	@FindBy(xpath = "//a[@href='/events/blt612e5585dee9d0ea?tab=Bouts']/following-sibling::div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a")
	public WebElement pastEventBlueCornerAthleteImage;

	@FindBy(xpath = "//a[@href='/events/blt612e5585dee9d0ea?tab=Bouts']/following-sibling::div/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/h6")
	public WebElement boutResult;
	
	@FindBy(xpath="//a[@download='Event History - Aung La N Sang']")
	public WebElement downloadBtnForAunglaFightHistory;
	
	@FindBy(xpath="//span[contains(text(),'Logs')]")
	public WebElement logsTab;
	
	@FindBy(xpath="//span[contains(text(),'Logs')]/..")
	public WebElement activeTabIsLogs;
	
	@FindBy(xpath="//a[text()='1']")
    public WebElement version1_log;	
	
	@FindBy(xpath="//a[text()='2']")
    public WebElement version2_log;	
	
	@FindBy(xpath="//span[text()='General']")
	public WebElement generalTab;
	
	@FindBy(xpath="//h2[text()='Compare Version - Athlete']")
	public WebElement compareVersionHeader;
	
	@FindBy(xpath="(//p[@class='MuiTypography-root MuiTypography-body2'])[2]/..")
	public WebElement skillsTextBoxInVersion1;
	
	@FindBy(xpath="//span[contains(text(),'Mixed Martial Arts')]/../../..")
	public WebElement skillsTextBoxInVersion2;
	
	@FindBy(xpath="//span[contains(text(),'Mixed Martial Arts')]")
	public WebElement skillsInCompareVersion;
	
	@FindBy(xpath="//span[contains(text(),'Show Everything')]")
	public WebElement showEverythingBtn;
	
	@FindBy(xpath="//span[contains(text(),'Show Changes Only')]")
	public WebElement showChangesOnlyBtn;
	
	@FindBy(xpath="//span[contains(text(),'Go to athlete details')]")
	public WebElement goToAthleteDetailsBtn;
	
	@FindBy(xpath="//span[contains(text(),'General')]/..")
	public WebElement activeTabIsGeneral;
	
	@FindBy(xpath = "//div[contains(text(),'Female')]")
	public WebElement female;
	
	@FindBy(xpath="//span[contains(text(),'Athletes')]/../..")
	public WebElement atheletesBtnLink;
	
	@FindBy(xpath="//tr/th/a")
	public List<WebElement> athletelinksInAlltab;
	
	@FindBy(xpath="//tr/td[4]")
	public List<WebElement> athletesHeightValuesInAllTab;

	@FindBy(xpath="//tr/td[5]")
	public List<WebElement> weightclassOfAnAthletesInAlltab;
	
	@FindBy(xpath="//tr/td[8]")
	public List<WebElement> nationalityOfAnAthletesInAlltab;
	
	@FindBy(xpath="//tr/td[3]")
	public List<WebElement> teamNameOfAnAthletesInAlltab;
	
	@FindBy(xpath="//tr[1]/td[1]/*[@title='Not visible on app and website']")
    public WebElement notVisibleOnAppStatusIcon;
	
	@FindBy(xpath="//tr[1]/td[1]/*[@title='Visible on app and website']")
    public WebElement visibleOnAppStatusIcon;
	
	@FindBy(xpath="//span[contains(text(),'Clear Filter')]")
	public WebElement clearFilterBtn;
	
	@FindBy(xpath="//span[contains(text(),'Clear Filter')]")
	public List<WebElement> clearFilterBtns;
	
	public String expAthletePageTitle = "Athletes";
	public String expMsgForSave = "Athlete details updated successfully." ;
	public String expToastMsgForAthletePublish = "Athlete updated successfully.";
	public String expFirstNameErrorMsg = "First name is a required field.";
    public String expAthleteDobErrorMsg = "Please enter a date of birth in YYYY-MM-DD format.";
    public String expAthleteHeightErrorMsg = "Height (in CM) is a required field.";
    public String expAthleteNationalityErrorMsg = "Please select a nationality." ;
    public String expAthleteWeightclassErrorMsg = "Weightclass is a required field.";
    public String expErrorMsgInRecordType = "Record type is a required field." ;
    public String expTextInEmptyDataInRecords = "There are no records to display!";
    public String expMsgInemptyDataInSocialProfiles = "There are no social profiles to display!";
    public String expErrorMsgOnFbField = "Please enter a valid facebook url.";
    public String expChampionshipType1 = "World Championship" ;
    public String expChampionshipType2 ="World Grand Prix Championship";
    public String expMsgIneEmptyDataInchampionship = "There are no championships to display!";
    public String expErrorMsgInChampionshipType = "Championship type is a required field.";
    public String expErrorMsgInChampionshipWeightclass = "Weightclass is a required field.";
    public String expMsgInemptyDataInTitle = "There are no titles to display!";
    public String expConfirmPublishText = "All changes published.";
    public String expErrorMsgForBioImage = "Please click here to upload an image 1500x920";
    public String expErrorMsgForFaceImage = "Please click here to upload an image 256x256";
    public String expErrorMsgForBoutFaceImage = "Please click here to upload an image 500x345";
    public String expErrorMsgForWorldChampionImage = "Please click here to upload an image 1500x920";
    public String expErrorMsgForWorldGrandprixChampionImage ="Please click here to upload an image 1500x920";
    public String expAddAthletePopUpHeader = "Add Athlete";
    public String expDraftStatusText = "DRAFT";
    public String expUpcomingText= "UPCOMING";
    public String expEventdetailsPageHeader = "Event Details";
    
	public AthletesPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyAthletesPageTitle() {
		String athletestitle = athletesPageTitle.getText();
		return athletestitle;
	}

	public void addAthleteBtnClick() {
		actions.waitForElementToBeClickable(addAthletesBtn);
	}

	public String verifyAddAthletePopUpHeader() throws InterruptedException {
        actions.waitForElementPresent(addAthletePopupHeader);
		String athletePopUpHeaderText = addAthletePopupHeader.getText();
		return athletePopUpHeaderText;
	}

	public void addAthletePopupCancelBtnClick() {
		addAthleteCancelBtn.click();
	}

	public void enterFirstName(String athleteFirstName) {
		firstName.sendKeys(athleteFirstName);
	}

	public void enterLastName() {
		lastName.sendKeys("Morris" + RandomStringUtils.randomNumeric(4));
	}

	public void enterAthleteDob(String Dob) {
		athleteDob.sendKeys(Dob);
	}

	public void enterInvalidDob() {
		athleteDob.sendKeys("19-02-1990");
	}

	public void enterAthleteHeight(String heightvalue) {
		athleteHeight.sendKeys(heightvalue);
	}

	public void enterNationality() {
		nationality.click();
		actions.waitForElementToBeClickable(afganistan);
	}

	public void enterSecondNationality() {
		nationality.click();
		actions.waitForElementToBeClickable(singapore);
	}

	public void enterGender(WebElement element) {
		gender.click();
		actions.waitForElementToBeClickable(element);
	}

	public void enterWeightclass() {
		weightclass.click();
		actions.waitForElementToBeClickable(atomweight);
	}

	public void enterStyleAsMMA() {
		selectStylesField.click();
		actions.waitForElementToBeClickable(mixedMartialArtsStyle);
	}

	public void enterTeamName(WebElement element) {
		selectTeamField.click();
		actions.waitForElementToBeClickable(element);
	}

	public void clickOnSaveAndProceedBtn() {
		saveAndProceed.click();
	}

	public String verifyConfirmationPopupForAthleteCreation() {
		actions.waitForElementPresent(confirmationPopupTextForAthleteCreation);
		String athleteCreationSuccssfulText = confirmationPopupTextForAthleteCreation.getText();
		return athleteCreationSuccssfulText;
	}

	public String verifyConfirmationPopupForAthleteUpdate() {
		actions.waitForElementPresent(confirmationPopupTextForAthleteUpdate);
		String athleteUpdatedSuccssfulText = confirmationPopupTextForAthleteUpdate.getText();
		return athleteUpdatedSuccssfulText;
	}

	public String verifyConfirmationPopupForSave() {
		actions.waitForElementPresent(confirmationPopupTextForSave);
		String updatedText = confirmationPopupTextForSave.getText();
		return updatedText;
	}

	public void clickOnAthletePublishBtn() {
		publishBtn.click();
	}

	public void clickOnConfirmPublishBtn() {
		confirmPublishBtn.click();
	}

	public void clickOnBasicDetailsEditButton() {
		actions.waitForElementToBeClickable(basicDetailsEditBtn);
	}

	public void clickOnLifetimeRecordsEditButton() {
		actions.waitForElementToBeClickable(lifetimeRecordsEditBtn);
	}

	public void clickOnAddNewRecord() {
		saveAndAddBtns.get(1).click();
	}

	public void clickOnSelectRecordTypeAsMuaythaiAndKickboxing() {
		selectRecordType.click();
		actions.waitForElementToBeClickable(muaythaiAndKickboxingRecordType);

	}

	public void clickOnSelectRecordTypeAsMixedMartialArts() {
		selectRecordType.click();
		actions.waitForElementToBeClickable(mixedMartialArtsRecordType);

	}

	public void enterSecondrowWinsValue() {
		secondRowWins.sendKeys("12");
	}

	public void enterSecondrowLossesValue() {
		secondRowLosses.sendKeys("1");
	}

	public void enterSecondrowDrawsValue() {
		secondRowDraws.sendKeys("1");
	}

	public void enterWinsValue() {
		firstRowWins.sendKeys("12");
	}

	public void enterLossesValue() {
		firstRowLosses.sendKeys("1");
	}

	public void enterDrawsValue() {
		firstRowDraws.sendKeys("1");
	}

	public void clickOnSaveBtn() {
		saveAndAddBtns.get(0).click();

	}

	public void updateFirstRowWins() {
		firstRowWins.click();
		firstRowWins.sendKeys(Keys.chord(Keys.COMMAND, "a", Keys.BACK_SPACE));
		firstRowWins.sendKeys("13");
	}

	public void updateFirstRowLosses() {
		firstRowLosses.click();
		firstRowLosses.sendKeys(Keys.chord(Keys.COMMAND, "a", Keys.BACK_SPACE));
		firstRowLosses.sendKeys("2");
	}

	public void updateFirstRowDraws() {
		firstRowDraws.click();
		firstRowDraws.sendKeys(Keys.chord(Keys.COMMAND, "a", Keys.BACK_SPACE));
		firstRowDraws.sendKeys("2");
	}

	public String confirmPublish() {
		String confirmPublishedText = afterPublishConfirmationText.getText();
		return confirmPublishedText;
	}

	public void clickOnSocialProfileEditBtn() {
		actions.waitForElementToBeClickable(socialProfilesEditBtn);
	}

	public void clickOnAddNewProfileBtn() {
		saveAndAddBtns.get(1).click();
	}

	public void clickOnSelectProfile() {
		selectProfile.click();

	}

	public void clickOnFacebookProfileOption() {
		facebookProfileOption.click();

	}

	public void enterFacebookUrl() {
		facebookUrlField.sendKeys("https://www.facebook.com");

	}

	public void clickOnTwitterProfileOption() {
		twitterProfileOption.click();

	}

	public void enterTwitterUrl() {
		twitterUrlField.sendKeys("https://www.twitter.com");

	}

	public void enterInstagramUrl() {
		instagramUrlField.sendKeys("https://www.instagram.com");

	}

	public void clickOnInstagramProfileOption() {
		instagramProfileOption.click();
	}

	public void editFBfield() {
		facebookUrlField.sendKeys(Keys.chord(Keys.COMMAND, "a", Keys.BACK_SPACE));
		facebookUrlField.sendKeys("https://www.facebook.com/ONEChampionship/");
	}

	public void editTwitterField() {
		twitterUrlField.sendKeys(Keys.chord(Keys.COMMAND, "a", Keys.BACK_SPACE));
		twitterUrlField.sendKeys("https://www.twitter.com/ONEChampionship");
	}

	public void editInstagramField() {
		instagramUrlField.sendKeys(Keys.chord(Keys.COMMAND, "a", Keys.BACK_SPACE));
		instagramUrlField.sendKeys("https://www.instagram.com/rodtang_jimungnon/");
	}

	public void clickOnCancelBtnInEditSections() {
		actions.verticalScrollToTop();
		cancelBtn.click();
	}

	public void clickOnChampionshipsEditBtn() {
		actions.waitForElementToBeClickable(championshipsEditBtn);
	}

	public void clickOnAddNewChampionshipBtn() {
		saveAndAddBtns.get(1).click();
	}

	public void clickOnSelectChampionshipTypeAsWorldChampionship() throws InterruptedException {
		selectChampionshipType.click();
		actions.waitForElementToLoad();
		actions.waitForElementToBeClickable(worldChampionshipOption);
	}

	public void clickOnSelectChampionshipTypeAsWorldGrandprixChampionship() throws InterruptedException {
		secondRowSelectChampionshipType.click();
		actions.waitForElementToLoad();
		actions.waitForElementToBeClickable(worldGrandPrixChampionshipOption);
	}

	public void enterWeightclassInFirstRow() {
		weightclass.click();
		actions.waitForElementToBeClickable(featherweightOption);
	}

	public void enterWeightclassInSecondRow() {
		secondRowSelectWeightclass.click();
		actions.waitForElementToBeClickable(secondRowFlyweightOption);
	}

	public void editWeightclassInFirstRow() {
		selectWeightclass.click();
		actions.waitForElementToBeClickable(bantamweightOption);
	}

	public void clickOnSelectChampionshipStyleAsMMA() {
		selectStyleOption.click();
		actions.waitForElementToBeClickable(mixedMartialArtsStyle);
	}

	public void clickOnSelectChampionshipStyleAsBjj() {
		secondRowSelectStyleOption.click();
		actions.waitForElementToBeClickable(bjjStyle);
	}

	public void editChampionshipsStyle() {
		actions.waitForElementToBeClickable(muaythaiStyle);
	}

	public void clickOnDeleteBtn() {
		deleteBtn.click();
	}

	public void clickOnAthleteTitleEditBtn() {
		actions.waitForElementToBeClickable(titlesEditBtn);
	}

	public void clickOnAddNewTitleBtn() {
		addNewTitleBtn.click();
	}

	public void enterAthleteTitleInFirstRow() {
		firstRowTitleField.sendKeys("Indian kickboxing champion");
	}

	public void enterAthleteTitleInSecondRow() {
		secondRowTitleField.sendKeys("ONE Atomweight World Champion");
	}

	public void clickOnOneTitleCheckboxInSecondRow() {
		isOneTitleCheckboxInSecondRow.click();
	}

	public void editAthleteTitleInSecondRow() {
		secondRowTitleField.sendKeys(Keys.chord(Keys.COMMAND, "a", Keys.BACK_SPACE));
		secondRowTitleField.sendKeys("2x ONE Atomweight World Champion");
	}

	public void clickOnBioEditBtn() {
		actions.waitForElementToBeClickable(athleteBioEditBtn);
	}

	public void clickOnCloseTinyBtn() {
		bioTinyCloseBtn.click();
	}

	public void enterAthleteDescription() throws InterruptedException {
		driver.switchTo().frame(0);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		actions.verticalScroll(0, 2000);
		athleteDescriptionField.sendKeys(
				"Four-time Chin State Wrestling Champion Tial Thang was born on a small farm in the Chin State of Myanmar, and he always dreamed of representing his country in martial arts one day.");
		driver.switchTo().parentFrame();

	}

	public void clickOnAthletesDraftsTab() {
		actions.waitForElementToBeClickable(athletesPageDraftsTab);
	}

	public void clickOnAllAthletesTab() {
		athletesPageAllTab.click();
	}

	public void enterStringInAthleteSearchField(String search) {
		nameOrNicknameSearchField.sendKeys(search);
	}

	public void navigateToAthleteCreativesTab() throws InterruptedException {
		actions.waitForElementToBeClickable(creativestab);
	}

	public void clickOnBioImageReplaceBtn() {
		actions.waitForElementToBeClickable(bioImageReplaceBtn);
	}

	public void clickOnFaceImageReplaceBtn() {
		actions.waitForElementToBeClickable(faceImageReplaceBtn);
	}

	public void clickOnBoutFaceImageReplaceBtn() {
		actions.verticalScroll(0,500);
		actions.waitForElementToBeClickable(boutFaceImageReplaceBtn);
	}

	public void clickOnWorldChampionImageReplaceBtn() {
		actions.waitForElementToBeClickable(worldChampionImageReplaceBtn);
	}

	public void clickOnWorldGrandprixChampionImageReplaceBtn() {
		actions.waitForElementToBeClickable(worldGrandprixChampionImageReplaceBtn);
	}

	public void clickOnUploadBtn() {
		uploadBtn.click();
	}

	public void clickOnImageSaveBtn() {
		actions.waitForElementToBeClickable(imageSaveBtn);
	}

	public void upload(String imagepath) throws AWTException {

		File file = new File(imagepath);
		Robot robot = new Robot();

		StringSelection StringSelection = new StringSelection(file.getAbsolutePath());
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(StringSelection, null);

		driver.switchTo().window(driver.getWindowHandle());

		robot.delay(2000);

		// Open Goto window
		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_G);
		robot.keyRelease(KeyEvent.VK_META);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_G);

		// Paste the clipboard value
		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_META);
		robot.keyRelease(KeyEvent.VK_V);

		// Press Enter key to close the Goto window and Upload window
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public String verifyTeamName() {
		return verifyTeamNameAs013Muaythai.getText();
	}

	public String verifyAthleteStyleAsMMA() {
		return verifyAthleteStyleAsMMA.getText();
	}

	public void enterMultipleCountries() {
		enterMultipleCountriesField.sendKeys("Singa");
		actions.waitForElementToBeClickable(singapore);

	}

	public String verifyMultipleCountriesName() {
		return multipleCountriesFieldConfirmation.getText();
	}

	public void enterMultipleTeams() {
		enterMultipleTeamsField.sendKeys("Petchyindee");
		actions.waitForElementToBeClickable(teamNameAsPetchyindeeAcademy);

	}

	public String verifyMultipleTeamsName() {
		return multipleTeamsFieldConfirmation.getText();
	}

	public void enterMultipleStyle() {
		enterMultipleStyleField.sendKeys("bjj");
		actions.waitForElementToBeClickable(bjjStyle);

	}

	public String verifyMultipleAthleteStyle() {
		return multipleAthleteStyleFieldConfirmation.getText();
	}

	public void enterMultipleWeightclass() {
		enterMultipleWeightclassField.sendKeys("Fly");
		actions.waitForElementToBeClickable(secondRowFlyweightOption);

	}

	public String verifyMultipleWeightclass() {
		return multipleWeightclassFieldConfirmation.getText();
	}

	public void clearFirstName() {
		actions.waitForElementPresent(firstName);
		firstName.sendKeys(Keys.COMMAND, "a");
		firstName.sendKeys(Keys.BACK_SPACE);
	}

	public void clearAthleteDob()  {
		actions.waitForElementPresent(athleteDob);
		athleteDob.sendKeys(Keys.COMMAND, "a");
		athleteDob.sendKeys(Keys.BACK_SPACE);
	}

	public void clearAthleteHeight()  {
		actions.waitForElementPresent(athleteHeight);
		athleteHeight.sendKeys(Keys.COMMAND, "a");
		athleteHeight.sendKeys(Keys.BACK_SPACE);
	}

	public void clearNationality()  {
		actions.waitForElementPresent(clearMultipleNationality);
		clearMultipleNationality.sendKeys(Keys.DELETE);
		actions.waitForElementPresent(enterMultipleCountriesField);
		enterMultipleCountriesField.sendKeys(Keys.DELETE);

	}

	public void clearWeightclass()  {
		actions.waitForElementPresent(clearMultipleWeightclass);
		clearMultipleWeightclass.sendKeys(Keys.DELETE);
		actions.waitForElementPresent(enterMultipleWeightclassField);
		enterMultipleWeightclassField.sendKeys(Keys.DELETE);
	}

	public String verifyFirstNameErrorMessage() {
		return firstNameErrorMsg.getText();
	}

	public String verifyAthleteDobErrorMessage() {
		return athleteDobErrorMsg.getText();
	}

	public String verifyAthleteHeightErrorMessage() {
		return athleteHeightErrorMsg.getText();
	}

	public String verifyAthleteNationalityErrorMessage() {
		return athleteNationalityErrorMsg.getText();
	}

	public String verifyAthleteWeightclassErrorMessage() {
		return athleteWeightclassErrorMsg.getText();
	}

	public boolean verifyDisplayInAppToggleBtn() {
		return displayInAppToggleBtn.isSelected();
	}

	public void clickOnBioImageDeleteBtn() {
		bioImageDeleteBtn.click();
	}

	public void clickOnFaceImageDeleteBtn() {
		faceImageDeleteBtn.click();
	}

	public void clickOnBoutFaceImageDeleteBtn() {
		actions.verticalScroll(0,500);
        actions.waitForElementToBeClickable(boutFaceImageDeleteBtn);
	}

	public void clickOnWorldChampionImageDeleteBtn() {
		worldChampionImageDeleteBtn.click();
	}

	public void clickOnWorldGrandprixChampionImageDeleteBtn() {
		actions.scrollToDown();
		actions.waitForElementToBeClickable(worldGrandprixChampionImageDeleteBtn);
	}

	public String verifyErrorMsgForBioImage() {
		return bioImageUploadErrorMsg.getText();
	}

	public String verifyErrorMsgForFaceImage() {
		return faceImageUploadErrorMsg.getText();
	}

	public String verifyErrorMsgForBoutFaceImage() {
		return boutFaceImageUploadErrorMsg.getText();
	}

	public String verifyErrorMsgForWorldChampionImage() {
		return worldChampionImageUploadErrorMsg.getText();
	}

	public String verifyErrorMsgForWorldGrandprixChampionImage() {
		return worldGrandprixChampionImageUploadErrorMsg.getText();
	}

	public void clickOnImageUploadCancelBtn() {
		imageUploadCancelBtn.click();
	}

	public void clickOnFightHistoryTab() {
		actions.waitForElementToBeClickable(fightHistoryTab);
	}

	public String verifyEmptyFightHistoryTab() {
		return emptyDataInfightHistoryTab.getText();

	}

	public void clickOnAthleteInSearchResults(WebElement webelement) {
		actions.waitForElementToBeClickable(webelement);
	}

	public void waitForUpcomingEventsInFightHistory() {
		actions.waitForElementPresent(upcomingEventsInAthleteFightHistory);
	}

	public void clickOnUpcomingEventsExpandBtn() {
		actions.waitForElementToBeClickable(upcomingEventsExpandBtn);
	}

	public String verifyUpcomingEventDetailsInFightHistory() {
		return upcomingEventNameInAthleteFightHistory.getText();
	}

	public String verifyUpcomingText() {
		return upcomingTextLinkInAthleteFightHistory.getText();
	}

	public String verifyRedCornerAthleteImageInUpcomingBout() {
		return redCornerAthleteImage.getAttribute("style");
	}

	public String verifyBlueCornerAthleteImageInUpcomingBout() {
		return blueCornerAthleteImage.getAttribute("style");
	}

	public void clickOnAthleteImageInFightHistory(WebElement webelemnt) {
		webelemnt.click();
	}

	public String verifyActiveTabInAthleteDetails(WebElement tabName) {
		actions.waitForElementPresent(tabName);
		return tabName.getAttribute("class");
	}

	public String verifyAthletePageProfileName(WebElement element) {
		actions.waitForElementPresent(element);
		return element.getText();

	}

	public void clickOnEventNameInAthleteFightHistory(WebElement eventName) {
		eventName.click();
	}

	public String verifyEventdetailsPageHeader() {
		return eventDetailsPageHeader.getText();
	}


	public String verifyPastEventDetailsInFightHistory() {
		return pastEventNameInAthleteFightHistory.getText();
	}

	public String verifyRedCornerAthleteImageInPastBout() {
		return pastEventRedCornerAthleteImage.getAttribute("style");
	}

	public String verifyBlueCornerAthleteImageInPastBout() {
		return pastEventBlueCornerAthleteImage.getAttribute("style");
	}

	public String verifyBoutResultInFightHistoryTab() {
		return boutResult.getText();

	}
	
	public boolean verifyAunglaFightHistoryDownloadBtn() {
		return downloadBtnForAunglaFightHistory.isDisplayed();
	}

	public void clickOnAthletesPageWebElement(WebElement elementName) {
		actions.waitForElementToBeClickable(elementName);
	}
	
	public String verifyStringValue(WebElement elementName) {
		return elementName.getText();
	}

	public String getColorCode(WebElement elementName) {
		String rgbFormat = elementName.getCssValue("background-color");

		String hexcolor = Color.fromString(rgbFormat).asHex(); // converted Into HexFormat
		return hexcolor;// Output of Hexcode

	}
	
	public boolean clearFilterBtnIsDisplayed() {
		if(clearFilterBtns.size()>0) {
			return false;
		}else{
			return true;
		}
    }
	
}
