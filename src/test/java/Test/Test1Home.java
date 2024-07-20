package Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Base.TestBase;
import Pages.Page1Home;

public class Test1Home extends TestBase{

	Page1Home home;
	
	@BeforeMethod
	public void setup()
	{
		Initialization();      //jo bhi action perform karna hai uski method call karte hai aur 
		                        //testcase likhte hai
  	home = new Page1Home();
	}
	
	
	@Test(enabled = true)
	public void buyhoodies() throws Exception
	{
		home.Verifyjacket();
	}
	
	
	@AfterMethod
	public void qbrowser()
	{
		driver.quit();      //Screnshot ka code
	}
	
}
