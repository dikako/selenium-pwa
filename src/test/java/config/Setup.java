package config;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import cucumber.api.testng.CucumberFeatureWrapper;
//import cucumber.api.testng.TestNGCucumberRunner;
import utility.*;

public class Setup {
	protected RemoteWebDriver driver;
//	private TestNGCucumberRunner testNgCucumberRunner;
//	
//	@BeforeClass(alwaysRun = true)
//	public void setUpClass() throws Exception {
//		this.testNgCucumberRunner = new TestNGCucumberRunner(this.getClass());
//	}
//	
//	@Test(groups = {"cucumber"}, description = "Runs Cucumber Feature", dataProvider = "features")
//	public void feature(CucumberFeatureWrapper cucumberFeatureWrapper) {
//		this.testNgCucumberRunner.runCucumber(cucumberFeatureWrapper.getCucumberFeature());
//	}
//	
//	@DataProvider
//	public Object[][] features() {
//		return this.testNgCucumberRunner.provideFeatures();
//	}
//	
//	@AfterClass(alwaysRun = true)
//	public void setDownClass() throws Exception {
//		this.testNgCucumberRunner.finish();
//	}
	
	@BeforeMethod
	public void set() throws MalformedURLException {
		//WebDriverManager.chromedriver().browserVersion("83.0.4103.61").setup();
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Galaxy S5");
		ChromeOptions handlessOptions = new ChromeOptions();
		handlessOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
		//handlessOptions.setHeadless(true);
		handlessOptions.addArguments("start-maximized");
		handlessOptions.addArguments("enable-automation");
		handlessOptions.addArguments("--no-sandbox");
		handlessOptions.addArguments("--disable-infobars");
		handlessOptions.addArguments("--disable-dev-shm-usage");
		handlessOptions.addArguments("--disable-browser-side-navigation");
		handlessOptions.addArguments("--disable-gpu");
		URL url = new URL("http://localhost:4444/wd/hub");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, handlessOptions);
//		 System.setProperty("webdriver.chrome.driver",
//		 "/usr/bin/chromedriver");
		// driver = new ChromeDriver(capabilities);
		// driver = new FirefoxDriver(capabilities);
		handlessOptions.merge(capabilities);
		//driver = new ChromeDriver(handlessOptions);
		driver = new RemoteWebDriver(url, handlessOptions);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}

	@AfterMethod
	public void done(ITestResult result) {
		String name = result.getName();
		if(ITestResult.FAILURE==result.getStatus()) {
			TakeScreenshot.captureScreenshot(driver, name);
		}
		driver.quit();
	}
}
