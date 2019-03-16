package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class LoginPage extends TestBase {
	
	//driver.findElement(By.xpath("//*[@id='load_form']/fieldset[1]/input[@name='username']")).sendKeys("test");
	//driver.findElement(By.xpath("//*[@id='load_form']/fieldset[2]/input[@name='password']")).sendKeys("test");
	//driver.findElement(By.cssSelector("div#login input.button")).click();;
	
	@FindBy(xpath="//*[@id='load_form']/fieldset[1]/input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//*[@id='load_form']/fieldset[2]/input[@name='password']")
	WebElement password;
	
	@FindBy(css="div#login input.button")
	WebElement button;

	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateLoginTitle()
	{
		return driver.getTitle();
	}
	public HomePage login(String username1, String Password1)
	{
		username.sendKeys(username1);
		password.sendKeys(Password1);
		button.click();
		
		
		return new HomePage();
	}
	
}
