package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class CrossBrowserTesting {

	WebDriver driver;

	@Test
	public void f() throws Exception {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("Testing@sdgsdg.com");
		driver.findElement(By.name("pass")).sendKeys("HGFJHADSF");
		// driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
	}

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browser) {
		
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\Browser drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\Browser drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", ".\\Browser drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("Please provide IE/Firefox/Chrome browser name*******");
		}

	}

}
