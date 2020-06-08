package object;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mailinators {
	WebDriver driver;

	@FindBy(how = How.ID, id = "addOverlay")
	WebElement inputEmail;

	public Mailinators(WebDriver driver) {
		this.driver = driver;
	}

	public void inputEmail(String email) {
		waitForVisible(driver, inputEmail);
		Actions actions = new Actions(driver);
		actions.moveToElement(inputEmail);
		actions.click();
		actions.sendKeys(email);
		actions.build().perform();
		System.out.println("Email enetred: " + email);
		actions.moveToElement(inputEmail);
		actions.click();
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();
		System.out.println("Go To Public Inbox");
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
