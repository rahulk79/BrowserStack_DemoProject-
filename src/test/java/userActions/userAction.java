package userActions;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.Assertion;

import PageLibrary.saucelabdemo;
import dev.failsafe.internal.util.Assert;
import utility.fileUtil;


public class userAction {
	
	public static WebDriverWait webwait = null ;
	
	public static void perfromLogin(WebDriver driver) throws IOException, InterruptedException {
		webwait = new WebDriverWait(driver, Duration.ofSeconds(60));
		driver.get(fileUtil.readProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		webwait.until(ExpectedConditions.elementToBeClickable(saucelabdemo.UserName(driver))).sendKeys(fileUtil.readProperty("user_emailid"));
		saucelabdemo.Password(driver).sendKeys(fileUtil.readProperty("password"));
		saucelabdemo.Click_SignIn(driver).click();
		Thread.sleep(5000);
		System.out.println("User1 test passed");
	}

	public static void verifyDoingERPLoginButton(WebDriver driver) throws InterruptedException {
		webwait = new WebDriverWait(driver, Duration.ofSeconds(60));
        driver.get("https://doingerp.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		webwait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@class='fre-login']"))));
		Thread.sleep(5000);
		System.out.println("User2 test passed");
		
		
	}
	
	
	
}
   	


