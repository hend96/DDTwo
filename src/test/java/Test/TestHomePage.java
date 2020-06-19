package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM.BaseClass;
import POM.HomePage;

public class TestHomePage extends BaseClass {
	
	HomePage p ;
	
	
	
	@DataProvider(name="testData") // here is the source of the data contains two records(each record is email&password) 
	public Object [][]dataSource(){
		
		Object [][] data = {{"hend@gmail.com","asdfg"}, {"hend2@gmail.com","asdfg"}};
		
	    return data;

	}
	
	
	@Test(dataProvider = "testData") // Test case that will receive data from the source
	public void Login(String email, String pass) {
		
		 p=new HomePage();
		p.Login(email, pass);
		p.Logout();
		
	}
	
	
}
