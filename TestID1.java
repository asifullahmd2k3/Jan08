package com.asif.SFDCLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestID1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("asifullahmd2k3@asif.com");
		Thread.sleep(5000);
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		
																						
		
		
	}
	
}

