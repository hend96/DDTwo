package Test;

import org.testng.annotations.Test;

import POM.BaseClass;
import POM.PreHome;

public class TestPreHomePage extends BaseClass {
	
	PreHome p ;
	
	
	@Test // Test case that will receive data from the source
	public void Login() {
		
		 p=new PreHome();
		p.clickOnLoginBtn();
		
	}
	
	
}
