package org.test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mohan\\eclipse-workspace\\Javaa\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		int nofr = frames.size();
		System.out.println(nofr);
		
	driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
	WebElement f = driver.findElement(By.xpath("//iframe[@src='/v1/api/login?isIframe=true&theme=mp-web']"));
	driver.switchTo().frame(f);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
	
			
			
			
		
		
	}

}
