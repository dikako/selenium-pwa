package utility;

import java.io.File;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {

	public static void captureScreenshot(WebDriver driver, String screenshotName) {

		try {
			Random random = new Random();
			int randoms = random.nextInt(1000) ;
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			System.out.println(source.getPath());
			File filename = new File("Screenshots" + screenshotName + randoms + ".png");
			System.out.println(filename);
			FileUtils.copyFile(source, filename);
			System.out.println("Screenshot Taken");

		} catch (Exception e) {
			System.err.println("Exception whiletaking screenshoot: " + e.getMessage());
		}
	}
}
