package testUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionexam1 {

	
public	static WebDriver driver;
	
public static void main(String [] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","src/main/java/Drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://mrbool.com/search/");
	driver.manage().window().maximize();
	Actions action = new Actions(driver);
	WebElement ele= driver.findElement(By.xpath("//span[@id='headermenudesktop']/ul/li"));
	action.moveToElement(ele).build().perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ul[@class='submenu']/li/a[contains(text(),'Courses')]")).click();
	
	
}
}
