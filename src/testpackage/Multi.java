package testpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/acer/Desktop/my_workspace/A.html");
		Thread.sleep(2000);
		WebElement se = driver.findElement(By.id("b"));
		Select s=new Select(se);
		List<WebElement> opt=s.getOptions();
		if(s.isMultiple())
		{
			for(int i=0;i<opt.size();i++)
			{
				s.selectByIndex(i);
			}	
		}
		Thread.sleep(2000);
		s.deselectAll();
		
		
		}
}
