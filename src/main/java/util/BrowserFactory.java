package util;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	public static WebDriver driver;
	
	public  void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kulka\\Project\\Unit_Project\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/test/105/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	public static int randomNumber() {
		
		Random rand = new Random();
		int randomNumber = rand.nextInt(99);
		System.out.println(" Random Number :"+randomNumber);
		return randomNumber;
		
	}

}

