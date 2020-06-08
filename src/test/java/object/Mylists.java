package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Mylists {
	WebDriver driver;

	@FindBy(how = How.CLASS_NAME, className = "col-4")
	WebElement col4;

	@FindBy(how = How.XPATH, xpath = "//h3[contains(text(),'My List')]")
	WebElement addMylist;

	@FindBy(how = How.CLASS_NAME, className = "content-title")
	WebElement contentTitle;

	@FindBy(how = How.ID, id = "action-account")
	WebElement account;

	@FindBy(how = How.ID, id = "action-mylist")
	WebElement mylist;

	@FindBy(how = How.ID, id = "action-library")
	WebElement library;

	@FindBy(how = How.ID, id = "email")
	WebElement formUsername;

	@FindBy(how = How.ID, id = "password")
	WebElement formPassword;

	@FindBy(how = How.ID, id = "submit-login")
	WebElement btnLogin;

	@FindBy(how = How.ID, id = "button-login")
	WebElement goLogin;

	@FindBy(how = How.ID, id = "swal2-content")
	WebElement descPopupLoginRegister;

	@FindBy(how = How.XPATH, xpath = "//button[contains(text(),'Login')]")
	WebElement popupLoginButton;

	@FindBy(how = How.XPATH, xpath = "//button[contains(text(),'Register')]")
	WebElement popupRegisterButton;

	public Mylists(WebDriver driver) {
		this.driver = driver;
	}

	public void popupRegisterClick() {
		waitForVisible(driver, popupRegisterButton);
		Actions actions = new Actions(driver);
		actions.moveToElement(popupRegisterButton);
		actions.click();
		actions.build().perform();
		System.out.println("Pop Up Button Register is Clciked!");
	}

	public void popupLoginClick() {
		waitForVisible(driver, popupLoginButton);
		Actions actions = new Actions(driver);
		actions.moveToElement(popupLoginButton);
		actions.click();
		actions.build().perform();
		System.out.println("Pop Up Button Login is Clicked!");
	}

	public void popupLoginRegisterDesc(String desc) {
		waitForVisible(driver, descPopupLoginRegister);
		Actions actions = new Actions(driver);
		actions.moveToElement(descPopupLoginRegister);
		String actualDesc = descPopupLoginRegister.getText();
		Assert.assertEquals(actualDesc, desc);
		actions.build().perform();
		System.out.println("Desc is match!");
	}

	public void validateMylistAdded() {
		waitForVisible(driver, addMylist);
		Actions actions = new Actions(driver);
		actions.moveToElement(contentTitle);
		String programTitle = contentTitle.getText().toLowerCase();
		actions.moveToElement(addMylist);
		actions.click();
		actions.build().perform();
		System.out.println("Program " + "[ " + programTitle + " ]" + " Add To Mylist");

		waitForVisible(driver, account);
		actions.moveToElement(account);
		actions.click();
		actions.build().perform();
		System.out.println("Menu Account is Clicked!");

		waitForVisible(driver, mylist);
		actions.moveToElement(mylist);
		actions.click();
		actions.build().perform();
		System.out.println("Mylist is Clicked on Menu Account");

		waitForVisible(driver, col4);
		actions.moveToElement(col4);
		String programTitleAdedMylist = col4.getText().replace("0 video", "").replace(" ", "").replaceAll("\n", "")
				.toLowerCase();
		Assert.assertEquals(programTitleAdedMylist, programTitle);

		waitForVisible(driver, col4);
		actions.moveToElement(col4);
		actions.click();
		actions.build().perform();
		System.out.println("My List " + "[ " + programTitle + " ]" + " Aded is Clicked!");

		waitForVisible(driver, addMylist);
		actions.moveToElement(addMylist);
		actions.click();
		actions.build().perform();
		System.out.println("Klik Un My List");

		waitForVisible(driver, account);
		actions.moveToElement(account);
		actions.click();
		actions.build().perform();
		System.out.println("Menu Account is Clicked!");

		waitForVisible(driver, mylist);
		actions.moveToElement(mylist);
		actions.click();
		System.out.println("Mylist is Clicked on Menu Account");
		actions.build().perform();
		String actual = col4.getText();
		Assert.assertEquals(actual, "");
		System.out.println("Program " + " [ " + programTitle + " ] " + " is UnList!" + " Title Program ");
	}

	public void clickmylistAdded() {
		waitForVisible(driver, col4);
		Actions actions = new Actions(driver);
		actions.moveToElement(col4);
		String programTitle = col4.getText().replace("0 video", "").replace(" ", "").replace("\n", "").toLowerCase();
		actions.moveToElement(col4);
		actions.click();
		actions.build().perform();
		System.out.println("Program " + "[ " + programTitle + " ]" + " Add To Mylist");
	}

	public void clickMylist() {
		waitForVisible(driver, addMylist);
		Actions actions = new Actions(driver);
		actions.moveToElement(contentTitle);
		String programTitle = contentTitle.getText().replace("0 video", "").replace(" ", "").replace("\n", "")
				.toLowerCase();
		actions.moveToElement(addMylist);
		actions.click();
		System.out.println("Program " + "[ " + programTitle + " ]" + " Add To Mylist");
		actions.build().perform();
	}

	public void clickAnyProgram() {
		waitForVisible(driver, col4);
		Actions actions = new Actions(driver);
		actions.moveToElement(col4);
		actions.click();
		actions.build().perform();
		System.out.println("Some Program is Cliked!");
	}

	public void library() {
		waitForVisible(driver, library);
		Actions actions = new Actions(driver);
		actions.moveToElement(library);
		actions.click();
		System.out.println("Library is Cliked!");
		actions.build().perform();
	}

	public void inputUsername(String username) {
		waitForVisible(driver, formUsername);
		Actions actions = new Actions(driver);
		actions.moveToElement(formUsername);
		actions.click();
		clearFormUsername();
		actions.sendKeys(username);
		System.out.println("Username: " + username);
		actions.build().perform();
	}

	public void inputPassword(String password) {
		waitForVisible(driver, formPassword);
		Actions actions = new Actions(driver);
		actions.moveToElement(formPassword);
		clearFormPassword();
		actions.click();
		actions.sendKeys(password);
		System.out.println("Password: " + password);
		actions.build().perform();
	}

	public void button() {
		waitForVisible(driver, btnLogin);
		Actions actions = new Actions(driver);
		actions.moveToElement(btnLogin);
		actions.click();
		System.out.println("Button Login is Clicked!");
		actions.build().perform();
	}

	public void goLogin() {
		waitForVisible(driver, goLogin);
		Actions actions = new Actions(driver);
		actions.moveToElement(goLogin);
		actions.click();
		System.out.println("Button Direct To Login is Clicked!");
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

	public void clearFormUsername() {
		By usernames = By.id("email");
		driver.findElement(usernames).click();
		driver.findElement(usernames).clear();
	}

	public void clearFormPassword() {
		By passwords = By.id("password");
		driver.findElement(passwords).click();
		driver.findElement(passwords).clear();
	}
}
