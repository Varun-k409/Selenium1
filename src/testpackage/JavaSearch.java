package testpackage;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaSearch {
	static 
	{
 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main (String[] args) throws InterruptedException, AWTException
	{
	    ChromeDriver driver = new ChromeDriver();
	    Actions a=new Actions(driver);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("java");
		
		List<WebElement> sug=driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		for(WebElement namesout:sug)
		{
			System.out.println(namesout.getText());
		}
		sug.get(2).click();

}
}
