
package testpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkark {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//ul[@class=\"_3GtRpC\"]/li")).click();
		Thread.sleep(2000);
		List<WebElement> item = driver.findElements(By.xpath("//ul[@class=\"_114Zhd\"]/li"));
		for (WebElement ele : item)
			System.out.println(ele.getText());
	}
}
