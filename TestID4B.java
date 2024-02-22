package com.asif.SFDCLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestID4B {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("123");
		Thread.sleep(5000);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("22131");
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
	}

}
