package test;

import org.testng.annotations.Test;

import config.Setup;
import config.Url;
import testcases.Chat;

@Test
public class Test_Chat extends Setup {
	@Test(priority = 0)
	public void chat_beforeLoginRCTI() {
		Chat page = new Chat(driver);
		Url url = new Url(driver);
		url.urls("/login");
		page.chatRcti();
	}
	
	@Test(priority = 1)
	public void chat_beforeLoginMNCTV() {
		Chat page = new Chat(driver);
		Url url = new Url(driver);
		url.urls("/login");
		page.chatMnctv();
	}
	
	@Test(priority = 2)
	public void chat_beforeLoginGTV() {
		Chat page = new Chat(driver);
		Url url = new Url(driver);
		url.urls("/login");
		page.chatGtv();
	}
	
	@Test(priority = 3)
	public void chat_beforeLoginINEWS() {
		Chat page = new Chat(driver);
		Url url = new Url(driver);
		url.urls("/login");
		page.chatInews();
	}
}
