package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) {
		//Set the path of chromedriver.exe
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		//Launch Chrome Browser
		WebDriver driver=new ChromeDriver();
		//Enter the URL
		driver.get("https://www.google.com/");
		//print title
		String title = driver.getTitle();//cntrl+1+entr
		System.out.println("Title of the page is:"+title);
		//print URL
		System.out.println("Url of the page is:"+driver.getCurrentUrl());
		//close the browser
		driver.close();
	}

}