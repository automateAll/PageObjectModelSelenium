package test;
import org.testng.Assert;
import org.testng.annotations.*;

import flows.DashboardLinksFlow;
import flows.LoginFlow;
import pages.HomePage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

public class ReggieSmokeTest {

	WebDriver driver = null;
	FileInputStream fileInput = null;
	Properties prop = null;
	
	@BeforeTest
	public void setSystemProperties() throws InterruptedException {
		File file = new File ("C:/Users/ABHATTI/eclipse-workspace/PageObjectModelSelenium/src/Configs/config.properties");


		try {
			fileInput = new FileInputStream(file);
			//System.out.println(fileInput);
		}

		catch(FileNotFoundException e) {
			e.printStackTrace();
		}

		prop = new Properties();

		try {
			prop.load(fileInput);
		}

		catch(IOException e) {
			e.printStackTrace();
		}

		System.setProperty("webdriver.chrome.driver", prop.getProperty("driverPath"));
		driver = new ChromeDriver();
				
		
//		driver.switchTo().alert().dismiss();
//		driver.manage().window().fullscreen();


	}
	@BeforeMethod
	public void getURL() throws InterruptedException
	{
		driver.get(prop.getProperty("URL"));
		
	}
	
	//Login Test
	@Test(priority =1)  	
	public void loginTest() {
		LoginFlow lf = new LoginFlow(driver);
		lf.loginMethod("kgehani", "1");
		Assert.assertEquals("Home", driver.getTitle());
	}
	
	//Dashboard links Navigation tests
	@Test(priority= 2)  // My Alerts
	public void homePageDashboardMyAlertsLinkTest() throws InterruptedException {
		DashboardLinksFlow dshbrd = new DashboardLinksFlow(driver);
		dshbrd.clickMyAlerts();
		Assert.assertEquals("Reggie - Alerts", driver.getTitle());		
	}
	
	@Test(priority= 3)  // Alert Metrics
	public void homePageDashboardAlertMetricsLinkTest() throws InterruptedException {
		DashboardLinksFlow dshbrd = new DashboardLinksFlow(driver);
		dshbrd.clickMyAlerts();
		Assert.assertEquals("Reggie - Alerts", driver.getTitle());		
	}

	@AfterMethod
	public void closeURL() {
		
	}
	@AfterTest
	public void closeDriver() {
		driver.close();
		driver.quit();
		
	}

}
