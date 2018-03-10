package Base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class baseseup_multi_browser2 {
protected static WebDriver driver;
	
@BeforeClass	
@Parameters ({"browser"}) 
public void openbrowser(String browser) {
	
	if (browser.equals("FFB")) {
		System.out.println("test will execute in firefox browser");
		System.setProperty("webdriver.chrome.driver", "/Users/chennareddy/eclipse-workspace/Selenium_framework_web/drivers/geckodriver");
		driver = new FirefoxDriver();
		}
	else if (browser.equals("CB")) {
		System.out.println("test will excute in chrome browser");
		System.setProperty("webdriver.chrome.driver", "/Users/chennareddy/eclipse-workspace/Selenium_framework_web/drivers/chromedriver");
		driver = new ChromeDriver();
	}
	
	driver.manage().window().maximize();
	driver.get("http://newtours.demoaut.com/");
	}


@AfterClass 
public void closebrowser(){
  driver.quit();  
}

}
