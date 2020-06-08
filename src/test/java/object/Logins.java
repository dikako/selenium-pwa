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

	@FindBy(how = How.ID, id = "action-profile")
	WebElement displayName;

	@FindBy(how = How.ID, id = "action-download")
	WebElement download;

	@FindBy(how = How.ID, id = "button-login")
	WebElement goLogin;

	@FindBy(how = How.XPATH, xpath = "//button[contains(text(),'Sign In')]")
	WebElement popupButtonLogin;

	public Logins(WebDriver driver) {
		this.driver = driver;
	}
	
	public void validatePopupLoginButtonDisplay() {
		waitForVisible(driver, popupButtonLogin);
		Assert.assertTrue(popupButtonLogin.isDisplayed(), "Button is Not Displayed!");
	}

	public void popupButtonLogin() {
		waitForVisible(driver, popupButtonLogin);
		Actions actions = new Actions(driver);
		actions.moveToElement(popupButtonLogin);
		actions.click();
		actions.build().perform();
		System.out.println("Pop Up Button Login is Clicked!");
	}

	public void goLogin() {
		waitForVisible(driver, goLogin);
		Actions actions = new Actions(driver);
		actions.moveToElement(goLogin);
		actions.click();
		actions.build().perform();
		System.out.println("Button Direct To Login is Clicked!");
	}

	public void download() {
		waitForVisible(driver, download);
		Actions actions = new Actions(driver);
		actions.moveToElement(download);
		actions.click();
		actions.build().perform();
		System.out.println("Download is Clicked!");
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
		actions.build().perform();
		System.out.println("Password: " + password);
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
