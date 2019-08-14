
	package testpackage;

	import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

	public class MyntraList {
		static {
			System.setProperty("webdriver.chrome.driver", "./Softwares2/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			
			
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--disable-notifications");
		    WebDriver driver = new ChromeDriver(co);
		    Actions a=new Actions(driver);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.navigate().to("https://www.Myntra.com/");
			Thread.sleep(2000);
			List<WebElement> item = driver.findElements(By.xpath("//nav[@class=\"desktop-navbar\"]/descendant::div"));
			for (WebElement ele : item) {
				String menu=ele.getText();
				menu.substring(1).toLowerCase();
				System.out.println(menu);
				a.moveToElement(ele).build().perform();
				Thread.sleep(2000);
				List<WebElement> sub = driver.findElements(By.xpath("//a[contains(.,'Men')]/parent::div[@class='desktop-navLink']/descendant::ul[@class='desktop-navBlock']/li"));
				for (WebElement submenus : sub) {
					System.out.println(submenus.getText());
					
				}
				
		}
	}
	}

