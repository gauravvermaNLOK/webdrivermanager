package automatedbrowsermgmt.webdrivermanager;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatedBrowserManagementTest {

	
	
	
	@Test
	public void Automated_Management_of_Browser_Driver()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 // Navigate to a website
		 driver.get("https://www.facebook.com");
		
	}
}
