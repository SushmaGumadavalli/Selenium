package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;

public class FB_Retesting {
	WebDriver driver;

	@Test
	public void Retesting() throws Exception {
		driver.findElement(By.name("email")).sendKeys("Testing@sdgsdg.com");
		driver.findElement(By.name("pass")).sendKeys("HGFJHADSF");
		// driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		// validate pass/fail //(//*[@role='button'])[1]
		// if the element is present on page that element size=1,else size =0
	int element = driver.findElements(By.xpath("(//*[@role='button'])[1]")).size();
	 if(element >0 ) {
		 System.out.println("given credentials are Invalid");
		 driver.get("https://www.facebook.com/");
	 }else {
		 System.out.println("given credentials are valid");
		 driver.get("https://www.facebook.com/");
		}
	}

	@BeforeClass // Pre-condition
	public void beforeClass() {
		
		System.setProperty("webdriver.chrome.driver", ".\\Browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@AfterClass // Post-condition
	public void afterClass() {
		// close the browser
		driver.quit();

	}

}
