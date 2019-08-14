package testpackage;
import java.util.List;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links {
	static 
	{
 System.setProperty("webdriver.gecko.driver","./geckodriver/geckodriver.exe");
	}
	static int count=0;
	public static void main (String[] args) throws IOException, InterruptedException
	{
	    WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		Thread.sleep(2000);
		for(WebElement link:links) {
		String lnk=link.getAttribute("href");
		System.out.println(lnk);
		URL u=new URL(lnk);
		HttpsURLConnection sel=(HttpsURLConnection)u.openConnection();
		if(sel.getResponseCode()==200)
		{
			System.out.println("Link is not broken");
			System.out.println(sel.getResponseCode());
		}
		else
		{
			System.out.println("Link is broken");
			System.out.println(sel.getResponseCode());
}
}
	}
}