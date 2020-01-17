package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;

public class GmailLogin {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://www.gmail.com/");
	  
	  driver.findElement(By.xpath("//*[@type='email']")).sendKeys("smiranganghra");
		driver.findElement(By.xpath("//*[@class='RveJvd snByac']")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//*[@type='password']")).sendKeys("unsecured");
	  driver.findElement(By.xpath("(//*[@class='RveJvd snByac'])[1]")).click();
	  Thread.sleep(1000);

        String bcd = driver.findElement(By.xpath("//*[@class='bsU']")).getText();
        System.out.println(bcd);
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
	 @AfterClass
  public void afterClass() {
  }

  }
