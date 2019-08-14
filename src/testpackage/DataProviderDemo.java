package testpackage;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	@DataProvider
	public String[][] demo()
	{
		String[][] s=new String[3][2];
		s[0][0]="user A";
		s[0][1]="A";
		s[1][0]="user B";
		s[1][1]="B";
		s[2][0]="user C";
		s[2][1]="C";
		return s;
	}
	@Test(dataProvider="demo")
	public void DemoT(String name,String pass) {
		Reporter.log(name+" "+pass,true);
	}

}


/*if data provider is in different class
@Test(dataProvider="demo",dataProviderClass=DataProviderDemo.class)
public void DemoT(String name,String pass) {
	Reporter.log(name+" "+pass,true);
}*/

