package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageResAccount {
	
	@FindBy(id="okta-signin-username")
	WebElement txt_username;
	
	@FindBy(id="okta-signin-password")
	WebElement txt_password;
	
	@FindBy(id="okta-signin-submit")
	WebElement btn_login;
	
	WebDriver driver = null;
	
	public LoginPageResAccount(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}

	public void clickOnLogin() {
		btn_login.click();
	}
}
