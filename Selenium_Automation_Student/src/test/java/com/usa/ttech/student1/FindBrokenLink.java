/*package com.usa.ttech.student1;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FindBrokenLink {

	public static void main(String[] args) {
		File pathToBinary = new File("C:\\Program Files\\Mozilla Firefox\\firefox-sdk\\bin\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();

		
		
		WebDriver driver = new FirefoxDriver(ffBinary, firefoxProfile);
		
		
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		 
		//ff.get("http://www.yahoo.com/");		    

		
		
		
	    List allImages = findAllLinks(driver);    

	    System.out.println("Total number of elements found " + allImages.size());

	    for( WebElement element : allImages){

	    	try

	    	{

		        System.out.println("URL: " + element.getAttribute("href")+ " returned " + isLinkBroken(new URL(element.getAttribute("href"))));

	    		//System.out.println("URL: " + element.getAttribute("outerhtml")+ " returned " + isLinkBroken(new URL(element.getAttribute("href"))));

	    	}

	    	catch(Exception exp)

	    	{

	}
	    }
	}




public static List findAllLinks(WebDriver driver)

{

	  List elementList = new ArrayList();

	  elementList = driver.findElements(By.tagName("a"));

	  elementList.addAll(driver.findElements(By.tagName("img")));

	  List finalList = new ArrayList(); ;

	  for (WebElement element : elementList)

	  {

		  if(element.getAttribute("href") != null)

		  {

			  finalList.add(element);

		  }		  

	  }	

	  return finalList;

}

public static String isLinkBroken(URL url) throws Exception

{

	//url = new URL("http://yahoo.com");

	HttpURLConnection connection = (HttpURLConnection) url.openConnection();

	try

	{

	    connection.connect();

	    String response = connection.getResponseMessage();	        

	    connection.disconnect();

	    return response;

	}

	catch(Exception exp)

	{

		return exp.getMessage();

	}				

}
}*/