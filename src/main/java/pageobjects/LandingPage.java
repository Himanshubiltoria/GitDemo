package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage<WebElements> {
	
	public WebDriver driver;
	
	//private By signin = By.xpath("//span[contains(text(),'Login')]");
	private By signin = By.xpath("//a[@class='theme-btn register-btn']");
	
	
	private @FindBy(xpath = "//div[@class='text-center']")
	WebElement Title;
	
	private @FindBy(css = "div[class*='video-banner'] h3")
	WebElement header;
	
//	private @FindBy(xpath= "//button[text()='NO THANKS']")
//	WebElement popup;
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}
	
	public WebElement getTitle()
	{
		return Title;
	}
	
	public WebElement getHeader()
	{
		return header;
	}
}
	
//	public List<WebElement> getPopUpSize(List<WebElement> WebElements)
//	{
//		return WebElements popup;
//	}

//	public WebElement getPopUp()
//	{
//		return popup;
//	}
//	}
//	
	

		


