package pomTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.SeleniumHome;

class SeleniumTest{
		static {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException{

		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.seleniumhq.org/");
			Thread.sleep(2000);
			SeleniumHome sh=new SeleniumHome(driver);
			sh.sendKeys("java");
			sh.goButton();
			driver.navigate().back();
			sh.clearText();
	
}
	}