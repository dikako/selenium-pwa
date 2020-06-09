package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import object.EditProfiles;
import object.Logins;
import object.Menus;
import wordings.Wording_EditProfile;

public class EditProfile {
	WebDriver  driver;
	
	public EditProfile(WebDriver driver) {
		this.driver = driver;
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
	
	public void actionLogin() {
		String username = "dikakoko04@gmail.com";
		String password = "dikakoko";
		
		Logins login = PageFactory.initElements(driver, Logins.class);
		
		login.inputUsername(username);
		login.inputPassword(password);
		login.button();
	}
}
