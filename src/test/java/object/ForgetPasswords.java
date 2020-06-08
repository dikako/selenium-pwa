package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ForgetPasswords {
	WebDriver driver;
	
	@FindBy(how = How.ID, id = "forgot-password-link")
	WebElement forgetPasswordLink;
	
	@FindBy(how = How.ID, id = "input-email-phone")
	WebElement inputForgetPassword;
	
	@FindBy(how = How.ID, id = "button-next")
	WebElement buttonNext;
	
	@FindBy(how = How.ID, id = "invalid-feedback")
	WebElement alertWording;
	
	public ForgetPasswords(WebDriver driver) {
		this.driver = driver;
	}
	
	public void forgotPasswordLink() {
		waitForVisible(driver, forgetPasswordLink);
		Actions actions = new Actions(driver);
		actions.moveToElement(forgetPasswordLink);
		actions.click();
		actions.build().perform();
		System.out.println("Linke Text Forget Password is Clicked!");
	}
	
	public void inputUsernameForgetPassword(String username) {
		waitForVisible(driver, inputForgetPassword);
		Actions actions = new Actions(driver);
		actions.moveToElement(inputForgetPassword);
		actions.click();
		actions.sendKeys(username);
		actions.build().perform();
		System.out.println("Username Forget Password entered: " + username);
	}
	
	public void buttonForgetPassword() {
		waitForVisible(driver, buttonNext);
		Actions actions = new Actions(driver);
		actions.moveToElement(buttonNext);
		actions.click();
		actions.build().perform();
		System.out.println("Button Forget Password is Clciked!");
	}
	
	public void alertWording(String wording) {
		waitForVisible(driver, alertWording);
		Actions actions = new Actions(driver);
		actions.moveToElement(alertWording);
		String actualWording = alertWording.getText().replace(" ", "").toLowerCase();
		Assert.assertEquals(actualWording, wording.replace(" ", "").toLowerCase());
		actions.build().perform();
		System.out.println("Wording is match!");
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
