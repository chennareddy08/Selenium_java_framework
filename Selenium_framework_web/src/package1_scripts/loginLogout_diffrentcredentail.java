package package1_scripts;

import org.testng.annotations.DataProvider;
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

public class loginLogout_diffrentcredentail extends TestBaseSetup_chrome {


	
	//This method will return two dimensional array.
	 //This method behaves as data provider for LogIn_Test method.	
@DataProvider	
public Object[][] loginCredentials(){
	//Created two dimensional array with 4 rows and 2 columns.
	  //4 rows represents test has to run 4 times.
	  //2 columns represents 2 data parameters.
	
	Object[][] cre =  new Object[4][2];
	
	cre[0][0] ="chenna08";
	cre[0][1] ="123456";
	
	cre[1][0] ="chenna2";
	cre[1][1] ="123456";
	
	cre[2][0]= "chenna3";
	cre[2][1] ="123456";
	
	cre[3][0]= "chenna4";
	cre[3][1] ="123456";
	
	return cre;
}

//Give data provider method name as data provider.
//Passed 2 string parameters as loginCredentials() returns 2 parameters In object.

@Test(dataProvider ="loginCredentials")
public void login(String user_id,String pass)  	{

login l=new login(driver);
	
	if(!Common_functions.performclick( l.username())) 
	{
  	  System.out.println("The field is visible");
    }
	l.username().clear();
	l.username().sendKeys(user_id);
	l.password().clear();
	l.password().sendKeys(pass);
	l.loginButton().click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String title = driver.getTitle();
	FlightFinder ff =new FlightFinder(driver);
	ff.logout().click();
	
	}
	
	
		
	}



