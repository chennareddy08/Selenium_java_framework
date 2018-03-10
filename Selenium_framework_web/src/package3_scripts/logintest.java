package package3_scripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base_class.TestBaseSetup_chrome;
import Pageobjects.FlightFinder;
import Pageobjects.login;
import utility.Common_functions;

public class logintest extends TestBaseSetup_chrome {

	@Test
public static void login()  	{

login l=new login(driver);
	
	if(!Common_functions.performclick( l.username())) 
	{
  	  System.out.println("The field is visible");
    }
	l.username().clear();
	l.username().sendKeys("chenna08");
	l.password().clear();
	l.password().sendKeys("123456");
	l.loginButton().click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String title = driver.getTitle();
	
	}
	
	@Test
	public  void logout() {
		FlightFinder ff =new FlightFinder(driver);
		login();
		ff.logout().click();
		
	}
	
	
}
