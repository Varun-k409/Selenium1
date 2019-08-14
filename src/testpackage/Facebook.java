package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook {
	static 
	{
 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main (String[] args)
	{
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		WebElement id=driver.findElement(By.id("email"));
		id.sendKeys("varun");
		WebElement login=driver.findElement(By.id("pass"));
		login.sendKeys("123");
		Actions a=new Actions(driver);
		WebElement p=driver.findElement(By.id("pass"));
		a.contextClick(p).perform();
		
	
	}

}

