 package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Podcareers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\Browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.pod.co.uk/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//*[@title='Careers'])[2]")).click();
		driver.findElement(By.xpath("//*[@class='panelButton']")).click();
		driver.findElement(By.xpath("(//*[@class='controls'])[4]")).click();
		driver.findElement(By.xpath("//*[@type='submit']")).click();
        Thread.sleep(10000);
     //   driver.findElement(By.xpath("//*[@class='form-error general']")).click();
        String bcd = driver.findElement(By.xpath("//*[@class='form-error general']")).getText();
       System.out.println(bcd);
        
	//	driver.findElement(By.xpath("//*[@class='rc-anchor-invisible-text']")).click();

	//	 Thread.sleep(5000);
		// driver.findElement(By.xpath("//*[@class='form-error general']")).getText();

	}

}
