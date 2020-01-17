package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustRechargeitSignin {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\Browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.findElement(By.name("txtUserName")).sendKeys("melontt@gmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("987123");
		Thread.sleep(9000);
		driver.findElement(By.name("imgbtnSignin")).click();
	}

}
