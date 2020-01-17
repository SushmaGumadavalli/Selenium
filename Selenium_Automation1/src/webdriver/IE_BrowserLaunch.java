package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE_BrowserLaunch {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.ie.driver", ".\\Browser drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();

		// to maximize the window
		//driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		
		
		driver.findElement(By.name("firstname")).sendKeys("sarojini");
		driver.findElement(By.name("lastname")).sendKeys("Etta");
		driver.findElement(By.name("reg_email__")).sendKeys("abbc123@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("1234agar");

	}
}
