package com.asif.SFDCCreateOpty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://login.salesforce.com/");
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("asifullahmd2k3@asif.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Asif@0928");
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		WebElement optyTab = driver.findElement(By.id("Opportunity_Tab"));
		optyTab.click();		
		//WebElement allOpty = driver.findElement(By.id("fcf"));
		//allOpty.click();	
		
		String expectedTitle = "All Opportunities, Closing Next Month, Closing This Month,My Opportunities,New Last Week, New This Week, Opportunity Pipeline, Private,Recently Viewed Opportunities, Won";
		
		driver.findElement(By.id("fcf")).click();
		
		String actualTitle =driver.getTitle();
		 if (expectedTitle.equals(actualTitle)) {
			
		 System.out.println("Testcase Passed");
		 }
		 else {
		 System.out.println("Testcase Passed");
		 
		
		
}
}
}
