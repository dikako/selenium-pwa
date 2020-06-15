package object;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Radios {
	WebDriver driver;
	
	public Radios(WebDriver driver) {
		this.driver = driver;
	}
	
	public void validateUrlRoov(String urls) {
		boolean url = driver.getCurrentUrl().contains(urls);
		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals(url, true);
		System.out.println("Url is Matching!");
	}
}
