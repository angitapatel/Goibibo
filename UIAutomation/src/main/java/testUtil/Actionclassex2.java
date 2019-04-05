package testUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclassex2 {
	
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{

	System.setProperty("webdriver.chrome.driver","src/main/java/Drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://jqueryui.com");
	driver.manage().window().maximize();
	
	//driver.findElement(By.xpath("//ul/li/a[(text()='Slider')]")).click();
	
	driver.findElement(By.xpath("//ul/li/a[(text()='Tooltip')]")).click();
	
	//driver.findElement(By.xpath("//ul/li/a[(text()='Select a Date Range')]")).click();
	WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(frame);
	
	Actions action = new Actions(driver);
	
//	WebElement source = driver.findElement(By.id("draggable"));
//	WebElement dest = driver.findElement(By.id("droppable"));
//	action.clickAndHold(source).moveToElement(dest).release().build().perform();
//	Thread.sleep(3000);
//	
//	action.contextClick(driver.findElement(By.xpath("//div[@id='draggable']/p[contains(text(),'Drag me to my target')]"))).click();
//	
//	WebElement source = driver.findElement(By.id("slider"));
//	
//	action.clickAndHold(source).moveByOffset(30,0).release().build().perform();
//	Thread.sleep(2000);
//	
	
//	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("document.getElementById('datepicker').value='03/30/2019'");
	//js.executeScript("document.getElementById('from').value='03/30/2019'");
	//Thread.sleep(1000);
	
//	js.executeScript("document.getElementById('to').value='03/20/2019'");
	
	//System.out.println("data has selectred ");
	
	String Toottip =driver.findElement(By.xpath("//a[contains(text(),'Tooltips')]")).getAttribute("title");
System.out.println("ToolTip data: "+ Toottip);
}
}
