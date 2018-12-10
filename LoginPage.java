package myCompany.WikiPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPage {
	
	WebDriver driver;
	
	By LoginTab=By.xpath("//*[@id='pt-login']/a");
	By username=By.xpath("//*[@id='wpName1']");
	By password=By.xpath("//*[@id='wpPassword1']");
	By logIn=By.xpath("//*[@id='wpLoginAttempt']");
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void LoadLoginPage() {
		driver.findElement(LoginTab).click();
	}
	
	public void EnterCredentials() {
		driver.findElement(username).sendKeys("vkgup12");
		driver.findElement(password).sendKeys("GupJer@6310");
	}
	
	public void LoginAction() {
		driver.findElement(logIn).click();
	}

}
