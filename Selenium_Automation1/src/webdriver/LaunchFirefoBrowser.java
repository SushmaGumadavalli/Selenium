package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoBrowser {

	public static void main(String[] args) {
		WebDriver driver;
//		System.setProperty("webdriver.gecko.driver", ".\\Browser drivers\\geckodriver.exe");
//		driver = new FirefoxDriver();

		// Open chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\Browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		// to maximize the window
		driver.manage().window().maximize();
		driver.get("https://www.collegeweeklive.com/go-signup/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String abc = driver.findElement(By.xpath("//*[@class='span12']/center/h2")).getText();
		System.out.println(abc);

	}

}
