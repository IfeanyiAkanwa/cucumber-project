//package StepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import junit.framework.Assert;
//
//public class LoginSteps {
//	
////	public static ThreadLocal <WebDriver> driver = new ThreadLocal <WebDriver>();
//	
//	static WebDriver driver = new ChromeDriver();
//	
//	static String driverPath = System.getProperty("user.dir");
//	
//	public static WebDriver getDriver(){
//		return driver;
//	}
//
//	@Given("Open browser")
//	public void open_browser() {
//		
//		//System.setProperty("webDriver.chrome.driver" , driverPath+"/src/main/resources/drivers/chromedriver.exe");
//		
//		getDriver().manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		
//		getDriver().manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		
//		getDriver().manage().window().maximize();
//
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() throws InterruptedException {
//		
//		getDriver().navigate().to("http://testphp.vulnweb.com/login.php");
//		Thread.sleep(500);
//
//	}
//	
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
//
//		getDriver().findElement(By.name("uname")).sendKeys(username);
//		Thread.sleep(500);
//		getDriver().findElement(By.name("pass")).sendKeys(password);
//	}
//
//	@And("click on the login button")
//	public void click_on_the_login_button() { 
//		getDriver().findElement(By.xpath("//*[@id=\"content\"]/div[1]/form/table/tbody/tr[3]/td/input")).click();
//	}
//
//	@Then("user should successfully login")
//	public void user_should_successfully_login() {
//		
//		getDriver().findElement(By.name("update")).isDisplayed();
////		String successLoginAssertion = getDriver().findElement(By.id("pageName")).getText();
////		Assert.assertEquals("ulkwke (test)", successLoginAssertion);
//		
//	//	getDriver().close();
//	//	getDriver().quit();
//
//	}
//	
//
//
//}
