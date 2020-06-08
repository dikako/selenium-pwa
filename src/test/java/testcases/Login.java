package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import object.Logins;
import object.Menus;
import wordings.Wording_Login;

public class Login {
	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	public void invalidEmail() {
		String email = "dikakoko.com";
		String password = "passwordsalah";
		String wording = "Please Try Again Email Is Incorrect";
		
		Logins login = PageFactory.initElements(driver, Logins.class);
		Wording_Login wordingLogin = PageFactory.initElements(driver, Wording_Login.class);

		System.out.println("LOGIN - Test Input Invalid Email");
		
		login.inputUsername(email);
		login.inputPassword(password);
		login.button();
		wordingLogin.invalidEmail(wording);
	}
	
	public void invalidPassword() {
		String email = "dikakoko04@gmail.com";
		String password = "passwordsalah";
		String wording = "Please Try Again Password Is Incorrect";
		
		Logins login = PageFactory.initElements(driver, Logins.class);
		Wording_Login wordingLogin = PageFactory.initElements(driver, Wording_Login.class);

		System.out.println("LOGIN - Test Input Invalid Password");
		
		login.inputUsername(email);
		login.inputPassword(password);
		login.button();
		wordingLogin.invalidPassword(wording);
	}
	
	public void notRegisteredEmail() throws InterruptedException {
		String email = "dikakoko@gg.gg";
		String password = "passwordsalah";
		String wording = "User has not been registered";
		
		Logins login = PageFactory.initElements(driver, Logins.class);
		Wording_Login wordingLogin = PageFactory.initElements(driver, Wording_Login.class);

		System.out.println("LOGIN - Test Email Not Registered");
		
		login.inputUsername(email);
		login.inputPassword(password);
		login.button();
		wordingLogin.notRegistered(wording);
	}

	public void notRegisteredPhone() throws InterruptedException {
		String phone = "08229098776544";
		String password = "passwordsalah";
		String wording = "User has not been registered";
		
		Logins login = PageFactory.initElements(driver, Logins.class);
		Wording_Login wordingLogin = PageFactory.initElements(driver, Wording_Login.class);

		System.out.println("LOGIN - Test Phone Number Not Registered");
	
		login.inputUsername(phone);
		login.inputPassword(password);
		login.button();
	    wordingLogin.notRegistered(wording);
	}

	public void invalidPhone() {
		String phone = "8767868768768";
		String password = "passwordsalah";
		String wording = "Please Try Again Phone Number Is Incorrect";
		
		Logins login = PageFactory.initElements(driver, Logins.class);
		Wording_Login wordingLogin = PageFactory.initElements(driver, Wording_Login.class);

		System.out.println("LOGIN - Test Input Invalid Phone Number");
		
		login.inputUsername(phone);
		login.inputPassword(password);
		login.button();
		wordingLogin.invalidPhone(wording);
	}

	public void login() throws InterruptedException {
		String email = "dikakoko04@gmail.com";
		String password = "dikakoko";
		String name = "dikakoko";
		
		Logins login = PageFactory.initElements(driver, Logins.class);
		Menus menu = PageFactory.initElements(driver, Menus.class);

		System.out.println("LOGIN - Test Login Success");
		
		login.inputUsername(email);
		login.inputPassword(password);
		login.button();
		menu.account();
		login.displayName(name);
	}

	public void loginByAccount() {
		String email = "dikakoko04@gmail.com";
		String password = "dikakoko";
		String name = "dikakoko";
		
		Logins login = PageFactory.initElements(driver, Logins.class);
		Menus menu = PageFactory.initElements(driver, Menus.class);

		System.out.println("LOGIN By Account Menu - Test Login Success");
		
		menu.account();
		login.goLogin();
		login.inputUsername(email);
		login.inputPassword(password);
		login.button();
		menu.account();
		login.displayName(name);
	}

	public void loginByHistory() throws InterruptedException {
		String email = "dikakoko04@gmail.com";
		String password = "dikakoko";
		String name = "dikakoko";
		
		Logins login = PageFactory.initElements(driver, Logins.class);
		Menus menu = PageFactory.initElements(driver, Menus.class);

		System.out.println("LOGIN By History Menu - Test Login Success");
		
		menu.account();
		menu.history();
		login.popupButtonLogin();
		login.inputUsername(email);
		login.inputPassword(password);
		login.button();
		menu.account();
		login.displayName(name);
	}

	public void loginByMylist() throws InterruptedException {
		String email = "dikakoko04@gmail.com";
		String password = "dikakoko";
		String name = "dikakoko";
		
		Logins login = PageFactory.initElements(driver, Logins.class);
		Menus menu = PageFactory.initElements(driver, Menus.class);

		System.out.println("LOGIN By My List Menu - Test Login Success");
	
		menu.account();
		menu.mylist();
		login.popupButtonLogin();
		login.inputUsername(email);
		login.inputPassword(password);
		login.button();
		menu.account();
		login.displayName(name);
	}

	public void loginByContinueWatching() throws InterruptedException {
		String email = "dikakoko04@gmail.com";
		String password = "dikakoko";
		String name = "dikakoko";
		
		Logins login = PageFactory.initElements(driver, Logins.class);
		Menus menu = PageFactory.initElements(driver, Menus.class);
		

		System.out.println("LOGIN By Continue Watching Menu - Test Login Success");
		
		menu.account();
		menu.continueWatching();
		login.popupButtonLogin();
		login.inputUsername(email);
		login.inputPassword(password);
		login.button();
		menu.account();
		login.displayName(name);
	}
	
	public void loginByQrCode() throws InterruptedException {
		String email = "dikakoko04@gmail.com";
		String password = "dikakoko";
		String name = "dikakoko";
		
		Logins login = PageFactory.initElements(driver, Logins.class);
		Menus menu = PageFactory.initElements(driver, Menus.class);
		

		System.out.println("LOGIN By QR CODE Menu - Test Login Success");
		
		menu.account();
		menu.qrcode();
		login.popupButtonLogin();
		login.inputUsername(email);
		login.inputPassword(password);
		login.button();
		menu.account();
		login.displayName(name);
	}
}
