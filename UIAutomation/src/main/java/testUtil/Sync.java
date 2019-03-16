package testUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.TestBase;

public class Sync extends TestBase {
	
	
	public static int pageload= 30;
		public static int implicitwait = 30;
	


		



		public static void Webdriverwait(WebDriver driver, String el) {
			// TODO Auto-generated method stub
			WebDriverWait  wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(el))));
			
		}
}
