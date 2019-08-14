package testpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartHover {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(2000);
		List<WebElement> item = driver.findElements(By.xpath("//ul[@class=\\\"_114Zhd\\\"]/li"));
		for (WebElement ele : item) {
			String menu=ele.getText();
			System.out.println(menu);
			a.moveToElement(ele).build().perform();
			Thread.sleep(2000);
			List<WebElement> sub = driver.findElements(By.xpath("//span[contains(.,'"+menu+"')]/parent::li/descendant::ul[@class='inline-list left']/descendant::ul/li"));
			for (WebElement submenus : sub) {
				System.out.println(submenus.getText());
				
			}
			

		}
	}
}

