package testpackage;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Screenshot2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException

	{

		driver = new ChromeDriver();// casting
		driver.manage().window().maximize();// maximize the browser window
		Actions a = new Actions(driver);
		driver.navigate().to("https://www.urbanladder.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@data-gaaction=\"popup.auth.close\"]")).click();

		Thread.sleep(2000);

		List<WebElement> item = driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]/li"));
		for (WebElement ele : item) {

			String menu = ele.getText();
			System.err.println(menu);
			a.moveToElement(ele).build().perform();
			takeScreenShot(ele.getText());
			Thread.sleep(2000);

			List<WebElement> sub = driver.findElements(By.xpath("//span[contains(.,'" + menu
					+ "')]/parent::li/descendant::ul[@class='inline-list left']/li/descendant::li"));
			for (WebElement ele1 : sub) {
				System.out.println(ele1.getText());

			}

		}

	}

	public static void takeScreenShot(String name) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File ss = ts.getScreenshotAs(OutputType.FILE);
		File ff = new File("./screenshot1/" + name + ".png");
		Files.copy(ss, ff);

	}

}