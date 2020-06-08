package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Menus {
	WebDriver driver;

	@FindBy(how = How.ID, id = "action-home")
	WebElement home;

	@FindBy(how = How.ID, id = "action-live-event")
	WebElement liveEvent;

	@FindBy(how = How.ID, id = "action-live-tv")
	WebElement liveTv;

	@FindBy(how = How.ID, id = "action-library")
	WebElement library;

	@FindBy(how = How.ID, id = "action-account")
	WebElement account;

	@FindBy(how = How.ID, id = "action-exclusive")
	WebElement exclusive;

	@FindBy(how = How.ID, id = "action-radio")
	WebElement radio;
	
	@FindBy(how = How.ID, id = "action-continue-watching")
	WebElement continueWatching;
	
	@FindBy(how = How.ID, id = "action-history")
	WebElement history;
	
	@FindBy(how = How.ID, id = "action-mylist")
	WebElement mylist;
	
	@FindBy(how = How.ID, id = "action-qrcode")
	WebElement qrcode;
	
	@FindBy(how = How.ID, id = "action-tnc")
	WebElement tnc;

	@FindBy(how = How.ID, id = "action-privacy-policy")
	WebElement privacyPolicy;

	@FindBy(how = How.ID, id = "action-contact-us")
	WebElement contactUs;

	@FindBy(how = How.ID, id = "action-faq")
	WebElement faq;

	public Menus(WebDriver driver) {
		this.driver = driver;
	}
	
	public void faq() {
		waitForVisible(driver, faq);
		Actions actions = new Actions(driver);
		actions.moveToElement(faq);
		actions.click();
		actions.build().perform();
		System.out.println("FAQ is Clicked!");
	}

	public void contactUs() {
		waitForVisible(driver, contactUs);
		Actions actions = new Actions(driver);
		actions.moveToElement(contactUs);
		actions.click();
		actions.build().perform();
		System.out.println("Contact Us is Clicked!");
	}

	public void privacyPolicy() {
		waitForVisible(driver, privacyPolicy);
		Actions actions = new Actions(driver);
		actions.moveToElement(privacyPolicy);
		actions.click();
		actions.build().perform();
		System.out.println("Privacy Policy is Clicked!");
	}

	public void tnc() {
		waitForVisible(driver, tnc);
		Actions actions = new Actions(driver);
		actions.moveToElement(tnc);
		actions.click();
		actions.build().perform();
		System.out.println("Term & Condition is Clicked!");
	}

	
	public void qrcode() {
		waitForVisible(driver, qrcode);
		Actions actions = new Actions(driver);
		actions.moveToElement(qrcode);
		actions.click();
		actions.build().perform();
		System.out.println("QR Code is Clicked!");
	}
	
	public void mylist() {
		waitForVisible(driver, mylist);
		Actions actions = new Actions(driver);
		actions.moveToElement(mylist);
		actions.click();
		actions.build().perform();
		System.out.println("My List is Clicked!");
	}

	
	public void history() {
		waitForVisible(driver, history);
		Actions actions = new Actions(driver);
		actions.moveToElement(history);
		actions.click();
		actions.build().perform();
		System.out.println("History is Clicked!");
	}
	
	public void continueWatching() {
		waitForVisible(driver, continueWatching);
		Actions actions = new Actions(driver);
		actions.moveToElement(continueWatching);
		actions.click();
		actions.build().perform();
		System.out.println("Continue Watchng is Clicked!");
	}


	public void exclusive() {
		waitForVisible(driver, exclusive);
		Actions actions = new Actions(driver);
		actions.moveToElement(exclusive);
		actions.click();
		System.out.println("Home is Cliked!");
		actions.build().perform();
	}

	public void radio() {
		waitForVisible(driver, radio);
		Actions actions = new Actions(driver);
		actions.moveToElement(radio);
		actions.click();
		System.out.println("Home is Cliked!");
		actions.build().perform();
	}

	public void home() {
		waitForVisible(driver, home);
		Actions actions = new Actions(driver);
		actions.moveToElement(home);
		actions.click();
		System.out.println("Home is Cliked!");
		actions.build().perform();
	}

	public void liveEvent() {
		waitForVisible(driver, liveEvent);
		Actions actions = new Actions(driver);
		actions.moveToElement(liveEvent);
		actions.click();
		System.out.println("Live Event is Cliked!");
		actions.build().perform();
	}

	public void liveTv() {
		waitForVisible(driver, liveTv);
		Actions actions = new Actions(driver);
		actions.moveToElement(liveTv);
		actions.click();
		System.out.println("Live Tv is Cliked!");
		actions.build().perform();
	}

	public void library() {
		waitForVisible(driver, library);
		Actions actions = new Actions(driver);
		actions.moveToElement(library);
		actions.click();
		System.out.println("Library is Cliked!");
		actions.build().perform();
	}

	public void account() {
		waitForVisible(driver, account);
		Actions actions = new Actions(driver);
		actions.moveToElement(account);
		actions.click();
		System.out.println("Menu Account is Clicked!");
		actions.build().perform();
	}

	private void waitForVisible(WebDriver driver, WebElement element) {
		try {
			Thread.sleep(2000);
			System.out.println("Waiting for element visibility");
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
