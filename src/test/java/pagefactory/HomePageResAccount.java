package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageResAccount {
	
	@FindBy(id="pf-signin-trigger")
	WebElement menu_logout;
	
	WebDriver driver = null;
	
	public HomePageResAccount(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	public void clickOnLogout() {
		menu_logout.click();
	}
}
