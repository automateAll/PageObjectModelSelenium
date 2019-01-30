package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	
	public WebDriver driver = null;
	
	
//	public WebElement username = driver.findElement(By.id("Username"));
//	public WebElement password = driver.findElement(By.id("Password"));
//	public WebElement loginButton = driver.findElement(By.id("loginButton"));
	
	private static final By username = By.id("Username");
	private static final By pswd = By.id("Password");
	private static final By lgnBtn = By.id("loginButton");
	
	public LoginPage(WebDriver driver) {
		//System.out.println("Inside LoginPage constructor....");
		this.driver = driver;
	}
	
	public void enterUsername(String userName) {
		System.out.println("Inside enterUserName method");
		System.out.println(userName);
	
		WebElement u = driver.findElement(username);
		u.sendKeys(userName);
	}
	
	public void enterPassword(String passWord) {
		WebElement p = driver.findElement(pswd);
		p.sendKeys(passWord);
	}
	
	public void clickLogin() {
		driver.findElement(lgnBtn).click();
	}
}
