package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

public class Dateandtime {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\Browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.timeanddate.com/date/duration.html");
		driver.findElement(By.xpath("//*[@placeholder='mm']")).sendKeys("03 - Mar");
		driver.findElement(By.xpath("//input[@name='d1']")).sendKeys("11");
		driver.findElement(By.xpath("//input[@id='y1']")).sendKeys("2014");
		// driver.findElement(By.id("y1")).sendKeys("2014");
		//Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@onclick='return settoday(2)']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("subbut2")).click();
		Thread.sleep(2000);
		String abc = driver.findElement(By.xpath("//*[@class='eight columns']/h2")).getText();
		System.out.println(abc);
	}

}