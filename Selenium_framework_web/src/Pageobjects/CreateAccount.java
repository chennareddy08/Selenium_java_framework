package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateAccount {

	WebDriver driver;
	@FindBy(xpath="//a[contains(text(),'Register \\n                    here')]") WebElement Register_link;
	@FindBy(name="firstName") WebElement first_Name;
	@FindBy(name="lastName") WebElement last_Name;
	@FindBy(name="phone") WebElement Phone;
	@FindBy(id="userName") WebElement Email;
	@FindBy(name="address1") WebElement Address1;
	@FindBy(name="address2") WebElement Address2;
	@FindBy(name="city") WebElement City;
	@FindBy(name="state") WebElement State;
	@FindBy(name="postalCode") WebElement postCode;
	@FindBy(name="country") WebElement Country;
	@FindBy(name="email") WebElement Username;
	@FindBy(name="password") WebElement passWord;
	@FindBy(name="confirmPassword") WebElement confirmPassword;
	@FindBy(name="register") WebElement RegisterButton;
	@FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(3) > td > p:nth-child(2) > font") WebElement register_confimration_msg;
	




public CreateAccount(WebDriver driver) {
	this.driver=driver;
	
	PageFactory.initElements(driver, this);
	
}



public WebElement registerlink() {
	return Register_link;
}



public WebElement firstname() {
	return  new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(first_Name));
}


public WebElement lastname() {
	return new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(last_Name));
}


public WebElement phone() {
	return new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(Phone));
}


public WebElement email() {
	return new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(Email));
}


public WebElement address1() {
	return new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(Address1));
	
}

public WebElement address2() {
	return new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(Address2));
}


public WebElement city() {
	return new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(City));
}

public WebElement state() {
	return new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(State));
}

public WebElement postcode() {
	return new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(postCode));
}


public WebElement country() {
	return new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(Country));
}


public WebElement username() {
	return new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(Username));
}

public WebElement password() {
	return new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(passWord));
}

public WebElement confirm_password() {
	return new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(confirmPassword));
}

public WebElement RegisterButton() {
	
	return new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(RegisterButton));
}

public WebElement registerConfirmationMsg() {
	
	return new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(register_confimration_msg));
}

}
