package webdriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_login {

	public static void main(String[] args) {
		// create webdriver reference
		WebDriver driver;
		// driver.close();
		// Open chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\Browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		//to maximize the window
		driver.manage().window().maximize();
		
		// Type URL
		driver.get("https://www.facebook.com/r.php?locale=en_US");
		// Enter UN and PWD
		// click on login button
		driver.findElement(By.name("firstname")).sendKeys("sarojini");
		driver.findElement(By.name("lastname")).sendKeys("Etta");
		driver.findElement(By.name("reg_email__")).sendKeys("abbc123@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("1234agar");
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("Nov");
		new Select(driver.findElement(By.name("birthday_day"))).selectByVisibleText("7");
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("1994");
		driver.findElement(By.name("sex")).click();
	//	driver.findElement(By.xpath("//a[@href='/legal/terms/update']")).click();
		//driver.findElement(By.linkText("Sign Up")).click();
		driver.findElement(By.id("terms-link")).click();
//driver.findElement(By.partialLinkText("tms")).click();

		driver.findElement(By.name("websubmit")).click();
	//	driver.findElement(By.linkText("Forgot account?")).click();
	}

}
