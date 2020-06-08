package object;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Registers {
	private WebDriver driver;

	@FindBy(how = How.ID, id = "email")
	WebElement formEmail;

	@FindBy(how = How.ID, id = "password")
	WebElement formPassword1;

	@FindBy(how = How.ID, id = "password2")
	WebElement formPassword2;

	@FindBy(how = How.ID, id = "button-next")
	WebElement buttonNext;

	@FindBy(how = How.ID, id = "fullname")
	WebElement formFullname;

	@FindBy(how = How.ID, id = "BirthDate")
	WebElement formBirthday;

	@FindBy(how = How.ID, id = "gender")
	WebElement formGender;

	@FindBy(how = How.LINK_TEXT, linkText = "Done")
	WebElement saveDatePicker;

	public Registers(WebDriver driver) throws IOException {
		this.driver = driver;
	}

	public void twoGender() {
		String[] valueDropdown = { "Select gender", "Male", "Female" };
		waitForVisible(driver, formGender);
		Actions actions = new Actions(driver);
		actions.moveToElement(formGender);
		Select dropdown = new Select(formGender);
		List<WebElement> listDropdown = dropdown.getOptions();
		for (WebElement we : listDropdown) {
			for (int i = 0; i < valueDropdown.length; i++) {
				if (we.getText().equals(valueDropdown[i])) {
					System.out.println("Dropdown is Matches!");
				}
			}
		}
		actions.build().perform();
	}

	public void maxFullname(String expected) {
		waitForVisible(driver, formFullname);
		Actions actions = new Actions(driver);
		actions.moveToElement(formFullname);
		actions.click();
		String maxlengthValue = formFullname.getAttribute("maxlength");
		Assert.assertEquals(maxlengthValue, expected);
		System.out.println("Max Length Actual: " + maxlengthValue + " Expected: " + expected + " Is Match!");
		actions.click();
		actions.build().perform();
	}

	public void inputEmail(String email) {
		clearFormEmail();
		waitForVisible(driver, formEmail);
		Actions actions = new Actions(driver);
		actions.moveToElement(formEmail);
		actions.click();
		actions.sendKeys(email);
		actions.build().perform();
		System.out.println("Email Entered: " + email);
	}

	public void inputPassword(String password1) {
		clearPassword();
		waitForVisible(driver, formPassword1);
		Actions actions = new Actions(driver);
		actions.moveToElement(formPassword1);
		actions.click();
		actions.sendKeys(password1);
		actions.build().perform();
		System.out.println("Password Entered: " + password1);
	}

	public void inputRePassword(String password2) {
		clearRePassword();
		waitForVisible(driver, formPassword2);
		Actions actions = new Actions(driver);
		actions.moveToElement(formPassword2);
		actions.click();
		actions.sendKeys(password2);
		actions.build().perform();
		System.out.println("Password Entered: " + password2);
	}

	public void button() {
		waitForVisible(driver, buttonNext);
		Actions actions = new Actions(driver);
		actions.moveToElement(buttonNext);
		actions.click();
		actions.build().perform();
		System.out.println("Button Is Clicked");
	}

	public void inputFullname(String fullname) {
		waitForVisible(driver, formFullname);
		Actions actions = new Actions(driver);
		actions.moveToElement(formFullname);
		actions.click();
		actions.sendKeys(fullname);
		actions.build().perform();
		System.out.println("Fullname Entered: " + fullname);
	}

	public void inputBirthday() {
		waitForVisible(driver, formBirthday);
		Actions actions = new Actions(driver);
		actions.moveToElement(formBirthday);
		actions.click();
	}

	public void inputGender() {
		waitForVisible(driver, formGender);
		Actions actions = new Actions(driver);
		actions.moveToElement(formGender);
		actions.click();
		actions.build().perform();
	}

	private void waitForVisible(WebDriver driver, WebElement element) {
		try {
			Thread.sleep(1000);
			System.out.println("Waiting for element visibility");
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clearFormEmail() {
		By emails = By.id("email");
		driver.findElement(emails).click();
		driver.findElement(emails).clear();
	}

	public void clearPassword() {
		By passwords = By.id("password");
		driver.findElement(passwords).click();
		driver.findElement(passwords).clear();
	}

	public void clearRePassword() {
		By repasswords = By.id("password2");
		driver.findElement(repasswords).click();
		driver.findElement(repasswords).clear();
	}

	public void clearFormPhone() {
		By phones = By.id("phone_number");
		driver.findElement(phones).click();
		driver.findElement(phones).clear();
	}

	public String dateTime(String format) {
		DateTimeFormatter formatDate = DateTimeFormatter.ofPattern(format);
		LocalDateTime currentDate = LocalDateTime.now();
		return (formatDate.format(currentDate));
	}
}
