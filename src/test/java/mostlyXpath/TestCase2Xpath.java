package mostlyXpath;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2Xpath {

	@Test
	public void withValidCredentialShouldLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		// driver.findElement(By.xpath("//*[@data-testid='royal_email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//*[contains(@type,'email')and @class='inputtext login_form_input_box']"))
				.sendKeys("sushma.khadse@gmail.com");
		driver.findElement(
				By.xpath("//input[contains(@name,'ass') and @type='password' and @data-testid='royal_pass'] "))
				.sendKeys("sush1sush");
		//driver.findElement(By.xpath("//input[contains(@id,'u_0_b') ]")).click();
		//driver.findElement(By.xpath("//*[text()='Add Account' ]")).click();
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		Thread.sleep(3000);

		driver.close();
		driver.quit();
	}

}
