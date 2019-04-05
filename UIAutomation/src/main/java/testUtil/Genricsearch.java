package testUtil;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Genricsearch {
	
		
		public static void howmanylinks()
	{
			
			System.setProperty("webdriver.chrome.driver","src/main/java/Drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.w3schools.com/");
		
			driver.manage().window().maximize();
			
	 int size = driver.findElements(By.tagName("a")).size();
		
		System.out.println("total Links :"+size);
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		for(WebElement ele :list)
		{
			
			if(ele.getText().equals("LEARN BOOTSTRAP 3"))
			{
				System.out.println(ele.getText());
				break;
			}
		}
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		howmanylinks();
	}

}
