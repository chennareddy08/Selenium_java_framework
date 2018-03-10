package package3_scripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base_class.TestBaseSetup_chrome;
import Pageobjects.FlightFinder;

public class TestFlightfinder extends TestBaseSetup_chrome {
	
	
	@Test
	public void flightbooking() throws InterruptedException {
		FlightFinder ff =new FlightFinder(driver);
		logintest.login();
		ff.flight_type().getAttribute("oneway");
		Select drpdwnp = new Select(ff.passengers());
		drpdwnp.selectByIndex(2);
		Select drpdwnd = new Select(ff.departing_from());
		drpdwnd.selectByIndex(2);
		Select drpdwm = new Select(ff.from_Month());
		drpdwm.selectByIndex(4); 
		Select drpdwd = new Select(ff.fromday());
		drpdwd.selectByIndex(4); 
		Select drpdwa = new Select(ff.arrivingIn());
		drpdwa.selectByIndex(4);
		Select drpdwr = new Select(ff.returnmonth());
		drpdwr.selectByIndex(6);
		Select drpdwrd = new Select(ff.returnday());
		drpdwrd.selectByIndex(6);
	    ff.serviceclass().getAttribute("First class");
	    ff.findflight_button().click();
      
	}

}
