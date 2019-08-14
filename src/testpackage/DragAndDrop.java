package testpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	static 
	{
 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main (String[] args) throws InterruptedException
	{
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		driver.navigate().to("https://www.jqueryui.com/slider");
		Thread.sleep(2000);
		WebElement frame= driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		WebElement ele= driver.findElement(By.id("slider"));
		a.dragAndDropBy(ele,400,0).perform();
		Thread.sleep(2000);
		a.dragAndDropBy(ele,-150,0).perform();
		a.doubleClick(ele).perform();
		
	

}
}
