package com.asif.SFDCLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestID4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		WebElement forgotpassword= driver.findElement(By.id("forgot_password_link"));
		forgotpassword.click();
		
		WebElement username = driver.findElement(By.id("un"));
		username.sendKeys("EmailAddress");
		WebElement continuebutton = driver.findElement(By.id("continue"));
		continuebutton.click();
	}

}
