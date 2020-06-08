package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuAccounts {
	WebDriver driver;
	
	@FindBy(how = How.ID, id = "action-mylist")
	WebElement mylist;
	
	public MenuAccounts(WebDriver driver) {
		this.driver = driver;
	}
	
	public void mylist() {
		waitForVisible(driver, mylist);
		Actions actions = new Actions(driver);
		actions.moveToElement(mylist);
		actions.click();
		System.out.println("Menu Mylist Is Clicked!");
		actions.build().perform();
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
