package qaclickacademy.Mavenjava;
import java.io.IOException;
//package qaclickacademy.Mavenjava;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import resources.base;

public class ValidateTitle extends base  {
	public WebDriver driver;
	LandingPage l;
	
	
	@BeforeTest
	
	public void initialize() throws IOException
	{
		driver= initializeBrowser();
		driver.get(prop.getProperty("url"));
	}
	
	
	@Test
	public void basePageNavigation() throws IOException
	{
		 l= new LandingPage(driver);
		//compare the text from the browser with actual text
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES12");
	}
	
	@Test
	public void validateHeader()
	{
		 l= new LandingPage(driver);
		Assert.assertEquals(l.getHeader().getText(), "AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");
	}
	
	@AfterTest
	public void teardown() 
	{
		driver.close();
	}
}


