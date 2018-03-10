package package2_scripts;

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
import Base_class.TestBaseSetup_firefox;
import Base_class.TestBaseSetup_safari;
import Base_class.baseseup_multi_browser;
import Pageobjects.FlightFinder;
import Pageobjects.login;
import utility.Common_functions;

public class dummy extends TestBaseSetup_firefox {

	@Test(priority=0)
public static void Login()  	{

login l=new login(driver);
	
	l.username().clear();
	l.username().sendKeys("chenna08");
	l.password().clear();
	l.password().sendKeys("123456");
	l.loginButton().click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String title = driver.getTitle();
	System.out.println(title);
	
	
	
	}
	
	@Test(priority=1)
	public  void logout() {
		FlightFinder ff =new FlightFinder(driver);
		
		ff.logout().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
}
