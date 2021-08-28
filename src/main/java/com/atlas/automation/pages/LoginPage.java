package com.atlas.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atlas.automation.actions.WebdriverActions;
import com.atlas.automation.base.BaseClass;
import com.atlas.automation.base.TOTPGenerator;



	public class LoginPage extends BaseClass {
		
		WebdriverActions actions = new WebdriverActions();

		// Object repository :

		@FindBy(xpath = "//img[@alt='Sign in']")
		WebElement msSignInBtn;

		@FindBy(xpath = "//div[@class='jss21']/img[@class='jss18']")
		WebElement atlasLogo;

		@FindBy(id = "i0116")
		WebElement emailField;

		@FindBy(id = "idSIButton9")
		WebElement nextbtn;

		@FindBy(id = "i0118")
		WebElement passwordField;

		@FindBy(xpath = "//input[@value='Sign in']")
		WebElement signInBtn;

		@FindBy(id = "idTxtBx_SAOTCC_OTC")
		WebElement authCode;

		@FindBy(id = "idSubmit_SAOTCC_Continue")
		WebElement verfyBtn;

		@FindBy(xpath = "//input[@value='Yes']")
		WebElement yesBtn;

		// Initializing the objects
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}

		
	
		public boolean atlasImage() {
			return atlasLogo.isDisplayed();
		}

		
		public HomePage loginToApp(String emailID, String password) {
			actions.waitForElementToBeClickable(msSignInBtn);
			actions.waitForElementPresent(emailField);
			emailField.sendKeys(emailID);
			nextbtn.click();
			actions.waitForElementPresent(passwordField);
			passwordField.sendKeys(password);
			signInBtn.click();
			actions.waitForElementPresent(authCode);
			authCode.sendKeys(TOTPGenerator.getTwoFactorCode());
			verfyBtn.click();
			yesBtn.click();
			return new HomePage();
		}

	}


