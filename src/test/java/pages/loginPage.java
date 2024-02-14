package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class  loginPage {
	
	WebDriver driver;
	
	By username_txt = By.name("uname");
	By password_txt = By.name("pass");
	By loginbtn = By.xpath("//*[@id=\"content\"]/div[1]/form/table/tbody/tr[3]/td/input");
	By loginConfirmation = By.name("update");
	By successText = By.id("pageName"); 
	By success = By.xpath("//h2[contains(text(), 'John Smith']");
	
//	String successLoginAssertion = getDriver().findElement(By.id("pageName")).getText();
//	Assert.assertEquals("ulkwke (test)", successLoginAssertion);
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void enterUsername(String username) {
		driver.findElement(username_txt).sendKeys(username);
		
	}
	
	public void enterPassword(String password) {
		driver.findElement(password_txt).sendKeys(password);
		
	}
	public void clickLogin() {
		driver.findElement(loginbtn).click();
		
	}
	public void loginConfirmation() {
		driver.findElement(loginConfirmation).isDisplayed();
//		String loginSuccessText = driver.findElement(successText).getText();
//		Assert.assertEquals("John Smith (test)", loginSuccessText);
		
		
	}
	
	public void validLogin(String username, String password) {
		driver.findElement(username_txt).sendKeys(username);
		driver.findElement(password_txt).sendKeys(password);
		driver.findElement(loginbtn).click();
		
	}
  
	

}
