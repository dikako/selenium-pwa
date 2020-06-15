package test;

import org.testng.annotations.Test;

import config.Setup;
import config.Url;
import testcases.EditProfile;

@Test
public class Test_EditProfile extends Setup {
	@Test(priority = 0)
	public void editprofile_NicknameTaken() throws InterruptedException {
		EditProfile page = new EditProfile(driver);
		Url url = new Url(driver);
		url.urls("/login");
		page.nicknameTaken();
	}
	
//	@Test(priority = 1)
//	public void editprofile_FullnameNull() throws InterruptedException {
//		EditProfile page = new EditProfile(driver);
//		Url url = new Url(driver);
//		url.urls("/login");
//		page.fullnameNull();
//	}
	
	@Test(priority = 2)
	public void editprofile_Fullname() throws InterruptedException {
		EditProfile page = new EditProfile(driver);
		Url url = new Url(driver);
		url.urls("/login");
		page.fullname();
	}
	
}
