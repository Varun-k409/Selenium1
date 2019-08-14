package testpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	@BeforeMethod
	public void BeforeDemoM()
	{
		System.out.println("BM");
		
	}
	@Test(invocationCount=5)  //@Test
	public void Demo()
	{
		System.out.println("Demo");
	}
	@AfterMethod
	public void AfterDemoM()
	{
		System.out.println("AM");
	}

}
