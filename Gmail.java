import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("identifierId")).sendKeys("anjaliskumar2511@gmail.com");
		//Thread.sleep(3000);
		//driver.findElement(By.className("V67aGc")).click();
		String a = driver.getTitle();
		String b = "gmail";
		driver.close();
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("success");
		}
		else 
		{
			System.out.println("fail");
		}
		

	}

}
