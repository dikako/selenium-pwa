package object;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Newss {
	WebDriver driver;

	@FindBy(how = How.CLASS_NAME, className = "article-source")
	WebElement artikelTitle;

//	@FindBy(how = How.CLASS_NAME, className = "article-thumbnail-full-width")
//	WebElement thumbnailLarge;

	public Newss(WebDriver driver) {
		this.driver = driver;
	}

	public void validateArtikelSource() {
		List<WebElement> element = driver.findElements(By.className("article-source"));
		ArrayList<String> sourceList = new ArrayList<String>();
		System.out.println(element.size());
		for (WebElement source : element) {
			//System.out.println("Sources " + source.findElement(By.tagName("strong")).getText());
			String a = source.findElement(By.tagName("strong")).getText();
			sourceList.add(a);
			System.out.println(sourceList.get(2));
		}
	}

	public void klikArtikelNews() {
		WebElement element = driver.findElement(By.className("article-title"));
		waitForVisible(driver, element);
		element.click();
		System.out.println("News Artikel is clicked!");
	}

	public void validateCountRelatedArtikelTitle(int countFix) {
		//int element = driver.findElements(By.className("article-title")).size();
		List<WebElement> x = driver.findElements(By.className("article-title"));
		for (WebElement y : x) {
			System.out.println(y.getText());
		}
		
		System.out.println("url Gan: " + driver.getCurrentUrl());
			
		
		
		
//		System.out.println("Jumlah Related Artikel Title " + element);
//		System.out.println(driver.getCurrentUrl());
//		Assert.assertTrue(element == countFix);
//		System.out.println("Jumlah Related Artikel Title" + element + " Is matches!");
	}

	public void validateCountRelatedArtikelThumbnail(int countFix) {
		int element = driver.findElements(By.className("article-thumbnail")).size();
		Assert.assertTrue(element == countFix);
		System.out.println("Jumlah Related Artikel " + element + " Is matches!");
	}

	public void validateCountCategoryDefault(int counFix) {
		int element = driver.findElements(By.className("nav-link")).size();
		Assert.assertTrue(element == counFix && element > 0);
		System.out.println("Jumlah Category Default: " + element + " Is matches");
	}

	public void validateCountThumbnailSmall(int countFix) {
		int element = driver.findElements(By.className("article-thumbnail")).size();
		Assert.assertTrue(element % 2 == countFix && element > 0);
		System.out.println("Jumlah articel Thumbnail: " + element + " Element is Even");
	}

	private void waitForVisible(WebDriver driver, WebElement element) {
		try {
			Thread.sleep(2000);
			System.out.println("Waiting for element visibility");
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
