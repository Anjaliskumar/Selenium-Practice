import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Facebook {
public static void main(String[] args) throws InterruptedException{
	//to open chrome
	ChromeDriver  driver = new ChromeDriver();
	driver.get("https://www.facebook.com/r.php?entry_point=login");
	// to maximize the webpage
	driver.manage().window().maximize();
	// locate element by id
	WebElement day = driver.findElement(By.id("day"));
	Select oSelect = new Select(day);
	//wait 3s
	Thread.sleep(3000);
	oSelect.selectByValue("12");
	WebElement Month = driver.findElement(By.id("month"));
	Select mSelect = new Select(Month);
	Thread.sleep(3000);
	mSelect.selectByValue("11");
	WebElement year = driver.findElement(By.id("year"));
	Select ySelect = new Select(year);
	Thread.sleep(3000);
	ySelect.selectByValue("2022");
	
	
}
}
