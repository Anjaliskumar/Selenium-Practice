import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Ebay {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.id("gh-ac")).sendKeys("Watches");
		Thread.sleep(2000);
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,300)");

	}

}
