package myCompany.WikiPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
	
	WebDriver driver;
	
	By SearchText=By.xpath("//*[@id='searchInput']");
	By SearchAction=By.xpath("//*[@id='searchButton']");

	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void LoadSearchResult() {
		driver.findElement(SearchAction).click();
	}
	
	public void EnterSearchText() {
		driver.findElement(SearchText).sendKeys("Deutschland");
	}
	

}
