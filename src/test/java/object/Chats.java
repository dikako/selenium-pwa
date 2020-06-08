package object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Chats {
	WebDriver driver;

	@FindBy(how = How.XPATH, xpath = "//button[contains(text(),'Live Chat')]")
	WebElement openLiveChat;

	@FindBy(how = How.ID, id = "chat-input")
	WebElement inputChat;

	@FindBy(how = How.CLASS_NAME, className = "username")
	WebElement usernameChat;

	@FindBys(value = { @FindBy(how = How.CLASS_NAME, className = "message") })
	WebElement messageChat;

	public Chats(WebDriver driver) {
		this.driver = driver;
	}

	public void openChat() {
		waitForVisible(driver, openLiveChat);
		Actions actions = new Actions(driver);
		actions.moveToElement(openLiveChat);
		actions.click();
		actions.build().perform();
		System.out.println("Button Link Open Chat is Clicked!");
	}

	public void inputChats(String text) {
		waitForVisible(driver, inputChat);
		Actions actions = new Actions(driver);
		actions.moveToElement(inputChat);
		actions.click();
		System.out.println("Input Chat is Clicked!");
		actions.sendKeys(text);
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();
		System.out.println("Chat is Inputed " + " [ " + text + " ] ");
	}

	public void buttonSendChat() {
		waitForVisible(driver, inputChat);
		Actions actions = new Actions(driver);
		actions.moveToElement(inputChat);
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();
	}
	
	public void validateMessage(String expected) {
		List<WebElement> elements = driver.findElements(By.className("message"));

		int size = elements.size() - 1;

		for (int i = size; i == size; i++) {
			//System.out.println("Last Message: " + elements.get(i).getText().toLowerCase().replace(" ", ""));
			Assert.assertEquals(elements.get(i).getText().toLowerCase().replace(" ", ""), expected);
			System.out.println("Message is Match!");
		}
	}

	public void validateUsername(String expected) {
		List<WebElement> elements = driver.findElements(By.className("username"));

		int size = elements.size() - 1;

		for (int i = size; i == size; i++) {
			//System.out.println("Last Username: " + elements.get(i).getText().toLowerCase().replace(" ", ""));
			Assert.assertEquals(elements.get(i).getText().toLowerCase().replace(" ", ""), expected);
			System.out.println("Username is Match!");
		}
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
