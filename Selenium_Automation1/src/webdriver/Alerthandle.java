package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\Browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
	  //  driver.findElement(By.xpath("(//*[@title='Sign In'])[1]")).click();
		
		driver.findElement(By.xpath("//*[@name='txtUserName']")).sendKeys("watermelon@gmail.com");
		 driver.findElement(By.xpath("//*[@maxlength='20']")).sendKeys("987123");
	    Thread.sleep(9000);
	    driver.findElement(By.xpath("//*[@name='imgbtnSignin']")).click();
	 
	}

}
