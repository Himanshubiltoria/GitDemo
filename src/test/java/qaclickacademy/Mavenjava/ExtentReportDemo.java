package qaclickacademy.Mavenjava;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import resources.base;

public class ExtentReportDemo extends base {
	
	ExtentReports extent;
	
	@BeforeTest
	
	//ExtentReports and ExtentSparkReporter
	
	public void config() {
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Report");
		reporter.config().setDocumentTitle("Test Result");
		
		
		 extent= new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Himanshu");
		
	}
	
	
	@Test
	
	public void initialDemo() throws IOException {
		
		ExtentTest test= extent.createTest("Initial Demo");

		
		driver= initializeBrowser();
		driver.get(prop.getProperty("url"));
		System.out.println(driver.getTitle());
		driver.close();
		extent.flush();


		
	}
	
	
	
	
	

}
