package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import object.Exclusives;
import object.Menus;

public class Exclusive {
	WebDriver driver;

	public Exclusive(WebDriver driver) {
		this.driver = driver;
	}
	
	public void validateCloseListShare() {
		Exclusives exlusive = PageFactory.initElements(driver, Exclusives.class);
		Menus menu = PageFactory.initElements(driver, Menus.class);
		
		System.out.println("Exclusive - Validate Close List Share");
		
		menu.exclusive();
		exlusive.klikShareButton();
		exlusive.validateCloseListShare(true);
		exlusive.klikButtonCloseListShare();
		exlusive.validateCloseListShare(false);
	}
	
	public void validateShareByWa() throws InterruptedException {
		String urls = "whatsapp";
		
		Exclusives exlusive = PageFactory.initElements(driver, Exclusives.class);
		Menus menu = PageFactory.initElements(driver, Menus.class);
		
		System.out.println("Exclusive - Validate Share By Whatsapp");
		
		menu.exclusive();
		exlusive.klikShareButton();
		exlusive.klikShareBy(4, urls);
	}
	
	public void validateShareByMail() throws InterruptedException {
		String urls = "mail";
		
		Exclusives exlusive = PageFactory.initElements(driver, Exclusives.class);
		Menus menu = PageFactory.initElements(driver, Menus.class);
		
		System.out.println("Exclusive - Validate Share By Mail");
		
		menu.exclusive();
		exlusive.klikShareButton();
		exlusive.klikShareBy(3, urls);
	}
	
	public void validateShareByLine() throws InterruptedException {
		String urls = "line";
		
		Exclusives exlusive = PageFactory.initElements(driver, Exclusives.class);
		Menus menu = PageFactory.initElements(driver, Menus.class);
		
		System.out.println("Exclusive - Validate Share By Line");
		
		menu.exclusive();
		exlusive.klikShareButton();
		exlusive.klikShareBy(2, urls);
	}
	
	public void validateShareByTwitter() throws InterruptedException {
		String urls = "twitter";
		
		Exclusives exlusive = PageFactory.initElements(driver, Exclusives.class);
		Menus menu = PageFactory.initElements(driver, Menus.class);
		
		System.out.println("Exclusive - Validate Share By Twitter");
		
		menu.exclusive();
		exlusive.klikShareButton();
		exlusive.klikShareBy(1, urls);
	}
	
	public void validateShareByFb() throws InterruptedException {
		String title = "facebook";

		Exclusives exlusive = PageFactory.initElements(driver, Exclusives.class);
		Menus menu = PageFactory.initElements(driver, Menus.class);

		System.out.println("Exclusive - Validate Share By Facebook");

		menu.exclusive();
		exlusive.klikShareButton();
		exlusive.klikShareBy(0, title);
	}

	public void validateShareLabel() {
		String a = "facebook";
		String b = "twitter";
		String c = "line";
		String d = "email";
		String e = "whatsapp";

		Exclusives exlusive = PageFactory.initElements(driver, Exclusives.class);
		Menus menu = PageFactory.initElements(driver, Menus.class);

		System.out.println("Exclusive - Validate Share Label");

		menu.exclusive();
		exlusive.klikShareButton();
		exlusive.validateShareBySosmedIsDisplayed(a, b, c, d, e);
	}

	public void validateProgramThumbnail() {
		Exclusives exlusive = PageFactory.initElements(driver, Exclusives.class);
		Menus menu = PageFactory.initElements(driver, Menus.class);

		System.out.println("Exclusive - Validate Thumbnail Program Display");

		menu.exclusive();
		exlusive.programTitleIsDisplayed();
	}

	public void validateListShareDisplay() {
		Exclusives exlusive = PageFactory.initElements(driver, Exclusives.class);
		Menus menu = PageFactory.initElements(driver, Menus.class);

		System.out.println("Exclusive - Validate List Buuton Share Display");

		menu.exclusive();
		exlusive.klikShareButton();
		exlusive.listShareButton(6);
	}
}
