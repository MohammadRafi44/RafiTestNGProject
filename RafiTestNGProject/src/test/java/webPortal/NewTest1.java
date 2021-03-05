package webPortal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest1 {
  
	private WebDriver driver;
	
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public void tearDown() {
		if(driver != null) {
			driver.quit();
		}
	}
		
	@Test
	public void googleTest() throws InterruptedException {
	driver.get("https://demo.guru99.com/");
	driver.manage().window().maximize();
//	driver.findElement(By.linkText("Bank Project")).click();
	Thread.sleep(2000);
	
	}
}
