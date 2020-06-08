package wordings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Wording_Login {
	private WebDriver driver;
	
	@FindBy(how = How.ID, id = "invalid-username")
	WebElement invalidUsername;
	
	@FindBy(how = How.ID, id = "swal2-content")
	WebElement popupNotRegistered;
	
	@FindBy(how = How.ID, id = "invalid-password")
	WebElement invalidPassword;
	
	@FindBy(how = How.ID, id = "not-registered")
	WebElement popupButtonOk;
	
	

	public Wording_Login(WebDriver driver) {
		this.driver = driver;
	}
	
	public void popupOk() {
		waitForVisible(driver, popupButtonOk);
		Actions actions = new Actions(driver);
		actions.moveToElement(popupButtonOk);
		actions.click();
		actions.build().perform();
		System.out.println("Popup Button Ok Is Clicked!");
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
