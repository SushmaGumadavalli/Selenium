package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sbionline_AlertHandle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Browser drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.onlinesbi.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='classicTxt']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		Thread.sleep(2000);
		// click on login button
		driver.findElement(By.id("Button2")).click();

		// Alert handle
		// get the text from alert
		System.out.println("AlertText is : " + driver.switchTo().alert().getText());
		// Click on OK button on Alert
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		//click on new user link
		driver.findElement(By.linkText("New User ? Register here/Activate")).click();
		//Confirmation alert will display
		//to click on cancel button on confirmation alert use DISMISS() function
		System.out.println("ConfirmationAlertText is : " + driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
