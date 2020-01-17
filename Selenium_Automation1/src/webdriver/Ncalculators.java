package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ncalculators {

	public static void main(String[] args) throws Exception {

		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\Browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ncalculators.com/currency-converter/");

		new Select(driver.findElement(By.name("from_currency"))).selectByVisibleText("USD - US Dollars");
		new Select(driver.findElement(By.id("to_currency"))).selectByVisibleText("INR - Indian Rupees"); 
		driver.findElement(By.id("input")).clear();	
		driver.findElement(By.id("input")).sendKeys("100");
		driver.findElement(By.id("workout")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("from_currency")).click();
//		driver.findElement(By.id("from_currency")).click();
		// driver.close();
	}}
