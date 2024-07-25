package base_Class_Adac;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils_HealthCare.Utils_class;

public class Baseclass extends Utils_class  {
@BeforeMethod
	public void browserlaunch() {
		// TODO Auto-generated method stub
		
		browserlaunch("chrome");
		driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
	}

//	@AfterMethod
//	public void browserclose() 	{
//		
//	// TODO Auto-generated method stub
//driver.close();
//	}
}
