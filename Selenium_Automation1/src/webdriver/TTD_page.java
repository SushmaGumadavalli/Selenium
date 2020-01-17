
package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TTD_page {

public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\Browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ttdsevaonline.com/#/registration");
		//wait 
		Thread.sleep(9000);
		//click on terms and conditions
		//driver.findElement(By.linkText("Terms and Conditions")).click();
		driver.findElement(By.partialLinkText("rms")).click();

}
}