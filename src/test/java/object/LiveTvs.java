package object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LiveTvs {
	WebDriver driver;

	@FindBy(how = How.CLASS_NAME, className = "col-3")
	WebElement listChanel;
	
	@FindBy(how = How.CLASS_NAME, className = "vjs-tech")
	WebElement formPlayer;
	
	@FindBy(how = How.CLASS_NAME, className = "fas")
	WebElement iconQualityVideo;
	
	@FindBy(how = How.CLASS_NAME, className = "live-chat-wrap")
	WebElement tabLiveChat;

	public LiveTvs(WebDriver driver) {
		this.driver = driver;
	}
	
	public void validateTabChatIsDisplayed(boolean display) {
		WebElement element = driver.findElement(By.className("live-chat-wrap"));
		boolean displayed = element.isDisplayed();
		Assert.assertEquals(displayed, display);
		System.out.println("Tab Chat is Displayed " + displayed);
	}
	
	public void validateKlikQualityVideo(String title) {
		//waitForVisible(driver, iconQualityVideo);
		Actions actions = new Actions(driver);
		actions.moveToElement(iconQualityVideo);
		actions.click();
		actions.build().perform();
		System.out.println("Icon Quality Video is Clicked!");
		List<WebElement> menuTitle = driver.findElements(By.className("vjs-menu-content"));
		String getMenuTitle = menuTitle.get(5).findElement(By.tagName("li")).getText();
		System.out.println(getMenuTitle);
		Assert.assertEquals(getMenuTitle.toLowerCase(), title.toLowerCase());
	}
	
	public void validateCountNavTabs(int size) {
		List<WebElement> element = driver.findElements(By.className("nav-item"));
		System.out.println(element.size());
		Assert.assertEquals(element.size(), size);
		System.out.println("Count Nav Tabs is " + element.size() + " is Match!");
//		for (int index = 0; index <= element.size(); index++) {
//			String txt = element.get(index).findElement(By.tagName("a")).getText();
//			System.out.println(txt);
//		}
	}
	
	public void validateNameNavTabsList(int index, String name) {
		List<WebElement> element = driver.findElements(By.className("nav-item"));
		String nameTabs = element.get(index).findElement(By.tagName("a")).getText();
		Assert.assertEquals(nameTabs, name);
		System.out.println("Nama Tabs is " + nameTabs + " is Match!");
	}
	
	public void validateEpgIsDisplayed(boolean isDisplay) {
		WebElement element = driver.findElement(By.className("program-item"));
		boolean epgDisplay = element.isDisplayed();
		Assert.assertEquals(epgDisplay, isDisplay);
		System.out.println("List EPG is Displayed!");
	}
	
	public void validateListEpgNotNull() {
		List<WebElement> element = driver.findElements(By.className("program-item"));
		//System.out.println(element.size());
		
		Assert.assertTrue(element.size() != 0);
		System.out.println("List EPG is Found");
		
//		for (int i = 0; i<=element.size(); i++) {
//			String txt = element.get(i).findElement(By.className("title")).getText();
//			System.out.println(txt);
//		}
	}
	
	public void validateShareInEpgActiveIsDisplayed() {
		List<WebElement> element = driver.findElements(By.className("right-side"));
		System.out.println(element.size());
	}

	public void validateCountChannel(int channel) {
		List<WebElement> element = driver.findElements(By.className("col-3"));
		
		Assert.assertEquals(element.size(), channel);
		System.out.println("Count: " + element.size());
		System.out.println("Channel is " + element.size() + " is Matching!");
//		for (int index = 0; index <= element.size(); index++) {
//			String text = element.get(index).findElement(By.tagName("button")).getText();
//			System.out.println(text);
//		}
	}

	public void validateChannelActived(String name, boolean status) {
		List<WebElement> element = driver.findElements(By.className("col-3"));
		
		String channelName = element.get(0).findElement(By.tagName("button")).getText();
		Assert.assertEquals(channelName, name);
		boolean channelActive = element.get(0).findElement(By.tagName("button")).getAttribute("class")
				.contains("selected");
		Assert.assertEquals(channelActive, status);
		System.out.println("Channel " + channelName + " is Actived status " + channelName);
	}

	public void validateListChannelName(String channelName, int index) {
		List<WebElement> element = driver.findElements(By.className("col-3"));

		String channel1 = element.get(index).findElement(By.tagName("button")).getText();
		Assert.assertEquals(channel1, channelName);
		System.out.println("Chanel Name " + channelName + " is Matching!");
	}
	
	public void validateKlikChannel(String channelName, int index) throws InterruptedException {
		List<WebElement> element = driver.findElements(By.className("col-3"));
		
		String channel1 = element.get(index).findElement(By.tagName("button")).getText();
		Assert.assertEquals(channel1, channelName);
		System.out.println("Chanel Name " + channelName + " is Matching!");
		Thread.sleep(5000);
		
		WebElement channel = element.get(index);
		channel.click();
		System.out.println("Button Channel " + channel1 + " is Clciked!");
		Thread.sleep(5000);
	}
	
	public void validateUrl(String urls) {
		String baseUrl = "https://rc-webm.rctiplus.com";
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, baseUrl + urls);
		System.out.println("Url " + url + " is Matching!");
	}
	
	public void validatePlayerFormIsDisplayed(boolean display) {
		waitForVisible(driver, formPlayer);
		Actions actions = new Actions(driver);
		actions.moveToElement(formPlayer);
		boolean player = formPlayer.isDisplayed();
		Assert.assertEquals(player, display);
		System.out.println("Player is Displayed is " + player);
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
