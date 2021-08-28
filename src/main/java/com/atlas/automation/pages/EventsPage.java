package com.atlas.automation.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atlas.automation.actions.WebdriverActions;
import com.atlas.automation.base.BaseClass;

public class EventsPage extends BaseClass {
	WebdriverActions actions = new WebdriverActions();
	
	@FindBy(xpath = "//h2[contains(text(),'Events')]")
	public WebElement eventsPageTitle;

	public String verifyEventsPageTitle() {
		
		String eventstitle = eventsPageTitle.getText();
		return eventstitle;
	}
	
	@FindBy(xpath = "//a[text()='Automation1692 26-Aug-21']")
	public WebElement event1;
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']")
	public WebElement addEventBtn;

	@FindBy(xpath = "//input[@placeholder='Title']")
	public WebElement title;

	@FindBy(xpath = "//div[contains(text(),'Select Event Type')]")
	public WebElement eventType;
	
	@FindBy(xpath = "//div[contains(text(),'Select Event Enclosure')]")
	public WebElement eventClosure;

	@FindBy(xpath = "//div[contains(text(),'ONE Series')]")
	public WebElement one_Series;

	@FindBy(xpath = "//p[text()='ONE Series']")
	public WebElement confirmEventType;
	
	@FindBy(xpath = "//div[contains(text(),'Cage')]")
	public WebElement Cage;
	
	@FindBy(xpath = "//div[contains(text(),'Ring')]")
	public WebElement Ring;
	
	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1'])[1]")
	public WebElement confirmEventname;

	@FindBy(xpath = "//div[text()='Select Event Venue']")
	public WebElement eventVenue;

	@FindBy(xpath = "(//div[@class=' css-11ei81s-indicatorContainer'])[1]")
	public WebElement deleteVenue;
	
	@FindBy(xpath = "(//div[@class=' css-11ei81s-indicatorContainer'])[2]")
	public WebElement deleteclosure;

	@FindBy(xpath = "//div[contains(text(),'Axiata Arena, Kuala Lumpur')]")
	public WebElement axiata;
	
	@FindBy(xpath = "//div[contains(text(),'Baoshan Arena, Shanghai')]")
	public WebElement baoshan;

	@FindBy(xpath = "//p[contains(text(),'Axiata Arena, Kuala Lumpur')]")
	public WebElement confirmVenueadd;

	@FindBy(xpath = "//input[@placeholder='Event Number']")
	public WebElement eventNumber;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-disableElevation']")
	public WebElement saveAndProceed;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-disableElevation']")
	public WebElement publishBtn;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-disableElevation']")
	public WebElement confirmBtn;

	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation'])[2]")
	public WebElement description;

	@FindBy(xpath = "//p[contains(text(),'Please select a show type.')]")
	public WebElement pleaseselectashowtype;

	@FindBy(xpath = "//p[contains(text(),'Please select an event venue.')]")
	public WebElement pleaseselectaneventvenue;

	@FindBy(xpath = "//p[contains(text(),'Title is a required field.')]")
	public WebElement title_is_a_requiredfield;

	@FindBy(xpath = "//p[contains(text(),'Please select an athlete.')]")
	public WebElement please_select_an_athlete;

	@FindBy(xpath = "//p[contains(text(),'Please select a weightclass.')]")
	public WebElement please_select_a_weightclass;

	@FindBy(xpath = "//p[contains(text(),'Weight is a required field if weightclass is catchweight.')]")
	public WebElement weight_is_a_required_field_if_weightclass_is_catchweight;

	@FindBy(xpath = "//p[contains(text(),'Please select a style.')]")
	public WebElement please_select_a_style;

	@FindBy(xpath = "//span[contains(text(),'Clear Filter')]")
	public WebElement clearFilter;

	@FindBy(xpath = "//div[text()='Select Event Enclosure']")
	public WebElement selectEventEnclosure;

	@FindBy(xpath = "//div[contains(text(),'Cage')]")
	public WebElement cage;

	@FindBy(xpath = "//div[contains(text(),'Ring')]")
	public WebElement ring;

	@FindBy(xpath = "(//div[@class='MuiFormControl-root MuiFormControl-fullWidth'])[1]")
	public WebElement athlete1;

	@FindBy(xpath = "(//div[@class='MuiFormControl-root MuiFormControl-fullWidth'])[2]")
	public WebElement athlete2;

	@FindBy(xpath = "//div[contains(text(),'AJ Lias  Mansor')]")
	public WebElement ajLiasMansor;

	@FindBy(xpath = "//div[contains(text(),'TBA')]")
	public WebElement tba;

	@FindBy(xpath = "//div[contains(text(),'Adi Nugroho')]")
	public WebElement adiNugroho;

	@FindBy(xpath = "//div[contains(text(),'Ritu  Phogat')]")
	public WebElement rituPogat;
	
	@FindBy(xpath = "//div[contains(text(),'Neha Kashyap')]")
	public WebElement NehaKashyap;
	
	@FindBy(xpath = "//div[contains(text(),'Asha R')]")
	public WebElement AshaR;

	
	
	@FindBy(xpath = "//div[contains(text(),'Adi Paryanto')]")
	public WebElement adiParyanto;

	@FindBy(xpath = "//div[contains(text(),'Abro Fernandes')]")
	public WebElement abroFernandes;

	@FindBy(xpath = "//div[contains(text(),'Adib Sulaiman')]")
	public WebElement adibSulaiman;

	@FindBy(xpath = "//div[contains(text(),'Adrian Pang')]")
	public WebElement adrianPang;

	@FindBy(xpath = "//div[contains(text(),'Adrian Mattheis')]")
	public WebElement adrianMattheis;
	
	@FindBy(xpath = "//div[contains(text(),'TBA')]")
	public WebElement TBA;


	@FindBy(xpath = "//div[contains(text(),'Select Weightclass')]")
	public WebElement weightclass;

	@FindBy(xpath = "//div[contains(text(),'Featherweight')]")
	public WebElement featherweight;

	@FindBy(xpath = "//div[contains(text(),'Flyweight')]")
	public WebElement flyweight;
	
	@FindBy(xpath = "//div[contains(text(),'Strawweight')]")
	public WebElement strawweight;

	@FindBy(xpath = "//div[contains(text(),'Atomweight')]")
	public WebElement atomweight;

	@FindBy(xpath = "//div[contains(text(),'Catchweight')]")
	public WebElement catchweight;

	@FindBy(xpath = "//input[@placeholder='Weight (KG)']")
	public WebElement catchweightvalue;

	@FindBy(xpath = "//strong[text()=': 77 KG']")
	public WebElement confirmCatchweightvalue;

	@FindBy(xpath = "//div[contains(text(),'Select Style')]")
	public WebElement style;

	@FindBy(xpath = "(//div[@class='MuiFormControl-root MuiFormControl-fullWidth'])[7]")
	public WebElement tags;

