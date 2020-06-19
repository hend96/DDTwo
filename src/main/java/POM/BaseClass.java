package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseClass {

	static WebDriver driver;
	
	@BeforeTest	
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url="http://automationpractice.com/index.php";
				
	driver.get(url);
		
	}
	public static WebDriver getDriver()
	{
		
		
		return driver;
	}
	
	@AfterTest
	public void tearDown() {
		// driver.quit();

	}
	
	
}
