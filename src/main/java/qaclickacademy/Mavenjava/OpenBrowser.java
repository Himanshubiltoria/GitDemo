package qaclickacademy.Mavenjava;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import resources.base;


public class OpenBrowser extends base {
	
	static WebDriver driver;
	public static void testCase(Map<String, String> hash) {
		String browser = hash.get("Browser");
		System.out.println("test is"+hash);
//		for(String s : hash) {
		/*
		 * } System.out.println("gegeg"+hash.get("Browser")); if(hash.get("Browser") ==
		 * "Chrome") { WebDriverManager.chromedriver().setup(); driver = new
		 * ChromeDriver(); driver.manage().window().maximize();
		 * driver.get(hash.get("URL")); }
		 */
		
		
	}
	
	
	
}
