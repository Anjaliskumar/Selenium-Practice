import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooLogin {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.id("login-username")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("login-signin")).click();
		//Thread.sleep(2000);
		driver.quit();

	}

}