	@FindBy(xpath = "//div[contains(text(),'Mixed Martial Arts')]")
	public WebElement mixedMartialArts;

	@FindBy(xpath = "//div[contains(text(),'Kickboxing')]")
	public WebElement kickboxing;

	@FindBy(xpath = "//div[contains(text(),'Muay Thai')]")
	public WebElement muayThai;

	@FindBy(xpath = "//div[contains(text(),'Select Championship Type')]")
	public WebElement selectchampionshipType;

	//@FindBy(xpath = "//div[contains(text(),'Lightweight World Championship')]")
	//public WebElement confirmLightweightWorldChampionship;

	@FindBy(xpath = "//div[contains(text(),'Laga Cadangan Flyweight World Grand Prix')]")
	public WebElement semiFinalFeatherweightWorldGrandPrix;

	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div[2]/div/div[4]/div[2]/table/tbody/tr/td[2]/span/span[1]/span[1]/input")
	public WebElement enable;

	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div[2]/div/div[2]/div[1]/table/tbody/tr/td[2]/span/span[1]/span[1]/input")
	public WebElement superseries;

	@FindBy(xpath = "//p[contains(text(),'ONE Series')]")
	public WebElement confirmType;

	@FindBy(xpath = "//label[contains(text(),'Title')]")
	public WebElement searchField;

	@FindBy(xpath = "//p[contains(text(),'Axiata Arena, Kuala Lumpur')]")
	public WebElement confirmVenue;

	@FindBy(xpath = "//span[contains(text(),'UNCONFIRMED')]")
	public WebElement unconfirmedtext;

	
	@FindBy(xpath = "//span[contains(text(), 'Mark all as confirmed')]")
	public WebElement confirmationMarkAllasconfirmed;

	@FindBy(xpath = "//p[contains(text(),'Adi Nugroho')]")
	public WebElement confirmAthleteReplaceAthlete1;

	@FindBy(xpath = "//p[contains(text(),'Adi Paryanto')]")
	public WebElement confirmAthleteReplaceAthlete2;

	@FindBy(xpath = "//h6[text()='MAIN CARD (1 BOUTS)']")
	public WebElement confirmBoutDelete;

	@FindBy(xpath = "//h6[text()='MAIN CARD (0 BOUTS)']")
	public WebElement confirmCancelBout;

	@FindBy(xpath = "(//span[@class='MuiButtonBase-root MuiIconButton-root jss115 MuiSwitch-switchBase'])[1]")
	public WebElement confirmBoutHide;

	@FindBy(name = "searchQuery")
	public WebElement searchQuery;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-disableElevation']")
	public WebElement cancel;

	@FindBy(xpath = "//h2[contains(text(),'Events')]")
	public WebElement confirmEventcancel;

	@FindBy(xpath = "//h2[contains(text(),'Compare Version - Event')]")
	public WebElement compareVersion;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-disableElevation']")
	public WebElement SaveAndProceed;

	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation'])[1]")
	public WebElement maincardEditBtn;

	@FindBy(xpath = " (//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation'])[2]")
	public WebElement leadcardEditBtn;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']")
	public WebElement addBout;

	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation'])[1]")
	public WebElement mainCardAdditionCancel;

	@FindBy(xpath = "//div[text()='Show Type']")
	public WebElement show_Type;

	@FindBy(xpath = "//div[contains(text(),'Venue')]")
	public WebElement venue;

	@FindBy(xpath = "//div[contains(text(),'ONE Series')]")
	public WebElement oneSeries;

	@FindBy(xpath = "//div[contains(text(),'One Warrior Series')]")
	public WebElement oneWarriorSeries;

	@FindBy(xpath = "//div[contains(text(),'One Hero Series')]")
	public WebElement oneHeroSeries;

	@FindBy(xpath = "//div[contains(text(),'ONE Infinity Series')]")
	public WebElement oneInfinitySeries;

	@FindBy(xpath = "//div[contains(text(),'Bellesalle Shibuya Garden, Tokyo')]")
	public WebElement tokyo;

	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/div/div[3]/button[2] ")
	public WebElement delete;

	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div[2]/label/span[1]/span[1]")
	public WebElement understand;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-disableElevation']")
	public WebElement confirm;

	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall'])[1]")
	public WebElement reorder;

	@FindBy(xpath = "//p[text()='Adib Sulaiman']")
	public WebElement scrwb;

	@FindBy(xpath = "//p[text()='Adam okay Noi Check VS Adam okay Noi1234']")
	public WebElement dstwb;

	@FindBy(xpath = " //button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-disableElevation']")
	public WebElement savechanges;

	@FindBy(xpath = "//body[@id='tinymce']")
	public WebElement updatedescription;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']")
	public WebElement savedes;

	@FindBy(xpath = " //button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']")
	public WebElement appsettingsave;

	@FindBy(xpath = " //button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']")
	public WebElement reordersave;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-disableElevation']")
	public WebElement eventcancel;

	@FindBy(xpath = "//span[@class='MuiButton-startIcon MuiButton-iconSizeMedium']")
	public WebElement goToDetails;

	@FindBy(xpath = "(//span[@class='MuiIconButton-label'])[5]")
	public WebElement editBout;

	@FindBy(xpath = "//span[text()='Mark all as confirmed']")
	public WebElement markAllAsConFirmed;

	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation'])[1]")
	public WebElement editEvent;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']")
	public WebElement saveEventEdit;

	@FindBy(xpath = " //span[text()='Draft']")
	public WebElement draft;
	
	@FindBy(xpath = " //span[text()='Upcoming']")
	public WebElement upcoming;

	@FindBy(xpath = " //span[text()='All']")
	public WebElement all;

	@FindBy(xpath = "(//button[@title='Next page'])[1]")
	public WebElement nextpage;

	@FindBy(xpath = "(//button[@title='Previous page'])[1]")
	public WebElement previouspage;

	@FindBy(xpath = "//a[@title='Adi Nugroho']")
	public WebElement athlete;

	@FindBy(xpath = "//span[text()='Bouts']")
	public WebElement boutcardTab;

	@FindBy(xpath = "//h6[@class='MuiTypography-root MuiTypography-h6']")
	public WebElement totalBout;

	@FindBy(xpath = "(//h6[@class='MuiTypography-root MuiTypography-h6 MuiTypography-displayBlock'])[1]")
	public WebElement mainCardBout;

	@FindBy(xpath = "(//h6[@class='MuiTypography-root MuiTypography-h6 MuiTypography-displayBlock'])[2]")
	public WebElement leadCardBout;

	@FindBy(xpath = "(//div[@class='MuiPaper-root MuiAlert-root MuiAlert-standardInfo MuiPaper-elevation0'])[1]")
	public WebElement mainCardBoutmsg;

	@FindBy(xpath = "(//div[@class='MuiPaper-root MuiAlert-root MuiAlert-standardInfo MuiPaper-elevation0'])[2]")
	public WebElement leadCardBoutmsg;

