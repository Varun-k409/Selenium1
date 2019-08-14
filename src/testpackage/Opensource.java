package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opensource {
	static 
	{
 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main (String[] args)
	{
	    ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		/*driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.partialLinkText("account?")).click();*/
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rghhfd");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
		
		driver.findElement(By.xpath("//input[@aria-label='Log In']")).click();
		
	
	}

}

