package webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriPopups {
	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\Browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(5000);

		// get the window names
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();//index format
		while (it.hasNext()) {			
			String abc = it.next();
			System.out.println(abc);
			
		}

	}
}