	@FindBy(xpath = "//span[text()='General']")
	public WebElement generalTab;

	@FindBy(xpath = "//span[text()='App Settings']")
	public WebElement appSettingTab;

	@FindBy(xpath = "//span[text()='Display the event?']")
	public WebElement displaytheeventText;

	@FindBy(xpath = "//span[text()='Hide bout cards?']")
	public WebElement hideboutcardsText;

	@FindBy(xpath = "//strong[text()='Last Published To The World:']")
	public WebElement lastpublishedtoworldText;

	@FindBy(xpath = "//span[text()='Logs']")
	public WebElement logsTab;

	@FindBy(xpath = "//h6[text()='BASIC DETAILS']")
	public WebElement basicDetails;

	@FindBy(xpath = "//h6[text()='DESCRIPTION']")
	public WebElement eventDescription;

	@FindBy(xpath = "//div[@class='MuiPaper-root MuiAlert-root MuiAlert-standardInfo MuiPaper-elevation0']")
	public WebElement descriptionsection;

	@FindBy(xpath = "//div[text()='Nothing to show!']")
	public WebElement nothingtoshow;

	@FindBy(xpath = "//a[text()='Version']")
	public WebElement versions;

	@FindBy(xpath = " //span[text()='Show Everything']")
	public WebElement showEverything;

	@FindBy(xpath = "//span[contains(text(),'Adrian Mattheis')]")
	public WebElement updated;

	@FindBy(xpath = "//a[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-disableElevation']")
	public WebElement goToDetailsPage;

	@FindBy(xpath = "  //span[text()='Title']")
	public WebElement detailConfirm;
	//(//span[@class='MuiSwitch-root'])[1]
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/main/div/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div[1]/table/tbody/tr/td[2]/span/span[1]")
	public WebElement hideEvent;

	@FindBy(xpath = "(//span[@class='MuiSwitch-root'])[2]")
	public WebElement displayBout;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']")
	public WebElement editappsettingEvent;

	@FindBy(xpath = "//span[@class='MuiButtonBase-root MuiIconButton-root jss116 MuiSwitch-switchBase']")
	public WebElement confirmHideEvent;

	@FindBy(xpath = " //span[text()='Past']")
	public WebElement past;

	@FindBy(xpath = " //a[text()='Fists']")
	public WebElement searchResult;

	@FindBy(xpath = "//span[contains(text(),'Creatives')]")
	public WebElement creativestab;
	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation'])[1]")
	public WebElement bannerListing;

	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation'])[2]")
	public WebElement bannerUpcoming;

	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation'])[3]")
	public WebElement featuredImage;

	@FindBy(xpath = "//h5[@class='MuiTypography-root MuiTypography-h5 MuiTypography-colorTextSecondary MuiTypography-alignCenter']")
	public WebElement dropImage;

	@FindBy(xpath = "//span[text()='Save']")
	public WebElement saveImage;

	@FindBy(xpath = "//p[text()='Banner - Listing']/../following-sibling::div/button[2]")
	public WebElement deleteBannerListing;

	@FindBy(xpath = "//p[text()='Banner - Upcoming']/../following-sibling::div/button[2]")
	public WebElement deleteBannerUpcoming;

	@FindBy(xpath = "//p[text()='Featured Image']/../following-sibling::div/button[2]")
	public WebElement deleteFeaturedImage;

	@FindBy(xpath = "//th/a[contains(text(),'Fist')]")
	public List<WebElement> searchResultsByName;

	@FindBy(xpath = "//tr/td[text()='ONE Series']")
	public List<WebElement> filterShowType;

	@FindBy(xpath = "//tr/td[text()='One Warrior Series']")
	public List<WebElement> filterOneWarriorSeries;

	@FindBy(xpath = "//tr/td[contains(text(),'Bellesalle Shibuya Garden, Tokyo')]")
	public List<WebElement> filterVenue;

	@FindBy(xpath = "//tr/td[text()='2019']")
	public List<WebElement> filterYear;

	@FindBy(xpath = "//tr/td/div/span[text()='DRAFT']")
	public List<WebElement> draftEvents;

	@FindBy(xpath = "//*[text()='Event details updated successfully.']")
	public WebElement confirmationPopupTextForSave;
	
	@FindBy(xpath = "//*[text()='Event created successfully.']")
	public WebElement confirmationPopupTextForEventCreation;
	
	@FindBy(xpath = "//*[text()='Event deleted successfully']")
	public WebElement confirmationPopupTextForEventDeletion;

	@FindBy(xpath = "//a[text()='Adi Paryanto']")
	public WebElement fighthistoryAthlete1;

	@FindBy(xpath = "//a[text()='Adi Nugroho']")
	public WebElement fighthistoryAthlete2;

	@FindBy(xpath = "//a[text()='Alain Ngalani ']")
	public WebElement confirmationAthlete1;

	@FindBy(xpath = "//a[text()='AJ Lias  Mansor']")
	public WebElement confirmationAthlete2;

	@FindBy(xpath = "//a[text()='Abro Fernandes']")
	public WebElement replacedconfirmationAthlete1;

	@FindBy(xpath = "//a[text()='Adib Sulaiman']")
	public WebElement confirmreplacedAthleteRedCorner;

	@FindBy(xpath = "//a[text()='AJ Lias  Mansor']")
	public WebElement confirmreplacedAthleteBlueCorner;

	@FindBy(xpath = "//p[text()='It’s ONE Championship’s biggest month in history, with four weeks of blockbuster events kicking off on 7 April with ONE on TNT .A massive flyweight battle takes place in the main event. After winning the grueling ONE Flyweight World Grand Prix, 12-time UFC World Champion Demetrious Johnson can cement his legacy as the greatest mixed martial artist of all time if he dethrones six-time ONE Flyweight World Champion Adriano Moraes, who promises to be the first man to finish “Mighty Mouse.Plus, four-time UFC and Bellator World Champion Eddie Alvarez battles to prove he belongs in the promotion after a rough start to his ONE Championship career, but standing in his way is dangerous #2 lightweight contender Iuri Lapicus.The rest of the stacked card features superstars such as ONE Flyweight Muay Thai World Champion Rodtang Jitmuangnon and heavyweight sensation Oumar Kane, so mark your calendars, check your local listings, and download the ONE Super App now!']")
	public WebElement descriptionConfirmation;

	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1'])[5]")
	public WebElement enclosureConfirmation;

	@FindBy(xpath = "(//div[@class=' css-11ei81s-indicatorContainer'])[2]")
	public WebElement removeChampionship;

	@FindBy(xpath = "//strong[text()='SUPER SERIES: MIXED MARTIAL ARTS']")
	public WebElement confirmSuperseries;

	@FindBy(xpath = "//h6[text()='Please choose an image with dimensions 1360x640']")
	public WebElement confirmBannerListingDimension;

