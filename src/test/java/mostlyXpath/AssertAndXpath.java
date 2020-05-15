package mostlyXpath;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssertAndXpath {
	
	@Test
	public void useOfAssert() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("techfiosdemo@gmail.com");;
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("abc123");;
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		//driver.findElement(By.xpath("//h2[contains(text(),'Dashboard ')]"));
		String dashboardXpath= "//h2[contains(text(),'Dashboard ')]";
		WebDriverWait wait = new WebDriverWait(driver,1);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dashboardXpath)));
		String ExpectedTitle = "Dashboard- TechFios Test Application - Billing";
		String ActualTitle = driver.getTitle();
		
		
		if(ExpectedTitle.equalsIgnoreCase(ActualTitle)) {
			System.out.println("Test pass!");
		}else {
			System.out.println("Dashboard page did not displayed!");
			throw new RuntimeException();
		}
		Thread.sleep(3000);
		
		
		driver.close();
		driver.quit();
	}
}
