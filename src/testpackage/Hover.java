package testpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		driver.navigate().to("https://www.urbanladder.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
		Thread.sleep(2000);
		List<WebElement> item = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
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

