package SauceLabDemoAutomation;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import userActions.userAction;

public class testSauseLabDemoLogin {
	public static WebDriver driver ;
  	
	@BeforeSuite(groups= {"User1","User2"})
	public void setpage() throws IOException {
		WebDriverManager.chromedriver().setup();
		 ChromeOptions options = new ChromeOptions();
         options.addArguments("--remote-allow-origins=*");
		 options.addArguments("start-maximized");
         driver = new ChromeDriver(options);}
  
	@Test(description="A user can login successfully",priority=1, groups= {"User1"})
	public void verifyLogin() throws Exception {
        userAction.perfromLogin(driver);
		}

	@Test(description="Verify DoingERP login button",priority=2, groups= {"User2"})
	public void verifyDoingERPLoginButton() throws InterruptedException {
		userAction.verifyDoingERPLoginButton(driver);
	}
	
    @AfterSuite (groups= {"User1","User2"})
    public void teardown() {
	 driver.quit();
     }	
  
}
