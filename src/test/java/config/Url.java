package config;

import org.openqa.selenium.WebDriver;

public class Url {
private WebDriver driver;
	
	String baseUrl = "https://rc-webm.rctiplus.com";
	
	public Url(WebDriver driver) {
		this.driver = driver;
	}
	
	public void defaultUrl() {
		driver.get(baseUrl);
	}
	
	public void urls(String page) {
		String urlPage = baseUrl + page;
		driver.get(urlPage);
	}
}
