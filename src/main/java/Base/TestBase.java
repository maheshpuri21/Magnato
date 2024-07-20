package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;  //automation practice , demo sos, magento

public class TestBase {    //Browser initialization code 
	                       //if else condition ,, browser name change kar sakte hai

		public static WebDriver driver;
		
		public void Initialization()
		{
			WebDriverManager.chromedriver().setup();    //driver open the chromedriver
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://magento.softwaretestingboard.com/");
			
		}
	}
