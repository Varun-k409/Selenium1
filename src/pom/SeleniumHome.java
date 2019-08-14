package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumHome{
	@FindBy(id="q")
	private WebElement search;
	@FindBy(xpath="//input[@id='submit']")
	private WebElement go;
	public SeleniumHome(WebDriver driver) {
		PageFactory.initElements(driver,this);	
	}
	public void sendKeys(String st)
	{
		search.sendKeys(st);;
	}
	
	public void goButton()
	{
		go.click();
	
	}
	public void clearText()
	{
		search.clear();
	
	}	
}