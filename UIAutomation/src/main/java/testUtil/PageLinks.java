package testUtil;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import testBase.TestBase;

public class PageLinks {
	WebDriver driver;

	@Test
	public void PageLink() throws InterruptedException {
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
		WebElement e1 = driver.findElement(By.xpath("//div[@class='text_box']/h1[1]"));

		// Boolean wait = new
		// WebDriverWait(driver,30).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeSelected(e1));

		// WebDriverWait wait= new
		// WebDriverWait(driver,TimeUnit.SECONDS).ignoring(StaleElementReferenceException.class)
		// .until(ExpectedConditions.elementToBeClickable(By.id("checkoutLink")));
		// driver.findElement(By.id("checkoutLink")).click();

		// driver.findElements(By.tagName("a");

		//new FluentWait<>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
			//	.ignoring(StaleElementReferenceException.class);

		try {
			List<WebElement> list = driver
					.findElements(By.xpath("//div[@class='row']//following-sibling::div/ul/li/a"));
			int size = list.size();
			System.out.println("totle nuber of site" + size);
			Thread.sleep(6000);
			for (int i = 0; i < size; i++) {
				System.out.println(list.get(i).getText());
			}
		} catch (StaleElementReferenceException e) {
			List<WebElement> list = driver
					.findElements(By.xpath("//div[@class='row']//following-sibling::div/ul/li/a"));
			int size = list.size();
			System.out.println("totle nuber of site" + size);
			Thread.sleep(6000);
			for (int i = 0; i < size; i++) {
				System.out.println(list.get(i).getText());
				if(list.get(i).getText().contains("Dropdown"))
				{
					list.get(i).click();
					break;
				}
			}
		}

	}
}
