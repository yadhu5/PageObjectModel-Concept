package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.Dashboardpage;
import page.loginPage;
import util.BrowserFactory;

public class AddCustomerTest {

	WebDriver driver;

	@Test
	public void validUserShouleBeAbleToAddCustomer() {

		driver = BrowserFactory.init();

		// create object to call loginpage

		loginPage LoginPage = PageFactory.initElements(driver, loginPage.class);
		LoginPage.insertUserName("demo@techfios.com");
		LoginPage.insertPassword("abc123");
		LoginPage.clickSigninButton();
		
		Dashboardpage dashboardpage = PageFactory.initElements(driver, Dashboardpage.class);
		dashboardpage.validateDashboardPage();
		dashboardpage.clickCustomerButton();
		dashboardpage.clickAddCustomerButton();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.insertFullName("XYZComp");
		addCustomerPage.chooseCompanyOption("Google");
		addCustomerPage.insertPhoneNumber("858-585-5");
		addCustomerPage.insertEmail("abc@gmail.com");
		
	
		
	}
}
