package myCompany.WikiPOM;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class AppTest{
	
	WebDriver driver;

	@Test(priority = 1)
	public void TestLogin() throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "F:\\Job Search\\Testing\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("https://en.wikipedia.org");

		LoginPage LP = new LoginPage(driver);
		
		LP.LoadLoginPage();
		Thread.sleep(1000);
		LP.EnterCredentials();
		Thread.sleep(1000);
		LP.LoginAction();
		Thread.sleep(3000);
		System.out.println("Login successful");


	}
	
	@Test(priority = 2)
	public void TestSearch() throws InterruptedException, IOException {
		

		SearchPage SP = new SearchPage(driver);
		
		SP.EnterSearchText();
		Thread.sleep(1000);
		SP.LoadSearchResult();
		Thread.sleep(1000);
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\Job Search\\Testing\\Deutsche.png"));
		System.out.println("Search successful");

	}
	
	
	@Test(priority = 9)
	public void TestLogout() throws InterruptedException {
		
		LogoutPage LA = new LogoutPage(driver);
		
		LA.LoadLogoutPage();
		Thread.sleep(1000);
		System.out.println("Logout successful");
	}
}
