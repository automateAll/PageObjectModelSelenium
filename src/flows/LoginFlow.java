package flows;

import org.openqa.selenium.WebDriver;

import pages.LoginPage;

public class LoginFlow {

	WebDriver driver = null;
	
	public LoginFlow(WebDriver driver) {
		this.driver = driver;
	}
	public void loginMethod(String username, String password) {
		System.out.println("Inside loginMethod of loginFlow");
		System.out.println(username+password);
		LoginPage login = new LoginPage(driver);		
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickLogin();
		 
	}
}
