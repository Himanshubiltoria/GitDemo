package stepDefinations;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageobjects.LandingPage;
import pageobjects.LoginScript;
import pageobjects.PortalHomePage;
import resources.base;
import org.junit.runner.RunWith;


public class stepDefinition extends base {


	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver= initializeBrowser();
		

	}

	@Given("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
		
		
	}

	@Given("^click on the login link in home page to land on sign-in page$")
	public void click_on_the_login_link_in_home_page_to_land_on_sign_in_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage l= new LandingPage(driver);
		l.getLogin().click();
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
	public void user_enters_and_and_logs_in(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LoginScript ls = new LoginScript(driver);
		ls.getEmail().sendKeys(arg1);
		ls.getPassword().sendKeys(arg2);
		ls.getLogin().click();
	}

	@Then("^verify user is successfully logged in$")
	public void verify_user_is_successfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PortalHomePage p = new PortalHomePage(null);
     p.getSearchbox().isDisplayed();
	}
	


 
 
   
}

