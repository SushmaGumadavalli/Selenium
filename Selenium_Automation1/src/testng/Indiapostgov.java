package testng;

import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Indiapostgov {
  @Test
  public void f() {
	  
  }
  @BeforeClass
  public void beforeClass() {
	  WebDriver driver;
	  //WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.indiapost.gov.in/vas/Pages/IndiaPostHome.aspx");
		 }

  @AfterClass
  public void afterClass() {
  }

}

