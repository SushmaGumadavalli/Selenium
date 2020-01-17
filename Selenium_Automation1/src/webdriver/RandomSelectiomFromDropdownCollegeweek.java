package webdriver;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RandomSelectiomFromDropdownCollegeweek {

	public static void main(String[] args) throws InterruptedException {
	//	 TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\Browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.collegeweeklive.com/go-signup/");
		Thread.sleep(2000);
		Random n = new Random();//min =0 max=12
		//  n value is string
		//convert n string into int 
		int def = n.nextInt(12);
		System.out.println("the random number is:" +def);
		if(def==0) {
		def=1;	
		}
		driver.findElement(By.name("firstName")).sendKeys("Durga");
		driver.findElement(By.name("lastName")).sendKeys("Gumad");
		driver.findElement(By.name("emailAddress")).sendKeys("abc8970@gmail.com");
	    driver.findElement(By.id("phoneNumber")).sendKeys("8765432165");
		driver.findElement(By.name("password")).sendKeys("1a2b3cde");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("1a2b3cde");
		new Select(driver.findElement(By.name("nationality"))).selectByVisibleText("UNITED STATES");
		new Select(driver.findElement(By.name("attendeeType"))).selectByVisibleText("Student Looking for Graduate Degree");
		new Select(driver.findElement(By.id("questions[q_134]"))).selectByVisibleText("Fall 2021");
		new Select(driver.findElement(By.id("questions_16_Month"))).selectByIndex(def);
	
		
	}

}
