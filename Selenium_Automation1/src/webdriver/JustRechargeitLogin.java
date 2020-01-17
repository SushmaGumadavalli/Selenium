package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustRechargeitLogin {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\Browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignUp.aspx");
		 //Type first name and last name,mobile number,E-mail and password
		driver.findElement(By.id("signup_name")).sendKeys("sushsuvi");
        driver.findElement(By.name("signup_mobileno")).sendKeys("9700901900");
        driver.findElement(By.name("signup_email")).sendKeys("melontt@gmail.com");
        driver.findElement(By.id("signup_password")).sendKeys("987123");
        driver.findElement(By.id("checkbox1")).click();
        driver.findElement(By.name("checkbox")).click();
        driver.findElement(By.id("imgbtnSubmit")).click();
        
        
      
		
	}

}
