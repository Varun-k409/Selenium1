package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(List.class)
public class DemoItestListener {
	WebDriver driver;
	@BeforeClass
	public void BC()
	{
		Reporter.log("BCmethod",true);
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
		 @BeforeMethod
	public void BeforDemoM()
	{
		Reporter.log("BM",true);
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
	}
	@Test
	public void Demo()
	{
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void Demo2()
	{
		driver.get("https://www.google.com/");
	}
	@AfterMethod
	public void AfterDemoM()
	{
		Reporter.log("AM",true);
		driver.close();
	}
	@AfterClass
	public void AC()
	{
		Reporter.log("ACmethod",true);
	}

}

