package package3_scripts;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base_class.TestBaseSetup_chrome;
import Pageobjects.CreateAccount;
import utility.Common_functions;
import utility.Timestamp;

public class TestCreateAccount extends TestBaseSetup_chrome {
	
	@Test
	public static void create_account()  {
		CreateAccount ca =new CreateAccount(driver);
		
		Timestamp t= new Timestamp();
		System.out.printf(t.email,t.name,t.phone,t.address);
		//ca.registerlink().click();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	
		ca.firstname().click();
		ca.firstname().clear();
		ca.firstname().sendKeys(t.name);
		ca.lastname().click();
		ca.lastname().clear();
		
	
		ca.lastname().sendKeys(t.name);
		ca.phone().click();
		ca.phone().clear();
		ca.phone().sendKeys(t.phone);
		ca.email().clear();
		ca.email().sendKeys(t.email);
		ca.address1().clear();
		ca.address1().sendKeys(t.address);
		ca.address2().sendKeys(t.address);
		ca.city().clear();
		ca.city().sendKeys("Bangalore");
		ca.state().clear();
		ca.state().sendKeys("Karnataka");
		Select drpdnc = new Select(ca.country());
		drpdnc.selectByVisibleText("INDIA");
		ca.username().clear();
		ca.username().sendKeys(t.name);
		ca.password().clear();
		ca.password().sendKeys("8892279018");
		ca.confirm_password().clear();
		ca.confirm_password().sendKeys("8892279018");
		ca.RegisterButton().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assert ca.registerConfirmationMsg().isDisplayed();
		
	}

}
