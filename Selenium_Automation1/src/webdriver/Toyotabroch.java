package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Toyotabroch {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\Browserdrivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://forms.toyota.co.uk/brochure");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("tgbgdpr-overlay-agree")).click();
		driver.findElement(By.linkText("By Post")).click();
		 driver.findElement(By.xpath("//*[@data-label='7 Seat Prius+']")).click();
		 String con =  driver.findElement(By.xpath("//*[@data-label='7 Seat Prius+']")).getText();
		System.out.println(con);

	}

}
