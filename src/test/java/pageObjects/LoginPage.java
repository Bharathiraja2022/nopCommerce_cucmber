package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


	public WebDriver driver;
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	
	public LoginPage( WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="Email")
	WebElement txtEmail;
	@FindBy(id="Password")
	WebElement txtPassword;
	@FindBy(xpath="//button[contains(text(),'Log in')]")
WebElement btnLogin;
	
	public void setEmail(String email)
	{
		txtEmail.clear();
		js.executeScript("arguments[0].click",driver);
		txtEmail.sendKeys(email);
	}
	public void setPassword(String pass)
	{
		txtPassword.clear();
		txtPassword.sendKeys(pass);
	}
	public void btnClick()
	{
		btnLogin.click();
	}
}
