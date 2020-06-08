package wordings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Wording_Register {
	WebDriver driver;

	@FindBy(how = How.ID, id = "invalid-email")
	WebElement invalidEmail;

	@FindBy(how = How.ID, id = "invalid-phone-number")
	WebElement invalidPhone;

	@FindBy(how = How.ID, id = "invalid-password-num-chars")
	WebElement invalidPasswordNumChars;

	@FindBy(how = How.ID, id = "invalid-password-not-match")
	WebElement invalidPasswordNotMatch;

	public Wording_Register(WebDriver driver) {
		this.driver = driver;
	}

	public void invalidPasswordNotMatch(String wording) {
		waitForVisible(driver, invalidPasswordNotMatch);
		Actions actions = new Actions(driver);
		actions.moveToElement(invalidPasswordNotMatch);
		String actualAlert = invalidPasswordNotMatch.getText().toLowerCase().replace(" ", "").replace(",", "");
		String expected = wording.toLowerCase().replace(" ", "").replace(",", "");
		Assert.assertEquals(actualAlert, expected);
		System.out.println("Actual Result " + actualAlert + " & Expected Result " + expected + " Is Macth!");
		actions.build().perform();
	}

	public void invalidPasswordNumChars(String wording) {
		waitForVisible(driver, invalidPasswordNumChars);
		Actions actions = new Actions(driver);
		actions.moveToElement(invalidPasswordNumChars);
		String actualAlert = invalidPasswordNumChars.getText().toLowerCase().replace(" ", "").replace(",", "");
		String expected = wording.toLowerCase().replace(" ", "").replace(",", "");
		Assert.assertEquals(actualAlert, expected);
		System.out.println("Actual Result " + actualAlert + " & Expected Result " + expected + " Is Macth!");
		actions.build().perform();
	}

	public void invalidPhone(String wording) {
		waitForVisible(driver, invalidPhone);
		Actions actions = new Actions(driver);
		actions.moveToElement(invalidPhone);
		String actualAlert = invalidPhone.getText().toLowerCase().replace(" ", "").replace(",", "");
		String expected = wording.toLowerCase().replace(" ", "").replace(",", "");
		Assert.assertEquals(actualAlert, expected);
		System.out.println("Actual Result " + actualAlert + " & Expected Result " + expected + " Is Macth!");
		actions.build().perform();
	}

	public void invalidEmail(String wording) {
		waitForVisible(driver, invalidEmail);
		Actions actions = new Actions(driver);
		actions.moveToElement(invalidEmail);
		String actualAlert = invalidEmail.getText().toLowerCase().replace(" ", "").replace(",", "");
		String expected = wording.toLowerCase().replace(" ", "").replace(",", "");
		Assert.assertEquals(actualAlert, expected);
		System.out.println("Actual Result " + actualAlert + " & Expected Result " + expected + " Is Macth!");
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

}
