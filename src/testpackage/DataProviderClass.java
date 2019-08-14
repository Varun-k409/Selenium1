package testpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DataProviderClass {
	@Test(dataProvider="demo",dataProviderClass=DataProviderDemo.class)
	public void DemoT(String name,String pass) {
		Reporter.log(name+" "+pass,true);

}
}
