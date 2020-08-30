package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginScript {
	
	public WebDriver driver;
	
	@FindBy(xpath ="//input[@id = 'user_email']")
	WebElement Email;
	
	
	@FindBy(css = "[id = 'user_password']")
	WebElement Password;
	
	
	@FindBy(xpath = "//input[@name = 'commit']")
	WebElement Login;
	
	
	public LoginScript(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail()
	{
		return Email;
	}
	
	public WebElement getPassword()
	{
		return Password;
	}
	
	public WebElement getLogin()
	{
		return Login;
	}
}
