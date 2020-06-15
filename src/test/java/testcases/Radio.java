package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import object.Menus;
import object.Radios;

public class Radio {
	WebDriver driver;

	public Radio(WebDriver driver) {
		this.driver = driver;
	}

	public void validateUrlRoov() throws InterruptedException {
		String urls = "radio";

		Radios radio = PageFactory.initElements(driver, Radios.class);
		Menus menu = PageFactory.initElements(driver, Menus.class);

		System.out.println("Radio - Validate Url Radio");

		menu.radio();
		Thread.sleep(3000);
		radio.validateUrlRoov(urls);
	}
}
