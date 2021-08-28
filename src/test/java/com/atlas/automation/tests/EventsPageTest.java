package com.atlas.automation.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
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
 	    Assert.assertTrue(eventpage.searchField.isDisplayed());
 	   Assert.assertTrue(eventpage.year.isDisplayed());

	}
   
   
   @Test(priority=2)
   public void EventListingPageTest() throws InterruptedException {
       
       Assert.assertEquals(eventpage.titleHeader.getText(), "Title");
       Assert.assertEquals(eventpage.eventNoHeader.getText(), "Event No");
       Assert.assertEquals(eventpage.showtypeHeader.getText(), "Show Type");
       Assert.assertEquals(eventpage.dateHeader.getText(), "Date");
       Assert.assertEquals(eventpage.venueHeader.getText(), "Venue");
       Assert.assertEquals(eventpage.publishtoteamHeader.getText(), "Published To Team");
       Assert.assertEquals(eventpage.publishtoworldHeader.getText(), "Published To World");
       
       
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
    	 Thread.sleep(3000);	
		 for (int i = 0; i < eventpage.filterVenue.size(); i++) {
			 String EventName = eventpage.filterVenue.get(i).getText();
		     Assert.assertTrue(EventName.contains("Bellesalle Shibuya Garden, Tokyo"));
    
         }
	     Assert.assertTrue(eventpage.clearFilter.isDisplayed());
	     eventpage.clearFilter();
		
    }
    
    @Test(priority=4)
    public void Yearfilter() throws InterruptedException {
    	 
    	   
    	   actions.waitForElementToLoad();
       	   eventpage.yearFilter();
       	Thread.sleep(3000);	
		 for (int i = 0; i < eventpage.filterYear.size(); i++) {
			 String EventName = eventpage.filterYear.get(i).getText();
		     Assert.assertTrue(EventName.contains("2019"));
   
        }
       	eventpage.clearFilter();
       	Assert.assertEquals(0, driver.findElements(By.xpath("//span[contains(text(),'Clear Filter')]")).size());
    }
    @Test(priority=4)
    public void Monthfilter() throws InterruptedException {
    	 
    	   
    	   actions.waitForElementToLoad();
       	   eventpage.yearFilter();
       	   Assert.assertEquals(eventpage.month.getText(),"Month (optional)");
       	eventpage.clearFilter();
       	Assert.assertEquals(0, driver.findElements(By.xpath("//span[contains(text(),'Clear Filter')]")).size());
    }

    
   
    @Test(priority=5)
	public void filterByEventByShowtypeandvenue() throws InterruptedException {
     
   	    Thread.sleep(3000);
        eventpage.showtypeFilter();
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
   
    @Test(priority=6)
	public void eventSearchByNameTest() throws InterruptedException {
    	try {
    		
    	eventpage.pastEvents();
       	actions.waitForElementToLoad();
        eventpage.enterStringInEventSearchField("Fist");
        Thread.sleep(5000);
    			for (int i = 0; i< eventpage.searchResultsByName.size(); i++) {
    				String athleteName = eventpage.searchResultsByName.get(i).getText();
    				Assert.assertTrue(athleteName.contains("Fist"));	
    			}	
    	}
    			catch (AssertionError e) {
    				e.printStackTrace();
    			}
        Assert.assertTrue(eventpage.clearFilter.isDisplayed());
		eventpage.clearFilter(); 
   }
   
	
   
    @Test(priority=7)
	public void eventSearchByNamewithfilterTest() throws InterruptedException {
       	actions.waitForElementToLoad();
        eventpage.enterSearchQuery();
        Thread.sleep(2000);
       	eventpage.showtypeFilter();
        Thread.sleep(3000);
    			for (int i = 0,j=0; i < eventpage.searchResultsByName.size()&&  j < eventpage.filterShowType.size(); i++) {
    				String EventName = eventpage.searchResultsByName.get(i).getText();
    				String Eventtype = eventpage.filterShowType.get(i).getText();
    				Assert.assertTrue(EventName.contains("Fist"));	
    				Assert.assertTrue(Eventtype.contains("ONE Series"));
    			}	
        Assert.assertTrue(eventpage.clearFilter.isDisplayed());
		 
   }
   
    @Test(priority=8)
   public void clearFilter() throws InterruptedException{
    	
    	eventpage.yearFilter();
        eventpage.venueFilter();
   
	    eventpage.clearFilter();
	    Assert.assertEquals(0, driver.findElements(By.xpath("//span[contains(text(),'Clear Filter')]")).size());
	   
  }

  /*
    @Test(priority=8)
    public void pastEventNavigation() throws InterruptedException {
    	
    	actions.waitForElementToBeClickable(eventpage.nextpage);
 	    eventpage.nextpage();
 	    actions.waitForElementPresent(eventpage.pastnextEntries);
 	    Assert.assertTrue(eventpage.pastnextEntries.isDisplayed());
 	    eventpage.previouspage();
	  
 }
    
  @Test (priority=9)  
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
	    Actions performAct = new Actions(driver1); 
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
	  homepage.eventsBtnClick();
	    eventpage.createnewEvent();
	    eventpage.showType();
	    eventpage.eventSave();
        actions.waitForElementPresent(eventpage.confirmEventType);
        Assert.assertTrue(eventpage.confirmEventType.isDisplayed());
        driver.navigate().back();
         
    }
 
  @Test(priority=20)
 	public void searchcreatedEvent() throws InterruptedException {
	 
 		    eventpage.searchQuery();
 		    Thread.sleep(5000);
 		    Assert.assertEquals(eventpage.event.getText(),eventpage.eventName);
          
             
 		} 

   @Test(priority=21)
   	public void checkcreatedEventinallLocales() throws InterruptedException {
   		    
   		    eventpage.hindilocale();
   		    homepage.eventsBtnClick();
   		 eventpage.searchQuery();
   		    Thread.sleep(5000);
   		    Assert.assertEquals(eventpage.event.getText(),eventpage.eventName);
   		    eventpage.bahasalocale();
		    homepage.eventsBtnClick();
		    eventpage.searchQuery();
		    Thread.sleep(5000);
		    Assert.assertEquals(eventpage.event.getText(),eventpage.eventName);
		    eventpage.khmerlocale();
   		    homepage.eventsBtnClick();
   		 eventpage.searchQuery();
   		    Thread.sleep(5000);
   		   Assert.assertEquals(eventpage.event.getText(),eventpage.eventName);
               
   		} 
   
    @Test(priority=22)
    public void detailTabTest() throws InterruptedException {
    	 eventpage.englishlocale();
		    homepage.eventsBtnClick();
		    eventpage.searchQuery();
   		    Thread.sleep(5000);
         eventpage.event.click();
    	 
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
    /*
    @Test(priority=22)
    public void boutpageTabTest() throws InterruptedException {
       
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
  /*
    @Test (priority=22)
    public void addBoutPopupTest() throws InterruptedException {
    	
	    eventpage.addLeadCardBout();
		Assert.assertTrue(eventpage.athlete1.isDisplayed());
		Assert.assertTrue(eventpage.athlete2.isDisplayed());
		Assert.assertTrue(eventpage.weightclass.isDisplayed());
		Assert.assertTrue(eventpage.style.isDisplayed());
		Assert.assertTrue(eventpage.selectchampionshipType.isDisplayed());
		Assert.assertTrue(eventpage.tags.isDisplayed());
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
    	homepage.eventsBtnClick();
    	eventpage.event1.click();
    	eventpage.boutcard();
        eventpage.addMainCardBout();
		eventpage.boutcard1();
		actions.waitForElementToBeClickable(eventpage.SaveAndProceed);
		Assert.assertEquals(eventpage.Red1.getText(),"AJ Lias Mansor");
		Assert.assertEquals(eventpage.Blue1.getText(),"Abro Fernandes");
		
    }
    
    @Test(priority=32)
    public void addMainBoutcards() throws InterruptedException {
		eventpage.addMainCardBout();
		eventpage.boutcard2();
		actions.waitForElementToBeClickable(eventpage.SaveAndProceed);
		Assert.assertEquals(eventpage.Red2.getText(),"Stamp Fairtex");
		//Assert.assertEquals(eventpage.Blue2.getText(),"Ritu Phogat2");
		Assert.assertEquals(eventpage.Noofmaincards.getText(),"MAIN CARD (2 BOUTS)");
		Assert.assertEquals(eventpage.Noofcards.getText(),"Total Bouts: 2");
		
    }
    @Test(priority=33)
    public void addLeadBoutcards() throws InterruptedException {
       homepage.eventsBtnClick();
    	eventpage.event1.click();
    	eventpage.boutcard();
		eventpage.addLeadCardBout();
		eventpage.boutcard3();
		actions.waitForElementToBeClickable(eventpage.SaveAndProceed);
		Assert.assertEquals(eventpage.Red3.getText(),"Adi Nugroho");
		Assert.assertEquals(eventpage.Blue3.getText(),"Adi Paryanto");
		eventpage.addLeadCardBout();
		eventpage.boutcard4();
		actions.waitForElementToBeClickable(eventpage.SaveAndProceed);
		Assert.assertEquals(eventpage.Red4.getText(),"Adib Sulaiman");
		Assert.assertEquals(eventpage.Blue4.getText(),"Adrian Mattheis");
		Assert.assertEquals(eventpage.Noofleadcards.getText(),"LEAD CARD (2 BOUTS)");
		Assert.assertEquals(eventpage.Noofcards.getText(),"Total Bouts: 4");
		
		actions.verticalScrollToTop();
		//eventpage.publishToTeam();
		//Assert.assertTrue(eventpage.publishtoteam.isDisplayed());
		
		
		
    }
    @Test(priority=35)
    public void AthletedetailsTest() throws InterruptedException {
    	
        eventpage.expand.click();
        Assert.assertEquals(eventpage.nickname.getText(), "NICKNAME");
        Assert.assertEquals(eventpage.gym.getText(), "GYM");
        Assert.assertEquals(eventpage.Weightclass.getText(), "WEIGHTCLASS");
        Assert.assertEquals(eventpage.weight.getText(), "WEIGHT");
        Assert.assertEquals(eventpage.height.getText(), "HEIGHT");
        Assert.assertEquals(eventpage.age.getText(), "AGE");
        Assert.assertEquals(eventpage.dob.getText(), "DOB");
        Assert.assertEquals(eventpage.country.getText(), "COUNTRY");
        Assert.assertEquals(eventpage.recordtype.getText(), "RECORD TYPE");
        Assert.assertEquals(eventpage.record.getText(), "RECORD (W‑L‑D)");
        
    }

    @Test(priority=34)   
    public void markAllasConfirmed() throws InterruptedException {
    
    	eventpage.maincardBoutEdit();
        eventpage.enable.click();
        eventpage.saveBout();
        actions.waitForElementToBeClickable(eventpage.confirmationMarkAllasconfirmed);
    	Assert.assertTrue(eventpage.confirmMarkAllasconfirmed.isDisplayed());
    	Assert.assertEquals(eventpage.Noofmaincards.getText(),"MAIN CARD (2 BOUTS)");
       // Assert.assertEquals(eventpage.Noofcards.getText(),"Total Bouts: 4");
        Assert.assertEquals(0, driver.findElements(By.xpath("//span[contains(text(), 'Mark all as confirmed')]")).size());
        
        
    } 
    
   
    
  /* 
    @Test(priority=33)
    public void nonChampionshipBoutToChampionshipBout() throws InterruptedException {
    	
    	eventpage.nonchampionshiptoChampionship();
    	eventpage.saveBout();
    	Thread.sleep(7000);
    	Assert.assertEquals(eventpage.confirmLightweightWorldChampionship.getText(),"(FLYWEIGHT)"+"\n"+"LAGA CADANGAN FLYWEIGHT WORLD GRAND PRIX"+"\n"+"UNCONFIRMED");
      	
    }
    
    @Test(priority=34)
    public void championshipBoutToNonChampionshipBout() throws InterruptedException {
        eventpage.championshiptoNonchampionship();
    	//Assert.assertTrue(eventpage.selectchampionshipType.isDisplayed());
    	eventpage.saveBout();
    	Thread.sleep(5000);
    	Assert.assertEquals(eventpage.confirmLightweightWorldChampionship.getText(),"FLYWEIGHT"+"\n"+"BOXING"+"\n"+"UNCONFIRMED");
    	
    }
   /*
    @Test(priority=34)
    public void deleteBoutcard() throws InterruptedException {
    	
	   
        eventpage.boutDelete();
        
        Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
        Assert.assertTrue(eventpage.confirmBoutDelete.isDisplayed());
        Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
        
   }
 
    @Test(priority=35)
    public void athletebothReplace() throws InterruptedException {
 	    eventpage.maincardBoutEdit();
        eventpage.athlete1();
        eventpage.athlete3();
        eventpage.saveBout();
        Thread.sleep(7000);
        Assert.assertEquals(eventpage.Red1.getText(),"Neha Kashyap");
		Assert.assertEquals(eventpage.Blue1.getText(),"Asha R");
		 Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
        
    }
    
    @Test(priority=36)
    public void athletesingleReplace() throws InterruptedException {
        Thread.sleep(3000);
 	    eventpage.maincardBoutEdit();
        eventpage.athlete2();
        eventpage.saveBout();
        Thread.sleep(7000);
        Assert.assertEquals(eventpage.Red1.getText(),"Stamp Fairtex");
        
        
    }
    
    @Test(priority=37)
    public void confirmToUnconfirm() throws InterruptedException {
    	
    	eventpage.maincardBoutEdit();
        eventpage.enable.click();
        eventpage.saveBout();
        Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
        actions.waitForElementPresent(eventpage.unconfirmedtext);
        Assert.assertTrue(eventpage.unconfirmedtext.isDisplayed());
        
    }
    
    @Test(priority=38)
    public void unconfirmToconfirm() throws InterruptedException {
    	
    	eventpage.maincardBoutEdit();
        eventpage.enable.click();
        eventpage.saveBout();
        actions.verticalScrollToTop();
       actions.waitForElementPresent(eventpage.Noofmaincards1);
        Assert.assertTrue(eventpage.Noofmaincards1.isDisplayed());
    }
 

    @Test(priority=39)
    public void superseries() throws InterruptedException{
    	 Thread.sleep(3000);
        eventpage.maincardBoutEdit();
        eventpage.superseries.click();
        eventpage.style();
        eventpage.saveBout();
        actions.waitForElementPresent(eventpage.confirmSuperseries);
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
         eventpage.saveBout();
         Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
         actions.waitForElementPresent(eventpage.confirmCatchweightvalue);
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
        Thread.sleep(7000);
        actions.waitForElementToBeClickable(eventpage.bannerUpcoming);
        eventpage.dropImage();
        eventpage.upload(System.getProperty("user.dir") + "/creatives/event creatives/1920x1080.jpg"); 
        actions.waitForElementToBeClickable(eventpage.saveImage);
        
        Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
        Assert.assertTrue(eventpage.deleteBannerUpcoming.isDisplayed());
        Thread.sleep(7000);
        actions.scrollToDown();
        actions.waitForElementToBeClickable(eventpage.featuredImage);
        eventpage.dropImage();
        eventpage.upload(System.getProperty("user.dir") + "/creatives/event creatives/1800x1200_2.jpg");
        actions.waitForElementToBeClickable(eventpage.saveImage);
       
        Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
        Assert.assertTrue(eventpage.deleteFeaturedImage.isDisplayed());
      
  }
  
    @Test(priority=45)
    public void deletecreative() throws InterruptedException {
    	 actions.waitForElementToBeClickable(eventpage.deleteBannerListing);
     	 Thread.sleep(3000);
     	 Assert.assertTrue(eventpage.bannerListingCreative.isDisplayed());
     	 Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
     	actions.waitForElementToBeClickable(eventpage.deleteBannerUpcoming);
     	 Thread.sleep(3000);
     	 Assert.assertTrue(eventpage.bannerUpcomingCreative.isDisplayed());
     	 Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
     	 actions.scrollToDown();
     	actions.waitForElementToBeClickable(eventpage.deleteFeaturedImage);
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
    	Thread.sleep(5000);
    	actions.waitForElementToBeClickable(eventpage.creativestab);    
    	eventpage.creative();
    	
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
    	//Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
    	Thread.sleep(5000);
    	actions.waitForElementToBeClickable(eventpage.creativestab);    
    	eventpage.creative();
    	Assert.assertTrue(eventpage.venuecreativebannerwithvenue.isDisplayed());
        Assert.assertTrue(eventpage.venuecreativelistingwithvenue.isDisplayed());
        
    }
   
    
    
	
    @Test(priority=48)
    public void eventDetailsEdit() throws InterruptedException {
    	
    	eventpage.detailpage(); 
    	eventpage.editEvent();
    	eventpage.deleteVenue.click();
    	eventpage.eventVenue();
    	actions.scrollToDown();
    	eventpage.selecetEventEnclosureRing();
    	eventpage.saveEventdetails();
        Assert.assertTrue(eventpage.ring.isDisplayed());
        
     }
   
    @Test(priority=49)
    public void description() throws InterruptedException { 
    	
    	eventpage.editDescriptionClick();
    	eventpage.enterDescription();
    	eventpage.saveDescription();
    	Thread.sleep(3000);
      	Assert.assertTrue(eventpage.confirmationPopupTextForSave.isDisplayed());
      	actions.waitForElementPresent(eventpage.descriptionConfirmation);
        Assert.assertTrue(eventpage.descriptionConfirmation.isDisplayed());
      	    
     }
    
    @Test(priority=50)
    public void appsettingTabTest() throws InterruptedException {
    	homepage.eventsBtnClick();
    	eventpage.event1.click();
    	//actions.verticalScrollToTop();
    	Thread.sleep(5000);
        eventpage.appsetting(); 
        actions.waitForElementToLoad();
       	Assert.assertTrue(eventpage.editappsettingEvent.isDisplayed());
    	Assert.assertTrue(eventpage.displaytheeventText.isDisplayed());
    	Assert.assertTrue(eventpage.hideboutcardsText.isDisplayed());
    	Assert.assertTrue(eventpage.publishToWorld.isDisplayed());
    	Assert.assertTrue(eventpage.lastpublishedtoworldText.isDisplayed());
    //	Thread.sleep(2000);
    	//eventpage.deleteBtn.click();
        //eventpage.select.click();
        //eventpage.deletepermanently.click();
       	driver.get("https://atlas.dev.tech.onefc.com/events");
   }
    @Test(priority=71)
   	public void PastEventTag() throws InterruptedException {
    	Thread.sleep(5000);
        eventpage.pastEvents();
        //search for an event
        eventpage.enterStringInEventSearchField("Fists of fury");
        Thread.sleep(5000);
        eventpage.event.click();
        eventpage.boutcard();
        //Validating the Tags
        Assert.assertEquals(eventpage.tagcheck4.getText(), "");
        Assert.assertEquals(eventpage.tagcheck4.getText(), "");
        Assert.assertEquals(eventpage.tagcheck4.getText(), "");
        Assert.assertEquals(eventpage.tagcheck4.getText(), "");
   		}    
   
   /*	
    @Test(priority=53)
   	public void tagsdropdownTest() throws InterruptedException {
    	
    	Thread.sleep(5000);
    	eventpage.createnewEvent();
        eventpage.showType();
        eventpage.selecetEventEnclosurecage();
        eventpage.eventSave();
        Thread.sleep(3000);
            eventpage.boutcard();
            eventpage.addMainCardBout();
   			eventpage.tags.click();
   			//check for Available Tags
   			Assert.assertTrue(eventpage.BR.isDisplayed());
   			Assert.assertTrue(eventpage.Regular.isDisplayed());
   			Assert.assertTrue(eventpage.TNT.isDisplayed());
   			eventpage.boutAdditionCancel();
               
   		} 
    @Test(priority=54)
   	public void tagsearchDropdownTest() throws InterruptedException {
           eventpage.addBout();
			eventpage.tags.click();
			Actions performAct = new Actions(driver); 
		    performAct.sendKeys(eventpage.tags,"Regu").build().perform(); 
		    //validate the search Tag
   			Assert.assertTrue(eventpage.Regular.isDisplayed());
   			eventpage.boutAdditionCancel();
   		} 
    
    @Test(priority=55)
   	public void invalidsearchDropdownTest() throws InterruptedException {
    
    	    eventpage.addBout();
			eventpage.tags.click();
			Actions performAct = new Actions(driver); 
		    performAct.sendKeys(eventpage.tags,"one").build().perform(); 
   			Assert.assertTrue(eventpage.Nomatchfound.isDisplayed());
   			eventpage.boutAdditionCancel();
   			eventpage.mainCardAdditionCancel.click();
   		} 
    
    @Test(priority=56)
   	public void logTest() throws InterruptedException {
         eventpage.addMainCardBout();
 	     eventpage.boutcard1();
	     eventpage.BR();
	     eventpage.SaveAndProceed.click();
	     Thread.sleep(3000);
         eventpage.maincardBoutEdit();
		 eventpage.Regular();
		 eventpage.TNT();
		 eventpage.SaveAndProceed.click();
		 Thread.sleep(5000); 
         eventpage.logs();
         //Assert.assertEquals(eventpage.versionNo1.getText(),"Version 3");  
         eventpage.boutcard();
        eventpage.maincardBoutEdit();
      eventpage.tagDelete.click();
      eventpage.SaveAndProceed.click();
      Thread.sleep(5000);
      eventpage.logs();
      //Assert.assertEquals(eventpage.versionNo1.getText(),"Version 4");  
      
               
   		} 
    @Test(priority=57)
   	public void additionofTagforBoutcreatedwithoutTag() throws InterruptedException {
    	   eventpage.boutcard();
    	   eventpage.boutDelete();
    	   Thread.sleep(3000);
            eventpage.addMainCardBout();
			eventpage.boutcard1();
			eventpage.SaveAndProceed.click();
			Thread.sleep(3000);
			eventpage.maincardBoutEdit();
			eventpage.Regular();
			eventpage.SaveAndProceed.click();
			Thread.sleep(7000);
			//Validate the added Tag
			Assert.assertEquals(eventpage.tagcheck1.getText(),"REGULAR");
             eventpage.boutDelete();  
   		} 
    
    @Test(priority=58)
   	public void boutcreationwithtag() throws InterruptedException {
    	    Thread.sleep(3000);
            eventpage.addMainCardBout();
			eventpage.boutcard1();
			eventpage.BR();
			eventpage.SaveAndProceed.click();
			//Validate the added Tag
			Assert.assertEquals(eventpage.tagcheck1.getText(),"BR");
               
   		} 
   
    @Test(priority=59)
   	public void addTagcancel() throws InterruptedException {
    	
			eventpage.maincardBoutEdit();
			eventpage.Regular();
			eventpage.TNT();
			eventpage.boutAdditionCancel();
			Assert.assertEquals(eventpage.tagcheck1.getText(),"BR");
			eventpage.mainCardAdditionCancel.click();
               
   		} 
    
    @Test(priority=60)
   	public void tagDeletionancel() throws InterruptedException {
    	  
           eventpage.maincardBoutEdit();
			eventpage.tagDelete.click();
			eventpage.boutAdditionCancel();
			Assert.assertEquals(eventpage.tagcheck1.getText(),"BR");
			eventpage.mainCardAdditionCancel.click();
   			
               
   		} 
    
    
  @Test(priority=61)
	public void tagAddition() throws InterruptedException {
		    eventpage.maincardBoutEdit();
		    eventpage.Regular();
			eventpage.TNT();
		    eventpage.SaveAndProceed.click();
		    Thread.sleep(7000);
		    //validate Tag Addition
			Assert.assertEquals(eventpage.tagcheck1.getText(),"BR"+"\n"+"REGULAR"+"\n"+"TNT");
            
		} 
  
  
    @Test(priority=62)
	public void tagDeletion() throws InterruptedException {
		     
            eventpage.maincardBoutEdit();
            eventpage.tagDelete.click();
            eventpage.SaveAndProceed.click();
            Thread.sleep(7000);
            Assert.assertEquals(eventpage.tagcheck1.getText(),"REGULAR"+"\n"+"TNT");
            eventpage.maincardBoutEdit();
            eventpage.tagDelete.click();
            eventpage.tagDelete.click();
            eventpage.SaveAndProceed.click();
            Thread.sleep(7000);
            //validate tag deletion
            Assert.assertEquals(eventpage.tagcheck1.getText(),"");
          
    }
      
    @Test(priority=63)
   	public void confirmedBoutTagTest() throws InterruptedException {
    	
    	 eventpage.boutDelete();
    	 Thread.sleep(3000);
    	 eventpage.addMainCardBout();
    	    eventpage.boutcard3();
			eventpage.BR();
			eventpage.SaveAndProceed.click();
			Thread.sleep(2000);
			eventpage.maincardBoutEdit();
			eventpage.Regular();
			eventpage.TNT();
			eventpage.boutAdditionCancel();
			Assert.assertEquals(eventpage.tagcheck1.getText(),"BR");
			eventpage.mainCardAdditionCancel.click();
            eventpage.maincardBoutEdit();
			eventpage.tagDelete.click();
			eventpage.boutAdditionCancel();
			Assert.assertEquals(eventpage.tagcheck1.getText(),"BR");
			eventpage.mainCardAdditionCancel.click();
		    eventpage.maincardBoutEdit();
		    eventpage.Regular();
			eventpage.TNT();
		    eventpage.SaveAndProceed.click();
		    Thread.sleep(7000);
			Assert.assertEquals(eventpage.tagcheck1.getText(),"BR"+"\n"+"REGULAR"+"\n"+"TNT"); 
            eventpage.maincardBoutEdit();
            eventpage.tagDelete.click();
            eventpage.SaveAndProceed.click();
            Thread.sleep(7000);
            Assert.assertEquals(eventpage.tagcheck1.getText(),"REGULAR"+"\n"+"TNT");
            eventpage.maincardBoutEdit();
            eventpage.tagDelete.click();
            eventpage.tagDelete.click();
            eventpage.SaveAndProceed.click();
            Thread.sleep(7000);
            Assert.assertEquals(eventpage.tagcheck1.getText(),"");
            eventpage.boutDelete();
            
    }
    
     @Test(priority=64)
    public void eventcreationwithnoTagTest() throws InterruptedException { 
    	 homepage.eventsBtnClick();
    	 eventpage.event1.click();
    	 eventpage.boutcard();
   	   //Thread.sleep(3000);
        eventpage.addMainCardBout();
        eventpage.boutcard1();
        actions.waitForElementToBeClickable(eventpage.SaveAndProceed);
        Assert.assertEquals(eventpage.tagcheck1.getText(),"");
        eventpage.addMainCardBout();
        eventpage.boutcard2();
        actions.waitForElementToBeClickable(eventpage.SaveAndProceed);
        Assert.assertEquals(eventpage.tagcheck2.getText(),"");
        eventpage.addMainCardBout();
        eventpage.boutcard4();
        actions.waitForElementToBeClickable(eventpage.SaveAndProceed);
        Assert.assertEquals(eventpage.tagcheck3.getText(),"");
  
   }
  
  
    @Test(priority=65)
    public void publishtoteamEventcreationwithnoTagTest() throws InterruptedException {
	 
        actions.verticalScrollToTop();
        eventpage.publishToTeam();
        Thread.sleep(3000);
        
        
         
    } 
     @Test(priority=65)
    public void publishtoworldEventcreationwithnoTagTest() throws InterruptedException {
    	 homepage.eventsBtnClick();
    	 eventpage.event1.click();
        eventpage.appsetting();
        eventpage.publishToWorld();
        Thread.sleep(7000);
        eventpage.boutcard();
       
        eventpage.boutDelete();
        Thread.sleep(2000);
        //actions.waitForElementPresent(eventpage.maincardEditBtn);
        eventpage.boutDelete();
        //Thread.sleep(3000);
        eventpage.boutDelete();
         
    } 
    @Test(priority=66)
        public void eventcreationwithsameTagTest() throws InterruptedException {
    	Thread.sleep(3000);
    	eventpage.addMainCardBout();
        eventpage.boutcard1();
        eventpage.BR();
        actions.waitForElementToBeClickable(eventpage.SaveAndProceed);
        Assert.assertEquals(eventpage.tagcheck1.getText(), "BR");
        eventpage.addMainCardBout();
        eventpage.boutcard2();
        eventpage.BR();
        actions.waitForElementToBeClickable(eventpage.SaveAndProceed);
        Assert.assertEquals(eventpage.tagcheck2.getText(), "BR");
        eventpage.addMainCardBout();
        eventpage.boutcard3();
        eventpage.BR();
        actions.waitForElementToBeClickable(eventpage.SaveAndProceed);
        Assert.assertEquals(eventpage.tagcheck3.getText(), "BR");
        eventpage.addMainCardBout();
        eventpage.boutcard4();
        eventpage.BR();
        actions.waitForElementToBeClickable(eventpage.SaveAndProceed);
        Assert.assertEquals(eventpage.tagcheck4.getText(), "BR");
        Thread.sleep(3000);
        eventpage.boutDelete();
        Thread.sleep(3000);
        eventpage.boutDelete();
        Thread.sleep(3000);
        eventpage.boutDelete();
        Thread.sleep(3000);
        eventpage.boutDelete(); 
        
   }
    @Test(priority=67)
    public void eventcreationwithdifferentTagTest() throws InterruptedException {
    	Thread.sleep(3000);
    	eventpage.addMainCardBout();
        eventpage.boutcard1();
        eventpage.BR();
        eventpage.TNT();
        actions.waitForElementToBeClickable(eventpage.SaveAndProceed);
        Assert.assertEquals(eventpage.tagcheck1.getText(), "BR"+"\n"+"TNT");
        eventpage.addMainCardBout();
        eventpage.boutcard2();
        eventpage.BR();
        actions.waitForElementToBeClickable(eventpage.SaveAndProceed);
        Assert.assertEquals(eventpage.tagcheck2.getText(), "BR");
        eventpage.addMainCardBout();
        eventpage.boutcard3();
        eventpage.TNT();
        actions.waitForElementToBeClickable(eventpage.SaveAndProceed);
        Assert.assertEquals(eventpage.tagcheck3.getText(),"TNT");
        eventpage.addMainCardBout();
        eventpage.boutcard4();
        eventpage.Regular();
        actions.waitForElementToBeClickable(eventpage.SaveAndProceed);
        Assert.assertEquals(eventpage.tagcheck4.getText(), "REGULAR");
        //eventpage.publishToTeam();
        
        
   }
   
      
    @Test(priority=68)
   	public void deletePermanentlyText() throws InterruptedException {
    	homepage.eventsBtnClick();
    	//Thread.sleep(5000);
    	eventpage.createnewEvent();
        eventpage.showType();
        eventpage.selecetEventEnclosurecage();
        eventpage.eventSave();
       		    actions.waitForElementToLoad();
       		    eventpage.appsetting();
       		    eventpage.publishToTeam();
       		    actions.waitForElementToLoad();
       		    //eventpage.publishToWorld();
       		 actions.waitForElementToLoad();
       		 Thread.sleep(7000);
       		    eventpage.hindilocale();
       		    homepage.eventsBtnClick();
       		   eventpage.searchQuery();
       		//actions.waitForElementPresent(eventpage.eventName);
       		    eventpage.event.click();
       		    Assert.assertEquals(eventpage.eventbanner.getText(),eventpage.eventName);
       		    eventpage.bahasalocale();
    		    homepage.eventsBtnClick();
    		    eventpage.searchQuery();
       		    actions.waitForElementToLoad();
       		    Assert.assertEquals(eventpage.event.getText(),eventpage.eventName);
    		    eventpage.khmerlocale();
       		    homepage.eventsBtnClick();
       		 eventpage.searchQuery();
    		    actions.waitForElementToLoad();
    		    Assert.assertEquals(eventpage.event.getText(),eventpage.eventName);
                  
       		
    	//actions.scrollToDown();
    //validate Delete button and the Text
   		 //Assert.assertTrue(eventpage.deleteBtn.isDisplayed());
   		 //Assert.assertTrue(eventpage.deleteText.isDisplayed());
               
   		}  
    
    @Test(priority=69)
   	public void deletePopTest() throws InterruptedException {
    	
               eventpage.deleteBtn.click();
               actions.waitForElementPresent(eventpage.deletepopup);
               Assert.assertTrue(eventpage.deletepopup.isDisplayed());
               Assert.assertFalse(eventpage.deletepermanently.isEnabled());
               Assert.assertTrue(eventpage.cancelDeleteEvent.isDisplayed());  
               eventpage.cancelDeleteEvent.click();
   		}  
   
    @Test(priority=70)
   	public void deleteTextEnable() throws InterruptedException {
   		    
               eventpage.deleteBtn.click();
               //eventpage.select.click();
               Assert.assertFalse(eventpage.deletepermanently.isEnabled());
               eventpage.cancelDeleteEvent.click();  
               
   		} 
    
    @Test(priority=71)
   	public void deleteTextenable() throws InterruptedException {
   		    
               eventpage.deleteBtn.click();
               eventpage.select.click();
               Assert.assertTrue(eventpage.deletepermanently.isEnabled());
               eventpage.cancelDeleteEvent.click();  
               
   		} 
   
    @Test(priority=72)
   	public void deleteCancelTest() throws InterruptedException {
   		    
               eventpage.deleteBtn.click();
               eventpage.select.click();
               Assert.assertTrue(eventpage.deletepermanently.isEnabled());
               eventpage.cancelDeleteEvent.click();  
               
   		} 
    
    @Test(priority=72)
   	public void deleteTest() throws InterruptedException {
   		    
               eventpage.deleteBtn.click();
               eventpage.select.click();
               actions.waitForElementToBeClickable(eventpage.deletepermanently);
               Thread.sleep(5000);
               Assert.assertEquals(driver.getCurrentUrl(),"https://atlas.dev.tech.onefc.com/events#no-back");
               //Assert.assertTrue(eventpage.confirmationPopupTextForEventDeletion.isDisplayed());
    }   
    
    @Test(priority=72)
   	public void deleteTestpopup() throws InterruptedException {
    	 Assert.assertTrue(eventpage.confirmationPopupTextForEventDeletion.isDisplayed());

        
    }   
    
    @Test(priority=73)
   	public void searchdeleteTest() throws InterruptedException {
    
   		  eventpage.searchQuery();
   		 Assert.assertTrue(eventpage.noEventFound.isDisplayed());
    }
    
    
    @Test(priority=74)
   	public void pasteventdeleteTest() throws InterruptedException {
    homepage.eventsBtnClick();
    
   		  actions.waitForElementToLoad();
   		  eventpage.pastEvents();
   		eventpage.enterSearchQuery1();
   		Thread.sleep(3000);
   		  eventpage.event.click();
   		Assert.assertTrue(eventpage.deleteTexts.isDisplayed());
   		  eventpage.boutcard();
   		Assert.assertTrue(eventpage.deleteTexts.isDisplayed());
   		eventpage.creative();
   		Assert.assertTrue(eventpage.deleteTexts.isDisplayed());
   		  eventpage.logs();
   		  Assert.assertTrue(eventpage.deleteTexts.isDisplayed());
    }
    
   
    /*
   @AfterClass
	public void tearDown() {
		driver.quit();
	}*/

}
