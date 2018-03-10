package Base_class;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utility.Common_functions;
public class TestBaseSetup_firefox {
 
 protected static WebDriver driver ;
  
 //@BeforeMethod defines this method has to run before every @Test methods
 @BeforeClass
 public void openbrowser() { 
 System.setProperty("webdriver.gecko.driver", "/Users/chennareddy/eclipse-workspace/Selenium_framework_web/drivers/geckodriver");
  driver = new FirefoxDriver();
  
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.manage().window().maximize();
  driver.get("http://newtours.demoaut.com/");
  Common_functions.driver = driver;
 }


 /*@Test
 public void testmethodone() {
   String title = driver.getTitle();
   System.out.print("Current page title is : "+title);
   
 }*/
 

 @AfterClass
 public void closebrowser() {
  System.out.print("\nBrowser close");
  driver.quit();
 }
}