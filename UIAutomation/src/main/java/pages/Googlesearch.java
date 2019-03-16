package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class Googlesearch extends TestBase{
	
	
	@FindBy(xpath = "//input[@id='q']")
	WebElement goglesearch;
	
	@FindBy(xpath = "//input[@name='q']")
	WebElement Entertext;
	
	public Googlesearch(WebDriver driver) 
	{
		this.driver=driver;
	
		PageFactory.initElements(driver,this);
	}
	
	
	







	public void GoogleSearchdata(String str) throws InterruptedException
	
	{
		driver.navigate().to("https://www.google.com/");
		//goglesearch.click();
		Thread.sleep(2000);
		//Entertext.sendKeys("testing");
		driver.findElement(By.xpath("//input[@title = 'Search']")).sendKeys(str);
		System.out.println("clicked");
		
		driver.quit();
		//Entertext.sendKeys("testing");
		//System.out.println("text entered");
	}

}
