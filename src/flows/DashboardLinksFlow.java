package flows;

import org.openqa.selenium.WebDriver;

import pages.HomePage;

public class DashboardLinksFlow {

	WebDriver driver = null;
	public DashboardLinksFlow(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickMyAlerts() {
		
		System.out.println("Inside clickMyAlert()....1");
	HomePage hmpg = new HomePage(driver);
	hmpg.clickMyAlerts();
	
	}
}
