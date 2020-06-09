package wordings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Wording_EditProfile {
	WebDriver driver;
	
	@FindBy(how = How.ID, id = "invalid-feedback-top")
	WebElement invalidFeedback;
	
	public Wording_EditProfile(WebDriver driver) {
		this.driver = driver;
	}
	
	public void nicknameNull(String wording) {
		waitForVisible(driver, invalidFeedback);
		Actions actions = new Actions(driver);
		actions.moveToElement(invalidFeedback);
		String actualWording = invalidFeedback.getText().toLowerCase().replace(" ", "");
		Assert.assertEquals(actualWording, wording);
		actions.build().perform();
		System.out.println("Wording is Match! " + actualWording);
	}
	
	public void nicknameTaken(String wording) {
		waitForVisible(driver, invalidFeedback);
		Actions actions = new Actions(driver);
		actions.moveToElement(invalidFeedback);
		String actualWording = invalidFeedback.getText().toLowerCase().replace(" ", "");
		Assert.assertEquals(actualWording, wording.toLowerCase().replace(" ", ""));
		actions.build().perform();
		System.out.println("Wording is Macth!" + actualWording);
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
