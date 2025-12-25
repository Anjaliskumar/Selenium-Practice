import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestNGExample {

	public String baseUrl = "https://www.edureka.co/";
	ChromeDriver driver = new  ChromeDriver();
			
@Before
public void verifyLaunch() {
	System.out.println("Launching Chrome Browser");
	 driver.get(baseUrl);
}
@Test
public void verifyHomepageTile() {
		
		 String expectedTitle = "Instructor-Led Online Training with 24X7 Lifetime Support | Edureka";
		 String actualTitle = driver.getTitle();
		 assertEquals(actualTitle, expectedTitle);
		 
}

@After
public void assertionTile() {
		 
		 driver.quit();
		
	}

	}


