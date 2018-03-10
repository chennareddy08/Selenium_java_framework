package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;


import org.testng.annotations.Test;

public class login {
  
	WebDriver driver;
	//By userName = By.name("userName");
	@FindBy(name="userName") WebElement user_name;
	@FindBy(name="password") WebElement pass_word;
	@FindBy(name="login") WebElement login_button;
	
	
public login(WebDriver driver)
	 {
	        this.driver=driver;
	       PageFactory.initElements(driver, this);
	  }
	        
	       
public WebElement username() {
return user_name;
	        	}

public WebElement password() {
	return pass_word;
}


public WebElement loginButton() {
	return login_button;
}










}
  
 

