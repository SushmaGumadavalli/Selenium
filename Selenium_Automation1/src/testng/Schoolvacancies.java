package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Schoolvacancies {
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
	  WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\Browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.pod.co.uk/");
		driver.manage().window().maximize();
		
  }

  @AfterClass
  public void afterClass() {
  }

}
