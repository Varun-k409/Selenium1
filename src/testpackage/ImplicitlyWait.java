package testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitlyWait {
	static 
	{
 System.setProperty("webdriver.chrome.driver","./Softwares2/chromedriver.exe");
	}
	public static void main (String[] args)
	{
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement id=driver.findElement(By.xpath("//input[@type=\"email\"]"));
		id.sendKeys("varun");
		WebElement login=driver.findElement(By.id("logingbutton"));
		login.click();
	}

}

