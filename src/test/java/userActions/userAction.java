package userActions;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import PageLibrary.saucelabdemo;
import utility.fileUtil;


public class userAction {
	
	public static WebDriverWait webwait = null ;
	
	private static Logger log = LogManager.getLogger(userAction.class);
	
	
	public static void perfromLogin(WebDriver driver) throws IOException {
		webwait = new WebDriverWait(driver, Duration.ofSeconds(60));
		driver.get(fileUtil.readProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		log.debug("Navigated to login page");
	    webwait.until(ExpectedConditions.elementToBeClickable(saucelabdemo.UserName(driver))).sendKeys(fileUtil.readProperty("user_emailid"));
		saucelabdemo.Password(driver).sendKeys(fileUtil.readProperty("password"));
		saucelabdemo.Click_SignIn(driver).click();
		log.debug("User loggedin");
		
		}
	
	
	
}
   	


