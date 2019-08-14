package testpackage;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Scroll {

	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	static WebDriver driver;

	// go to seleniumhq.org and type java and then clear it
	public static void main(String[] args) throws InterruptedException, IOException

	{

		driver = new ChromeDriver();// casting
		driver.manage().window().maximize();// maximize the browser window

		driver.navigate().to("https://www.seleniumhq.org/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//div[@id=\"mBody\"]/h2"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", ele);
		Thread.sleep(2000);
		takeScreenShot("Sele");
	}

	public static void takeScreenShot(String name) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File ss = ts.getScreenshotAs(OutputType.FILE);
		File ff = new File("./screenshot2/" + name + ".png");
		Files.copy(ss, ff);

	}
}
