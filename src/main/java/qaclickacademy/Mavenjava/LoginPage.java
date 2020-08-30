package qaclickacademy.Mavenjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
		
/*	By Username = By.xpath("//input[@id = 'inputEmail']");
	By password = By.xpath("//input[@id = 'inputPassword']");
	By rememberme = By.xpath("//input[@name = 'rememberme']");
	By login = By.xpath("//input[@id= 'login']");
	*/
	
	
	// Same code with FindBy() annotation
	
	@FindBy(xpath= "//input[@id = 'inputEmail']")
	WebElement Username;
	
	@FindBy(xpath = "//input[@id = 'inputPassword']")
	WebElement password;
	
	@FindBy(xpath = "//input[@name = 'rememberme']")
	WebElement rememberme;
	
	@FindBy(xpath ="//input[@id= 'login']")
	WebElement login;
	
	public WebElement Emailid()
	{
		//return driver.findElement(Username);
		return Username;
	}
	
	public WebElement Password() {
		//return driver.findElement(password);
		return password;
	}
	
	public WebElement Remember() {
		//return driver.findElement(rememberme);
		return rememberme;
	}
	public WebElement Login() {
		//return driver.findElement(login);
		return login;
	}
	
	
	
	
	

}



