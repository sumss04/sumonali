package com.usa.ttech.student1;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

import com.util.HighlightElement;

public class MouseHober {

	public static void main(String[] args) throws Exception {
		File pathToBinary = new File("C:\\Program Files\\Mozilla Firefox\\firefox-sdk\\bin\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();

		
		
		WebDriver driver = new FirefoxDriver(ffBinary, firefoxProfile);
		
			 
		
		 
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		        driver.get("https://www.amazon.com/");
		 
		        WebElement element = driver.findElement(By.xpath(".//*[@id='nav-link-accountList']/span[2]"));
		        HighlightElement.highlightElement(driver, element);
		        Thread.sleep(2500);
		        Actions action = new Actions(driver);
		 
		        action.moveToElement(element).build().perform();
		 
		        driver.findElement(By.xpath(".//*[@id='nav-al-wishlist']/a[3]/span")).click();
		 
		
		
	}

}
