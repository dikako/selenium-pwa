package config;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Setup {
	protected WebDriver driver = null;

	@BeforeMethod
	public void set() {
		WebDriverManager.chromedriver().browserVersion("83.0.4103.61").setup();
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Galaxy S5");
		ChromeOptions handlessOptions = new ChromeOptions();
		handlessOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
		handlessOptions.setHeadless(true);
		handlessOptions.addArguments("start-maximized");
		handlessOptions.addArguments("enable-automation");
		handlessOptions.addArguments("--no-sandbox");
		handlessOptions.addArguments("--disable-infobars");
		handlessOptions.addArguments("--disable-dev-shm-usage");
		handlessOptions.addArguments("--disable-browser-side-navigation");
		handlessOptions.addArguments("--disable-gpu");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, handlessOptions);
		// System.setProperty("webdriver.chrome.driver",
		// "D:\\Library\\Chrome_driver\\chromedriver.exe");
		// driver = new ChromeDriver(capabilities);
		// driver = new FirefoxDriver(capabilities);
		handlessOptions.merge(capabilities);
		driver = new ChromeDriver(handlessOptions);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}

	@AfterMethod
	public void done() {
		driver.quit();
	}
}
