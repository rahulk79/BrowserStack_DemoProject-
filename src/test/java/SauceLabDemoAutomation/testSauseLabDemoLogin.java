package SauceLabDemoAutomation;

import java.io.IOException;
import java.util.HashMap;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

import userActions.userAction;



public class testSauseLabDemoLogin {
	public static WebDriver driver ;

	public static final String userName = "";
	public static final String accessKey ="";
	public static final String URL = "https://" + userName +":" + accessKey+ "@hub-cloud.browserstack.com/wd/hub ";
	//public static Properties prop ;
	//public static WebDriverWait webwait ;
	
	
	@BeforeTest
	public void setpage() throws IOException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("browserVersion", "103.0");
        HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
        browserstackOptions.put("os", "Windows");
        browserstackOptions.put("osVersion", "11");
        browserstackOptions.put("projectName", "BS_DEMO");
        browserstackOptions.put("networkLogs", "true");
        browserstackOptions.put("browserstack", browserstackOptions);
        HashMap<String, Object> chromeOptions = new HashMap<String, Object>();
        chromeOptions.put("driver", "2.45");
        browserstackOptions.put("chrome", chromeOptions);
        capabilities.setCapability("bstack:options", browserstackOptions);

		driver = new RemoteWebDriver(new URL(URL), capabilities);

		
		
		}
  
	@Test(description="A user can login successfully",priority=1)
	public void verifyLogin() throws IOException {
		driver = new ChromeDriver();
		userAction.perfromLogin(driver);
		}
	
  @AfterTest
  public void teardown() {
	 driver.quit();
     }	
  
}
