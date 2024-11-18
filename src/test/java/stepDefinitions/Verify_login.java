package stepDefinitions;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class Verify_login {
public WebDriver driver;
public LoginPage lp;

	@Given("User Launch chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
	   lp=new LoginPage(driver);
	   
	   
	}
	@When("User opens URL {string}")
	public void user_opens_url(String url) {
	  driver.get(url);
	}

	@When("User enters email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String pwd) {
	  lp.setEmail(email);
	  lp.setPassword(pwd);
	}

	@When("Click on login")
	public void click_on_login() {
	   lp.btnClick();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) {
		
	   if(driver.getPageSource().contains("Login was unsuccessful"))
	   {
		   driver.close();
		   Assert.assertTrue(false);
		   
	   }
	   Assert.assertEquals(title,driver.getTitle());
	}

	@When("user click on logout link")
	public void user_click_on_logout_link() {
	   
	}

	@Then("close the browser")
	public void close_the_browser() {
	   
	}

}
