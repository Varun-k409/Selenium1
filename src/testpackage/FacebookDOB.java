package testpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FacebookDOB {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		// WebElement id=driver.findElement(By.xpath("//input[@type='emain']"));
		// id.sendKeys("varun");
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);

		// s.selectByValue("4");
		Thread.sleep(2000);
		// WebElement month = driver.findElement(By.id("month"));
		// Select m=new Select(month);
		// m.selectByValue("9");
		Thread.sleep(2000);
		// WebElement year = driver.findElement(By.id("year"));
		// Select y=new Select(year);
		// y.selectByValue("1996");
		List<WebElement> days = s.getOptions();
		for (WebElement days1 : days) {
			System.out.println(days1.getText());
		}

	}

}
