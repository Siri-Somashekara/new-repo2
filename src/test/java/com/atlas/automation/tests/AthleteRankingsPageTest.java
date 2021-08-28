package com.atlas.automation.tests;
import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.atlas.automation.actions.WebdriverActions;
import com.atlas.automation.base.BaseClass;
import com.atlas.automation.pages.AthleteRankingPage;
import com.atlas.automation.pages.HomePage;
import com.atlas.automation.pages.LoginPage;


    public class AthleteRankingsPageTest extends BaseClass{

    LoginPage loginpage;
    HomePage homepage;
    AthleteRankingPage athleteRankingPage;
    WebdriverActions actions;
    
    public AthleteRankingsPageTest() {
        super();
    }
    
    @BeforeClass
    public void setup() throws InterruptedException, IOException {
    	
        initialization();
        loginpage = new LoginPage();
        athleteRankingPage = new AthleteRankingPage();
        actions=new WebdriverActions();
        Thread.sleep(30000);
        homepage = loginpage.loginToApp(prop.getProperty("emailID"), prop.getProperty("password"));      
    }
    
    @Test(priority=1)
  	public void editCategorypopup() throws InterruptedException {
    	
	    homepage.athleteRankingsBtnClick();
      	athleteRankingPage.editBtn();
        Assert.assertTrue(athleteRankingPage.addNewCategoryBtn.isDisplayed());
    	Assert.assertTrue(athleteRankingPage.reorder.isDisplayed());
      	Assert.assertTrue(athleteRankingPage.save.isDisplayed());
      	Assert.assertTrue(athleteRankingPage.cancel.isDisplayed());
      	athleteRankingPage.editcancelBtn();
      	
    }
 
    @Test(priority=2)
  	public void addNewCategorypopup() throws InterruptedException {
    	
      	athleteRankingPage.editBtn();
    	athleteRankingPage.addNewCategoryBtn();
      	Assert.assertTrue(athleteRankingPage.confirmTitle.isDisplayed());
      	Assert.assertTrue(athleteRankingPage.confirmWeightclass.isDisplayed());
      	Assert.assertTrue(athleteRankingPage.confirmGender.isDisplayed());
      	Assert.assertTrue(athleteRankingPage.confirmStyle.isDisplayed());
      	athleteRankingPage.editcancelBtn();
      	
  }
    
    @Test(priority=3)
   	public void dropdownTest() throws InterruptedException {
    	
    	athleteRankingPage.editBtn();
    	athleteRankingPage.addNewCategoryBtn();
    	athleteRankingPage.searchWeightclass();
		Assert.assertTrue(athleteRankingPage.atomweight.isDisplayed());
		athleteRankingPage.atomweight.click();
		athleteRankingPage.searchGender();
		Assert.assertTrue(athleteRankingPage.female.isDisplayed());
		athleteRankingPage.female.click();
    	athleteRankingPage.searchstyle();
   		Assert.assertTrue(athleteRankingPage.boxing.isDisplayed());
   		Assert.assertTrue(athleteRankingPage.dutchKickboxing.isDisplayed());
   		Assert.assertTrue(athleteRankingPage.kickboxing.isDisplayed());
   		athleteRankingPage.dutchKickboxing.click();
   		athleteRankingPage.editcancelBtn();
   		 
    }
   
    @Test(priority=5)
	public void addNewCategorycancel() throws InterruptedException {
    	
    	athleteRankingPage.editBtn();
    	athleteRankingPage.addNewCategoryBtn();
    	athleteRankingPage.title.sendKeys("HeavyWeight");
    	athleteRankingPage.selectWeightclass();
    	athleteRankingPage.selectGender();
    	athleteRankingPage.selectstyle();
    	athleteRankingPage.selectchampion();
    	athleteRankingPage.editcancelBtn();
    	Assert.assertNotSame(athleteRankingPage.titleadded.getText(),"HeavyWeight");
    	Assert.assertTrue(athleteRankingPage.edit.isDisplayed());   	
    	
    }
    
    @Test(priority=6)
  	public void addNewCategorywithoutTitle() throws InterruptedException {
    	
  	    athleteRankingPage.editBtn();
    	athleteRankingPage.addNewCategoryBtn();
    	athleteRankingPage.selectstyle();
    	athleteRankingPage.selectWeightclass();
    	athleteRankingPage.selectGender();
      	Assert.assertTrue(athleteRankingPage.titleRequired.isDisplayed());
      	athleteRankingPage.editcancelBtn();
      	  
    }
  
    @Test(priority=7)
    public void hindiLocaleEditCategorypopup() throws InterruptedException {
 
      	athleteRankingPage.hindilocale();
      	homepage.athleteRankingsBtnClick();
      	athleteRankingPage.editBtn();
      	Assert.assertFalse(athleteRankingPage.childlocaleAddNewCategoryBtn.isEnabled());
      	Assert.assertFalse(athleteRankingPage.childLocaleReorderRank.isEnabled());
      	Assert.assertTrue(athleteRankingPage.save.isEnabled());
      	Assert.assertTrue(athleteRankingPage.cancel.isEnabled());
      	athleteRankingPage.editcancelBtn();
      	
    }
    
    @Test(priority=8)
    public void bahasaLocaleEditCategorypopup() throws InterruptedException {
    	
    	actions.waitForElementToBeClickable(athleteRankingPage.localeselection);
    	actions.waitForElementToBeClickable(athleteRankingPage.bahasaLocale);
      	homepage.athleteRankingsBtnClick();
      	athleteRankingPage.editBtn();
      	Assert.assertFalse(athleteRankingPage.childlocaleAddNewCategoryBtn.isEnabled());
      	Assert.assertFalse(athleteRankingPage.childLocaleReorderRank.isEnabled());
      	Assert.assertTrue(athleteRankingPage.save.isEnabled());
      	Assert.assertTrue(athleteRankingPage.cancel.isEnabled());
      	athleteRankingPage.editcancelBtn();
      	
    }
    
    @Test(priority=9)
    public void khmerLocaleEditCategorypopup() throws InterruptedException {
    	
    	actions.waitForElementToBeClickable(athleteRankingPage.localeselection);
    	actions.waitForElementToBeClickable(athleteRankingPage.khmerLocale);
      	homepage.athleteRankingsBtnClick();
      	athleteRankingPage.editBtn();
      	Assert.assertFalse(athleteRankingPage.childlocaleAddNewCategoryBtn.isEnabled());
      	Assert.assertFalse(athleteRankingPage.childLocaleReorderRank.isEnabled());
      	Assert.assertTrue(athleteRankingPage.save.isEnabled());
      	Assert.assertTrue(athleteRankingPage.cancel.isEnabled());
      	Thread.sleep(3000);
      	athleteRankingPage.editcancelBtn();
      	
    }
    
    @Test(priority=10)
  	public void hindiLocaleTitleEditTest() throws InterruptedException {
    	
    	actions.waitForElementToLoad();
    	actions.waitForElementToBeClickable(athleteRankingPage.localeselection);
    	actions.waitForElementToBeClickable(athleteRankingPage.hindiLocale);
      	homepage.athleteRankingsBtnClick();
      	athleteRankingPage.editBtn();
      	athleteRankingPage.clearTitle();
      	athleteRankingPage.TitleEdit();
        Assert.assertTrue(athleteRankingPage.changesSaved.isDisplayed());
        Assert.assertTrue(athleteRankingPage.confirmtitleupdate.isDisplayed());
        
    }
    
    @Test(priority=11)
  	public void bahasaLocaleTitleEditTest() throws InterruptedException {
    	
    	Thread.sleep(5000);
    	actions.waitForElementToLoad();
    	actions.waitForElementToBeClickable(athleteRankingPage.localeselection);
    	actions.waitForElementToBeClickable(athleteRankingPage.bahasaLocale);
    	homepage.athleteRankingsBtnClick();
    	actions.waitForElementToLoad();
      	athleteRankingPage.editBtn();
      	athleteRankingPage.clearTitle();
      	athleteRankingPage.TitleEdit();
        Assert.assertTrue(athleteRankingPage.changesSaved.isDisplayed());
        Assert.assertTrue(athleteRankingPage.confirmtitleupdate.isDisplayed());
        
    }
    
    @Test(priority=12)
  	public void khmerLocaleTitleEditTest() throws InterruptedException {    
    	Thread.sleep(5000);
    	actions.waitForElementToLoad();
    	actions.waitForElementToBeClickable(athleteRankingPage.localeselection);
    	actions.waitForElementToBeClickable(athleteRankingPage.khmerLocale);
    	homepage.athleteRankingsBtnClick();
    	actions.waitForElementToLoad();
      	athleteRankingPage.editBtn();
      	athleteRankingPage.clearTitle();
      	athleteRankingPage.TitleEdit();
        Assert.assertTrue(athleteRankingPage.changesSaved.isDisplayed());
        Assert.assertTrue(athleteRankingPage.confirmtitleupdate.isDisplayed());
      	
  }
    @Test(priority=13)
  	public void addNewCategorywithonlyTitleandnorankers() throws InterruptedException {
    	
    	Thread.sleep(7000);
    	athleteRankingPage.englishlocale();
    	homepage.athleteRankingsBtnClick();
    	athleteRankingPage.editBtn();
    	athleteRankingPage.addNewCategoryBtn();
    	athleteRankingPage.title.sendKeys("HeavyWeight");
      	athleteRankingPage.saveBtn();
      	Thread.sleep(8000);
      	Assert.assertEquals(athleteRankingPage.titleadded.getText(),"HeavyWeight");
      	Assert.assertTrue(athleteRankingPage.norankAdded.isDisplayed());
      	Thread.sleep(3000);
      	athleteRankingPage.bahasalocale();
      	homepage.athleteRankingsBtnClick();
      	actions.waitForElementToLoad();
     	Assert.assertEquals(athleteRankingPage.titleadded.getText(),"HeavyWeight");
     	Assert.assertTrue(athleteRankingPage.norankAdded.isDisplayed());
      	athleteRankingPage.khmerlocale();
      	homepage.athleteRankingsBtnClick();
      	actions.waitForElementToLoad();
     	Assert.assertEquals(athleteRankingPage.titleadded.getText(),"HeavyWeight");
     	Assert.assertTrue(athleteRankingPage.norankAdded.isDisplayed());
      	athleteRankingPage.hindilocale();
      	actions.waitForElementToLoad();
      	homepage.athleteRankingsBtnClick();
     	Assert.assertEquals(athleteRankingPage.titleadded.getText(),"HeavyWeight");
     	Assert.assertTrue(athleteRankingPage.norankAdded.isDisplayed());
     	
    }
   
    @Test(priority=14)
   	public void addNewRankwithoutathlete() throws InterruptedException {
        Thread.sleep(5000);
    	athleteRankingPage.englishlocale();
    	homepage.athleteRankingsBtnClick();
    	Thread.sleep(3000);
    	athleteRankingPage.editBtn();
       	actions.waitForElementToBeClickable(athleteRankingPage.addNewRank);
       	Assert.assertTrue(athleteRankingPage.athleteRequired.isDisplayed());
       	athleteRankingPage.editcancelBtn();
       	
       }
 
    @Test(priority=15)
	public void addNewRank() throws InterruptedException {
    	
    	athleteRankingPage.editBtn();
    	athleteRankingPage.selectchampion();
    	athleteRankingPage.rank1();
     	Assert.assertTrue(athleteRankingPage.rank1.isDisplayed());
       	athleteRankingPage.rank2();
       	Assert.assertTrue(athleteRankingPage.rank2.isDisplayed());
       	athleteRankingPage.rank3();
       	Assert.assertTrue(athleteRankingPage.rank3.isDisplayed());
       	athleteRankingPage.rank4();
       	Assert.assertTrue(athleteRankingPage.rank4.isDisplayed());
       	athleteRankingPage.saveBtn();
       	Assert.assertTrue(athleteRankingPage.changesSaved.isDisplayed());
       	Thread.sleep(5000);
       	
    }
  
    @Test(priority=16)
    public void checkHindiLocale() throws InterruptedException {
    	
    	athleteRankingPage.hindilocale();
      	homepage.athleteRankingsBtnClick();
      	actions.waitForElementToLoad();
     	Assert.assertEquals(athleteRankingPage.rankNO1.getText(),athleteRankingPage.expRank1HindiLocale);
     	Assert.assertEquals(athleteRankingPage.rankNO2.getText(),athleteRankingPage.expRank2HindiLocale);
     	Assert.assertEquals(athleteRankingPage.rankNO3.getText(),athleteRankingPage.expRank3HindiLocale);
     	Assert.assertEquals(athleteRankingPage.rankNO4.getText(),athleteRankingPage.expRank4HindiLocale);
     	
    }
    
    @Test(priority=17)
    public void checkBahasaLocale() throws InterruptedException {
    	
      	athleteRankingPage.bahasalocale();
      	homepage.athleteRankingsBtnClick();
      	actions.waitForElementToLoad();
     	Assert.assertEquals(athleteRankingPage.rankNO1.getText(),athleteRankingPage.expRank1BahasaandkhmerLocale);
     	Assert.assertEquals(athleteRankingPage.rankNO2.getText(),athleteRankingPage.expRank2BahasaandkhmerLocale);
     	Assert.assertEquals(athleteRankingPage.rankNO3.getText(),athleteRankingPage.expRank3BahasaandkhmerLocale);
     	Assert.assertEquals(athleteRankingPage.rankNO4.getText(),athleteRankingPage.expRank4BahasaandkhmerLocale);
		 
		}
    
    @Test(priority=18)
    public void checkKhmerLocale() throws InterruptedException {
    	
    	athleteRankingPage.khmerlocale();
      	homepage.athleteRankingsBtnClick();
      	actions.waitForElementToLoad();
     	Assert.assertEquals(athleteRankingPage.rankNO1.getText(),athleteRankingPage.expRank1BahasaandkhmerLocale);
     	Assert.assertEquals(athleteRankingPage.rankNO2.getText(),athleteRankingPage.expRank2BahasaandkhmerLocale);
     	Assert.assertEquals(athleteRankingPage.rankNO3.getText(),athleteRankingPage.expRank3BahasaandkhmerLocale);
     	Assert.assertEquals(athleteRankingPage.rankNO4.getText(),athleteRankingPage.expRank4BahasaandkhmerLocale);
     	
		}
  
    @Test(priority=19)
   	public void duplicateAthleteAddition() throws InterruptedException {
    	
    	athleteRankingPage.englishlocale();
    	homepage.athleteRankingsBtnClick();
    	actions.waitForElementToLoad();
    	athleteRankingPage.editBtn();
    	athleteRankingPage.duplicateathleteaddition();
		Assert.assertTrue(athleteRankingPage.nomatchingathletefound.isDisplayed());   		 
		athleteRankingPage.editcancelBtn();
		
    }
    
    @Test(priority=20)
   	public void deleteRank() throws InterruptedException {
    	
       	athleteRankingPage.editBtn();
    	athleteRankingPage.deleteRank.click();
    	athleteRankingPage.saveBtn();
       	Assert.assertTrue(athleteRankingPage.changesSaved.isDisplayed());
       	driver.navigate().refresh();
       	actions.waitForElementToLoad();
       	Assert.assertEquals(athleteRankingPage.rankNO2.getText(),athleteRankingPage.expeditedRank2);
       	athleteRankingPage.hindilocale();
      	homepage.athleteRankingsBtnClick();
    	Assert.assertEquals(athleteRankingPage.rankNO2.getText(),athleteRankingPage.expeditedRank2);
    	athleteRankingPage.bahasalocale();
      	homepage.athleteRankingsBtnClick();
    	Assert.assertEquals(athleteRankingPage.rankNO2.getText(),athleteRankingPage.expeditedRank2);
    	athleteRankingPage.khmerlocale();
      	homepage.athleteRankingsBtnClick();
    	Assert.assertEquals(athleteRankingPage.rankNO2.getText(),athleteRankingPage.expeditedRank2);
    	
    }
    
    @Test(priority=21)
   	public void cancelRank() throws InterruptedException {
    	
	    athleteRankingPage.englishlocale();
    	homepage.athleteRankingsBtnClick();
       	athleteRankingPage.editBtn();
       	athleteRankingPage.rank4();
       	athleteRankingPage.editcancelBtn();
       	Assert.assertTrue(athleteRankingPage.edit.isDisplayed());
       	athleteRankingPage.edit.click();
       	athleteRankingPage.rank4();
        Assert.assertTrue(athleteRankingPage.confirmwathleteupdate.isDisplayed());
        athleteRankingPage.editcancelBtn();
        
    }
    
    @Test(priority=22)
   	public void removeChampion() throws InterruptedException {
    	
    	Thread.sleep(5000);
       	athleteRankingPage.editBtn();
       	athleteRankingPage.deletechampion();
    	Assert.assertTrue(athleteRankingPage.deletechamp.isDisplayed());
       	athleteRankingPage.saveNewCategoryBtn.click();
       	Assert.assertTrue(athleteRankingPage.changesSaved.isDisplayed());
       	Thread.sleep(3000);
       	
    }
   
    @Test(priority=22)
   	public void addNewRankwithoutchampion() throws InterruptedException {
    	
    	athleteRankingPage.editBtn();
    	athleteRankingPage.addNewCategoryBtn.click();
    	athleteRankingPage.title.sendKeys("LightHeavyWeight");
    	athleteRankingPage.selectWeightclass();
    	athleteRankingPage.selectGender();
    	athleteRankingPage.selectstyle();
       	athleteRankingPage.rank2();
       	Assert.assertTrue(athleteRankingPage.rank1.isDisplayed());
       	athleteRankingPage.rank3();
        Assert.assertTrue(athleteRankingPage.rank2.isDisplayed());
       	athleteRankingPage.rank4();
       	Assert.assertTrue(athleteRankingPage.rank3.isDisplayed());
       	Assert.assertTrue(athleteRankingPage.deletechamp.isDisplayed());
    	athleteRankingPage.saveBtn();
       	Assert.assertTrue(athleteRankingPage.changesSaved.isDisplayed());
       	
    }

    @Test(priority=23)
 	public void rankedit() throws InterruptedException {
    	
     	athleteRankingPage.editBtn();
     	athleteRankingPage.abro.click();
     	athleteRankingPage.searchAthlete();
     	athleteRankingPage.adibSulaiman.click();
        actions.verticalScrollToTop();
        athleteRankingPage.saveBtn();
        Thread.sleep(7000);
        Assert.assertEquals(athleteRankingPage.rankNO1.getText(),"Adib Sulaiman");
        
    }
    
    @Test(priority=24)
  	public void reoderPopup() throws InterruptedException {
    	
      	athleteRankingPage.editBtn();
      	athleteRankingPage.reorderRank.click();
      	Assert.assertTrue(athleteRankingPage.reodercancel.isDisplayed());
      	Assert.assertTrue(athleteRankingPage.reoderDone.isDisplayed());
      	athleteRankingPage.reodercancel.click();
      	athleteRankingPage.editcancelBtn();
      	
    }
    
    @Test(priority=25)
 	public void athleteClick() throws InterruptedException {
    	
     	athleteRankingPage.athlete.click();
     	Assert.assertTrue(athleteRankingPage.athletepage.isDisplayed());
     	driver.navigate().back();
     	
    }
    
    @Test(priority=26)
    public void deleteRankcancel() throws InterruptedException {
    	
    	actions.waitForElementToLoad();
    	Thread.sleep(3000);
    	athleteRankingPage.editBtn();
     	athleteRankingPage.deletecancel.click();
     	athleteRankingPage.editcancelBtn();
     	Assert.assertEquals(athleteRankingPage.rankNO2.getText(),"AJ Lias Mansor");
     	
    }

    @Test(priority=27)
  	public void alternateAthleteBioImageSelection() throws InterruptedException {
    	
      	athleteRankingPage.editBtn();
      	athleteRankingPage.bioAlternateImage.click();
      	athleteRankingPage.saveBtn();
      	Assert.assertTrue(athleteRankingPage.bioAlternateImage.isDisplayed());
      	
    }
     
    @Test(priority=28)
 	public void categoryEdit() throws InterruptedException {
    	
    	Thread.sleep(7000);
        athleteRankingPage.editBtn();
     	athleteRankingPage.editCategoryBtn();
     	athleteRankingPage.weightClassEdit();
     	Assert.assertTrue(athleteRankingPage.featherweight.isDisplayed());
     	athleteRankingPage.genderEdit();
     	Assert.assertTrue(athleteRankingPage.male.isDisplayed());
     	athleteRankingPage.styleEdit();
     	Assert.assertTrue(athleteRankingPage.mixedMartialArts.isDisplayed());
     	actions.verticalScrollToTop();
     	athleteRankingPage.save.click();
     	Assert.assertTrue(athleteRankingPage.changesSaved.isDisplayed());
     	
    }
    
    @AfterClass
	public void tearDown() {
		driver.quit();
	}
  
    
}