	@FindBy(xpath = "//h6[text()='Please choose an image with dimensions 1920x1080']")
	public WebElement confirmBannerUpcomingDimension;

	@FindBy(xpath = "//h6[text()='Please choose an image with dimensions 1800x1200']")
	public WebElement confirmFeaturedImageDimension;

	@FindBy(xpath = "//span[text()='Cancel']")
	public WebElement confirmBannerListingDimensionCancel;

	@FindBy(xpath = "//p[contains(text(),'21-40')]")
	public WebElement nextEntries;
	
	@FindBy(xpath = "//p[contains(text(),'41-60')]")
	public WebElement pastnextEntries;
	
	@FindBy(xpath = "//p[contains(text(),'21-40')]")
	public WebElement pastprevEntries;

	@FindBy(xpath = "//p[contains(text(),'1-20')]")
	public WebElement prevEntries;

	@FindBy(xpath = "//p[contains(text(),'1-10')]")
	public WebElement confirmEntries10;

	@FindBy(xpath = "//p[contains(text(),'1-30')]")
	public WebElement prevEntries30;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']")
	public WebElement disable;

	@FindBy(xpath = "//h6[text()='MAIN CARD (2 BOUTS)']")
	public WebElement confirmMarkAllasconfirmed;

	@FindBy(xpath = "//button[@Title='Sort in ascending order']")
	public WebElement sortAscending;

	@FindBy(xpath = "//button[@Title='Remove sorting']")
	public WebElement Removesorting;
	
	@FindBy(xpath = "//tbody/tr/th")
	public List<WebElement> resultsByName;

	@FindBy(xpath = "//button[@Title='Sort in descending order']")
	public WebElement sortDescending;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-disableElevation']")
	public WebElement reordercancel;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorInherit']")
	public WebElement notificationbelliconbtn;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-disableElevation']")
	public WebElement notificationcancel;

	@FindBy(xpath = "//h2[text()='Notification Feed']")
	public WebElement notificationFeed;

	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/main/div/div[2]/div[2]/div[2]/div/div[2]/div[1]/div/div/div[1]/p/a")
	public WebElement versionNo1;

	@FindBy(xpath = "//a[text()='5']")
	public WebElement versionNo2;

	@FindBy(xpath = "//img[@src='https://res.cloudinary.com/onefc/image/upload/h_300,f_auto/v1616403372/event/ea8a8d8f-f99c-4002-b2e6-b2f0be656fc9.jpg']")
	public WebElement bannerListingCreative;

	@FindBy(xpath = "//img[@src='https://res.cloudinary.com/onefc/image/upload/h_300,f_auto/v1616403399/event/e5a52479-87f8-4df7-973e-cd9ad4c6e5eb.jpg']")
	public WebElement bannerUpcomingCreative;

	@FindBy(xpath = "//img[@src='https://res.cloudinary.com/onefc/image/upload/h_300,f_auto/v1616403421/event/295b33e5-850a-4e2b-b728-accf31af3d9c.jpg']")
	public WebElement featuredImageCreative;

	@FindBy(xpath = "//img[@src='https://res.cloudinary.com/dq0uhpprk/image/upload/h_300,f_auto/v1618988264/event/sample/6bf12c96-8128-4e38-83ab-6e6dc832e3b2.jpg']")
	public WebElement uploadBannerListingCreative;

	@FindBy(xpath = "//img[@src='https://res.cloudinary.com/dq0uhpprk/image/upload/h_300,f_auto/v1618988284/event/sample/dddc19a1-a6b9-4959-827c-b493113001a8.jpg']")
	public WebElement uploadFeaturedImageCreative;

	@FindBy(xpath = "//img[@src='https://res.cloudinary.com/dq0uhpprk/image/upload/h_300,f_auto/v1618988823/event/sample/4d4dc1a9-a37b-41de-bd28-fb75e85748a4.png']")
	public WebElement uploadBannerUpcomingCreative;

	@FindBy(xpath = "//input[@type='checkbox']")
	public WebElement displayInAppToggleBtn;

	@FindBy(xpath = "//span[text()='Fight History']")
	public WebElement fighthistory;

	@FindBy(xpath = "//span[text()='Download']")
	public WebElement download;

	@FindBy(xpath = "//th/a")
	public List<WebElement> eventsort;

	@FindBy(xpath = "(//div[@class='MuiSelect-root MuiSelect-select MuiTablePagination-select MuiSelect-selectMenu MuiInputBase-input'])[1]")
	public WebElement selectentries;

	@FindBy(xpath = "//li[text()='10']")
	public WebElement select10entries;

	@FindBy(xpath = "//li[text()='30']")
	public WebElement select30entries;

	@FindBy(xpath = "//tbody/tr")
	public List<WebElement> rowCount;

	@FindBy(xpath = "//span[contains(text(),'Adrian Mattheis vs Adrian Pang')]")
	public WebElement compare;

	@FindBy(xpath = "//span[@id='client-snackbar']")
	public WebElement duplicateEventError;

	@FindBy(xpath = "//div[contains(text(),'Baoshan Arena, Shanghai')]")
	public WebElement baoshanArenaShanghai;

	@FindBy(xpath = "//div[contains(text(),'Impact Arena, Bangkok')]")
	public WebElement impactArenaBangkok;

	@FindBy(xpath = "//div[contains(text(),'Ryogoku Kokugikan, Tokyo')]")
	public WebElement kokugikan;

	@FindBy(xpath = "//div[contains(text(),'World Trade Centre, Dubai')]")
	public WebElement worldTradeCentreDubai;

	@FindBy(xpath = "//div[contains(text(),'Fabrice Fairtex Delannon')]")
	public WebElement fabriceFairtexDelannon;

	@FindBy(xpath = "//div[contains(text(),'Mark Fairtex Abelardo')]")
	public WebElement markFairtexAbelardo;

	@FindBy(xpath = "//div[contains(text(),'Saemapetch Fairtex')]")
	public WebElement saemapetchFairtex;

	@FindBy(xpath = "//div[contains(text(),'Stamp  Fairtex')]")
	public WebElement stampFairtex;

	@FindBy(xpath = "//div[contains(text(),'Yodsanklai IWE Fairtex')]")
	public WebElement yodsanklaiIWEFairtex;

	@FindBy(xpath = "//div[contains(text(),'Yohann Fairtex Drai')]")
	public WebElement yohannFairtexDrai;

	@FindBy(xpath = "//div[contains(text(),'Light Heavyweight World Championship')]")
	public WebElement lightHeavyweightWorldChampionship;

	@FindBy(xpath = "//div[contains(text(),'Heavyweight World Championship')]")
	public WebElement heavyweightWorldChampionship;

	@FindBy(xpath = "//div[contains(text(),'Boxing')]")
	public WebElement boxing;

	@FindBy(xpath = "//div[contains(text(),'Dutch Kickboxing')]")
	public WebElement dutchKickboxing;

