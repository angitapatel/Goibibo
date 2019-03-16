package testUtil;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testBase.TestBase;

public class Tablehelper extends TestBase{
	
		
	public static WebElement el;
	public static List<WebElement>  list;
		
		public static void findwebelement()
		{
			// el = driver.findElement(By.xpath("//table[@class='w3-table-all notranslate']/tbody/tr"));
			 list  =	driver.findElements(By.xpath("//table[@class='w3-table-all notranslate']/tbody/tr/th"));
			
		for(WebElement ele : list)
			{
				System.out.println("link   " +ele.getText());
		}
	
		
		
			
		}
		
		public static void Webelementvalue()
	
		{
			
			String beforexpath1 ="//*[@id='main']/div[5]/table/tbody/tr[";
			String afterxpath ="]/td[1]";
			
			for(int i =2;i<7;i++)
			{
				System.out.println(beforexpath1+i+afterxpath);
				String data =driver.findElement(By.xpath(beforexpath1+i+afterxpath)).getText();
				System.out.println(data);
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

		
		
			// TODO Auto-generated constructor stub
		}
//		public static void main(String[] args) throws IOException, InterruptedException
//		{
//			Tablehelper t = new Tablehelper();
//			TestBase.init();
//		Thread.sleep(5000);
//			
//			t.findwebelement();
//		}
//
//	
	

