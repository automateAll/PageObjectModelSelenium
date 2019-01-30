package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	
	private static final By myAlerts = By.xpath("//*[@id='iconsDescriptionAlerts']");  ////*[@id="iconsDescriptionAlerts"]
	//private static final By alertMetrics = By.id("metricsOthers-newIcon");
	
	WebDriver driver = null;
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickMyAlerts() {
		System.out.println("Inside HomePage clickMyAlert()...2");
		WebElement myAlertsLink = driver.findElement(myAlerts);
		System.out.println(myAlertsLink.toString());
		myAlertsLink.click();
//		WebDriverWait wait = new WebDriverWait(driver, 10);	 
//		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
}