	@FindBy(xpath = "//div[contains(text(),'BR')]")
	public WebElement br;

	@FindBy(xpath = "//div[contains(text(),'TNT')]")
	public WebElement tnt;

	@FindBy(xpath = "(//div[contains(text(),'Regular')])[3]")
	public WebElement regular;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-disableElevation Mui-disabled Mui-disabled']")
	public WebElement PublishedToWorldDisabled;

	@FindBy(xpath = "//button[@class='MuiGrid-root jss184 MuiGrid-container MuiGrid-align-items-xs-center']")
	public WebElement publishedToWorldEnabled;

	@FindBy(xpath = " (//td[@class='MuiTableCell-root MuiTableCell-body'])[3]")
	public WebElement publishtoteamStatus;

	@FindBy(xpath = " (//td[@class='MuiTableCell-root MuiTableCell-body'])[4]")
	public WebElement publishtoworldStatus;

	@FindBy(xpath = "//th/a")
	public WebElement event;

	
	@FindBy(xpath = "(//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-true'])[1]")
	public WebElement eventbanner;
	
	@FindBy(xpath = "//span[text()='Publish To The Team']")
	public WebElement publishToTeam;
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained jss96 jss98 jss100 MuiButton-containedSecondary MuiButton-disableElevation Mui-disabled Mui-disabled']")
	public WebElement publishToTeamBtn;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-disableElevation Mui-disabled Mui-disabled']")
	public WebElement publishToWorldBtn;
	
	@FindBy(xpath = "//span[text()='Publish To The World']")
	public WebElement publishToWorld;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-disableElevation Mui-disabled Mui-disabled']")
	public WebElement publishToWorldbtn;

	@FindBy(xpath = "//p[text()='0-0 of 0']")
	public WebElement noEventFound;

	@FindBy(xpath = "//p[text()='Banner - Listing']")
	public WebElement bannerListingText;

	@FindBy(xpath = "//p[text()='Banner - Upcoming']")
	public WebElement bannerUpcomingText;

	@FindBy(xpath = "//p[text()='Featured Image']")
	public WebElement featuredImageText;

	@FindBy(xpath = "//img[@src='//res.cloudinary.com/dq0uhpprk/image/upload/h_300,f_auto/v1596623179/cities/sample/795addc0-f592-4bc0-a00f-68bbb2967d45.jpg']")
	public WebElement venuecreativebanner;

	@FindBy(xpath = "//img[@src='//res.cloudinary.com/dq0uhpprk/image/upload/h_300,f_auto/v1596623171/cities/sample/d243f13b-96b5-4b38-9682-ae3841379a0d.jpg']")
	public WebElement venuecreativelisting;

	@FindBy(xpath = "//img[@src='//res.cloudinary.com/dq0uhpprk/image/upload/h_300,f_auto/v1596623737/cities/sample/44349c17-b1bb-4361-aa8d-0c39b4b210e2.jpg']")
	public WebElement venuecreativebannerwithvenue;

	@FindBy(xpath = "//img[@src='//res.cloudinary.com/dq0uhpprk/image/upload/h_300,f_auto/v1596623737/cities/sample/8434e366-d02b-4e93-bbbf-0340ec11811a.jpg']")
	public WebElement venuecreativelistingwithvenue;

	@FindBy(xpath = "//img[@src='//res.cloudinary.com/dq0uhpprk/image/upload/h_300,f_auto/v1592053090/cities/sample/4feea529-d9ae-414e-ab62-5a97ee6da0f6.jpg']")
	public WebElement venuecreativebannerupload;

	@FindBy(xpath = "//h2[text()='Adi Nugroho']")
	public WebElement athletename;

	@FindBy(xpath = "//div[text()='BR']")
    public WebElement BR;
   
   @FindBy(xpath = "(//div[text()='Regular'])[2]")
    public WebElement Regular;
   
   @FindBy(xpath = "//div[text()='No matching tag found.']")
    public WebElement Nomatchfound;
   
   @FindBy(xpath = "//div[text()='TNT']")
    public WebElement TNT;
   
   @FindBy(xpath = "(//div[@style='margin-left: 58px;'])[1]")
    public WebElement tagcheck1;
   
   @FindBy(xpath = "(//div[@style='margin-left: 58px;'])[2]")
    public WebElement tagcheck2;
   
   @FindBy(xpath = "(//div[@style='margin-left: 58px;'])[3]")
    public WebElement tagcheck3;
 
   @FindBy(xpath = "(//div[@style='margin-left: 58px;'])[4]")
    public WebElement tagcheck4;
                   
   @FindBy(xpath ="/html/body/div[4]/div[3]/div/div[2]/div/div[5]/div/table/tbody/tr/td[2]/div/div/div/div[1]/div[1]/div[2]")
   public WebElement tagDelete;
   
   @FindBy(xpath= "//div[text()='Year']")
   public WebElement year;


   @FindBy(xpath="//div[contains(text(),'2019')]")
   public WebElement year2019;

   @FindBy(xpath="(//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-4 MuiGrid-grid-md-3 MuiGrid-grid-lg-2'])[5]")
   public WebElement month;

   @FindBy(xpath="//*[@id=\"root\"]/div[2]/main/div/div[3]/form/div/div/div[2]/div/div/div/div[2]/div[1]")
   public WebElement cancelshowfilter;

  @FindBy(xpath="//*[@id=\"root\"]/div[2]/main/div/div[3]/form/div/div/div[3]/div/div/div/div[2]")
  public WebElement cancelvenuefilter;


  @FindBy(xpath="//*[@id=\"root\"]/div[2]/main/div/div[3]/form/div/div/div[4]/div/div/div/div[2]/div[1]")
  public WebElement cancelyearfilter;

       @FindBy(xpath="//tr[1]/td[1]/*[@title='Not visible on app and website']")
       public WebElement notVisibleOnAppStatusIcon;

        @FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-container MuiGrid-wrap-xs-nowrap MuiGrid-align-items-xs-center']")
	    public WebElement titleHeader;
	    
	    @FindBy(xpath = "(//th[@class='MuiTableCell-root MuiTableCell-head'])[1]")
	    public WebElement eventNoHeader;
	    @FindBy(xpath = "(//th[@class='MuiTableCell-root MuiTableCell-head'])[2]")
	    public WebElement showtypeHeader;
	    @FindBy(xpath = "(//th[@class='MuiTableCell-root MuiTableCell-head'])[3]")
	    public WebElement dateHeader;
	    @FindBy(xpath = "(//th[@class='MuiTableCell-root MuiTableCell-head'])[4]")
	    public WebElement venueHeader;
	  
        @FindBy(xpath = "(//th[@class='MuiTableCell-root MuiTableCell-head'])[5]")
	    public WebElement publishtoteamHeader;
	    @FindBy(xpath = "(//th[@class='MuiTableCell-root MuiTableCell-head'])[6]")
	    public WebElement publishtoworldHeader;
	  
