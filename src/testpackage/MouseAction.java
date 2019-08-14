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

public class MouseAction {
	static {
		System.setProperty("webdriver.chrome.driver", "./softwares2/chromedriver.exe");
	}
     
	public static void main(String[] args) throws InterruptedException, IOException

	{

		WebDriver driver = new ChromeDriver();// casting
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
			Thread.sleep(2000);
			TakesScreenshot ts = (TakesScreenshot) driver;
			File ss = ts.getScreenshotAs(OutputType.FILE);
			File ff = new File("./screenshot/"+menu+".png");
			Files.copy(ss, ff);
		}
		

	}
}