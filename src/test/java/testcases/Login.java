package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import object.Logins;

public class Login {
	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	public void invalidEmail() {
		String email = "dikakoko.com";
		String password = "passwordsalah";
		String wording = "Please Try Again Email Is Incorrect";

		System.out.println("LOGIN - Test Input Invalid Email");
		Logins login = PageFactory.initElements(driver, Logins.class);
		login.inputUsername(email);
		login.inputPassword(password);
		login.button();
		login.invalidEmail(wording);
	}

	public void loginByAccountinvalidEmail() {
		String email = "dikakoko.com";
		String password = "passwordsalah";
		String wording = "Please Try Again Email Is Incorrect";

		System.out.println("LOGIN By Account - Test Input Invalid Email");
		Logins login = PageFactory.initElements(driver, Logins.class);
		login.account();
		login.goLogin();
		login.inputUsername(email);
		login.inputPassword(password);
		login.button();
		login.invalidEmail(wording);
	}

	public void loginByHistoryinvalidEmail() {
		String email = "dikakoko.com";
		String password = "passwordsalah";
		String wording = "Please Try Again Email Is Incorrect";

		System.out.println("LOGIN By History - Test Input Invalid Email");
		Logins login = PageFactory.initElements(driver, Logins.class);
		login.account();
		login.history();
		login.popupLogin();
		login.inputUsername(email);
		login.inputPassword(password);
		login.button();
		login.invalidEmail(wording);
	}

	public void loginByMylistinvalidEmail() {
		String email = "dikakoko.com";
		String password = "passwordsalah";
		String wording = "Please Try Again Email Is Incorrect";

		System.out.println("LOGIN By Mylist - Test Input Invalid Email");
		Logins login = PageFactory.initElements(driver, Logins.class);
		login.account();
		login.mylist();
		login.popupLogin();
		login.inputUsername(email);
		login.inputPassword(password);
		login.button();
		login.invalidEmail(wording);
	}

	public void loginByContinueWatchinginvalidEmail() {
		String email = "dikakoko.com";
		String password = "passwordsalah";
		String wording = "Please Try Again Email Is Incorrect";

		System.out.println("LOGIN Continue Watching - Test Input Invalid Email");
		Logins login = PageFactory.initElements(driver, Logins.class);
		login.account();
		login.continueWatching();
		login.popupLogin();
		login.inputUsername(email);
		login.inputPassword(password);
		login.button();
		login.invalidEmail(wording);
	}

	public void invalidPassword() {
		String email = "dikakoko04@gmail.com";
		String password = "passwordsalah";
		String wording = "Please Try Again Password Is Incorrect";

		System.out.println("LOGIN - Test Input Invalid Password");
		Logins login = PageFactory.initElements(driver, Logins.class);
		login.inputUsername(email);
		login.inputPassword(password);
		login.button();
		login.invalidPassword(wording);
	}

	public void loginByAccountinvalidPassword() {
		String email = "dikakoko04@gmail.com";
		String password = "passwordsalah";
		String wording = "Please Try Again Password Is Incorrect";

		System.out.println("LOGIN By Account - Test Input Invalid Password");
		Logins login = PageFactory.initElements(driver, Logins.class);
		login.account();
		login.goLogin();
		login.inputUsername(email);
		login.inputPassword(password);
		login.button();
		login.invalidPassword(wording);
	}

	public void loginByHistoryinvalidPassword() {
		String email = "dikakoko04@gmail.com";
		String password = "passwordsalah";
		String wording = "Please Try Again Password Is Incorrect";

		System.out.println("LOGIN By History - Test Input Invalid Password");
		Logins login = PageFactory.initElements(driver, Logins.class);
		login.account();
		login.history();
		login.popupLogin();
		login.inputUsername(email);
		login.inputPassword(password);
		login.button();
		login.invalidPassword(wording);
	}

	public void loginByMylistinvalidPassword() {
		String email = "dikakoko04@gmail.com";
		String password = "passwordsalah";
		String wording = "Please Try Again Password Is Incorrect";

		System.out.println("LOGIN By Mylist - Test Input Invalid Password");
		Logins login = PageFactory.initElements(driver, Logins.class);
		login.account();
		login.mylist();
		login.popupLogin();
		login.inputUsername(email);
		login.inputPassword(password);
		login.button();
		login.invalidPassword(wording);
	}

	public void loginByContinueWatchinginvalidPassword() {
		String email = "dikakoko04@gmail.com";
		String password = "passwordsalah";
		String wording = "Please Try Again Password Is Incorrect";

		System.out.println("LOGIN By Continue Watching - Test Input Invalid Password");
		Logins login = PageFactory.initElements(driver, Logins.class);
		login.account();
		login.continueWatching();
		login.popupLogin();
		login.inputUsername(email);
		login.inputPassword(password);
		login.button();
		login.invalidPassword(wording);
	}

