package testcases;

import org.openqa.selenium.WebDriver;

import object.Newss;

public class News {
	WebDriver driver;

	public News(WebDriver driver) {
		this.driver = driver;
	}

	public void validateThumbnailSmall() {
		Newss news = new Newss(driver);

		System.out.println("Test News - Validate Size Count Thumbnail Small");
		news.validateCountThumbnailSmall(0);
	}

	public void validateCountCategoryDefault() {
		Newss news = new Newss(driver);

		System.out.println("Test News - Validate Size Nav Link Default");
		news.validateCountCategoryDefault(3);
	}
	
	public void validateCountRelatedArtikelThumbnail() {
		Newss news = new Newss(driver);
		
		System.out.println("Test News - Validate Size Thumbnail Related Artikel");
		news.klikArtikelNews();
		news.validateCountRelatedArtikelThumbnail(4);
	}
	
	public void validateCountRelatedArtikelTitle() {
		Newss news = new Newss(driver);
		
		System.out.println("Test News - Validate Size Title Related Artikel");
		news.klikArtikelNews();
		news.validateCountRelatedArtikelTitle(4);
	}
	
	public void validateSource() {
		Newss news = new Newss(driver);
		
		System.out.println("Test News - Validate Source");
		news.klikArtikelNews();
		news.validateArtikelSource();
	}
}
