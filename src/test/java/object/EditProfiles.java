package object;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditProfiles {
	private WebDriver driver;

	@FindBy(how = How.ID, id = "nickname-input")
	WebElement nicknameInput;

	@FindBy(how = How.ID, id = "form-field")
	WebElement formField;

	@FindBy(how = How.ID, id = "fullname-input")
	WebElement fullnameInput;
	
	@FindBy(how = How.ID, id = "action-profile")
	WebElement displayName;
	
	@FindBy(how = How.XPATH, xpath = "//p[contains(text(),'")
	WebElement alert;

	public EditProfiles(WebDriver driver) {
		this.driver = driver;
	}
	
	public void klikDisplayName() throws InterruptedException {
		waitForVisible(driver, displayName);
		Actions actions = new Actions(driver);
		actions.moveToElement(displayName);
		actions.click();
		actions.build().perform();
		System.out.println("Display Name is Clicked!");
	}
	
	public void klikNickname() throws InterruptedException {
		waitForVisible(driver, nicknameInput);
		Actions actions = new Actions(driver);
		waitForVisible(driver, nicknameInput);
		actions.moveToElement(nicknameInput);
		actions.click();
		actions.build().perform();
		System.out.println("Nickname is Clicked!");
	}
	
	public void inputNickname(String nickname) throws InterruptedException {
		clear();
		waitForVisible(driver, formField);
		Actions actions = new Actions(driver);
		waitForVisible(driver, formField);
		actions.moveToElement(formField);
		actions.click();
		actions.sendKeys(nickname);
		actions.build().perform();
		actions.sendKeys(Keys.ENTER);
		System.out.println("Nickname Entered: " + nickname);
	}

	public void inputFullname(String fullname) {
		clear();
		waitForVisible(driver, fullnameInput);
		Actions actions = new Actions(driver);
		actions.moveToElement(fullnameInput);
		actions.click();
		waitForVisible(driver, formField);
		actions.moveToElement(formField);
		actions.click();
		actions.sendKeys(fullname);
		actions.build().perform();
		System.out.println("Fullname Entered: " + fullname);
	}
	
	public void clear() {
		waitForVisible(driver, formField);
		Actions actions = new Actions(driver);
		actions.moveToElement(formField);
		actions.click();
		formField.clear();
		actions.build().perform();
		System.out.println("Form Nickname is Cleared!");
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