	    @FindBy(xpath = "(//span[@class='MuiTypography-root MuiTypography-caption'])[1]")
	    public WebElement nickname;
	    @FindBy(xpath = "(//span[@class='MuiTypography-root MuiTypography-caption'])[2]")
	    public WebElement gym;
	    @FindBy(xpath = "(//span[@class='MuiTypography-root MuiTypography-caption'])[3]")
	    public WebElement Weightclass;
	    @FindBy(xpath = "(//span[@class='MuiTypography-root MuiTypography-caption'])[4]")
	    public WebElement weight;
	    @FindBy(xpath = "(//span[@class='MuiTypography-root MuiTypography-caption'])[5]")
	    public WebElement height;
	    @FindBy(xpath = "(//span[@class='MuiTypography-root MuiTypography-caption'])[6]")
	    public WebElement age;
	    @FindBy(xpath = "(//span[@class='MuiTypography-root MuiTypography-caption'])[7]")
	    public WebElement dob;
	    @FindBy(xpath = "(//span[@class='MuiTypography-root MuiTypography-caption'])[8]")
	    public WebElement country;
	    @FindBy(xpath = "(//span[@class='MuiTypography-root MuiTypography-caption'])[9]")
	    public WebElement recordtype;
	    @FindBy(xpath = "(//span[@class='MuiTypography-root MuiTypography-caption'])[10]")
	    public WebElement record;
	    
	    @FindBy(xpath = "(//span[@class='MuiIconButton-label'])[4]")
	    public WebElement expand; 
	    
	    @FindBy(xpath = "(//h6[@class='MuiTypography-root MuiTypography-h6 MuiTypography-displayBlock'])[1]")
	    public WebElement Noofmaincards;
	    
	    @FindBy(xpath = "//h6[text()='MAIN CARD (1 BOUTS)']")
	    public WebElement Noofmaincards1;
	    
	    
	    @FindBy(xpath = "(//h6[@class='MuiTypography-root MuiTypography-h6 MuiTypography-displayBlock'])[2]")
	    public WebElement Noofleadcards;
	    
	    @FindBy(xpath = "(//h6[@class='MuiTypography-root MuiTypography-h6'])[1]")
	    public WebElement Noofcards;

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
		
		@FindBy(xpath = "(//div[@class='MuiGrid-root MuiGrid-container MuiGrid-wrap-xs-nowrap MuiGrid-align-items-xs-flex-end MuiGrid-justify-xs-flex-end'])[1]")
		public WebElement Red1;
		
		@FindBy(xpath = "(//div[@class='MuiGrid-root MuiGrid-container MuiGrid-wrap-xs-nowrap MuiGrid-align-items-xs-flex-end MuiGrid-justify-xs-flex-end'])[2]")
		public WebElement Red2;
		
		@FindBy(xpath = "(//div[@class='MuiGrid-root MuiGrid-container MuiGrid-wrap-xs-nowrap MuiGrid-align-items-xs-flex-end MuiGrid-justify-xs-flex-end'])[3]")
		public WebElement Red3;
		
		@FindBy(xpath = "(//div[@class='MuiGrid-root MuiGrid-container MuiGrid-wrap-xs-nowrap MuiGrid-align-items-xs-flex-end MuiGrid-justify-xs-flex-end'])[4]")
		public WebElement Red4;
		
		@FindBy(xpath = "(//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row-reverse MuiGrid-wrap-xs-nowrap MuiGrid-align-items-xs-flex-end MuiGrid-justify-xs-flex-end'])[1]")
		public WebElement Blue1;
		
		@FindBy(xpath = "(//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row-reverse MuiGrid-wrap-xs-nowrap MuiGrid-align-items-xs-flex-end MuiGrid-justify-xs-flex-end'])[2]")
		public WebElement Blue2;
		
		@FindBy(xpath = "(//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row-reverse MuiGrid-wrap-xs-nowrap MuiGrid-align-items-xs-flex-end MuiGrid-justify-xs-flex-end'])[3]")
		public WebElement Blue3;
		
		@FindBy(xpath = "(//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-row-reverse MuiGrid-wrap-xs-nowrap MuiGrid-align-items-xs-flex-end MuiGrid-justify-xs-flex-end'])[4]")
		public WebElement Blue4;
		
		@FindBy(xpath = "//div[@class='jss567 jss569']")
		public WebElement publishtoworld;
		
		@FindBy(xpath = "//image[@src='/static/media/event-publish-block-screen-loader.25c7cb04.gif\']")
		public WebElement publishtoteam;
		
		 @FindBy(xpath = "//span[text()='Delete']")
		 public WebElement deleteBtn;
		 
		 @FindBy(xpath = "//p[text()='Permanently delete this event?']")
		 public WebElement deleteText;
		 
		 @FindBy(xpath = "//a[@class='MuiButtonBase-root MuiButton-root MuiButton-contained jss123 MuiButton-disableElevation Mui-disabled Mui-disabled']")
		 public WebElement deleteTexts;
		    
		
		    @FindBy(xpath = "//span[text()='This Action Cannot Be Undone']")
		    public WebElement deletepopup;
		    
		    @FindBy(xpath = " //button[text()='Delete Permanently']")
		    public WebElement deletepermanently;
		    
		    @FindBy(xpath = " //button[text()='Cancel']")
		    public WebElement cancelDeleteEvent;
		    
		    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[2]/div[2]/div[1]/span/span[1]/input")
		    public WebElement select;
		    
		    @FindBy(xpath = "//span[@class='MuiButtonBase-root MuiIconButton-root jss131 MuiCheckbox-root MuiCheckbox-colorSecondary jss132 Mui-checked MuiIconButton-colorSecondary']")
		    public WebElement selected;
		  
		    @FindBy(xpath = "//span[@id='client-snackbar']")
		    public WebElement deletesuccessful;
		    
		    @FindBy(xpath = "(//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-1 MuiGrid-justify-xs-center'])")
		    public WebElement confirmLightweightWorldChampionship;
		    
		    
		    
		
	public String expEventsPageTitle = "Events";
	public String eventName;
	public String publishTeam = "published to the world";
	public String expTotalBout = "Total Bouts: 0";
	public String expMaincardBout = "MAIN CARD (0 BOUTS)";
	public String expLeadcardBout = "LEAD CARD (0 BOUTS)";
	public String expMaincardBout1 = "There are no bouts to display!";
	public String expLeadcardBout1 = "There are no bouts to display!";

	public EventsPage() {
		PageFactory.initElements(driver, this);
	}

	public void venueFilter() throws InterruptedException {
		actions.waitForElementToBeClickable(venue);
		actions.waitForElementToBeClickable(tokyo);
	}

	public void showtypeFilter() throws InterruptedException {
		actions.waitForElementPresent(show_Type);
		actions.waitForElementToBeClickable(show_Type);
		actions.waitForElementToBeClickable(one_Series);
		
	}

