package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Main extends SuperClass {
	
public static void main(String[] args) {
	
	
	openWeb();
	launchUrl("https://www.facebook.com/");
	WebElement g = driver.findElement(By.id("email"));
	fill(g, "arguments[0].setAttribute('value','ADSDS')");
	
}
	
	

}
