package testpackage;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class  RedBus{
	static 
	{
 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main (String[] args) throws InterruptedException, AWTException
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
	    WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		
}
}
