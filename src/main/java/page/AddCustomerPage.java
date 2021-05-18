package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {
	WebDriver driver;

	// Creating contructor for driver
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	// Element lib

	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement USERNAME_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']")
	WebElement COMPANY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement EMAIl_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	WebElement PHONE_NO_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	WebElement ADDRESS_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	WebElement CITY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	WebElement STATE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='zip']")
	WebElement ZIP_CODE_LOCATOR;
	@FindBy(how=How.XPATH,using = "//*[@id=\"select2-country-container\"]")
	WebElement COUNTRY_FIELD_LOCATOR;
// interactive method
	public void insertFullName(String FullName) {
		
		int generatenumber = randomGenerator(100);
		USERNAME_FIELD_LOCATOR.sendKeys(FullName+generatenumber);

	}

	public void chooseCompanyOption(String company) {	
		selectDropDown(COMPANY_FIELD_LOCATOR,company);
	}
	public void insertEmail(String email) {
		int generatenumber = randomGenerator(100);
		EMAIl_FIELD_LOCATOR.sendKeys(generatenumber+email);
		
	}
	public void insertPhoneNumber(String phone) {
		int generatenumber = randomGenerator(100);
		PHONE_NO_LOCATOR.sendKeys(phone+generatenumber);
		
	}
	
	public void chooseCountryOption(String country) {
		selectDropDown(COUNTRY_FIELD_LOCATOR, country);
		
	}


}
