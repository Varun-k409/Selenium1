
package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateback{
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.seleniumhq.org/");
		Thread.sleep(2000);
			WebElement Search=driver.findElement(By.xpath("//input[@id='q']"));
	Search.sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
		driver.navigate().back();
	Thread.sleep(2000);
Search.clear();	
	Thread.sleep(2000);
	}
}
