package mostlyXpath;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class XpathAxis {

	@Test
	public void dashBoard() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("abc123");
		driver.findElement(By.cssSelector("button[class='btn btn-success block full-width']")).click();
		// driver.findElement(By.xpath("//span[contains(text(),'Dashboard')]")).click();
		
		String dashboardTitlePath = "//div[@id='page-wrapper']//descendant::h2[contains(text(),'Dashboard ')]";
		String expectedTitle = "Dashboard- TechFios Test Application - Billing";
		String actualTitle= driver.getTitle();
		
//		if(expectedTitle.equalsIgnoreCase(actualTitle)) {
//			System.out.println("Test Pass!");
//		}else {
//			System.out.println("Dashboard Page did not display");
//			throw new RuntimeException("Test Failed!");
//		}
		Assert.assertEquals("Dashboard Page did not display", expectedTitle, actualTitle);
		//WebDriverWait wait = new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dashboardTitlePath)));
		
		//new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dashboardTitlePath)));
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
