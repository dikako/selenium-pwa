package object;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Exclusives {
	WebDriver driver;

	@FindBy(how = How.CLASS_NAME, className = "program-thumbnail")
	WebElement thumbnailProgram;

	@FindBy(how = How.CLASS_NAME, className = "program-share-button")
	WebElement shareButton;

	@FindBy(how = How.CLASS_NAME, className = "sheet-title")
	WebElement titleListShare;
	
	@FindBy(how = How.ID, id = "close-action-sheet")
	WebElement closeButtonListShare;

	public Exclusives(WebDriver driver) {
		this.driver = driver;
	}
	
	public void klikButtonCloseListShare() {
		waitForVisible(driver, closeButtonListShare);
		Actions actions = new Actions(driver);
		actions.moveToElement(closeButtonListShare);
		actions.click();
		actions.build().perform();
		System.out.println("Button Close List Share Is Clicked!");
	}
	
	public void validateCloseListShare(boolean choose) {
		waitForVisible(driver, titleListShare);
		Actions actions = new Actions(driver);
		actions.moveToElement(titleListShare);
		boolean listShareTitle = titleListShare.isDisplayed();
		Assert.assertEquals(listShareTitle, choose);
		if (choose == true) {
			System.out.println("List Share is Displayed");
		} else {
			System.out.println("List Share Not Displayed!");
		}
		actions.build().perform();
	}

	public void klikShareBy(int index, String urls) throws InterruptedException {
		List<WebElement> element = driver.findElements(By.className("sheet-action-button-share"));
		String shareBy = element.get(index).findElement(By.tagName("div")).getAttribute("aria-label").toString();
		element.get(index).click();
		System.out.println("Share By " + shareBy + " is Clicked!");

		String parentWindow = driver.getWindowHandle();

		Set<String> allWindows = driver.getWindowHandles();
		for (String curWindow : allWindows) {
			driver.switchTo().window(curWindow);
		}
		boolean url = driver.getCurrentUrl().contains(urls);
		Assert.assertEquals(url, true);
		System.out.println("Share with " + urls + " is Direct to " + urls);
		driver.close();

		driver.switchTo().window(parentWindow);
	}

	public void validateShareBySosmedIsDisplayed(String a, String b, String c, String d, String e) {
		List<WebElement> element = driver.findElements(By.className("sheet-action-button-share"));
		String a1 = element.get(0).findElement(By.tagName("div")).getAttribute("aria-label").toString();
		Assert.assertEquals(a1, a);
		System.out.println("Actual " + a1 + " Excpected " + a);

		String a2 = element.get(1).findElement(By.tagName("div")).getAttribute("aria-label").toString();
		Assert.assertEquals(a2, b);
		System.out.println("Actual " + a2 + " Excpected " + b);

		String a3 = element.get(2).findElement(By.tagName("div")).getAttribute("aria-label").toString();
		Assert.assertEquals(a3, c);
		System.out.println("Actual " + a3 + " Excpected " + c);

		String a4 = element.get(3).findElement(By.tagName("div")).getAttribute("aria-label").toString();
		Assert.assertEquals(a4, d);
		System.out.println("Actual " + a4 + " Excpected " + d);

		String a5 = element.get(4).findElement(By.tagName("div")).getAttribute("aria-label").toString();
		Assert.assertEquals(a5, e);
		System.out.println("Actual " + a5 + " Excpected " + e);

//		for (int index = 0; index <= element.size(); index++) {
//			String print = element.get(index).findElement(By.tagName("div")).getAttribute("aria-label").toString();
//			System.out.println(print);
//		}
	}

	public void listShareButton(int countFix) {
		List<WebElement> element = driver.findElements(By.className("sheet-action-button-share"));
		int size = element.size();
		Assert.assertEquals(size, countFix);
		System.out.println("Count is Match: " + size);
	}

	public void klikShareButton() {
		waitForVisible(driver, shareButton);
		Actions actions = new Actions(driver);
		actions.moveToElement(shareButton);
		actions.click();
		actions.build().perform();
		System.out.println("Button Share is Cliked!");
	}

	public void programTitleIsDisplayed() {
		waitForVisible(driver, thumbnailProgram);
		Actions actions = new Actions(driver);
		actions.moveToElement(thumbnailProgram);
		Assert.assertTrue(thumbnailProgram.isDisplayed());
		actions.build().perform();
		System.out.println("Thumbnail Program is Displayed!");
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
