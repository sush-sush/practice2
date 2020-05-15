package mostlyXpath;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {
	
	
	@Test
	public void UserwithValidCredentialShouldLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://techfios.com/test/billing/?ng=login/");
		driver.findElement(By.xpath("//*[@placeholder='Email Address']")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.xpath("//input[contains(@type,'password') and @class='form-control']")).sendKeys("abc123");
		driver.findElement(By.xpath("//a[contains(text(),'Add D')]")).click();
		driver.findElement(By.id("select2-account-container")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ul[@class='select2-results__options']/child::li[5]")).click();
		driver.findElement(By.id("description")).sendKeys("debt payoff");
		driver.findElement(By.id("amount")).sendKeys("$30,000");
		driver.findElement(By.id("submit")).click();
		//By verifydeposit= By.linkText("debt payoff");
		
		//verifywebelement(driver, 10,verifydeposit);
		
		
		
		
		
		
		driver.close();
		driver.quit();
	}

}
