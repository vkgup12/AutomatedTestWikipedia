package myCompany.WikiPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {

	WebDriver driver;
	By LogoutTab=By.xpath("//*[@id='pt-logout']/a");
	
	
	public LogoutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void LoadLogoutPage() {
		driver.findElement(LogoutTab).click();
	}
}
