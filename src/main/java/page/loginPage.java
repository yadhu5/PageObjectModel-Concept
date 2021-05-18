package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPage {

	WebDriver driver;
	
	//with the help of constructor parameterized
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Element Libray
	
	@FindBy(how=How.XPATH,using="//*[@id=\"username\"]") WebElement USERNAME_FIELD;
	@FindBy(how=How.XPATH,using="//*[@id=\"password\"]") WebElement PASSWORD_FIELD;
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/form/div[3]/button") WebElement SIGN_IN_BUTTON;
	
			
	// interactive Methods
	public void insertUserName(String username) {
		
		USERNAME_FIELD.sendKeys(username);
		
	}
	public void insertPassword(String password) {
		
		PASSWORD_FIELD.sendKeys(password);
		
	}
	public void clickSigninButton() {
		
		SIGN_IN_BUTTON.click();
	}
	// same like about above but not calling this method
	public void signInOperation(String username, String password) {
		USERNAME_FIELD.sendKeys(username);
		PASSWORD_FIELD.sendKeys(password);
		SIGN_IN_BUTTON.click();
	}
}
