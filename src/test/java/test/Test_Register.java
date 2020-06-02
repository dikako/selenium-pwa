package test;

import org.testng.annotations.Test;

import config.Setup;
import config.Url;
import testcases.Register;

@Test
public class Test_Register extends Setup {
	@Test(priority = 0)
	public void register_invalidEmail() throws InterruptedException {
		Register page = new Register(driver);
		Url url = new Url(driver);
		url.urls("/register");
		page.invalidEmail();
	}

	@Test(priority = 0)
	public void register_invalidPasswordNumChar() throws InterruptedException {
		Register page = new Register(driver);
		Url url = new Url(driver);
		url.urls("/register");
		page.invalidPasswordNumChars();
	}

	@Test(priority = 0)
	public void register_invalidPasswordNotMatch() throws InterruptedException {
		Register page = new Register(driver);
		Url url = new Url(driver);
		url.urls("/register");
		page.invalidPasswordNotMatch();
	}

	@Test(priority = 0)
	public void register_maxCharFullname() throws InterruptedException {
		Register page = new Register(driver);
		Url url = new Url(driver);
		url.urls("/register");
		page.maxCharFullname();
	}

	@Test(priority = 0)
	public void register_validateGender() throws InterruptedException {
		Register page = new Register(driver);
		Url url = new Url(driver);
		url.urls("/register");
		page.validateGender();
	}

}
