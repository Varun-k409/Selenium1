package testpackage;

import java.util.List;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Acti {
	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException

	{

		WebDriver driver = new ChromeDriver();// casting
		driver.manage().window().maximize();// maximize the browser window
		Actions a = new Actions(driver);
		driver.navigate().to("https://demo.actitime.com/login.do");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@onclick=\"openHelpAndSupportMenu(event)\"]/div")).click();
		driver.findElement(By.xpath(
				"//div[@id=\"popup_menu_support\"]/descendant::ul/li/a[@onclick=\"MenuHandler.openAbout(); return false;\"]"))
				.click();
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.xpath("//td[@class=\"aboutLinks\"]/a[1]"));

		System.out.println(ele.getText());
	}
}