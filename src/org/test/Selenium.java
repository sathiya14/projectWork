package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohan\\eclipse-workspace\\Javaa\\driver\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    
driver.get("https://www.facebook.com/");





}
}
