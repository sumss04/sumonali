package com.usa.ttech.student.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossbrowserTesting {

	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void getbrowser(String browserName) {
		if(browserName.equalsIgnoreCase("FireFox")){
			
			driver = new FirefoxDriver();
		
		}
		if(browserName.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if (browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
			}
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.close();
		driver.quit();
		
		
		
		
	}
	
	
	
}
