package SauceLabDemoAutomation;

import java.io.IOException;
import java.util.HashMap;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

import userActions.userAction;



public class testSauseLabDemoLogin {
	public static WebDriver driver ;
    public static final String userName = "herbertgeorge_Xy9Fsv";
	public static final String accessKey = "QDm9h2VdJz9bi2vtKwbp";
	public static final String URL = "https://" + userName +":" + accessKey+ "@hub-cloud.browserstack.com/wd/hub ";
	
	
	
	@BeforeTest
	public void setpage() throws IOException {

		//DesiredCapabilities capabilities = new DesiredCapabilities();

       // capabilities.setCapability("os", "Windows");
       // capabilities.setCapability("osVersion", "10");
       // capabilities.setCapability("browser", "Chrome");
       // capabilities.setCapability("browser_Version", "80");
       // capabilities.setCapability("name", "BS_DEMO");
       
        
       // HashMap<String, Object> chromeOptions = new HashMap<String, Object>();
       // chromeOptions.put("driver", "2.45");
       // HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
       // browserstackOptions.put("os", "Windows");
       // browserstackOptions.put("osVersion", "11");
       // browserstackOptions.put("projectName", "BS_DEMO");
       // browserstackOptions.put("networkLogs", "true");
       // browserstackOptions.put("browserstack", browserstackOptions);
       //  browserstackOptions.put("chrome", chromeOptions);
       // capabilities.setCapability("bstack:options", browserstackOptions);
       // capabilities.setCapability("browserName", "Chrome");
       // capabilities.setCapability("browserVersion", "103.0");

       MutableCapabilities capabilities = new MutableCapabilities();
       HashMap<String, Object> bstackOptions = new HashMap<String, Object>();
       capabilities.setCapability("browserName", "Chrome");
       bstackOptions.put("os", "Windows");
       bstackOptions.put("osVersion", "11");
       bstackOptions.put("browserVersion", "latest");
       bstackOptions.put("consoleLogs", "info");
       bstackOptions.put("resolution", "1024x768");
       capabilities.setCapability("bstack:options", bstackOptions);
       driver = new RemoteWebDriver(new URL(URL), capabilities);
       
    
    }
  
	@Test(description="A user can login successfully",priority=1)
	public void verifyLogin() throws IOException {
        
		userAction.perfromLogin(driver);
		}
	
  @AfterTest
  public void teardown() {
	 driver.quit();
     }	
  
}
