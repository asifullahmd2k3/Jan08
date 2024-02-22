package com.asif.SFDCLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestID2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("asifullahmd2k3@asif.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Asif@0928");
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
	}

}
