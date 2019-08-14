package testpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadder {
	static {
		System.setProperty("webdriver.chrome.driver", "./Softwares2/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.urbanladder.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
		Thread.sleep(2000);
		
		// driver.findElement(By.xpath("//div[@id='topnav_wrapper']/descendant::li[@class='topnav_item
		// saleunit']")).click();
		// driver.findElement(By.xpath("//li[@class='topnav_item
		// diningunit']/parent::ul")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='topnav_item diningunit']/ancestor::ul[@class='topnav bodytext']"))
				.click();
		/*
		 * driver.findElement( By.
		 * xpath("//li[@class='topnav_item saleunit']/following-sibling::li[@class='topnav_item bedroomunit']"
		 * )) .click();
		 */
		List<WebElement> item = driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]/li"));
		for (WebElement ele : item)
			System.out.println(ele.getText());
		
	}
}
