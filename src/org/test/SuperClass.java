package org.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuperClass {
	static WebDriver driver;
static JavascriptExecutor  js;
	public static  void openWeb() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohan\\eclipse-workspace\\Javaa\\driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 }
	public static void launchUrl(String url) {
     driver.get(url);
	}

   public static void fill( WebElement e,String d) {
	  js = (JavascriptExecutor) driver;
	  
	  js.executeScript(d, e);
	  
	  
	  
	 

}	
	
}
