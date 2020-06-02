package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Logins {
	private WebDriver driver; 
	
	@FindBy(how = How.ID, id = "email")
	WebElement formUsername;

	@FindBy(how = How.ID, id = "password")
	WebElement formPassword;

	@FindBy(how = How.ID, id = "submit-login")
	WebElement btnLogin;

	@FindBy(how = How.ID, id = "invalid-username")
	WebElement invalidUsername;

	@FindBy(how = How.ID, id = "swal2-content")
	WebElement popupNotRegistered;

	@FindBy(how = How.ID, id = "invalid-password")
	WebElement invalidPassword;

	@FindBy(how = How.ID, id = "not-registered")
	WebElement popupButtonOk;

	@FindBy(how = How.ID, id = "action-profile")
	WebElement displayName;

	@FindBy(how = How.ID, id = "action-account")
	WebElement account;

	@FindBy(how = How.ID, id = "action-history")
	WebElement history;

	@FindBy(how = How.ID, id = "action-download")
	WebElement download;

	@FindBy(how = How.ID, id = "action-qrcode")
	WebElement qrcode;

	@FindBy(how = How.ID, id = "action-mylist")
	WebElement mylist;

	@FindBy(how = How.ID, id = "action-continue-watching")
	WebElement continueWatching;

	@FindBy(how = How.ID, id = "action-tnc")
	WebElement tnc;

	@FindBy(how = How.ID, id = "action-privacy-policy")
	WebElement privacyPolicy;

	@FindBy(how = How.ID, id = "action-contact-us")
	WebElement contactUs;

	@FindBy(how = How.ID, id = "action-faq")
	WebElement faq;

	@FindBy(how = How.ID, id = "button-login")
	WebElement goLogin;

	@FindBy(how = How.XPATH, xpath = "//button[contains(text(),'Sign In')]")
	WebElement popupLogin;

	public Logins(WebDriver driver) {
		this.driver = driver;
	}

	public void popupLogin() {
		waitForVisible(driver, popupLogin);
		Actions actions = new Actions(driver);
		actions.moveToElement(popupLogin);
		actions.click();
		actions.build().perform();
		System.out.println("Pop Up Button Logi is Clicked!");
	}

	public void goLogin() {
		waitForVisible(driver, goLogin);
		Actions actions = new Actions(driver);
		actions.moveToElement(goLogin);
		actions.click();
		actions.build().perform();
		System.out.println("Button Direct To Login is Clicked!");
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

	public void tnc(boolean click) {
			waitForVisible(driver, tnc);
			Actions actions = new Actions(driver);
			actions.moveToElement(tnc);
			actions.click();
			actions.build().perform();
			System.out.println("Term & Condition is Clicked!");
	}

	public void continueWatching() {
			waitForVisible(driver, continueWatching);
			Actions actions = new Actions(driver);
			actions.moveToElement(continueWatching);
			actions.click();
			actions.build().perform();
			System.out.println("Continue Watchng is Clicked!");
	}

	public void mylist() {
			waitForVisible(driver, mylist);
			Actions actions = new Actions(driver);
			actions.moveToElement(mylist);
			actions.click();
			actions.build().perform();
			System.out.println("My List is Clicked!");
	}

	public void download() {
			waitForVisible(driver, download);
			Actions actions = new Actions(driver);
			actions.moveToElement(download);
			actions.click();
			actions.build().perform();
			System.out.println("Download is Clicked!");
	}

	public void qrcode() {
			waitForVisible(driver, qrcode);
			Actions actions = new Actions(driver);
			actions.moveToElement(qrcode);
			actions.click();
			actions.build().perform();
			System.out.println("QR Code is Clicked!");
	}

	public void history() {
			waitForVisible(driver, history);
			Actions actions = new Actions(driver);
			actions.moveToElement(history);
			actions.click();
			actions.build().perform();
			System.out.println("History is Clicked!");
	}

	public void account() {
			waitForVisible(driver, account);
			Actions actions = new Actions(driver);
			actions.moveToElement(account);
			actions.click();
			actions.build().perform();
			System.out.println("Menu Account is Clicked!");
	}

	public void displayName(String name) {
		waitForVisible(driver, displayName);
		Actions actions = new Actions(driver);
		actions.moveToElement(displayName);
		String actualName = displayName.getText().toLowerCase().replace(" ", "").replace(",", "");
		String expected = name.toLowerCase().replace(" ", "").replace(",", "");
		Assert.assertEquals(actualName, expected);
		actions.build().perform();
		System.out.println("Actual Result " + actualName + " & Expected Result " + expected + " Is Macth!");
	}

	public void invalidPhone(String wording) {
		waitForVisible(driver, invalidUsername);
		Actions actions = new Actions(driver);
		actions.moveToElement(invalidUsername);
		String actualAlert = invalidUsername.getText().toLowerCase().replace(" ", "").replace(",", "");
		String expected = wording.toLowerCase().replace(" ", "").replace(",", "");
		Assert.assertEquals(actualAlert, expected);
		actions.build().perform();
		System.out.println("Actual Result " + actualAlert + " & Expected Result " + expected + " Is Macth!");
	}

	public void popupOk() {
		waitForVisible(driver, popupButtonOk);
		Actions actions = new Actions(driver);
		actions.moveToElement(popupButtonOk);
		actions.click();
		actions.build().perform();
		System.out.println("Popup Button Ok Is Clicked!");
	}

	public void notRegistered(String wording) {
		waitForVisible(driver, popupNotRegistered);
		Actions actions = new Actions(driver);
		actions.moveToElement(popupNotRegistered);
		String actualAlert = popupNotRegistered.getText().toLowerCase().replace(" ", "").replace(",", "");
		String expected = wording.toLowerCase().replace(" ", "").replace(",", "");
		Assert.assertEquals(actualAlert, expected);
		actions.build().perform();
		System.out.println("Actual Result " + actualAlert + " & Expected Result " + expected + " Is Macth!");
	}

	public void invalidPassword(String wording) {
		waitForVisible(driver, invalidPassword);
		Actions actions = new Actions(driver);
		actions.moveToElement(invalidPassword);
		String actualAlert = invalidPassword.getText().toLowerCase().replace(" ", "").replace(",", "");
		String expected = wording.toLowerCase().replace(" ", "").replace(",", "");
		Assert.assertEquals(actualAlert, expected);
		actions.build().perform();
		System.out.println("Actual Result " + actualAlert + " & Expected Result " + expected + " Is Macth!");
	}

	public void invalidEmail(String wording) {
		waitForVisible(driver, invalidUsername);
		Actions actions = new Actions(driver);
		actions.moveToElement(invalidUsername);
		String actualAlert = invalidUsername.getText().toLowerCase().replace(" ", "").replace(",", "");
		String expected = wording.toLowerCase().replace(" ", "").replace(",", "");
		Assert.assertEquals(actualAlert, expected);
		actions.build().perform();
		System.out.println("Actual Result " + actualAlert + " & Expected Result " + expected + " Is Macth!");
	}

	public void inputUsername(String username) {
		waitForVisible(driver, formUsername);
		Actions actions = new Actions(driver);
		actions.moveToElement(formUsername);
		actions.click();
		clearFormUsername();
		actions.sendKeys(username);
		actions.build().perform();
		System.out.println("Username: " + username);
	}

	public void inputPassword(String password) {
		waitForVisible(driver, formPassword);
		Actions actions = new Actions(driver);
		actions.moveToElement(formPassword);
		clearFormPassword();
		actions.click();
		actions.sendKeys(password);
		System.out.println("Password: " + password);
		actions.build().perform();
	}

	public void button() {
			waitForVisible(driver, btnLogin);
			Actions actions = new Actions(driver);
			actions.moveToElement(btnLogin);
			actions.click();
			actions.build().perform();
			System.out.println("Button Login is Clicked!");
	}

	public void clearFormUsername() {
		By usernames = By.id("email");
		driver.findElement(usernames).click();
		driver.findElement(usernames).clear();
	}

	public void clearFormPassword() {
		By passwords = By.id("password");
		driver.findElement(passwords).click();
		driver.findElement(passwords).clear();
	}

	private void waitForVisible(WebDriver driver, WebElement element) {
		try {
			Thread.sleep(5000);
			System.out.println("Waiting for element visibility");
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
