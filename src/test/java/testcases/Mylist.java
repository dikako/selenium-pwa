package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import object.Menus;
import object.Mylists;

public class Mylist {
	WebDriver driver;

	public Mylist(WebDriver driver) {
		this.driver = driver;
	}

	public void addMylistByAccountLogin() {
		Mylists mylist = PageFactory.initElements(driver, Mylists.class);
		Menus menu = PageFactory.initElements(driver, Menus.class);
		
		menu.account();
		mylist.goLogin();
		login();
		mylist.library();
		mylist.clickAnyProgram();
		mylist.validateMylistAdded();
	}

	public void addMylistBeforeLoginOnProgram() {
		Mylists mylist = PageFactory.initElements(driver, Mylists.class);
		mylist.library();
		mylist.clickAnyProgram();
		mylist.clickMylist();
	}
	
	public void login() {
		String username = "dikakoko04@gmail.com";
		String password = "dikakoko";
		Mylists mylist = PageFactory.initElements(driver, Mylists.class);
		mylist.inputUsername(username);
		mylist.inputPassword(password);
		mylist.button();
	}

}