	public void enterSearchQuery() {
		searchQuery.sendKeys("Fist");
	}

	public void enterStringInEventSearchField(String search) {
		searchQuery.sendKeys(search);
	}
	public void enterSearchQuery1() {
		searchQuery.sendKeys("Automation9863 27-Aug-21");
	}
	public void searchQuery() {
		searchQuery.sendKeys(eventName);
	}

	public void addEvent() {
		addEventBtn.click();
	}

	public void createnewEvent() {
		Format formatter = new SimpleDateFormat("dd-MMM-yy");
		String s = formatter.format(new Date());
		addEventBtn.click();
		eventName = "Automation" + RandomStringUtils.randomNumeric(4) + " " + s;

		title.sendKeys(eventName);
	}

	public void eventVenue() throws InterruptedException {
		actions.waitForElementToBeClickable(eventVenue);
		actions.waitForElementToBeClickable(axiata);
	}

	public void eventVenueEdit() throws InterruptedException {
		actions.waitForElementToBeClickable(deleteVenue);
		actions.waitForElementToBeClickable(eventVenue);
		actions.waitForElementToBeClickable(baoshan);
	}

	public void showType() throws InterruptedException {
		actions.waitForElementToBeClickable(eventType);
		actions.waitForElementToBeClickable(one_Series);
	}

	public void eventClosure() throws InterruptedException {
		actions.waitForElementToBeClickable(eventClosure);
		actions.waitForElementToBeClickable(one_Series);
	}
	
	public void eventcancel() {
		actions.waitForElementToBeClickable(eventcancel);
	}

	public void eventSave() {
		actions.waitForElementToBeClickable(saveAndProceed);
		
	}

	public void addEventBtnClick() {
		actions.waitForElementToBeClickable(addEventBtn);
	}
	

	public void enterEventTitle() {
		
		eventName = "AutomationEvent" + RandomStringUtils.randomNumeric(2);
		title.sendKeys(eventName);
		
	}

	public void boutcardcancel() throws InterruptedException {
		
		actions.waitForElementToBeClickable(athlete1);
		actions.waitForElementToBeClickable(ajLiasMansor);
		actions.waitForElementToBeClickable(athlete2);
		actions.waitForElementToBeClickable(adiNugroho);
		actions.waitForElementToBeClickable(weightclass);
		actions.waitForElementToBeClickable(flyweight);
		actions.waitForElementToBeClickable(style);
		actions.waitForElementToBeClickable(mixedMartialArts);

	}

	public void boutcard1() throws InterruptedException {
		
		actions.waitForElementToBeClickable(athlete1);
		actions.searchDropdownOptions(athlete1, "aj");
	    actions.waitForElementToBeClickable(ajLiasMansor);
	    actions.waitForElementToBeClickable(athlete2);
	    actions.searchDropdownOptions(athlete2, "abro");
	    actions.waitForElementToBeClickable(abroFernandes);
	    actions.waitForElementToBeClickable(weightclass);
	    actions.waitForElementToBeClickable(featherweight);
		style();
		enable.click();
		
	}

	public void boutcard2() throws InterruptedException {
		
		actions.waitForElementToBeClickable(athlete1);
		actions.searchDropdownOptions(athlete1, "stamp");
	    actions.waitForElementToBeClickable(stampFairtex);
	    actions.waitForElementToBeClickable(athlete2);
	    actions.searchDropdownOptions(athlete2, "Ritu");
	    actions.waitForElementToBeClickable(rituPogat);
	    actions.waitForElementToBeClickable(weightclass);
	    actions.waitForElementToBeClickable(atomweight);
		style();
		enable.click();

	}

	public void boutcard3() throws InterruptedException {
		
		actions.waitForElementToBeClickable(athlete1);
		actions.searchDropdownOptions(athlete1, "Adi");
	    actions.waitForElementToBeClickable(adiNugroho);
	    actions.waitForElementToBeClickable(athlete2);
	    actions.searchDropdownOptions(athlete2, "Adi");
	    actions.waitForElementToBeClickable(adiParyanto);
	    actions.waitForElementToBeClickable(weightclass);
	    actions.waitForElementToBeClickable(strawweight);
	    //actions.waitForElementToBeClickable(flyweight);
		style();
		enable.click();
		
	}

	public void boutcard4() throws InterruptedException {
		
		actions.waitForElementToBeClickable(athlete1);
		actions.searchDropdownOptions(athlete1, "Adib");
	    actions.waitForElementToBeClickable(adibSulaiman);
	    actions.waitForElementToBeClickable(athlete2);
	    actions.searchDropdownOptions(athlete2, "Adri");
	    actions.waitForElementToBeClickable(adrianMattheis);
	    actions.waitForElementToBeClickable(weightclass);
	    actions.waitForElementToBeClickable(strawweight);
		style();
		enable.click();
	}

public void TBA() throws InterruptedException {
		
		actions.waitForElementToBeClickable(athlete1);
		actions.searchDropdownOptions(athlete1, "TBA");
	    actions.waitForElementToBeClickable(TBA);
	    TBA.click();
	    actions.waitForElementToBeClickable(athlete2);
	    actions.searchDropdownOptions(athlete2, "Adri");
	    actions.waitForElementToBeClickable(adrianMattheis);
	    actions.waitForElementToBeClickable(weightclass);
	    actions.waitForElementToBeClickable(strawweight);
		style();
		enable.click();
		saveBout();
	}

	public void boutcard() throws InterruptedException {
		actions.waitForElementToBeClickable(boutcardTab);

	}

	public void logs() throws InterruptedException {
	
		actions.waitForElementToBeClickable(logsTab);

	}

	public void addLeadCardBout() {
		actions.waitForElementToBeClickable(leadcardEditBtn);
		actions.waitForElementToBeClickable(addBout);
	
	}

	public void addMainCardBout() {
		actions.waitForElementToBeClickable(maincardEditBtn);
		actions.waitForElementToBeClickable(addBout);
	

	}

	public void addBout() {
		
		addBout.click();

	}

	public void athlete1() throws InterruptedException {
		actions.waitForElementToBeClickable(athlete1);
		actions.searchDropdownOptions(athlete1, "Neha");
	    actions.waitForElementToBeClickable(NehaKashyap);
	}

	public void athlete2() throws InterruptedException {
		actions.waitForElementToBeClickable(athlete1);
		actions.searchDropdownOptions(athlete1,"Stamp");
	    actions.waitForElementToBeClickable(stampFairtex);

	}

	public void athlete3() throws InterruptedException {
		actions.waitForElementToBeClickable(athlete2);
		actions.searchDropdownOptions(athlete2, "Asha");
	    actions.waitForElementToBeClickable(AshaR);

	}
	
