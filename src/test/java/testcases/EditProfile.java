package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import object.EditProfiles;
import object.Logins;
import object.Menus;
import wordings.Wording_EditProfile;

public class EditProfile {
	WebDriver driver;

	public EditProfile(WebDriver driver) {
		this.driver = driver;
	}
	
	public void interest() throws InterruptedException {
		String a = "Drama";
		String b = "Comedy";
		String c = "Sitcom";
		
		EditProfiles edit = PageFactory.initElements(driver, EditProfiles.class);
		Menus menu = PageFactory.initElements(driver, Menus.class);

		System.out.println("Edit Profile - Fullname Test");

		actionLogin();
		menu.account();
		edit.klikDisplayName();
		edit.klikInterest();
		edit.inputInterest(a);
		edit.inputInterest(b);
		edit.inputInterest(c);
	}

	public void fullnameNull() throws InterruptedException {
		String fullname = "";

		EditProfiles edit = PageFactory.initElements(driver, EditProfiles.class);
		Menus menu = PageFactory.initElements(driver, Menus.class);

		System.out.println("Edit Profile - Fullname Test");

		actionLogin();
		menu.account();
		edit.klikDisplayName();
		edit.klikFullname();
		edit.inputFullname(fullname);
		edit.disabledButton();
	}

	public void fullname() throws InterruptedException {
		String fullname = "teamQCKEREN" + randomString(4);

		EditProfiles edit = PageFactory.initElements(driver, EditProfiles.class);
		Menus menu = PageFactory.initElements(driver, Menus.class);

		System.out.println("Edit Profile - Fullname Test");

		actionLogin();
		menu.account();
		edit.klikDisplayName();
		edit.klikFullname();
		edit.inputFullname(fullname);
		edit.save();
		edit.validateFullname(fullname);
	}

	public void nicknameTaken() throws InterruptedException {
		String nickname = "dikakoko";
		String wording = "Your Nickname Has Been Taken";

		EditProfiles edit = PageFactory.initElements(driver, EditProfiles.class);
		Menus menu = PageFactory.initElements(driver, Menus.class);
		Wording_EditProfile alert = PageFactory.initElements(driver, Wording_EditProfile.class);

		System.out.println("Edit Nickname - Nickname Taken");

		actionLogin();
		menu.account();
		edit.klikDisplayName();
		edit.klikNickname();
		edit.inputNickname(nickname);
		alert.nicknameTaken(wording);
	}

	public void nicknameNull() throws InterruptedException {
		String wording = "Field Is Required";

		EditProfiles edit = PageFactory.initElements(driver, EditProfiles.class);
		Menus menu = PageFactory.initElements(driver, Menus.class);
		Wording_EditProfile alert = PageFactory.initElements(driver, Wording_EditProfile.class);

		System.out.println("Edit Nickname - Nickname Null Input");

		actionLogin();
		menu.account();
		edit.klikDisplayName();
		edit.klikNickname();
		edit.inputNicknameNull();
		alert.nicknameTaken(wording);
	}

	static String randomString(int n) {
		String huruf = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvxyz";
		StringBuilder sb = new StringBuilder(n);
		for (int i = 0; i < n; i++) {
			int index = (int) (huruf.length() * Math.random());
			sb.append(huruf.charAt(index));
		}
		return sb.toString();
	}

	public void actionLogin() {
		String username = "dikakoko04@gmail.com";
		String password = "dikakoko";

		Logins login = PageFactory.initElements(driver, Logins.class);

		login.inputUsername(username);
		login.inputPassword(password);
		login.button();
	}
}
