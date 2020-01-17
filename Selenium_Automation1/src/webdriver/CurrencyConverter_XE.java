package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrencyConverter_XE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver;
      System.setProperty("webdriver.chrome.driver",".\\Browser drivers\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.xe.com/");
      driver.findElement(By.xpath("//*[@aria-label='Amount']")).sendKeys("100");
	  driver.findElement(By.xpath("//*[@aria-label='Right Arrow']")).click();
	//  String abc = driver.findElement(By.id("main-heading")).getText();
	//  System.out.println(abc);
	  //gettext is the text whatever is displayed in the frontend application.
    String ab= driver.findElement(By.xpath("//*[@class='optLeft']")).getText();
    System.out.println(ab);
   // getattribute is the value of the button which is displayed in the frontend.
    
}}
