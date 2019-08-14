package testpackage;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy{
		static 
		{
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		}
		public static void main (String[] args) throws InterruptedException, AWTException
		{
		    WebDriver driver = new ChromeDriver();
			driver.navigate().to("http://www.seleniumhq.org");
Thread.sleep(2000);
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("window.scrollBy(1000,200)");
Thread.sleep(2000);
js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
}
}
