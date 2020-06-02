package test;

import org.testng.annotations.Test;
import config.Setup;
import config.Url;
import testcases.Login;

@Test
public class Test_Login extends  Setup {
	@Test(priority = 0)
	public void login_invalidEmail() throws InterruptedException {
		Login page = new Login(driver);
		Url url = new Url(driver);
		url.urls("/login");
		page.invalidEmail();
	}

	@Test(priority = 1)
	public void login_invalidPassword() throws InterruptedException {
		Login page = new Login(driver);
		Url url = new Url(driver);
		url.urls("/login");
		page.invalidPassword();
	}

	@Test(priority = 2)
	public void login_invalidPhone() throws InterruptedException {
		Login page = new Login(driver);
		Url url = new Url(driver);
		url.urls("/login");
		page.invalidPhone();
	}

	@Test(priority = 3)
	public void login_notRegisteredEmail() throws InterruptedException {
		Login page = new Login(driver);
		Url url = new Url(driver);
		url.urls("/login");
		page.notRegisteredEmail();
	}

	@Test(priority = 4)
	public void login_notRegisteredPhone() throws InterruptedException {
		Login page = new Login(driver);
		Url url = new Url(driver);
		url.urls("/login");
		page.notRegisteredPhone();
	}

	@Test(priority = 5)
	public void login_success() throws InterruptedException {
		Login page = new Login(driver);
		Url url = new Url(driver);
		url.urls("/login");
		page.login();
	}

	@Test(priority = 5)
	public void login_successByAccount() throws InterruptedException {
		Login page = new Login(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.loginByAccount();
	}

	@Test(priority = 5)
	public void login_successByHistory() throws InterruptedException {
		Login page = new Login(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.loginByHistory();
	}

	@Test(priority = 5)
	public void login_successByMyList() throws InterruptedException {
		Login page = new Login(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.loginByMylist();
	}

	@Test(priority = 5)
	public void login_successByContinueWatching() throws InterruptedException {
		Login page = new Login(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.loginByContinueWatching();
	}
}
