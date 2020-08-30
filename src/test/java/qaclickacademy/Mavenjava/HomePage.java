package qaclickacademy.Mavenjava;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobjects.LandingPage;
import pageobjects.LoginScript;
//import resources.Base;
import resources.base;

public class HomePage extends base {
	
	@Test
	public void basePageNavigation() throws IOException
	{
		driver= initializeBrowser();
		driver.get(prop.getProperty("url"));
		LandingPage l= new LandingPage(driver);
		
		l.getLogin().click();
		
		LoginScript ls = new LoginScript(driver);
		ls.getEmail().sendKeys("himanshu.b@cwsinfotech.com");
		ls.getPassword().sendKeys("123456");
		ls.getLogin().click();
		
	
		
		
		
		
	}

}
