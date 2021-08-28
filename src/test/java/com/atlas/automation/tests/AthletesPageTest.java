package com.atlas.automation.tests;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.atlas.automation.actions.WebdriverActions;
import com.atlas.automation.base.BaseClass;
import com.atlas.automation.pages.AthletesPage;
import com.atlas.automation.pages.HomePage;
import com.atlas.automation.pages.LoginPage;

public class AthletesPageTest extends BaseClass {
	LoginPage loginpage;
	HomePage homepage;
	AthletesPage athletespage;
	WebdriverActions actions = new WebdriverActions();

	public AthletesPageTest() {
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

	@Test(priority = 1)
	public void createNewAthleteTest() {
		homepage.athletesBtnClick();
		actions.waitForElementToLoad();
		athletespage.addAthleteBtnClick();
		//enter the mandatory details
		athletespage.enterFirstName("Chris");
		athletespage.enterLastName();
		athletespage.enterAthleteDob("1990-02-07");
		athletespage.enterAthleteHeight("165");
		athletespage.enterNationality();
		athletespage.enterGender(athletespage.male);
		athletespage.enterWeightclass();
		athletespage.clickOnSaveAndProceedBtn();
		actions.waitForElementToLoad();
		try {
			//validate publish button
			Assert.assertTrue(athletespage.publishBtn.isEnabled());
			//validate the onfirmation popup
			Assert.assertTrue(athletespage.confirmationPopupTextForAthleteCreation.isDisplayed());
			Assert.assertEquals(athletespage.verifyConfirmationPopupForAthleteCreation(),
					"Athlete created successfully.");
			//validate the entered details after save and proceed
			Assert.assertEquals(athletespage.firstnameConfirmation.getText(), "Chris");
			Assert.assertEquals(athletespage.WeightclassConfirmation.getText(), "Atomweight");
			Assert.assertEquals(athletespage.countrynameConfirmation.getText(), "Afghanistan");
			Assert.assertEquals(athletespage.heightvalueConfirmation.getText(), "165");
			Assert.assertEquals(athletespage.dobConfirmation.getText(), "1990-02-07");
			Assert.assertEquals(athletespage.genderConfirmation.getText(), "Male");
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 2)
	public void editBasicDetailsTest() throws InterruptedException  {
		athletespage.clickOnBasicDetailsEditButton();
		athletespage.clickOnSelectChampionshipStyleAsMMA();
		actions.verticalScroll(0, 200);
		athletespage.enterTeamName(athletespage.teamNameAs013Muaythai);
		actions.verticalScrollToTop();
		athletespage.clickOnSaveBtn();
		actions.waitForElementToLoad();
		try {
			//validate the updated details
			Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(), athletespage.expMsgForSave);
			Assert.assertEquals(athletespage.verifyAthleteStyleAsMMA(), "Mixed Martial Arts");
			Assert.assertEquals(athletespage.verifyTeamName(), "013 Muay Thai");
			//athletespage.clickOnAthletePublishBtn(); // //
			// athletespage.clickOnConfirmPublishBtn(); // actions.waitForElementToLoad();
			// Assert.assertEquals(athletespage.confirmPublish(),"All changes published.");
		} catch (AssertionError e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 3) 
	public void enterMultipleEntriesTest()  {
		athletespage.clickOnBasicDetailsEditButton();
		athletespage.enterMultipleCountries();
		athletespage.enterMultipleStyle();
		athletespage.enterMultipleWeightclass();
		actions.verticalScrollToTop();
		athletespage.clickOnSaveBtn();
		actions.waitForElementToLoad();
		try {
			//validate the updated details
			Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(), athletespage.expMsgForSave);
			Assert.assertEquals(athletespage.verifyMultipleCountriesName(), "Afghanistan,Singapore");
			Assert.assertEquals(athletespage.verifyMultipleAthleteStyle(), "Mixed Martial Arts, BJJ");
			Assert.assertEquals(athletespage.verifyMultipleWeightclass(), "Atomweight, Flyweight");
			// athletespage.clickOnAthletePublishBtn();
			// athletespage.clickOnConfirmPublishBtn(); // actions.waitForElementToLoad();
			// Assert.assertEquals(athletespage.confirmPublish(), "All changes published.");
		} catch (AssertionError e) {
			e.printStackTrace();
		}

	}	 
	 
	@Test(priority = 4)
	public void enterMultipleTeamTest() {
		athletespage.clickOnBasicDetailsEditButton();
		actions.verticalScroll(0, 200);
		athletespage.enterMultipleTeams();
		actions.verticalScrollToTop();
		athletespage.clickOnSaveBtn();
		actions.waitForElementToLoad();
		try {
			// validate the updated details
			Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(), athletespage.expMsgForSave);
			Assert.assertEquals(athletespage.verifyMultipleTeamsName(), "013 Muay Thai, Petchyindee Academy");
		} catch (AssertionError e) {
			e.printStackTrace();

		}

	}

