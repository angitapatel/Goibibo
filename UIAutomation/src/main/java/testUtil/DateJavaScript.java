package testUtil;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DateJavaScript {
	public static WebDriver driver;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		String dateval = "17-03-2019";
	
	
		System.setProperty("webdriver.chrome.driver","src/main/java/Drivers/chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
	
		
		//WebDriverWait wait = new WebDriverWait(driver,30);
	//	wait.until(ExpectedConditions.visibilityOf(ele)).click();
		driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
	
		System.out.println("value details ");
		WebElement ele =driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1']"));
		
		Select osel = new Select(ele);
	List<WebElement> list=	osel.getOptions();
	int getsize = list.size();
	
	System.out.println("size"+ getsize);
	
	WebElement ee =driver.findElement(By.id("view_fulldate_id_1"));

	//	for(int i =0;i<getsize;i++)
//	{
//		String value = osel.getOptions().get(i).getText();
//		System.out.println("value : " +value);
//	}
	DateJavaScript.datepicker( driver,ee ,dateval);
	
	}
	
			   
	
	
	public static void datepicker(WebDriver driver,WebElement elements ,String Dateval)
	{
		;
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+ Dateval+"')",elements);
	
	}

}


	



	

	

	
	
	

