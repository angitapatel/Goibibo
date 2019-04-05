package testUtil;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHelper {
	static WebDriver driver;
	public static void Framdata() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "src/main/java/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//a[@class='fancybox'][contains(text(),'Signin')]"));

		ele.click();

		//

		driver.findElement(By.xpath("//*[@id='load_form']/fieldset[1]/input[@name='username']")).sendKeys("test");
		driver.findElement(By.xpath("//*[@id='load_form']/fieldset[2]/input[@name='password']")).sendKeys("test");
		driver.findElement(By.cssSelector("div#login input.button")).click();
		//try{
	//WebElement fMenu=	driver.findElement(By.xpath("//ul[@id='toggleNav']/li/following-sibling::li/a[contains(text(),'Frames and Windows')]"));
	//	fMenu.click();
		
	//	}catch(StaleElementReferenceException e)
	//	{
			//WebElement fMenu=	driver.findElement(By.xpath("//ul[@id='toggleNav']/li/following-sibling::li/a[contains(text(),'Frames and Windows')]"));
	try{		//fMenu.click();
			
	List<WebElement>	list=	driver.findElements(By.xpath("//ul[@id='toggleNav']/li/following-sibling::li/a"));
	int sizelink =list.size();
	System.out.println(sizelink);
	WebElement data1 = driver.findElement(By.xpath("//iframe[@data-test-id='ChatWidgetWindow-iframe']"));
	for(WebElement e1: list)
	{
		System.out.println(e1.getText().contains("Frames and Windows"));
		driver.switchTo().frame(data1);
		e1.click();
		System.out.println("clicked");
	}
	}catch(StaleElementReferenceException e)
	{
		List<WebElement>	list=	driver.findElements(By.xpath("//ul[@id='toggleNav']/li/following-sibling::li/a"));
		int sizelink =list.size();
		System.out.println(sizelink);
	//	WebElement data1 = driver.findElement(By.xpath("//iframe[@data-test-id='ChatWidgetWindow-iframe']"));
		for(WebElement e1: list)
		{
			System.out.println(e1.getText().contains("Frames and Windows"));
			//System.out.println(e1.getText());
			e1.click();
			WebElement frame=	driver.findElement(By.xpath("//div[@class='freme_box']/iframe[@src='frames-windows/defult1.html']"));
			driver.switchTo().frame(frame);
			driver.findElement(By.xpath("//div[@class='farme_window']/p/a[contains(text(),'New Browser Tab')]")).click();
		//	driver.switchTo().frame(data1);
			//driver.findElement(By.xpath("//div[@class='farme_window']/p/a[contains(text(),'New Browser Tab')]")).click();
			
			System.out.println("clicked");
			
		}
	}
	{
		//WebElement fMenu=	driver.findElement(By.xpath("//ul[@id='toggleNav']/li/following-sibling::li/a[contains(text(),'Frames and Windows')]"));
		
	}//	}
	//daMenu("Frames and Windows");
	
	}
	public static void daMenu(String data)
	{
		
		WebElement link = driver.findElement(By.xpath("//ul[@id='toggleNav']/li/following-sibling::li/a[contains(text(),'"+data+"')]"));
		link.click();
		
	WebElement frame=	driver.findElement(By.xpath("//div[@class='freme_box']/iframe[@src='frames-windows/defult1.html']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//div[@class='farme_window']/p/a[contains(text(),'New Browser Tab')]")).click();
		
	}
	
			
		
	

	
	public static void main(String[] args) throws InterruptedException
	{
		Framdata();
	}
	
	
	

}
