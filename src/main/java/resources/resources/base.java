package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	public static WebDriver driver;
	public Properties prop;

	public WebDriver initializeBrowser() throws IOException {
		 prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"F:\\eclipse-java-2020-03-R-win32-x86_64\\Mavenjava\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("chrome") )
				{

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			

			// Execute chrome driver
		} else if (browserName.equals("firefox") )
				{
			driver = new FirefoxDriver();

			// execute firefox driver
		} else if (browserName.equals("I.E")) {
			// Execute I.E
		}
		
		

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//return driver;
		return driver;
		
		

	}
	
	 public void getScreenShotPath(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
	}
	
}
