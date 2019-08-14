package testpackage;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru99 {
	static 
	{
 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main (String[] args) throws InterruptedException, AWTException
	{
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		driver.navigate().to("http://www.demo.guru99.com/v1/index.php#");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement login=driver.findElement(By.xpath("//input[@name=\"btnLogin\"]"));
		login.click();
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
}
}