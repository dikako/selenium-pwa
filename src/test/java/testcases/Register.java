package testcases;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import object.Registers;

public class Register {
	WebDriver driver;

	String email = "teamqc@mailinator.com";
	Random random = new Random();
	int randoms = random.nextInt(1000);
	int index = 5;
	int indexInvalidEmail = 22;
	String emailInvalid = "teamqc.com";

	public Register(WebDriver driver) {
		this.driver = driver;
	}

	public void register() {
		register_first();
		register_second();
	}

	public void inputBirthdate() {
		String password = "dikakoko";
		Registers register = PageFactory.initElements(driver, Registers.class);
		register.inputEmail(randomEmail(email, randoms, index));
		register.inputPassword(password);
		register.inputRePassword(password);
		register.button();
		register.inputBirthday();
	}

	public void validateGender() {
		String password = "dikakoko";
		Registers register = PageFactory.initElements(driver, Registers.class);
		System.out.println("Test - Validate Gander Male & Female");
		register.inputEmail(randomEmail(email, randoms, index));
		register.inputPassword(password);
		register.inputRePassword(password);
		register.button();
		register.twoGender();
	}

	public void maxCharFullname() {
		String password = "dikakoko";
		Registers register = PageFactory.initElements(driver, Registers.class);
		System.out.println("Test - Max Char on Fullname is 25");
		register.inputEmail(randomEmail(email, randoms, index));
		register.inputPassword(password);
		register.inputRePassword(password);
		register.button();
		register.maxFullname("25");
	}

	public void invalidEmail() {
		String wording = "Please Try Again Email Is Incorrect";
		String password = "dikakoko";
		Registers register = PageFactory.initElements(driver, Registers.class);
		System.out.println("Test - Wording Invalid Email");
		register.inputEmail(randomEmailInvalid(emailInvalid, randoms, index));
		register.inputPassword(password);
		register.inputRePassword(password);
		register.button();
		register.invalidEmail(wording);
	}

	public void invalidPasswordNumChars() {
		String wording = "Password must at least 8 characters";
		String password = "dikako";
		Registers register = PageFactory.initElements(driver, Registers.class);
		System.out.println("Test - Wording invalid Password Min Char");
		register.inputEmail(randomEmail(email, randoms, index));
		register.inputPassword(password);
		register.inputRePassword(password);
		register.button();
		register.invalidPasswordNumChars(wording);
	}

	public void invalidPasswordNotMatch() {
		String wording = "Password must match";
		String password = "dikakoko";
		String passwordNotMatch = "Notmatchs";
		Registers register = PageFactory.initElements(driver, Registers.class);
		System.out.println("Test - Woording Invalid Password not match");
		register.inputEmail(randomEmail(email, randoms, index));
		register.inputPassword(password);
		register.inputRePassword(passwordNotMatch);
		register.button();
		register.invalidPasswordNotMatch(wording);
	}

	public void register_first() {
		String password = "dikakoko";
		Registers register = PageFactory.initElements(driver, Registers.class);
		register.inputEmail(randomEmail(email, randoms, index));
		register.inputPassword(password);
		register.inputRePassword(password);
		register.button();
	}

	public void register_second() {
		Registers register = PageFactory.initElements(driver, Registers.class);
		register.inputGender();
	}

	public static String randomEmail(String email, int randoms, int index) {
		String newEmail = email.substring(0, index + 1) + randoms + email.substring(index + 1);
		return newEmail;
	}

	public static String randomEmailInvalid(String emailInvalid, int randoms, int index) {
		String newEmailInvalid = emailInvalid.substring(0, index + 1) + randoms + emailInvalid.substring(index + 1);
		return newEmailInvalid;
	}

	public static String wordingInvalidEmail(String wordingInvalidEmail, String text, int indexInvalidEmail) {
		String newWording = wordingInvalidEmail.substring(0, indexInvalidEmail + 1) + text
				+ wordingInvalidEmail.substring(indexInvalidEmail + 1);
		return newWording;
	}
}
