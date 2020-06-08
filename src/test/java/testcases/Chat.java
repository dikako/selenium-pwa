package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import config.Url;
import object.Chats;
import object.Logins;

public class Chat {
	WebDriver driver;

	public Chat(WebDriver driver) {
		this.driver = driver;
	}

	public void chatRcti() {
		String userChat = "dikakoko";
		String textMessage = "Test Selamat siang semua!";

		Chats chat = PageFactory.initElements(driver, Chats.class);
		Url url = new Url(driver);

		System.out.println("Test Chat - RCTI");

		actionLogin();
		url.urls("/tv/rcti");
		chat.openChat();
		chat.inputChats(textMessage);
		System.out.println("Url Test: " + driver.getCurrentUrl());
		chat.validateUsername(userChat.toLowerCase().replace(" ", ""));
		chat.validateMessage(textMessage.toLowerCase().replace(" ", ""));
	}

	public void chatMnctv() {
		String userChat = "dikakoko";
		String textMessage = "Test Selamat siang semua!";

		Chats chat = PageFactory.initElements(driver, Chats.class);
		Url url = new Url(driver);

		System.out.println("Test Chat - MNCTV");

		actionLogin();
		url.urls("/tv/mnctv");
		chat.openChat();
		chat.inputChats(textMessage);
		System.out.println("Url Test: " + driver.getCurrentUrl());
		chat.validateUsername(userChat.toLowerCase().replace(" ", ""));
		chat.validateMessage(textMessage.toLowerCase().replace(" ", ""));
	}

	public void chatGtv() {
		String userChat = "dikakoko";
		String textMessage = "Test Selamat siang semua!";

		Chats chat = PageFactory.initElements(driver, Chats.class);
		Url url = new Url(driver);

		System.out.println("Test Chat - GTV");

		actionLogin();
		url.urls("/tv/mnctv");
		chat.openChat();
		chat.inputChats(textMessage);
		System.out.println("Url Test: " + driver.getCurrentUrl());
		chat.validateUsername(userChat.toLowerCase().replace(" ", ""));
		chat.validateMessage(textMessage.toLowerCase().replace(" ", ""));
	}

	public void chatInews() {
		String userChat = "dikakoko";
		String textMessage = "Test Selamat siang semua!";

		Chats chat = PageFactory.initElements(driver, Chats.class);
		Url url = new Url(driver);

		System.out.println("Test Chat - INEWS");

		actionLogin();
		url.urls("/tv/inews");
		chat.openChat();
		chat.inputChats(textMessage);
		System.out.println("Url Test: " + driver.getCurrentUrl());
		chat.validateUsername(userChat.toLowerCase().replace(" ", ""));
		chat.validateMessage(textMessage.toLowerCase().replace(" ", ""));
	}

	public void actionLogin() {
		String username = "dikakoko04@gmail.com";
		String password = "dikakoko";

		Logins login = PageFactory.initElements(driver, Logins.class);

		login.inputUsername(username);
		login.inputPassword(password);
		login.button();
		System.out.println("Success Login");
	}
}
