package test;

import org.testng.annotations.Test;
import config.Setup;
import config.Url;
import testcases.News;

@Test
public class Test_News extends Setup {
	@Test(priority = 0)
	public void news_validateCountThumbnailSmall() {
		News page = new News(driver);
		Url url = new Url(driver);
		url.urls("/trending");
		page.validateThumbnailSmall();
	}
	
	@Test(priority = 1)
	public void news_validateCountCategoryDefault() {
		News page = new News(driver);
		Url url = new Url(driver);
		url.urls("/trending");
		page.validateCountCategoryDefault();
	}
	
	@Test(priority = 2)
	public void news_validateCountRelatedArtikelThumbnail() {
		News page = new News(driver);
		Url url = new Url(driver);
		url.urls("/trending");
		page.validateCountRelatedArtikelThumbnail();
	}
	
//	@Test(priority = 2)
//	public void news_validateCountRelatedArtikelTitle() {
//		News page = new News(driver);
//		Url url = new Url(driver);
//		url.urls("/trending");
//		page.validateCountRelatedArtikelTitle();
//	}
//	
//	@Test(priority = 2)
//	public void news_validateSource() {
//		News page = new News(driver);
//		Url url = new Url(driver);
//		url.urls("/trending");
//		page.validateSource();
//	}
}