	public void notRegisteredEmail() throws InterruptedException {
		String email = "dikakoko@gg.gg";
		String password = "passwordsalah";
		String wording = "User has not been registered";

		System.out.println("LOGIN - Test Email Not Registered");
		Logins login = PageFactory.initElements(driver, Logins.class);
		login.inputUsername(email);
		login.inputPassword(password);
		login.button();
		login.notRegistered(wording);
	}

	public void loginByAccountnotRegisteredEmail() throws InterruptedException {
		String email = "dikakoko@gg.gg";
		String password = "passwordsalah";
		String wording = "User has not been registered";

		System.out.println("LOGIN By Account - Test Email Not Registered");
		Logins login = PageFactory.initElements(driver, Logins.class);
		login.account();
		login.goLogin();
		login.inputUsername(email);
		login.inputPassword(password);
		login.button();
		login.notRegistered(wording);
	}

	public void loginByHistorynotRegisteredEmail() throws InterruptedException {
		String email = "dikakoko@gg.gg";
		String password = "passwordsalah";
		String wording = "User has not been registered";

		System.out.println("LOGIN By History - Test Email Not Registered");
		Logins login = PageFactory.initElements(driver, Logins.class);
		login.account();
		login.history();
		login.popupLogin();
		login.inputUsername(email);
		login.inputPassword(password);
		login.button();
		login.notRegistered(wording);
	}

	public void loginByMylistnotRegisteredEmail() throws InterruptedException {
		String email = "dikakoko@gg.gg";
		String password = "passwordsalah";
		String wording = "User has not been registered";

		System.out.println("LOGIN By Mylist- Test Email Not Registered");
		Logins login = PageFactory.initElements(driver, Logins.class);
		login.account();
		login.mylist();
		login.popupLogin();
		login.inputUsername(email);
		login.inputPassword(password);
		login.button();
		login.notRegistered(wording);
	}

	public void loginByContinueWatchingnotRegisteredEmail() throws InterruptedException {
		String email = "dikakoko@gg.gg";
		String password = "passwordsalah";
		String wording = "User has not been registered";

		System.out.println("LOGIN By Continue Watching - Test Email Not Registered");
		Logins login = PageFactory.initElements(driver, Logins.class);
		login.account();
		login.continueWatching();
		login.popupLogin();
		login.inputUsername(email);
		login.inputPassword(password);
		login.button();
		login.notRegistered(wording);
	}

	public void notRegisteredPhone() throws InterruptedException {
		String phone = "08229098776544";
		String password = "passwordsalah";
		String wording = "User has not been registered";

		System.out.println("LOGIN - Test Phone Number Not Registered");
		Logins login = PageFactory.initElements(driver, Logins.class);
		login.inputUsername(phone);
		login.inputPassword(password);
		login.button();
		login.notRegistered(wording);
	}

	public void loginByAccountnotRegisteredPhone() throws InterruptedException {
		String phone = "08229098776544";
		String password = "passwordsalah";
		String wording = "User has not been registered";

		System.out.println("LOGIN By Account - Test Phone Number Not Registered");
		Logins login = PageFactory.initElements(driver, Logins.class);
		login.account();
		login.goLogin();
		login.inputUsername(phone);
		login.inputPassword(password);
		login.button();
		login.notRegistered(wording);
	}

	public void loginByHistorynotRegisteredPhone() throws InterruptedException {
		String phone = "08229098776544";
		String password = "passwordsalah";
		String wording = "User has not been registered";

		System.out.println("LOGIN By History - Test Phone Number Not Registered");
		Logins login = PageFactory.initElements(driver, Logins.class);
		login.account();
		login.history();
		login.popupLogin();
		login.inputUsername(phone);
		login.inputPassword(password);
		login.button();
		login.notRegistered(wording);
	}

	public void loginByMylistnotRegisteredPhone() throws InterruptedException {
		String phone = "08229098776544";
		String password = "passwordsalah";
		String wording = "User has not been registered";

		System.out.println("LOGIN By Mylist - Test Phone Number Not Registered");
		Logins login = PageFactory.initElements(driver, Logins.class);
		login.account();
		login.mylist();
		login.popupLogin();
		login.inputUsername(phone);
		login.inputPassword(password);
		login.button();
		login.notRegistered(wording);
	}

	public void loginByContinueWatchingnotRegisteredPhone() throws InterruptedException {
		String phone = "08229098776544";
		String password = "passwordsalah";
		String wording = "User has not been registered";

		System.out.println("LOGIN By Continue Watching - Test Phone Number Not Registered");
		Logins login = PageFactory.initElements(driver, Logins.class);
		login.account();
		login.continueWatching();
		login.popupLogin();
		login.inputUsername(phone);
		login.inputPassword(password);
		login.button();
		login.notRegistered(wording);
	}

