package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	
	public HomePage() {
		
	driver = BaseClass.getDriver();
		
	}
	
	public void Login(String emailParam, String passwordParam) {
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		String btn1="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a";
	
		String emailPath="//*[@id=\"email\"]";
		String passwordPath="//*[@id=\"passwd\"]";
		String loginBtn="//*[@id=\"SubmitLogin\"]";
	
		
		WebElement button1 = driver.findElement(By.xpath(btn1));
		button1.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(emailPath)));
		WebElement email = driver.findElement(By.xpath(emailPath));
		email.sendKeys(emailParam);
		
		WebElement password = driver.findElement(By.xpath(passwordPath));
		password.sendKeys(passwordParam);
		

		WebElement loginButton = driver.findElement(By.xpath(loginBtn));
		loginButton.click();
		
	}
	
    public void Logout() {
		
    	WebElement logout=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a"));
    	logout.click();
    	
		
	}
	
	

}
