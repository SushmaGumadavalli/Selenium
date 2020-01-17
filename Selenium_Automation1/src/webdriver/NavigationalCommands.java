package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\Browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignUp.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// navigational Commands
		driver.findElement(By.name("imgbtnSubmit")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// click on referesh icon
		driver.navigate().refresh();
		// Click on back icon on webbrowser
		driver.navigate().back();
		// CLick on farward icon on webbrowser
		driver.navigate().forward();

	}
}
