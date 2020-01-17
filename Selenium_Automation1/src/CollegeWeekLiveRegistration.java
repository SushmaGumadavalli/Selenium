
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CollegeWeekLiveRegistration {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", ".\\Browser drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.collegeweeklive.com/sign-up");
		// Thread.sleep(6000);
		// WebDriver wait: 3 types
		// 1. implicit wait
		// 2. Explicit wait
		// 3. Fluent wait
 
   
   
		// 

	}
}
