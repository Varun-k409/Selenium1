package testpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Java {
	static 
	{
 System.setProperty("webdriver.chrome.driver","./Softwares2/chromedriver.exe");
	}
	public static void main (String[] args) throws InterruptedException, AWTException
	{
	    ChromeDriver driver = new ChromeDriver();
	    Actions a=new Actions(driver);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		WebElement ele=driver.findElement(By.xpath("//div[@class=\"kno-ecr-pt kno-fb-ctx PZPZlf gsmt\"]"));
		a.doubleClick(ele).perform();
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_CONTROL);
		
		
		
		
		
		
		
	}		

}
