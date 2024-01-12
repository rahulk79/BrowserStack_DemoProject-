package MetribesAutomation.MetribesAutomation;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import mtribesPageLibrary.mtribesQASandboxPage;
import userActions.userAction;
import utility.fileUtil;


public class testMtribesApp {
	public static WebDriver driver ;
	//public static Properties prop ;
	//public static WebDriverWait webwait ;
	
	
	@BeforeTest
	public void setpage() throws IOException {
		WebDriverManager.chromedriver().setup();
		
		}
  
	@Test(description="A user can login and logout of mtribes successfully",priority=1)
	public void verifyLoginAndLogout() throws IOException {
		driver = new ChromeDriver();
		userAction.perfromLogin(driver);
		Assert.assertTrue(mtribesQASandboxPage.Welcome_Message(driver).getText()
			  .contains(fileUtil.readProperty("user_fullname")), "User login is failing ");
		userAction.performLogout(driver);
		Assert.assertTrue(driver.getTitle().contains("Real-time UX control"), "User logout is failing");
		}
	
  @AfterTest
  public void teardown() {
	 driver.quit();
     }	
  
}
