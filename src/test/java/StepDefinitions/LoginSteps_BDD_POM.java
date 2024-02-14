package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.loginPage;

public class LoginSteps_BDD_POM {
	
//	public static ThreadLocal <WebDriver> driver = new ThreadLocal <WebDriver>();
//	static String driverPath = System.getProperty("user.dir");
	
	static WebDriver driver = new ChromeDriver();
	
	public static WebDriver getDriver(){
		return driver;
	}
	
	loginPage login = new loginPage(getDriver());

	@Given("Open browser")
	public void open_browser() {
		
		//System.setProperty("webDriver.chrome.driver" , driverPath+"/src/main/resources/drivers/chromedriver.exe");
		
		getDriver().manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		getDriver().manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		getDriver().manage().window().maximize();

	}

	@And("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		
		getDriver().navigate().to("http://testphp.vulnweb.com/login.php");
		Thread.sleep(500);  

	}
	
	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		login.enterUsername(username);
		Thread.sleep(500);
		login.enterPassword(password);

	}

	@And("click on the login button")
	public void click_on_the_login_button() { 
		login.clickLogin();
	}

	@Then("user should successfully login")
	public void user_should_successfully_login() {
		//confirm login successful 
		login.loginConfirmation();

		
		getDriver().close();
	//	getDriver().quit();

	}
	


}
