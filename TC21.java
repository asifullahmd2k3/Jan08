package com.asif.SFDCLeads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC21 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://login.salesforce.com/");
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("asifullahmd2k3@asif.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Asif@0928");
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		Thread.sleep(5000);
		WebElement lead = driver.findElement(By.id("Lead_Tab"));
		lead.click();
		Thread.sleep(5000);
		//String actualTitle =driver.getTitle();
		String expectedTitle []= {"All Open Leads", "My Unread Leads", "Recently Viewed Leads", "Today's Leads"};
		driver.findElement(By.id("fcf")).click();
		String actualTitle =driver.getTitle();
		
		Assert.assertEquals(expectedTitle,expectedTitle);
		 if (expectedTitle.equals(actualTitle)) {
			
		 System.out.println("testcase passed");
		 }
		 else {
		 System.out.println("testcase failed");
		
		
		
		
		System.out.println("Completed");
	}
	}
}
