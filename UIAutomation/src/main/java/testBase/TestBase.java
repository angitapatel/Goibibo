package testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testUtil.Sync;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	@Test
	public static void init() throws IOException, InterruptedException
	{
		File src = new File("src/main/java/Config/Config.properties");
		FileInputStream fis =new FileInputStream(src);
		prop= new Properties();
		prop.load(fis);

	String browser = prop.getProperty("browser");
	if(browser.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","src/main/java/Drivers/chromedriver.exe");	
		driver = new ChromeDriver();
	}
	else if(browser.equals("IE")){
		
		System.setProperty("webdriver.ie.driver","src/main/java/Drivers/IEDriverServer.exe");	
		driver = new InternetExplorerDriver();
	}
	
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Sync.pageload,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Sync.implicitwait,TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	//Sync.Webdriverwait(driver,"//div[@class='span_3_of_4']/p/a[contains(text(),'Signup')]");
	
	//WebElement ee= driver.findElement(By.xpath("//div[@class='fancybox-wrap fancybox-desktop fancybox-type-inline fancybox-opened']"));
	
//	String win =driver.getWindowHandle();
	//driver.switchTo().window(win);
	//System.out.println(win);
	
	//WebElement e = driver.findElement(By.xpath("//iframe[@data-test-id='ChatWidgetButton-iframe']"));
	//driver.switchTo().frame(e);
	
//	
//	Set<String> set =driver.getWindowHandles();
//	for(String eachwin : set)
//	{
//		System.out.println(eachwin);
//		if(eachwin.equals("CDwindow"))
//		{
//			driver.switchTo().window(eachwin);
//		}
//	}
	
	
	//Thread.sleep(3000);
	// WebElement ele =driver.findElement(By.xpath("//a[@class='fancybox'][contains(text(),'Signin')]"));
	
//	ele.click();
	
	//

//	driver.findElement(By.xpath("//*[@id='load_form']/fieldset[1]/input[@name='username']")).sendKeys("test");
//	driver.findElement(By.xpath("//*[@id='load_form']/fieldset[2]/input[@name='password']")).sendKeys("test");
//	driver.findElement(By.cssSelector("div#login input.button")).click();;
}
	
	@AfterClass
	public void Teardown()
	{
		//driver.quit();
	}
	

}
