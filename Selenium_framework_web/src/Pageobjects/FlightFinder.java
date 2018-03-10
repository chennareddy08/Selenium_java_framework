package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightFinder {
    WebDriver driver;
	@FindBy(name="tripType") WebElement flighttype;
    @FindBy(name="passCount") WebElement Passengers;
    @FindBy(name="fromPort") WebElement departingFrom;
	@FindBy(name="fromMonth") WebElement on_Month;
	@FindBy(name="fromDay") WebElement fromDay;
	@FindBy(name="toPort") WebElement ArrivingIn;
	@FindBy(name="toMonth") WebElement return_month;
	@FindBy(name="toDay") WebElement return_day;
	@FindBy(name="servClass") WebElement service_class;
	@FindBy(name="airline") WebElement airline;
	@FindBy(name="findFlights") WebElement findflightButton;
	@FindBy(linkText="SIGN-OFF") WebElement sign_off;
	@FindBy(xpath="/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img") WebElement  FlightfindierHeader;
	
	public FlightFinder(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
	
	
	
public WebElement flight_type() {
	return flighttype;
}
	
public WebElement passengers() {
	return Passengers;
}

public WebElement departing_from() {
	return departingFrom;
}

public WebElement from_Month() {
	return on_Month;
}


public WebElement fromday() {
	return fromDay;
}


public WebElement arrivingIn() {
 return ArrivingIn;
}


public WebElement returnmonth() {
	return return_month;
}

public WebElement returnday() {
	
	return return_day;
}


public WebElement serviceclass() {
	return service_class;
}


public WebElement airLine() {
	return airline;
}


public WebElement findflight_button() {
	return findflightButton;
}



public WebElement logout() {
	return sign_off;
}

public WebElement flightFindierHeader()
{
	return FlightfindierHeader;
			}




}
