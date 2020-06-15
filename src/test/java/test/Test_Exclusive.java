package test;

import org.testng.annotations.Test;

import config.Setup;
import config.Url;
import testcases.Exclusive;

@Test
public class Test_Exclusive extends Setup{
	@Test(priority = 0)
	public void validateProgramThumbnail() {
		Exclusive page = new Exclusive(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateProgramThumbnail();
	}
	
	@Test(priority = 1)
	public void validateListCountShare() {
		Exclusive page = new Exclusive(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateListShareDisplay();
	}
	
	@Test(priority = 2)
	public void validateListShareByLabel() {
		Exclusive page = new Exclusive(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateShareLabel();
	}
	
	@Test(priority = 3)
	public void validateShareByFb() throws InterruptedException {
		Exclusive page = new Exclusive(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateShareByFb();
	}
	
	@Test(priority = 3)
	public void validateShareByTwitter() throws InterruptedException {
		Exclusive page = new Exclusive(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateShareByTwitter();
	}
	
	@Test(priority = 3)
	public void validateShareByLine() throws InterruptedException {
		Exclusive page = new Exclusive(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateShareByLine();
	}
	
	@Test(priority = 3)
	public void validateShareByMail() throws InterruptedException {
		Exclusive page = new Exclusive(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateShareByTwitter();
	}
	
	@Test(priority = 3)
	public void validateShareByWhatsapp() throws InterruptedException {
		Exclusive page = new Exclusive(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateShareByWa();
	}
	
	@Test(priority = 4)
	public void validateCloseListShare() throws InterruptedException {
		Exclusive page = new Exclusive(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateCloseListShare();
	}
}
