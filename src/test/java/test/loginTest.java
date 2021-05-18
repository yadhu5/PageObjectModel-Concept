package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Dashboardpage;
import page.loginPage;
import util.BrowserFactory;

public class loginTest {

	WebDriver driver;

	@Test
	public void validUserloginPage() {

		driver = BrowserFactory.init();
		
		// create object to call loginpage
		
		loginPage LoginPage = PageFactory.initElements(driver, loginPage.class);
		LoginPage.insertUserName("demo@techfios.com");
		LoginPage.insertPassword("abc123");
		LoginPage.clickSigninButton();
		
		Dashboardpage dashboardpage = PageFactory.initElements(driver, Dashboardpage.class);
		dashboardpage.validateDashboardPage();
		
		// calling the BrowserFactory method for closing the website that way we know it validate. 
		BrowserFactory.tearDown();
	}
	
}
