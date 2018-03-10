package utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import Pageobjects.login;


public class Common_functions {
	//Initialization mandatory
public static WebDriver driver;
	
	
public static boolean performclick(WebElement element2click) {
	if (driver==null){
	System.out.print("Common Function driver not initialized");
	return false;
    }
	new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(element2click));
	if (element2click ==null) {
		element2click.click();
		return true;
	}
	return false;}
	
	
	
public static boolean waitForElement(WebElement element) {
if (driver==null)	{
	System.out.print("Common Function driver not initialized");
	return false;
}
	new WebDriverWait(driver,5).until(ExpectedConditions.visibilityOfElementLocated((By) element));
	if (element!=null) {
		return true;
	}
 return false;
}


public static boolean isElementPresent(final WebElement element2verify, String elementName) {
	
	if(element2verify!=null && element2verify.isDisplayed()){
  	  
		System.out.println(elementName+" is Visible");
  	  return true;
  	  }
    else{
  	  System.out.println(elementName+" is InVisible");
  	  return false;
  	  }}


public static boolean home(CharSequence[] e1, CharSequence[] e2) {
	login l =new login(driver);
	 if(driver == null)
	{
		System.out.println("Common Function driver not initialized");
		return false;
	}
if(e1!=null && e2!=null){
		l.username().sendKeys(e1);
		l.password().sendKeys(e2);
		return true;
	}
	return false;
}

/*
public static boolean selectradio_button(WebElement list,String value) {
	
	Select listbox =new Select(list);
	listbox.selectByValue(value);
	return false;
*/

}

