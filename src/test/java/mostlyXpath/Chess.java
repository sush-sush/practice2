package mostlyXpath;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chess {
	@Test
	public void logInToChess() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.chess.com/login_and_go?returnUrl=https%3A%2F%2Fwww.chess.com%2Fregister%3FreturnUrl%3Dhttps%253A%252F%252Fwww.chess.com%252F");
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//span[contains(text(),'Log In')]"));
	
	driver.findElement(By.id("username")).sendKeys("Abcd4430");
	driver.findElement(By.id("password")).sendKeys("!23456");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
}
}