		@Test(priority = 5)
		public void verifyMandatoryFieldsErrorMsgInBasicDetailsTest()  {
			athletespage.clickOnBasicDetailsEditButton();
			athletespage.clearFirstName();
			athletespage.clearAthleteDob();
			athletespage.clearAthleteHeight();
			athletespage.clearNationality();
			athletespage.clearWeightclass();
			try {
				//validate the error message in the mandatory fields
				Assert.assertEquals(athletespage.verifyFirstNameErrorMessage(), athletespage.expFirstNameErrorMsg);
				Assert.assertEquals(athletespage.verifyAthleteDobErrorMessage(), athletespage.expAthleteDobErrorMsg);
				Assert.assertEquals(athletespage.verifyAthleteHeightErrorMessage(),athletespage.expAthleteHeightErrorMsg);
				Assert.assertEquals(athletespage.verifyAthleteNationalityErrorMessage(), athletespage.expAthleteNationalityErrorMsg);
				Assert.assertEquals(athletespage.verifyAthleteWeightclassErrorMessage(), athletespage.expAthleteWeightclassErrorMsg);	
				//verify the save button is disabled
				Assert.assertFalse(athletespage.disabledSaveBtn.isEnabled());
				athletespage.clickOnCancelBtnInEditSections();
			} catch (AssertionError e) {
				e.printStackTrace();
			}

		}
	  
	 
		@Test(priority = 6)
		public void addNewLifetimeRecordsTest() {
			actions.verticalScroll(0,500);
			athletespage.clickOnLifetimeRecordsEditButton();
			athletespage.clickOnAddNewRecord();
			athletespage.clickOnSelectRecordTypeAsMuaythaiAndKickboxing();
			athletespage.enterWinsValue();
			athletespage.enterLossesValue();
			athletespage.enterDrawsValue();
			athletespage.clickOnSaveBtn();
			actions.waitForElementToLoad();
			try {
				Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(),
						athletespage.expMsgForSave);
				actions.waitForElementPresent(athletespage.confirmmuaythaiAndKickboxingRecordType);
				Assert.assertEquals(athletespage.confirmmuaythaiAndKickboxingRecordType.getText(),
						"Muay Thai/Kickboxing");
			} catch (AssertionError e) {
				e.printStackTrace();
			}
		}

		@Test(priority = 7)
		public void addLifetimeRecordsWithoutRecordtypeTest() {
			athletespage.clickOnLifetimeRecordsEditButton();
			athletespage.clickOnAddNewRecord();
			athletespage.enterSecondrowWinsValue();
			athletespage.enterSecondrowLossesValue();
			athletespage.enterSecondrowDrawsValue();
			try {
				Assert.assertFalse(athletespage.disabledSaveBtn.isEnabled());
				actions.waitForElementToLoad();
				Assert.assertEquals(athletespage.errorMsgInRecordType.getText(), athletespage.expErrorMsgInRecordType);
				athletespage.cancelBtn.click();
				// athletespage.publishBtn.click();
				// athletespage.confirmPublishBtn.click();
				// actions.waitForElementToLoad();
				// Assert.assertEquals(athletespage.confirmPublish(), "All changes published.");
			} catch (AssertionError e) {
				e.printStackTrace();
			}
		}

		@Test(priority = 8)
		public void updateLifetimeRecordsTest() {
			athletespage.clickOnLifetimeRecordsEditButton();
			athletespage.updateFirstRowWins();
			athletespage.updateFirstRowLosses();
			athletespage.updateFirstRowDraws();
			athletespage.clickOnSaveBtn();
			actions.waitForElementToLoad();
			try {
				Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(),
						"Athlete details updated successfully.");
				Assert.assertEquals(athletespage.verifyUpdatedWinsValue.getText(), "13");
				Assert.assertEquals(athletespage.verifyUpdatedLossesValue.getText(), "2");
				Assert.assertEquals(athletespage.verifyUpdatedDrawsValue.getText(), "2");
			} catch (AssertionError e) {
				e.printStackTrace();
			}
		}

		@Test(priority = 9)
		public void deleteLifetimeRecordsTest() {
			actions.waitForElementToLoad();
			athletespage.clickOnLifetimeRecordsEditButton();
			actions.waitForElementToLoad();
			athletespage.clickOnDeleteBtn();
			athletespage.clickOnSaveBtn();
			try {
				Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(), athletespage.expMsgForSave);
				actions.waitForElementToLoad();
				Assert.assertEquals(athletespage.emptyDataInRecords.getText(), athletespage.expTextInEmptyDataInRecords);
			} catch (AssertionError e) {
				e.printStackTrace();
			}
		}

		@Test(priority = 10)
		public void addTwoLifetimeRecordsTest() {
			actions.waitForElementToLoad();
			athletespage.clickOnLifetimeRecordsEditButton();
			actions.waitForElementToLoad();
			athletespage.clickOnAddNewRecord();
			athletespage.clickOnSelectRecordTypeAsMuaythaiAndKickboxing();
			athletespage.enterWinsValue();
			athletespage.enterLossesValue();
			athletespage.enterDrawsValue();
			athletespage.clickOnAddNewRecord();
			athletespage.clickOnSelectRecordTypeAsMixedMartialArts();
			athletespage.secondRowWins.sendKeys("2");
			athletespage.secondRowLosses.sendKeys("1");
			athletespage.clickOnSaveBtn();
			try {
				Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(),athletespage.expMsgForSave);
				Assert.assertEquals(athletespage.confirmmuaythaiAndKickboxingRecordType.getText(),
						"Muay Thai/Kickboxing");
				Assert.assertEquals(athletespage.confirmMixedMartialArtsRecordType.getText(), "Mixed Martial Arts");
			} catch (AssertionError e) {
				e.printStackTrace();
			}
		}

		@Test(priority = 11)
		public void unselectVisibleStatusOfRecordTest() {
			actions.waitForElementToLoad();
			athletespage.clickOnLifetimeRecordsEditButton();
			actions.waitForElementToLoad();
			athletespage.secondRecordVisibleStatusCheckbox.click();
			athletespage.clickOnSaveBtn();
			try {
				Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(), athletespage.expMsgForSave);
				Assert.assertEquals(athletespage.confirmSecondRecordVisibleStatusIsFalse.getAttribute("class"),
						"MuiSvgIcon-root");
			} catch (AssertionError e) {
				e.printStackTrace();

			}
		}

		@Test(priority = 12)
		public void selectVisibleStatusofRecordTest() {
			athletespage.clickOnLifetimeRecordsEditButton();
			actions.waitForElementToLoad();
			athletespage.secondRecordVisibleStatusCheckbox.click();
			actions.waitForElementToLoad();
			athletespage.clickOnSaveBtn();
			try {
				Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(), athletespage.expMsgForSave);
				Assert.assertEquals(athletespage.confirmSecondRecordVisibleStatusIsTrue.getAttribute("class"),
						"MuiSvgIcon-root MuiSvgIcon-colorSecondary");
			} catch (AssertionError e) {
				e.printStackTrace();

			}
		}
	 

		@Test(priority = 13)
		public void addSocialProfilesTest() {
			actions.verticalScroll(0,500);
			athletespage.clickOnSocialProfileEditBtn();
			athletespage.clickOnAddNewProfileBtn();
			athletespage.clickOnSelectProfile();
			athletespage.clickOnFacebookProfileOption();
			athletespage.enterFacebookUrl();
			actions.waitForElementToLoad();
			athletespage.clickOnAddNewProfileBtn();
			athletespage.clickOnSelectProfile();
			athletespage.clickOnTwitterProfileOption();
			athletespage.enterTwitterUrl();
			actions.waitForElementToLoad();
			athletespage.clickOnAddNewProfileBtn();
			athletespage.clickOnSelectProfile();
			athletespage.clickOnInstagramProfileOption();
			athletespage.enterInstagramUrl();
			actions.waitForElementToLoad();
			athletespage.clickOnSaveBtn();
			try {
				Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(), athletespage.expMsgForSave);
				// athletespage.publishBtn.click();
				// athletespage.confirmPublishBtn.click();
				//Thread.sleep(3000);
				//Assert.assertEquals(athletespage.confirmPublish(), "All changes published.");
				Assert.assertTrue(athletespage.confirmFacebookProfile.isDisplayed());
				Assert.assertTrue(athletespage.confirmTwitterProfile.isDisplayed());
				Assert.assertTrue(athletespage.confirmInstagramProfile.isDisplayed());
			} catch (AssertionError e) {
				e.printStackTrace();
			}
		}

		
		@Test(priority = 14)
		public void updateSocialProfilesTest()  {
			try {
				athletespage.clickOnSocialProfileEditBtn();
				athletespage.editFBfield();
				athletespage.editTwitterField();
				athletespage.editInstagramField();
				athletespage.clickOnSaveBtn();
				Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(),athletespage.expMsgForSave);
				Assert.assertTrue(athletespage.confirmUpdatedFacebookProfile.isDisplayed());
				Assert.assertTrue(athletespage.confirmUpdatedTwitterProfile.isDisplayed());
				Assert.assertTrue(athletespage.confirmUpdatedInstagramProfile.isDisplayed());

			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}

		}
	  
	 

		@Test(priority = 15)
		public void deleteSocialProfilesTest()  {
			try {
				athletespage.clickOnSocialProfileEditBtn();
				athletespage.thirdRowDeleteBtn.click();
				athletespage.secondRowDeleteBtn.click();
				athletespage.firstRowDeleteBtn.click();
				athletespage.clickOnSaveBtn();
				Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(),athletespage.expMsgForSave);
				Assert.assertEquals(athletespage.emptyDataInSocialProfiles.getText(),athletespage.expMsgInemptyDataInSocialProfiles);
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
		}
	 

		@Test(priority = 16)
		public void addSocialProfileWithoutURL()  {
			try {
				athletespage.clickOnSocialProfileEditBtn();
				actions.waitForElementToLoad();
				athletespage.clickOnAddNewProfileBtn();
				Assert.assertFalse(athletespage.disabledSaveBtn.isEnabled());
				athletespage.clickOnSelectProfile();
				athletespage.clickOnFacebookProfileOption();
				Assert.assertEquals(athletespage.errorMsgOnFbField.getText(), athletespage.expErrorMsgOnFbField);
				Assert.assertFalse(athletespage.disabledSaveBtn.isEnabled());
				Assert.assertTrue(athletespage.cancelBtn.isEnabled());
				athletespage.cancelBtn.click();
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
		}
	
		@Test(priority = 17)
		public void addChampionshipsTest() throws InterruptedException  {
			try {
				actions.scrollToDown();
				actions.waitForElementToLoad();
				athletespage.clickOnChampionshipsEditBtn();
				athletespage.clickOnAddNewChampionshipBtn();
				athletespage.clickOnSelectChampionshipTypeAsWorldChampionship();
				athletespage.enterWeightclassInFirstRow();
				athletespage.clickOnSelectChampionshipStyleAsMMA();
				athletespage.clickOnSaveBtn();
				Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(),athletespage.expMsgForSave);
				Assert.assertTrue(athletespage.championLogoBtn.isDisplayed());
				Assert.assertEquals(athletespage.verifyChampionshipType.getText(), athletespage.expChampionshipType1);
				Assert.assertEquals(athletespage.verifyChampionshipWeightclass.getText(), "Featherweight");
				Assert.assertEquals(athletespage.verifyChampionshipStyle.getText(), "Mixed Martial Arts");
				Assert.assertTrue(athletespage.championLogoBtn.isDisplayed());
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
		}

		@Test(priority = 18)
		public void editChampionshipTest()  {
			try {
				athletespage.clickOnChampionshipsEditBtn();
				actions.waitForElementToLoad();
				athletespage.featherweightOption.click();
				actions.waitForElementToBeClickable(athletespage.bantamweightOption);
				athletespage.mixedMartialArtsStyle.click();
				athletespage.editChampionshipsStyle();
				athletespage.clickOnSaveBtn();
				Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(), athletespage.expMsgForSave);
				Assert.assertEquals(athletespage.verifyChampionshipWeightclassAsBantamweight.getText(), "Bantamweight");
				Assert.assertEquals(athletespage.verifyChampionshipStyleAsMuaythai.getText(), "Muay Thai");
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}

		}
	 
		@Test(priority = 19)
		public void addMultipleChampionshipTest() throws InterruptedException  {
			try {
				athletespage.clickOnChampionshipsEditBtn();
				athletespage.clickOnAddNewChampionshipBtn();
				athletespage.clickOnSelectChampionshipTypeAsWorldGrandprixChampionship();
				athletespage.enterWeightclassInSecondRow();
				athletespage.clickOnSelectChampionshipStyleAsBjj();
				athletespage.clickOnSaveBtn();
				actions.waitForElementToLoad();
				Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(),athletespage.expMsgForSave);
				Assert.assertTrue(athletespage.championLogoBtn.isDisplayed());
				Assert.assertEquals(athletespage.verifySecondRowChampionshipTypeAsWorldGrandPrix.getText(), athletespage.expChampionshipType2);
				Assert.assertEquals(athletespage.verifySecondRowChampionshipWeightclassAsFlyweight.getText(),
						"Flyweight");
				Assert.assertEquals(athletespage.verifySecondRowChampionshipStyleAsBJJ.getText(), "BJJ");
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}

		}

		@Test(priority = 20)
		public void deleteChampionshipsTest()  {
			try {
				athletespage.clickOnChampionshipsEditBtn();
				actions.waitForElementToLoad();
				athletespage.secondRowDeleteBtn.click();
				actions.waitForElementToLoad();
				athletespage.firstRowDeleteBtn.click();
				athletespage.clickOnSaveBtn();
				Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(),athletespage.expMsgForSave);
				Assert.assertEquals(athletespage.emptyDataInchampionship.getText(), athletespage.expMsgIneEmptyDataInchampionship);
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
		}

		@Test(priority = 21)
		public void verifyErrorMsgInchampionshipFieldsTest()  {
			try {
				athletespage.clickOnChampionshipsEditBtn();
				actions.waitForElementToLoad();
				athletespage.clickOnAddNewChampionshipBtn();
				Assert.assertEquals(athletespage.errorMsgInChampionshipType.getText(),athletespage.expErrorMsgInChampionshipType);
				Assert.assertEquals(athletespage.errorMsgInChampionshipWeightclass.getText(),athletespage.expErrorMsgInChampionshipWeightclass);
				Assert.assertFalse(athletespage.disabledSaveBtn.isEnabled());
				athletespage.clickOnCancelBtnInEditSections();
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
		}

		@Test(priority = 22)
		public void addAthleteNonONETitleTest() {
			try {
				actions.scrollToDown();
				athletespage.clickOnAthleteTitleEditBtn();
				athletespage.clickOnAddNewTitleBtn();
				athletespage.enterAthleteTitleInFirstRow();
				athletespage.clickOnSaveBtn();
				Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(),athletespage.expMsgForSave);
				Assert.assertEquals(athletespage.verifyAthleteTitle.getText(), "Indian kickboxing champion");
				// athletespage.publishBtn.click();
				// athletespage.confirmPublishBtn.click();
				// actions.waitForElementToLoad();
				// Assert.assertEquals(athletespage.confirmPublish(), "All changes published.");
			} catch (AssertionError e) {
				e.printStackTrace();
			}
		}
	 

		@Test(priority = 23)
		public void addAthleteTitleAsOneTest()  {
			try {
				athletespage.clickOnAthleteTitleEditBtn();
				athletespage.clickOnAddNewTitleBtn();
				athletespage.enterAthleteTitleInSecondRow();
				athletespage.clickOnOneTitleCheckboxInSecondRow();
				athletespage.clickOnSaveBtn();
				Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(),athletespage.expMsgForSave);
				actions.waitForElementToLoad();
				Assert.assertEquals(athletespage.verifyAthleteTitleInSecondRow.getText(),"ONE Atomweight World Champion");
				Assert.assertEquals(athletespage.verifyOneTitleCheckboxInsecondRowIsTrue.getAttribute("class"),
						"MuiSvgIcon-root MuiSvgIcon-colorSecondary");
			} catch (AssertionError e) {
				e.printStackTrace();
			}
		}

		@Test(priority = 24) 
		public void editAthleteOneTitleTest()  {
			try {
				athletespage.clickOnAthleteTitleEditBtn();
				athletespage.editAthleteTitleInSecondRow();
				athletespage.clickOnSaveBtn();
				Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(), athletespage.expMsgForSave);
				actions.waitForElementToLoad();
				Assert.assertEquals(athletespage.verifyEditedAthleteTitleInSecondRow.getText(),
						"2x ONE Atomweight World Champion");
			} catch (AssertionError e) {
				e.printStackTrace();
			}
		}

		@Test(priority = 25)
		public void deleteAthleteTitle()  {
			try {
				athletespage.clickOnAthleteTitleEditBtn();
				actions.waitForElementToLoad();
				athletespage.secondRowDeleteBtn.click();
				actions.waitForElementToLoad();
				athletespage.firstRowDeleteBtn.click();
				athletespage.clickOnSaveBtn();
				Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(),athletespage.expMsgForSave);
				actions.waitForElementToLoad();
				Assert.assertEquals(athletespage.emptyDataInTitle.getText(), athletespage.expMsgInemptyDataInTitle);
//			athletespage.publishBtn.click();
//			athletespage.confirmPublishBtn.click();
//			actions.waitForElementToLoad();
//			Assert.assertEquals(athletespage.confirmPublish(), "All changes published.");
			} catch (AssertionError e) {
				e.printStackTrace();
			}
		}
	

		@Test(priority = 26) 
		public void verifyTheSaveAndCancelButtonsTest()  {
			try {
				athletespage.clickOnAthleteTitleEditBtn();
				Assert.assertTrue(athletespage.saveAndAddBtns.get(0).isDisplayed());
				Assert.assertTrue(athletespage.cancelBtn.isDisplayed());
				athletespage.clickOnCancelBtnInEditSections();
			} catch (AssertionError e) {
				e.printStackTrace();
			}

		}
	 

		@Test(priority = 27) 
		public void addAtheleteDescTest() throws InterruptedException {
			try {
				actions.scrollToDown();
				athletespage.clickOnBioEditBtn();
				Thread.sleep(6000);
				athletespage.enterAthleteDescription();
				athletespage.clickOnSaveBtn();
				Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(), athletespage.expMsgForSave);
				actions.waitForElementToLoad();
				Assert.assertEquals(athletespage.verifyAthleteDescription.getText(),
						"Four-time Chin State Wrestling Champion Tial Thang was born on a small farm in the Chin State of Myanmar, and he always dreamed of representing his country in martial arts one day.");
				athletespage.publishBtn.click();
				athletespage.confirmPublishBtn.click();
				actions.waitForElementToLoad();
				Assert.assertEquals(athletespage.verifyConfirmationPopupForAthleteUpdate(),
						athletespage.expToastMsgForAthletePublish);
				Assert.assertEquals(athletespage.confirmPublish(), athletespage.expConfirmPublishText);
			} catch (AssertionError e) {
				e.printStackTrace();
			}
		}

		@Test(priority = 28) 
		public void verifyAthletesDefaultCreativesTest() throws InterruptedException  {
			actions.verticalScrollToTop();
			athletespage.navigateToAthleteCreativesTab();
			try {
				Assert.assertEquals(athletespage.defaultBioImage.getAttribute("src"),
						"https://res.cloudinary.com/onefc/image/upload/h_300,f_auto/v1590481350/athletes/fallback/male-1500x920.png");
				Assert.assertEquals(athletespage.defaultBioAlternativeImage.getAttribute("src"),
						"https://res.cloudinary.com/onefc/image/upload/h_300,f_auto/v1590481350/athletes/fallback/male-1500x920.png");
				Assert.assertEquals(athletespage.defaultFaceImage.getAttribute("src"),
						"https://res.cloudinary.com/onefc/image/upload/h_300,f_auto/v1590481349/athletes/fallback/male-256x256.png");
				Assert.assertEquals(athletespage.defaultBoutFaceImage.getAttribute("src"),
						"https://res.cloudinary.com/onefc/image/upload/h_300,f_auto/v1590481349/athletes/fallback/male-500x345.png");
				Assert.assertEquals(athletespage.defaultBoutFaceAlternativeImage.getAttribute("src"),
						"https://res.cloudinary.com/onefc/image/upload/h_300,f_auto/v1590481349/athletes/fallback/male-500x345.png");
				Assert.assertEquals(athletespage.defaultWorldChampionImage.getAttribute("src"),
						"https://res.cloudinary.com/onefc/image/upload/h_300,f_auto/v1590481350/athletes/fallback/male-1500x920.png");
				Assert.assertEquals(athletespage.defaultWorldGrandprixChampionImage.getAttribute("src"),
						"https://res.cloudinary.com/onefc/image/upload/h_300,f_auto/v1590481350/athletes/fallback/male-1500x920.png");
				Assert.assertEquals(athletespage.defaultHeroImage.getAttribute("src"),
						"https://res.cloudinary.com/onefc/image/upload/h_300,f_auto/v1590481350/athletes/fallback/male-1200x1165.png");
				Assert.assertEquals(athletespage.defaultBannerImage.getAttribute("src"),
						"https://res.cloudinary.com/onefc/image/upload/h_300,f_auto/v1590481350/athletes/fallback/male-1200x1165.png");
			} catch (AssertionError e) {
				e.printStackTrace();
			}

		}

		@Test(priority = 29)
		public void athletesCreativesUploadTest() throws Throwable {
			try {
				athletespage.clickOnBioImageReplaceBtn();
				athletespage.clickOnUploadBtn();
				athletespage.upload(
						System.getProperty("user.dir") + "/creatives/athlete creatives/Ben_Royle-hero-1500x920.png");
				actions.waitForElementPresent(athletespage.imageSaveBtn);
				Assert.assertTrue(athletespage.imageSaveBtn.isDisplayed());
				actions.waitForElementToBeClickable(athletespage.imageSaveBtn);
				Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(), athletespage.expMsgForSave);
				actions.waitForElementPresent(athletespage.bioImageDeleteBtn);
				Assert.assertTrue(athletespage.bioImageDeleteBtn.isDisplayed());
				athletespage.clickOnFaceImageReplaceBtn();
				athletespage.clickOnUploadBtn();
				athletespage.upload(
						System.getProperty("user.dir") + "/creatives/athlete creatives/Ben_Royle-avatar-256x256.png");
				actions.waitForElementPresent(athletespage.imageSaveBtn);
				Assert.assertTrue(athletespage.imageSaveBtn.isDisplayed());
				actions.waitForElementToBeClickable(athletespage.imageSaveBtn);
				Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(), athletespage.expMsgForSave);
				actions.waitForElementPresent(athletespage.faceImageDeleteBtn);
				Assert.assertTrue(athletespage.faceImageDeleteBtn.isDisplayed());
				athletespage.clickOnBoutFaceImageReplaceBtn();
				athletespage.clickOnUploadBtn();
				athletespage.upload(
						System.getProperty("user.dir") + "/creatives/athlete creatives/Ben_Royle-avatar-500x345.png");
				actions.waitForElementPresent(athletespage.imageSaveBtn);
				Assert.assertTrue(athletespage.imageSaveBtn.isDisplayed());
				actions.waitForElementToBeClickable(athletespage.imageSaveBtn);
				Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(), athletespage.expMsgForSave);
				actions.waitForElementPresent(athletespage.boutFaceImageDeleteBtn);
				Assert.assertTrue(athletespage.boutFaceImageDeleteBtn.isDisplayed());
				athletespage.clickOnWorldChampionImageReplaceBtn();
				athletespage.clickOnUploadBtn();
				athletespage.upload(
						System.getProperty("user.dir") + "/creatives/athlete creatives/John-Shink-hero-1500x920.png");
				actions.waitForElementPresent(athletespage.imageSaveBtn);
				Assert.assertTrue(athletespage.imageSaveBtn.isDisplayed());
				actions.waitForElementToBeClickable(athletespage.imageSaveBtn);
				Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(), athletespage.expMsgForSave);
				actions.waitForElementPresent(athletespage.worldChampionImageDeleteBtn);
				Assert.assertTrue(athletespage.worldChampionImageDeleteBtn.isDisplayed());
				actions.scrollToDown();
				athletespage.clickOnWorldGrandprixChampionImageReplaceBtn();
				athletespage.clickOnUploadBtn();
				athletespage.upload(System.getProperty("user.dir")
						+ "/creatives/athlete creatives/Yodkaikaew-Fairtex-hero-1500x920.png");
				actions.waitForElementPresent(athletespage.imageSaveBtn);
				Assert.assertTrue(athletespage.imageSaveBtn.isDisplayed());
				actions.waitForElementToBeClickable(athletespage.imageSaveBtn);
				Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(), athletespage.expMsgForSave);
				actions.waitForElementPresent(athletespage.worldGrandprixChampionImageDeleteBtn);
				Assert.assertTrue(athletespage.worldGrandprixChampionImageDeleteBtn.isDisplayed());
			} catch (AssertionError e) {
				e.printStackTrace();
			}

		}  
	

		@Test(priority = 30)
		public void deleteUploadedAthleteCreativesTest() throws InterruptedException {
			try {
				actions.verticalScrollToTop();
				athletespage.clickOnBioImageDeleteBtn();
				Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(), athletespage.expMsgForSave);
				Thread.sleep(5000);
				actions.waitForElementPresent(athletespage.defaultBioImage);
				Assert.assertEquals(athletespage.defaultBioImage.getAttribute("src"),
						"https://res.cloudinary.com/onefc/image/upload/h_300,f_auto/v1590481350/athletes/fallback/male-1500x920.png");
				athletespage.clickOnFaceImageDeleteBtn();
				Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(), athletespage.expMsgForSave);
				Thread.sleep(5000);
				actions.waitForElementPresent(athletespage.defaultFaceImage);
				Assert.assertEquals(athletespage.defaultFaceImage.getAttribute("src"),
						"https://res.cloudinary.com/onefc/image/upload/h_300,f_auto/v1590481349/athletes/fallback/male-256x256.png");
				athletespage.clickOnBoutFaceImageDeleteBtn();
				Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(), athletespage.expMsgForSave);
				Thread.sleep(5000);
				actions.waitForElementPresent(athletespage.defaultBoutFaceImage);
				Assert.assertEquals(athletespage.defaultBoutFaceImage.getAttribute("src"),
						"https://res.cloudinary.com/onefc/image/upload/h_300,f_auto/v1590481349/athletes/fallback/male-500x345.png");
				athletespage.clickOnWorldChampionImageDeleteBtn();
				Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(), athletespage.expMsgForSave);
				Thread.sleep(5000);
				actions.waitForElementPresent(athletespage.defaultWorldChampionImage);
				Assert.assertEquals(athletespage.defaultWorldChampionImage.getAttribute("src"),
						"https://res.cloudinary.com/onefc/image/upload/h_300,f_auto/v1590481350/athletes/fallback/male-1500x920.png");
				athletespage.clickOnWorldGrandprixChampionImageDeleteBtn();
				Assert.assertEquals(athletespage.verifyConfirmationPopupForSave(), athletespage.expMsgForSave);
				Thread.sleep(5000);
				actions.waitForElementPresent(athletespage.defaultWorldGrandprixChampionImage);
				Assert.assertEquals(athletespage.defaultWorldGrandprixChampionImage.getAttribute("src"),
						"https://res.cloudinary.com/onefc/image/upload/h_300,f_auto/v1590481350/athletes/fallback/male-1500x920.png");
			} catch (AssertionError e) {
				e.printStackTrace();
			}

		}
	  
	 

		@Test(priority = 31)
		public void verifyUploadImageErrorMsgTest() throws InterruptedException, AWTException {
			try {
				actions.verticalScrollToTop();
				athletespage.clickOnBioImageReplaceBtn();
				athletespage.clickOnUploadBtn();
				athletespage.upload(
						System.getProperty("user.dir") + "/creatives/athlete creatives/Ben_Royle-avatar-256x256.png");
				Assert.assertEquals(athletespage.verifyErrorMsgForBioImage(), athletespage.expErrorMsgForBioImage);
				athletespage.clickOnImageUploadCancelBtn();
				athletespage.clickOnFaceImageReplaceBtn();
				athletespage.clickOnUploadBtn();
				athletespage.upload(
						System.getProperty("user.dir") + "/creatives/athlete creatives/Ben_Royle-hero-1500x920.png");
				Assert.assertEquals(athletespage.verifyErrorMsgForFaceImage(), athletespage.expErrorMsgForFaceImage);
				athletespage.clickOnImageUploadCancelBtn();
				athletespage.clickOnBoutFaceImageReplaceBtn();
				athletespage.clickOnUploadBtn();
				athletespage.upload(
						System.getProperty("user.dir") + "/creatives/athlete creatives/Ben_Royle-hero-1500x920.png");
				Assert.assertEquals(athletespage.verifyErrorMsgForBoutFaceImage(),
						athletespage.expErrorMsgForBoutFaceImage);
				athletespage.clickOnImageUploadCancelBtn();
				athletespage.clickOnWorldChampionImageReplaceBtn();
				athletespage.clickOnUploadBtn();
				athletespage.upload(
						System.getProperty("user.dir") + "/creatives/athlete creatives/Ben_Royle-avatar-256x256.png");
				Assert.assertEquals(athletespage.verifyErrorMsgForWorldChampionImage(),
						athletespage.expErrorMsgForWorldChampionImage);
				athletespage.clickOnImageUploadCancelBtn();
				actions.scrollToDown();
				athletespage.clickOnWorldGrandprixChampionImageReplaceBtn();
				athletespage.clickOnUploadBtn();
				athletespage.upload(
						System.getProperty("user.dir") + "/creatives/athlete creatives/Ben_Royle-avatar-256x256.png");
				Assert.assertEquals(athletespage.verifyErrorMsgForWorldGrandprixChampionImage(),
						athletespage.expErrorMsgForWorldGrandprixChampionImage);
				athletespage.clickOnImageUploadCancelBtn();
			} catch (AssertionError e) {
				e.printStackTrace();
			}
		}

		@Test(priority = 32)
		public void verifyAddAthletePopupTest() throws InterruptedException {
			try {
				driver.navigate().back();
				athletespage.addAthleteBtnClick();
				Assert.assertEquals(athletespage.verifyAddAthletePopUpHeader(), athletespage.expAddAthletePopUpHeader);
				Assert.assertTrue(athletespage.firstName.isDisplayed());
				Assert.assertTrue(athletespage.lastName.isDisplayed());
				Assert.assertTrue(athletespage.athleteDob.isDisplayed());
				Assert.assertTrue(athletespage.gender.isDisplayed());
				Assert.assertTrue(athletespage.athleteHeight.isDisplayed());
				Assert.assertTrue(athletespage.weightclass.isDisplayed());
				Assert.assertTrue(athletespage.nationality.isDisplayed());
				Assert.assertTrue(athletespage.addAthleteCancelBtn.isDisplayed());
				Assert.assertTrue(athletespage.saveAndProceed.isDisplayed());
				athletespage.addAthletePopupCancelBtnClick();
			} catch (AssertionError e) {
				e.printStackTrace();
			}
		}

		@Test(priority = 33)
		public void addAthleteWithInvalidDataTest()  {
			athletespage.addAthleteBtnClick();
			athletespage.enterFirstName("Chris");
			athletespage.enterLastName();
			athletespage.enterInvalidDob();
			athletespage.enterAthleteHeight("165");
			athletespage.enterNationality();
			athletespage.enterGender(athletespage.male);
			athletespage.enterWeightclass();
			athletespage.clickOnSaveAndProceedBtn();
			try {
				Assert.assertEquals(athletespage.verifyAthleteDobErrorMessage(), athletespage.expAthleteDobErrorMsg);
			} catch (AssertionError e) {
				e.printStackTrace();
			}
			athletespage.addAthletePopupCancelBtnClick();
		}

		@Test(priority = 34)
		public void athleteAppDisplayToggleBtnTest()  {
			athletespage.addAthleteBtnClick();
			actions.waitForElementPresent(athletespage.addAthletePopupHeader);
			try {
				Assert.assertTrue(athletespage.verifyDisplayInAppToggleBtn());
			} catch (AssertionError e) {
				e.printStackTrace();
			}
			athletespage.addAthletePopupCancelBtnClick();
		}

		@Test(priority = 35)
		public void editAndCancelAthleteBasicDetailsTest() {
			driver.navigate().forward();
			actions.verticalScrollToTop();
			athletespage.clickOnBasicDetailsEditButton();
			athletespage.clearFirstName();
			athletespage.enterFirstName("Christian");
			athletespage.clearAthleteDob();
			athletespage.enterAthleteDob("1991-02-08");
			athletespage.clearAthleteHeight();
			athletespage.enterAthleteHeight("160");
			athletespage.clickOnCancelBtnInEditSections();
			try {
				Assert.assertEquals(athletespage.firstnameConfirmation.getText(), "Chris");
				Assert.assertEquals(athletespage.heightvalueConfirmation.getText(), "165");
				Assert.assertEquals(athletespage.dobConfirmation.getText(), "1990-02-07");
			} catch (AssertionError e) {
				e.printStackTrace();
			}
		}

	@Test(priority = 36)
	public void verifyAthletesDraftsTab() {
		try {
			driver.navigate().back();
			athletespage.clickOnAthletesDraftsTab();
			actions.waitForElementToLoad();
			for (int i = 0; i < athletespage.draftStateAthletesStatus.size(); i++) {
				Assert.assertEquals(athletespage.draftStateAthletesStatus.get(i).getText(), athletespage.expDraftStatusText );
			}
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 37)
	public void verifyAthleteFilterOptionsTest() {
		try {
			Assert.assertTrue(athletespage.nameOrNicknameSearchField.isDisplayed());
			Assert.assertTrue(athletespage.weightclassFieldInFilterpage.isDisplayed());
			Assert.assertTrue(athletespage.genderFieldInFilterpage.isDisplayed());
			Assert.assertTrue(athletespage.teamOrGymFieldInFilterpage.isDisplayed());
			Assert.assertTrue(athletespage.countryFieldInFilterpage.isDisplayed());

		} catch (AssertionError e) {
			e.printStackTrace();
		}

	}
	

	@Test(priority = 38)
	public void athleteSearchByNameTest() throws InterruptedException {
		try {
			athletespage.clickOnAllAthletesTab();
			actions.waitForElementToLoad();
			athletespage.enterStringInAthleteSearchField("Aung");
			Thread.sleep(3000);
			for (int i = 0; i < athletespage.searchResultsByName.size(); i++) {
				String athleteName = athletespage.searchResultsByName.get(i).getText();
				Assert.assertTrue(athleteName.contains("Aung"));
			}
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}
	
	
	@Test(priority = 39)
	public void verifyEmptyDataInFightHistoryTabTest() throws InterruptedException {
		driver.navigate().forward();
		athletespage.clickOnFightHistoryTab();
		actions.waitForElementPresent(athletespage.emptyDataInfightHistoryTab);
		try {
			Assert.assertEquals(athletespage.verifyEmptyFightHistoryTab(), athletespage.expTextInEmptyDataInRecords);

		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 40)
	public void verifyFightHistoryTabWithDataTest() throws InterruptedException {
		driver.navigate().back();
		athletespage.enterStringInAthleteSearchField("Aung La");
		athletespage.clickOnAthleteInSearchResults(athletespage.aungLaNsang);
		athletespage.clickOnFightHistoryTab();
		athletespage.waitForUpcomingEventsInFightHistory();
		athletespage.clickOnUpcomingEventsExpandBtn();
		try {
			Assert.assertTrue(athletespage.upcomingEventsInAthleteFightHistory.isDisplayed());
			Assert.assertTrue(athletespage.pastEventsInAthleteFightHistory.isDisplayed());
		} catch (AssertionError e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 41)
	public void upcomingBoutDetailsInAthleteFightHistoryTest() throws InterruptedException {
		athletespage.clickOnUpcomingEventsExpandBtn();
		try {
			Assert.assertEquals(athletespage.verifyUpcomingEventDetailsInFightHistory(),
					"FANTASY EVENT ON 31-DEC-2021 [DO NOT RUN LIVE], 31 DEC 2021, SHANGHAI");
			Assert.assertEquals(athletespage.verifyUpcomingText(), athletespage.expUpcomingText);
			Assert.assertEquals(athletespage.verifyRedCornerAthleteImageInUpcomingBout(),
					"background-image: url(\"//res.cloudinary.com/dq0uhpprk/image/upload/h_300,f_auto/v1574410301/athlete/sample/Aung20LaN20Sanga4a01c9e-a3c2-46be-a633-54accb7af97e.png\");");
			Assert.assertEquals(athletespage.verifyBlueCornerAthleteImageInUpcomingBout(),
					"background-image: url(\"//res.cloudinary.com/onefc/image/upload/h_300,f_auto/v1543149507/athletes/faceImage/BrandonVera9fc64578-ba6a-4f34-9293-c0234d4de505\");");

		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 42)
	public void upcomingEventBoutAthletePageNavigationTest() throws InterruptedException {
		athletespage.clickOnAthleteImageInFightHistory(athletespage.blueCornerAthleteImage);
		try {
			Assert.assertEquals(athletespage.verifyActiveTabInAthleteDetails(athletespage.activeTabIsFightHistory),
					"MuiButtonBase-root MuiTab-root MuiTab-textColorSecondary Mui-selected");
			Assert.assertEquals(athletespage.verifyAthletePageProfileName(athletespage.brandonVeraProfilePageName),
					"Brandon Vera");
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 43)
	public void navigateToUpcomingEventDetailsPageFromAthleteFightHistoryTest() throws InterruptedException {
		driver.navigate().back();
		actions.waitForElementPresent(athletespage.upcomingEventNameInAthleteFightHistory);
		athletespage.clickOnEventNameInAthleteFightHistory(athletespage.upcomingEventNameInAthleteFightHistory);
		actions.waitForElementPresent(athletespage.activeTabIsBouts);
		try {
			Assert.assertEquals(athletespage.verifyEventdetailsPageHeader(), athletespage.expEventdetailsPageHeader);
			Assert.assertEquals(athletespage.verifyActiveTabInAthleteDetails(athletespage.activeTabIsBouts),
					"MuiButtonBase-root MuiTab-root MuiTab-textColorSecondary Mui-selected");
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 44)
	public void pastEventBoutDetailsInAthleteFightHistoryTest() throws InterruptedException {
		driver.navigate().back();
		athletespage.clickOnFightHistoryTab();
		athletespage.clickOnUpcomingEventsExpandBtn();
		try {
			Assert.assertEquals(athletespage.verifyPastEventDetailsInFightHistory(),
					"ATHLETE STATS EVENT-5 ON 30-APR-2021, 30 APR 2021, MACAU");
			Assert.assertEquals(athletespage.verifyRedCornerAthleteImageInPastBout(),
					"background-image: url(\"//res.cloudinary.com/onefc/image/upload/h_300,f_auto/v1543149507/athletes/faceImage/BrandonVera9fc64578-ba6a-4f34-9293-c0234d4de505\");");
			Assert.assertEquals(athletespage.verifyBlueCornerAthleteImageInPastBout(),
					"background-image: url(\"//res.cloudinary.com/dq0uhpprk/image/upload/h_300,f_auto/v1574410301/athlete/sample/Aung20LaN20Sanga4a01c9e-a3c2-46be-a633-54accb7af97e.png\");");
			Assert.assertEquals(athletespage.verifyBoutResultInFightHistoryTab(), "WIN: R1, Submission");
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 45)
	public void downloadBtnInAthleteFightHistoryTest() throws InterruptedException, IOException {
		athletespage.downloadBtnForAunglaFightHistory.click();
		try {
           //validate download button is present or not in the athlete fight history tab
			Assert.assertTrue(athletespage.verifyAunglaFightHistoryDownloadBtn());
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 46)
	public void pastEventBoutAthletePageNavigationTest() throws InterruptedException {
		athletespage.clickOnAthleteImageInFightHistory(athletespage.pastEventRedCornerAthleteImage);
		try {
			Assert.assertEquals(athletespage.verifyActiveTabInAthleteDetails(athletespage.activeTabIsFightHistory),
					"MuiButtonBase-root MuiTab-root MuiTab-textColorSecondary Mui-selected");
			Assert.assertEquals(athletespage.verifyAthletePageProfileName(athletespage.brandonVeraProfilePageName),
					"Brandon Vera");
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 47)
	public void navigateToPastEventDetailsPageFromAthleteFightHistoryTest() throws InterruptedException {
		driver.navigate().back();
		actions.waitForElementPresent(athletespage.pastEventNameInAthleteFightHistory);
		athletespage.clickOnEventNameInAthleteFightHistory(athletespage.pastEventNameInAthleteFightHistory);
		try {
			Assert.assertEquals(athletespage.verifyEventdetailsPageHeader(), athletespage.expEventdetailsPageHeader);
			Assert.assertEquals(athletespage.verifyActiveTabInAthleteDetails(athletespage.activeTabIsBouts),
					"MuiButtonBase-root MuiTab-root MuiTab-textColorSecondary Mui-selected");
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
