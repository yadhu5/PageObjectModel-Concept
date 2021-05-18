package page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Dashboardpage {
	WebDriver driver;

	// Creating contructor for driver
	public Dashboardpage(WebDriver driver) {
		this.driver = driver;
	}
	// Element lib

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Dashboard')]")
	WebElement DASHBOARD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a")
	WebElement CUSTOMER_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")
	WebElement ADD_CUSTOMER_BUTTON_ELEMENT;
	// INTERACTIVE METHODS

	public void validateDashboardPage() {

		Assert.assertEquals("Dashboard", DASHBOARD_ELEMENT.getText());

	}

	public void clickCustomerButton() {
		CUSTOMER_BUTTON_ELEMENT.click();
	}

	public void clickAddCustomerButton() {
		ADD_CUSTOMER_BUTTON_ELEMENT.click();

	}
}
