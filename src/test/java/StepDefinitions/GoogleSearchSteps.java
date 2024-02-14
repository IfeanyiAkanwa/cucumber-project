package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class GoogleSearchSteps {
	
	//public static final int waitTime = 60;
	
	WebDriver driver = null;
	String driverPath = System.getProperty("user.dir");
	//WebDriverWait wait = new WebDriverWait(driver, waitTime);

	@Given("browser is open")
	public void browser_is_open() {
		
		System.out.println("Inside - browser is open");	
		
		
		System.setProperty("webdriver.chrome.driver" , driverPath+"/src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		}

	@And("User is on google search page")
	public void user_is_on_google_search_page() throws InterruptedException {
		driver.navigate().to("https://google.com");
		Thread.sleep(500);
		//driver.findElement(By.xpath("//div[contains(text(),'Accept all')]")).click(); 
		
		driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();

	}

	@When("User enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Automation step by step tutorial");
		

	}

	@And("hits enter")
	public void hits_enter() {

	//	driver.findElement(By.className("gNO89b")).click();
		
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
	}

	@And("user is navigated to search result")
	public void user_is_navigated_to_search_result() {
		String searchPageAssertion = driver.findElement(By.xpath("//h3[contains(text(),'Automation Step by Step: NEVER STOP LEARNING')]")).getText();
		Assert.assertEquals("Automation Step by Step: NEVER STOP LEARNING", searchPageAssertion);
		
		driver.getPageSource().contains("Automation Step by Step: NEVER STOP LEARNING");

	}

	@Then("close driver")
	public void close_driver() {
		driver.close();
	}

}