	public void featherweightClass() throws InterruptedException {
		actions.waitForElementToBeClickable(weightclass);
		actions.searchDropdownOptions(weightclass, "atom");
	    actions.waitForElementToBeClickable(atomweight);
		
	}

	public void atomweightClass() throws InterruptedException {
		actions.waitForElementToBeClickable(weightclass);
		actions.searchDropdownOptions(weightclass, "atom");
	    actions.waitForElementToBeClickable(atomweight);
		
	}

	public void style() throws InterruptedException {
		
		actions.waitForElementToBeClickable(style);
		actions.searchDropdownOptions(style, "mixed");
	    actions.waitForElementToBeClickable(mixedMartialArts);
		
	}
	public void catchweightWeightclass() throws InterruptedException {
		weightclass.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element13 = wait.until(ExpectedConditions.elementToBeClickable(catchweight));
		element13.click();
	}

	public void catchWeightvalue() {

		catchweightvalue.sendKeys("77");
	}

	public void nonchampionshiptoChampionship() throws InterruptedException {
		actions.waitForElementToBeClickable(maincardEditBtn);
		actions.waitForElementToBeClickable(editBout);
		actions.waitForElementToBeClickable(selectchampionshipType);	
		actions.waitForElementToBeClickable(semiFinalFeatherweightWorldGrandPrix);

	}

	public void championshiptoNonchampionship() throws InterruptedException {
		actions.waitForElementToBeClickable(maincardEditBtn);
		actions.waitForElementToBeClickable(editBout);
		actions.waitForElementToBeClickable(removeChampionship);

	}

	public void boutAdditionCancel() throws InterruptedException {
		
		cancel.click();
		
	}

	public void saveBout() {

		SaveAndProceed.click();

	}

	public void boutDelete() throws InterruptedException {
		actions.waitForElementToBeClickable(maincardEditBtn);
		actions.waitForElementToBeClickable(delete);
		actions.waitForElementToBeClickable(understand);
		actions.waitForElementToBeClickable(confirm);
		
	}

	public void maincardBoutEdit() {
		actions.waitForElementToBeClickable(maincardEditBtn);
		actions.waitForElementToBeClickable(editBout);
		
	}

	public void detailpage() {
		actions.waitForElementToBeClickable(generalTab);
	}

	public void editEvent() throws InterruptedException {
		actions.waitForElementToBeClickable(editEvent);

	}

	public void selecetEventEnclosurecage() throws InterruptedException {
		actions.waitForElementToBeClickable(selectEventEnclosure);
		actions.waitForElementToBeClickable(cage);

	}

	public void selecetEventEnclosureRing() throws InterruptedException {
		actions.waitForElementToBeClickable(cage);
		actions.waitForElementToBeClickable(Ring);

	}
	
	public void saveEventdetails() throws InterruptedException {
		actions.waitForElementToBeClickable(saveEventEdit);
		
	}

	public void editDescriptionClick() throws InterruptedException {
		description.click();
		
	}

	public void enterDescription() throws InterruptedException {

		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Rich Text Area. Press ALT-0 for help.']")));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		updatedescription.sendKeys(
				"It’s ONE Championship’s biggest month in history, with four weeks of blockbuster events kicking off on 7 April with ONE on TNT .A massive flyweight battle takes place in the main event. After winning the grueling ONE Flyweight World Grand Prix, 12-time UFC World Champion Demetrious Johnson can cement his legacy as the greatest mixed martial artist of all time if he dethrones six-time ONE Flyweight World Champion Adriano Moraes, who promises to be the first man to finish “Mighty Mouse.Plus, four-time UFC and Bellator World Champion Eddie Alvarez battles to prove he belongs in the promotion after a rough start to his ONE Championship career, but standing in his way is dangerous #2 lightweight contender Iuri Lapicus.The rest of the stacked card features superstars such as ONE Flyweight Muay Thai World Champion Rodtang Jitmuangnon and heavyweight sensation Oumar Kane, so mark your calendars, check your local listings, and download the ONE Super App now!");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();

	}

	public void saveDescription() {
		actions.waitForElementToBeClickable(savedes);
	}

	public void creative() throws InterruptedException {
		actions.waitForElementToBeClickable(creativestab);

	}

	public void dropImage() {
		actions.waitForElementToBeClickable(dropImage);
	}

	public void bannerListingImage() {
		actions.waitForElementToBeClickable(bannerListing);
	}

	public void bannerUpcomingImage() {
		actions.waitForElementToBeClickable(bannerUpcoming);

	}

	public void featuredImage() {
		actions.waitForElementToBeClickable(featuredImage);


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

	public void clearFilter() throws InterruptedException {
		clearFilter.click();

	}

	public void appsetting() throws InterruptedException {
        actions.waitForElementToBeClickable(appSettingTab);
		
	}

	public void editAppsettings() {
		actions.waitForElementToBeClickable(editappsettingEvent);
		editappsettingEvent.click();
	}

	public void appsettingsave() {
		actions.waitForElementToBeClickable(appsettingsave);
		appsettingsave.click();
	}

	public void hideEvent() {
		hideEvent.click();
	}

	public void displayBout() {
		actions.waitForElementToBeClickable(displayBout);
	}
	
	public void upcomingEvents() {
		actions.waitForElementToBeClickable(upcoming);
	}

	public void pastEvents() {
		actions.waitForElementToBeClickable(past);
	}

	public void draftEvents() {
		actions.waitForElementToBeClickable(draft);
	}

	public void allEvents() {
		actions.waitForElementToBeClickable(all);
	
	}

	public void nextpage() {
		actions.waitForElementToBeClickable(nextpage);
	
	}

	public void previouspage() {
		actions.waitForElementToBeClickable(previouspage);
	}


	public void publishToTeam() {
		actions.waitForElementPresent(publishToTeam);
		actions.waitForElementToBeClickable(publishToTeam);
		actions.waitForElementPresent(confirmBtn);
		confirmBtn.click();

	}
	
	public void publishToWorld() {
		actions.waitForElementPresent(publishToWorld);
		actions.waitForElementToBeClickable(publishToWorld);
		actions.waitForElementPresent(confirmBtn);
		confirmBtn.click();

	}
	
	public void yearFilter() throws InterruptedException {
		
		actions.waitForElementToBeClickable(year);
		actions.waitForElementToBeClickable(year2019);
	}

	public void BR() {
		actions.waitForElementToBeClickable(tags);
		actions.waitForElementToBeClickable(BR);
		
	}

	public void Regular() {
		actions.waitForElementToBeClickable(tags);
		actions.waitForElementToBeClickable(Regular); 
	}
	public void TNT() {
		actions.waitForElementToBeClickable(tags);
		actions.waitForElementToBeClickable(TNT);
		  
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

	public String verifyConfirmationPopupForSave() {
		actions.waitForElementPresent(confirmationPopupTextForEventDeletion);
		String updatedText = confirmationPopupTextForEventDeletion.getText();
		return updatedText;
	}


}
