package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PreHome {

	
	WebDriver driver;
	
	public PreHome() {
		
	driver = BaseClass.getDriver();
		
	}
	
	public void clickOnLoginBtn() {
		
		String btn1="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a";
		WebElement button1 = driver.findElement(By.xpath(btn1));
		button1.click();
		
		
	}
}
