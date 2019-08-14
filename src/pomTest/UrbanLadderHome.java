package pomTest;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import pom.UrbanLadderTest;

public class UrbanLadderHome {
		static {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		}

		public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
			int row=0;
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			Actions a=new Actions(driver);
			driver.navigate().to("https://www.urbanladder.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
			Thread.sleep(2000);
			List<WebElement> item = driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]/li"));
			for (WebElement ele : item) {
				String menu=ele.getText();
				System.err.println(menu);
				UrbanLadderTest.Wr("Sheet1",row,0,menu);
				a.moveToElement(ele).build().perform();
				row++;
				Thread.sleep(2000);
				List<WebElement> sub = driver.findElements(By.xpath("//span[contains(.,'"+menu+"')]/parent::li/descendant::ul[@class='inline-list left']/descendant::ul/li"));
				for (WebElement ele1 : sub) {
					System.out.println(ele1.getText());
					UrbanLadderTest.Wr("Sheet1",row,1,ele1.getText());
					row++;
					Thread.sleep(2000);
				}		

}
		}
}
