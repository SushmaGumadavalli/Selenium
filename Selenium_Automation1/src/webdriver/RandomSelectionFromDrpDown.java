package webdriver;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RandomSelectionFromDrpDown {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\Browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/r.php?locale=en_US");
		Random r = new Random();//min = 0 max=12
		int abc = r.nextInt(12);
		System.out.println("the random nuber is : "+abc);
		if (abc==0) {
			abc=1;
		}
		new Select(driver.findElement(By.name("birthday_month"))).selectByIndex(abc);

	}

}
