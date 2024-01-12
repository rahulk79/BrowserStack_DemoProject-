package mtribesPageLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mtribesLoginPage {
	
	private static WebElement element = null ;
	
    public static WebElement UserName (WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		return element;
	}
	
	public static WebElement Password (WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		return element;
	}
	
	public static WebElement Click_SignIn (WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@id=\"login-button\"]"));
		return element;
	}
	
	
	
}
