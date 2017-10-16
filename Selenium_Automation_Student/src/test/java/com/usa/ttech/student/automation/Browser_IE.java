package com.usa.ttech.student.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser_IE {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\sarow\\eclipse-workspace\\Selenium_Automation\\Driver\\IEDriverServer.exe");
				WebDriver driver=new InternetExplorerDriver();

	}

}
