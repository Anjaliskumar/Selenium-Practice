import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amzon {
	public static void main(String[]args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Poco F1");
		Thread.sleep(4000);
		driver.findElement(By.className("nav-right")).click();
		driver.findElement(By.linkText("POCO")).click();
		driver.navigate().to("https://www.wikipedia.org/");
		Thread.sleep(4000);
		driver.navigate().back();
		driver.quit();
	}

}
