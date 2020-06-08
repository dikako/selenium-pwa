package test;

import org.testng.annotations.Test;

import config.Setup;
import config.Url;
import testcases.ForgetPassword;

@Test
public class Test_ForgetPassword extends Setup {
	@Test(priority = 0)
	public void forgetpassword_invalidEmail() {
		ForgetPassword page = new ForgetPassword(driver);
		Url url = new Url(driver);
		url.urls("/forget-password");
		page.invalidEmail();
	}
	
	@Test(priority = 1)
	public void forgetpassword_invalidPhone() {
		ForgetPassword page = new ForgetPassword(driver);
		Url url = new Url(driver);
		url.urls("/forget-password");
		page.invalidPhone();
	}
	
	@Test(priority = 2)
	public void forgetpassword_emailNotRegistered() {
		ForgetPassword page = new ForgetPassword(driver);
		Url url = new Url(driver);
		url.urls("/forget-password");
		page.emailNotRegistered();
	}
	
	@Test(priority = 3)
	public void forgetpassword_phoneNotRegistered() {
		ForgetPassword page = new ForgetPassword(driver);
		Url url = new Url(driver);
		url.urls("/forget-password");
		page.phoneNotRegistered();
	}

}
