package qaclickacademy.Mavenjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestCases {
	WebDriver driver;

	@Test
	public void login()
	
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://phptravels.org/clientarea.php");
		
		LoginPage log = new LoginPage(driver);
		log.Emailid().sendKeys("abc@gmail.com");
		log.Password().sendKeys("himanshu");
		log.Remember().click();
		log.Login().click();
		
		

		
	}

	}
	
	


