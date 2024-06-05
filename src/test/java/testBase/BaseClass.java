package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static WebDriver driver;
	@BeforeClass
	public void setup() {
		
		
		driver.get("https://www.kijksluiter.nl/#!");				
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	}
}