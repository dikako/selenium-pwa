package test;

import org.testng.annotations.Test;

import config.Setup;
import config.Url;
import testcases.Mylist;

@Test
public class Test_Mylist extends Setup{
	
	@Test(priority = 0)
	public void mylist_addByAccountLogin() throws InterruptedException {
		Mylist page = new Mylist(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.addMylistByAccountLogin();
	}
	
	
	
}
