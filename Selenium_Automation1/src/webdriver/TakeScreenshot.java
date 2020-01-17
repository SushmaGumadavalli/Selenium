package webdriver;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\Browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		//to maximize the window
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_US");
		
		Date d = new Date();
		System.out.println("system date: "+d);//Thu Dec 19 11:17:05 EST 2019
		//to convert system date
		DateFormat df = new SimpleDateFormat("ddMMMyyy_HHmmss");
		String timeStamp = df.format(d);
		
		
		
		
		String screenshots = ".\\Screenshots\\";
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File(screenshots + "text"+timeStamp+".PNG"));
		
	}

}