	public void invalidPhone() {
		String phone = "8767868768768";
		String password = "passwordsalah";
		String wording = "Please Try Again Phone Number Is Incorrect";

		System.out.println("LOGIN - Test Input Invalid Phone Number");
		Logins login = PageFactory.initElements(driver, Logins.class);
		login.inputUsername(phone);
		login.inputPassword(password);
		login.button();
		login.invalidPhone(wording);
	}

	public void loginByAccountinvalidPhone() {
		String phone = "8767868768768";
		String password = "passwordsalah";
		String wording = "Please Try Again Phone Number Is Incorrect";

		System.out.println("LOGIN By Account - Test Input Invalid Phone Number");
		Logins login = PageFactory.initElements(driver, Logins.class);
		login.account();
		login.goLogin();
		login.inputUsername(phone);
		login.inputPassword(password);
		login.button();
		login.invalidPhone(wording);
	}

	public void loginByHistoryinvalidPhone() {
		String phone = "8767868768768";
		String password = "passwordsalah";
		String wording = "Please Try Again Phone Number Is Incorrect";

		System.out.println("LOGIN By History - Test Input Invalid Phone Number");
		Logins login = PageFactory.initElements(driver, Logins.class);
		login.account();
		login.history();
		login.popupLogin();
		login.inputUsername(phone);
		login.inputPassword(password);
		login.button();
		login.invalidPhone(wording);
	}

	public void loginByMylistinvalidPhone() {
		String phone = "8767868768768";
		String password = "passwordsalah";
		String wording = "Please Try Again Phone Number Is Incorrect";

		System.out.println("LOGIN By Mylist - Test Input Invalid Phone Number");
		Logins login = PageFactory.initElements(driver, Logins.class);
		login.account();
		login.mylist();
		login.popupLogin();
		login.inputUsername(phone);
		login.inputPassword(password);
		login.button();
		login.invalidPhone(wording);
	}

	public void loginByContinueWatchinginvalidPhone() {
		String phone = "8767868768768";
		String password = "passwordsalah";
		String wording = "Please Try Again Phone Number Is Incorrect";

		System.out.println("LOGIN By Continue Watching - Test Input Invalid Phone Number");
		Logins login = PageFactory.initElements(driver, Logins.class);
		login.account();
		login.continueWatching();
		login.popupLogin();
		login.inputUsername(phone);
		login.inputPassword(password);
		login.button();
		login.invalidPhone(wording);
	}

	public void login() throws InterruptedException {
		String email = "dikakoko04@gmail.com";
		String password = "dikakoko";
		String name = "dikakoko";

		System.out.println("LOGIN - Test Login Success");
		Logins login = PageFactory.initElements(driver, Logins.class);
		login.inputUsername(email);
		login.inputPassword(password);
		login.button();
		login.account();
		login.displayName(name);
	}

	public void loginByAccount() {
		String email = "dikakoko04@gmail.com";
		String password = "dikakoko";
		String name = "dikakoko";

		System.out.println("LOGIN By Account Menu - Test Login Success");
		Logins login = PageFactory.initElements(driver, Logins.class);
		login.account();
		login.goLogin();
		login.inputUsername(email);
		login.inputPassword(password);
		login.button();
		login.account();
		login.displayName(name);
	}

	public void loginByHistory() throws InterruptedException {
		String email = "dikakoko04@gmail.com";
		String password = "dikakoko";
		String name = "dikakoko";

		System.out.println("LOGIN By History Menu - Test Login Success");
		Logins login = PageFactory.initElements(driver, Logins.class);
		login.account();
		login.history();
		login.popupLogin();
		login.inputUsername(email);
		login.inputPassword(password);
		login.button();
		login.account();
		login.displayName(name);
	}

	public void loginByMylist() throws InterruptedException {
		String email = "dikakoko04@gmail.com";
		String password = "dikakoko";
		String name = "dikakoko";

		System.out.println("LOGIN By My List Menu - Test Login Success");
		Logins login = PageFactory.initElements(driver, Logins.class);
		login.account();
		login.mylist();
		login.popupLogin();
		login.inputUsername(email);
		login.inputPassword(password);
		login.button();
		login.account();
		login.displayName(name);
	}

	public void loginByContinueWatching() throws InterruptedException {
		String email = "dikakoko04@gmail.com";
		String password = "dikakoko";
		String name = "dikakoko";

		System.out.println("LOGIN By Continue Watching Menu - Test Login Success");
		Logins login = PageFactory.initElements(driver, Logins.class);
		login.account();
		login.continueWatching();
		login.popupLogin();
		login.inputUsername(email);
		login.inputPassword(password);
		login.button();
		login.account();
		login.displayName(name);
	}
}
