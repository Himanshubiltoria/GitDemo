package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PortalHomePage {
	
	public WebDriver driver;
	
	
	@FindBy(xpath = "//input[@id= 'search-courses']")
	WebElement searchbox;
	
	public PortalHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getSearchbox() {
		return searchbox;
	}
	

}
