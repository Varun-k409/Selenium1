package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Screenshot {

	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	static WebDriver driver;

	public static void takeScreenShot(WebDriver driver,String name) throws IOException {
//we havce taken two arguments over here so that we do not get the nul pointer exception
		TakesScreenshot ts = (TakesScreenshot) driver;
		File ss = ts.getScreenshotAs(OutputType.FILE);
		File ff = new File("./screenshot2/" + name + ".png");
		Files.copy(ss, ff);//present in google.commomio

	}
}
