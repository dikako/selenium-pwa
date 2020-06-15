package object;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

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

	@FindBy(how = How.ID, id = "save-edit")
	WebElement buttonSave;

	@FindBy(how = How.ID, id = "interests-input")
	WebElement interestInput;
	
	@FindBy(how = How.XPATH, xpath = "//button[@class='btn-next btn btn-secondary']")
	WebElement saveInterest;

	public EditProfiles(WebDriver driver) {
		this.driver = driver;
	}
	
	public void saveInterest() {
		waitForVisible(driver, saveInterest);
		Actions actions = new Actions(driver);
		actions.moveToElement(saveInterest);
		actions.click();
		actions.build().perform();
		System.out.println("Button Save Interest is Clicked!");
	}

	public void inputInterest(String i) {
		WebElement element = driver.findElement(By.xpath("//button[contains(text(),'" + i + "')]"));
		waitForVisible(driver, element);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.click();
		actions.build().perform();
		waitForVisible(driver, element);
		actions.moveToElement(element);
		String interestName = element.getText();
		System.out.println("Interest Choose: " + interestName);
	}

	public void klikInterest() {
		waitForVisible(driver, interestInput);
		Actions actions = new Actions(driver);
		actions.moveToElement(interestInput);
		actions.click();
		actions.build().perform();
		System.out.println("Interest is Clicked!");
	}

	public void inputFullnameNull() {
		waitForVisible(driver, formField);
		Actions actions = new Actions(driver);
		actions.moveToElement(formField);
		clear();
		actions.click();
		actions.build().perform();
		System.out.println("Fullname Entered Null");
	}

	public void disabledButton() {
		waitForVisible(driver, buttonSave);
		Actions actions = new Actions(driver);
		actions.moveToElement(buttonSave);
		Assert.assertFalse(buttonSave.isEnabled());
		System.out.println("Button is Disabled!");
	}

	public void save() {
		waitForVisible(driver, buttonSave);
		Actions actions = new Actions(driver);
		actions.moveToElement(buttonSave);
		actions.click();
		actions.build().perform();
		System.out.println("Button Save is Clicked!");
	}

	public void validateFullname(String fullname) {
		waitForVisible(driver, fullnameInput);
		Actions actions = new Actions(driver);
		actions.moveToElement(fullnameInput);
		String actual = fullnameInput.getAttribute("value");
		Assert.assertEquals(actual, fullname);
		System.out.println("Fullname Change: " + actual);
	}

	public void inputFullname(String fullname) {
		waitForVisible(driver, formField);
		Actions actions = new Actions(driver);
		actions.moveToElement(formField);
		clear();
		actions.click();
		actions.sendKeys(fullname);
		actions.build().perform();
		System.out.println("Fullname Entered: " + fullname);
	}

	public void klikFullname() {
		waitForVisible(driver, fullnameInput);
		Actions actions = new Actions(driver);
		actions.moveToElement(fullnameInput);
		actions.click();
		actions.build().perform();
		System.out.println("Fullname is Clicked!");
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
		waitForVisible(driver, formField);
		Actions actions = new Actions(driver);
		waitForVisible(driver, formField);
		actions.moveToElement(formField);
		clear();
		actions.click();
		actions.sendKeys(nickname, Keys.ENTER);
		actions.build().perform();
		System.out.println("Nickname Entered: " + nickname);
	}

	public void inputNicknameNull() throws InterruptedException {
		waitForVisible(driver, formField);
		Actions actions = new Actions(driver);
		waitForVisible(driver, formField);
		actions.moveToElement(formField);
		clear();
		actions.click();
		actions.build().perform();
		System.out.println("Input Nickname Null");
	}

	public void clear() {
		formField.clear();
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
