package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
		static 
		{
	 System.setProperty("webdriver.gecko.driver","./Softwares2/geckodriver.exe");
		}
		public static void main (String[] args)
		{
		    WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.google.com/");
			WebElement id=driver.findElement(By.name("q"));
			id.sendKeys("java",Keys.ENTER);
}
}
