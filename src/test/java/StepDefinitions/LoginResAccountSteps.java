package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pagefactory.HomePageResAccount;
import pagefactory.LoginPageResAccount;


public class LoginResAccountSteps {
	
	WebDriver driver = null;
	LoginPageResAccount login;
	HomePageResAccount home;
	
	@Given("^browser is open$")
	public void browser_is_open() {
		System.out.println("=== I am inside LoginDemoSteps_PF ===");
		System.out.println("Inside step - browser is open");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

	@And("^user is on login page$")
	public void user_is_on_login_page() {
		driver.navigate().to("https://www.one.qa.cox.com/resaccount/home.html"); 
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
		
		login = new LoginPageResAccount(driver);
		
		login.enterUsername(username);
		login.enterPassword(password);
		
	    
	}

	@And("^user clicks on login$")
	public void user_clicks_on_login() {
		login.clickOnLogin();
		
	    
	}

	@Then("^user is navigated to the home page$")
	public void user_is_navigated_to_the_home_page() {
		//driver.findElement(By.id("logout")).isDisplayed();
		home = new HomePageResAccount(driver);
		home.clickOnLogout();
		driver.close();
		driver.quit();
	}


}
