package testUtil;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchfromgoogle {
	
	
	public static void Search()
	{
		System.setProperty("webdriver.chrome.driver","src/main/java/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).sendKeys("testing data");
		
	List<WebElement> list =	driver.findElements(By.xpath("//li/following-sibling::li/div/descendant::div/span[contains(text(),'testing data')]"));
		
			 WebElement el = driver.findElement(By.xpath("//li/following-sibling::li/div/descendant::div/span[contains(text(),'testing data')]/b[contains(text(),' vs training data')]"));
	
			System.out.println("El value :::->" + el.getText());
		for(WebElement ele : list)
		{
			//System.out.println(ele.getText());
			if(ele.getText().contains(el.getText()))
			{
				el.click();
				break;
			}
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Search();
		
	}

}
