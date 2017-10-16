package com.usa.ttech.student.automation;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser_Firefox {

	public static void main(String[] args) throws Exception {

		File pathToBinary = new File("C:\\Program Files\\Mozilla Firefox\\firefox-sdk\\bin\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();

		WebDriver driver = new FirefoxDriver(ffBinary, firefoxProfile);

		driver.get("https://www.ups.com/us/en/Home.page/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='ups-navItems']/ul/li[1]/a")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("sarower2017");
		driver.findElement(By.xpath(".//*[@id='pwd']")).sendKeys("Ttech123$");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='submitBtn']")));

		driver.findElement(By.xpath(".//*[@id='submitBtn']")).click();
		
		System.out.println("Test Passed");
		TimeUnit.SECONDS.sleep(20);
		driver.quit();

	}
}
