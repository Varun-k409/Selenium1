
package testpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumhq {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.seleniumhq.org/");
		Thread.sleep(2000);
			WebElement Search=driver.findElement(By.xpath("//input[@id='q']"));
		//Search.sendKeys("abs");
		Thread.sleep(2000);
		//Search.clear();
		Point loc = Search.getLocation();
		System.out.println(loc);
	System.out.println(loc.getX());
	System.out.println(loc.getY());	
	}
}
