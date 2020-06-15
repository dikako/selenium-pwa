package test;

import org.testng.annotations.Test;

import config.Setup;
import config.Url;
import testcases.Radio;

@Test
public class Test_Radio extends Setup{
	@Test(priority = 0)
	public void validateUrlRadio() throws InterruptedException {
		Radio page = new Radio(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateUrlRoov();
	}
}
