

package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CollegeWeekliveLogin {

	public static void main(String[] args) throws Exception {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\Browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.collegeweeklive.com/go-signup/");
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("Durga");
		driver.findElement(By.name("lastName")).sendKeys("Gumad");
		driver.findElement(By.name("emailAddress")).sendKeys("abc8970@gmail.com");
		driver.findElement(By.id("phoneNumber")).sendKeys("8765432165");
		driver.findElement(By.name("password")).sendKeys("1a2b3cde");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("1a2b3cde");
		new Select(driver.findElement(By.name("nationality"))).selectByVisibleText("UNITED STATES");
		new Select(driver.findElement(By.name("attendeeType"))).selectByVisibleText("Student Looking for Graduate Degree");
		new Select(driver.findElement(By.id("questions[q_134]"))).selectByVisibleText("Fall 2021");
		new Select(driver.findElement(By.id("questions_16_Month"))).selectByVisibleText("September");
		new Select(driver.findElement(By.id("questions_16_DayOfMonth"))).selectByVisibleText("17");
		new Select(driver.findElement(By.id("questions_16_DOBYear"))).selectByVisibleText("2003");
		driver.findElement(By.id("questions[q_19]")).click();
		driver.findElement(By.id("questions[q_19][0]")).click();
		driver.findElement(By.name("questions[q_19][1]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.id("questions[q_19]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("recaptcha-verify-button")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
	    driver.findElement(By.linkText("terms & conditions")).click();
		

	
}}
