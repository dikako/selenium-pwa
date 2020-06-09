package test;

import org.testng.annotations.Test;

import config.Setup;
import config.Url;
import testcases.EditProfile;

@Test
public class Test_EditProfile extends Setup {
	@Test(priority = 0)
	public void editprofile_NicknameNull() throws InterruptedException {
		EditProfile page = new EditProfile(driver);
		Url url = new Url(driver);
		url.urls("/login");
		page.nicknameTaken();
	}
}
