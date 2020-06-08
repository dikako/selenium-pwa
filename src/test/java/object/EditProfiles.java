package object;

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

	@FindBy(how = How.XPATH, xpath = "//input[@id='form-field']")
	WebElement formField;

	@FindBy(how = How.ID, id = "fullname-input")
	WebElement fullnameInput;
	
	@FindBy(how = How.XPATH, xpath = "//a[contains(text(),'Account')]")
	WebElement accountMenu;
	
	@FindBy(how = How.ID, id = "action-profile")
	WebElement displayName;
	
	@FindBy(how = How.XPATH, xpath = "//p[contains(text(),'")
	WebElement alert;

	public EditProfiles(WebDriver driver) {
		this.driver = driver;
	}
	
	public void klikNickname() throws InterruptedException {
		Actions actions = new Actions(driver);
		waitForVisible(driver, nicknameInput);
		actions.moveToElement(nicknameInput);
		actions.click();
		System.out.println("Display Name is Clicked!");
		actions.build().perform();
	}
	
	public void inputNickname(String nickname) throws InterruptedException {
		Actions actions = new Actions(driver);
		waitForVisible(driver, formField);
		actions.moveToElement(formField);
		actions.click();
		actions.sendKeys(nickname);
		System.out.println("Nickname Entered: " + nickname);
		actions.build().perform();
	}

	public void inputFullname(String fullname) {
		waitForVisible(driver, fullnameInput);
		Actions actions = new Actions(driver);
		actions.moveToElement(fullnameInput);
		actions.click();
		waitForVisible(driver, formField);
		actions.moveToElement(formField);
		actions.click();
		actions.sendKeys(fullname);
		System.out.println("Fullname Entered: " + fullname);
		actions.build();
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
