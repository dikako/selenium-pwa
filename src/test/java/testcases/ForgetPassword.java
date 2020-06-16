package testcases;

import java.util.Random;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import object.ForgetPasswords;

public class ForgetPassword {
	WebDriver driver;

	Random random = new Random();
	int n = random.nextInt(10000000);

	public ForgetPassword(WebDriver driver) {
		this.driver = driver;
	}

	public void fotgetPassword() {
		String url = "mailinator.com";
		String username = "qateam" + n;
		ForgetPasswords fp = PageFactory.initElements(driver, ForgetPasswords.class);
		fp.inputUsernameForgetPassword(username);
		fp.buttonForgetPassword();
		fp.openNewTab(url, username);

	}

	public void invalidEmail() {
		String username = "dikakoko.com";
		String wording = "Please Try Again Email Is Incorrect";

		ForgetPasswords fp = PageFactory.initElements(driver, ForgetPasswords.class);

		System.out.println("Forget Password Test - Invalid Email Wording By Url");

		fp.inputUsernameForgetPassword(username);
		fp.buttonForgetPassword();
		fp.alertWording(wording);
	}

	public void invalidPhone() {
		String username = "454546546565646";
		String wording = "Please Try Again Phone Number Is Incorrect";

		ForgetPasswords fp = PageFactory.initElements(driver, ForgetPasswords.class);

		System.out.println("Forget Password Test - Invalid Phone Wording By Url");

		fp.inputUsernameForgetPassword(username);
		fp.buttonForgetPassword();
		fp.alertWording(wording);
	}

	public void emailNotRegistered() {
		String username = "dika@koko.com";
		String wording = "User has not been registered";

		ForgetPasswords fp = PageFactory.initElements(driver, ForgetPasswords.class);

		System.out.println("Forget Password Test - Email Not Registered Wording By Url");

		fp.inputUsernameForgetPassword(username);
		fp.buttonForgetPassword();
		fp.alertWording(wording);
	}

	public void phoneNotRegistered() {
		String username = "082222992299";
		String wording = "User has not been registered";

		ForgetPasswords fp = PageFactory.initElements(driver, ForgetPasswords.class);

		System.out.println("Forget Password Test - Phone Not Registered Wording By Url");

		fp.inputUsernameForgetPassword(username);
		fp.buttonForgetPassword();
		fp.alertWording(wording);
	}
}
