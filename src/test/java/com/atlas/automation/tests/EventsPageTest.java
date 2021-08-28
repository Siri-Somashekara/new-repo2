package com.atlas.automation.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import com.atlas.automation.actions.WebdriverActions;
import com.atlas.automation.base.BaseClass;
import com.atlas.automation.pages.EventsPage;
import com.atlas.automation.pages.HomePage;
import com.atlas.automation.pages.LoginPage;

    public class EventsPageTest extends BaseClass {
    	LoginPage loginpage;
        HomePage homepage;
        EventsPage eventpage;
        WebdriverActions actions;
    	
    
        public EventsPageTest() {
        super();
    }
        
    @BeforeClass
    public void setup() throws InterruptedException, IOException {
    	
        initialization();
        loginpage = new LoginPage();
        eventpage = new EventsPage();
        actions=new WebdriverActions();
        homepage = loginpage.loginToApp(prop.getProperty("emailID"), prop.getProperty("password"));
        
    }
    
    @Test(priority=1)
	public void verifyEventFilterOptionsTest() throws InterruptedException {
    	
    	homepage.eventsBtnClick();
        actions.waitForElementPresent(eventpage.show_Type);
 	    Assert.assertTrue(eventpage.show_Type.isDisplayed());
 	    Assert.assertTrue(eventpage.venue.isDisplayed());
 	    Assert.assertTrue(eventpage.confirmClearFilter.isDisplayed());

	}
    
    @Test(priority=2)
    public void filterByShowType() throws InterruptedException {
    	eventpage.pastEvents();
 	    Thread.sleep(3000);
    	eventpage.showtypeFilter();
 	    for (int i = 0; i < eventpage.filterShowType.size(); i++) {
 	    	
 	    	String EventName = eventpage.filterShowType.get(i).getText();
 	        Assert.assertTrue(EventName.contains("ONE Series")); 
 	    	
 		}
 	     Assert.assertTrue(eventpage.clearFilter.isDisplayed());
		 eventpage.clearFilter();
 			 
   }
 
    @Test(priority=3)
	public void filterByEventVenue() throws InterruptedException {
    	 eventpage.venueFilter();
    		
		 for (int i = 0; i < eventpage.filterVenue.size(); i++) {
			 String EventName = eventpage.filterVenue.get(i).getText();
		     Assert.assertTrue(EventName.contains("Bellesalle Shibuya Garden, Tokyo"));
    
         }
	     Assert.assertTrue(eventpage.clearFilter.isDisplayed());
	     eventpage.clearFilter();
		
    }
   
    @Test(priority=4)
	public void filterByEventByShowtypeandvenue() throws InterruptedException {
    	
	   
   	    Thread.sleep(3000);
        eventpage.showtypeFilter();
        Thread.sleep(3000);
        eventpage.venueFilter();
		 
			 for (int i=0,j = 0; i< eventpage.filterShowType.size()&& j<eventpage.filterVenue.size(); i++,j++) {
				 String EventName = eventpage.filterShowType.get(i).getText();
			     String Eventvenue = eventpage.filterVenue.get(i).getText(); 
			     Assert.assertTrue(EventName.contains("ONE Series"));
			     Assert.assertTrue(Eventvenue.contains("Bellesalle Shibuya Garden, Tokyo"));
			 
		 }   
		Assert.assertTrue(eventpage.clearFilter.isDisplayed());
		Thread.sleep(3000);
		eventpage.clearFilter();
		 
		}
    
   
    @Test(priority=5)
	public void eventSearchByNameTest() throws InterruptedException {
    	
    	eventpage.pastEvents();
       	actions.waitForElementToLoad();
        eventpage.enterSearchQuery();
        actions.waitForElementToLoad();
    			for (int i = 0; i < eventpage.searchResultsByName.size(); i++) {
    				String athleteName = eventpage.searchResultsByName.get(i).getText();
    				Assert.assertTrue(athleteName.contains("Automation"));	
    			}	
        Assert.assertTrue(eventpage.clearFilter.isDisplayed());
		 
   }
   
    @Test(priority=6)
   public void clearFilter() throws InterruptedException{
    
	    eventpage.clearFilter();
	    Assert.assertTrue(eventpage.confirmClearFilter.isDisplayed());
	   
  }
 

  
  
    @Test(priority=7)
    public void pastEventNavigation() throws InterruptedException {
    	
    	actions.waitForElementToBeClickable(eventpage.nextpage);
 	    eventpage.nextpage();
 	    actions.waitForElementPresent(eventpage.pastnextEntries);
 	    Assert.assertTrue(eventpage.pastnextEntries.isDisplayed());
 	    eventpage.previouspage();
	  
 }
    
  @Test (priority=8)  
   public void allEventNavigation() throws InterruptedException {
	  
	  eventpage.allEvents();
	  actions.waitForElementToLoad();
	  eventpage.nextpage();
	  actions.waitForElementToLoad();
	  Assert.assertTrue(eventpage.nextEntries.isDisplayed());
      eventpage.previouspage();
	  Assert.assertTrue(eventpage.prevEntries.isDisplayed());
	
 }
   
    @Test(priority=9)  

   public void sortbyascendingorder() throws InterruptedException{
    	
	    eventpage.upcomingEvents();
	    actions.waitForElementPresent(eventpage.sortAscending);   
        eventpage.sortAscending.click();
        Thread.sleep(3000);
        ArrayList<String> obtainedList = new ArrayList<>(); 
        for(WebElement we:eventpage.eventsort){
        	obtainedList.add(we.getText());
        }
        ArrayList<String> sortedList = new ArrayList<>();   
        for(String s:obtainedList){   
        sortedList.add(s);
        }
        Collections.sort(sortedList);
        Assert.assertTrue(sortedList.equals(obtainedList));
  
   }
   
    @Test(priority=10)  

   public void sortbyDescendingOrder() throws InterruptedException{
    	
    	eventpage.sortDescending.click();
    	Thread.sleep(3000);
    	ArrayList<String> obtainedList = new ArrayList<>(); 
    	for(WebElement we:eventpage.eventsort){
    	     obtainedList.add(we.getText());
    	  }
    	ArrayList<String> sortedList = new ArrayList<>();   
    	for(String s:obtainedList){
    	    sortedList.add(s);
    	  }
    	Collections.sort(sortedList);
    	Collections.reverse(sortedList);
    	Assert.assertTrue(sortedList.equals(obtainedList));
    	
   }
    @Test(priority=11)  
    public void navigation() throws InterruptedException{
    	
 	    eventpage.pastEvents();
 	    actions.waitForElementToBeClickable(eventpage.selectentries);
    	eventpage.select10entries.click();
    	Thread.sleep(3000);
    	actions.waitForElementPresent(eventpage.confirmEntries10);
    	Assert.assertTrue(eventpage.confirmEntries10.isDisplayed());
    	Assert.assertEquals(eventpage.rowCount.size(),10);

    }
 
  
    @Test(priority=12)
    public void duplicateEventCreationTest() throws InterruptedException {
    	
   	    eventpage.addEventBtn.click();
   	    eventpage.title.sendKeys("Grit and Glory III");
        eventpage.showType();
        eventpage.eventSave();
        actions.waitForElementPresent(eventpage.duplicateEventError);
        Assert.assertTrue(eventpage.duplicateEventError.isDisplayed());
        eventpage.eventcancel();
    
   }
    
    @Test(priority=13)
	public void searchvenueFilter() throws InterruptedException {
    	
    	actions.waitForElementToBeClickable(eventpage.venue);
		eventpage.venue.click();
		Actions performAct = new Actions(driver); 
		performAct.sendKeys(eventpage.venue,"ba").build().perform(); 
		Assert.assertTrue(eventpage.baoshanArenaShanghai.isDisplayed());
		Assert.assertTrue(eventpage.impactArenaBangkok.isDisplayed());
		Assert.assertTrue(eventpage.kokugikan.isDisplayed());
		Assert.assertTrue(eventpage.worldTradeCentreDubai.isDisplayed());

    }
    
    @Test(priority=14)
    public void searchTypeFilter() throws InterruptedException {
    	Thread.sleep(3000);
	    eventpage.show_Type.click();
	    Actions performAct = new Actions(driver); 
	    performAct.sendKeys(eventpage.show_Type,"one").build().perform(); 
	    Assert.assertTrue(eventpage.oneSeries.isDisplayed());
	    Assert.assertTrue(eventpage.oneHeroSeries.isDisplayed());
	    Assert.assertTrue(eventpage.oneInfinitySeries.isDisplayed());
	    Assert.assertTrue(eventpage.oneWarriorSeries.isDisplayed());   

    }
    
    @Test(priority=15)
	public void addEventPopupTest() throws InterruptedException {
    	 eventpage.addEvent();
         actions.waitForElementPresent(eventpage.title);
		 Assert.assertTrue(eventpage.title.isDisplayed());
		 Assert.assertTrue(eventpage.eventType.isDisplayed());
		 Assert.assertTrue(eventpage.selectEventEnclosure.isDisplayed());
		 Assert.assertTrue(eventpage.eventVenue.isDisplayed());
		 Assert.assertTrue(eventpage.eventNumber.isDisplayed());
		 Assert.assertTrue(eventpage.saveAndProceed.isDisplayed());
		 Assert.assertTrue(eventpage.eventcancel.isDisplayed());
		 eventpage.eventcancel();
		 
    }

    @Test(priority=16)
    public void createEventwithoutShowTitle() throws InterruptedException {
    	
    	eventpage.addEvent();
        eventpage.eventVenue();
        eventpage.showType();
        eventpage.eventSave();
        Assert.assertTrue(eventpage.title_is_a_requiredfield.isDisplayed());
        eventpage.eventcancel();
    }
 
   
    @Test(priority=17)
    public void createEventwithoutShowTypeField() throws InterruptedException {
    
    	eventpage.createnewEvent();
        eventpage.eventVenue();
        eventpage.eventSave();
        Assert.assertTrue(eventpage.pleaseselectashowtype.isDisplayed());
        eventpage.eventcancel();
        
    }
   
    @Test(priority=18)
    public void cancelEvent() throws InterruptedException {
	 
        eventpage.createnewEvent();
        eventpage.eventVenue();
        eventpage.showType();
        eventpage.eventcancel();
        eventpage.searchQuery();
        Assert.assertTrue(eventpage.noEventFound.isDisplayed());
        
    }
  
    @Test(priority=19)
    public void createNewEventTest() throws InterruptedException {
    	
   	    eventpage.createnewEvent();
        eventpage.showType();
        eventpage.eventSave();
        actions.waitForElementPresent(eventpage.confirmEventType);
        Assert.assertTrue(eventpage.confirmEventType.isDisplayed());
        eventpage.publishToTeam();
         
    }

    @Test(priority=20)
    public void detailTabTest() throws InterruptedException {
    	
    	 Thread.sleep(3000);
    	 Assert.assertTrue(eventpage.generalTab.isDisplayed());
 	   	 Assert.assertTrue(eventpage.boutcardTab.isDisplayed());
 	   	 Assert.assertTrue(eventpage.creativestab.isDisplayed());
 	   	 Assert.assertTrue(eventpage.appSettingTab.isDisplayed());
 	   	 Assert.assertTrue(eventpage.logsTab.isDisplayed());
 	   	 Assert.assertTrue(eventpage.eventDescription.isDisplayed());
 	   	 Assert.assertTrue(eventpage.basicDetails.isDisplayed());
 	   	 Assert.assertTrue(eventpage.publishToTeam.isDisplayed());
 	   	 Assert.assertTrue(eventpage.nothingtoshow.isDisplayed());  
    	   
   }
    
    @Test(priority=21)
    public void boutpageTabTest() throws InterruptedException {
    	
    	Thread.sleep(5000);	 
        eventpage.boutcard();
        actions.waitForElementPresent(eventpage.download);
       	Assert.assertTrue(eventpage.download.isDisplayed());
       	Assert.assertEquals(eventpage.totalBout.getText(),eventpage.expTotalBout);
       	Assert.assertEquals(eventpage.mainCardBout.getText(),eventpage.expMaincardBout);
       	Assert.assertEquals(eventpage.leadCardBout.getText(),eventpage.expLeadcardBout);
    	Assert.assertEquals(eventpage.mainCardBoutmsg.getText(),eventpage.expMaincardBout1);   
    	Assert.assertEquals(eventpage.leadCardBoutmsg.getText(),eventpage.expLeadcardBout1);
    	Assert.assertTrue(eventpage.maincardEditBtn.isDisplayed());   
    	Assert.assertTrue(eventpage.leadcardEditBtn.isDisplayed()); 
     
   }
  
    @Test (priority=22)
    public void addBoutPopupTest() throws InterruptedException {
    	
	    eventpage.addLeadCardBout();
		Assert.assertTrue(eventpage.athlete1.isDisplayed());
		Assert.assertTrue(eventpage.athlete2.isDisplayed());
		Assert.assertTrue(eventpage.weightclass.isDisplayed());
		Assert.assertTrue(eventpage.style.isDisplayed());
		Assert.assertTrue(eventpage.selectchampionshipType.isDisplayed());
		Assert.assertTrue(eventpage.SaveAndProceed.isDisplayed());
		Assert.assertTrue(eventpage.cancel.isDisplayed());
		eventpage.boutAdditionCancel();
		
    }


    @Test(priority=23)
    public void boutCardAdditionWithoutAthleteName() throws InterruptedException {
    	
    	eventpage.addBout();
        eventpage.athlete1();
        eventpage.style();
        eventpage.atomweightClass();
        eventpage.saveBout();
        Assert.assertTrue(eventpage.please_select_an_athlete.isDisplayed());
        eventpage.boutAdditionCancel();
    	
      }
  
    @Test(priority=24)
    public void boutCardAdditionWithoutWeightclass() throws InterruptedException {
    	
    	eventpage.addBout();
        eventpage.athlete2();
        eventpage.athlete3();
        eventpage.style();
        eventpage.saveBout();
        Assert.assertTrue(eventpage.please_select_a_weightclass.isDisplayed());
        eventpage.boutAdditionCancel();
  
    }  
     
    @Test(priority=25)
    public void boutCardAdditionWithoutstyle() throws InterruptedException {
    	
    	eventpage.addBout();
  	    eventpage.athlete2();
  	    eventpage.athlete3();
  	    eventpage.catchweightWeightclass();
  	    eventpage.saveBout();
  	    Assert.assertTrue(eventpage.please_select_a_style.isDisplayed());
        eventpage.boutAdditionCancel();
   
    }
   
    @Test(priority=26)
    public void boutCardAdditionWithoutCatchweight() throws InterruptedException {
    	
    	eventpage.addBout();
        eventpage.athlete2();
        eventpage.athlete3();
        eventpage.style();
        eventpage.catchweightWeightclass();
        eventpage.saveBout();
        Assert.assertTrue(eventpage.weight_is_a_required_field_if_weightclass_is_catchweight.isDisplayed());
        eventpage.boutAdditionCancel();
        eventpage.mainCardAdditionCancel.click();
         
    }
    
    @Test(priority=27)
    public void searchAthlete() throws InterruptedException {
    	
    	eventpage.addMainCardBout();
        eventpage.athlete1.click();
        Actions performAct = new Actions(driver); 
        performAct.sendKeys(eventpage.athlete1,"fair").build().perform(); 
        Assert.assertTrue(eventpage.fabriceFairtexDelannon.isDisplayed());
        Assert.assertTrue(eventpage.markFairtexAbelardo.isDisplayed());
        Assert.assertTrue(eventpage.stampFairtex.isDisplayed());
        Assert.assertTrue(eventpage.yodsanklaiIWEFairtex.isDisplayed());
        Assert.assertTrue(eventpage.yohannFairtexDrai.isDisplayed());
        Assert.assertTrue(eventpage.saemapetchFairtex.isDisplayed());
        eventpage.boutAdditionCancel();
        
    }
    
    @Test(priority=28)
    public void searchChampionship() throws InterruptedException {
    	
    	eventpage.addBout();
        eventpage.selectchampionshipType.click();
        Actions performAct = new Actions(driver); 
        performAct.sendKeys(eventpage.selectchampionshipType,"Heavy").build().perform(); 
        Assert.assertTrue(eventpage.heavyweightWorldChampionship.isDisplayed());
        Assert.assertTrue(eventpage.lightHeavyweightWorldChampionship.isDisplayed());
        eventpage.boutAdditionCancel();
        
    }
   
    @Test(priority=29)
    public void searchstyle() throws InterruptedException {
    	
    	eventpage.addBout();
    	eventpage.style.click();
        Actions performAct = new Actions(driver); 
        performAct.sendKeys(eventpage.style,"box").build().perform(); 
        Assert.assertTrue(eventpage.kickboxing.isDisplayed());
        Assert.assertTrue(eventpage.boxing.isDisplayed());
        Assert.assertTrue(eventpage.dutchKickboxing.isDisplayed());
        eventpage.boutAdditionCancel();
        
    }

    @Test(priority=30)
    public void boutAdditionCancel() throws InterruptedException {
    	
    	 eventpage.addBout();
    	 eventpage.boutcardcancel();
    	 eventpage.boutAdditionCancel();
    	 eventpage.mainCardAdditionCancel.click();
    	 Assert.assertTrue(eventpage.confirmCancelBout.isDisplayed());
 	  
    }
    
    @Test(priority=31)
    public void addBoutcards() throws InterruptedException {
    	
        eventpage.addMainCardBout();
		eventpage.boutcard1();
		eventpage.addMainCardBout();
		eventpage.boutcard2();
		eventpage.addLeadCardBout();
		eventpage.boutcard3();
		eventpage.addLeadCardBout();
		eventpage.boutcard4();
		Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
    }

    @Test(priority=32)   
    public void markAllasConfirmed() throws InterruptedException {
    	
    	Thread.sleep(3000);
        actions.waitForElementToBeClickable(eventpage.confirmationMarkAllasconfirmed);
    	Assert.assertTrue(eventpage.confirmMarkAllasconfirmed.isDisplayed());
        Thread.sleep(3000);
        //Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
        
    } 
     
    @Test(priority=33)
    public void nonChampionshipBoutToChampionshipBout() throws InterruptedException {
    	
    	eventpage.nonchampionshiptoChampionship();
    	Assert.assertTrue(eventpage.confirmLightweightWorldChampionship.isDisplayed());
    	eventpage.saveBout();
    	Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
    	
    }
    
    @Test(priority=34)
    public void championshipBoutToNonChampionshipBout() throws InterruptedException {
    	
	    Thread.sleep(3000);
        eventpage.championshiptoNonchampionship();
    	Assert.assertTrue(eventpage.selectchampionshipType.isDisplayed());
    	eventpage.saveBout();
    	Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
    	
    }
   
    @Test(priority=35)
    public void deleteBoutcard() throws InterruptedException {
    	
	    Thread.sleep(3000);
        eventpage.boutDelete();
        Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
        Assert.assertTrue(eventpage.confirmBoutDelete.isDisplayed());
        Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
        
   }
 
    @Test(priority=36)
    public void athletebothReplace() throws InterruptedException {
    	
	    Thread.sleep(3000);
 	    eventpage.maincardBoutEdit();
        eventpage.athlete2();
        eventpage.athlete3();
        eventpage.saveBout();
        Thread.sleep(5000);
        Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
        actions.waitForElementPresent(eventpage.confirmreplacedAthleteRedCorner);
        Assert.assertTrue(eventpage.confirmreplacedAthleteRedCorner.isDisplayed());
   	    Assert.assertTrue(eventpage.confirmreplacedAthleteBlueCorner.isDisplayed());
        
        
    }
    
    @Test(priority=37)
    public void confirmToUnconfirm() throws InterruptedException {
    	
    	eventpage.maincardBoutEdit();
        eventpage.enable.click();
        eventpage.saveBout();
        Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
        actions.waitForElementPresent(eventpage.unconfirmedtext);
        Assert.assertTrue(eventpage.unconfirmedtext.isDisplayed());
        Assert.assertTrue(eventpage.totalUnconfimedBouts.isDisplayed());
        
    }
    
    @Test(priority=38)
    public void unconfirmToconfirm() throws InterruptedException {
    	
    	Thread.sleep(3000);
    	eventpage.maincardBoutEdit();
        eventpage.enable.click();
        eventpage.saveBout();
        Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
        actions.waitForElementPresent(eventpage.totalconfimedBouts);
        Assert.assertTrue(eventpage.totalconfimedBouts.isDisplayed());
        
    }
  

    @Test(priority=39)
    public void superseries() throws InterruptedException{
	    Thread.sleep(3000);
        eventpage.maincardBoutEdit();
        eventpage.superseries.click();
        eventpage.style();
        eventpage.saveBout();
        Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
        Assert.assertTrue(eventpage.confirmSuperseries.isDisplayed());
        
    }
  
    @Test(priority=40)
    public void boutCardAdditionWithCatchweightvalue() throws InterruptedException {
    	
    	 eventpage.addMainCardBout();
         eventpage.athlete1();
         eventpage.athlete3();
         eventpage.style();
         eventpage.catchweightWeightclass();
         eventpage.catchWeightvalue();
         Thread.sleep(3000);
         eventpage.saveBout();
         Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
   	     Assert.assertTrue(eventpage.confirmCatchweightvalue.isDisplayed());
	  
  }
  
    @Test(priority=41)
    public void athleteClick() throws InterruptedException{
    	
    	eventpage.athlete.click();
      	Assert.assertTrue(eventpage.athletename.isDisplayed());
      	driver.navigate().back();
  	
  }
 
 
    @Test(priority=42)
    public void creativeTabTest() throws InterruptedException {
    	
    	actions.waitForElementToLoad();
   	    actions.verticalScrollToTop();
   	    eventpage.creative();
        actions.waitForElementToBeClickable(eventpage.creativestab);
        eventpage.creative();
        actions.waitForElementToLoad();
      	Assert.assertTrue(eventpage.bannerListingText.isDisplayed());
   	    Assert.assertTrue(eventpage.featuredImageText.isDisplayed());
   	    Assert.assertTrue(eventpage.bannerUpcomingText.isDisplayed());
   	    Assert.assertTrue(eventpage.bannerListing.isDisplayed());
   	    Assert.assertTrue(eventpage.bannerUpcoming.isDisplayed());
   	    Assert.assertTrue(eventpage.featuredImage.isDisplayed());
   	    Assert.assertTrue(eventpage.bannerListingCreative.isDisplayed());
   	    Assert.assertTrue(eventpage.bannerUpcomingCreative.isDisplayed());
   	    Assert.assertTrue(eventpage.featuredImageCreative.isDisplayed());
   	    
   }
 
    @Test(priority=43)
    public void creativeWithwrongDimension() throws InterruptedException, AWTException {
    	
    	actions.waitForElementToBeClickable(eventpage.bannerListing);
        eventpage.dropImage();
        eventpage.upload(System.getProperty("user.dir") + "/creatives/event creatives/1800x1200_2.jpg");
        Assert.assertTrue(eventpage.confirmBannerListingDimension.isDisplayed());
        Assert.assertTrue(eventpage.confirmBannerListingDimensionCancel.isDisplayed());
        eventpage.confirmBannerListingDimensionCancel.click();
        actions.waitForElementToBeClickable(eventpage.bannerUpcoming);
        eventpage.dropImage();
        eventpage.upload(System.getProperty("user.dir") + "/creatives/event creatives/1800x1200_2.jpg");
        Assert.assertTrue(eventpage.confirmBannerUpcomingDimension.isDisplayed());
        eventpage.confirmBannerListingDimensionCancel.click();
        actions.waitForElementToBeClickable(eventpage.featuredImage);
        eventpage.dropImage();
        eventpage.upload(System.getProperty("user.dir") + "/creatives/event creatives/1920x1080.jpg");
        Assert.assertTrue(eventpage.confirmFeaturedImageDimension.isDisplayed());
        eventpage.confirmBannerListingDimensionCancel.click();
      
}
  
    @Test(priority=44)
    public void creativeUpload() throws InterruptedException, AWTException {
    	
    	actions.waitForElementToLoad();
        actions.waitForElementToBeClickable(eventpage.bannerListing);
        eventpage.dropImage();
        eventpage.upload(System.getProperty("user.dir") + "/creatives/event creatives/1360x640.png");
        actions.waitForElementToBeClickable(eventpage.saveImage);
        Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
        Assert.assertTrue(eventpage.deleteBannerListing.isDisplayed());
        actions.waitForElementToBeClickable(eventpage.bannerUpcoming);
        eventpage.dropImage();
        eventpage.upload(System.getProperty("user.dir") + "/creatives/event creatives/1920x1080.jpg"); 
        actions.waitForElementToBeClickable(eventpage.saveImage);
        Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
        Assert.assertTrue(eventpage.deleteBannerUpcoming.isDisplayed());
        actions.waitForElementToBeClickable(eventpage.featuredImage);
        eventpage.dropImage();
        eventpage.upload(System.getProperty("user.dir") + "/creatives/event creatives/1800x1200_2.jpg");
        actions.waitForElementToBeClickable(eventpage.saveImage);
        Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
        Assert.assertTrue(eventpage.deleteFeaturedImage.isDisplayed());
      
  }
  
    @Test(priority=45)
    public void deletecreative() throws InterruptedException {
    	
    	 eventpage.deleteBannerListing.click();
     	 Thread.sleep(3000);
     	 Assert.assertTrue(eventpage.bannerListingCreative.isDisplayed());
     	 Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
     	 eventpage.deleteBannerUpcoming.click();
     	 Thread.sleep(3000);
     	 Assert.assertTrue(eventpage.bannerUpcomingCreative.isDisplayed());
     	 Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
     	 actions.scrollToDown();
     	 eventpage.deleteFeaturedImage.click();
     	 Thread.sleep(3000);
     	 Assert.assertTrue(eventpage.featuredImageCreative.isDisplayed());
     	 Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
    
  }
 
    @Test(priority=46)
    public void creativecheckwithvenueaddition() throws InterruptedException, AWTException {
    	
    	actions.verticalScrollToTop();
        eventpage.detailpage(); 
    	eventpage.editEvent();
    	eventpage.eventVenue();
    	eventpage.saveEventdetails();
    	Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
    	actions.waitForElementToLoad();
    	driver.navigate().refresh();
    	actions.waitForElementToBeClickable(eventpage.creativestab);    
    	eventpage.creative();
    	Thread.sleep(5000);
    	Assert.assertTrue(eventpage.venuecreativebanner.isDisplayed());
        Assert.assertTrue(eventpage.venuecreativelisting.isDisplayed());
        
    }

    @Test(priority=47)
    public void CreativecheckwithvenueEdit() throws InterruptedException, AWTException {
    
    	eventpage.detailpage(); 
        actions.waitForElementToLoad();
    	eventpage.editEvent();
    	eventpage.eventVenueEdit();
    	eventpage.saveEventdetails();
    	Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
    	actions.waitForElementToLoad();
    	driver.navigate().refresh();
    	actions.waitForElementToBeClickable(eventpage.creativestab);    
    	eventpage.creative();
    	Thread.sleep(5000);
    	Assert.assertTrue(eventpage.venuecreativebannerwithvenue.isDisplayed());
        Assert.assertTrue(eventpage.venuecreativelistingwithvenue.isDisplayed());
        
    }
	
    @Test(priority=48)
    public void eventDetailsEdit() throws InterruptedException {
    	
    	eventpage.detailpage(); 
    	eventpage.editEvent();
    	eventpage.selecetEventEnclosure();
    	eventpage.deleteVenue.click();
    	eventpage.eventVenue();
    	eventpage.saveEventdetails();
    	Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
    	actions.waitForElementPresent(eventpage.enclosureConfirmation);
        Assert.assertTrue(eventpage.enclosureConfirmation.isDisplayed());
        
     }
   
    @Test(priority=49)
    public void description() throws InterruptedException {
    	 
    	eventpage.editDescriptionClick();
    	eventpage.enterDescription();
    	eventpage.saveDescription();
    	Thread.sleep(3000);
    	Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
      	Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
      	actions.waitForElementPresent(eventpage.descriptionConfirmation);
        Assert.assertTrue(eventpage.descriptionConfirmation.isDisplayed());
      	    
     }
    
    @Test(priority=50)
    public void appsettingTabTest() throws InterruptedException {
    	Thread.sleep(3000);
        eventpage.appsetting(); 
        actions.waitForElementToLoad();
       	Assert.assertTrue(eventpage.editappsettingEvent.isDisplayed());
    	Assert.assertTrue(eventpage.displaytheeventText.isDisplayed());
    	Assert.assertTrue(eventpage.hideboutcardsText.isDisplayed());
    	Assert.assertTrue(eventpage.publishToWorld.isDisplayed());
    	Assert.assertTrue(eventpage.lastpublishedtoworldText.isDisplayed());
       	
   }
    
    @Test(priority=51)
    public void appsettingDisplayBout() throws InterruptedException {
    	
    	actions.verticalScrollToTop();
  	    eventpage.appsetting();
  	    actions.waitForElementToLoad();
  	    eventpage.editAppsettings();
  	    eventpage.displayBout();
  	    eventpage.appsettingsave();
  	    Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
  	    Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
    
        }
    
    @Test(priority=52)
    public void appsettingHideEvent() throws InterruptedException {
    	
    	eventpage.editAppsettings();
 	    eventpage.hideEvent();
 	    eventpage.appsettingsave();
 	    Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed()); 
 	    Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
    	
   }
    
    @AfterClass
	public void tearDown() {
		driver.quit();
	}

}
